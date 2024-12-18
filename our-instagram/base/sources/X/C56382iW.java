package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;

/* renamed from: X.2iW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56382iW implements InterfaceC56392iX {
    public View A00;
    public ViewStub A01;
    public final boolean A02;
    public final InterfaceC09390do A03;

    public C56382iW(ViewStub viewStub, boolean z, boolean z2) {
        C14360o3.A0B(viewStub, 1);
        this.A02 = z2;
        this.A01 = viewStub;
        if (z) {
            View inflate = viewStub.inflate();
            C14360o3.A0C(inflate, "null cannot be cast to non-null type T of com.instagram.common.ui.widget.viewstubholder.ViewStubberImpl");
            this.A00 = inflate;
            this.A01 = null;
            inflate.setVisibility(8);
        }
        this.A03 = AbstractC09440dt.A01(new C9E0(this, 16));
    }

    @Override // X.InterfaceC56392iX
    public final ViewGroup.LayoutParams BMZ() {
        ViewGroup.LayoutParams layoutParams;
        ViewStub viewStub = this.A01;
        if (viewStub == null || (layoutParams = viewStub.getLayoutParams()) == null) {
            ViewGroup.LayoutParams layoutParams2 = getView().getLayoutParams();
            C14360o3.A07(layoutParams2);
            return layoutParams2;
        }
        return layoutParams;
    }

    @Override // X.InterfaceC56392iX
    public final int CGb() {
        if (this.A01 == null) {
            return getView().getVisibility();
        }
        return 8;
    }

    @Override // X.InterfaceC56392iX
    public final boolean CWW() {
        if (this.A01 != null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC56392iX
    public final /* synthetic */ View E3q() {
        if (this.A01 == null) {
            return getView();
        }
        return null;
    }

    @Override // X.InterfaceC56392iX
    public final void EY5(ViewGroup.LayoutParams layoutParams) {
        View view = this.A01;
        if (view == null) {
            view = getView();
        }
        view.setLayoutParams(layoutParams);
    }

    @Override // X.InterfaceC56392iX
    public final void EZv(final InterfaceC69513Al interfaceC69513Al) {
        ViewStub.OnInflateListener onInflateListener;
        if (interfaceC69513Al != null) {
            onInflateListener = new ViewStub.OnInflateListener() { // from class: X.3P3
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub, View view) {
                    InterfaceC69513Al interfaceC69513Al2 = InterfaceC69513Al.this;
                    C14360o3.A0C(view, "null cannot be cast to non-null type T of com.instagram.common.ui.widget.viewstubholder.ViewStubberImpl.setOnInflateListener$lambda$2");
                    interfaceC69513Al2.DLu(view);
                }
            };
        } else {
            onInflateListener = null;
        }
        ViewStub viewStub = this.A01;
        if (viewStub != null) {
            viewStub.setOnInflateListener(onInflateListener);
        }
    }

    @Override // X.InterfaceC56392iX
    public final View getView() {
        return (View) this.A03.getValue();
    }

    @Override // X.InterfaceC56392iX
    public final void setVisibility(int i) {
        if (this.A01 == null || i != 8) {
            getView().setVisibility(i);
        }
    }
}
