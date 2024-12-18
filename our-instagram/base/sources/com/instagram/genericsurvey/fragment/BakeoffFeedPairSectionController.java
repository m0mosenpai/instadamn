package com.instagram.genericsurvey.fragment;

import X.AbstractC10360h2;
import X.AbstractC166987dD;
import X.C14360o3;
import X.C38314Gt3;
import X.JG3;
import X.MPJ;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.ui.viewpager.BakeOffViewPager;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class BakeoffFeedPairSectionController implements MPJ {
    public ArrayList A00;
    public final Context A01;
    public final AdBakeOffFragment A02;
    public final AbstractC10360h2 A03;
    public final UserSession A04;
    public FixedTabBar fixedTabBar;
    public BakeOffViewPager fragmentPager;
    public JG3 pagerAdapter;

    public BakeoffFeedPairSectionController(Context context, AbstractC10360h2 abstractC10360h2, UserSession userSession, AdBakeOffFragment adBakeOffFragment) {
        C14360o3.A0B(userSession, 3);
        this.A02 = adBakeOffFragment;
        this.A03 = abstractC10360h2;
        this.A04 = userSession;
        this.A01 = context;
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A00 = A1E;
        this.pagerAdapter = new C38314Gt3(abstractC10360h2, userSession, A1E);
    }

    @Override // X.MPJ
    public final void setMode(int i) {
        BakeOffViewPager bakeOffViewPager = this.fragmentPager;
        if (bakeOffViewPager != null) {
            bakeOffViewPager.A0I(i, true);
        }
        FixedTabBar fixedTabBar = this.fixedTabBar;
        if (fixedTabBar != null) {
            fixedTabBar.A02(i);
        }
    }
}
