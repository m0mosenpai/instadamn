package com.instagram.debug.devoptions.search.bootstrap;

import X.AbstractC13900nG;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AnonymousClass001;
import X.C0f9;
import X.C127165ou;
import X.C140966Yy;
import X.C195218kN;
import X.C50H;
import X.C53Z;
import X.C9GR;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import X.MSZ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.debug.devoptions.search.bootstrap.BootstrapSurfaceAdapter;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public class BootstrapSurfaceListFragment extends C53Z implements InterfaceC60122ou {
    public BootstrapSurfaceAdapter mAdapter;
    public final BootstrapSurfaceAdapter.Delegate mAdapterDelegate = new BootstrapSurfaceAdapter.Delegate() { // from class: com.instagram.debug.devoptions.search.bootstrap.BootstrapSurfaceListFragment.1
        @Override // com.instagram.debug.devoptions.search.bootstrap.BootstrapSurfaceAdapter.Delegate
        public void onSurfaceClick(C127165ou c127165ou) {
            Bundle bundle = new Bundle();
            bundle.putString(BootstrapUsersListFragment.EXTRA_SURFACE_NAME, c127165ou.A01);
            C140966Yy c140966Yy = new C140966Yy(BootstrapSurfaceListFragment.this.requireActivity(), BootstrapSurfaceListFragment.this.getSession());
            c140966Yy.A0B(bundle, new BootstrapUsersListFragment());
            c140966Yy.A04();
        }

        @Override // com.instagram.debug.devoptions.search.bootstrap.BootstrapSurfaceAdapter.Delegate
        public void onSurfaceLongClick(C127165ou c127165ou) {
            String str = c127165ou.A01;
            AbstractC13900nG.A00(BootstrapSurfaceListFragment.this.requireActivity(), str);
            C9GR.A09(BootstrapSurfaceListFragment.this.getActivity(), AnonymousClass001.A0R("Copied to clipboard: ", str));
        }
    };
    public RecyclerView mRecyclerView;

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "search_debug_settings_view_bootstrap_surfaces";
    }

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31175DnJ.A1I(interfaceC56362iU, getString(2131958390));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1634200164);
        super.onCreate(bundle);
        C195218kN.A00(getSession()).A05();
        BootstrapSurfaceAdapter bootstrapSurfaceAdapter = new BootstrapSurfaceAdapter(this.mAdapterDelegate);
        this.mAdapter = bootstrapSurfaceAdapter;
        bootstrapSurfaceAdapter.setSurfaces(new ArrayList(C195218kN.A00(getSession()).A01.A05.values()));
        C0f9.A09(-290837616, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-706362446);
        float f = RecyclerView.A1E;
        RecyclerView recyclerView = new RecyclerView(requireActivity());
        this.mRecyclerView = recyclerView;
        MSZ.A13(recyclerView);
        RecyclerView recyclerView2 = this.mRecyclerView;
        C0f9.A09(-1493568180, A02);
        return recyclerView2;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AbstractC31174DnI.A15(getActivity(), this.mRecyclerView);
        C50H c50h = new C50H(requireActivity(), 1);
        c50h.A01(requireActivity().getDrawable(R.drawable.drawable_divider));
        this.mRecyclerView.A10(c50h);
        this.mRecyclerView.setAdapter(this.mAdapter);
    }
}
