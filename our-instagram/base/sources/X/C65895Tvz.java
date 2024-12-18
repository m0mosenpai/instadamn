package X;

import android.content.Context;
import com.facebook.litho.BaseMountingView;

/* renamed from: X.Tvz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65895Tvz extends UBP implements C03H, InterfaceC71846X7e {
    public final BTM A00;
    public final C03I A01;

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.A01.A04(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.A01.A03(f, f2);
    }

    public final C03I getNestedScrollingChildHelper() {
        return this.A01;
    }

    public final BTM getRenderTreeView() {
        return this.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.litho.BaseMountingView, X.BTM, android.view.View, android.view.ViewGroup] */
    public C65895Tvz(Context context) {
        super(context);
        ?? baseMountingView = new BaseMountingView(context, null);
        this.A00 = baseMountingView;
        this.A01 = new C03I(this);
        addView(baseMountingView);
        baseMountingView.setClipChildren(false);
        baseMountingView.setClipToPadding(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-1103827572);
        super.onAttachedToWindow();
        this.A01.A02(true);
        C0f9.A0D(-1714288172, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(797325590);
        this.A01.A02(false);
        super.onDetachedFromWindow();
        C0f9.A0D(362904315, A06);
    }
}
