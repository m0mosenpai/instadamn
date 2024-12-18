package X;

import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.R;
import java.util.ArrayList;

/* renamed from: X.AgK, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23809AgK implements C8Q5 {
    public final ImageView A00;
    public final ImageView A01;
    public final C8Q4 A02;

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
        C14360o3.A0B(enumC1810181d, 0);
        AbstractC167027dH.A13(enumC1810381f, num, anonymousClass840);
        if (!C8QC.A08(enumC1810181d, enumC1810381f)) {
            C8QC.A03(this.A00, !this.A02.A03());
            C8QC.A03(this.A01, C8QC.A07(anonymousClass840.A02));
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

    @Override // X.C8Q5
    public final void D2U(boolean z) {
        C8QC.A03(this.A00, z);
        C8QC.A03(this.A01, z);
    }

    public C23809AgK(ViewStub viewStub, C8Q4 c8q4, C8DN c8dn) {
        this.A02 = c8q4;
        viewStub.setLayoutResource(R.layout.layout_post_capture_button_open_carousel);
        View inflate = viewStub.inflate();
        ImageView imageView = (ImageView) inflate.findViewById(R.id.cancel_button);
        if (imageView != null) {
            C216559iC.A02(AbstractC166987dD.A0s(imageView), c8dn, 26);
        } else {
            imageView = null;
        }
        this.A00 = imageView;
        View findViewById = inflate.findViewById(R.id.save_button_view_stub);
        if (findViewById != null) {
            View inflate2 = ((ViewStub) findViewById).inflate();
            C14360o3.A0C(inflate2, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView2 = (ImageView) inflate2;
            C8QC.A03(imageView2, false);
            C216559iC.A02(AbstractC166987dD.A0s(imageView2), c8dn, 27);
            this.A01 = imageView2;
            return;
        }
        throw AbstractC166997dE.A0g();
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
