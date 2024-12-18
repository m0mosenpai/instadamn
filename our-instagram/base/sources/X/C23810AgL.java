package X;

import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.form.IgFormField;
import java.util.ArrayList;

/* renamed from: X.AgL, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23810AgL implements C8Q5 {
    public final IgFormField A00;
    public final ViewGroup A01;
    public final IgdsButton A02;

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
        boolean A1R = AbstractC167007dF.A1R(0, enumC1810181d, enumC1810381f);
        AbstractC167017dG.A1R(num, anonymousClass840);
        boolean A08 = C8QC.A08(enumC1810181d, enumC1810381f);
        View[] viewArr = {this.A02};
        if (A08) {
            C8QC.A05(viewArr, false);
            C8QC.A03(this.A01, false);
        } else {
            C8QC.A05(viewArr, A1R);
            C8QC.A03(this.A01, A1R);
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

    public C23810AgL(ViewStub viewStub, C8DN c8dn) {
        viewStub.setLayoutResource(R.layout.layout_post_capture_button_potato);
        ViewGroup viewGroup = (ViewGroup) viewStub.inflate().requireViewById(R.id.potato_button_share_container);
        this.A01 = viewGroup;
        IgFormField igFormField = (IgFormField) viewGroup.findViewById(R.id.prompt);
        this.A00 = igFormField;
        igFormField.setLabelText("Add a prompt...");
        IgdsButton igdsButton = (IgdsButton) viewGroup.findViewById(R.id.share_button);
        this.A02 = igdsButton;
        ViewOnClickListenerC23248ASj.A00(igdsButton, 10, c8dn, this);
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
