package X;

import java.util.Comparator;

/* renamed from: X.D2l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29610D2l implements Comparator {
    public final /* synthetic */ C41551w4 A00;

    public C29610D2l(C41551w4 c41551w4) {
        this.A00 = c41551w4;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        java.util.Set set = this.A00.A0K;
        return C2BS.A00(Integer.valueOf(AbstractC001800i.A03(set, ((C41181vS) obj).A0j)), Integer.valueOf(AbstractC001800i.A03(set, ((C41181vS) obj2).A0j)));
    }
}
