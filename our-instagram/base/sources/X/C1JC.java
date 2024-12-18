package X;

import android.content.Context;
import android.os.Build;
import android.util.SparseArray;
import java.util.List;

/* renamed from: X.1JC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1JC {
    public String A00;
    public String A01;
    public String A06;
    public final SparseArray A07;
    public String A02 = C15G.A00().A00;
    public String A05 = String.valueOf(Build.VERSION.SDK_INT);
    public String A04 = Build.MODEL;
    public String A03 = Build.BRAND;

    public final boolean A00(int i) {
        List<C72804XnR> list;
        SparseArray sparseArray = this.A07;
        if (sparseArray.size() == 0 || (list = (List) sparseArray.get(i)) == null || list.isEmpty()) {
            return false;
        }
        for (C72804XnR c72804XnR : list) {
            String str = this.A05;
            String str2 = this.A04;
            String str3 = this.A02;
            String str4 = this.A03;
            String str5 = this.A01;
            String str6 = this.A00;
            String str7 = this.A06;
            String str8 = c72804XnR.A05;
            if (str8 == null || str8.equals(str)) {
                String str9 = c72804XnR.A04;
                if (str9 == null || str9.equalsIgnoreCase(str2)) {
                    String str10 = c72804XnR.A02;
                    if (str10 == null || str10.equalsIgnoreCase(str3)) {
                        String str11 = c72804XnR.A03;
                        if (str11 == null || str11.equalsIgnoreCase(str4)) {
                            String str12 = c72804XnR.A00;
                            if (str12 == null || str12.equals(str6)) {
                                String str13 = c72804XnR.A06;
                                if (str13 == null || str13.equals(str7)) {
                                    String str14 = c72804XnR.A01;
                                    if (str14 == null || str14.startsWith(str5) || str14.compareTo(str5) >= 0) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public C1JC(Context context, SparseArray sparseArray, String str) {
        String str2;
        this.A01 = "UNKNOWN";
        this.A00 = "UNKNOWN";
        this.A06 = "UNKNOWN";
        this.A07 = sparseArray;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str2 = "UNKNOWN";
        }
        this.A01 = str2;
        try {
            this.A06 = String.valueOf(C04100Kb.A00(context));
        } catch (Exception unused2) {
            this.A06 = "UNKNOWN";
        }
        if (str != null) {
            this.A00 = str;
        }
    }
}
