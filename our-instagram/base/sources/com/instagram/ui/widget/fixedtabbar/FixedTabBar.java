package com.instagram.ui.widget.fixedtabbar;

import X.AbstractC001800i;
import X.AbstractC13620mo;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC25225BEi;
import X.AbstractC31172DnG;
import X.AbstractC43593JPy;
import X.AbstractC53242c7;
import X.InterfaceC021908q;
import X.InterfaceC50405MNh;
import X.L5P;
import X.M2S;
import X.MPJ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.R;
import java.util.List;

/* loaded from: classes8.dex */
public class FixedTabBar extends FrameLayout implements InterfaceC021908q {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public LayoutInflater A04;
    public LinearLayout A05;
    public MPJ A06;
    public List A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public int A0B;
    public InterfaceC50405MNh A0C;
    public FixedTabBarIndicator A0D;
    public Integer A0E;
    public boolean A0F;
    public boolean A0G;

    @Override // X.InterfaceC021908q
    public final void onPageSelected(int i) {
    }

    private void A00() {
        Integer num;
        if (this.A0B == 0 && (num = this.A0E) != null) {
            if (this.A00 - ((int) r1) == 0.0f) {
                A02(num.intValue());
                this.A0E = null;
            }
        }
    }

    public final void A02(int i) {
        int i2;
        L5P l5p;
        if (this.A09) {
            i2 = AbstractC31172DnG.A03(this.A07, 1) - i;
        } else {
            i2 = i;
        }
        for (int i3 = 0; i3 < this.A07.size(); i3++) {
            ((View) this.A07.get(i3)).setSelected(AbstractC167007dF.A1P(i3, i2));
        }
        if (this.A0B == 0) {
            FixedTabBarIndicator fixedTabBarIndicator = this.A0D;
            fixedTabBarIndicator.A01 = i;
            List list = fixedTabBarIndicator.A02;
            if (list != null && (l5p = (L5P) AbstractC001800i.A0O(list, i)) != null) {
                int i4 = l5p.A06;
                if (i4 == -1) {
                    i4 = AbstractC53242c7.A08(fixedTabBarIndicator.getContext());
                }
                AbstractC166987dD.A1N(fixedTabBarIndicator.getContext(), fixedTabBarIndicator.A06, i4);
                if (fixedTabBarIndicator.A03) {
                    fixedTabBarIndicator.A00(i, 0.0f);
                    return;
                } else {
                    fixedTabBarIndicator.post(new M2S(fixedTabBarIndicator));
                    return;
                }
            }
            return;
        }
        this.A0E = Integer.valueOf(i);
    }

    @Override // X.InterfaceC021908q
    public final void onPageScrollStateChanged(int i) {
        this.A0B = i;
        A00();
    }

    @Override // X.InterfaceC021908q
    public final void onPageScrolled(int i, float f, int i2) {
        this.A00 = f;
        this.A0D.A00(i, f);
        A00();
    }

    public void setDelegate(MPJ mpj) {
        this.A06 = mpj;
    }

    public void setForceIconFallbackTabs(boolean z) {
        this.A08 = z;
    }

    public void setGlyphsListener(InterfaceC50405MNh interfaceC50405MNh) {
        this.A0C = interfaceC50405MNh;
    }

    public void setIndicatorEnabled(boolean z) {
        this.A0D.setVisibility(AbstractC43593JPy.A01(z ? 1 : 0));
    }

    public void setMaybeUseIconFallbackTabs(boolean z) {
        this.A0A = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (r0 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setTabs(java.util.List r19) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.fixedtabbar.FixedTabBar.setTabs(java.util.List):void");
    }

    public FixedTabBar(Context context) {
        super(context);
        this.A0B = 0;
        this.A0C = null;
        A01(context);
    }

    private void A01(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        this.A04 = from;
        from.inflate(R.layout.fixed_tabbar_layout, this);
        this.A05 = AbstractC31172DnG.A0B(this, R.id.fixed_tabbar_tabs_container);
        this.A0D = (FixedTabBarIndicator) requireViewById(R.id.selected_tab_indicator);
        this.A0F = true;
        this.A09 = AbstractC13620mo.A02(getContext());
        this.A07 = AbstractC25225BEi.A17(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0028, code lost:
    
        if (r6.A08 != false) goto L12;
     */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            super.onMeasure(r7, r8)
            boolean r0 = r6.A0A
            if (r0 != 0) goto Lb
            boolean r0 = r6.A08
            if (r0 == 0) goto L77
        Lb:
            java.util.List r0 = r6.A07
            boolean r0 = r0.isEmpty()
            r2 = 0
            if (r0 != 0) goto L25
            android.widget.LinearLayout r0 = r6.A05
            int r1 = r0.getMeasuredWidth()
            java.util.List r0 = r6.A07
            int r0 = r0.size()
            int r1 = r1 / r0
            int r0 = r6.A02
            if (r1 <= r0) goto L2a
        L25:
            boolean r0 = r6.A08
            r5 = 0
            if (r0 == 0) goto L2b
        L2a:
            r5 = 1
        L2b:
            boolean r0 = r6.A0F
            if (r0 != 0) goto L33
            boolean r0 = r6.A0G
            if (r5 == r0) goto L77
        L33:
            r6.A0F = r2
            r6.A0G = r5
            X.MNh r0 = r6.A0C
            if (r5 == 0) goto L46
            if (r0 == 0) goto L46
            X.TwQ r0 = (X.AbstractC65919TwQ) r0
            X.8c6 r0 = r0.A0F()
            r0.ClY()
        L46:
            java.util.List r0 = r6.A07
            java.util.Iterator r4 = r0.iterator()
        L4c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L74
            android.view.View r3 = X.AbstractC43592JPx.A09(r4)
            r0 = 2131442477(0x7f0b3b2d, float:1.8506995E38)
            android.view.View r2 = r3.requireViewById(r0)
            r1 = 8
            int r0 = X.AbstractC31175DnJ.A01(r5)
            r2.setVisibility(r0)
            r0 = 2131442476(0x7f0b3b2c, float:1.8506993E38)
            android.view.View r0 = r3.requireViewById(r0)
            if (r5 == 0) goto L70
            r1 = 0
        L70:
            r0.setVisibility(r1)
            goto L4c
        L74:
            super.onMeasure(r7, r8)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.fixedtabbar.FixedTabBar.onMeasure(int, int):void");
    }

    public FixedTabBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0B = 0;
        this.A0C = null;
        A01(context);
    }

    public FixedTabBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0B = 0;
        this.A0C = null;
        A01(context);
    }
}
