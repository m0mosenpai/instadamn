package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class PT7 implements Runnable {
    public final /* synthetic */ C55036OZi A00;
    public final /* synthetic */ O5R A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public PT7(C55036OZi c55036OZi, O5R o5r, String str, List list) {
        this.A00 = c55036OZi;
        this.A02 = str;
        this.A01 = o5r;
        this.A03 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C55036OZi.A00(this.A00, this.A01, this.A02, this.A03);
    }
}
