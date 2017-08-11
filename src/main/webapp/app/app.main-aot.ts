import { platformBrowser } from '@angular/platform-browser';
import { ProdConfig } from './blocks/config/prod.config';
import { Nflguru2017AppModuleNgFactory } from '../../../../build/aot/src/main/webapp/app/app.module.ngfactory';

ProdConfig();

platformBrowser().bootstrapModuleFactory(Nflguru2017AppModuleNgFactory)
.then((success) => console.log(`Application started`))
.catch((err) => console.error(err));
