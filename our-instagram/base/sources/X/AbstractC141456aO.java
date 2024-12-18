package X;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6aO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC141456aO {
    public static final AlC A00(C41181vS c41181vS) {
        URL url;
        C14360o3.A0B(c41181vS, 0);
        C84823qW A00 = AbstractC120715dH.A00(EnumC75383a5.A0O, c41181vS.A0c());
        if (A00 != null && (url = A00.A0R) != null) {
            return new AlC(url, AlC.A03);
        }
        return null;
    }

    public static final boolean A02(AlC alC) {
        long j;
        String str = null;
        if (alC != null && (str = alC.A00.A0B) == null) {
            str = "";
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        if (alC != null) {
            j = alC.A00();
        } else {
            j = 0;
        }
        if (j <= TimeUnit.MILLISECONDS.toSeconds(new Date().getTime()) && (alC == null || alC.A00.A06 == null)) {
            return false;
        }
        return true;
    }

    public static final boolean A03(AlC alC) {
        if (alC != null) {
            URL url = alC.A00;
            Boolean bool = url.A01;
            return (bool == null || bool.booleanValue()) && !C14360o3.A0K(url.A02, true);
        }
        return false;
    }

    public static final boolean A01(AlC alC) {
        long j;
        if (alC != null) {
            j = alC.A00();
        } else {
            j = 0;
        }
        if (j > TimeUnit.MILLISECONDS.toSeconds(new Date().getTime())) {
            return false;
        }
        return true;
    }
}
