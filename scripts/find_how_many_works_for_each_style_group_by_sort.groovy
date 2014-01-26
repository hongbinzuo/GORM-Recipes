import gorm.recipes.*
new BootStrap().init()

// GORM Criteria Builder
def criteria = Work.createCriteria()

def results = criteria.list {

    createAlias('artist','artistAlias')

    projections {
       groupProperty('artistAlias.style')
       rowCount('cnt')
    }

    order('cnt','desc')
}

println results

// HQL
results = Work.executeQuery('select w.artist.style, count(w) as cnt from Work as w group by w.artist.style order by cnt desc')
println results