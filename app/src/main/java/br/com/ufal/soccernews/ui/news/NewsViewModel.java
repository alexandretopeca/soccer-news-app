package br.com.ufal.soccernews.ui.news;

import java.util.ArrayList;
import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import br.com.ufal.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        List<News> news = new ArrayList<>();

        //TODO  Remover Mock de Notícias
        news.add(new News("Vasco vence o Flamento", "O time feminino do Vasco derrota o time do Flamengo por 5 a 0."));
        news.add(new News("Vasco é o Novo Campeão Brasileiro", "O time feminino do Vasco se torna Campeão Brasileiro do ano de 2022."));
        news.add(new News("Time Feminino do Vasco é o Melhor do Brasil", "O time feminino do Vasco é eleito o melhor time de futebol feminino do Mundo."));

        this.news.setValue(news);

    }

    public LiveData<List<News>> getNews() {
        return news;
    }
}