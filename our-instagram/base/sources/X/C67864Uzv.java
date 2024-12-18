package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Uzv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67864Uzv extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "EmptyReportBottomSheetFragment";
    public UserSession A00;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "empty_report_bottom_sheet_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-83957582);
        super.onCreate(bundle);
        this.A00 = C023409i.A0A.A06(requireArguments());
        C0f9.A09(-74167630, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1818876928);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.frx_report_empty_fragment, viewGroup, false);
        C0f9.A09(-430267834, A02);
        return inflate;
    }
}
