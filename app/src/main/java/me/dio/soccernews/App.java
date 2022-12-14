package me.dio.soccernews;

import android.app.Application;

/**
 * FIXME Centralizamos uma instância do contexto em nosso {@link App} (mesmo sendo um "anti-pattern") para extrairmos o máximo dos nossos
 * ViewModels e camada de acesso a dados. Entretanto, apesar das nossas camadas ficarem mais coesas, o ideal seria usar uma solução de
 * injeção de dependencias (como o Dagger ou a Hilt).
 *
 *
 */

public class App extends Application {

    private static App instance;

    public static App getInstance() {return instance;}

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

}
