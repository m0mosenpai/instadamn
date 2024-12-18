package X;

import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public final class YFR implements C5OV {
    public final long A00;
    public final EnumC72370Xc6 A01;
    public final EnumC72347Xbj A02;
    public final String A03;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        int i;
        C14360o3.A0B(c5ow, 0);
        EnumC72370Xc6 enumC72370Xc6 = this.A01;
        EnumC72347Xbj enumC72347Xbj = this.A02;
        String str = c5ow.A01;
        String str2 = this.A03;
        if (!C14360o3.A0K(str, str2)) {
            C14360o3.A0A(str2);
            if (!str2.equals(str)) {
                c5ow = new C5OW(c5ow.A00, str2);
            }
        }
        Integer num = enumC72370Xc6.A00;
        long j = this.A00;
        if (enumC72347Xbj instanceof C72249Xa5) {
            C14360o3.A0A(num);
            long A01 = c5ow.A01(num);
            if (A01 != 0 && System.currentTimeMillis() < A01 + TimeUnit.SECONDS.toMillis(j)) {
                return false;
            }
        } else {
            if (enumC72347Xbj instanceof C72250Xa6) {
                C14360o3.A0A(num);
                long A012 = c5ow.A01(num);
                if (A012 != 0) {
                    i = (System.currentTimeMillis() > (A012 + TimeUnit.SECONDS.toMillis(j)) ? 1 : (System.currentTimeMillis() == (A012 + TimeUnit.SECONDS.toMillis(j)) ? 0 : -1));
                }
            } else {
                boolean z = enumC72347Xbj instanceof C72248Xa4;
                C14360o3.A0A(num);
                i = (c5ow.A00(num) > j ? 1 : (c5ow.A00(num) == j ? 0 : -1));
                if (!z) {
                    return MSY.A1R(i);
                }
            }
            if (i > 0) {
                return false;
            }
        }
        return true;
    }

    public YFR(EnumC72370Xc6 enumC72370Xc6, EnumC72347Xbj enumC72347Xbj, String str, long j) {
        this.A03 = str;
        this.A01 = enumC72370Xc6;
        this.A02 = enumC72347Xbj;
        this.A00 = j;
    }
}
