package X;

import android.os.SystemClock;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0Pe, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Pe {
    public static C0OP A09;
    public static C0Pe A0A;
    public static Map A0B;
    public long A00;
    public long A01;
    public final int A02;
    public final C003801d A03;
    public final C0MV A04;
    public final File A05;
    public final File A06;
    public final String A07;
    public final String A08;
    public static final List A0D = new ArrayList();
    public static final Object A0C = new Object();

    public final File A01() {
        File file = this.A05;
        C02R.A03(file, "Did you call SessionManager.init()?");
        return file;
    }

    public final HashSet A03() {
        HashSet hashSet = new HashSet();
        File[] listFiles = this.A06.listFiles(new C14920p6(5));
        if (listFiles != null) {
            for (File file : listFiles) {
                String replaceFirst = file.getName().replaceFirst("session_", "").replaceFirst("sess_", "");
                int lastIndexOf = replaceFirst.lastIndexOf("_");
                if (lastIndexOf != -1) {
                    hashSet.add(replaceFirst.substring(0, lastIndexOf));
                }
            }
        }
        return hashSet;
    }

    public C0Pe(C0MV c0mv, InterfaceC04650Mh interfaceC04650Mh, File file, String str, String str2, int i) {
        File file2;
        A0B = new HashMap();
        this.A07 = str2;
        this.A06 = file;
        this.A08 = str;
        synchronized (this) {
            File file3 = this.A06;
            String A0g = AnonymousClass001.A0g("sess_", str2, "_");
            File[] A04 = A04(str2);
            int length = A04.length;
            String valueOf = String.valueOf(length >= 1 ? 1 + A00(A04[length - 1], str2) : 1L);
            StringBuffer stringBuffer = new StringBuffer(AnonymousClass001.A0R("000000000", valueOf).substring(valueOf.length()));
            stringBuffer.append("-");
            stringBuffer.append(str);
            file2 = new File(file3, AnonymousClass001.A0R(A0g, stringBuffer.toString()));
            file2.mkdirs();
        }
        this.A05 = file2;
        this.A04 = c0mv;
        this.A02 = i;
        File file4 = new File(file2, "state.txt");
        C07920bC ALA = interfaceC04650Mh.ALA(file4, 4096);
        this.A03 = new C003801d(ALA == null ? new C07920bC(file4, 4096) : ALA);
        long uptimeMillis = SystemClock.uptimeMillis();
        this.A01 = uptimeMillis;
        this.A00 = uptimeMillis;
        C04670Mj c04670Mj = C0L6.A04;
        if (c04670Mj != null) {
            c04670Mj.A04 = str;
            c04670Mj.A00 = this.A01;
            c04670Mj.A09 = file2;
        }
        List list = A0D;
        synchronized (list) {
            A0A = this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C05310Qd) it.next()).A00(this);
            }
            list.clear();
        }
    }

    public static long A00(File file, String str) {
        String replace = file.getName().replace(AnonymousClass001.A0g("sess_", str, "_"), "");
        int indexOf = replace.indexOf(45);
        if (indexOf != -1) {
            replace = replace.substring(0, indexOf);
        }
        try {
            return Long.parseLong(replace);
        } catch (NumberFormatException e) {
            C0PC.A00().DEh("SessMgrSessCount", e, null);
            return 0L;
        }
    }

    public final File A02(String str) {
        File[] A04 = A04(str);
        int length = A04.length;
        if (length < 2) {
            return null;
        }
        return A04[length - 2];
    }

    public final File[] A04(String str) {
        C0BJ.A00(AnonymousClass001.A0R("getOrderedSessionDirs.", str));
        try {
            File[] listFiles = this.A06.listFiles(new C12200kO(str, 2));
            if (listFiles == null) {
                listFiles = new File[0];
            } else {
                Arrays.sort(listFiles, new C15110pR(4));
            }
            return listFiles;
        } finally {
            C0BI.A00();
        }
    }
}
