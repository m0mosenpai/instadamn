package X;

/* loaded from: classes9.dex */
public final class OLI {
    public final C0f6 A00;

    public OLI(C0f6 c0f6) {
        C14360o3.A0B(c0f6, 1);
        this.A00 = c0f6;
    }

    public final void A01(String str) {
        C14360o3.A0B(str, 0);
        new OWS(this.A00, str, 659041254).A01();
    }

    public final void A00(String str) {
        C14360o3.A0B(str, 0);
        OWS ows = new OWS(this.A00, str, 659044095);
        ows.A02("server_info_data", "");
        ows.A01();
    }

    public final void A02(String str, Throwable th) {
        OWS ows = new OWS(this.A00, str, 659044095);
        ows.A00 = th;
        ows.A01.ERI(th);
        ows.A02("server_info_data", "");
        ows.A01();
    }
}
