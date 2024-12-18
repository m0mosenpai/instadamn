package com.instagram.creation.base.ui.feedcolorfilterpicker;

import X.AbstractC14350nz;
import X.AbstractC166987dD;
import X.AbstractC31718DwN;
import X.AbstractC43594JPz;
import X.AbstractC48580LeI;
import X.AbstractC54340Nzy;
import X.AbstractRunnableC14200nk;
import X.C05F;
import X.C0f9;
import X.C0o0;
import X.C14360o3;
import X.C18240vB;
import X.C19280xC;
import X.C44428Jkf;
import X.C44437Jky;
import X.C54629OBe;
import X.HandlerC44380JjJ;
import X.InterfaceC14020nS;
import X.InterfaceC50490MQs;
import X.InterfaceC58141Pq6;
import X.KKt;
import X.KLL;
import X.L64;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public class FilterPicker extends FeedColorFilterPicker implements InterfaceC58141Pq6 {
    public long A00;
    public L64 A01;
    public boolean A02;
    public float A03;
    public int A04;
    public View A05;
    public final Handler A06;
    public final List A07;
    public final InterfaceC14020nS A08;
    public final AbstractRunnableC14200nk A09;

    @Override // X.InterfaceC58141Pq6
    public final void DC0(View view, boolean z) {
        this.A05 = null;
        this.A06.removeCallbacksAndMessages(null);
        L64 l64 = this.A01;
        int i = this.A04;
        C44437Jky c44437Jky = ((C44428Jkf) view).A05;
        InterfaceC50490MQs interfaceC50490MQs = c44437Jky.A01;
        C14360o3.A07(interfaceC50490MQs);
        String name = interfaceC50490MQs.getName();
        int A00 = C44437Jky.A00(c44437Jky);
        C14360o3.A0B(name, 1);
        C19280xC A002 = AbstractC31718DwN.A00(C05F.A0g);
        A002.A08(Integer.valueOf(i), "index");
        A002.A0C("filter", name);
        A002.A08(Integer.valueOf(A00), "filter_type");
        A002.A0C(CacheBehaviorLogger.SOURCE, "editor_view");
        l64.A00.EHW(A002);
        view.setVisibility(0);
        this.A08.ATO(this.A09);
    }

    private int getIndexFromDrag() {
        LinearLayout linearLayout = super.A03;
        linearLayout.getClass();
        int childCount = (linearLayout.getChildCount() - 1) - (this.A02 ? 1 : 0);
        int i = 0;
        int i2 = 1;
        while (i2 <= childCount) {
            i = (i2 + childCount) >>> 1;
            if (this.A03 < (super.A02 * i) - getScrollX()) {
                childCount = i - 1;
            } else {
                if (this.A03 <= ((super.A02 * i) - getScrollX()) + super.A02) {
                    break;
                }
                i2 = i + 1;
            }
        }
        return i;
    }

    @Override // X.InterfaceC58141Pq6
    public final void DC7(View view, float f, float f2) {
        this.A05 = view;
        this.A03 = f;
        this.A04 = getIndexFromDrag();
        InterfaceC50490MQs interfaceC50490MQs = ((C44428Jkf) view).A05.A01;
        C14360o3.A07(interfaceC50490MQs);
        L64 l64 = this.A01;
        int i = this.A04;
        String name = interfaceC50490MQs.getName();
        int BF3 = interfaceC50490MQs.BF3();
        C14360o3.A0B(name, 1);
        C19280xC A00 = AbstractC31718DwN.A00(C05F.A0f);
        A00.A08(Integer.valueOf(i), "index");
        A00.A0C("filter", name);
        A00.A08(Integer.valueOf(BF3), "filter_type");
        A00.A0C(CacheBehaviorLogger.SOURCE, "editor_view");
        l64.A00.EHW(A00);
        view.setVisibility(4);
    }

    @Override // X.InterfaceC58141Pq6
    public final void DCB() {
        this.A06.removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC58141Pq6
    public final void DCC(View view, float f, float f2, boolean z, boolean z2) {
        this.A03 = f;
        super.A03.getClass();
        if ((super.A02 / 2) + f > AbstractC166987dD.A07(this) && getScrollX() != AbstractC43594JPz.A09(super.A03, this)) {
            Handler handler = this.A06;
            if (!handler.hasMessages(2)) {
                this.A00 = System.currentTimeMillis();
                handler.sendEmptyMessage(2);
            }
        } else if (f - (super.A02 / 2) < 0.0f && getScrollX() != 0) {
            Handler handler2 = this.A06;
            if (!handler2.hasMessages(1)) {
                this.A00 = System.currentTimeMillis();
                handler2.sendEmptyMessage(1);
            }
        } else {
            this.A06.removeCallbacksAndMessages(null);
        }
        A00(this);
    }

    public List getTileFrames() {
        return super.A06;
    }

    @Override // com.instagram.creation.base.ui.feedcolorfilterpicker.FeedColorFilterPicker
    public void setEffects(List list, boolean z, UserSession userSession) {
        List list2 = this.A07;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC50490MQs interfaceC50490MQs = (InterfaceC50490MQs) it.next();
            if ((interfaceC50490MQs instanceof AbstractC48580LeI) && interfaceC50490MQs.BF3() != 0) {
                C54629OBe c54629OBe = ((AbstractC48580LeI) interfaceC50490MQs).A00;
                list2.add(c54629OBe);
                if (c54629OBe.A02) {
                    it.remove();
                }
            } else if (interfaceC50490MQs.BF3() == -1) {
                this.A02 = true;
            }
        }
        super.setEffects(list, z, userSession);
    }

    public void setFilterLogger(L64 l64) {
        this.A01 = l64;
    }

    public void setFilterStateToOld(C44428Jkf c44428Jkf) {
        int A00 = C44437Jky.A00(c44428Jkf.A05);
        for (C54629OBe c54629OBe : this.A07) {
            if (c54629OBe.A00 == A00 && c54629OBe.A03) {
                c54629OBe.A03 = false;
                c44428Jkf.A02();
                this.A08.ATO(this.A09);
                return;
            }
        }
    }

    public FilterPicker(Context context) {
        super(context);
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "FilterPicker";
        this.A08 = new C18240vB(A00);
        this.A06 = new HandlerC44380JjJ(Looper.getMainLooper(), this);
        this.A07 = AbstractC166987dD.A1E();
        this.A09 = new KLL(this);
    }

    public static void A00(FilterPicker filterPicker) {
        int width;
        List list;
        int indexFromDrag = filterPicker.getIndexFromDrag();
        LinearLayout linearLayout = ((FeedColorFilterPicker) filterPicker).A03;
        linearLayout.getClass();
        View childAt = linearLayout.getChildAt(indexFromDrag);
        View view = filterPicker.A05;
        if (childAt != view) {
            view.getClass();
            C44428Jkf c44428Jkf = (C44428Jkf) view;
            if (c44428Jkf.getLayoutParams().width >= 0) {
                width = c44428Jkf.getLayoutParams().width;
            } else {
                width = c44428Jkf.getWidth();
            }
            if (filterPicker.A04 > indexFromDrag) {
                width = -width;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(width, 0.0f, 0.0f, 0.0f);
            translateAnimation.setDuration(300L);
            childAt.startAnimation(translateAnimation);
            if (filterPicker.A05.getAnimation() != null) {
                filterPicker.A05.clearAnimation();
            }
            ((FeedColorFilterPicker) filterPicker).A03.removeView(filterPicker.A05);
            List list2 = ((FeedColorFilterPicker) filterPicker).A06;
            list2.remove(filterPicker.A05);
            ((FeedColorFilterPicker) filterPicker).A03.addView(filterPicker.A05, indexFromDrag);
            list2.add(indexFromDrag, filterPicker.A05);
            ((FeedColorFilterPicker) filterPicker).A03.requestLayout();
            int A00 = C44437Jky.A00(((C44428Jkf) childAt).A05);
            int A002 = C44437Jky.A00(c44428Jkf.A05);
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                list = filterPicker.A07;
                if (i >= list.size()) {
                    break;
                }
                if (((C54629OBe) list.get(i)).A00 == A00) {
                    i3 = i;
                } else if (((C54629OBe) list.get(i)).A00 == A002) {
                    i2 = i;
                }
                i++;
            }
            list.add(i3, list.remove(i2));
        }
        filterPicker.A04 = indexFromDrag;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-920838021);
        super.onAttachedToWindow();
        AbstractC54340Nzy.A00.A02(this, KKt.class);
        C0f9.A0D(-1612637574, A06);
    }

    @Override // com.instagram.creation.base.ui.feedcolorfilterpicker.FeedColorFilterPicker, android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-2006864500);
        setFilterStateToOld((C44428Jkf) view);
        super.onClick(view);
        C0f9.A0C(-1239629874, A05);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-1767842461);
        super.onDetachedFromWindow();
        AbstractC54340Nzy.A00.A03(this, KKt.class);
        C0f9.A0D(1405955361, A06);
    }

    public FilterPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "FilterPicker";
        this.A08 = new C18240vB(A00);
        this.A06 = new HandlerC44380JjJ(Looper.getMainLooper(), this);
        this.A07 = AbstractC166987dD.A1E();
        this.A09 = new KLL(this);
    }

    public FilterPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "FilterPicker";
        this.A08 = new C18240vB(A00);
        this.A06 = new HandlerC44380JjJ(Looper.getMainLooper(), this);
        this.A07 = AbstractC166987dD.A1E();
        this.A09 = new KLL(this);
    }
}
