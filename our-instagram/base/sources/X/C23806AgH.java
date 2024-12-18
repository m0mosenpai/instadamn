package X;

import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.R;
import java.util.ArrayList;

/* renamed from: X.AgH, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23806AgH implements C8Q5 {
    public final ImageView A00;
    public final ImageView A01;

    @Override // X.C8Q5
    public final /* synthetic */ void Cp2() {
    }

    @Override // X.C8Q5
    public final void D2U(boolean z) {
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
        C14360o3.A0B(enumC1810181d, 0);
        AbstractC167027dH.A13(enumC1810381f, num, anonymousClass840);
        EnumC1810181d enumC1810181d2 = EnumC1810181d.A0j;
        C8QC.A03(this.A01, AbstractC167007dF.A1X(enumC1810181d, enumC1810181d2));
        ImageView imageView = this.A00;
        if (imageView != null) {
            C8QC.A03(imageView, AbstractC167007dF.A1X(enumC1810181d, enumC1810181d2));
            C8QC.A04(imageView, num);
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

    public C23806AgH(ViewStub viewStub, C8DN c8dn) {
        viewStub.setLayoutResource(R.layout.layout_post_capture_button_selfie_sticker);
        View inflate = viewStub.inflate();
        ImageView imageView = (ImageView) inflate.findViewById(R.id.cancel_button);
        ImageView imageView2 = null;
        if (imageView != null) {
            C216559iC.A02(AbstractC166987dD.A0s(imageView), c8dn, 24);
        } else {
            imageView = null;
        }
        this.A01 = imageView;
        ImageView imageView3 = (ImageView) inflate.findViewById(R.id.video_mute_button);
        if (imageView3 != null) {
            C8QC.A03(imageView3, false);
            C216559iC.A02(AbstractC166987dD.A0s(imageView3), c8dn, 25);
            imageView2 = imageView3;
        }
        this.A00 = imageView2;
    }

    @Override // X.C8Q5
    public final /* synthetic */ ArrayList CGj() {
        return AbstractC166987dD.A1E();
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
