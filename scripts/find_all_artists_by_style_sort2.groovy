import gorm.recipes.*
new BootStrap().init()

def styleCriteria = 'Modern'

// GORM Where
def artistList = Artist.findAll(sort: 'name', max: 2, offset: 1, order: 'asc') {
    style == styleCriteria
}

println artistList