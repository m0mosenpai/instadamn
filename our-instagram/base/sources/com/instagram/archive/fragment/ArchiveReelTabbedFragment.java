package com.instagram.archive.fragment;

import X.AbstractC10360h2;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25234BEr;
import X.AbstractC25651Mw;
import X.AbstractC31172DnG;
import X.AbstractC37303Gc4;
import X.AbstractC55178Odj;
import X.AbstractC59962oe;
import X.C05F;
import X.C0f9;
import X.C18U;
import X.C25671My;
import X.C46080Kac;
import X.C53Z;
import X.C55979OtC;
import X.C56035Ou7;
import X.EnumC53169NfQ;
import X.InterfaceC11380iw;
import X.InterfaceC41501vz;
import X.InterfaceC50521MRz;
import X.InterfaceC60072op;
import X.L5P;
import X.LYD;
import X.U8T;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class ArchiveReelTabbedFragment extends C53Z implements InterfaceC60072op, InterfaceC50521MRz {
    public Fragment A00;
    public Fragment A01;
    public AbstractC59962oe A03;
    public AbstractC59962oe A04;
    public AbstractC59962oe A05;
    public AbstractC59962oe A06;
    public InterfaceC11380iw A07;
    public List A08;
    public Map A09;
    public FixedTabBar mTabBar;
    public C46080Kac mTabController;
    public ViewPager mViewPager;
    public final InterfaceC41501vz A0A = C56035Ou7.A00(this, 4);
    public final InterfaceC41501vz A0B = C56035Ou7.A00(this, 5);
    public EnumC53169NfQ A02 = EnumC53169NfQ.A03;

    @Override // X.AbstractC59962oe
    public final boolean isContainerFragment() {
        return true;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        EnumC53169NfQ enumC53169NfQ = (EnumC53169NfQ) requireArguments().getSerializable("archive_stories_tab");
        if (enumC53169NfQ != null) {
            this.A02 = enumC53169NfQ;
        }
        FixedTabBar fixedTabBar = (FixedTabBar) view.requireViewById(R.id.fixed_tabbar_view);
        this.mTabBar = fixedTabBar;
        fixedTabBar.A08 = true;
        ViewPager viewPager = (ViewPager) view.requireViewById(R.id.view_pager);
        this.mViewPager = viewPager;
        viewPager.setOffscreenPageLimit(2);
        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
        ViewPager viewPager2 = this.mViewPager;
        FixedTabBar fixedTabBar2 = this.mTabBar;
        List list = this.A08;
        AbstractC25234BEr.A0j(2, childFragmentManager, viewPager2, fixedTabBar2, list);
        C46080Kac c46080Kac = new C46080Kac(childFragmentManager, viewPager2, fixedTabBar2, this, list, false, false);
        this.mTabController = c46080Kac;
        c46080Kac.A06(this.A02);
        C25671My A00 = AbstractC25651Mw.A00(getSession());
        A00.A01(this.A0A, C55979OtC.class);
        A00.A01(this.A0B, LYD.class);
    }

    @Override // X.InterfaceC50521MRz
    public final /* bridge */ /* synthetic */ Fragment ALl(Object obj) {
        EnumC53169NfQ enumC53169NfQ = (EnumC53169NfQ) obj;
        switch (enumC53169NfQ.ordinal()) {
            case 0:
                return this.A00;
            case 1:
                return this.A03;
            case 2:
                return this.A05;
            case 3:
                return this.A06;
            case 4:
                return this.A01;
            case 5:
                return this.A04;
            default:
                throw AbstractC37303Gc4.A0M(enumC53169NfQ, "illegal tab: ", AbstractC166987dD.A1C());
        }
    }

    @Override // X.InterfaceC50521MRz
    public final /* bridge */ /* synthetic */ L5P ANJ(Object obj) {
        Object obj2 = this.A09.get(obj);
        obj2.getClass();
        return (L5P) obj2;
    }

    @Override // X.InterfaceC50521MRz
    public final /* bridge */ /* synthetic */ void Dru(Object obj) {
        InterfaceC11380iw interfaceC11380iw;
        EnumC53169NfQ enumC53169NfQ = (EnumC53169NfQ) obj;
        this.A02 = enumC53169NfQ;
        switch (enumC53169NfQ.ordinal()) {
            case 0:
                interfaceC11380iw = (InterfaceC11380iw) this.A00;
                break;
            case 1:
                interfaceC11380iw = this.A03;
                break;
            case 2:
                interfaceC11380iw = this.A05;
                break;
            case 3:
                interfaceC11380iw = this.A06;
                break;
            case 4:
                interfaceC11380iw = (InterfaceC11380iw) this.A01;
                break;
            case 5:
                interfaceC11380iw = this.A04;
                break;
            default:
                return;
        }
        this.A07 = interfaceC11380iw;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A07.getModuleName();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return ((InterfaceC60072op) this.mTabController.A02()).onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(926378214);
        super.onCreate(bundle);
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A08 = A1E;
        this.A09 = AbstractC166987dD.A1G();
        EnumC53169NfQ enumC53169NfQ = EnumC53169NfQ.A03;
        A1E.add(enumC53169NfQ);
        UserSession session = getSession();
        if (C18U.A06(AbstractC166997dE.A0U(session), session, 36328925039771513L)) {
            List list = this.A08;
            EnumC53169NfQ enumC53169NfQ2 = EnumC53169NfQ.A04;
            list.add(enumC53169NfQ2);
            this.A09.put(enumC53169NfQ2, new L5P(null, null, null, null, null, -1, -1, -1, R.drawable.instagram_story_highlight_pano_outline_24, R.drawable.instagram_story_highlight_pano_filled_24, -1, -1, -1, -1, -1, -1));
        }
        List list2 = this.A08;
        EnumC53169NfQ enumC53169NfQ3 = EnumC53169NfQ.A02;
        list2.add(enumC53169NfQ3);
        List list3 = this.A08;
        EnumC53169NfQ enumC53169NfQ4 = EnumC53169NfQ.A05;
        list3.add(enumC53169NfQ4);
        this.A09.put(enumC53169NfQ, new L5P(null, null, null, null, null, -1, -1, -1, R.drawable.instagram_story_pano_outline_24, R.drawable.instagram_story_pano_filled_24, -1, -1, -1, -1, -1, -1));
        this.A09.put(enumC53169NfQ3, new L5P(new U8T(requireContext(), C05F.A01), new U8T(requireContext(), C05F.A00), null, null, null, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1));
        this.A09.put(enumC53169NfQ4, new L5P(null, null, null, null, null, -1, -1, -1, R.drawable.instagram_location_map_pano_outline_24, R.drawable.instagram_location_map_pano_filled_24, -1, -1, -1, -1, -1, -1));
        getSession();
        this.A00 = AbstractC55178Odj.A00(requireArguments(), getSession());
        Bundle requireArguments = requireArguments();
        ArchiveReelCalendarFragment archiveReelCalendarFragment = new ArchiveReelCalendarFragment();
        archiveReelCalendarFragment.setArguments(requireArguments);
        this.A03 = archiveReelCalendarFragment;
        Bundle requireArguments2 = requireArguments();
        ArchiveReelMapFragment archiveReelMapFragment = new ArchiveReelMapFragment();
        archiveReelMapFragment.setArguments(requireArguments2);
        this.A05 = archiveReelMapFragment;
        Bundle requireArguments3 = requireArguments();
        C53Z c53z = new C53Z();
        c53z.setArguments(requireArguments3);
        this.A06 = c53z;
        Bundle requireArguments4 = requireArguments();
        ArchiveReelHighlightsFragment archiveReelHighlightsFragment = new ArchiveReelHighlightsFragment();
        archiveReelHighlightsFragment.setArguments(requireArguments4);
        this.A04 = archiveReelHighlightsFragment;
        Bundle requireArguments5 = requireArguments();
        ArchiveReelRecycleBinFragment archiveReelRecycleBinFragment = new ArchiveReelRecycleBinFragment();
        archiveReelRecycleBinFragment.setArguments(requireArguments5);
        this.A01 = archiveReelRecycleBinFragment;
        this.A07 = (InterfaceC11380iw) this.A00;
        C0f9.A09(440777051, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1072015026);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_archive_reel_tabbed_fragment);
        C0f9.A09(-1865216525, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-635290848);
        super.onDestroyView();
        C25671My A00 = AbstractC25651Mw.A00(getSession());
        A00.A02(this.A0A, C55979OtC.class);
        A00.A02(this.A0B, LYD.class);
        ArchiveReelTabbedFragmentLifecycleUtil.cleanupReferences(this);
        C0f9.A09(-527094096, A02);
    }
}
