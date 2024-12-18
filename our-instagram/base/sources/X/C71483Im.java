package X;

import java.util.HashMap;

/* renamed from: X.3Im, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71483Im extends C40781ul implements InterfaceC55612h1 {
    public HashMap A00 = new HashMap();
    public long A02 = -1;
    public long A01 = -1;

    @Override // X.InterfaceC55612h1
    public final /* synthetic */ void EQh(String str) {
    }

    @Override // X.InterfaceC55612h1
    public final long AjZ() {
        return this.A01;
    }

    @Override // X.InterfaceC55612h1
    public final long Ajf() {
        return this.A02;
    }

    @Override // X.InterfaceC55612h1
    public final boolean CR4() {
        if (this.A02 == -1) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC55612h1
    public final void EQg(long j) {
        this.A01 = j;
    }

    @Override // X.InterfaceC55612h1
    public final void EQi(long j) {
        this.A02 = j;
    }
}
