package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.model.User;

/* renamed from: X.EIp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32255EIp extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ShareProfileFragment";
    public C3CZ A00;
    public User A01;
    public Integer A03;
    public boolean A04;
    public IgTextView A05;
    public CircularImageView A06;
    public CircularImageView A07;
    public final int[] A09 = {-160462, -3078039};
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);
    public Integer A02 = C05F.A00;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "lightweight_connections_share_profile";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        C00N.A00(requireActivity().getOnBackPressedDispatcher(), this, new C57752Pjf(this, 29)).A04(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b9  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32255EIp.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C32255EIp r4) {
        /*
            com.instagram.user.model.User r0 = r4.A01
            java.lang.String r3 = "user"
            if (r0 == 0) goto L1c
            boolean r2 = r0.A1k()
            java.lang.String r0 = "plusBadge"
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r4.A07
            if (r2 == 0) goto L2c
            if (r1 == 0) goto L31
            r0 = 0
        L13:
            r1.setVisibility(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r4.A06
            if (r1 != 0) goto L24
            java.lang.String r3 = "avatarImageView"
        L1c:
            X.C14360o3.A0F(r3)
        L1f:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L24:
            com.instagram.user.model.User r0 = r4.A01
            if (r0 == 0) goto L1c
            X.AbstractC31173DnH.A1T(r4, r1, r0)
            return
        L2c:
            if (r1 == 0) goto L31
            r0 = 8
            goto L13
        L31:
            X.C14360o3.A0F(r0)
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32255EIp.A00(X.EIp):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A08);
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void afterOnPause() {
        InterfaceC53712dA interfaceC53712dA;
        super.afterOnPause();
        ComponentCallbacks2 rootActivity = getRootActivity();
        if ((rootActivity instanceof InterfaceC53712dA) && (interfaceC53712dA = (InterfaceC53712dA) rootActivity) != null) {
            interfaceC53712dA.EfL(0);
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C3CZ c3cz = this.A00;
        if (c3cz != null) {
            c3cz.A08(intent, i, i2, AbstractC167007dF.A1P(i, 7384567));
        }
        if (i == 7384567) {
            if (!this.A04) {
                IgTextView igTextView = this.A05;
                if (igTextView == null) {
                    C14360o3.A0F("skipButton");
                    throw C00O.createAndThrow();
                }
                AbstractC25227BEk.A12(igTextView, this, 2131968535);
                this.A04 = true;
                return;
            }
            return;
        }
        if (i2 == -1 && intent != null && intent.getExtras() != null) {
            AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A08);
            Integer num = this.A02;
            AbstractC167017dG.A1O(A0o, num);
            FD0.A00(A0o, C05F.A0j, num);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            r0 = 453756890(0x1b0bc7da, float:1.1562386E-22)
            int r3 = X.C0f9.A02(r0)
            r6 = r13
            super.onCreate(r14)
            X.0cb r0 = X.C17060sy.A01
            X.0do r4 = r13.A08
            com.instagram.user.model.User r0 = X.AbstractC31176DnK.A0g(r0, r4)
            r13.A01 = r0
            android.os.Bundle r1 = r13.mArguments
            if (r1 == 0) goto L6c
            java.lang.String r0 = "ShareProfileFragment.NavControlVariant"
            java.lang.String r1 = r1.getString(r0)
            if (r1 == 0) goto L6c
            java.lang.String r0 = "NUX"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
            java.lang.Integer r0 = X.C05F.A00
        L2b:
            r13.A03 = r0
            boolean r0 = X.C3CZ.A0G
            com.instagram.common.session.UserSession r9 = X.AbstractC166987dD.A0r(r4)
            X.0h2 r7 = X.AbstractC31174DnI.A0I(r13)
            X.C14360o3.A07(r7)
            com.instagram.user.model.User r10 = r13.A01
            if (r10 != 0) goto L48
            java.lang.String r0 = "user"
        L40:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L48:
            r0 = 1
            X.FtP r8 = new X.FtP
            r8.<init>(r13, r0)
            java.lang.Integer r11 = X.C05F.A0s
            r12 = 0
            X.3CZ r5 = new X.3CZ
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r13.A00 = r5
            java.lang.Integer r1 = r13.A03
            if (r1 != 0) goto L6f
            java.lang.String r0 = "navControlVariant"
            goto L40
        L5f:
            java.lang.String r0 = "TOOLBAR"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L6c
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r1)
            throw r0
        L6c:
            java.lang.Integer r0 = X.C05F.A01
            goto L2b
        L6f:
            java.lang.Integer r0 = X.C05F.A00
            r2 = r0
            if (r1 == r0) goto L76
            java.lang.Integer r0 = X.C05F.A01
        L76:
            r13.A02 = r0
            X.0ll r1 = X.AbstractC166987dD.A0o(r4)
            java.lang.Integer r0 = r13.A02
            X.AbstractC167017dG.A1O(r1, r0)
            X.FD0.A00(r1, r2, r0)
            r0 = 17695981(0x10e04ed, float:2.6084815E-38)
            X.C0f9.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32255EIp.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-269457496);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.nux_share_profile, false);
        C0f9.A09(-1988457642, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        InterfaceC53712dA interfaceC53712dA;
        int A02 = C0f9.A02(-2125018114);
        super.onResume();
        ComponentCallbacks2 rootActivity = getRootActivity();
        if ((rootActivity instanceof InterfaceC53712dA) && (interfaceC53712dA = (InterfaceC53712dA) rootActivity) != null) {
            interfaceC53712dA.EfL(8);
        }
        C0f9.A09(-589684959, A02);
    }
}
