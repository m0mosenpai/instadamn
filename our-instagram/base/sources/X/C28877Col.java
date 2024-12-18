package X;

import java.util.List;

/* renamed from: X.Col, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28877Col implements InterfaceC30916DiT {
    public final int A00;
    public final Object A01;
    public final List A02;

    @Override // X.InterfaceC30916DiT
    public final void ChC(CVG cvg, float f, float f2) {
        C14360o3.A0B(cvg, 0);
        this.A02.add(new C29922DHk(this, cvg, f, 0.0f, 0));
    }

    public C28877Col(Object obj, List list, int i) {
        this.A02 = list;
        this.A00 = i;
        this.A01 = obj;
    }
}
