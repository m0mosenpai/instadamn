package X;

import java.util.UUID;

/* renamed from: X.1qP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38351qP implements InterfaceC38361qQ, InterfaceC11160iX {
    public static C38351qP A01;
    public static boolean A02;
    public static final String A03 = UUID.randomUUID().toString();
    public int A00 = 0;

    @Override // X.InterfaceC38361qQ
    public final synchronized String E6h() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("UFS");
        sb.append("-");
        sb.append(A03);
        sb.append("-");
        sb.append(this.A00);
        return sb.toString();
    }

    @Override // X.InterfaceC11160iX
    public final synchronized void E7c() {
        if (!A02) {
            A02 = true;
        } else {
            this.A00++;
        }
    }

    @Override // X.InterfaceC11160iX
    public final void E7d() {
    }
}
