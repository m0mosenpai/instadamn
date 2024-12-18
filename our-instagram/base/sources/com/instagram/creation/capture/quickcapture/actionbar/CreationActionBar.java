package com.instagram.creation.capture.quickcapture.actionbar;

import X.AbstractC009903n;
import X.AbstractC13880nE;
import X.AbstractC186988Qr;
import X.C110964z8;
import X.C14360o3;
import X.C9BB;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.creation.capture.quickcapture.ephemeralmediatoggle.EphemeralMediaToggleView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class CreationActionBar extends ConstraintLayout {
    public EphemeralMediaToggleView A00;
    public IgdsMediaButton A01;
    public IgdsMediaButton A02;
    public boolean A03;
    public int A04;
    public int A05;
    public int A06;
    public boolean A07;
    public boolean A08;
    public final List A09;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreationActionBar(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public final void A0E(C9BB c9bb, IgdsMediaButton[] igdsMediaButtonArr) {
        List<IgdsMediaButton> list = this.A09;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            removeView((View) it.next());
        }
        list.clear();
        list.addAll(AbstractC009903n.A0I(igdsMediaButtonArr));
        this.A04 = c9bb.A00;
        this.A03 = c9bb.A04;
        for (IgdsMediaButton igdsMediaButton : list) {
            if (igdsMediaButton.A02 != null) {
                if (igdsMediaButton.getLayoutParams().width == -2) {
                    AbstractC13880nE.A0g(igdsMediaButton, igdsMediaButton.getLayoutParams().width);
                }
                AbstractC13880nE.A0g(igdsMediaButton, 0);
            } else {
                if (igdsMediaButtonArr.length < this.A04 && c9bb.A02) {
                    AbstractC13880nE.A0g(igdsMediaButton, -2);
                }
                AbstractC13880nE.A0g(igdsMediaButton, 0);
            }
            addView(igdsMediaButton);
        }
        this.A08 = c9bb.A02;
        int i = c9bb.A01;
        if (i != 3 && i != 5 && i != 8388611 && i != 8388613 && i != 17 && i != 1) {
            throw new IllegalArgumentException("invalid gravity");
        }
        this.A05 = i;
        A0F(null);
    }

    public static final int A00(View view, C110964z8 c110964z8, float f, int i, int i2, boolean z, boolean z2) {
        int i3 = i2;
        if (view == null) {
            return i;
        }
        if (view.getVisibility() != 0) {
            return i;
        }
        int i4 = 0;
        if (i == 0) {
            if (z2) {
                c110964z8.A0E(view.getId(), 1, 0, 1, i3);
            }
        } else {
            if (z2) {
                c110964z8.A0E(view.getId(), 1, i, 2, i3);
            }
            if (z) {
                if (z2) {
                    i3 = 0;
                }
                c110964z8.A0E(i, 2, view.getId(), 1, i3);
            }
        }
        c110964z8.A0E(view.getId(), 3, 0, 3, 0);
        c110964z8.A0E(view.getId(), 4, 0, 4, 0);
        int id = view.getId();
        if (f != 0.5f) {
            i4 = 2;
        }
        C110964z8.A02(c110964z8, id).A03.A0Y = i4;
        c110964z8.A08(view.getId(), f);
        return view.getId();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (r3 >= r22.A04) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0F(X.InterfaceC16820sZ r23) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar.A0F(X.0sZ):void");
    }

    public final IgdsMediaButton A0D(Integer num) {
        Context context = getContext();
        C14360o3.A07(context);
        IgdsMediaButton A00 = AbstractC186988Qr.A00(context, num);
        this.A02 = A00;
        addView(A00);
        A0F(null);
        return A00;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        List list = this.A09;
        if (list.size() == 3 && this.A03) {
            int measuredWidth = getMeasuredWidth();
            IgdsMediaButton igdsMediaButton = this.A01;
            int i5 = 0;
            if (igdsMediaButton != null) {
                i3 = igdsMediaButton.getMeasuredWidth();
            } else {
                i3 = 0;
            }
            int i6 = measuredWidth - i3;
            IgdsMediaButton igdsMediaButton2 = this.A02;
            if (igdsMediaButton2 != null) {
                i4 = igdsMediaButton2.getMeasuredWidth();
            } else {
                i4 = 0;
            }
            int i7 = i6 - i4;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i5 += ((View) it.next()).getMeasuredWidth();
            }
            if (i7 < i5) {
                this.A04 = 2;
                this.A07 = true;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreationActionBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A04 = 2;
        this.A09 = new ArrayList();
        this.A05 = 17;
        this.A06 = (int) AbstractC13880nE.A04(context, 6);
    }

    public /* synthetic */ CreationActionBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreationActionBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
