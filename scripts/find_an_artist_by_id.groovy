import gorm.recipes.*
new BootStrap().init()

def artist = Artist.get(1)
println artist