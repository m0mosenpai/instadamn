package X;

import java.util.List;

/* renamed from: X.FyD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36199FyD implements InterfaceC66482zP {
    public final int A00;
    public final List A01;
    public final InterfaceC16820sZ A02;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return String.valueOf(this.A00);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C36199FyD c36199FyD = (C36199FyD) obj;
        if (c36199FyD == null || this.A00 != c36199FyD.A00) {
            return false;
        }
        return true;
    }

    public C36199FyD(int i, List list, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = i;
        this.A01 = list;
        this.A02 = interfaceC16820sZ;
    }
}
