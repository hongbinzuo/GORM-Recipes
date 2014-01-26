import gorm.recipes.*
new BootStrap().init()

def styleCriteria = 'Modern'

// GORM Dynamic Finder
def artistList = Artist.findAllByStyle(styleCriteria, [sort: 'name', max: 2, offset: 1, order: 'asc'])
println artistList

// GORM Where
def query = Artist.where {
    style == styleCriteria
}

artistList = query.list(sort: 'name', max: 2, offset: 1, order: 'asc')
println artistList