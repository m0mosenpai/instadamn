package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.DVv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30294DVv extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30294DVv(Object obj, Object obj2, String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        super(2);
        this.A00 = i4;
        this.A03 = i;
        this.A07 = str;
        this.A06 = str2;
        this.A04 = obj;
        this.A08 = z;
        this.A05 = obj2;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        int i2 = this.A03;
        if (i != 0) {
            String str = this.A07;
            String str2 = this.A06;
            AbstractC28304Cdq.A00(A0S, (C1132359l) this.A04, str, str2, (InterfaceC16820sZ) this.A05, i2, AbstractC25225BEi.A04(this.A01), this.A02, this.A08);
        } else {
            String str3 = this.A06;
            boolean z = this.A08;
            AbstractC27519CCp.A00(A0S, (ImmutableList) this.A04, str3, this.A07, (InterfaceC16820sZ) this.A05, i2, AbstractC25225BEi.A04(this.A01), this.A02, z);
        }
        return C0eB.A00;
    }
}
