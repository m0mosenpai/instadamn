package X;

import android.view.ViewGroup;

/* loaded from: classes10.dex */
public final class Q4U extends ViewGroup {
    public InterfaceC65225TgH A00;
    public final R3N A01;

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final R3N getReactContext() {
        return this.A01;
    }

    public final InterfaceC65225TgH getStateWrapper$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_safeareaview_safeareaviewAndroid() {
        return null;
    }

    public Q4U(R3N r3n) {
        super(r3n);
        this.A01 = r3n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-878614876);
        super.onAttachedToWindow();
        AbstractC008903d.A00(this, new C63594Sq1(this, 1));
        requestApplyInsets();
        C0f9.A0D(1771810527, A06);
    }

    public final void setStateWrapper$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_safeareaview_safeareaviewAndroid(InterfaceC65225TgH interfaceC65225TgH) {
        this.A00 = interfaceC65225TgH;
    }
}
