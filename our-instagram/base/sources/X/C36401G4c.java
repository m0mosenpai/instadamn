package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.G4c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36401G4c implements InterfaceC165077Zw {
    public final int A00;
    public final Object A01;

    public C36401G4c(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC165077Zw
    public final boolean isResumed() {
        return ((Fragment) this.A01).isResumed();
    }
}
