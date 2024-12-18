package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.70S, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C70S extends AbstractC60592pi implements InterfaceC60122ou {
    public View A01;
    public ImageView A02;
    public ImageView A03;
    public ImageView A04;
    public ImageView A05;
    public C44518JmO A06;
    public List A07;
    public ImageView A08;
    public boolean A09;
    public boolean A0A;
    public final C2d4 A0B;
    public final AbstractC59962oe A0C;
    public final UserSession A0D;
    public final InterfaceC60442pS A0E;
    public final C155636ys A0F;
    public final C70Q A0G;
    public final UserDetailFragment A0H;
    public final UserDetailLaunchConfig A0I;
    public final C155536yi A0J;
    public final C1563970j A0K;
    public final AbstractC10360h2 A0M;
    public final boolean A0N;
    public final boolean A0O;
    public int A00 = -1;
    public final boolean A0L = true;

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onStop() {
        this.A09 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C70S(AbstractC10360h2 abstractC10360h2, C2d4 c2d4, AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C155636ys c155636ys, C70Q c70q, UserDetailFragment userDetailFragment, UserDetailLaunchConfig userDetailLaunchConfig, C155536yi c155536yi, boolean z, boolean z2) {
        this.A0B = c2d4;
        this.A0D = userSession;
        this.A0G = c70q;
        this.A0H = userDetailFragment;
        this.A0C = abstractC59962oe;
        this.A0M = abstractC10360h2;
        this.A0E = interfaceC60442pS;
        this.A0I = userDetailLaunchConfig;
        this.A0F = c155636ys;
        this.A0J = c155536yi;
        this.A0N = z;
        this.A0K = C1XJ.A00.A0Q((FragmentActivity) c2d4, userSession, null, null, null, interfaceC60442pS.getModuleName(), "profile", null, null, null, null);
        this.A0O = z2;
    }

    private void A00(Context context, InterfaceC56362iU interfaceC56362iU, final User user) {
        C3LO c3lo = new C3LO();
        c3lo.A0A = R.layout.navbar_profile_share_button;
        c3lo.A05 = 2131970249;
        c3lo.A0G = new View.OnClickListener() { // from class: X.6rH
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C70S c70s = C70S.this;
                User user2 = user;
                AbstractC59962oe abstractC59962oe = c70s.A0C;
                FragmentActivity activity = abstractC59962oe.getActivity();
                if (activity != null) {
                    UserSession userSession = c70s.A0D;
                    if (AbstractC82073lT.A02(userSession)) {
                        Bundle bundle = new Bundle();
                        bundle.putString("displayed_user_id", user2.getId());
                        bundle.putBoolean("disable_initial_animation", true);
                        FAK.A00(activity, bundle, userSession, user2.getId(), true);
                        return;
                    }
                    AbstractC31364DqT.A03();
                    C14360o3.A0B(userSession, 1);
                    C34726FRp A07 = C28531Zo.A04.A02.A07(abstractC59962oe, userSession, C2EY.A1Q);
                    A07.A06(user2.getId());
                    DirectShareSheetFragment A00 = A07.A00();
                    C18920wW A01 = AbstractC12220kQ.A01(abstractC59962oe, userSession);
                    InterfaceC02590Ai A002 = A01.A00(A01.A00, "direct_reshare_button_tap");
                    if (A002.isSampled()) {
                        A002.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
                        A002.Cht();
                    }
                    C3DN A003 = C3DN.A00.A00(activity);
                    if (A003 == null) {
                        return;
                    }
                    A003.A0K(A00);
                }
            }
        };
        ImageView imageView = (ImageView) interfaceC56362iU.AAB(new C3LY(c3lo));
        this.A08 = imageView;
        AbstractC56932jR.A08(imageView, context.getString(2131970248));
    }

    public static void A01(C70S c70s, boolean z) {
        ImageView imageView = c70s.A03;
        if (imageView != null) {
            Resources resources = ((Context) c70s.A0B).getResources();
            int i = R.drawable.instagram_alert_new_pano_outline_24;
            if (z) {
                i = R.drawable.instagram_alert_check_new_pano_outline_24;
            }
            imageView.setImageDrawable(resources.getDrawable(i));
        }
    }

    public final void A02(boolean z) {
        ImageView imageView = this.A03;
        if (imageView != null) {
            int i = 8;
            if (z) {
                i = 0;
            }
            imageView.setVisibility(i);
            if (z && !this.A0A) {
                this.A0A = true;
                this.A0H.A0x("user_profile_header", "notifications_entry_point_impression");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (X.C151366re.A03(r10.A0D) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(boolean r11) {
        /*
            r10 = this;
            X.70Q r3 = r10.A0G
            X.MUB r0 = r3.A08
            com.instagram.user.model.User r6 = r0.A03
            if (r6 == 0) goto L50
            android.widget.ImageView r5 = r10.A02
            if (r5 == 0) goto L50
            r1 = 1
            r4 = 0
            if (r11 == 0) goto L19
            com.instagram.common.session.UserSession r0 = r10.A0D
            boolean r2 = X.C151366re.A03(r0)
            r0 = 1
            if (r2 != 0) goto L1c
        L19:
            r0 = 0
            r4 = 8
        L1c:
            r5.setVisibility(r4)
            if (r0 == 0) goto L50
            boolean r0 = r10.A09
            if (r0 != 0) goto L50
            com.instagram.common.session.UserSession r5 = r10.A0D
            boolean r0 = X.C2TN.A04(r5, r6)
            X.2pS r4 = r10.A0E
            if (r0 == 0) goto L53
            java.lang.String r7 = "self_profile_switcher"
        L31:
            java.lang.String r8 = r6.getId()
            X.2oe r0 = r10.A0C
            android.content.Context r0 = r0.requireContext()
            boolean r9 = X.AbstractC14490oL.A0A(r0)
            X.70D r0 = r3.A05
            X.70P r0 = r0.A0D
            if (r0 == 0) goto L51
            int r0 = r0.A00
        L47:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            X.AbstractC151386rg.A04(r4, r5, r6, r7, r8, r9)
            r10.A09 = r1
        L50:
            return
        L51:
            r0 = 0
            goto L47
        L53:
            java.lang.String r7 = "other_profile_switcher"
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70S.A03(boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x0520, code lost:
    
        if (r0 != false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0482, code lost:
    
        if (r12 != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x04a0, code lost:
    
        if (r6.A0G() != X.EnumC154216wW.A03) goto L156;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e A[ADDED_TO_REGION] */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r15) {
        /*
            Method dump skipped, instructions count: 1326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70S.configureActionBar(X.2iU):void");
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        View view = this.A01;
        if (view != null) {
            view.setOnClickListener(null);
        }
        this.A01 = null;
    }
}
