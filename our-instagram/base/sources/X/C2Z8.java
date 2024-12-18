package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Z8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2Z8 extends SwipeRefreshLayout implements C2X1 {
    public C3F1 A00;
    public InterfaceC169697hj A01;
    public boolean A02;
    public final AbstractC70573Eu A03;
    public final RecyclerView A04;
    public final LithoView A05;

    public C2Z8(Context context, RecyclerView recyclerView) {
        super(context, null);
        this.A02 = false;
        InterfaceC16660sJ interfaceC16660sJ = C2V3.defaultInstance.A08;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(this);
        }
        this.A04 = recyclerView;
        this.A03 = recyclerView.A0B;
        recyclerView.setChildDrawingOrderCallback(new C7KW() { // from class: X.7hg
            @Override // X.C7KW
            public final int DJO(int i, int i2) {
                return (i - 1) - i2;
            }
        });
        recyclerView.setItemViewCacheSize(0);
        addView(recyclerView);
        LithoView lithoView = new LithoView(new C2XE(getContext()), (AttributeSet) null);
        this.A05 = lithoView;
        lithoView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(lithoView);
    }

    public final void A0B(int i) {
        AbstractC170917ji abstractC170917ji;
        LithoView A00;
        if (i > -1 && C2V3.initStickyHeaderInLayoutWhenComponentTreeIsNull && this.A05.A00 != null) {
            C3OO A0V = this.A04.A0V(i);
            if ((A0V instanceof AbstractC170917ji) && (abstractC170917ji = (AbstractC170917ji) A0V) != null && (A00 = abstractC170917ji.A00()) != null && A00.A00 == null && A00.A01 != null) {
                A00.requestLayout();
            }
        }
    }

    public static void A00(C2Z8 c2z8) {
        LithoView lithoView = c2z8.A05;
        if (lithoView.getVisibility() != 8) {
            int paddingLeft = c2z8.getPaddingLeft();
            int paddingTop = c2z8.getPaddingTop();
            lithoView.layout(paddingLeft, paddingTop, lithoView.getMeasuredWidth() + paddingLeft, lithoView.getMeasuredHeight() + paddingTop);
        }
    }

    @Override // X.C2X1
    public final void Ctl(List list) {
        list.add(this.A05);
        RecyclerView recyclerView = this.A04;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt instanceof LithoView) {
                list.add(childAt);
            }
        }
    }

    public AbstractC70573Eu getDefaultEdgeEffectFactory() {
        return this.A03;
    }

    public RecyclerView getRecyclerView() {
        return this.A04;
    }

    public LithoView getStickyHeader() {
        return this.A05;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC50692Uq.A07("RenderCore.View.OnLayout:start", new InterfaceC16820sZ() { // from class: X.7hk
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return "-1";
            }
        }, new InterfaceC16660sJ() { // from class: X.7hl
            @Override // X.InterfaceC16660sJ
            public final Object invoke(Object obj) {
                Map map = (Map) obj;
                map.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Integer.valueOf(C2Z8.this.hashCode()));
                map.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "SectionsRecyclerView");
                return C0eB.A00;
            }
        });
        Integer A01 = AbstractC50692Uq.A01("RenderCore.View.OnLayout");
        if (A01 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Integer.valueOf(hashCode()));
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "SectionsRecyclerView");
            linkedHashMap.put("bounds", new Rect(i, i2, i3, i4));
            AbstractC50692Uq.A05("RenderCore.View.OnLayout", "-1", linkedHashMap, A01.intValue());
        }
        try {
            super.onLayout(z, i, i2, i3, i4);
            A00(this);
        } finally {
            if (A01 != null) {
                AbstractC50692Uq.A02(A01.intValue());
            }
        }
    }

    public void setHasBeenDetachedFromWindow(boolean z) {
        this.A02 = z;
    }

    public void setItemAnimator(C3F1 c3f1) {
        RecyclerView recyclerView = this.A04;
        this.A00 = recyclerView.A0C;
        recyclerView.setItemAnimator(c3f1);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.A04.setOnTouchListener(onTouchListener);
    }

    public void setSectionsRecyclerViewLogger(InterfaceC169697hj interfaceC169697hj) {
        this.A01 = interfaceC169697hj;
    }

    public void setStickyComponent(ComponentTree componentTree) {
        LithoView lithoView = componentTree.A07;
        LithoView lithoView2 = this.A05;
        lithoView2.A0l(componentTree, true);
        if (lithoView != null && lithoView2 != lithoView) {
            lithoView.A01 = componentTree;
        }
        measureChild(lithoView2, View.MeasureSpec.makeMeasureSpec(getWidth(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), 0);
    }

    public void setStickyHeaderVerticalOffset(int i) {
        this.A05.setTranslationY(i);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(613349657);
        super.onDetachedFromWindow();
        this.A02 = true;
        C0f9.A0D(1449575207, A06);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        measureChild(this.A05, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), 0);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (getParent() != null && !this.A0X.A02) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }
}
