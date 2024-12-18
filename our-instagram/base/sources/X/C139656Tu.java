package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;

/* renamed from: X.6Tu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139656Tu {
    public C6QC A00;
    public String A01;
    public final InterfaceC56392iX A02;

    public C139656Tu(ViewStub viewStub, ComponentCallbacks2C142736cZ componentCallbacks2C142736cZ) {
        InterfaceC56392iX A01;
        C14360o3.A0B(viewStub, 1);
        View view = (View) componentCallbacks2C142736cZ.A06.poll();
        ViewGroup A012 = AbstractC124845kp.A01(viewStub);
        if (view != null) {
            A012.addView(view, A012.indexOfChild(viewStub), viewStub.getLayoutParams());
            A01 = AbstractC56372iV.A01(view, false, false);
        } else {
            A01 = AbstractC56372iV.A01(viewStub, false, false);
        }
        this.A02 = A01;
    }
}
