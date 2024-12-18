package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.ArrayList;

/* renamed from: X.AgI, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23807AgI implements C8Q5 {
    public final C8Q6 A00;
    public final InterfaceC09390do A01;

    @Override // X.C8Q5
    public final /* synthetic */ void Cp2() {
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
    public final /* synthetic */ void EaK(String str, Integer num) {
    }

    @Override // X.C8Q5
    public final void Eey(boolean z) {
    }

    @Override // X.C8Q5
    public final void FAQ(Spannable spannable, AnonymousClass840 anonymousClass840, EnumC1810181d enumC1810181d, EnumC1810381f enumC1810381f, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        C14360o3.A0B(enumC1810181d, 0);
        AbstractC167027dH.A13(enumC1810381f, num, anonymousClass840);
        this.A00.A0P(anonymousClass840, enumC1810181d, enumC1810381f, num, z, z2, z3, z4, z5, z6, false, false, false, false, false, false, false, false);
    }

    public C23807AgI(Activity activity, Context context, ViewStub viewStub, AbstractC59962oe abstractC59962oe, C1819485e c1819485e, UserSession userSession, C8Q4 c8q4, C8DN c8dn, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass840 anonymousClass840, AnonymousClass856 anonymousClass856) {
        this.A00 = new C8Q6(activity, context, null, viewStub, abstractC59962oe, c1819485e, userSession, null, c8q4, c8dn, targetViewSizeProvider, anonymousClass840, anonymousClass856, null, null, R.layout.layout_post_capture_button_share_container_direct_reply, false, false, false);
        this.A01 = C1XM.A00(new B61(36, c8dn, this));
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
    public final void D2U(boolean z) {
        this.A00.A0Q(z);
    }

    @Override // X.C8Q5
    public final void DLm(boolean z) {
        this.A00.A0R(z);
    }

    @Override // X.C8Q5
    public final void EYd(boolean z) {
        AbstractC167007dF.A0L(this.A01).setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
    }

    @Override // X.C8Q5
    public final /* synthetic */ ArrayList CGj() {
        return AbstractC166987dD.A1E();
    }

    @Override // X.C8Q5
    public final void ERk(GradientDrawable.Orientation orientation, int[] iArr, int i) {
        AbstractC167017dG.A1N(orientation, iArr);
        this.A00.A0t.A02(orientation, iArr, i);
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
