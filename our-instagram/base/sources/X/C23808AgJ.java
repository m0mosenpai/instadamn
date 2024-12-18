package X;

import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.util.ArrayList;

/* renamed from: X.AgJ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23808AgJ implements C8Q5 {
    public final ViewGroup A00;
    public final ImageView A01;
    public final IgdsMediaButton A02;

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
    public final void FAQ(Spannable spannable, AnonymousClass840 anonymousClass840, EnumC1810181d enumC1810181d, EnumC1810381f enumC1810381f, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        boolean A1R = AbstractC167007dF.A1R(0, enumC1810181d, enumC1810381f);
        AbstractC167017dG.A1R(num, anonymousClass840);
        boolean A08 = C8QC.A08(enumC1810181d, enumC1810381f);
        View[] viewArr = {this.A01};
        if (A08) {
            C8QC.A05(viewArr, false);
            C8QC.A03(this.A02, false);
        } else {
            C8QC.A05(viewArr, A1R);
            C8QC.A03(this.A02, A1R);
        }
    }

    @Override // X.C8Q5
    public final /* synthetic */ C8DO Auk() {
        return null;
    }

    @Override // X.C8Q5
    public final /* synthetic */ int Bu5() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.6cX, java.lang.Object] */
    public C23808AgJ(ViewStub viewStub, C8DN c8dn, TargetViewSizeProvider targetViewSizeProvider) {
        viewStub.setLayoutResource(R.layout.layout_post_capture_button_birthday_selfie);
        View inflate = viewStub.inflate();
        C14360o3.A0A(inflate);
        C8QC.A00(inflate, R.layout.layout_post_capture_button_share_container_birthday_selfie);
        ViewGroup viewGroup = (ViewGroup) inflate.requireViewById(R.id.birthday_selfie_post_capture_button_share_container);
        this.A00 = viewGroup;
        C1812982h.A03(viewGroup, targetViewSizeProvider);
        CreationActionBar creationActionBar = (CreationActionBar) AbstractC166997dE.A0R(viewGroup, R.id.birthday_selfie_story_share_controls_action_bar);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.cancel_button);
        if (imageView != null) {
            C216559iC.A02(AbstractC166987dD.A0s(imageView), c8dn, 20);
        } else {
            imageView = null;
        }
        this.A01 = imageView;
        IgdsMediaButton A0D = creationActionBar.A0D(null);
        A0D.setButtonStyle(EnumC151036r4.A0D);
        ?? obj = new Object();
        obj.A00 = R.drawable.chevron_right;
        A0D.setStartAddOn(obj, A0D.getContext().getString(2131953844));
        this.A02 = A0D;
        AbstractC56952jT.A01(A0D);
        C216559iC.A02(AbstractC166987dD.A0s(A0D), c8dn, 21);
    }

    @Override // X.C8Q5
    public final /* synthetic */ ArrayList CGj() {
        return AbstractC166987dD.A1E();
    }

    @Override // X.C8Q5
    public final void D2U(boolean z) {
        this.A00.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
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
