package X;

import java.net.HttpURLConnection;

/* loaded from: classes10.dex */
public final class TFE implements C1U1 {
    public final /* synthetic */ C58355Ptv A00;
    public final /* synthetic */ HttpURLConnection A01;

    public TFE(C58355Ptv c58355Ptv, HttpURLConnection httpURLConnection) {
        this.A00 = c58355Ptv;
        this.A01 = httpURLConnection;
    }

    @Override // X.C1U1
    public final void A74() {
        C14120nc.A00().ATO(new Rc4(this));
    }
}
