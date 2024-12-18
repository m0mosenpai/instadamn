package X;

/* renamed from: X.6G1, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6G1 {
    public static final C5UP A00 = new C5UQ(C6G2.A00);

    public static final void A00(C5Tl c5Tl, C6Fz c6Fz, Boolean bool, InterfaceC16620sF interfaceC16620sF, int i, int i2) {
        int i3;
        boolean AH6;
        Boolean bool2 = bool;
        C6Fz c6Fz2 = c6Fz;
        C14360o3.A0B(interfaceC16620sF, 2);
        c5Tl.Enr(1924469990);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                AH6 = c5Tl.AH4(c6Fz2);
            } else {
                AH6 = c5Tl.AH6(c6Fz2);
            }
            int i5 = 2;
            if (AH6) {
                i5 = 4;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i7 = 16;
            if (c5Tl.AH4(bool2)) {
                i7 = 32;
            }
            i3 |= i7;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            int i8 = 128;
            if (c5Tl.AH6(interfaceC16620sF)) {
                i8 = 256;
            }
            i3 |= i8;
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                c6Fz2 = C29101CsS.A00;
            }
            if (i6 != 0) {
                bool2 = null;
            }
            if (C0fH.A02()) {
                C0fH.A01(1304139812, "com.instagram.barcelona.feed.video.ProvideMediaPlaybackManager (ProvideMediaPlaybackManager.kt:26)");
            }
            c5Tl.Eno(2012858922);
            Object EEc = c5Tl.EEc();
            Object obj = C5UI.A00;
            if (EEc == obj) {
                EEc = new C6G3(c6Fz2);
                ((C117505Tk) c5Tl).A0Q(EEc);
            }
            C6G3 c6g3 = (C6G3) EEc;
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            if (bool2 != null) {
                c6g3.A09.Egh(Boolean.valueOf(bool2.booleanValue()));
            }
            C0eB c0eB = C0eB.A00;
            c5Tl.Eno(2012863717);
            Object EEc2 = c5Tl.EEc();
            if (EEc2 == obj) {
                EEc2 = new C206639Cu(c6g3, null, 9);
                c5Tl.FBy(EEc2);
            }
            C117505Tk.A0L(c117505Tk, false);
            C5UX.A04(c5Tl, c0eB, (InterfaceC16620sF) EEc2);
            AbstractC117695Ue.A00(c5Tl, A00.A02(c6g3), interfaceC16620sF, ((i3 >> 3) & 112) | 8);
            if (C0fH.A02()) {
                C0fH.A00(-138061205);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i, i2, 16, interfaceC16620sF, c6Fz2, bool2);
        }
    }
}
