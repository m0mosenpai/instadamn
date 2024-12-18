package com.instagram.debug.devoptions.section.localinjection;

import X.AbstractC08380c0;
import X.AbstractC10360h2;
import X.AbstractC13880nE;
import X.AbstractC14490oL;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC18680vv;
import X.AbstractC25235BEs;
import X.AbstractC31176DnK;
import X.AbstractC41372ISz;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C3LO;
import X.InterfaceC09390do;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import X.MPJ;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class InjectMediaToolFragment extends AbstractC59962oe implements InterfaceC60122ou, MPJ {
    public FixedTabBar fixedTabBar;
    public ViewPager fragmentPager;
    public final InterfaceC09390do session$delegate = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "inject_media_tool_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.fixedTabBar = (FixedTabBar) view.requireViewById(R.id.fixed_tabbar_view);
        this.fragmentPager = (ViewPager) view.requireViewById(R.id.inject_media_pager);
        initTabBarAndViewPager();
    }

    private final void initTabBarAndViewPager() {
        FixedTabBar fixedTabBar = this.fixedTabBar;
        if (fixedTabBar != null) {
            fixedTabBar.A06 = this;
            List injectionGroups = getInjectionGroups(requireContext());
            ArrayList A0q = AbstractC167017dG.A0q(injectionGroups);
            Iterator it = injectionGroups.iterator();
            while (it.hasNext()) {
                A0q.add(AbstractC41372ISz.A01(((LocalMediaInjectionConstants.InjectionGroup) it.next()).name));
            }
            FixedTabBar fixedTabBar2 = this.fixedTabBar;
            if (fixedTabBar2 != null) {
                fixedTabBar2.setTabs(A0q);
                FixedTabBar fixedTabBar3 = this.fixedTabBar;
                if (fixedTabBar3 != null) {
                    fixedTabBar3.A02(0);
                    if (injectionGroups.size() == 1) {
                        FixedTabBar fixedTabBar4 = this.fixedTabBar;
                        if (fixedTabBar4 != null) {
                            fixedTabBar4.setVisibility(8);
                        }
                    }
                    AbstractC10360h2 childFragmentManager = getChildFragmentManager();
                    C14360o3.A07(childFragmentManager);
                    InjectMediaToolFragmentAdapter injectMediaToolFragmentAdapter = new InjectMediaToolFragmentAdapter(childFragmentManager, AbstractC166987dD.A0r(this.session$delegate), injectionGroups);
                    ViewPager viewPager = this.fragmentPager;
                    if (viewPager != null) {
                        injectMediaToolFragmentAdapter.mContainer = viewPager;
                        viewPager.setAdapter(injectMediaToolFragmentAdapter);
                        ViewPager viewPager2 = this.fragmentPager;
                        if (viewPager2 != null) {
                            FixedTabBar fixedTabBar5 = this.fixedTabBar;
                            if (fixedTabBar5 != null) {
                                viewPager2.A0J(fixedTabBar5);
                                ViewPager viewPager3 = this.fragmentPager;
                                if (viewPager3 != null) {
                                    viewPager3.A0J(new AbstractC08380c0() { // from class: com.instagram.debug.devoptions.section.localinjection.InjectMediaToolFragment$initTabBarAndViewPager$1
                                        @Override // X.AbstractC08380c0, X.InterfaceC021908q
                                        public void onPageSelected(int i) {
                                            AbstractC13880nE.A0O(InjectMediaToolFragment.this.mView);
                                            FixedTabBar fixedTabBar6 = InjectMediaToolFragment.this.fixedTabBar;
                                            if (fixedTabBar6 == null) {
                                                C14360o3.A0F("fixedTabBar");
                                                throw C00O.createAndThrow();
                                            }
                                            fixedTabBar6.A02(i);
                                        }
                                    });
                                    return;
                                }
                            }
                        }
                    }
                    C14360o3.A0F("fragmentPager");
                    throw C00O.createAndThrow();
                }
            }
        }
        C14360o3.A0F("fixedTabBar");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }

    @Override // X.MPJ
    public void setMode(int i) {
        String str;
        ViewPager viewPager = this.fragmentPager;
        if (viewPager == null) {
            str = "fragmentPager";
        } else {
            viewPager.setCurrentItem(i);
            AbstractC13880nE.A0O(this.mView);
            FixedTabBar fixedTabBar = this.fixedTabBar;
            if (fixedTabBar == null) {
                str = "fixedTabBar";
            } else {
                fixedTabBar.A02(i);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final List getInjectionGroups(Context context) {
        if (AbstractC14490oL.A09(context)) {
            return AbstractC166987dD.A1J(new LocalMediaInjectionConstants.InjectionGroup("Ads", AbstractC166987dD.A1J(LocalMediaInjectionConstants.InjectionContentType.THREADS_ADS)));
        }
        return AbstractC16960so.A1Q(new LocalMediaInjectionConstants.InjectionGroup("Ads", AbstractC16960so.A1Q(LocalMediaInjectionConstants.InjectionContentType.FEED_ADS, LocalMediaInjectionConstants.InjectionContentType.STORIES_ADS, LocalMediaInjectionConstants.InjectionContentType.REELS_ADS)), new LocalMediaInjectionConstants.InjectionGroup("Organic", AbstractC166987dD.A1J(LocalMediaInjectionConstants.InjectionContentType.REELS_ORGANIC)), new LocalMediaInjectionConstants.InjectionGroup("Netego", AbstractC16960so.A1Q(LocalMediaInjectionConstants.InjectionContentType.FEED_NETEGO, LocalMediaInjectionConstants.InjectionContentType.STORIES_NETEGO)));
    }

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.setTitle(getString(2131958170));
        C3LO c3lo = new C3LO();
        c3lo.A0K = getString(2131958173);
        AbstractC31176DnK.A1B(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.localinjection.InjectMediaToolFragment$configureActionBar$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(947289684);
                Activity rootActivity = InjectMediaToolFragment.this.getRootActivity();
                if (rootActivity != null) {
                    rootActivity.onBackPressed();
                }
                C0f9.A0C(-203029542, A05);
            }
        }, c3lo, interfaceC56362iU);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1542267692);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.media_injection_tool, viewGroup, false);
        C0f9.A09(-239093580, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe
    public UserSession getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }
}
