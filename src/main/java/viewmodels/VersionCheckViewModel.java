package viewmodels;

import java.util.List;

import entities.Library;
import models.LibraryModel;
import rx.Observable;

/**
 * ViewModel of VersionCheckWindow
 */
public class VersionCheckViewModel {

    LibraryModel libraryModel;


    public VersionCheckViewModel() {
        this.libraryModel = new LibraryModel();
    }

    public void init(String basePath) {
        libraryModel.init(basePath);
    }

    public Observable<List<Library>> getLibraries(String gradleScript) {
        return libraryModel.getLibraries(gradleScript);
    }
}
