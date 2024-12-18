package X;

import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.ArrayList;

/* renamed from: X.AgN, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23812AgN implements C8Q5 {
    public final ViewGroup A00;
    public final ViewGroup A01;
    public final ImageView A02;
    public final ImageView A03;
    public final UserSession A04;
    public final C8Q4 A05;

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
    public final void ERk(GradientDrawable.Orientation orientation, int[] iArr, int i) {
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
    public final /* synthetic */ C8DO Auk() {
        return null;
    }

    @Override // X.C8Q5
    public final /* synthetic */ int Bu5() {
        return 0;
    }

    public C23812AgN(ViewStub viewStub, UserSession userSession, C8Q4 c8q4, C8DN c8dn, TargetViewSizeProvider targetViewSizeProvider) {
        this.A04 = userSession;
        this.A05 = c8q4;
        viewStub.setLayoutResource(R.layout.layout_post_capture_button_direct_epd);
        View inflate = viewStub.inflate();
        this.A00 = (ViewGroup) inflate.requireViewById(R.id.edit_buttons_toolbar);
        ImageView imageView = (ImageView) inflate.requireViewById(R.id.cancel_button);
        this.A02 = imageView;
        C216559iC.A02(AbstractC166987dD.A0s(imageView), c8dn, 22);
        View findViewById = inflate.findViewById(R.id.save_button_view_stub);
        if (findViewById != null) {
            View inflate2 = ((ViewStub) findViewById).inflate();
            C14360o3.A0C(inflate2, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView2 = (ImageView) inflate2;
            this.A03 = imageView2;
            AbstractC56952jT.A01(imageView2);
            C216559iC.A02(AbstractC166987dD.A0s(imageView2), c8dn, 23);
            C8QC.A00(inflate, R.layout.layout_post_capture_button_share_container_direct_reply);
            ViewGroup viewGroup = (ViewGroup) inflate.requireViewById(R.id.post_capture_button_share_container);
            this.A01 = viewGroup;
            C1812982h.A03(viewGroup, targetViewSizeProvider);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C8Q5
    public final /* synthetic */ ArrayList CGj() {
        return AbstractC166987dD.A1E();
    }

    @Override // X.C8Q5
    public final void D2U(boolean z) {
        int A05 = AbstractC167007dF.A05(z ? 1 : 0);
        this.A00.setVisibility(A05);
        this.A01.setVisibility(A05);
    }

    @Override // X.C8Q5
    public final void FAQ(Spannable spannable, AnonymousClass840 anonymousClass840, EnumC1810181d enumC1810181d, EnumC1810381f enumC1810381f, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        boolean A1a = AbstractC167017dG.A1a(enumC1810181d, enumC1810381f);
        AbstractC167017dG.A1R(num, anonymousClass840);
        if (!C8QC.A08(enumC1810181d, enumC1810381f)) {
            C8QC.A03(this.A02, !this.A05.A03());
            C8QC.A03(this.A03, C8QC.A07(anonymousClass840.A02));
            C8QC.A06(new View[]{this.A00}, A1a, A1a);
        }
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
