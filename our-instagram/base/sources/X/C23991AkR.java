package X;

import java.util.Arrays;

/* renamed from: X.AkR, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23991AkR implements InterfaceC65982ya {
    public C105814ps A00;
    public InterfaceC145106gV A01;

    @Override // X.InterfaceC65982ya
    public final void Dbp(C47Z c47z) {
        this.A01.Dbo(this.A00);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C2I7.A00(this.A01, ((C23991AkR) obj).A01);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01});
    }
}
