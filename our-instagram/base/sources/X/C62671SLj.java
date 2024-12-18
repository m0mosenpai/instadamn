package X;

/* renamed from: X.SLj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C62671SLj {
    public final C63146Sds A00;
    public final Object A01;
    public final Object A02;

    public String toString() {
        String str;
        C63146Sds c63146Sds = this.A00;
        String obj = c63146Sds.A03.toString();
        switch (S1B.A00(c63146Sds.A02).intValue()) {
            case 0:
                str = "FIRE_AND_FORGET";
                break;
            case 1:
                str = "ACKNOWLEDGED_DELIVERY";
                break;
            default:
                str = "ASSURED_DELIVERY";
                break;
        }
        return AnonymousClass001.A0T(obj, str, ' ');
    }

    public C62671SLj(C63146Sds c63146Sds, Object obj, Object obj2) {
        this.A00 = c63146Sds;
        this.A02 = obj;
        this.A01 = obj2;
    }
}
