package X;

import java.util.Collection;

/* renamed from: X.Ap0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24234Ap0 implements InterfaceC42241xE {
    public final /* synthetic */ C2DU A00;

    public C24234Ap0(C2DU c2du) {
        this.A00 = c2du;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Collection collection = (Collection) obj;
        java.util.Set set = this.A00.A0J;
        C14360o3.A07(set);
        synchronized (set) {
            set.clear();
            C14360o3.A0A(collection);
            set.addAll(collection);
        }
    }
}
