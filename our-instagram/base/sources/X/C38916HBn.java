package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.HBn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38916HBn extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "WhatsAppBackedProfileBottomSheetFragment";
    public String A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instagram_profile_visit";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0S = AbstractC166997dE.A0S(view, R.id.whatsapp_backed_profile_bottom_sheet);
        AbstractC31178DnM.A0C(A0S).setText(AbstractC31174DnI.A0w(this, this.A00, 2131977073));
        AbstractC167007dF.A0N(A0S, R.id.body).setText(AbstractC31174DnI.A0w(this, this.A00, 2131977071));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(2008075270);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("user_name");
        } else {
            str = null;
        }
        this.A00 = str;
        C0f9.A09(-1950823827, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1873649364);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.whatsapp_backed_profile_bottom_sheet, viewGroup, false);
        C0f9.A09(396595498, A02);
        return inflate;
    }
}
