package com.instagram.debug.devoptions.search.bootstrap;

import X.AbstractC13900nG;
import X.AbstractC31172DnG;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31364DqT;
import X.AbstractC31402Dr6;
import X.AbstractC65702TsY;
import X.AnonymousClass001;
import X.C0f9;
import X.C127165ou;
import X.C140966Yy;
import X.C195218kN;
import X.C1I4;
import X.C31368DqX;
import X.C50H;
import X.C53Z;
import X.C9GR;
import X.GZS;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.search.bootstrap.BootstrapUsersAdapter;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public class BootstrapUsersListFragment extends C53Z implements InterfaceC60122ou {
    public static final String EXTRA_SURFACE_NAME = "extra_surface_name";
    public BootstrapUsersAdapter mAdapter;
    public RecyclerView mRecyclerView;
    public C127165ou mSurface;
    public final BootstrapUsersAdapter.Delegate mAdapterDelegate = new BootstrapUsersAdapter.Delegate() { // from class: com.instagram.debug.devoptions.search.bootstrap.BootstrapUsersListFragment.1
        @Override // com.instagram.debug.devoptions.search.bootstrap.BootstrapUsersAdapter.Delegate
        public void onUserClick(BootstrapUserInfo bootstrapUserInfo) {
            UserSession session = BootstrapUsersListFragment.this.getSession();
            C31368DqX.A01(new C140966Yy(BootstrapUsersListFragment.this.requireActivity(), BootstrapUsersListFragment.this.getSession()), session, AbstractC31364DqT.A03().A01, AbstractC31402Dr6.A01(session, bootstrapUserInfo.user.getId(), "developer_options", "search_debug_settings_view_bootstrap_users"));
        }

        @Override // com.instagram.debug.devoptions.search.bootstrap.BootstrapUsersAdapter.Delegate
        public void onUserLongClick(BootstrapUserInfo bootstrapUserInfo) {
            String id = bootstrapUserInfo.user.getId();
            AbstractC13900nG.A00(BootstrapUsersListFragment.this.requireActivity(), id);
            C9GR.A09(BootstrapUsersListFragment.this.getActivity(), AnonymousClass001.A0R("Copied to clipboard: ", id));
        }
    };
    public final GZS mSearchBarDelegate = new GZS() { // from class: com.instagram.debug.devoptions.search.bootstrap.BootstrapUsersListFragment.2
        @Override // X.GZS
        public void registerTextViewLogging(TextView textView) {
        }

        @Override // X.GZS
        public void searchTextChanged(String str) {
            BootstrapUsersListFragment.this.mAdapter.applyFilterText(str);
        }
    };

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "search_debug_settings_view_bootstrap_users";
    }

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31175DnJ.A1I(interfaceC56362iU, this.mSurface.A01);
    }

    private List getUserInfos() {
        C195218kN A00 = C195218kN.A00(getSession());
        return BootstrapUserInfo.generateInfosForSurface(A00.A02.A05, this.mSurface, new ArrayList(A00.A01.A05.values()));
    }

    private void setSurface() {
        String string = requireArguments().getString(EXTRA_SURFACE_NAME);
        string.getClass();
        Iterator A0n = AbstractC65702TsY.A0n(C195218kN.A00(getSession()).A01.A05.values());
        while (true) {
            if (!A0n.hasNext()) {
                break;
            }
            C127165ou c127165ou = (C127165ou) A0n.next();
            if (c127165ou.A01.equals(string)) {
                this.mSurface = c127165ou;
                break;
            }
        }
        this.mSurface.getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1573638851);
        super.onCreate(bundle);
        setSurface();
        BootstrapUsersAdapter bootstrapUsersAdapter = new BootstrapUsersAdapter(this, this.mAdapterDelegate, this.mSurface);
        this.mAdapter = bootstrapUsersAdapter;
        bootstrapUsersAdapter.setUnfilteredUsers(getUserInfos());
        C0f9.A09(-1812582695, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-836803540);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.bootstrap_searchable_list_fragment);
        final TypeaheadHeader typeaheadHeader = (TypeaheadHeader) A0A.requireViewById(R.id.search_bar);
        typeaheadHeader.setDelegate(this.mSearchBarDelegate);
        typeaheadHeader.A03("Search...");
        typeaheadHeader.setAllowTextSelection(true);
        RecyclerView A0F = AbstractC31176DnK.A0F(A0A);
        this.mRecyclerView = A0F;
        A0F.A14(new C1I4() { // from class: com.instagram.debug.devoptions.search.bootstrap.BootstrapUsersListFragment.3
            @Override // X.C1I4
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                int A03 = C0f9.A03(1891404798);
                if (i == 1) {
                    typeaheadHeader.A01();
                }
                C0f9.A0A(499571422, A03);
            }
        });
        C0f9.A09(3817614, A02);
        return A0A;
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
