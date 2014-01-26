import gorm.recipes.*
new BootStrap().init()

def titleCriteria = '%moon%'

// GORM Dynamic Finder
def results = Work.findAllByTitleIlike(titleCriteria)
println results

// GORM Where
def query = Work.where {
    title =~ titleCriteria
}

results = query.list()
println results