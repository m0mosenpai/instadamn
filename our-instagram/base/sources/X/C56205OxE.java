package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;
import java.util.List;

/* renamed from: X.OxE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56205OxE implements InterfaceC58203Pr9 {
    public C54391O1x A00;
    public final ReboundHorizontalScrollView A01;

    public C56205OxE(ReboundHorizontalScrollView reboundHorizontalScrollView) {
        C14360o3.A0B(reboundHorizontalScrollView, 1);
        this.A01 = reboundHorizontalScrollView;
    }

    @Override // X.InterfaceC58203Pr9
    public final InterfaceC58195Pr1 AuV() {
        return null;
    }

    @Override // X.InterfaceC58203Pr9
    public final void COM(C54390O1w c54390O1w, List list, int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC58203Pr9
    public final void EFd(C51202Mjm c51202Mjm) {
        C14360o3.A0B(c51202Mjm, 0);
        this.A01.A0J.remove(c51202Mjm);
    }

    @Override // X.InterfaceC58203Pr9
    public final void EGv() {
    }

    @Override // X.InterfaceC58203Pr9
    public final void EJ4(C54393O1z c54393O1z) {
    }

    @Override // X.InterfaceC58203Pr9
    public final void EJI(InterfaceC58195Pr1 interfaceC58195Pr1) {
    }

    @Override // X.InterfaceC58203Pr9
    public final void EMN(int i) {
    }

    @Override // X.InterfaceC58203Pr9
    public final void Ed2(boolean z) {
        this.A01.setSaveEnabled(true);
    }

    @Override // X.InterfaceC58203Pr9
    public final void EeY(boolean z) {
        this.A01.A0A = true;
    }

    @Override // X.InterfaceC58203Pr9
    public final void EkJ() {
    }

    @Override // X.InterfaceC58203Pr9
    public final void Epb(int i, int i2) {
    }

    @Override // X.InterfaceC58203Pr9
    public final void addView(View view, int i) {
        C14360o3.A0B(view, 0);
        this.A01.addView(view, i);
    }

    @Override // X.InterfaceC58203Pr9
    public final int indexOfChild(View view) {
        C14360o3.A0B(view, 0);
        return this.A01.indexOfChild(view);
    }

    @Override // X.InterfaceC58203Pr9
    public final void removeItem(int i) {
    }

    @Override // X.InterfaceC58203Pr9
    public final void removeView(View view) {
        C14360o3.A0B(view, 0);
        this.A01.removeView(view);
    }

    @Override // X.InterfaceC58203Pr9
    public final void A9C(C51202Mjm c51202Mjm) {
        this.A01.A0A(c51202Mjm);
    }

    @Override // X.InterfaceC58203Pr9
    public final void AAl(View view) {
        this.A01.addView(view);
    }

    @Override // X.InterfaceC58203Pr9
    public final View AnU(int i) {
        return this.A01.getChildAt(i);
    }

    @Override // X.InterfaceC58203Pr9
    public final int AnZ() {
        return this.A01.getChildCount();
    }

    @Override // X.InterfaceC58203Pr9
    public final int AuK() {
        return this.A01.getCurrentChildIndex();
    }

    @Override // X.InterfaceC58203Pr9
    public final ViewGroup.LayoutParams BMZ() {
        ViewGroup.LayoutParams layoutParams = this.A01.getLayoutParams();
        C14360o3.A07(layoutParams);
        return layoutParams;
    }

    @Override // X.InterfaceC58203Pr9
    public final /* bridge */ /* synthetic */ View Br3() {
        return this.A01;
    }

    @Override // X.InterfaceC58203Pr9
    public final float CEh() {
        return this.A01.getVelocity();
    }

    @Override // X.InterfaceC58203Pr9
    public final ViewTreeObserver CFv() {
        ViewTreeObserver viewTreeObserver = this.A01.getViewTreeObserver();
        C14360o3.A07(viewTreeObserver);
        return viewTreeObserver;
    }

    @Override // X.InterfaceC58203Pr9
    public final void EF0() {
        this.A01.removeAllViews();
    }

    @Override // X.InterfaceC58203Pr9
    public final void EMH(int i, float f) {
        this.A01.A09(i, f);
    }

    @Override // X.InterfaceC58203Pr9
    public final void EML(float f) {
        this.A01.A05(f);
    }

    @Override // X.InterfaceC58203Pr9
    public final void EMS(float f) {
        this.A01.A06(f);
    }

    @Override // X.InterfaceC58203Pr9
    public final void ET3(float f) {
        this.A01.A00 = f;
    }

    @Override // X.InterfaceC58203Pr9
    public final void EY5(ViewGroup.LayoutParams layoutParams) {
        this.A01.setLayoutParams(layoutParams);
    }

    @Override // X.InterfaceC58203Pr9
    public final void EdC(C55942hf c55942hf) {
        this.A01.setScrollingSpringConfig(c55942hf);
    }

    @Override // X.InterfaceC58203Pr9
    public final void EeZ(C55942hf c55942hf) {
        this.A01.setSnappingSpringConfig(c55942hf);
    }

    @Override // X.InterfaceC58203Pr9
    public final int getWidth() {
        return this.A01.getWidth();
    }

    @Override // X.InterfaceC58203Pr9
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        this.A01.requestDisallowInterceptTouchEvent(z);
    }

    @Override // X.InterfaceC58203Pr9
    public final void requestLayout() {
        this.A01.requestLayout();
    }

    @Override // X.InterfaceC58203Pr9
    public final void setVisibility(int i) {
        this.A01.setVisibility(i);
    }

    @Override // X.InterfaceC58203Pr9
    public final void EWk(C54391O1x c54391O1x) {
        this.A00 = c54391O1x;
    }
}
