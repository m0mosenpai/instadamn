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

/* renamed from: X.Hcq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39524Hcq extends ReelTabbedFragment {
    public static final String __redex_internal_original_name = "ReelPollVotersTabbedFragment";
    public String A01;
    public String A03;
    public final List A04 = AbstractC166987dD.A1E();
    public String A00 = "";
    public String A02 = "";

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reel_poll_voters_tabs";
    }

    @Override // instagram.features.stories.fragment.userlist.ReelTabbedFragment, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
        ViewPager viewPager = this.mViewPager;
        FixedTabBar fixedTabBar = this.mTabBar;
        List list = this.A04;
        AbstractC25234BEr.A0j(2, childFragmentManager, viewPager, fixedTabBar, list);
        C46080Kac c46080Kac = new C46080Kac(childFragmentManager, viewPager, fixedTabBar, this, list, false, false);
        this.mTabController = c46080Kac;
        c46080Kac.A06(super.A01);
    }

    @Override // X.InterfaceC50521MRz
    public final /* bridge */ /* synthetic */ Fragment ALl(Object obj) {
        EnumC39546HdI enumC39546HdI = (EnumC39546HdI) obj;
        int ordinal = enumC39546HdI.ordinal();
        int i = 1;
        int i2 = 0;
        if (ordinal != 0) {
            i2 = 2;
            if (ordinal != 1) {
                i = 3;
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw AbstractC37303Gc4.A0M(enumC39546HdI, "illegal tab: ", AbstractC166987dD.A1C());
                    }
                }
            }
            return A00(i);
        }
        return A00(i2);
    }

    @Override // X.InterfaceC50521MRz
    public final /* bridge */ /* synthetic */ L5P ANJ(Object obj) {
        String str;
        EnumC39546HdI enumC39546HdI = (EnumC39546HdI) obj;
        int ordinal = enumC39546HdI.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        str = this.A01;
                    } else {
                        throw AbstractC37303Gc4.A0M(enumC39546HdI, "illegal tab: ", AbstractC166987dD.A1C());
                    }
                } else {
                    str = this.A03;
                }
                str.getClass();
            } else {
                str = this.A02;
            }
        } else {
            str = this.A00;
        }
        return AbstractC41372ISz.A01(str);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.Fragment, X.HDB, X.Hcr] */
    private C39525Hcr A00(int i) {
        Bundle A0b = AbstractC166987dD.A0b();
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            A0b.putAll(bundle);
        }
        A0b.putInt("ReelUserListFragment.POLL_OPTION_INDEX", i);
        ?? hdb = new HDB();
        hdb.setArguments(A0b);
        return hdb;
    }

    @Override // instagram.features.stories.fragment.userlist.ReelTabbedFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1550507451);
        super.onCreate(bundle);
        super.A00 = AbstractC31176DnK.A0S(this);
        String A0j = AbstractC31173DnH.A0j(requireArguments(), "ReelUserListFragment.REEL_ID");
        String A0j2 = AbstractC31173DnH.A0j(requireArguments(), "ReelUserListFragment.REEL_ITEM_ID");
        Reel A0I = AbstractC37301Gc2.A0I(super.A00, A0j);
        if (A0I != null) {
            Iterator it = A0I.A0O(super.A00).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C41181vS c41181vS = (C41181vS) it.next();
                if (c41181vS.A0j.equals(A0j2)) {
                    C101394gx A00 = AbstractC140306Wi.A00(c41181vS);
                    A00.getClass();
                    List A01 = AbstractC37865GlK.A01(A00);
                    this.A00 = AbstractC41657Ibp.A02((InterfaceC101384gv) AbstractC166987dD.A16(A01));
                    this.A02 = AbstractC41657Ibp.A02((InterfaceC101384gv) A01.get(1));
                    if (A01.size() > 2) {
                        this.A03 = ((InterfaceC101384gv) A01.get(2)).getText();
                    }
                    if (A01.size() > 3) {
                        this.A01 = ((InterfaceC101384gv) A01.get(3)).getText();
                    }
                }
            }
        }
        List list = this.A04;
        EnumC39546HdI enumC39546HdI = EnumC39546HdI.A02;
        list.add(enumC39546HdI);
        list.add(EnumC39546HdI.A04);
        if (this.A03 != null) {
            list.add(EnumC39546HdI.A05);
        }
        if (this.A01 != null) {
            list.add(EnumC39546HdI.A03);
        }
        super.A01 = enumC39546HdI;
        C0f9.A09(161936968, A02);
    }
}
