package X;

import java.util.HashSet;

/* renamed from: X.2rE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61512rE implements InterfaceC61522rF {
    public final C57112jm A00;
    public final java.util.Set A01 = new HashSet();

    @Override // X.InterfaceC61522rF
    public final void A8m(InterfaceC673231x interfaceC673231x) {
        C14360o3.A0B(interfaceC673231x, 0);
        this.A01.add(interfaceC673231x);
    }

    @Override // X.InterfaceC61522rF
    public final void EFQ(InterfaceC673231x interfaceC673231x) {
        C14360o3.A0B(interfaceC673231x, 0);
        this.A01.remove(interfaceC673231x);
    }

    public C61512rE(C57112jm c57112jm) {
        this.A00 = c57112jm;
    }
}
