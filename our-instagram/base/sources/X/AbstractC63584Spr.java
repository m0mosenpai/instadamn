package X;

/* renamed from: X.Spr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63584Spr implements InterfaceC72029XFr {
    public int A00(int i) {
        return ((Q68) this).A00.following(i);
    }

    public int A01(int i) {
        return ((Q68) this).A00.preceding(i);
    }

    @Override // X.InterfaceC72029XFr
    public final int Css(int i) {
        return A00(i);
    }

    @Override // X.InterfaceC72029XFr
    public final int Csw(int i) {
        int A00 = A00(i);
        if (A00 == -1 || A00(A00) == -1) {
            return -1;
        }
        return A00;
    }

    @Override // X.InterfaceC72029XFr
    public final int E62(int i) {
        int A01 = A01(i);
        if (A01 == -1 || A01(A01) == -1) {
            return -1;
        }
        return A01;
    }

    @Override // X.InterfaceC72029XFr
    public final int E64(int i) {
        return A01(i);
    }
}
