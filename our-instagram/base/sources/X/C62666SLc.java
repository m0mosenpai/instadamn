package X;

/* renamed from: X.SLc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62666SLc {
    public final C0f6 A00;
    public final InterfaceC02550Ad A01;
    public final boolean A02;

    public C62666SLc(InterfaceC02550Ad interfaceC02550Ad, C0f6 c0f6, boolean z) {
        C14360o3.A0B(c0f6, 1);
        this.A00 = c0f6;
        this.A01 = interfaceC02550Ad;
        this.A02 = z;
    }

    public final void A00(String str, String str2, boolean z) {
        if (this.A02) {
            InterfaceC02590Ai A0H = MSY.A0H(this.A01, "android_privacy_xapp_outgoing_intent_logging");
            if (A0H.isSampled()) {
                A0H.AAP("uri_scheme", str2);
                A0H.AAP("uri_authority", str);
                A0H.A7v("has_detected_uii", Boolean.valueOf(z));
                A0H.Cht();
            }
        }
    }
}
