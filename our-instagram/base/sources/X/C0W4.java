package X;

import android.content.Context;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0W4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0W4 {
    public static final FilenameFilter A07 = new FilenameFilter() { // from class: X.0Vx
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            if (!str.startsWith("override-")) {
                if (str.endsWith(".log") || str.endsWith(".zip") || str.endsWith(".tmp")) {
                    return true;
                }
                return false;
            }
            return false;
        }
    };
    public static final FilenameFilter A08 = new FilenameFilter() { // from class: X.0Vy
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            if (str.startsWith("override-") && str.endsWith(".log")) {
                return true;
            }
            return false;
        }
    };
    public int A00 = 0;
    public long A01 = 0;
    public C0W3 A02 = new Object();
    public File A03;
    public File A04;
    public File A05;
    public final File A06;

    public static void A01(C0W4 c0w4, File file, File file2, FilenameFilter[] filenameFilterArr, long j) {
        List asList;
        if (!file.exists() && !file.isDirectory()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (FilenameFilter filenameFilter : filenameFilterArr) {
            File[] listFiles = file.listFiles(filenameFilter);
            if (listFiles == null) {
                asList = Collections.EMPTY_LIST;
            } else {
                asList = Arrays.asList(listFiles);
            }
            arrayList.addAll(asList);
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            File file3 = (File) it.next();
            if (file3.lastModified() < currentTimeMillis) {
                boolean A03 = A03(c0w4, file3, new File(file2, file3.getName()));
                C0W3 c0w3 = c0w4.A02;
                if (A03) {
                    c0w3.A05++;
                } else {
                    c0w3.A04++;
                }
            }
        }
    }

    public static void A02(final C0W4 c0w4, File file, FilenameFilter[] filenameFilterArr, int i) {
        List asList;
        if (!file.exists() && !file.isDirectory()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        do {
            File[] listFiles = file.listFiles(filenameFilterArr[i2]);
            if (listFiles == null) {
                asList = Collections.EMPTY_LIST;
            } else {
                asList = Arrays.asList(listFiles);
            }
            arrayList.addAll(asList);
            i2++;
        } while (i2 < 2);
        if (arrayList.size() <= i) {
            return;
        }
        Collections.sort(arrayList, new Comparator() { // from class: X.0W1
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                return ((File) obj).getName().compareTo(((File) obj2).getName());
            }
        });
        Iterator it = arrayList.subList(0, arrayList.size() - i).iterator();
        while (it.hasNext()) {
            boolean delete = ((File) it.next()).delete();
            C0W3 c0w3 = c0w4.A02;
            if (delete) {
                c0w3.A06++;
            } else {
                c0w3.A04++;
            }
        }
    }

    public static boolean A03(C0W4 c0w4, File file, File file2) {
        if (file.renameTo(file2)) {
            return true;
        }
        c0w4.A02.A03++;
        if (file.exists() && !file.delete()) {
            c0w4.A02.A02++;
        }
        return false;
    }

    public static List A00(final C0W4 c0w4, File file) {
        File[] listFiles = file.listFiles(new FileFilter() { // from class: X.0W2
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return file2.isFile();
            }
        });
        if (listFiles == null) {
            return Collections.EMPTY_LIST;
        }
        return Arrays.asList(listFiles);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.0W3] */
    public C0W4(Context context) {
        File file = new File(context.getFilesDir(), "profilo");
        this.A06 = file;
        if (!file.exists() && !file.mkdirs()) {
            throw new IllegalStateException("Unable to initialize Profilo folder");
        }
        this.A05 = new File(this.A06, "upload");
        this.A03 = new File(this.A06, "crash_dumps");
        this.A04 = new File(this.A06, "mmap_buffer");
    }

    public final void A04(File file, boolean z) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf != -1) {
            name = name.substring(0, lastIndexOf);
        }
        String A0R = AnonymousClass001.A0R(name, ".log");
        if (z) {
            A0R = AnonymousClass001.A0R("override-", A0R);
        }
        File file2 = this.A05;
        if (!file2.isDirectory() && !file2.mkdirs()) {
            this.A02.A01++;
            return;
        }
        boolean renameTo = file.renameTo(new File(file2, A0R));
        C0W3 c0w3 = this.A02;
        if (renameTo) {
            c0w3.A00++;
        } else {
            c0w3.A03++;
        }
        File file3 = this.A06;
        long j = this.A01;
        FilenameFilter filenameFilter = A07;
        FilenameFilter filenameFilter2 = A08;
        A01(this, file2, file3, new FilenameFilter[]{filenameFilter, filenameFilter2}, j);
        A02(this, file3, new FilenameFilter[]{filenameFilter, filenameFilter2}, this.A00);
    }
}
