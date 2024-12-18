package X;

/* renamed from: X.Mht, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51094Mht extends AbstractC154146wP {
    public final /* synthetic */ N7M A00;
    public final /* synthetic */ boolean A01;

    public C51094Mht(N7M n7m, boolean z) {
        this.A01 = z;
        this.A00 = n7m;
    }

    @Override // X.AbstractC154146wP
    public final int A03(int i) {
        int itemViewType;
        if (!this.A01 && (itemViewType = ((C2UU) this.A00.A07.getValue()).getItemViewType(i)) != 0 && itemViewType != 2) {
            return 3;
        }
        return 1;
    }
}
