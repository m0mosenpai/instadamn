package X;

import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Sgz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63298Sgz {
    public static volatile AbstractC61295RlF A08;
    public final SET A00;
    public final String A01;
    public final Object A02;
    public volatile int A03 = -1;
    public volatile Object A04;
    public static final Object A06 = AbstractC58318PtA.A0b();
    public static final AtomicReference A07 = new AtomicReference();
    public static final AtomicInteger A05 = new AtomicInteger();

    /* JADX WARN: Type inference failed for: r1v1, types: [X.Tji, X.T5p, java.lang.Object] */
    public static void A00(final Context context) {
        if (A08 == null) {
            synchronized (A06) {
                if (A08 == null) {
                    AbstractC61295RlF abstractC61295RlF = A08;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (abstractC61295RlF != null) {
                        if (((RLB) abstractC61295RlF).A00 != context) {
                            synchronized (SZ9.class) {
                                try {
                                    Map map = SZ9.A07;
                                    Iterator A16 = AbstractC166997dE.A16(map);
                                    while (A16.hasNext()) {
                                        SZ9 sz9 = (SZ9) A16.next();
                                        sz9.A00.unregisterContentObserver(sz9.A01);
                                    }
                                    map.clear();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            synchronized (S7C.class) {
                                try {
                                    Map map2 = S7C.A00;
                                    Iterator A162 = AbstractC166997dE.A16(map2);
                                    if (!A162.hasNext()) {
                                        map2.clear();
                                    } else {
                                        A162.next();
                                        throw AbstractC166987dD.A15("zzb");
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            synchronized (SES.class) {
                            }
                        }
                    }
                    InterfaceC65411Tji interfaceC65411Tji = new InterfaceC65411Tji() { // from class: X.T5o
                        @Override // X.InterfaceC65411Tji
                        public final Object FFc() {
                            THe tHe;
                            THe tHe2;
                            Context context2 = context;
                            THe tHe3 = S7A.A00;
                            if (tHe3 == null) {
                                synchronized (S7A.class) {
                                    tHe = S7A.A00;
                                    if (tHe == null) {
                                        String str = Build.TYPE;
                                        String str2 = Build.TAGS;
                                        if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                                            if (!context2.isDeviceProtectedStorage()) {
                                                context2 = context2.createDeviceProtectedStorageContext();
                                            }
                                            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                            try {
                                                StrictMode.allowThreadDiskWrites();
                                                try {
                                                    File A0w = MSW.A0w(context2.getDir("phenotype_hermetic", 0), "overrides.txt");
                                                    if (A0w.exists()) {
                                                        tHe2 = new RLG(A0w);
                                                    } else {
                                                        tHe2 = RLH.A00;
                                                    }
                                                } catch (RuntimeException e) {
                                                    android.util.Log.e("HermeticFileOverrides", "no data dir", e);
                                                    tHe2 = RLH.A00;
                                                }
                                                if (tHe2 instanceof RLG) {
                                                    Object obj = ((RLG) tHe2).A00;
                                                    try {
                                                        BufferedReader A0h = AbstractC58320PtC.A0h(new FileInputStream((File) obj));
                                                        try {
                                                            C005001p c005001p = new C005001p(0);
                                                            HashMap A1G = AbstractC166987dD.A1G();
                                                            while (true) {
                                                                String readLine = A0h.readLine();
                                                                if (readLine == null) {
                                                                    break;
                                                                }
                                                                String[] split = readLine.split(" ", 3);
                                                                if (split.length != 3) {
                                                                    android.util.Log.e("HermeticFileOverrides", AnonymousClass001.A0R("Invalid: ", readLine));
                                                                } else {
                                                                    String str3 = new String(split[0]);
                                                                    String decode = android.net.Uri.decode(new String(split[1]));
                                                                    String A0h2 = AbstractC31171DnF.A0h(split[2], A1G);
                                                                    if (A0h2 == null) {
                                                                        String str4 = new String(split[2]);
                                                                        A0h2 = android.net.Uri.decode(str4);
                                                                        if (A0h2.length() < 1024 || A0h2 == str4) {
                                                                            A1G.put(str4, A0h2);
                                                                        }
                                                                    }
                                                                    C005001p c005001p2 = (C005001p) c005001p.get(str3);
                                                                    if (c005001p2 == null) {
                                                                        c005001p2 = new C005001p(0);
                                                                        c005001p.put(str3, c005001p2);
                                                                    }
                                                                    c005001p2.put(decode, A0h2);
                                                                }
                                                            }
                                                            android.util.Log.w("HermeticFileOverrides", AnonymousClass001.A0u("Parsed ", obj.toString(), " for Android package ", context2.getPackageName()));
                                                            C62444SBx c62444SBx = new C62444SBx(c005001p);
                                                            A0h.close();
                                                            tHe = new RLG(c62444SBx);
                                                        } catch (Throwable th3) {
                                                            try {
                                                                A0h.close();
                                                            } catch (Throwable th4) {
                                                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                                            }
                                                            throw th3;
                                                        }
                                                    } catch (IOException e2) {
                                                        throw AbstractC58318PtA.A0f(e2);
                                                    }
                                                } else {
                                                    tHe = RLH.A00;
                                                }
                                            } finally {
                                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                                            }
                                        } else {
                                            tHe = RLH.A00;
                                        }
                                        S7A.A00 = tHe;
                                    }
                                }
                                return tHe;
                            }
                            return tHe3;
                        }
                    };
                    ?? obj = new Object();
                    obj.A01 = interfaceC65411Tji;
                    A08 = new RLB(context, obj);
                    A05.incrementAndGet();
                }
            }
        }
    }

    public static void A01(String str, Object obj, String str2) {
        android.util.Log.e("PhenotypeFlag", AnonymousClass001.A0u(str, str2, ": ", (String) obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00f8 A[Catch: all -> 0x010c, TryCatch #8 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:15:0x002f, B:17:0x003f, B:19:0x004d, B:22:0x005d, B:24:0x0063, B:26:0x006d, B:27:0x0075, B:34:0x0091, B:36:0x0097, B:37:0x0099, B:68:0x00d5, B:69:0x00d9, B:71:0x00df, B:73:0x00e5, B:74:0x00e7, B:80:0x0104, B:81:0x00f3, B:82:0x0106, B:103:0x0103, B:100:0x00f8, B:102:0x00fd, B:106:0x010a), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[Catch: all -> 0x010c, TryCatch #8 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:15:0x002f, B:17:0x003f, B:19:0x004d, B:22:0x005d, B:24:0x0063, B:26:0x006d, B:27:0x0075, B:34:0x0091, B:36:0x0097, B:37:0x0099, B:68:0x00d5, B:69:0x00d9, B:71:0x00df, B:73:0x00e5, B:74:0x00e7, B:80:0x0104, B:81:0x00f3, B:82:0x0106, B:103:0x0103, B:100:0x00f8, B:102:0x00fd, B:106:0x010a), top: B:4:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02() {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63298Sgz.A02():java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object A03(Object obj) {
        boolean z;
        if (this instanceof RLF) {
            try {
                return RLP.A01(Base64.decode((String) obj, 3));
            } catch (IOException | IllegalArgumentException unused) {
                A01("Invalid byte[] value for ", obj, this.A01);
                return null;
            }
        }
        if (this instanceof RLE) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused2) {
                A01("Invalid double value for ", obj, this.A01);
                return null;
            }
        }
        if (this instanceof RLD) {
            if (AbstractC31175DnJ.A1Z(obj, AbstractC62377S9b.A02)) {
                z = true;
            } else if (AbstractC31175DnJ.A1Z(obj, AbstractC62377S9b.A03)) {
                z = false;
            } else {
                A01("Invalid boolean value for ", obj, this.A01);
                return null;
            }
            return Boolean.valueOf(z);
        }
        try {
            return AbstractC25228BEl.A13((String) obj);
        } catch (NumberFormatException unused3) {
            A01("Invalid long value for ", obj, this.A01);
            return null;
        }
    }

    public /* synthetic */ AbstractC63298Sgz(SET set, Object obj, String str) {
        if (set.A00 != null) {
            this.A00 = set;
            this.A01 = str;
            this.A02 = obj;
            return;
        }
        throw AbstractC166987dD.A12("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }
}
