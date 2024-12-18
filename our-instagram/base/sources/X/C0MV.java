package X;

import android.content.Context;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

/* renamed from: X.0MV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0MV {
    public static final List A05 = new ArrayList(2);
    public final Context A00;
    public final Object A01 = new Object();
    public final Map A02 = new HashMap();
    public final C20130yk A03;
    public final File A04;

    public static void A00(C0MV c0mv, String str, int i, long j) {
        File[] listFiles = new File(c0mv.A04, "reports").listFiles(new C12200kO(str, 0));
        if (listFiles != null) {
            Arrays.sort(listFiles, new C15110pR(2));
            long currentTimeMillis = System.currentTimeMillis();
            int i2 = 0;
            while (true) {
                int length = listFiles.length;
                if (i2 < length) {
                    File file = listFiles[i2];
                    if (i2 >= length - i) {
                        try {
                        } catch (IOException e) {
                            C0PC.A00().DEh("DeleteTooManyReports", e, null);
                            C0K8.A0P("lacrima", "Cannot delete report dir: %s", file.getName(), e);
                        }
                        if (file.lastModified() >= currentTimeMillis - j) {
                            i2++;
                        }
                    }
                    c0mv.A03(file);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public static void A01(File file, FileFilter fileFilter, List list, java.util.Set set) {
        C0BJ.A00("buildFiles");
        try {
            File[] listFiles = file.listFiles(fileFilter);
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    try {
                        String canonicalPath = file2.getCanonicalPath();
                        if (file2.isDirectory()) {
                            if (!set.contains(canonicalPath)) {
                                set.add(canonicalPath);
                                A01(file2, fileFilter, list, set);
                            }
                        } else {
                            list.add(file2);
                        }
                    } catch (IOException e) {
                        C0PC.A00().DEh("GlobalCleanBuildFile", e, null);
                    }
                }
            }
        } finally {
            C0BI.A00();
        }
    }

    public final void A04(File file, String str) {
        File[] listFiles;
        synchronized (this.A01) {
            File[] listFiles2 = file.listFiles();
            if (listFiles2 != null) {
                for (File file2 : listFiles2) {
                    if (file2.getName().endsWith("_attach.txt")) {
                        Properties properties = new Properties();
                        try {
                            FileReader fileReader = new FileReader(file2);
                            try {
                                properties.load(fileReader);
                                fileReader.close();
                                Iterator<String> it = properties.stringPropertyNames().iterator();
                                while (it.hasNext()) {
                                    String property = properties.getProperty(it.next());
                                    try {
                                        Map map = this.A02;
                                        if (map.get(property) != null && ((Integer) map.get(property)).intValue() == 1) {
                                            File file3 = new File(property);
                                            if (!file3.getPath().startsWith("/system/")) {
                                                file3.delete();
                                            }
                                        }
                                        Integer num = (Integer) map.get(property);
                                        if (num != null) {
                                            int intValue = num.intValue();
                                            if (intValue == 1) {
                                                map.remove(property);
                                            } else {
                                                map.put(property, Integer.valueOf(intValue - 1));
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                try {
                                    fileReader.close();
                                } catch (Throwable th3) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                                }
                                throw th2;
                                break;
                            }
                        } catch (IllegalArgumentException e) {
                            C0PC.A00().DEh("DelAttachments", e, null);
                            C0K8.A0D("lacrima", "malformed Unicode present in input, ignoring it.");
                        }
                    }
                    C04610Md A00 = C04610Md.A00(str);
                    synchronized (A00.A03) {
                        try {
                            C02R.A03(A00.A02, "Did you call FixedLengthFiles.init()?");
                            if (file2.length() != A00.A01 || (listFiles = A00.A02.listFiles()) == null || listFiles.length >= A00.A00 || !file2.renameTo(new File(A00.A02, AnonymousClass001.A0R(UUID.randomUUID().toString(), "_prop.txt")))) {
                                file2.delete();
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
                file.delete();
            }
        }
    }

    public C0MV(Context context, C20130yk c20130yk, File file) {
        this.A00 = context;
        this.A04 = file;
        this.A03 = c20130yk;
    }

    public final void A02() {
        C0BJ.A00("updateRefCounts");
        try {
            synchronized (this.A01) {
                ArrayList arrayList = new ArrayList();
                A01(this.A04, new C14920p6(2), arrayList, new HashSet());
                Map map = this.A02;
                map.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    File file = (File) it.next();
                    Properties properties = new Properties();
                    try {
                        FileReader fileReader = new FileReader(file);
                        try {
                            properties.load(fileReader);
                            fileReader.close();
                        } catch (Throwable th) {
                            try {
                                fileReader.close();
                            } catch (Throwable th2) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            }
                            throw th;
                            break;
                        }
                    } catch (IllegalArgumentException e) {
                        C0PC.A00().DEh("MalformUnicode", e, null);
                        C0K8.A0D("lacrima", "malformed Unicode present in input, ignoring it.");
                    }
                    Iterator<String> it2 = properties.stringPropertyNames().iterator();
                    while (it2.hasNext()) {
                        String property = properties.getProperty(it2.next());
                        Integer num = (Integer) map.get(property);
                        if (num == null) {
                            map.put(property, 1);
                        } else {
                            map.put(property, Integer.valueOf(num.intValue() + 1));
                        }
                    }
                }
            }
        } finally {
            C0BI.A00();
        }
    }

    public final void A03(File file) {
        synchronized (C0MV.class) {
            Iterator it = A05.iterator();
            while (it.hasNext()) {
                it.next();
            }
            A04(file, "reports");
        }
    }
}
