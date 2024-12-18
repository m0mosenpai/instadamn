package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.EIe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32245EIe extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ActionSheetFragment";
    public View A00;
    public TextView A01;
    public boolean A02;
    public RecyclerView A03;
    public AbstractC18680vv A04;
    public final C31889Dzv A05 = new C31889Dzv();

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return MSV.A00(897);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = view;
        this.A03 = AbstractC31176DnK.A0F(view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), 1, false);
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.A05);
            RecyclerView recyclerView2 = this.A03;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(linearLayoutManager);
                return;
            }
        }
        C14360o3.A0F("recyclerView");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A04;
    }

    @Override // X.AbstractC59962oe
    public final EnumC60772q1 getStatusBarType() {
        return EnumC60772q1.A04;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-697543618);
        super.onCreate(bundle);
        this.A04 = AbstractC31176DnK.A0R(this);
        this.A02 = true;
        C0f9.A09(-1373500174, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2068645825);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.action_sheet_fragment, viewGroup, false);
        C0f9.A09(1794132875, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(366275168);
        super.onPause();
        this.A02 = false;
        C0f9.A09(-1000883304, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(285494348);
        super.onResume();
        C0f9.A09(-891348585, A02);
    }
}
