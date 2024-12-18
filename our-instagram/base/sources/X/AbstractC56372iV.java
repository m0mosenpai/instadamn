package X;

import android.view.View;
import android.view.ViewStub;

/* renamed from: X.2iV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC56372iV {
    public static final InterfaceC56392iX A00(View view) {
        return A01(view, false, false);
    }

    public static final InterfaceC56392iX A01(View view, boolean z, boolean z2) {
        InterfaceC56392iX c6pc;
        if (view instanceof ViewStub) {
            c6pc = new C56382iW((ViewStub) view, z, z2);
        } else {
            c6pc = new C6PC(view);
        }
        return c6pc;
    }
}
