package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Bqz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26718Bqz extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "MemorializationBottomSheetFragment";
    public String A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "memorialization_info";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1218798024);
        super.onCreate(bundle);
        this.A00 = AbstractC153636vY.A01(requireArguments(), AbstractC111324zv.A00(1492));
        C0f9.A09(-797782569, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1584629790);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.memorialized_tag_info_bottom_sheet, viewGroup, false);
        TextView A0e = AbstractC166987dD.A0e(inflate, R.id.memorialization_bottom_sheet_title_view);
        if (A0e != null) {
            A0e.setText(getString(2131966163, this.A00));
        }
        TextView A0e2 = AbstractC166987dD.A0e(inflate, R.id.memorialization_bottom_sheet_content_view);
        if (A0e2 != null) {
            AnonymousClass773.A07(new C27280C2f(this, AbstractC25233BEq.A04(this)), A0e2, AbstractC25227BEk.A0v(this, 2131966161), getString(2131966162));
        }
        C0f9.A09(1621109324, A02);
        return inflate;
    }
}
