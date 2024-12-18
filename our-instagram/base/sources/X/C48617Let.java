package X;

import java.util.List;

/* renamed from: X.Let, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48617Let implements InterfaceC50448MPc {
    public final /* synthetic */ C8Y3 A00;
    public final /* synthetic */ List A01;

    public C48617Let(C8Y3 c8y3, List list) {
        this.A00 = c8y3;
        this.A01 = list;
    }

    @Override // X.InterfaceC50448MPc
    public final void DqF(List list) {
        C11T.A02(new M5C(this.A00, list, this.A01));
    }

    @Override // X.InterfaceC50448MPc
    public final void onFailure(Exception exc) {
        C11T.A02(new M3R(this.A00, exc));
    }
}
