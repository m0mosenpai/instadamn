package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.EaV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32704EaV extends AbstractC32707EaY implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "DirectAddYoursCardGalleryFragment";
    public SpinnerImageView A00;
    public C36152FxQ A01;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_add_yours_card_gallery_fragment";
    }

    @Override // X.AbstractC32707EaY, X.EOJ, X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A0M(2131952443, 2131952444, R.drawable.instagram_camera_outline_96);
        this.A00 = (SpinnerImageView) view.requireViewById(R.id.spinner);
        AbstractC31174DnI.A1E(this, A0E().A03, new GWH(this, 2), 7);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 4929 && i2 == -1) {
            SpinnerImageView spinnerImageView = this.A00;
            if (spinnerImageView == null) {
                C14360o3.A0F("spinner");
                throw C00O.createAndThrow();
            }
            AbstractC31171DnF.A1M(spinnerImageView);
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return A0N();
    }

    @Override // X.AbstractC32707EaY, X.EOJ, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String A0b;
        int A02 = C0f9.A02(270604215);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (A0b = AbstractC31171DnF.A0b(bundle2)) != null) {
            this.A03 = new FKN(AbstractC166997dE.A0q(AbstractC166997dE.A0N(this), 2131952430), new ME3(A0b, this, 34), true);
            this.A01 = new C36152FxQ(AbstractC166987dD.A0r(this.A0S), A0b, null, C37051GUh.A00(this, 5));
            C0f9.A09(2033810642, A02);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A09(-2014748429, A02);
            throw A0g;
        }
    }

    @Override // X.EOJ, androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(191819431);
        super.onPause();
        C36152FxQ c36152FxQ = this.A01;
        if (c36152FxQ == null) {
            C14360o3.A0F("refreshEventHandler");
            throw C00O.createAndThrow();
        }
        AbstractC25651Mw.A00(c36152FxQ.A00).A02(c36152FxQ, C2Io.class);
        C0f9.A09(553937431, A02);
    }

    @Override // X.EOJ, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(786352315);
        super.onResume();
        C36152FxQ c36152FxQ = this.A01;
        if (c36152FxQ == null) {
            C14360o3.A0F("refreshEventHandler");
            throw C00O.createAndThrow();
        }
        AbstractC25651Mw.A00(c36152FxQ.A00).A01(c36152FxQ, C2Io.class);
        C0f9.A09(-1309909955, A02);
    }
}
