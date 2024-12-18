package X;

import java.util.List;

/* renamed from: X.Ozf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56318Ozf implements InterfaceC187208Rn {
    public final /* synthetic */ C52135N5j A00;

    @Override // X.InterfaceC187208Rn
    public final /* synthetic */ void DNF(C9NH c9nh, int i) {
    }

    @Override // X.InterfaceC187208Rn
    public final /* synthetic */ void DNc(int i, int i2) {
    }

    @Override // X.InterfaceC187208Rn
    public final /* synthetic */ void DNm(C9NH c9nh, int i) {
    }

    @Override // X.InterfaceC187208Rn
    public final /* synthetic */ void DNz() {
    }

    @Override // X.InterfaceC187208Rn
    public final /* synthetic */ void DO2(List list) {
    }

    public C56318Ozf(C52135N5j c52135N5j) {
        this.A00 = c52135N5j;
    }

    @Override // X.InterfaceC187208Rn
    public final void DNp(C9NH c9nh, int i) {
        int A00;
        C52135N5j c52135N5j = this.A00;
        InterfaceC58267PsB interfaceC58267PsB = c52135N5j.A0E;
        if (interfaceC58267PsB != null) {
            int currentPosition = interfaceC58267PsB.getCurrentPosition();
            if (currentPosition <= 0) {
                A00 = C51033Mgh.A00(c52135N5j.A0X) - 1;
            } else {
                A00 = NsX.A00(c52135N5j.A0T, currentPosition);
            }
            if (A00 != i) {
                C52135N5j.A03(c52135N5j, i - A00);
            }
        }
    }
}
