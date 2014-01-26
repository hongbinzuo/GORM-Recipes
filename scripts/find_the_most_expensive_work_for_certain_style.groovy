import gorm.recipes.*
new BootStrap().init()


def styleCriteria = 'Modern'

def query = Work.where {
    artist.style == styleCriteria
}

def result = query.find(max: 1, sort: 'price', order: 'desc')
println result