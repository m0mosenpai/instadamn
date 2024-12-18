package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.6Gv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC136666Gv {
    public static final C2DC A00(C5Tl c5Tl, ImageUrl imageUrl, int i, int i2, long j) {
        long j2 = j;
        c5Tl.Eno(629419123);
        if ((i2 & 2) != 0) {
            j2 = C5XL.A00(c5Tl).A0f;
        }
        if (C0fH.A02()) {
            C0fH.A01(2079580285, "com.instagram.barcelona.common.ui.image.rememberBdsImagePainter (BdsImagePainter.kt:25)");
        }
        C2DB A01 = A01(c5Tl, new C69P(imageUrl), null, null, null, (i & 112) | (i & 896) | (i & 7168) | (i & 57344), 0, j2);
        if (C0fH.A02()) {
            C0fH.A00(1934859328);
        }
        C117505Tk.A0L((C117505Tk) c5Tl, false);
        return A01;
    }

    public static final C2DB A01(C5Tl c5Tl, C69P c69p, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, int i, int i2, long j) {
        Boolean bool;
        Boolean bool2;
        AbstractC12990ll abstractC12990ll;
        AbstractC12990ll abstractC12990ll2;
        InterfaceC16820sZ interfaceC16820sZ4 = interfaceC16820sZ3;
        InterfaceC16820sZ interfaceC16820sZ5 = interfaceC16820sZ2;
        InterfaceC16820sZ interfaceC16820sZ6 = interfaceC16820sZ;
        long j2 = j;
        c5Tl.Eno(1802799528);
        if ((i2 & 2) != 0) {
            j2 = C5XL.A00(c5Tl).A0f;
        }
        if ((i2 & 4) != 0) {
            interfaceC16820sZ6 = null;
        }
        if ((i2 & 8) != 0) {
            interfaceC16820sZ5 = null;
        }
        if ((i2 & 16) != 0) {
            interfaceC16820sZ4 = null;
        }
        if (C0fH.A02()) {
            C0fH.A01(850270981, "com.instagram.barcelona.common.ui.image.rememberBdsImagePainter (BdsImagePainter.kt:43)");
        }
        C5UP c5up = C5VX.A00;
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        Object A01 = C5UT.A01(c5up, C117505Tk.A04(c117505Tk));
        if (!(A01 instanceof UserSession) || (abstractC12990ll2 = (AbstractC12990ll) A01) == null || (bool = Boolean.valueOf(C18U.A06(C06090Tz.A05, abstractC12990ll2, 36320159010398314L))) == null) {
            bool = false;
        }
        boolean booleanValue = bool.booleanValue();
        if (c69p != null) {
            c5Tl.Eno(338149188);
            ImageUrl imageUrl = c69p.A00;
            Object A012 = C5UT.A01(c5up, C117505Tk.A04(c117505Tk));
            if (!(A012 instanceof UserSession) || (abstractC12990ll = (AbstractC12990ll) A012) == null || (bool2 = Boolean.valueOf(C18U.A06(C06090Tz.A05, abstractC12990ll, 36322547012282686L))) == null) {
                bool2 = false;
            }
            C2DB A02 = AbstractC43541zP.A02(c5Tl, imageUrl, interfaceC16820sZ6, interfaceC16820sZ5, interfaceC16820sZ4, (i & 112) | (i & 896) | (i & 7168) | (i & 57344), 0, j2, booleanValue, bool2.booleanValue());
            C117505Tk.A0L(c117505Tk, false);
            if (C0fH.A02()) {
                C0fH.A00(-528380158);
            }
            C117505Tk.A0L(c117505Tk, false);
            return A02;
        }
        c5Tl.Eno(-266248802);
        C117505Tk.A0L(c117505Tk, false);
        throw new RuntimeException();
    }
}
