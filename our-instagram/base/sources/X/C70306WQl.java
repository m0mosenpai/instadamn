package X;

/* renamed from: X.WQl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70306WQl implements InterfaceC58362lv {
    public final /* synthetic */ C2GT A00;
    public final /* synthetic */ C2GL A01;

    public C70306WQl(C2GT c2gt, C2GL c2gl) {
        this.A01 = c2gl;
        this.A00 = c2gt;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        SED sed = (SED) obj;
        C14360o3.A0B(sed, 0);
        Throwable th = sed.A01;
        if (th == null) {
            String str = (String) sed.A00;
            if (str != null) {
                this.A01.A02(str);
            }
        } else {
            th.getMessage();
            C2GL c2gl = this.A01;
            C69572Vrb c69572Vrb = ((C2GM) c2gl).A03;
            if (c69572Vrb != null) {
                c69572Vrb.A00(new Exception(th), "FAILURE", "FAILURE", AbstractC69851Vwc.A01(null, ((C2GM) c2gl).A00));
                String A04 = C18U.A04(C06090Tz.A06, c2gl.A03, 36873376572702733L);
                C2I1 c2i1 = C2I1.NONE;
                c2gl.A01(c2i1, c2i1, A04);
            } else {
                C14360o3.A0F("uplLogger");
                throw C00O.createAndThrow();
            }
        }
        this.A00.A05(C65705Tsd.A08);
        ((C2GM) this.A01).A04.clear();
    }
}
