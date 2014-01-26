import gorm.recipes.*
new BootStrap().init()

// GORM Where
def query = Artist.where {
 works.size() >= 5
}

def results = query.list(sort: 'name')
println results

//HQL
results = Artist.executeQuery('from Artist as a where a.works.size >= 5 order by name')
println results