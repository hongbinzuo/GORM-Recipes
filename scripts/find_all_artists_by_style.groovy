import gorm.recipes.*
new BootStrap().init()

def styleCriteria = 'Modern'

// GORM Dynamic Finder
def artistList = Artist.findAllByStyle(styleCriteria)
println artistList

// GORM Where
def query = Artist.where {
    style == styleCriteria
}

artistList = query.list()
println artistList