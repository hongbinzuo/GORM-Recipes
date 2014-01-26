import gorm.recipes.*
new BootStrap().init()

// GORM Where
def query = Artist.where {}.projections { distinct 'style' }
def results = query.list()
println results

// HQL
results = Artist.executeQuery('select distinct style from Artist')
println results