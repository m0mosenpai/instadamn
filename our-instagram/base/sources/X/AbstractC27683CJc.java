package X;

import android.text.Html;
import android.text.Spanned;
import android.text.style.StyleSpan;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.compose.core.ui.IgClickableTextKt;

/* renamed from: X.CJc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27683CJc {
    public static final void A00(C5Tl c5Tl, InterfaceC31039Dkd interfaceC31039Dkd, int i) {
        int i2;
        boolean z;
        c5Tl.Enr(1458211374);
        if ((i & 6) == 0) {
            i2 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, interfaceC31039Dkd, i) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-154376895, "com.instagram.opal.impl.ui.OpalNuxBottomsheetContent (OpalNuxFragment.kt:206)");
            }
            Object A19 = AbstractC25226BEj.A19(c5Tl);
            Object A11 = AbstractC25225BEi.A11(c5Tl);
            C1130158n c1130158n = Modifier.A00;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            Modifier A02 = AbstractC28285CdX.A02(c5Tl, A0T);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A02);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Y, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6GM c6gm = C6GM.A00;
            C2DC A002 = C5Y7.A00(c5Tl, R.drawable.ig_illustrations_illo_key_refresh_dark, 0);
            Modifier A0C = AbstractC118185Wd.A0C(AbstractC118175Wb.A0D(c1130158n, 16.0f, 24.0f, 12.0f), 96.0f);
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A00;
            C6LQ.A03(c5Tl, c6gm.AB6(interfaceC118245Wl, A0C), A002);
            C5WR.A07(c5Tl, AnonymousClass598.A00(c6gm.AB6(interfaceC118245Wl, AbstractC118175Wb.A0E(A0T, 16.0f, 0.0f, 16.0f, 8.0f)), C30109DOr.A00, false), AbstractC25226BEj.A0e(c5Tl), AbstractC136736Hc.A00(c5Tl, 2131969050));
            AbstractC25705BXp.A0B(c5Tl, A0T, C5Y7.A00(c5Tl, R.drawable.instagram_user_circle_pano_outline_24, 0), AbstractC136736Hc.A00(c5Tl, 2131969071), AbstractC25226BEj.A0M(c5Tl));
            AbstractC25705BXp.A0B(c5Tl, A0T, C5Y7.A00(c5Tl, R.drawable.instagram_key_pano_outline_24, 0), AbstractC136736Hc.A00(c5Tl, 2131969072), AbstractC25226BEj.A0M(c5Tl));
            AbstractC25705BXp.A0B(c5Tl, A0T, C5Y7.A00(c5Tl, R.drawable.instagram_new_post_pano_outline_24, 0), AbstractC136736Hc.A00(c5Tl, 2131969073), AbstractC25226BEj.A0M(c5Tl));
            AbstractC28389Cfs.A02(c5Tl, AbstractC118175Wb.A0E(A0T, 0.0f, 16.0f, 0.0f, 0.0f), 0.0f, 6, 4, C5XL.A00(c5Tl).A0D);
            c5Tl.Eno(2082915821);
            int i3 = i2 & 14;
            if (i3 == 4 || ((i2 & 8) != 0 && c5Tl.AH6(interfaceC31039Dkd))) {
                z = true;
            } else {
                z = false;
            }
            Object EEc = c5Tl.EEc();
            if (z || EEc == C5UI.A00) {
                EEc = DH3.A02(c5Tl, interfaceC31039Dkd, 43);
            }
            boolean z2 = false;
            C6GE.A02(c5Tl, AbstractC118175Wb.A08(A0T, 16.0f), AbstractC25225BEi.A0u(c5Tl), AbstractC136736Hc.A00(c5Tl, 2131969070), AbstractC25225BEi.A1A(c117505Tk, EEc, false));
            c5Tl.Eno(2082925094);
            if (i3 == 4 || ((i2 & 8) != 0 && c5Tl.AH6(interfaceC31039Dkd))) {
                z2 = true;
            }
            Object EEc2 = c5Tl.EEc();
            if (z2 || EEc2 == C5UI.A00) {
                EEc2 = DH3.A01(c5Tl, interfaceC31039Dkd, 44);
            }
            C6GE.A01(c5Tl, AbstractC118175Wb.A0E(A0T, 16.0f, 0.0f, 16.0f, 8.0f), null, null, AbstractC136736Hc.A00(c5Tl, 2131974116), AbstractC25225BEi.A1A(c117505Tk, EEc2, false), 384, 504, false);
            String A003 = AbstractC136736Hc.A00(c5Tl, 2131969029);
            String A0p = AbstractC25235BEs.A0p(c5Tl, A003, 2131969069);
            long A0N = AbstractC25226BEj.A0N(c5Tl);
            C14360o3.A0B(A0p, 0);
            C14360o3.A0B(A003, 1);
            Spanned fromHtml = Html.fromHtml(A0p, 63);
            C14360o3.A07(fromHtml);
            C6C7 A0g = AbstractC25228BEl.A0g();
            String obj = fromHtml.toString();
            A0g.A09(obj);
            Object[] spans = fromHtml.getSpans(0, fromHtml.length(), Object.class);
            if (spans != null) {
                for (Object obj2 : spans) {
                    Integer valueOf = Integer.valueOf(fromHtml.getSpanStart(obj2));
                    int spanEnd = fromHtml.getSpanEnd(obj2);
                    if (valueOf != null && (obj2 instanceof StyleSpan) && ((StyleSpan) obj2).getStyle() == 1) {
                        int intValue = valueOf.intValue();
                        CharSequence subSequence = obj.subSequence(intValue, spanEnd);
                        if (C14360o3.A0K(subSequence, A003)) {
                            A0g.A06(new C5W3(null, null, null, null, null, 65534, A0N, 0L, 0L), intValue, spanEnd);
                            A0g.A0A("community_guidelines", subSequence.toString(), intValue, spanEnd);
                        }
                    }
                }
            }
            C5C8 A022 = A0g.A02();
            Modifier AB6 = c6gm.AB6(interfaceC118245Wl, AbstractC118175Wb.A08(A0T, 16.0f));
            long A0M = AbstractC25226BEj.A0M(c5Tl);
            C118125Vw A0Y2 = AbstractC25225BEi.A0Y(c5Tl);
            boolean A1X = AbstractC25226BEj.A1X(c5Tl, A11, AbstractC25232BEp.A1Y(c5Tl, A022, A19, 2082953557));
            Object EEc3 = c5Tl.EEc();
            if (A1X || EEc3 == C5UI.A00) {
                EEc3 = C30184DRp.A00(c5Tl, A19, A022, A11, 18);
            }
            IgClickableTextKt.A07(c5Tl, AB6, A022, A0Y2, AbstractC25225BEi.A1B(c117505Tk, EEc3, false), A0M);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1764187146);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30497Dbg.A01(ASZ, interfaceC31039Dkd, i, 31);
        }
    }
}
