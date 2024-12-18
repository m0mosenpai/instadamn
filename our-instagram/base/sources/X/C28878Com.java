package X;

import java.util.List;

/* renamed from: X.Com, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28878Com implements InterfaceC30917DiU {
    public final int A00;
    public final Object A01;
    public final List A02;

    @Override // X.InterfaceC30917DiU
    public final void ChD(CVH cvh, float f, float f2) {
        C14360o3.A0B(cvh, 0);
        this.A02.add(new C29922DHk(this, cvh, f, 0.0f, 1));
    }

    public C28878Com(Object obj, List list, int i) {
        this.A02 = list;
        this.A00 = i;
        this.A01 = obj;
    }
}
