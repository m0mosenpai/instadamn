package X;

import android.view.View;

/* renamed from: X.G1v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36343G1v implements GXR {
    public final int A00;
    public final Object A01;

    public C36343G1v(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.GXR
    public final void DHB() {
        View view;
        if (1 - this.A00 != 0) {
            view = (View) this.A01;
        } else {
            view = ((C34696FQh) this.A01).A0F;
        }
        view.setVisibility(0);
    }
}
