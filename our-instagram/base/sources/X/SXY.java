package X;

/* loaded from: classes10.dex */
public abstract class SXY {
    public static final SXY A00 = new Object();

    public final String A00(String str) {
        if (this instanceof RDB) {
            return str;
        }
        if (this instanceof RDC) {
            RDC rdc = (RDC) this;
            return rdc.A00.A00(rdc.A01.A00(str));
        }
        if (this instanceof RD9) {
            return AnonymousClass001.A0R(str, ((RD9) this).A00);
        }
        if (this instanceof RD8) {
            return AnonymousClass001.A0R(((RD8) this).A00, str);
        }
        RDA rda = (RDA) this;
        return AnonymousClass001.A0g(rda.A00, str, rda.A01);
    }
}
