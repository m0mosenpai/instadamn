package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;

/* renamed from: X.6PC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6PC implements InterfaceC56392iX {
    public final View A00;
    public final boolean A01;

    @Override // X.InterfaceC56392iX
    public final void EZv(InterfaceC69513Al interfaceC69513Al) {
    }

    @Override // X.InterfaceC56392iX
    public final ViewGroup.LayoutParams BMZ() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.A00;
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return new ViewGroup.LayoutParams(0, 0);
        }
        return layoutParams;
    }

    @Override // X.InterfaceC56392iX
    public final int CGb() {
        View view = this.A00;
        if (view != null) {
            return view.getVisibility();
        }
        return 8;
    }

    @Override // X.InterfaceC56392iX
    public final boolean CWW() {
        return this.A01;
    }

    @Override // X.InterfaceC56392iX
    public final /* synthetic */ View E3q() {
        if (this.A01) {
            return this.A00;
        }
        return null;
    }

    @Override // X.InterfaceC56392iX
    public final void EY5(ViewGroup.LayoutParams layoutParams) {
        View view = this.A00;
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // X.InterfaceC56392iX
    public final View getView() {
        return this.A00;
    }

    @Override // X.InterfaceC56392iX
    public final void setVisibility(int i) {
        View view = this.A00;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public C6PC(View view) {
        this.A00 = view;
        if (!(view instanceof ViewStub)) {
            this.A01 = view != null;
            return;
        }
        throw new IllegalArgumentException("view cannot be a ViewStub. Use ViewStubbleImpl instead.");
    }
}
