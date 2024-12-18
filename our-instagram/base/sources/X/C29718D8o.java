package X;

import com.instagram.api.schemas.RepostRestrictedReason;

/* renamed from: X.D8o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29718D8o extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29718D8o(Object obj, Object obj2, String str, String str2, int i, boolean z) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = z;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                ((C5yI) this.A01).Dfj((RepostRestrictedReason) this.A02, this.A03, this.A04, this.A05);
                break;
            case 1:
                AbstractC25227BEk.A1N(this.A03, this.A04, (InterfaceC16610sE) this.A02, this.A05);
                C2UY.A01.A06();
                AbstractC25227BEk.A1A((InterfaceC74953Yl) this.A01, true);
                break;
            default:
                N6J n6j = (N6J) this.A02;
                boolean z = this.A05;
                N6J.A0C((C128175qm) this.A01, n6j, this.A03, this.A04, z);
                break;
        }
        return C0eB.A00;
    }
}
