package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes9.dex */
public final class N43 extends AbstractC72473Mu {
    public Q5b A00;
    public IgTextView A01;
    public IgView A02;
    public IgImageView A03;
    public String A04 = "";
    public boolean A05;
    public C52573NNt A06;
    public boolean A07;

    public final void A0M(Bundle bundle, Fragment fragment) {
        C06C.A00(AbstractC31178DnM.A06("submitted", true), this, "request_key");
        int A02 = MSY.A02(this.A01);
        IgImageView igImageView = this.A03;
        if (igImageView != null) {
            igImageView.setVisibility(A02);
        }
        IgView igView = this.A02;
        if (igView != null) {
            igView.setVisibility(A02);
        }
        this.A05 = true;
        fragment.setArguments(bundle);
        C14240no A0F = AbstractC43593JPy.A0F(this);
        A0F.A0D(fragment, "lead_ads_multi_step_form_bottom_sheet_dialog", R.id.bottom_sheet_container_view);
        A0F.A00();
    }

    @Override // X.C0SG, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C14360o3.A0B(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        C06C.A00(AbstractC31178DnM.A06("is_bottom_sheet_open", false), this, "request_key");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        IgTextView A0Y = AbstractC31172DnG.A0Y(view, R.id.title_text_view);
        this.A01 = A0Y;
        if (A0Y != null) {
            A0Y.setText(this.A04);
        }
        IgImageView A0a = AbstractC31172DnG.A0a(view, R.id.bottom_sheet_start_nav_button_icon);
        this.A03 = A0a;
        if (A0a != null) {
            ViewOnClickListenerC55455Ok9.A01(A0a, 57, this);
        }
        this.A02 = (IgView) view.findViewById(R.id.bottom_sheet_nav_bar_divider);
        if (this.A07) {
            int A02 = MSY.A02(this.A01);
            IgImageView igImageView = this.A03;
            if (igImageView != null) {
                igImageView.setVisibility(A02);
            }
            IgView igView = this.A02;
            if (igView != null) {
                igView.setVisibility(A02);
            }
            this.A05 = true;
        }
    }

    public static final void A01(N43 n43) {
        if (n43.A05) {
            Q5b q5b = n43.A00;
            if (q5b == null) {
                C14360o3.A0F("dialog");
                throw C00O.createAndThrow();
            }
            q5b.dismiss();
            return;
        }
        C52573NNt c52573NNt = n43.A06;
        if (c52573NNt != null) {
            c52573NNt.onBackPressed();
        }
    }

    @Override // X.C0SG
    public final Dialog A0F(Bundle bundle) {
        Q5b q5b = new Q5b(requireContext(), R.style.FormExtensionBottomSheetDialog);
        this.A00 = q5b;
        q5b.setOnShowListener(new DialogInterfaceOnShowListenerC55325Ogn(this, 2));
        Q5b q5b2 = this.A00;
        if (q5b2 == null) {
            C14360o3.A0F("dialog");
            throw C00O.createAndThrow();
        }
        return q5b2;
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(82418656);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        boolean z = true;
        if (bundle2 != null) {
            bundle2.putBoolean("is_form_extension", true);
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 == null || !bundle3.getBoolean("submitted", false)) {
            z = false;
        }
        this.A07 = z;
        Bundle bundle4 = this.mArguments;
        if (bundle4 == null || (str = bundle4.getString("cta_label")) == null) {
            str = "";
        }
        this.A04 = str;
        if (this.A07) {
            A0M(this.mArguments, new C52576NNw());
        } else {
            C52573NNt c52573NNt = new C52573NNt();
            ((AbstractC52562NNi) c52573NNt).A02 = this;
            c52573NNt.setArguments(this.mArguments);
            C14240no A0F = AbstractC43593JPy.A0F(this);
            A0F.A0D(c52573NNt, "lead_ads_multi_step_form_bottom_sheet_dialog", R.id.bottom_sheet_container_view);
            A0F.A00();
            this.A06 = c52573NNt;
        }
        C0f9.A09(78732296, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-827053627);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_ads_fragment_multi_step_bottom_sheet, viewGroup, false);
        C0f9.A09(290387812, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1189019475);
        super.onDestroy();
        this.A06 = null;
        C0f9.A09(-1038198465, A02);
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1383737110);
        super.onDestroyView();
        this.A03 = null;
        this.A01 = null;
        this.A02 = null;
        C0f9.A09(477369401, A02);
    }
}
