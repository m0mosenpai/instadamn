package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.google.android.material.tabs.TabLayout;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction;
import com.instagram.direct.reactions.tabbedreaction.model.DirectCustomReactionTabModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes8.dex */
public final class KWN extends KDO {
    public static final String __redex_internal_original_name = "DirectTabbedEmojiViewPagerFragment";
    public TabLayout A01;
    public ViewPager2 A03;
    public C44806JsY A04;
    public List A05;
    public final InterfaceC09390do A06;
    public int A00 = 1;
    public List A02 = C16930sl.A00;

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        Long l;
        C14360o3.A0B(view, 0);
        List list = this.A02;
        InterfaceC09390do interfaceC09390do = this.A0A;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C3o9 c3o9 = super.A05;
        String str4 = null;
        if (c3o9 != null) {
            str = JRE.A07(c3o9);
        } else {
            str = null;
        }
        String str5 = this.A07;
        String str6 = super.A06;
        long j = super.A02;
        C2EY c2ey = super.A04;
        if (c2ey != null) {
            this.A04 = new C44806JsY(this, A0r, super.A03, c2ey, str, str5, str6, list, this.A00, j);
            ViewPager2 viewPager2 = (ViewPager2) view.requireViewById(R.id.view_pager);
            viewPager2.setOffscreenPageLimit(this.A00);
            C44806JsY c44806JsY = this.A04;
            if (c44806JsY == null) {
                str2 = "viewPagerAdapter";
            } else {
                viewPager2.setAdapter(c44806JsY);
                this.A03 = viewPager2;
                TabLayout tabLayout = (TabLayout) view.requireViewById(R.id.tab_layout);
                this.A01 = tabLayout;
                str2 = "tabLayout";
                if (tabLayout != null) {
                    tabLayout.A0C = view.getContext().getColor(AbstractC31174DnI.A05(this));
                    TabLayout tabLayout2 = this.A01;
                    if (tabLayout2 != null) {
                        ViewPager2 viewPager22 = this.A03;
                        if (viewPager22 == null) {
                            str2 = "viewPager";
                        } else {
                            new JZX(viewPager22, tabLayout2, LWA.A00).A00();
                            TabLayout tabLayout3 = this.A01;
                            if (tabLayout3 != null) {
                                AbstractC154366wl.A00(tabLayout3, new GI3(0, view, this), 0, AbstractC13880nE.A0A(AbstractC166997dE.A0L(tabLayout3)));
                                TabLayout tabLayout4 = this.A01;
                                if (tabLayout4 != null) {
                                    tabLayout4.A0D(new C35868Fsi(this, 2));
                                    if (super.A01 == 29) {
                                        C142846ck A0V = AbstractC31176DnK.A0V(interfaceC09390do);
                                        int i = super.A00;
                                        C3o9 c3o92 = super.A05;
                                        if (c3o92 != null) {
                                            str3 = JRE.A07(c3o92);
                                        } else {
                                            str3 = null;
                                        }
                                        C3o9 c3o93 = super.A05;
                                        if (c3o93 != null) {
                                            str4 = JRE.A08(c3o93);
                                        }
                                        List list2 = this.A05;
                                        str2 = "countBasedReactions";
                                        if (list2 != null) {
                                            C16900si A0p = AbstractC001800i.A0p(list2.subList(0, Math.min(list2.size(), 5)));
                                            LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(AbstractC06950Ym.A1E(A0p, 10)));
                                            Iterator it = A0p.iterator();
                                            while (it.hasNext()) {
                                                C0eP c0eP = (C0eP) it.next();
                                                C09530e4 A1L = AbstractC166987dD.A1L(String.valueOf(c0eP.A00 + 1), ((DirectCountBasedReaction) c0eP.A01).A01);
                                                A18.put(A1L.A00, A1L.A01);
                                            }
                                            C25531Mh A0I = AbstractC31172DnG.A0I(A0V);
                                            if (AbstractC25226BEj.A1Z(A0I)) {
                                                AbstractC31175DnJ.A1B(A0I, A0V);
                                                AbstractC31174DnI.A1I(A0I, "reaction_digest_sheet_rendered");
                                                A0I.A0o("message_reactions");
                                                AbstractC31178DnM.A1H(A0I, "thread_view", i);
                                                A0I.A0r(str3);
                                                if (str4 != null) {
                                                    l = AbstractC003100w.A0k(10, str4);
                                                } else {
                                                    l = null;
                                                }
                                                AbstractC31175DnJ.A1C(A0I, l, A18);
                                                return;
                                            }
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            str2 = "messageContentType";
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        KDJ kdj;
        String str;
        C44806JsY c44806JsY = this.A04;
        if (c44806JsY == null) {
            str = "viewPagerAdapter";
        } else {
            ViewPager2 viewPager2 = this.A03;
            if (viewPager2 == null) {
                str = "viewPager";
            } else {
                int i = viewPager2.A00;
                if (i >= 0 && i < c44806JsY.A01.size()) {
                    AbstractC10360h2 childFragmentManager = c44806JsY.A00.getChildFragmentManager();
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append('f');
                    A1C.append(c44806JsY.getItemId(i));
                    Fragment A0Q = childFragmentManager.A0Q(A1C.toString());
                    if ((A0Q instanceof KDJ) && (kdj = (KDJ) A0Q) != null) {
                        return kdj.isScrolledToTop();
                    }
                    return true;
                }
                return true;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public KWN() {
        C37056GUm c37056GUm = new C37056GUm(this, 34);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37056GUm(new C37056GUm(this, 35), 36));
        this.A06 = AbstractC25225BEi.A0a(new C37056GUm(A00, 37), c37056GUm, new MHU(37, null, A00), AbstractC25225BEi.A1D(C44517JmN.class));
    }

    @Override // X.KDO, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1793196782);
        super.onCreate(bundle);
        List parcelableArrayList = requireArguments().getParcelableArrayList("direct_count_based_reactions_list");
        if (parcelableArrayList == null) {
            parcelableArrayList = C16930sl.A00;
        }
        this.A05 = parcelableArrayList;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : parcelableArrayList) {
            if (((DirectCountBasedReaction) obj).A00 != 0) {
                A1E.add(obj);
            }
        }
        List A00 = JUD.A00(A1E, 36);
        this.A05 = A00;
        if (A00 == null) {
            C14360o3.A0F("countBasedReactions");
            throw C00O.createAndThrow();
        }
        ArrayList A1N = AbstractC16960so.A1N(new DirectCustomReactionTabModel(null, DirectCustomReactionTabModel.TabType.A02));
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            A1N.add(new DirectCustomReactionTabModel((DirectCountBasedReaction) it.next(), DirectCustomReactionTabModel.TabType.A03));
        }
        this.A02 = AbstractC001800i.A0a(A1N);
        int A07 = AbstractC25225BEi.A07(C06090Tz.A05, AbstractC25230BEn.A0k(this.A0A, 0), 36597321843542823L);
        if (A07 == 0) {
            A07 = -1;
        }
        this.A00 = A07;
        C0f9.A09(1718801687, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-324536581);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_tabbed_emoji_reactions_list, viewGroup, false);
        C0f9.A09(1004075004, A02);
        return inflate;
    }
}
