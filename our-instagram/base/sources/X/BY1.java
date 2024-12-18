package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class BY1 {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC30804Dgf interfaceC30804Dgf, EnumC27366C5v enumC27366C5v, String str, int i, int i2) {
        A01(c5Tl, modifier, interfaceC30804Dgf, enumC27366C5v, str, null, 0, i, i2);
    }

    public static final void A02(C5Tl c5Tl, Modifier modifier, String str) {
        A01(c5Tl, modifier, null, null, str, null, 0, 48, 60);
    }

    public static final void A04(C5Tl c5Tl, String str) {
        A01(c5Tl, null, null, EnumC27366C5v.A03, str, null, 0, 384, 58);
    }

    public static final void A05(C5Tl c5Tl, String str) {
        A01(c5Tl, null, null, null, str, null, 0, 0, 62);
    }

    public static final void A06(C5Tl c5Tl, String str) {
        A01(c5Tl, null, null, null, str, null, 0, 6, 62);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C5Tl r18, androidx.compose.ui.Modifier r19, X.InterfaceC30804Dgf r20, X.EnumC27366C5v r21, java.lang.String r22, java.lang.String r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BY1.A01(X.5Tl, androidx.compose.ui.Modifier, X.Dgf, X.C5v, java.lang.String, java.lang.String, int, int, int):void");
    }

    public static final void A03(C5Tl c5Tl, InterfaceC30804Dgf interfaceC30804Dgf, int i) {
        int i2;
        c5Tl.Enr(-313669485);
        if ((i & 6) == 0) {
            i2 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, interfaceC30804Dgf, i) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(926982345, "com.instagram.compose.igds.components.textcell.IgdsHeaderEndAddOn (IgdsHeader.kt:98)");
            }
            Modifier A0K = AbstractC25227BEk.A0K(Modifier.A00, 24.0f);
            if (interfaceC30804Dgf instanceof C29195Cu0) {
                c5Tl.Eno(340773982);
                C29195Cu0 c29195Cu0 = (C29195Cu0) interfaceC30804Dgf;
                InterfaceC16820sZ interfaceC16820sZ = c29195Cu0.A01;
                C6GE.A00(null, c5Tl, A0K, null, null, C6GA.A00(c5Tl), c29195Cu0.A00, interfaceC16820sZ, 384, 328, c29195Cu0.A02, false);
            } else if (interfaceC30804Dgf instanceof C29194Ctz) {
                c5Tl.Eno(340783563);
                C29194Ctz c29194Ctz = (C29194Ctz) interfaceC30804Dgf;
                C1132359l c1132359l = c29194Ctz.A00;
                c5Tl.Eno(340784505);
                C5YS.A02(c5Tl, A0K, c29194Ctz.A01, 384, c1132359l.A00);
                AbstractC25225BEi.A1T(c5Tl);
            } else {
                throw AbstractC25233BEq.A0s(c5Tl, 340772469);
            }
            if (AbstractC25230BEn.A1Y(c5Tl)) {
                C0fH.A00(7351308);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30499Dbi.A01(ASZ, interfaceC30804Dgf, i, 33);
        }
    }
}
