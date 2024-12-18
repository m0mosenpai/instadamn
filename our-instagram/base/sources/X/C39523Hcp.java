package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import instagram.features.stories.fragment.userlist.ReelTabbedFragment;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Hcp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39523Hcp extends ReelTabbedFragment {
    public static final String __redex_internal_original_name = "ReelQuickReactorsTabbedFragment";
    public List A00;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reel_reactor_tabs";
    }

    @Override // instagram.features.stories.fragment.userlist.ReelTabbedFragment, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A00.getClass();
        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
        ViewPager viewPager = this.mViewPager;
        FixedTabBar fixedTabBar = this.mTabBar;
        List list = this.A00;
        AbstractC25234BEr.A0j(2, childFragmentManager, viewPager, fixedTabBar, list);
        C46080Kac c46080Kac = new C46080Kac(childFragmentManager, viewPager, fixedTabBar, this, list, false, false);
        this.mTabController = c46080Kac;
        c46080Kac.A06(this.A01);
    }

    @Override // X.InterfaceC50521MRz
    public final /* bridge */ /* synthetic */ Fragment ALl(Object obj) {
        JL7 jl7 = (JL7) obj;
        Bundle A0b = AbstractC166987dD.A0b();
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            A0b.putAll(bundle);
        }
        A0b.putString("ReelQuickReactorsListFragment.ARGUMENTS_REACTION", jl7.getValue());
        A0b.putString("ReelQuickReactorsListFragment.ARGUMENTS_REACTION_LABEL", jl7.getName());
        HDB hdb = new HDB();
        hdb.setArguments(A0b);
        return hdb;
    }

    @Override // X.InterfaceC50521MRz
    public final /* bridge */ /* synthetic */ L5P ANJ(Object obj) {
        return AbstractC41372ISz.A01(((JL7) obj).getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.JL7] */
    @Override // instagram.features.stories.fragment.userlist.ReelTabbedFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        List list;
        int A02 = C0f9.A02(-1923365524);
        super.onCreate(bundle);
        super.A00 = AbstractC31176DnK.A0S(this);
        String string = requireArguments().getString("ReelUserListFragment.REEL_ID");
        String string2 = requireArguments().getString("ReelUserListFragment.REEL_ITEM_ID");
        String string3 = requireArguments().getString("ReelUserListFragment.REEL_REACTION");
        Reel A0I = AbstractC37301Gc2.A0I(super.A00, string);
        if (A0I != null) {
            Iterator it = A0I.A0O(super.A00).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C41181vS c41181vS = (C41181vS) it.next();
                if (c41181vS.A0j.equals(string2)) {
                    if (c41181vS.A0e == EnumC41231vY.A09) {
                        C38321qM c38321qM = c41181vS.A0b;
                        c38321qM.getClass();
                        list = c38321qM.A0C.Bkk();
                    } else {
                        list = null;
                    }
                    this.A00 = list;
                    list.getClass();
                    List<??> list2 = this.A00;
                    if (string3 != null) {
                        for (Object A16 : list2) {
                            if (A16.getValue().equals(string3)) {
                            }
                        }
                    } else {
                        A16 = AbstractC166987dD.A16(list2);
                    }
                    this.A01 = A16;
                    break;
                }
            }
        }
        C0f9.A09(682753033, A02);
    }
}
