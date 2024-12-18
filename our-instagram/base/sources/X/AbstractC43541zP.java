package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.1zP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC43541zP {
    public static C43341z4 A00;

    public static final C2DB A00(C5Tl c5Tl, ImageUrl imageUrl) {
        return A02(c5Tl, imageUrl, null, null, null, 0, 126, 0L, false, false);
    }

    public static final C2DB A01(C5Tl c5Tl, ImageUrl imageUrl, int i) {
        return A02(c5Tl, imageUrl, null, null, null, i, 126, 0L, false, false);
    }

    public static final C2DB A02(C5Tl c5Tl, ImageUrl imageUrl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, int i, int i2, long j, boolean z, boolean z2) {
        C6LM c6lm;
        boolean z3 = z2;
        InterfaceC16820sZ interfaceC16820sZ4 = interfaceC16820sZ3;
        InterfaceC16820sZ interfaceC16820sZ5 = interfaceC16820sZ2;
        InterfaceC16820sZ interfaceC16820sZ6 = interfaceC16820sZ;
        long j2 = j;
        c5Tl.Eno(179286809);
        if ((i2 & 2) != 0) {
            j2 = C5XL.A00(c5Tl).A0f;
        }
        C6LJ c6lj = null;
        if ((i2 & 4) != 0) {
            interfaceC16820sZ6 = null;
        }
        if ((i2 & 8) != 0) {
            interfaceC16820sZ5 = null;
        }
        if ((i2 & 16) != 0) {
            interfaceC16820sZ4 = null;
        }
        boolean z4 = false;
        if ((i2 & 32) != 0) {
            z = false;
        }
        if ((i2 & 64) != 0) {
            z3 = false;
        }
        if (C0fH.A02()) {
            C0fH.A01(1958088486, "com.instagram.compose.ui.image.rememberIgImagePainter (IgImagePainter.kt:64)");
        }
        InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) c5Tl.AJX(C5VZ.A00);
        C6LI c6li = (C6LI) c5Tl.AJX(C6LG.A00);
        c5Tl.Eno(-1068749791);
        if (z) {
            Object EEc = c5Tl.EEc();
            Object obj = C5UI.A00;
            if (EEc == obj) {
                EEc = new C137536Kz(C5UX.A00(c5Tl, AnonymousClass191.A00));
                c5Tl.FBy(EEc);
            }
            C19L c19l = ((C137536Kz) EEc).A00;
            c5Tl.Eno(-1068747546);
            Object EEc2 = c5Tl.EEc();
            if (EEc2 == obj) {
                EEc2 = new C6LM(c19l);
                c5Tl.FBy(EEc2);
            }
            c6lm = (C6LM) EEc2;
            C117505Tk.A0L((C117505Tk) c5Tl, false);
        } else {
            c6lm = null;
        }
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        C117505Tk.A0L(c117505Tk, false);
        c5Tl.Eno(-1068744152);
        if ((((i & 14) ^ 6) > 4 && c5Tl.AH4(imageUrl)) || (i & 6) == 4) {
            z4 = true;
        }
        Object EEc3 = c5Tl.EEc();
        if (z4 || EEc3 == C5UI.A00) {
            if (imageUrl != null) {
                c6lj = new C6LJ(interfaceC11380iw, imageUrl, c6li, interfaceC16820sZ6, interfaceC16820sZ5, interfaceC16820sZ4, z3);
            }
            EEc3 = new C2DB(interfaceC11380iw, c6li, c6lm, c6lj, j2);
            c5Tl.FBy(EEc3);
        }
        C2DB c2db = (C2DB) EEc3;
        C117505Tk.A0L(c117505Tk, false);
        c2db.A03.EYa(j2);
        C6LJ c6lj2 = c2db.A05;
        if (c6lj2 != null) {
            c6lj2.A04.Egh(interfaceC16820sZ6);
            c6lj2.A05.Egh(interfaceC16820sZ5);
            c6lj2.A03.Egh(interfaceC16820sZ4);
        }
        if (C0fH.A02()) {
            C0fH.A00(875642154);
        }
        C117505Tk.A0L(c117505Tk, false);
        return c2db;
    }
}
