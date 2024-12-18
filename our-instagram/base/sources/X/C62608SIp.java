package X;

import java.math.BigInteger;
import java.util.Date;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.SIp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62608SIp {
    public final String A00;
    public final BigInteger A01;
    public final Date A02;
    public final Date A03;
    public final X500Principal A04;
    public final boolean A05;

    public C62608SIp(String str, BigInteger bigInteger, Date date, Date date2, X500Principal x500Principal, boolean z) {
        this.A00 = str;
        this.A01 = bigInteger;
        this.A04 = x500Principal;
        this.A03 = date;
        this.A02 = date2;
        this.A05 = z;
    }
}
