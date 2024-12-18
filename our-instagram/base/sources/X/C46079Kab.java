package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.R;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Kab, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46079Kab extends AbstractC44094JeJ implements InterfaceC021908q {
    public final ViewPager A00;
    public final TabLayout A01;
    public final InterfaceC50521MRz A02;
    public final List A03;
    public final C47118KsD A04;

    @Override // X.InterfaceC021908q
    public final void onPageScrollStateChanged(int i) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46079Kab(AbstractC10360h2 abstractC10360h2, ViewPager viewPager, TabLayout tabLayout, InterfaceC50521MRz interfaceC50521MRz, C47118KsD c47118KsD, List list) {
        super(abstractC10360h2, interfaceC50521MRz, list);
        String str;
        ColorStateList A02;
        AbstractC167017dG.A1S(tabLayout, list);
        AbstractC13620mo.A02(viewPager.getContext());
        this.A02 = interfaceC50521MRz;
        this.A00 = viewPager;
        this.A01 = tabLayout;
        this.A03 = list;
        this.A04 = c47118KsD;
        ViewPager A04 = A04();
        this.mContainer = A04;
        A04.setAdapter(this);
        A04.A0J(new C48113LRn(this, 3));
        List list2 = this.A03;
        int size = list2.size();
        TabLayout tabLayout2 = this.A01;
        if (size > 1) {
            tabLayout2.setVisibility(4);
            ViewPager viewPager2 = this.A00;
            AbstractC13880nE.A00(AbstractC166997dE.A0L(viewPager2), 4.0f);
            for (Object obj : list2) {
                ArrayList arrayList = tabLayout2.A0c;
                int size2 = arrayList.size();
                L5P ANJ = this.A02.ANJ(obj);
                C14360o3.A0B(ANJ, 1);
                View A0R = AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(tabLayout2), tabLayout2, R.layout.fixed_tabbar_button, false);
                Resources A0M = AbstractC25228BEl.A0M(A0R);
                TextView textView = (TextView) A0R;
                Context A0L = AbstractC166997dE.A0L(textView);
                int i = ANJ.A0A;
                if (i != -1) {
                    str = AbstractC25227BEk.A0u(A0L, i);
                } else {
                    str = ANJ.A0F;
                    if (str == null) {
                        str = "";
                    }
                }
                textView.setText(str);
                textView.setTextAppearance(R.style.igds_emphasized_label);
                textView.setTextSize(0, A0M.getDimension(R.dimen.abc_text_size_menu_header_material));
                textView.setSingleLine(true);
                int i2 = ANJ.A09;
                if (i2 != -1 && (A02 = C02G.A02(A0L, i2)) != null) {
                    textView.setTextColor(A02);
                }
                int i3 = ANJ.A08;
                if (i3 != -1) {
                    textView.setTextAppearance(A0L, i3);
                }
                int i4 = ANJ.A07;
                if (i4 != -1) {
                    textView.setGravity(i4);
                }
                AbstractC14710oj.A07(A0L, null, textView, C05F.A01);
                int i5 = ANJ.A00;
                if (i5 != -1) {
                    AbstractC31173DnH.A0z(A0L, textView, i5);
                }
                int i6 = ANJ.A05;
                if (i6 != -1) {
                    textView.setPadding(AbstractC31171DnF.A02(A0M, i6), 0, AbstractC31171DnF.A02(A0M, i6), 0);
                }
                textView.setContentDescription(ANJ.A0E);
                AbstractC56952jT.A04(A0R, C05F.A05);
                C0fQ.A00(new LOx(this, size2, 8), A0R);
                C154306wf A06 = tabLayout2.A06();
                A06.A03(A0R);
                tabLayout2.A0E(A06, arrayList.isEmpty());
            }
            JXP.A00(tabLayout2.getViewTreeObserver(), this, 8);
            tabLayout2.setTabMode(0);
            tabLayout2.A0D(new AnonymousClass724(viewPager2));
            C14740om.A07(tabLayout2, false);
        } else {
            tabLayout2.setVisibility(8);
        }
        viewPager.A0J(this);
    }

    public static final ViewGroup A00(C46079Kab c46079Kab, int i) {
        View view;
        ViewGroup viewGroup;
        TabLayout tabLayout = c46079Kab.A01;
        if (tabLayout.getChildCount() <= 0) {
            return null;
        }
        View childAt = tabLayout.getChildAt(0);
        if ((childAt instanceof ViewGroup) && (viewGroup = (ViewGroup) childAt) != null) {
            view = viewGroup.getChildAt(i);
        } else {
            view = null;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) view;
    }

    @Override // X.InterfaceC021908q
    public final void onPageScrolled(int i, float f, int i2) {
        this.A01.A0A(f, i, false, true);
    }

    @Override // X.InterfaceC021908q
    public final void onPageSelected(int i) {
        TabLayout tabLayout = this.A01;
        tabLayout.A0F(tabLayout.A07(i), true);
    }
}
