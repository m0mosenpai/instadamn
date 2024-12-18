package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement;
import com.instagram.common.session.UserSession;

/* renamed from: X.6UV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6UV {
    public static CPL A00;
    public static final C6UV A01 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fd, code lost:
    
        if (X.AbstractC130925vf.A0L(r16, r17, r18) != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(final com.instagram.common.session.UserSession r16, final X.C41181vS r17, final X.C41551w4 r18, final X.C3G2 r19, final X.C141596ac r20, final X.C140436Wx r21, final X.InterfaceC145536hC r22, final X.C139576Tm r23) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6UV.A03(com.instagram.common.session.UserSession, X.1vS, X.1w4, X.3G2, X.6ac, X.6Wx, X.6hC, X.6Tm):void");
    }

    public static final SpannableStringBuilder A00(Context context, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, C141596ac c141596ac) {
        long j;
        String A02;
        float f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!AbstractC130925vf.A0q(c41551w4, c141596ac)) {
            A01(context, spannableStringBuilder, userSession);
            A02 = context.getString(2131969227);
        } else {
            C38321qM c38321qM = c41181vS.A0b;
            if (c38321qM != null && c38321qM.Cff()) {
                long A1C = c38321qM.A1C();
                if (AbstractC141736aq.A02(c41551w4)) {
                    f = (1.0f - c141596ac.A0B) * ((float) AbstractC141736aq.A00(c41551w4, A1C));
                } else {
                    f = (1.0f - c141596ac.A0B) * ((float) A1C);
                }
                j = f;
            } else {
                j = -1;
            }
            A02 = C23831Eq.A02(j);
        }
        spannableStringBuilder.append((CharSequence) A02);
        return spannableStringBuilder;
    }

    public static final void A04(C41181vS c41181vS, C141596ac c141596ac, InterfaceC145536hC interfaceC145536hC) {
        if (!c141596ac.A1A) {
            c141596ac.A1A = true;
            if (c141596ac.A0V != null) {
                c141596ac.A05(C05F.A0N);
            }
            interfaceC145536hC.E1p(c41181vS);
            CPL cpl = A00;
            if (cpl != null) {
                cpl.A00.A0I.A03.getView().setVisibility(0);
                A00 = null;
            }
        }
    }

    public static final boolean A05(UserSession userSession, C41181vS c41181vS) {
        String A002;
        C38321qM c38321qM = c41181vS.A0b;
        c38321qM.getClass();
        boolean z = !AbstractC41071vF.A0P(null, c38321qM);
        if (!C18U.A06(C06090Tz.A05, userSession, 36327804052323193L)) {
            A002 = null;
        } else {
            A002 = AbstractC87103uT.A00(IGAdTransparencyDisclaimerPlacement.A04, AbstractC41071vF.A02(userSession, c38321qM));
        }
        if ((c41181vS.A10() && z) || (A002 != null && A002.length() > 0)) {
            return true;
        }
        return false;
    }

    public static final void A01(Context context, SpannableStringBuilder spannableStringBuilder, UserSession userSession) {
        Drawable drawable = context.getDrawable(R.drawable.play_icon);
        if (drawable != null) {
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36323040933784447L);
            int i = R.dimen.abc_edit_text_inset_top_material;
            if (A06) {
                i = R.dimen.abc_edit_text_inset_bottom_material;
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            spannableStringBuilder.append("  ");
            spannableStringBuilder.setSpan(new C85973sR(drawable), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append("  ");
        }
    }

    public static final void A02(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, C3G2 c3g2, C141596ac c141596ac, C140436Wx c140436Wx, InterfaceC145536hC interfaceC145536hC, C139576Tm c139576Tm) {
        if (AbstractC130925vf.A0n(c41551w4)) {
            interfaceC145536hC.DU4(AbstractC13880nE.A0G(c139576Tm.A00), c41181vS, c41551w4);
            interfaceC145536hC.D2Y(c41181vS, c141596ac);
            return;
        }
        c140436Wx.A02();
        A03(userSession, c41181vS, c41551w4, c3g2, c141596ac, c140436Wx, interfaceC145536hC, c139576Tm);
        interfaceC145536hC.D2Y(c41181vS, c141596ac);
        CPL cpl = A00;
        if (cpl == null) {
            return;
        }
        cpl.A00.A0I.A03.getView().setVisibility(0);
        A00 = null;
    }
}
