package X;

/* renamed from: X.V3x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC67958V3x extends C1P1 {
    public C70399WUb A00;
    public Long A01 = AbstractC31173DnH.A0g();
    public String A02;

    public AbstractC67958V3x(C70399WUb c70399WUb, String str) {
        this.A02 = str;
        this.A00 = c70399WUb;
    }

    private void A00(VHe vHe, C70399WUb c70399WUb) {
        Long valueOf = Long.valueOf(System.currentTimeMillis() - this.A01.longValue());
        String str = this.A02;
        C18920wW c18920wW = c70399WUb.A05;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_boost_platform_api_call");
        A00.AAP("flow_id", c70399WUb.A03);
        A00.AAP(AbstractC111324zv.A00(1920), str);
        A00.A9K("latency_ms", valueOf);
        A00.A8R(vHe, "result_type");
        A00.Cht();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b5, code lost:
    
        if (r0 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        if (r0 != false) goto L25;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x0071. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.InterfaceC40821up r4) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC67958V3x.A01(X.1up):void");
    }

    @Override // X.C1P1
    public void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1895372974);
        super.onFail(abstractC115105If);
        A00(VHe.FAILURE, this.A00);
        C0f9.A0A(-1737615023, A03);
    }

    @Override // X.C1P1
    public void onStart() {
        int A03 = C0f9.A03(-1479099202);
        super.onStart();
        this.A01 = AbstractC31173DnH.A0g();
        C0f9.A0A(-1076988579, A03);
    }
}
