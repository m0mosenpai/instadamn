package X;

/* renamed from: X.Inp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42265Inp implements InterfaceC41501vz {
    public final /* synthetic */ C38J A00;

    public C42265Inp(C38J c38j) {
        this.A00 = c38j;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(1090136744);
        int A032 = C0f9.A03(300312972);
        C38977HEf c38977HEf = this.A00.A09;
        if (c38977HEf == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        c38977HEf.notifyDataSetChanged();
        C0f9.A0A(507259706, A032);
        C0f9.A0A(-1064184454, A03);
    }
}
