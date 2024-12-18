package X;

import android.content.Context;

/* loaded from: classes8.dex */
public final class MEG extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ EnumC162657Qc A03;
    public final /* synthetic */ EnumC101664hb A04;
    public final /* synthetic */ C2EY A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ Long A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MEG(Context context, EnumC162657Qc enumC162657Qc, EnumC101664hb enumC101664hb, C2EY c2ey, Integer num, Long l, int i, long j, boolean z, boolean z2) {
        super(0);
        this.A02 = context;
        this.A01 = j;
        this.A07 = l;
        this.A03 = enumC162657Qc;
        this.A09 = z;
        this.A08 = z2;
        this.A05 = c2ey;
        this.A04 = enumC101664hb;
        this.A06 = num;
        this.A00 = i;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Context context = this.A02;
        long j = this.A01;
        Long l = this.A07;
        EnumC162657Qc enumC162657Qc = this.A03;
        boolean z = this.A09;
        boolean z2 = this.A08;
        return AbstractC46811Kn6.A00(context, enumC162657Qc, this.A04, this.A05, this.A06, l, null, null, j, z, z2, AbstractC167007dF.A1O(this.A00));
    }
}
