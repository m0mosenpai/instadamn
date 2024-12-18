package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.BnM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26501BnM extends AbstractC51572Yf {
    public final C120985dq A00;
    public final Integer A01;
    public final InterfaceC16660sJ A02;
    public final InterfaceC16660sJ A03;
    public final Drawable A04;
    public final UserSession A05;
    public final CharSequence A06;
    public final Integer A07;
    public final boolean A08;

    public C26501BnM(Drawable drawable, C120985dq c120985dq, UserSession userSession, CharSequence charSequence, Integer num, Integer num2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A05 = userSession;
        this.A06 = charSequence;
        this.A00 = c120985dq;
        this.A08 = z;
        this.A07 = num;
        this.A04 = drawable;
        this.A01 = num2;
        this.A02 = interfaceC16660sJ;
        this.A03 = interfaceC16660sJ2;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C80393iU c80393iU;
        int i;
        C14360o3.A0B(c76223bS, 0);
        Integer num = this.A07;
        if (num != null) {
            C75933ay c75933ay = C51722Yv.A02;
            C51722Yv A00 = C9CU.A00(AbstractC25230BEn.A0d(AbstractC25234BEr.A0L(null, C05F.A00, 0, AbstractC25230BEn.A0L()), C05F.A0C, 0.0f, 1), C05F.A09, 0, AbstractC25230BEn.A0K());
            Drawable A0N = AbstractC25228BEl.A0N(c76223bS, num.intValue());
            AbstractC25233BEq.A10(A0N, c76223bS, R.color.audio_bar_action_color_enabled);
            Drawable mutate = A0N.mutate();
            if (this.A08) {
                AbstractC166997dE.A1F(mutate, AbstractC53242c7.A0H(c76223bS.A05.A0C, R.attr.igds_color_clips_tab_inverted_background));
            }
            C14360o3.A07(mutate);
            c80393iU = AbstractC25234BEr.A0O(mutate, c76223bS.A05, A00);
        } else {
            Drawable drawable = this.A04;
            if (drawable != null) {
                C75933ay c75933ay2 = C51722Yv.A02;
                c80393iU = AbstractC25234BEr.A0O(drawable, c76223bS.A05, C9CU.A00(AbstractC25230BEn.A0d(AbstractC25234BEr.A0L(null, C05F.A00, 0, AbstractC25229BEm.A0F()), C05F.A0C, 0.0f, 1), C05F.A09, 0, AbstractC25230BEn.A0K()));
            } else {
                c80393iU = null;
            }
        }
        C2XE c2xe = c76223bS.A05;
        Context A0E = AbstractC25225BEi.A0E(c2xe);
        boolean A01 = BO8.A01(A0E, this.A05);
        C75933ay c75933ay3 = C51722Yv.A02;
        Integer num2 = C05F.A01;
        C51722Yv A002 = C9CV.A00(null, num2, "android.widget.Button", 0);
        EnumC76913cd enumC76913cd = EnumC76913cd.LOCAL;
        C51722Yv A0W = AbstractC25231BEo.A0W(c2xe, A002, enumC76913cd, "effect_cta");
        long A09 = AbstractC77623dm.A09(c76223bS);
        if (!A01) {
            num2 = C05F.A00;
        }
        Integer num3 = C05F.A00;
        Typeface A0Q = AbstractC25226BEj.A0Q(A0E, num3);
        Context A003 = AbstractC77363dM.A00(c76223bS);
        boolean z = this.A08;
        Context A004 = AbstractC77363dM.A00(c76223bS);
        if (z) {
            i = R.attr.igds_color_text_on_white;
        } else {
            i = R.attr.igds_color_text_on_color;
        }
        int color = A003.getColor(AbstractC53242c7.A0H(A004, i));
        CharSequence charSequence = this.A06;
        long A0D = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, charSequence, 0);
        AbstractC25233BEq.A19(c76223bS, A0a, color, A09);
        A0a.A0S(0);
        AbstractC25234BEr.A0n(A0Q, c76223bS, A0a, A0D);
        AbstractC25234BEr.A1F(A0a, num3, num2);
        A0a.A0M(1);
        A0a.A0c(false);
        AbstractC25232BEp.A1N(A0a, false);
        C51682Yq A0X = AbstractC25227BEk.A0X(A0W, A0a);
        C51722Yv A012 = BPH.A01(c76223bS, null, z, true, A01, false);
        C9CU A0n = AbstractC25225BEi.A0n(C05F.A0A, 0, AbstractC25229BEm.A0J());
        if (A012 == c75933ay3) {
            A012 = null;
        }
        C51722Yv A0W2 = AbstractC25231BEo.A0W(c2xe, AbstractC25230BEn.A0e(C9CV.A00(AbstractC25231BEo.A0Y(AbstractC25225BEi.A0h(A012, A0n), DRV.A00(this, 4)), C05F.A04, DRV.A00(this, 5), 4), C05F.A0Y, C30170DRa.A00(this, c76223bS, 40), null), enumC76913cd, "row_effect_cta");
        Integer num4 = this.A01;
        if (num4 != null) {
            A0W2 = AbstractC25230BEn.A0e(C9CV.A00(A0W2, C05F.A0D, num4, 4), num3, C30170DRa.A00(this, c76223bS, 41), null);
        }
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        if (c80393iU != null) {
            A0P.A00(c80393iU);
        }
        return AbstractC25226BEj.A0k(A0X, A0P, c76223bS, A0W2);
    }
}
