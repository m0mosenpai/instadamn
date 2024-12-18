package X;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.litho.LithoView;
import com.google.android.material.tabs.TabLayout;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class JXP implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;

    public JXP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(ViewTreeObserver viewTreeObserver, Object obj, int i) {
        viewTreeObserver.addOnGlobalLayoutListener(new JXP(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.widget.TextView, android.view.View, com.instagram.common.ui.base.IgTextView] */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        FrameLayout frameLayout;
        ViewTreeObserver viewTreeObserver3;
        int i;
        View view;
        int i2;
        ViewGroup A00;
        switch (this.A00) {
            case 0:
                KBS kbs = (KBS) this.A01;
                KBS.A00(kbs, false);
                ListView listView = kbs.A00;
                if (listView == null || (viewTreeObserver3 = listView.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver3.removeOnGlobalLayoutListener(this);
                return;
            case 1:
                C44321JiD.A00((C44321JiD) this.A01);
                return;
            case 2:
                Rect rect = new Rect();
                ?? r5 = ((C44686JqV) ((C3OO) this.A01)).A01;
                r5.getLineBounds(0, rect);
                r5.setMaxLines(r5.getHeight() / (rect.bottom - rect.top));
                r5.setEllipsize(TextUtils.TruncateAt.END);
                frameLayout = r5;
                viewTreeObserver3 = frameLayout.getViewTreeObserver();
                viewTreeObserver3.removeOnGlobalLayoutListener(this);
                return;
            case 3:
                LIi lIi = (LIi) this.A01;
                FrameLayout frameLayout2 = lIi.A07;
                AbstractC125325le A01 = AbstractC125325le.A01(frameLayout2, 0);
                A01.A0G();
                AbstractC125325le A0A = A01.A0A();
                A0A.A04 = 0;
                A0A.A0U(0.0f, 1.0f, frameLayout2.getMeasuredWidth());
                A0A.A0V(0.0f, 1.0f, frameLayout2.getMeasuredHeight());
                A0A.A0M(0.0f, 1.0f);
                A0A.A06 = new C49608Lw1(lIi, 2);
                A0A.A0H();
                frameLayout = frameLayout2;
                viewTreeObserver3 = frameLayout.getViewTreeObserver();
                viewTreeObserver3.removeOnGlobalLayoutListener(this);
                return;
            case 4:
                KBU kbu = (KBU) this.A01;
                LithoView lithoView = kbu.A00;
                if (lithoView != null) {
                    lithoView.setComponent(new C75723ad());
                    KBU.A00(kbu);
                    LithoView lithoView2 = kbu.A00;
                    if (lithoView2 != null) {
                        viewTreeObserver3 = lithoView2.getViewTreeObserver();
                        viewTreeObserver3.removeOnGlobalLayoutListener(this);
                        return;
                    }
                }
                C14360o3.A0F("lithoView");
                throw C00O.createAndThrow();
            case 5:
                JXJ jxj = (JXJ) this.A01;
                View view2 = jxj.A00;
                if (view2 != null && (viewTreeObserver2 = view2.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
                    JXJ.A00(jxj);
                    return;
                }
                return;
            case 6:
                C49524Lud c49524Lud = (C49524Lud) this.A01;
                View view3 = c49524Lud.A00;
                if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
                    C49524Lud.A01(c49524Lud);
                    return;
                }
                return;
            case 7:
                MerchantShoppingCartFragment merchantShoppingCartFragment = (MerchantShoppingCartFragment) this.A01;
                int height = merchantShoppingCartFragment.A08.A00.getHeight();
                if (height > 0) {
                    AbstractC13880nE.A0x(this, merchantShoppingCartFragment.requireView().getViewTreeObserver());
                    merchantShoppingCartFragment.A00 = height;
                    merchantShoppingCartFragment.A07.A04(height);
                    C41745IeJ c41745IeJ = merchantShoppingCartFragment.A07;
                    EnumC39539HdB enumC39539HdB = merchantShoppingCartFragment.A0A;
                    C41634IbP c41634IbP = merchantShoppingCartFragment.A0E;
                    IH1 ih1 = merchantShoppingCartFragment.A0D;
                    MultiProductComponent multiProductComponent = merchantShoppingCartFragment.A06;
                    String str = merchantShoppingCartFragment.A0W;
                    IgFundedIncentive igFundedIncentive = merchantShoppingCartFragment.A05;
                    java.util.Set set = merchantShoppingCartFragment.A0a;
                    InterfaceC66382zF interfaceC66382zF = merchantShoppingCartFragment.A0h;
                    C14360o3.A0B(enumC39539HdB, 0);
                    c41745IeJ.A04 = c41634IbP;
                    c41745IeJ.A03 = ih1;
                    c41745IeJ.A02 = multiProductComponent;
                    c41745IeJ.A05 = str;
                    c41745IeJ.A01 = igFundedIncentive;
                    c41745IeJ.A00 = interfaceC66382zF;
                    c41745IeJ.A06 = set;
                    C41745IeJ.A02(c41745IeJ);
                    return;
                }
                return;
            default:
                C46079Kab c46079Kab = (C46079Kab) this.A01;
                TabLayout tabLayout = c46079Kab.A01;
                tabLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int width = tabLayout.getWidth();
                Context context = tabLayout.getContext();
                C14360o3.A07(context);
                int A002 = (int) AbstractC13880nE.A00(context, 12.0f);
                List list = c46079Kab.A03;
                ViewGroup viewGroup = null;
                int i3 = 0;
                Iterator it = list.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    it.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        AbstractC16960so.A1U();
                        throw C00O.createAndThrow();
                    }
                    ViewGroup A003 = C46079Kab.A00(c46079Kab, i4);
                    if (A003 != null) {
                        int paddingStart = A003.getPaddingStart() + A002;
                        int i6 = width - i3;
                        boolean z = true;
                        if (i6 >= 0 && i6 <= paddingStart && i4 != 0 && (A00 = C46079Kab.A00(c46079Kab, i4 - 1)) != null) {
                            A00.getPaddingEnd();
                        }
                        i3 += A003.getWidth();
                        int width2 = A003.getWidth();
                        if (viewGroup != null) {
                            i2 = viewGroup.getWidth();
                        } else {
                            i2 = 0;
                        }
                        if (width2 <= i2) {
                            z = false;
                        }
                        if (!Boolean.valueOf(z).booleanValue()) {
                            A003 = viewGroup;
                        }
                        viewGroup = A003;
                    }
                    i4 = i5;
                }
                if (viewGroup != null) {
                    i = viewGroup.getWidth();
                } else {
                    i = 0;
                }
                if (width > i * list.size()) {
                    tabLayout.setTabMode(1);
                    int size = list.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        C154306wf A07 = tabLayout.A07(i7);
                        if (A07 != null && (view = A07.A03) != null && (view instanceof TextView)) {
                            TextView textView = (TextView) view;
                            float textSize = textView.getTextSize();
                            Context context2 = textView.getContext();
                            C14360o3.A07(context2);
                            if (textSize >= AbstractC13880nE.A03(context2, 15.5f)) {
                                textView.setTextSize(2, 15.5f);
                            }
                            textView.setSingleLine(true);
                        }
                    }
                } else {
                    tabLayout.setTabMode(0);
                    View childAt = tabLayout.getChildAt(0);
                    if (childAt instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) childAt;
                        int childCount = viewGroup2.getChildCount();
                        for (int i8 = 0; i8 < childCount; i8++) {
                            viewGroup2.getChildAt(i8).setMinimumWidth(0);
                        }
                    }
                }
                tabLayout.setVisibility(0);
                return;
        }
    }
}
