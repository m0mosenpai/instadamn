package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import java.util.ArrayList;

/* renamed from: X.AgM, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23811AgM implements C8Q5 {
    public final ViewGroup A00;
    public final ImageView A01;
    public final TextView A02;
    public final CircularImageView A03;

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
        View[] viewArr = {this.A01};
        if (A08) {
            C8QC.A05(viewArr, false);
            C8QC.A03(this.A00, false);
        } else {
            C8QC.A05(viewArr, A1R);
            C8QC.A03(this.A00, A1R);
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

    public C23811AgM(ViewStub viewStub, UserSession userSession, C8DN c8dn) {
        String string;
        viewStub.setLayoutResource(R.layout.layout_post_capture_button_video_pog_in_note_selfie);
        View inflate = viewStub.inflate();
        ImageView imageView = (ImageView) inflate.findViewById(R.id.cancel_button);
        if (imageView != null) {
            Context context = inflate.getContext();
            AbstractC166997dE.A19(context, imageView, R.drawable.instagram_arrow_back_24);
            imageView.setColorFilter(context.getColor(AbstractC53242c7.A07(context)));
            C3P9 A0s = AbstractC166987dD.A0s(imageView);
            A0s.A04 = new KKo(3, c8dn, userSession);
            A0s.A00();
        } else {
            imageView = null;
        }
        this.A01 = imageView;
        TextView A0T = AbstractC166997dE.A0T(inflate, R.id.video_pog_in_note_post_capture_education_text_view);
        this.A02 = A0T;
        boolean A0D = C4AC.A0D(userSession);
        Context context2 = inflate.getContext();
        if (A0D) {
            string = context2.getString(2131954591);
        } else {
            string = context2.getString(2131976720);
        }
        A0T.setText(string);
        ViewGroup viewGroup = (ViewGroup) inflate.requireViewById(R.id.video_pog_in_note_post_capture_bottom_layout);
        this.A00 = viewGroup;
        ViewOnClickListenerC23248ASj.A00(viewGroup.findViewById(R.id.trash_button), 11, c8dn, userSession);
        CircularImageView circularImageView = (CircularImageView) viewGroup.findViewById(R.id.video_pog_in_note_confirmation_button);
        this.A03 = circularImageView;
        ViewOnClickListenerC23248ASj.A00(circularImageView, 12, c8dn, userSession);
        circularImageView.setImageTintList(C1QI.A0C(context2, null));
        circularImageView.setBackground(new ColorDrawable(C1QI.A0B(context2, null).getDefaultColor()));
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
