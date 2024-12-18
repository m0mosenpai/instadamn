package com.instagram.ui.emptystaterow;

import X.AbstractC153236ur;
import X.AbstractC53242c7;
import X.AbstractC55922hc;
import X.AbstractC56922jQ;
import X.C153276uw;
import X.C1571273r;
import X.EnumC153216up;
import X.InterfaceC1571373s;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.facebook.R;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class EmptyStateView extends NestedScrollView {
    public EnumC153216up A00;
    public final HashMap A01;
    public final View A02;

    public EmptyStateView(Context context) {
        this(context, null);
    }

    public static void A00(Context context, TypedArray typedArray, C1571273r c1571273r) {
        c1571273r.A02 = typedArray.getResourceId(8, 0);
        c1571273r.A01 = typedArray.getColor(2, -1);
        c1571273r.A0D = AbstractC56922jQ.A00(context, typedArray, 15);
        c1571273r.A07 = AbstractC56922jQ.A00(context, typedArray, 14);
        c1571273r.A0C = AbstractC56922jQ.A00(context, typedArray, 1);
        c1571273r.A0M = typedArray.getBoolean(12, false);
    }

    public final void A0I() {
        Object obj = this.A01.get(this.A00);
        obj.getClass();
        C153276uw c153276uw = new C153276uw(this.A02);
        EnumC153216up enumC153216up = this.A00;
        enumC153216up.getClass();
        AbstractC153236ur.A02((C1571273r) obj, c153276uw, enumC153216up);
    }

    public final void A0J() {
        A0P(EnumC153216up.A04);
    }

    public final void A0K() {
        A0P(EnumC153216up.A05);
    }

    public final void A0L() {
        A0P(EnumC153216up.A06);
    }

    public final void A0M(int i) {
        for (C1571273r c1571273r : this.A01.values()) {
            c1571273r.A00 = i;
            if (i == 0) {
                c1571273r.A0E = true;
            }
        }
    }

    public final void A0N(View.OnClickListener onClickListener, EnumC153216up enumC153216up) {
        HashMap hashMap = this.A01;
        if (hashMap.containsKey(enumC153216up)) {
            ((C1571273r) hashMap.get(enumC153216up)).A05 = onClickListener;
        }
    }

    public final void A0O(InterfaceC1571373s interfaceC1571373s, EnumC153216up enumC153216up) {
        HashMap hashMap = this.A01;
        if (hashMap.get(enumC153216up) != null) {
            ((C1571273r) hashMap.get(enumC153216up)).A06 = interfaceC1571373s;
        }
    }

    public final void A0P(EnumC153216up enumC153216up) {
        EnumC153216up enumC153216up2 = this.A00;
        this.A00 = enumC153216up;
        if (enumC153216up2 != enumC153216up) {
            A0I();
        }
    }

    public final void A0R(EnumC153216up enumC153216up, int i) {
        Object obj = this.A01.get(enumC153216up);
        obj.getClass();
        ((C1571273r) obj).A02 = i;
    }

    public final void A0U(EnumC153216up enumC153216up, String str) {
        Object obj = this.A01.get(enumC153216up);
        obj.getClass();
        ((C1571273r) obj).A0C = str;
    }

    public final void A0V(EnumC153216up enumC153216up, String str) {
        Object obj = this.A01.get(enumC153216up);
        obj.getClass();
        ((C1571273r) obj).A07 = str;
    }

    public final void A0W(EnumC153216up enumC153216up, String str) {
        Object obj = this.A01.get(enumC153216up);
        obj.getClass();
        ((C1571273r) obj).A0D = str;
    }

    public int getEmptyStateViewWrappedHeight() {
        View view = this.A02;
        view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), 0);
        return view.getMeasuredHeight();
    }

    public final void A0Q(EnumC153216up enumC153216up, int i) {
        A0U(enumC153216up, getResources().getString(i));
    }

    public final void A0S(EnumC153216up enumC153216up, int i) {
        A0V(enumC153216up, getResources().getString(i));
    }

    public final void A0T(EnumC153216up enumC153216up, int i) {
        A0W(enumC153216up, getResources().getString(i));
    }

    public EmptyStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        HashMap hashMap = new HashMap();
        this.A01 = hashMap;
        EnumC153216up enumC153216up = EnumC153216up.A02;
        hashMap.put(enumC153216up, new C1571273r());
        EnumC153216up enumC153216up2 = EnumC153216up.A06;
        hashMap.put(enumC153216up2, new C1571273r());
        EnumC153216up enumC153216up3 = EnumC153216up.A04;
        hashMap.put(enumC153216up3, new C1571273r());
        hashMap.put(EnumC153216up.A05, new C1571273r());
        EnumC153216up enumC153216up4 = EnumC153216up.A07;
        hashMap.put(enumC153216up4, new C1571273r());
        setFillViewport(true);
        View A00 = AbstractC153236ur.A00(context, this);
        this.A02 = A00;
        addView(A00);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC55922hc.A0V, 0, 0);
        Context context2 = getContext();
        A00.setBackgroundColor(obtainStyledAttributes.getColor(0, context2.getColor(AbstractC53242c7.A0H(context2, R.attr.backgroundColorSecondary))));
        Object obj = hashMap.get(enumC153216up);
        obj.getClass();
        C1571273r c1571273r = (C1571273r) obj;
        A00(context, obtainStyledAttributes, c1571273r);
        Object obj2 = hashMap.get(enumC153216up2);
        obj2.getClass();
        C1571273r c1571273r2 = (C1571273r) obj2;
        c1571273r2.A0D = AbstractC56922jQ.A00(context, obtainStyledAttributes, 11);
        c1571273r2.A07 = AbstractC56922jQ.A00(context, obtainStyledAttributes, 10);
        c1571273r2.A0C = AbstractC56922jQ.A00(context, obtainStyledAttributes, 9);
        c1571273r.A0M = obtainStyledAttributes.getBoolean(12, false);
        Object obj3 = hashMap.get(enumC153216up3);
        obj3.getClass();
        C1571273r c1571273r3 = (C1571273r) obj3;
        c1571273r3.A02 = obtainStyledAttributes.getResourceId(5, 0);
        c1571273r.A01 = obtainStyledAttributes.getColor(4, -1);
        c1571273r3.A0D = AbstractC56922jQ.A00(context, obtainStyledAttributes, 7);
        c1571273r3.A07 = AbstractC56922jQ.A00(context, obtainStyledAttributes, 6);
        c1571273r3.A0C = AbstractC56922jQ.A00(context, obtainStyledAttributes, 3);
        c1571273r.A0M = obtainStyledAttributes.getBoolean(12, false);
        Object obj4 = hashMap.get(enumC153216up4);
        obj4.getClass();
        A00(context, obtainStyledAttributes, (C1571273r) obj4);
        A0P(EnumC153216up.values()[obtainStyledAttributes.getInt(13, 0)]);
        obtainStyledAttributes.recycle();
    }

    public EmptyStateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
