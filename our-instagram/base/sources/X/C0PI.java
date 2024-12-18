package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

/* renamed from: X.0PI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0PI {
    public static String A04;
    public final C0Pe A00;
    public final File A01;
    public final List A02;
    public final C10760hk A03;
    public static final File[] A06 = new File[0];
    public static final Object A05 = new Object();

    public static final void A01(File file, String str) {
        synchronized (A05) {
            try {
                new File(file, AnonymousClass001.A0R(str, "_done")).createNewFile();
            } catch (IOException e) {
                C0K8.A0C("lacrima", "Marking session dir failed");
                C0PC.A00().DEh("MarkAssembled", e, null);
            }
        }
    }

    public static final boolean A02(File file, String str) {
        boolean exists;
        synchronized (A05) {
            exists = new File(file, AnonymousClass001.A0R(str, "_done")).exists();
        }
        return exists;
    }

    public final void A03(C024209q c024209q, File file, String str, List list) {
        String str2;
        C0BJ.A00("combineIntoReport");
        try {
            synchronized (A05) {
                C0BJ.A00("combineIntoProperties");
                try {
                    file.getName();
                    Collections.sort(list, new C15110pR(3));
                    Properties properties = new Properties();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        File file2 = (File) it.next();
                        C0BJ.A00(AnonymousClass001.A0R("include property file: ", file2.getName()));
                        Properties properties2 = new Properties();
                        try {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(file2);
                                try {
                                    properties2.load(fileInputStream);
                                    properties.putAll(properties2);
                                    fileInputStream.close();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                    }
                                    throw th;
                                    break;
                                }
                            } catch (IOException | IllegalArgumentException e) {
                                C0K8.A0O("lacrima", "Could not read property file %s", file2.getName(), e);
                                C0PC.A00().DEh("AssemblerReadPropFile", e, null);
                            }
                            C0BI.A00();
                        } finally {
                        }
                    }
                    if (c024209q != null) {
                        properties.put(C0LK.A95.A00, file.getName());
                        c024209q.A06(properties);
                    }
                    File file3 = new File(file, str);
                    try {
                        C10760hk c10760hk = this.A03;
                        boolean startsWith = str.startsWith(C0M6.CRITICAL_REPORT.A00);
                        if (!startsWith && !str.contains("java")) {
                            str2 = null;
                        } else {
                            str2 = "reports";
                        }
                        c10760hk.A02(file3, str2, properties);
                        if (C0PA.A04 && startsWith && (str.contains("java_app_death") || str.contains("native") || str.contains("anr_app_death") || str.contains("unexplained"))) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("report_name", str);
                            hashMap.put("report_size", String.valueOf(file3.length()));
                            hashMap.put("report_id", file.getName());
                            C0PA.A00("report_assembled", hashMap);
                        }
                    } catch (IOException e2) {
                        C0K8.A0O("lacrima", "Assembling report failed: %s %s", file.getName(), str, e2);
                        C0PC.A00().DEh("AssembleFail", e2, null);
                    }
                } finally {
                }
            }
        } finally {
        }
    }

    public C0PI(C10760hk c10760hk, C0Pe c0Pe) {
        this.A00 = c0Pe;
        this.A03 = c10760hk;
        File file = new File(c0Pe.A06, "reports");
        this.A01 = file;
        file.mkdirs();
        this.A02 = new ArrayList();
    }

    public static void A00(C0M6 c0m6, C0PI c0pi, File file, File file2, String str) {
        C0BJ.A00(AnonymousClass001.A0R("maybeAssembleReport.", c0m6.name()));
        try {
            synchronized (A05) {
                List<C0L1> list = c0pi.A02;
                list.size();
                for (C0L1 c0l1 : list) {
                    file.getName();
                    if (file2 != null) {
                        file2.getName();
                    }
                    c0l1.A04(c0m6, file, file2, str);
                }
                A01(file, "mixers");
            }
        } finally {
            C0BI.A00();
        }
    }
}
