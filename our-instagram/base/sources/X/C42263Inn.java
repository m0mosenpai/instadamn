package X;

/* renamed from: X.Inn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42263Inn implements InterfaceC41501vz {
    public final /* synthetic */ C33P A00;

    public C42263Inn(C33P c33p) {
        this.A00 = c33p;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int B6q;
        int BM3;
        EnumC79303gb enumC79303gb;
        int A03 = C0f9.A03(1748856019);
        C36096FwW c36096FwW = (C36096FwW) obj;
        int A032 = C0f9.A03(-794703041);
        C14360o3.A0B(c36096FwW, 0);
        boolean z = c36096FwW.A00;
        if (z) {
            C30E c30e = this.A00.A0G;
            if (C3u9.A00(c30e.A0J())) {
                c30e.A0V("autoplay_disabled", false, false);
            }
        }
        C33P c33p = this.A00;
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C3FQ c3fq = c33p.A03;
        if (c3fq != null && (B6q = c3fq.B6q()) <= (BM3 = c3fq.BM3())) {
            while (true) {
                C3Y7 A01 = C3Q5.A01(c33p.A0A, c33p.A0D, c3fq, B6q);
                if (A01 != null) {
                    if (z) {
                        enumC79303gb = EnumC79303gb.A03;
                    } else {
                        enumC79303gb = EnumC79303gb.A02;
                    }
                    C3Q5.A03(A01, enumC79303gb);
                }
                if (B6q == BM3) {
                    break;
                } else {
                    B6q++;
                }
            }
        }
        C0f9.A0A(-1363833180, A032);
        C0f9.A0A(-1149091692, A03);
    }
}
