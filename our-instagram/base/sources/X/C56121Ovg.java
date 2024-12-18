package X;

import java.util.AbstractCollection;

/* renamed from: X.Ovg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56121Ovg implements InterfaceC66482zP {
    public final int A00;
    public final boolean A01;

    public static void A00(AbstractCollection abstractCollection, int i, boolean z) {
        abstractCollection.add(new C56121Ovg(i, z));
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A00);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C56121Ovg c56121Ovg = (C56121Ovg) obj;
        C14360o3.A0B(c56121Ovg, 0);
        return AbstractC167007dF.A1P(this.A00, c56121Ovg.A00);
    }

    public C56121Ovg(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }
}
