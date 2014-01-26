import gorm.recipes.*
new BootStrap().init()


// the code below cannot run, comment by hongbin.
// would not fix it because no time
// The error is as follows,
//  org.codehaus.groovy.grails.exceptions.InvalidPropertyException: No property fou
// nd for name [all] for class [class gorm.recipes.Artist] (Use --stacktrace to see
// the full trace)


// GORM "cheat"
// *the code commented out begin 
//def results = Artist.findAll(max: 1, sort: 'birthDate')
//println results
// *the code commented out end

// HQL
results = Artist.executeQuery('from Artist order by birthDate', [max: 1])
println results