package X;

/* loaded from: classes8.dex */
public abstract class LHt {
    public static final InterfaceC58315Pt7 A00 = new JTC(0.5f, 1.75f);
    public static final C17w A03 = new M9N(new C119145aW(3.0f), new C119145aW(6.0f));
    public static final C17w A04 = new M9N(new C119145aW(3.0f), new C119145aW(-3.0f));
    public static final InterfaceC58315Pt7 A01 = new JTC(-5.0f, 5.0f);
    public static final InterfaceC58315Pt7 A02 = new JTC(-5.0f, 5.0f);

    public static final float A00(InterfaceC58315Pt7 interfaceC58315Pt7) {
        float A09 = AbstractC166987dD.A09(interfaceC58315Pt7.BzZ());
        float A092 = AbstractC166987dD.A09(interfaceC58315Pt7.B1t());
        float A022 = AbstractC50712Us.A01.A02();
        return ((1.0f - A022) * A09) + (A022 * A092);
    }

    public static final float A01(C17w c17w, float f) {
        return ((1.0f - f) * ((C119145aW) c17w.BzZ()).A00) + (f * ((C119145aW) c17w.B1t()).A00);
    }
}
