import gorm.recipes.*
new BootStrap().init()

// GORM Criteria Builder
def criteria = Work.createCriteria()

def results = criteria.list {

    createAlias('artist','artistAlias')

    projections {
       groupProperty('artistAlias.style')
       rowCount()
    }
}

println results

// HQL
results = Work.executeQuery('select w.artist.style, count(w) from Work as w group by w.artist.style')
println results