package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.PhoneStateListener;
import android.util.Pair;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.0qc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC15820qc {
    public static int A00 = -1;
    public static int A01 = -1;
    public static PhoneStateListener A02;
    public static C108404uR A03;

    public static final Pair A02(Context context) {
        C14360o3.A0B(context, 0);
        return A03(A01(context));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r4.isConnected() != true) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.util.Pair A03(android.net.NetworkInfo r4) {
        /*
            r2 = 1
            if (r4 == 0) goto La
            boolean r1 = r4.isConnected()
            r0 = 1
            if (r1 == r2) goto Lb
        La:
            r0 = 0
        Lb:
            java.lang.String r3 = "none"
            if (r0 == 0) goto L62
            java.lang.String r0 = r4.getTypeName()
            if (r0 == 0) goto L60
            java.lang.String r0 = r4.getTypeName()
            X.C14360o3.A07(r0)
            int r0 = r0.length()
            if (r0 == 0) goto L60
            java.lang.String r1 = r4.getTypeName()
            X.C14360o3.A07(r1)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r1.toLowerCase(r0)
            X.C14360o3.A07(r2)
        L33:
            java.lang.String r0 = r4.getSubtypeName()
            if (r0 == 0) goto L56
            java.lang.String r0 = r4.getSubtypeName()
            X.C14360o3.A07(r0)
            int r0 = r0.length()
            if (r0 == 0) goto L56
            java.lang.String r1 = r4.getSubtypeName()
            X.C14360o3.A07(r1)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r3 = r1.toLowerCase(r0)
            X.C14360o3.A07(r3)
        L56:
            r0 = r3
            r3 = r2
        L58:
            android.util.Pair r0 = android.util.Pair.create(r3, r0)
            X.C14360o3.A07(r0)
            return r0
        L60:
            r2 = r3
            goto L33
        L62:
            r0 = r3
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC15820qc.A03(android.net.NetworkInfo):android.util.Pair");
    }

    public static final String A08(Context context) {
        C14360o3.A0B(context, 0);
        return A0A(A01(context));
    }

    public static final String A09(Context context) {
        C14360o3.A0B(context, 0);
        Pair A032 = A03(A01(context));
        return AnonymousClass001.A0T((String) A032.first, (String) A032.second, '-');
    }

    public static final String A0A(NetworkInfo networkInfo) {
        String str;
        String str2 = null;
        if (networkInfo != null) {
            str = networkInfo.getTypeName();
            str2 = networkInfo.getSubtypeName();
        } else {
            str = null;
        }
        if (str == null) {
            return "None";
        }
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        return AbstractC13670mt.A06("%s(%s)", str, str2);
    }

    public static final String A0B(NetworkInfo networkInfo) {
        String str;
        String str2 = null;
        if (networkInfo != null) {
            str = networkInfo.getTypeName();
            str2 = networkInfo.getSubtypeName();
        } else {
            str = null;
        }
        if (str2 != null) {
            str2 = AbstractC002300n.A0d(AbstractC002300n.A0d(str2, ".", "_", false), " ", "_", false);
        }
        if (str == null) {
            return "None";
        }
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        return AbstractC13670mt.A06("%s.%s", str, str2);
    }

    public static final boolean A0E(Context context) {
        C14360o3.A0B(context, 0);
        if (A05(A01(context)).A01 == C05F.A00) {
            return false;
        }
        return true;
    }

    public static final boolean A0F(Context context) {
        C14360o3.A0B(context, 0);
        NetworkInfo A032 = C18150uz.A0B.A01().A03();
        if (A032 == null) {
            return A0E(context);
        }
        return A032.isConnected();
    }

    public static final boolean A0G(Context context) {
        C14360o3.A0B(context, 0);
        if (A05(A01(context)).A01 != C05F.A01) {
            return false;
        }
        return true;
    }

    public static final NetworkInfo A01(Context context) {
        ConnectivityManager connectivityManager;
        Object systemService = context.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (systemService instanceof ConnectivityManager) {
            connectivityManager = (ConnectivityManager) systemService;
        } else {
            connectivityManager = null;
        }
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
                return networkInfo;
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Exception when in getActiveNetworkInfo() ");
                sb.append(e.getStackTrace());
                C0w9.A03("NetworkUtil", sb.toString());
            }
        }
        return networkInfo;
    }

    public static final C15790qZ A04() {
        return A05(C18150uz.A0B.A01().A03());
    }

    public static final C15790qZ A05(NetworkInfo networkInfo) {
        Integer num = C05F.A00;
        Integer num2 = C05F.A0Y;
        if (networkInfo != null && networkInfo.isConnected()) {
            int type = networkInfo.getType();
            int subtype = networkInfo.getSubtype();
            if (type != 0) {
                if (type != 1) {
                    if (type != 6) {
                        num = C05F.A0N;
                    } else {
                        num = C05F.A0C;
                        num2 = C05F.A0N;
                    }
                } else {
                    num = C05F.A01;
                }
            } else {
                num = C05F.A0C;
                if (subtype != 20) {
                    switch (subtype) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            num2 = C05F.A01;
                            break;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        case 14:
                        case Process.SIGTERM /* 15 */:
                            num2 = num;
                            break;
                        case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                            num2 = C05F.A0N;
                            break;
                    }
                } else {
                    num2 = C05F.A0j;
                }
            }
        }
        return new C15790qZ(num, num2);
    }

    public static final String A06() {
        NetworkInfo.DetailedState detailedState;
        String name;
        NetworkInfo A032 = C18150uz.A0B.A01().A03();
        if (A032 == null || (detailedState = A032.getDetailedState()) == null || (name = detailedState.name()) == null) {
            return "NULL";
        }
        return name;
    }

    public static final String A07() {
        Pair A032 = A03(C18150uz.A0B.A01().A03());
        return AnonymousClass001.A0T((String) A032.first, (String) A032.second, '-');
    }

    public static final String A0C(C15790qZ c15790qZ) {
        String A0T = AnonymousClass001.A0T(AbstractC15780qY.A00(c15790qZ.A01), AbstractC15770qX.A00(c15790qZ.A00), '-');
        C14360o3.A07(A0T);
        return A0T;
    }

    public static final boolean A0D() {
        if (A05(C18150uz.A0B.A01().A03()).A01 != C05F.A01) {
            return false;
        }
        return true;
    }

    public static final int A00() {
        WifiInfo A012;
        if (A0D()) {
            C108404uR c108404uR = A03;
            if (c108404uR != null && (A012 = c108404uR.A01()) != null) {
                A01 = WifiManager.calculateSignalLevel(A012.getRssi(), 5);
            }
            return A01;
        }
        return A00;
    }
}
