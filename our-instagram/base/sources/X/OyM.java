package X;

/* loaded from: classes9.dex */
public final class OyM implements InterfaceC58032PoI {
    public final /* synthetic */ String A00;
    public final /* synthetic */ InterfaceC24901Jp A01;

    public OyM(String str, InterfaceC24901Jp interfaceC24901Jp) {
        this.A01 = interfaceC24901Jp;
        this.A00 = str;
    }

    @Override // X.InterfaceC58032PoI
    public final void Dv6() {
        this.A01.resumeWith(AbstractC50523MSb.A0d(new Exception(AbstractC25235BEs.A0r("Could not transcribe captions from video (", this.A00))));
    }

    @Override // X.InterfaceC58032PoI
    public final void Dv7(JWd jWd, String str) {
        this.A01.resumeWith(jWd);
    }
}
