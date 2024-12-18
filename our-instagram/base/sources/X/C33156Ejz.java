package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Ejz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33156Ejz extends AbstractC32289EKc {
    public static final String __redex_internal_original_name = "DataDownloadConfirmFragment";
    public String A00;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "data_download_confirm";
    }

    @Override // X.AbstractC32289EKc, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1781648070);
        super.onCreate(bundle);
        this.A00 = requireArguments().getString("email");
        C0f9.A09(194864849, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(759602529);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.data_download_confirm_fragment);
        AbstractC166997dE.A0T(A0A, R.id.header_text).setText(2131957499);
        int i = 2131957497;
        if (AbstractC31178DnM.A1X(C06090Tz.A05, super.A00, 36317796778382946L)) {
            i = 2131957498;
        }
        AbstractC31176DnK.A1F(A0A, AbstractC31174DnI.A0w(this, this.A00, i), R.id.body_text);
        AbstractC31173DnH.A0I(A0A, R.id.header_icon).setImageDrawable(AbstractC166997dE.A0N(this).getDrawable(R.drawable.checkmark_icon, null));
        ViewOnClickListenerC35689FpO.A01(A0A.requireViewById(R.id.download_request_button), 60, this);
        C0f9.A09(1056499004, A02);
        return A0A;
    }
}
