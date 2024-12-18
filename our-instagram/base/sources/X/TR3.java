package X;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class TR3 implements Runnable {
    public final /* synthetic */ SPP A00;
    public final /* synthetic */ C63001SaP A01;
    public final /* synthetic */ SZ5 A02;
    public final /* synthetic */ java.util.Set A03;
    public final /* synthetic */ Executor A04;

    public TR3(SPP spp, C63001SaP c63001SaP, SZ5 sz5, java.util.Set set, Executor executor) {
        this.A02 = sz5;
        this.A00 = spp;
        this.A03 = set;
        this.A04 = executor;
        this.A01 = c63001SaP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.SEA, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Collection collection;
        java.util.Set keySet;
        SZ5 sz5 = this.A02;
        SPP spp = this.A00;
        Map map = spp.A07;
        Map map2 = spp.A08;
        if (map2 != null && (keySet = map2.keySet()) != null) {
            collection = AbstractC001800i.A0a(keySet);
        } else {
            collection = C16930sl.A00;
        }
        HashSet A0k = AbstractC31171DnF.A0k(collection);
        ?? obj = new Object();
        obj.A00 = map;
        obj.A01 = A0k;
        sz5.A01(new T3T(spp, this.A01), obj, spp.A03, this.A03, this.A04);
    }
}
