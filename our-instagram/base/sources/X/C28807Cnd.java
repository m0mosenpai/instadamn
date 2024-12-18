package X;

import android.graphics.Path;

/* renamed from: X.Cnd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28807Cnd implements C5AH {
    public final boolean A00;

    @Override // X.C5AH
    public final AbstractC119385av AMh(InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583, long j) {
        boolean z = this.A00;
        C60X A00 = C60W.A00();
        float A02 = C5YC.A02(j) / 2.0f;
        if (z) {
            float A002 = C5YC.A00(j);
            Path path = A00.A03;
            path.moveTo(A02, A002);
            path.lineTo(C5YC.A02(j), 0.0f);
            path.lineTo(0.0f, 0.0f);
        } else {
            Path path2 = A00.A03;
            path2.moveTo(A02, 0.0f);
            path2.lineTo(C5YC.A02(j), C5YC.A00(j));
            path2.lineTo(0.0f, C5YC.A00(j));
        }
        return new C119405ax(A00);
    }

    public C28807Cnd(boolean z) {
        this.A00 = z;
    }
}
