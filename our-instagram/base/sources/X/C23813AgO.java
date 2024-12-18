package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.util.ArrayList;

/* renamed from: X.AgO, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23813AgO implements C8Q5 {
    public final View A00;
    public final ImageView A01;
    public final RelativeLayout A02;
    public final IgLinearLayout A03;
    public final C8Q6 A04;
    public final IgdsMediaButton A05;

    @Override // X.C8Q5
    public final /* synthetic */ void Cp2() {
    }

    @Override // X.C8Q5
    public final /* synthetic */ void DLm(boolean z) {
    }

    @Override // X.C8Q5
    public final void EJi() {
    }

    @Override // X.C8Q5
    public final /* synthetic */ void EJw() {
    }

    @Override // X.C8Q5
    public final /* synthetic */ void EQA(boolean z) {
    }

    @Override // X.C8Q5
    public final void ERl(String str) {
    }

    @Override // X.C8Q5
    public final /* synthetic */ void EYd(boolean z) {
    }

    @Override // X.C8Q5
    public final /* synthetic */ void EaK(String str, Integer num) {
    }

    @Override // X.C8Q5
    public final void Eey(boolean z) {
    }

    @Override // X.C8Q5
    public final void FAQ(Spannable spannable, AnonymousClass840 anonymousClass840, EnumC1810181d enumC1810181d, EnumC1810381f enumC1810381f, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        C14360o3.A0B(enumC1810181d, 0);
        AbstractC167027dH.A13(enumC1810381f, num, anonymousClass840);
        this.A04.A0P(anonymousClass840, enumC1810181d, enumC1810381f, num, z, z2, z3, z4, z5, z6, false, false, false, false, false, false, false, false);
        boolean z16 = !C8QC.A08(enumC1810181d, enumC1810381f);
        C8QC.A03(this.A05, z16);
        C8QC.A03(this.A01, z16);
        C8QC.A03(this.A03, z16);
        C8QC.A03(this.A02, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.6cX, java.lang.Object] */
    public C23813AgO(Activity activity, Context context, ViewStub viewStub, AbstractC59962oe abstractC59962oe, C1819485e c1819485e, UserSession userSession, C8Q4 c8q4, C8DN c8dn, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass840 anonymousClass840, AnonymousClass856 anonymousClass856) {
        C8Q6 c8q6 = new C8Q6(activity, context, null, viewStub, abstractC59962oe, c1819485e, userSession, null, c8q4, c8dn, targetViewSizeProvider, anonymousClass840, anonymousClass856, null, null, R.layout.layout_post_capture_button_share_container_subscription_welcome_story, false, false, false);
        this.A04 = c8q6;
        View A0O = c8q6.A0O();
        this.A00 = A0O;
        IgLinearLayout igLinearLayout = (IgLinearLayout) AbstractC166997dE.A0R(A0O, R.id.post_capture_button_share_container);
        this.A03 = igLinearLayout;
        ImageView imageView = null;
        IgdsMediaButton A0D = ((CreationActionBar) AbstractC166997dE.A0R(igLinearLayout, R.id.subscriptions_welcome_story_share_controls_action_bar)).A0D(null);
        A0D.setButtonStyle(EnumC151036r4.A0D);
        ?? obj = new Object();
        obj.A00 = R.drawable.chevron_right;
        A0D.setStartAddOn(obj, context.getString(2131955158));
        this.A05 = A0D;
        ImageView imageView2 = (ImageView) A0O.findViewById(R.id.cancel_button);
        if (imageView2 != null) {
            C216559iC.A02(AbstractC166987dD.A0s(imageView2), activity, 28);
            imageView = imageView2;
        }
        this.A01 = imageView;
        this.A02 = (RelativeLayout) A0O.findViewById(R.id.camera_resize_button);
        AbstractC56952jT.A01(A0D);
        C3P9 A0s = AbstractC166987dD.A0s(A0D);
        A0s.A04 = new C23688AeN(activity, context, userSession, c8dn);
        A0s.A00();
    }

    @Override // X.C8Q5
    public final /* synthetic */ C8DO Auk() {
        return null;
    }

    @Override // X.C8Q5
    public final /* synthetic */ int Bu5() {
        return 0;
    }

    @Override // X.C8Q5
    public final /* synthetic */ ArrayList CGj() {
        return AbstractC166987dD.A1E();
    }

    @Override // X.C8Q5
    public final void D2U(boolean z) {
        this.A03.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
    }

    @Override // X.C8Q5
    public final void ERk(GradientDrawable.Orientation orientation, int[] iArr, int i) {
        AbstractC167017dG.A1N(orientation, iArr);
        this.A04.A0t.A02(orientation, iArr, i);
    }

    @Override // X.C8Q5
    public final /* synthetic */ boolean D8c(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // X.C8Q5
    public final /* synthetic */ boolean Ej6(float f, float f2) {
        return false;
    }
}
