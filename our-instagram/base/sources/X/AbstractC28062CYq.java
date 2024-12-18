package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.CYq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28062CYq {
    public static final void A01(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        AbstractC167007dF.A1K(interfaceC16820sZ, modifier);
        c5Tl.Enr(-2032106940);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, modifier);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(888621936, "com.instagram.opal.impl.ui.OpalUnshipNuxContent (OpalUnshipNuxContent.kt:38)");
            }
            AbstractC12990ll A0d = AbstractC25229BEm.A0d(c5Tl);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 1604248288);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = A00(AbstractC25225BEi.A0j(A0d, 0), A0d, 36883993729237554L);
                c5Tl.FBy(A0q);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, 1604250913);
            if (A0q2 == obj) {
                A0q2 = A00(AbstractC25225BEi.A0j(A0d, 0), A0d, 36883993729172017L);
                c5Tl.FBy(A0q2);
            }
            C117505Tk.A0L(A0K, false);
            Modifier A02 = AbstractC28285CdX.A02(c5Tl, modifier);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A02);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0Y, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6GM c6gm = C6GM.A00;
            String A002 = C5YD.A00(c5Tl, 2131969093);
            Modifier A0W = AbstractC25228BEl.A0W();
            C5WR.A07(c5Tl, AnonymousClass598.A00(AbstractC25235BEs.A0G(c6gm, AbstractC118175Wb.A0E(A0W, 16.0f, 24.0f, 16.0f, 8.0f)), C30113DOv.A00, false), AbstractC25226BEj.A0e(c5Tl), A002);
            AbstractC25705BXp.A0C(c5Tl, A0W, C5Y7.A00(c5Tl, R.drawable.instagram_key_pano_outline_24, 0), C5YD.A00(c5Tl, 2131969088), AbstractC25228BEl.A17(c5Tl, A0q, 2131969087), AbstractC25226BEj.A0M(c5Tl));
            AbstractC25705BXp.A0C(c5Tl, A0W, C5Y7.A00(c5Tl, R.drawable.instagram_history_pano_outline_24, 0), C5YD.A00(c5Tl, 2131969090), C5YD.A00(c5Tl, 2131969089), AbstractC25226BEj.A0M(c5Tl));
            AbstractC25705BXp.A0C(c5Tl, A0W, C5Y7.A00(c5Tl, R.drawable.instagram_download_pano_outline_24, 0), C5YD.A00(c5Tl, 2131969092), AbstractC25228BEl.A17(c5Tl, A0q2, 2131969091), AbstractC25226BEj.A0M(c5Tl));
            AbstractC28389Cfs.A02(c5Tl, AbstractC118175Wb.A0E(A0W, 0.0f, 16.0f, 0.0f, 0.0f), 0.0f, 6, 4, C5XL.A00(c5Tl).A0D);
            C6GE.A05(c5Tl, AbstractC118175Wb.A08(A0W, 16.0f), AbstractC25225BEi.A0u(c5Tl), C5YD.A00(c5Tl, 2131968948), interfaceC16820sZ, (i2 & 14) | 1573248);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1059985507);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30510Dbt.A01(ASZ, interfaceC16820sZ, modifier, i, 41);
        }
    }

    public static String A00(C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll, long j) {
        String A04 = C18U.A04(c06090Tz, abstractC12990ll, j);
        if (A04.length() == 0) {
            return "";
        }
        String format = new SimpleDateFormat(MSV.A00(163), Locale.getDefault()).format(new Date(Long.parseLong(A04) * 1000));
        C14360o3.A0A(format);
        return format;
    }
}
