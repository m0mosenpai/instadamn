package com.instagram.shopping.fragment.postpurchase;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC25226BEj;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.C0f9;
import X.C14360o3;
import X.C31875Dzh;
import X.InterfaceC09390do;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class ProductSharePickerFragment extends AbstractC59962oe {
    public C31875Dzh A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public RecyclerView recyclerView;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instagram_shopping_product_share_picker";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0F = AbstractC31176DnK.A0F(view);
        this.recyclerView = A0F;
        if (A0F != null) {
            AbstractC31177DnL.A17(this, A0F);
        }
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.A00);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C31875Dzh c31875Dzh;
        int A02 = C0f9.A02(1949537405);
        super.onCreate(bundle);
        ArrayList parcelableArrayList = requireArguments().getParcelableArrayList(AbstractC111324zv.A00(2889));
        if (parcelableArrayList != null) {
            c31875Dzh = new C31875Dzh(this, this, parcelableArrayList);
        } else {
            c31875Dzh = null;
        }
        this.A00 = c31875Dzh;
        C0f9.A09(-697176260, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2117877323);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_recyclerview, false);
        C0f9.A09(446941423, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1290799593);
        super.onDestroyView();
        this.recyclerView = null;
        C0f9.A09(-1930132723, A02);
    }
}
