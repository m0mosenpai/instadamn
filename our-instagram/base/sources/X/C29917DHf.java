package X;

import android.graphics.Bitmap;

/* renamed from: X.DHf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29917DHf extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ InterfaceC74963Ym A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29917DHf(Bitmap bitmap, InterfaceC74963Ym interfaceC74963Ym, long j, boolean z, boolean z2) {
        super(1);
        this.A04 = z;
        this.A02 = interfaceC74963Ym;
        this.A03 = z2;
        this.A01 = bitmap;
        this.A00 = j;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        AbstractC119825bg c62v;
        int i;
        AbstractC119825bg c62v2;
        InterfaceC1128857w interfaceC1128857w = (InterfaceC1128857w) obj;
        C14360o3.A0B(interfaceC1128857w, 0);
        float EqT = interfaceC1128857w.EqT(24.0f);
        boolean z2 = this.A04;
        long j = ((C1132359l) this.A02.getValue()).A00;
        if (z2) {
            long A00 = C5YB.A00(EqT, EqT);
            long A002 = AbstractC137636Lj.A00(interfaceC1128857w.EqT(3.0f), interfaceC1128857w.EqT(3.0f));
            z = this.A03;
            if (z) {
                c62v2 = C119815bf.A00;
            } else {
                c62v2 = new C62V(null, interfaceC1128857w.EqT(1.5f), 4.0f, 0, 0);
            }
            i = 3;
            interfaceC1128857w.AR4(null, c62v2, 1.0f, 3, j, 0L, A00, A002);
        } else {
            float f = EqT / 2.0f;
            long A003 = AbstractC119395aw.A00(f, f);
            z = this.A03;
            if (z) {
                c62v = C119815bf.A00;
            } else {
                c62v = new C62V(null, interfaceC1128857w.EqT(2.0f), 4.0f, 0, 0);
            }
            i = 3;
            interfaceC1128857w.AQe(null, c62v, f, 1.0f, 3, j, A003);
        }
        if (z) {
            C6LZ c6lz = new C6LZ(this.A01);
            long A004 = AbstractC113765Bo.A00(interfaceC1128857w.EL8(4.0f), interfaceC1128857w.EL8(4.0f));
            long A005 = AbstractC119215ad.A00(interfaceC1128857w.EL8(16.0f), interfaceC1128857w.EL8(16.0f));
            interfaceC1128857w.AQk(AbstractC25228BEl.A0a(this.A00), c6lz, C119815bf.A00, 1.0f, i, 1, 0L, AbstractC25236BEt.A08(c6lz.A00), A004, A005);
        }
        return C0eB.A00;
    }
}
