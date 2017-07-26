package com.example.rodrigobarbosa.rxteste;

import rx.Observable;
import rx.Observer;
import rx.Subscription;

/**
 * Created by rodrigobarbosa on 27/04/17.
 */

public class Processo<T> {

    Subscription mySubscription;
    Observer<Objeto> myObserver;
    Observable<Objeto> myObservable;

    public Processo( Observer<T> myObserver) {
        this.myObserver = (Observer<Objeto>) myObserver;
    }

    public void executa(){

        Objeto o = new Objeto();
        o.setEndereco("Rua bla bla bla, 666");
        o.setNome("Eu da Silva");

        myObservable = Observable.just(o);

        mySubscription = myObservable.subscribe(myObserver);
    }
}
