package X;

/* renamed from: X.SpG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63548SpG implements C1N8 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C63548SpG(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    @Override // X.C1N8
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C2JS c2js;
        C2GT c2gt;
        QRH A0E;
        if (this.A00 != 0) {
            R0M r0m = (R0M) obj;
            if (r0m != null && (A0E = r0m.A0E()) != null) {
                c2js = A0E.getOptionalTreeField(3, "non_auth_step_up_error", QRG.class, -2119733934);
            } else {
                c2js = null;
            }
            C1N8 c1n8 = (C1N8) this.A01;
            if (c2js == null || (c2gt = (C2GT) c1n8.apply(c2js)) == null) {
                return null;
            }
            Object obj2 = this.A03;
            Object obj3 = this.A02;
            C63406Sjd.A0B(c2gt, new C63626SqY(7, r0m, obj3, obj2));
            return obj3;
        }
        C62731SNv c62731SNv = (C62731SNv) obj;
        C14360o3.A0B(c62731SNv, 0);
        return ((C62991SaF) this.A03).A01.A00(c62731SNv, (SLG) this.A01, (C63019Saj) this.A02);
    }
}
