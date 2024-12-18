package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.model.sharelater.ShareLaterMedia;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(message = "Avoid adding more logic to this class. Consider com.instagram.creation.sharesheet.rowitems")
/* renamed from: X.McV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50808McV extends FrameLayout implements CallerContextable {
    public View A00;
    public TextView A01;
    public TextView A02;
    public C54966OSw A03;
    public IgdsSwitch A04;
    public GradientSpinnerAvatarView A05;
    public DialogInterfaceOnCancelListenerC32263EIy A06;
    public InterfaceC58001Pnl A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public View A0E;
    public TextView A0F;
    public InterfaceC41501vz A0G;
    public final FragmentActivity A0H;
    public final AbstractC59962oe A0I;
    public final UserSession A0J;
    public final ShareLaterMedia A0K;
    public final OWR A0L;
    public final InterfaceC58086PpB A0M;
    public final String A0N;
    public final List A0O;
    public final List A0P;
    public final View.OnClickListener A0Q;
    public final View A0R;
    public final ViewGroup A0S;
    public static final String __redex_internal_original_name = "ShareTable";
    public static final CallerContext A0T = CallerContext.A01(__redex_internal_original_name);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.OWR] */
    public C50808McV(Context context, View view, AbstractC59962oe abstractC59962oe, UserSession userSession, ShareLaterMedia shareLaterMedia, InterfaceC58086PpB interfaceC58086PpB, String str, List list, List list2) {
        super(context);
        C14360o3.A0B(interfaceC58086PpB, 7);
        this.A0I = abstractC59962oe;
        this.A0J = userSession;
        this.A0M = interfaceC58086PpB;
        this.A0K = shareLaterMedia;
        this.A0N = str;
        this.A0H = abstractC59962oe.requireActivity();
        this.A0O = AbstractC166987dD.A1E();
        this.A0P = AbstractC166987dD.A1E();
        this.A0A = true;
        this.A0Q = new Ok4(this, 6);
        LayoutInflater A0P = AbstractC25228BEl.A0P(this);
        A0P.inflate(R.layout.widget_share_table, this);
        this.A0S = AbstractC31173DnH.A0F(this, R.id.share_table_button_container);
        View requireViewById = requireViewById(R.id.share_table_divider);
        this.A0R = requireViewById;
        this.A0L = new Object();
        if (AbstractC63292u7.A00(userSession)) {
            this.A03 = new C54966OSw(context);
        }
        setupViews(view, A0P, list, list2);
        requireViewById.setVisibility(8);
    }

    public final void A05(C130135uJ c130135uJ, IgdsSwitch igdsSwitch, String str, String str2, boolean z) {
        N5K A00 = AbstractC53951NtO.A00(str2);
        A00.A01 = new C56368P1d(c130135uJ, igdsSwitch, this);
        C189448aO A0X = AbstractC31177DnL.A0X(this.A0J, false);
        FragmentActivity fragmentActivity = this.A0H;
        A0X.A0F = ViewConfiguration.get(fragmentActivity).getScaledPagingTouchSlop();
        A0X.A0U = new C56763PHg(c130135uJ, igdsSwitch, this, str, str2);
        C189478aR A002 = A0X.A00();
        if (z) {
            AbstractC167007dF.A0J().postDelayed(new RunnableC57055PSu(A00, A002, this), 500L);
        } else {
            A002.A02(fragmentActivity, A00);
        }
    }

    private final void A01() {
        GradientSpinnerAvatarView gradientSpinnerAvatarView;
        String str = C196068lw.A00(this.A0J).A00(A0T).A05;
        if (str != null && str.length() != 0) {
            GradientSpinnerAvatarView gradientSpinnerAvatarView2 = this.A05;
            if (gradientSpinnerAvatarView2 != null) {
                gradientSpinnerAvatarView2.A0F(null, this.A0I, AbstractC25225BEi.A0t(str));
            }
        } else {
            Drawable drawable = getContext().getDrawable(R.drawable.unlinked_facebook_icon);
            if (drawable != null && (gradientSpinnerAvatarView = this.A05) != null) {
                gradientSpinnerAvatarView.A0D(drawable);
            }
        }
        GradientSpinnerAvatarView gradientSpinnerAvatarView3 = this.A05;
        if (gradientSpinnerAvatarView3 != null) {
            gradientSpinnerAvatarView3.setBottomBadgeDrawable(getContext().getDrawable(R.drawable.avatar_bottom_badge_facebook));
        }
        GradientSpinnerAvatarView gradientSpinnerAvatarView4 = this.A05;
        if (gradientSpinnerAvatarView4 != null) {
            gradientSpinnerAvatarView4.A01 = AbstractC13880nE.A04(AbstractC166997dE.A0L(this), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Zx, X.MnJ] */
    public static final void A02(MU0 mu0, C50808McV c50808McV, boolean z) {
        ?? c0Zx = new C0Zx();
        c0Zx.A03("is_xpost_enabled", Boolean.valueOf(z));
        UserSession userSession = c50808McV.A0J;
        AbstractC50568MTz.A00(mu0, MU1.FEED, C82G.A0B, c0Zx, userSession);
    }

    public static final void A03(C130135uJ c130135uJ, IgdsSwitch igdsSwitch, C50808McV c50808McV) {
        C131975xX c131975xX = C131965xW.A05;
        UserSession userSession = c50808McV.A0J;
        if (MSX.A0Q(userSession) != null) {
            c130135uJ.A00 = true;
            C131975xX.A00(userSession).A0A(c130135uJ);
        }
        View view = c50808McV.A00;
        if (view != null) {
            view.setVisibility(8);
            if (igdsSwitch != null) {
                if (c50808McV.A09 || C196218mC.A00(userSession)) {
                    igdsSwitch.A00();
                }
                igdsSwitch.setClickable(true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x019d, code lost:
    
        if (r1 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r34 != X.EnumC53382NjX.A05) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x026a, code lost:
    
        if (r5.A0A(r1) != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x026c, code lost:
    
        X.C14360o3.A0B(r7, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0284, code lost:
    
        if (X.AbstractC166987dD.A0x(r7).getInt("feed_last_server_xposting_turn_on_time_in_second", -1) >= X.AbstractC166987dD.A0x(r7).getInt("xpost_to_facebook_feed_server_mtime_in_second", 0)) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x028a, code lost:
    
        if (X.C196218mC.A00(r7) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x028c, code lost:
    
        r0 = new X.RunnableC57015PRg(r2, r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0264, code lost:
    
        if (r1 != null) goto L108;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setupAppSharingButtons(android.view.View r32, android.view.LayoutInflater r33, X.EnumC53382NjX r34) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50808McV.setupAppSharingButtons(android.view.View, android.view.LayoutInflater, X.NjX):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.EIy, androidx.fragment.app.Fragment, X.2oe] */
    private final void setupShareFragmentForFbPageDestination(EnumC53382NjX enumC53382NjX) {
        this.A0G = new C36156FxV(9, enumC53382NjX, this);
        ?? abstractC59962oe = new AbstractC59962oe();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable("ShareLaterMedia.SHARE_LATER_MEDIA", this.A0K);
        AbstractC03240Dh.A00(A0b, this.A0J);
        abstractC59962oe.setArguments(A0b);
        C14240no A0G = MSY.A0G(this.A0H);
        A0G.A0B(abstractC59962oe, "share_to_fb_page");
        A0G.A01();
        this.A06 = abstractC59962oe;
    }

    private final void setupViews(View view, LayoutInflater layoutInflater, List list, List list2) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                EnumC53382NjX enumC53382NjX = (EnumC53382NjX) it.next();
                setupAppSharingButtons(view, layoutInflater, enumC53382NjX);
                this.A0M.Ck9(enumC53382NjX.A02);
            }
            return;
        }
        if (list2 != null) {
            UserSession userSession = this.A0J;
            List A0a = AbstractC001800i.A0a(AbstractC53982Ntt.A00(userSession).A00);
            for (Object obj : A0a) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        OAC oac = (OAC) it2.next();
                        if (C14360o3.A0K(obj, oac.A02)) {
                            setupOtherIGSharingButton(layoutInflater, oac);
                            break;
                        }
                    }
                }
            }
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                OAC oac2 = (OAC) it3.next();
                String str = oac2.A02;
                if (!A0a.contains(str)) {
                    setupOtherIGSharingButton(layoutInflater, oac2);
                    MSZ.A1P(str, AbstractC53982Ntt.A00(userSession).A00);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (((java.util.Set) r4.A02.getValue()).contains(r1) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04() {
        /*
            r8 = this;
            java.util.List r0 = r8.A0P
            java.util.Iterator r7 = r0.iterator()
        L6:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r5 = r7.next()
            android.widget.CompoundButton r5 = (android.widget.CompoundButton) r5
            java.lang.Object r0 = r5.getTag()
            if (r0 == 0) goto L6
            java.lang.Object r6 = r5.getTag()
            X.AbstractC25225BEi.A1S(r6)
            com.instagram.common.session.UserSession r0 = r8.A0J
            X.Ovx r4 = X.AbstractC53982Ntt.A00(r0)
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            X.05A r0 = r4.A01
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L63
            java.util.Iterator r3 = X.AbstractC25226BEj.A1J(r0)
            r1 = 0
        L36:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r2 = r3.next()
            X.OAC r2 = (X.OAC) r2
            java.lang.String r0 = r2.A02
            boolean r0 = X.C14360o3.A0K(r0, r6)
            if (r0 == 0) goto L36
            java.lang.String r1 = r2.A00
            goto L36
        L4d:
            if (r1 == 0) goto L5e
            X.05A r0 = r4.A02
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            boolean r1 = r0.contains(r1)
            r0 = 1
            if (r1 != 0) goto L5f
        L5e:
            r0 = 0
        L5f:
            r5.setChecked(r0)
            goto L6
        L63:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50808McV.A04():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01bf, code lost:
    
        if (r29 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c1, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c7, code lost:
    
        if (r10.A0A(r29) == true) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01d4, code lost:
    
        throw X.AbstractC166987dD.A14("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x018b, code lost:
    
        if (X.C14360o3.A0K(r0, r11) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01bd, code lost:
    
        if (r0.A02 == true) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e4, code lost:
    
        if (X.C131975xX.A00(r5).A0C(r5) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e6, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e7, code lost:
    
        r9.setChecked(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0119, code lost:
    
        if (r2.A00 != true) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(X.InterfaceC914447a r29) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50808McV.A06(X.47a):void");
    }

    private final ViewGroup A00() {
        LayoutInflater A0P = AbstractC25228BEl.A0P(this);
        ViewGroup viewGroup = this.A0S;
        View A0A = AbstractC31172DnG.A0A(A0P, viewGroup, R.layout.widget_share_table_row);
        viewGroup.addView(A0A);
        return AbstractC31176DnK.A0C(A0A, R.id.share_table_row_button_container);
    }

    private final void setupOtherIGSharingButton(LayoutInflater layoutInflater, OAC oac) {
        ViewGroup A00 = A00();
        View A0A = AbstractC31172DnG.A0A(layoutInflater, A00, R.layout.widget_share_table_row_redesign);
        TextView A0N = AbstractC167007dF.A0N(A0A, R.id.share_table_button);
        String str = oac.A02;
        A0N.setText(str);
        IgdsSwitch igdsSwitch = (IgdsSwitch) AbstractC166997dE.A0R(A0A, R.id.share_switch);
        AbstractC35174FfR.A00(EnumC72435Xdf.A0F, this.A0J, "upsell_impressions");
        igdsSwitch.A07 = new P3U(4, A0A, this, oac);
        igdsSwitch.setTag(str);
        this.A0P.add(igdsSwitch);
        A00.addView(A0A);
        this.A0E = A0A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(1663264099);
        super.onAttachedToWindow();
        InterfaceC41501vz interfaceC41501vz = this.A0G;
        if (interfaceC41501vz != null) {
            AbstractC25651Mw.A00(this.A0J).A01(interfaceC41501vz, C36111Fwl.class);
        }
        C0f9.A0D(1867524867, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-1462359931);
        super.onDetachedFromWindow();
        InterfaceC41501vz interfaceC41501vz = this.A0G;
        if (interfaceC41501vz != null) {
            AbstractC25651Mw.A00(this.A0J).A02(interfaceC41501vz, C36111Fwl.class);
        }
        C0f9.A0D(-143610878, A06);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View view = this.A0E;
        if (view != null) {
            View view2 = this.A0R;
            view2.measure(View.MeasureSpec.makeMeasureSpec(view2.getLayoutParams().width, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - view.getMeasuredHeight(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        Iterator it = this.A0O.iterator();
        while (it.hasNext()) {
            AbstractC43592JPx.A09(it).setEnabled(z);
        }
        Iterator it2 = this.A0P.iterator();
        while (it2.hasNext()) {
            AbstractC43592JPx.A09(it2).setEnabled(z);
        }
    }

    public final void setIsShareToCloseFriends(boolean z) {
        this.A0C = z;
    }

    public final void setIsShareToProfileOnly(boolean z) {
        this.A0B = z;
    }

    public final void setOnAppSharingToggleListener(InterfaceC58001Pnl interfaceC58001Pnl) {
        this.A07 = interfaceC58001Pnl;
    }
}
