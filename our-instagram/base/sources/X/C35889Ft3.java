package X;

/* renamed from: X.Ft3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35889Ft3 implements InterfaceC216113n {
    public final int A00;
    public final String A01;

    public C35889Ft3(String str, int i) {
        this.A00 = i;
        this.A01 = str;
    }

    @Override // X.InterfaceC216113n
    public final /* bridge */ /* synthetic */ Object get() {
        String str;
        int i = this.A00;
        C1Ee c1Ee = new C1Ee();
        String str2 = this.A01;
        if (2 - i != 0) {
            str = "hallpass_id";
        } else {
            str = "ndx_request_source";
        }
        c1Ee.A05(str, str2);
        return c1Ee;
    }
}
