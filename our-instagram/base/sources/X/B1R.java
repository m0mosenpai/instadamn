package X;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class B1R implements Callable {
    public final /* synthetic */ C7Y9 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public B1R(C7Y9 c7y9, String str, String str2, String str3) {
        this.A01 = str;
        this.A00 = c7y9;
        this.A03 = str2;
        this.A02 = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        String str = this.A01;
        if (str != null) {
            C7Y9 c7y9 = this.A00;
            c7y9.A01.A00(str, "urlless_reshare_bottom_sheet", this.A03, this.A02);
        }
        return C0eB.A00;
    }
}
