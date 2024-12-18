package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes9.dex */
public final class P1E implements InterfaceC58169PqZ {
    public static final CallerContext A0R = CallerContext.A01("XpostRowItem");
    public View A00;
    public View A01;
    public ViewGroup A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public IgTextView A07;
    public AbstractC50810Mcb A08;
    public AbstractC50810Mcb A09;
    public AbstractC50810Mcb A0A;
    public IgdsSwitch A0B;
    public GradientSpinnerAvatarView A0C;
    public C50808McV A0D;
    public boolean A0E;
    public boolean A0F;
    public final View.OnClickListener A0G;
    public final View.OnClickListener A0H;
    public final AbstractC59962oe A0I;
    public final UserSession A0J;
    public final C52480NJy A0K;
    public final InterfaceC58310Pt2 A0L;
    public final PIG A0M;
    public final C200018t5 A0N;
    public final C173937ol A0O;
    public final String A0P;
    public final C81X A0Q;

    public P1E(AbstractC59962oe abstractC59962oe, UserSession userSession, C52480NJy c52480NJy, InterfaceC58310Pt2 interfaceC58310Pt2, C200018t5 c200018t5, String str) {
        C14360o3.A0B(abstractC59962oe, 1);
        AbstractC25234BEr.A1R(userSession, str, c52480NJy, c200018t5, interfaceC58310Pt2);
        this.A0I = abstractC59962oe;
        this.A0J = userSession;
        this.A0P = str;
        this.A0K = c52480NJy;
        this.A0N = c200018t5;
        this.A0L = interfaceC58310Pt2;
        this.A0Q = C81X.A2i;
        this.A0O = AbstractC173927ok.A00(userSession);
        this.A0F = true;
        this.A0H = ViewOnClickListenerC55466OkL.A01(this, 48);
        this.A0G = ViewOnClickListenerC55466OkL.A01(this, 47);
        this.A0M = new PIG(this);
    }

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A0I;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, this, null, 17), C07Y.A00(viewLifecycleOwner));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cd, code lost:
    
        if (r7 != X.EnumC53382NjX.A05) goto L35;
     */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, X.OWR] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.P1E r22) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P1E.A00(X.P1E):void");
    }

    public static final void A01(P1E p1e, Integer num) {
        Integer num2 = C05F.A07;
        AbstractC59962oe abstractC59962oe = p1e.A0I;
        if (num == num2) {
            AbstractC35176FfT.A02(abstractC59962oe.requireContext(), p1e.A0J, "share_post_to_threads");
            return;
        }
        C193328hC A0b = AbstractC31176DnK.A0b(abstractC59962oe);
        A0b.A0A(2131973748);
        A0b.A0r(AbstractC53926Nsz.A00(abstractC59962oe.requireContext(), p1e.A0J, num));
        AbstractC31176DnK.A1W(A0b);
    }

    private final void A02(C131995xZ c131995xZ) {
        GradientSpinnerAvatarView gradientSpinnerAvatarView;
        GradientSpinnerAvatarView gradientSpinnerAvatarView2;
        AbstractC59962oe abstractC59962oe = this.A0I;
        Context requireContext = abstractC59962oe.requireContext();
        if (!C196068lw.A03(c131995xZ)) {
            Drawable drawable = requireContext.getDrawable(R.drawable.unlinked_facebook_icon);
            if (drawable != null && (gradientSpinnerAvatarView2 = this.A0C) != null) {
                gradientSpinnerAvatarView2.A0D(drawable);
                return;
            }
            return;
        }
        String str = c131995xZ.A05;
        if (str != null && str.length() != 0) {
            GradientSpinnerAvatarView gradientSpinnerAvatarView3 = this.A0C;
            if (gradientSpinnerAvatarView3 != null) {
                gradientSpinnerAvatarView3.A0F(null, abstractC59962oe, AbstractC25225BEi.A0t(str));
            }
        } else {
            Drawable drawable2 = requireContext.getDrawable(R.drawable.unlinked_facebook_icon);
            if (drawable2 != null && (gradientSpinnerAvatarView = this.A0C) != null) {
                gradientSpinnerAvatarView.A0D(drawable2);
            }
        }
        GradientSpinnerAvatarView gradientSpinnerAvatarView4 = this.A0C;
        if (gradientSpinnerAvatarView4 != null) {
            gradientSpinnerAvatarView4.setBottomBadgeDrawable(requireContext.getDrawable(R.drawable.avatar_bottom_badge_facebook));
        }
        GradientSpinnerAvatarView gradientSpinnerAvatarView5 = this.A0C;
        if (gradientSpinnerAvatarView5 == null) {
            return;
        }
        gradientSpinnerAvatarView5.A01 = AbstractC13880nE.A04(requireContext, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (r10 != X.EnumC53382NjX.A05) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A03(X.C131995xZ r9, X.EnumC53382NjX r10) {
        /*
            r8 = this;
            android.widget.TextView r0 = r8.A04
            int r5 = X.MSY.A02(r0)
            android.widget.TextView r0 = r8.A03
            if (r0 == 0) goto Ld
            r0.setVisibility(r5)
        Ld:
            com.instagram.common.session.UserSession r6 = r8.A0J
            X.0Tz r7 = X.C06090Tz.A05
            r0 = 36330441162113908(0x81125800004374, double:3.0388555096407116E-306)
            boolean r2 = X.C18U.A06(r7, r6, r0)
            if (r2 == 0) goto L88
            android.widget.TextView r4 = r8.A04
        L1e:
            X.2oe r2 = r8.A0I
            android.content.Context r3 = r2.requireContext()
            boolean r2 = X.C196068lw.A03(r9)
            if (r2 != 0) goto L30
            if (r4 == 0) goto L2f
            r4.setVisibility(r5)
        L2f:
            return
        L30:
            r2 = 0
            if (r4 == 0) goto L36
            r4.setVisibility(r2)
        L36:
            boolean r2 = X.C196068lw.A02(r9)
            if (r2 == 0) goto L41
            X.NjX r2 = X.EnumC53382NjX.A05
            r5 = 1
            if (r10 == r2) goto L42
        L41:
            r5 = 0
        L42:
            X.5xX r2 = X.C131965xW.A05
            X.5uJ r2 = X.MSX.A0Q(r6)
            boolean r0 = X.C18U.A06(r7, r6, r0)
            X.C131975xX.A00(r6)
            java.lang.String r2 = X.C50701MZw.A02(r3, r2, r5)
            if (r0 != 0) goto L58
            if (r2 != 0) goto L7c
            r2 = 0
        L58:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r4 == 0) goto L2f
            if (r2 == 0) goto L75
            int r0 = r2.length()
            if (r0 == 0) goto L75
            r1 = 2131954399(0x7f130adf, float:1.9545296E38)
            int r0 = r10.A01
            java.lang.String r0 = r3.getString(r0)
            java.lang.String r0 = X.AbstractC31174DnI.A0t(r3, r0, r2, r1)
        L71:
            r4.setText(r0)
            return
        L75:
            int r0 = r10.A01
            java.lang.String r0 = r3.getString(r0)
            goto L71
        L7c:
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131962515(0x7f132a93, float:1.9561757E38)
            android.text.Spanned r2 = X.MSX.A09(r1, r2, r0)
            goto L58
        L88:
            android.widget.TextView r4 = r8.A03
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P1E.A03(X.5xZ, X.NjX):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A04(X.C131995xZ r6, X.EnumC53382NjX r7) {
        /*
            r5 = this;
            android.widget.TextView r0 = r5.A05
            int r1 = X.MSY.A02(r0)
            android.widget.TextView r0 = r5.A06
            if (r0 == 0) goto Ld
            r0.setVisibility(r1)
        Ld:
            boolean r4 = X.C196068lw.A03(r6)
            if (r4 == 0) goto L40
            com.instagram.common.session.UserSession r3 = r5.A0J
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36330441162113908(0x81125800004374, double:3.0388555096407116E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L40
            android.widget.TextView r1 = r5.A06
        L24:
            if (r4 != 0) goto L34
            android.widget.TextView r1 = r5.A05
            if (r1 == 0) goto L33
            int r0 = r7.A01
            r1.setText(r0)
        L2f:
            r0 = 0
            r1.setVisibility(r0)
        L33:
            return
        L34:
            if (r1 == 0) goto L33
            com.instagram.common.session.UserSession r0 = r5.A0J
            java.lang.String r0 = r7.A03(r0)
            r1.setText(r0)
            goto L2f
        L40:
            android.widget.TextView r1 = r5.A05
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P1E.A04(X.5xZ, X.NjX):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36324037366067029L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05() {
        /*
            r4 = this;
            X.5xX r0 = X.C131965xW.A05
            com.instagram.common.session.UserSession r3 = r4.A0J
            boolean r0 = X.C131975xX.A01(r3)
            if (r0 == 0) goto L18
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36324037366067029(0x810c8500032f55, double:3.0348057232346483E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r2 = 0
            if (r0 == 0) goto L19
        L18:
            r2 = 1
        L19:
            com.instagram.common.ui.base.IgTextView r1 = r4.A07
            if (r1 == 0) goto L25
            r0 = 8
            if (r2 == 0) goto L22
            r0 = 0
        L22:
            r1.setVisibility(r0)
        L25:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36324037366067029(0x810c8500032f55, double:3.0348057232346483E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L3c
            com.instagram.common.ui.base.IgTextView r1 = r4.A07
            if (r1 == 0) goto L3c
            r0 = 2131973696(0x7f135640, float:1.9584435E38)
            r1.setText(r0)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P1E.A05():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0194 A[RETURN] */
    @Override // X.InterfaceC58169PqZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View ANR() {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P1E.ANR():android.view.View");
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A0Q;
    }
}
