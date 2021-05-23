This is my first budget project based on Java and Spring.

### Git - dobre praktyki

- przed mergem/pull/przelaczeniem drzewo robocze powinno byc czyste
- usuwamy tylko branch na ktorym aktualnie sie nie znajdujemy
- po mergu zawsze zweryfikujmy czy wszyskto działa (ale tylko jeśli musimy rozwiązywac konflikty)
- zmergowany feature-branch można bezpiecznie usunąć
### Git - przydatne komendy
git status - co sie dzieje w repo
git log - historia
git log --graph - rysuje graf historii
git add .-podaje do stage`a wszystkie zmienione albo nowe pliki. wtedy mozna commit
git commit -m "co sie zmienia" zapis zmian do repozytorium
git branch -a - wyswietl wszystkie branche
git checkout nazwa_brancha - przełączenia na inny branch
git checkout -b nazwa_brancha - przełączenie na właśnie tworzony/nowy branch
git push nazwa-repo nazwa-brancha np. git push origin master - wypchnięcie zmian do nazwa-repo z brancha nazwa-brancha
git remote - pokaż zdalne repozytoria
git remote -v - jw. + adresy


### MVC pattern
Controller
Service
Repository

