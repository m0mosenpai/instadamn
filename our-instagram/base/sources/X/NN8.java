package X;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NN8 extends AbstractC52139N5o {
    public static final String __redex_internal_original_name = "ClipsProfileCropFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_share_sheet_profile_crop";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.AbstractC52139N5o, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View requireViewById = view.requireViewById(R.id.edit_feed_preview_crop_helper_text);
        TextView textView = (TextView) requireViewById;
        textView.setText(2131956888);
        textView.setContentDescription(getString(2131956889));
        C14360o3.A07(requireViewById);
        AbstractC56932jR.A06(textView, 500L);
    }

    public NN8() {
        C0YZ A1D = AbstractC25225BEi.A1D(C50966MfZ.class);
        this.A01 = AbstractC25225BEi.A0a(C57525Pfz.A00(this, 30), C57525Pfz.A00(this, 31), MSW.A1G(this, null, 30), A1D);
        this.A00 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C35197Ffp A00 = C35197Ffp.A00(interfaceC56362iU);
        A00.A02 = AbstractC166997dE.A0N(this).getString(2131955396);
        AbstractC56952jT.A01(C31722DwR.A00(ViewOnClickListenerC55466OkL.A01(this, 7), interfaceC56362iU, A00));
    }
}
