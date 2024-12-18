package androidx.compose.ui.text.font;

import X.AbstractC119845bi;
import X.AnonymousClass191;
import X.C122665h1;
import X.C206999Ee;
import X.C5D7;
import X.C5DA;
import X.C5DB;
import X.C5DD;
import X.C5DE;
import X.C5DF;
import X.C5DG;
import X.C5DH;
import X.C5DL;
import X.C5W5;
import X.C9F3;
import X.InterfaceC122675h2;
import X.InterfaceC16660sJ;
import X.InterfaceC74963Ym;

/* loaded from: classes3.dex */
public final class FontFamilyResolverImpl implements C5DD {
    public final C5DL A00;
    public final C5D7 A01;
    public final C5DB A02;
    public final C5DF A03;
    public final InterfaceC16660sJ A04;

    @Override // X.C5DD
    public final InterfaceC74963Ym EKD(AbstractC119845bi abstractC119845bi, C5W5 c5w5, int i, int i2) {
        C5W5 c5w52 = c5w5;
        int i3 = ((C5DA) this.A02).A00;
        if (i3 != 0 && i3 != Integer.MAX_VALUE) {
            int i4 = c5w5.A00 + i3;
            if (i4 < 1) {
                i4 = 1;
            } else if (i4 > 1000) {
                i4 = 1000;
            }
            c5w52 = new C5W5(i4);
        }
        return A00(this, new C122665h1(abstractC119845bi, c5w52, null, i, i2));
    }

    public /* synthetic */ FontFamilyResolverImpl(C5D7 c5d7, C5DB c5db) {
        C5DF c5df = C5DE.A01;
        C5DL c5dl = new C5DL(C5DE.A00, AnonymousClass191.A00);
        this.A01 = c5d7;
        this.A02 = c5db;
        this.A03 = c5df;
        this.A00 = c5dl;
        this.A04 = new C206999Ee(this, 13);
    }

    public static final InterfaceC122675h2 A00(FontFamilyResolverImpl fontFamilyResolverImpl, C122665h1 c122665h1) {
        C5DH c5dh;
        InterfaceC122675h2 interfaceC122675h2;
        C5DF c5df = fontFamilyResolverImpl.A03;
        C9F3 c9f3 = new C9F3(17, fontFamilyResolverImpl, c122665h1);
        C5DG c5dg = c5df.A01;
        synchronized (c5dg) {
            c5dh = c5df.A00;
            interfaceC122675h2 = (InterfaceC122675h2) c5dh.A01(c122665h1);
        }
        if (interfaceC122675h2 == null) {
            try {
                interfaceC122675h2 = (InterfaceC122675h2) c9f3.invoke(new C9F3(18, c5df, c122665h1));
                synchronized (c5dg) {
                    if (c5dh.A01(c122665h1) == null) {
                        c5dh.A02(c122665h1, interfaceC122675h2);
                    }
                }
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
        return interfaceC122675h2;
    }
}
