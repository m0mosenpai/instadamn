package com.google.android.material.button;

import X.AbstractC010103p;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.C0f9;
import X.C65K;
import X.C65M;
import X.C65N;
import X.C65Q;
import X.C65U;
import X.C71659WyA;
import X.UEP;
import X.WcP;
import X.WcQ;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes11.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public int A00;
    public boolean A01;
    public boolean A02;
    public Integer[] A03;
    public boolean A04;
    public final Comparator A05;
    public final LinkedHashSet A06;
    public final List A07;
    public final WcP A08;
    public final WcQ A09;

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && getChildAt(i2).getVisibility() != 8) {
                i++;
            }
        }
        return i;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.A0C.add(this.A08);
        materialButton.A02 = this.A09;
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public static void A01(MaterialButtonToggleGroup materialButtonToggleGroup) {
        Iterator it = materialButtonToggleGroup.A06.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void setCheckedId(int i) {
        this.A00 = i;
        A01(this);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.VkT, java.lang.Object] */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MaterialButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            A02(this, materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        C65Q shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        List list = this.A07;
        C65U c65u = shapeAppearanceModel.A02;
        C65U c65u2 = shapeAppearanceModel.A00;
        C65U c65u3 = shapeAppearanceModel.A03;
        C65U c65u4 = shapeAppearanceModel.A01;
        ?? obj = new Object();
        obj.A02 = c65u;
        obj.A03 = c65u3;
        obj.A01 = c65u4;
        obj.A00 = c65u2;
        list.add(obj);
        AbstractC010103p.A0B(materialButton, new UEP(this, 3));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.A05);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            AbstractC166997dE.A1U(getChildAt(i), treeMap, i);
        }
        this.A03 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.A01) {
            return this.A00;
        }
        return -1;
    }

    public List getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.isChecked()) {
                AbstractC166997dE.A1W(arrayList, materialButton.getId());
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.A03;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MaterialButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    public void setSingleSelection(boolean z) {
        if (this.A01 != z) {
            this.A01 = z;
            this.A02 = true;
            for (int i = 0; i < getChildCount(); i++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i);
                materialButton.setChecked(false);
                materialButton.getId();
                A01(this);
            }
            this.A02 = false;
            setCheckedId(-1);
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        super(C65K.A00(context, attributeSet, i, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, i);
        this.A07 = new ArrayList();
        this.A08 = new WcP(this);
        this.A09 = new WcQ(this);
        this.A06 = new LinkedHashSet();
        this.A05 = new C71659WyA(this, 4);
        this.A02 = false;
        TypedArray A00 = C65M.A00(getContext(), attributeSet, C65N.A0K, new int[0], i, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup);
        setSingleSelection(A00.getBoolean(2, false));
        this.A00 = A00.getResourceId(0, -1);
        this.A04 = A00.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        A00.recycle();
        setImportantForAccessibility(1);
    }

    private void A00() {
        ViewGroup.MarginLayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i);
                int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams2 = materialButton.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    layoutParams.setMarginEnd(0);
                    layoutParams.setMarginStart(-min);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = -min;
                    layoutParams.setMarginStart(0);
                }
                materialButton.setLayoutParams(layoutParams);
            }
            if (getChildCount() != 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getChildAt(firstVisibleChildIndex).getLayoutParams();
                if (getOrientation() == 1) {
                    marginLayoutParams.topMargin = 0;
                    marginLayoutParams.bottomMargin = 0;
                } else {
                    marginLayoutParams.setMarginEnd(0);
                    marginLayoutParams.setMarginStart(0);
                    marginLayoutParams.leftMargin = 0;
                    marginLayoutParams.rightMargin = 0;
                }
            }
        }
    }

    public static boolean A02(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        List checkedButtonIds = materialButtonToggleGroup.getCheckedButtonIds();
        if (materialButtonToggleGroup.A04 && checkedButtonIds.isEmpty()) {
            View findViewById = materialButtonToggleGroup.findViewById(i);
            if (findViewById instanceof MaterialButton) {
                materialButtonToggleGroup.A02 = true;
                ((MaterialButton) findViewById).setChecked(true);
                materialButtonToggleGroup.A02 = false;
            }
            materialButtonToggleGroup.A00 = i;
            return false;
        }
        if (z && materialButtonToggleGroup.A01) {
            checkedButtonIds.remove(Integer.valueOf(i));
            Iterator it = checkedButtonIds.iterator();
            while (it.hasNext()) {
                View findViewById2 = materialButtonToggleGroup.findViewById(AbstractC167007dF.A0B(it));
                if (findViewById2 instanceof MaterialButton) {
                    materialButtonToggleGroup.A02 = true;
                    ((MaterialButton) findViewById2).setChecked(false);
                    materialButtonToggleGroup.A02 = false;
                }
                A01(materialButtonToggleGroup);
            }
        }
        return true;
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).getVisibility() != 8) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        int childCount = getChildCount();
        do {
            childCount--;
            if (childCount < 0) {
                return -1;
            }
        } while (getChildAt(childCount).getVisibility() == 8);
        return childCount;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (getLayoutDirection() == 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        r9 = X.C69259VkT.A04;
        r0 = r8.A03;
        r1 = r8.A01;
        r8 = new java.lang.Object();
        r8.A02 = r9;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0095, code lost:
    
        r0 = r8.A02;
        r9 = r8.A00;
        r1 = X.C69259VkT.A04;
        r8 = new java.lang.Object();
        r8.A02 = r0;
        r8.A03 = r1;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        if (getLayoutDirection() == 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r8 == null) goto L9;
     */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.VkT, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [X.VkT, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [X.VkT, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [X.VkT, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03() {
        /*
            r10 = this;
            int r7 = r10.getChildCount()
            int r6 = r10.getFirstVisibleChildIndex()
            int r5 = r10.getLastVisibleChildIndex()
            r4 = 0
        Ld:
            if (r4 >= r7) goto Lb3
            android.view.View r3 = r10.getChildAt(r4)
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            int r1 = r3.getVisibility()
            r0 = 8
            if (r1 == r0) goto L3e
            X.65Q r0 = r3.getShapeAppearanceModel()
            X.72G r2 = new X.72G
            r2.<init>(r0)
            java.util.List r0 = r10.A07
            java.lang.Object r8 = r0.get(r4)
            X.VkT r8 = (X.C69259VkT) r8
            if (r6 != r5) goto L41
            if (r8 != 0) goto L67
        L32:
            r0 = 0
            r2.A00(r0)
        L36:
            X.65Q r0 = new X.65Q
            r0.<init>(r2)
            r3.setShapeAppearanceModel(r0)
        L3e:
            int r4 = r4 + 1
            goto Ld
        L41:
            int r0 = r10.getOrientation()
            boolean r0 = X.AbstractC167007dF.A1N(r0)
            if (r4 != r6) goto L8a
            if (r0 == 0) goto L78
            int r1 = r10.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L95
        L54:
            X.65U r9 = X.C69259VkT.A04
            X.65U r0 = r8.A03
            X.65U r1 = r8.A01
            X.VkT r8 = new X.VkT
            r8.<init>()
            r8.A02 = r9
        L61:
            r8.A03 = r0
        L63:
            r8.A01 = r1
        L65:
            r8.A00 = r9
        L67:
            X.65U r0 = r8.A02
            r2.A02 = r0
            X.65U r0 = r8.A00
            r2.A00 = r0
            X.65U r0 = r8.A03
            r2.A03 = r0
            X.65U r0 = r8.A01
            r2.A01 = r0
            goto L36
        L78:
            X.65U r1 = r8.A02
            X.65U r9 = X.C69259VkT.A04
            X.65U r0 = r8.A03
            X.VkT r8 = new X.VkT
            r8.<init>()
            r8.A02 = r1
            r8.A03 = r0
            r8.A01 = r9
            goto L65
        L8a:
            if (r4 != r5) goto L32
            if (r0 == 0) goto La5
            int r1 = r10.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L54
        L95:
            X.65U r0 = r8.A02
            X.65U r9 = r8.A00
            X.65U r1 = X.C69259VkT.A04
            X.VkT r8 = new X.VkT
            r8.<init>()
            r8.A02 = r0
            r8.A03 = r1
            goto L63
        La5:
            X.65U r0 = X.C69259VkT.A04
            X.65U r9 = r8.A00
            X.65U r1 = r8.A01
            X.VkT r8 = new X.VkT
            r8.<init>()
            r8.A02 = r0
            goto L61
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.A03():void");
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        MaterialButton materialButton;
        int A06 = C0f9.A06(1157104945);
        super.onFinishInflate();
        int i = this.A00;
        if (i != -1 && (materialButton = (MaterialButton) findViewById(i)) != null) {
            materialButton.setChecked(true);
        }
        C0f9.A0D(-1724857838, A06);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        int i = 2;
        if (this.A01) {
            i = 1;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, visibleButtonCount, false, i));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        A03();
        A00();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.A0C.remove(this.A08);
            materialButton.A02 = null;
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.A07.remove(indexOfChild);
        }
        A03();
        A00();
    }

    public void setSelectionRequired(boolean z) {
        this.A04 = z;
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public MaterialButtonToggleGroup(Context context) {
        this(context, null);
    }
}
