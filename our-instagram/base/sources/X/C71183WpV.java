package X;

import android.os.StrictMode;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.WpV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71183WpV implements Closeable {
    public int A00;
    public Writer A02;
    public final File A07;
    public final File A08;
    public final File A09;
    public final File A0D;
    public long A01 = 0;
    public final LinkedHashMap A0A = new LinkedHashMap(0, 0.75f, true);
    public long A04 = 0;
    public final ThreadPoolExecutor A0C = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), (ThreadFactory) new Object());
    public final Callable A0B = new CallableC71666WyI(this, 0);
    public final int A05 = 1;
    public final int A06 = 1;
    public long A03 = 262144000;

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    public C71183WpV(File file) {
        this.A07 = file;
        this.A08 = new File(file, "journal");
        this.A09 = new File(file, "journal.tmp");
        this.A0D = new File(file, "journal.bkp");
    }

    public static synchronized void A00(C69582Vrl c69582Vrl, C71183WpV c71183WpV, boolean z) {
        synchronized (c71183WpV) {
            C69371VmH c69371VmH = c69582Vrl.A01;
            if (c69371VmH.A00 == c69582Vrl) {
                if (z && !c69371VmH.A01) {
                    for (int i = 0; i < c71183WpV.A06; i = 1) {
                        if (c69582Vrl.A02[i]) {
                            if (!c69371VmH.A03[i].exists()) {
                                c69582Vrl.A00();
                                break;
                            }
                        } else {
                            c69582Vrl.A00();
                            throw AbstractC31175DnJ.A0U("Newly created entry didn't create value for index ", i);
                        }
                    }
                }
                for (int i2 = 0; i2 < c71183WpV.A06; i2 = 1) {
                    File file = c69371VmH.A03[i2];
                    if (z) {
                        if (file.exists()) {
                            File file2 = c69371VmH.A02[i2];
                            file.renameTo(file2);
                            long[] jArr = c69371VmH.A05;
                            long j = jArr[i2];
                            long length = file2.length();
                            jArr[i2] = length;
                            c71183WpV.A01 = (c71183WpV.A01 - j) + length;
                        }
                    } else {
                        A05(file);
                    }
                }
                c71183WpV.A00++;
                c69371VmH.A00 = null;
                if (c69371VmH.A01 | z) {
                    c69371VmH.A01 = true;
                    c71183WpV.A02.append((CharSequence) "CLEAN");
                    c71183WpV.A02.append(' ');
                    c71183WpV.A02.append((CharSequence) c69371VmH.A04);
                    Writer writer = c71183WpV.A02;
                    StringBuilder sb = new StringBuilder();
                    long[] jArr2 = c69371VmH.A05;
                    int length2 = jArr2.length;
                    for (int i3 = 0; i3 < length2; i3 = 1) {
                        long j2 = jArr2[i3];
                        sb.append(' ');
                        sb.append(j2);
                    }
                    writer.append((CharSequence) sb.toString());
                    c71183WpV.A02.append('\n');
                    if (z) {
                        c71183WpV.A04 = 1 + c71183WpV.A04;
                    }
                } else {
                    LinkedHashMap linkedHashMap = c71183WpV.A0A;
                    String str = c69371VmH.A04;
                    linkedHashMap.remove(str);
                    c71183WpV.A02.append((CharSequence) "REMOVE");
                    c71183WpV.A02.append(' ');
                    c71183WpV.A02.append((CharSequence) str);
                    c71183WpV.A02.append('\n');
                }
                A06(c71183WpV.A02);
                if (c71183WpV.A01 > c71183WpV.A03 || A08(c71183WpV)) {
                    c71183WpV.A0C.submit(c71183WpV.A0B);
                }
            }
        }
    }

    public static synchronized void A03(C71183WpV c71183WpV) {
        synchronized (c71183WpV) {
            Writer writer = c71183WpV.A02;
            if (writer != null) {
                A07(writer);
            }
            File file = c71183WpV.A09;
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            Charset charset = AbstractC70064W0y.A00;
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, charset));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write(RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(c71183WpV.A05));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(c71183WpV.A06));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                Iterator A0k = AbstractC167007dF.A0k(c71183WpV.A0A);
                while (A0k.hasNext()) {
                    C69371VmH c69371VmH = (C69371VmH) A0k.next();
                    if (c69371VmH.A00 != null) {
                        bufferedWriter.write(AnonymousClass001.A0S("DIRTY ", c69371VmH.A04, '\n'));
                    } else {
                        String str = c69371VmH.A04;
                        StringBuilder sb = new StringBuilder();
                        long[] jArr = c69371VmH.A05;
                        int length = jArr.length;
                        for (int i = 0; i < length; i = 1) {
                            long j = jArr[i];
                            sb.append(' ');
                            sb.append(j);
                        }
                        bufferedWriter.write(AnonymousClass001.A0h("CLEAN ", str, sb.toString(), '\n'));
                    }
                }
                A07(bufferedWriter);
                File file2 = c71183WpV.A08;
                if (file2.exists()) {
                    File file3 = c71183WpV.A0D;
                    A05(file3);
                    if (!file2.renameTo(file3)) {
                        throw new IOException();
                    }
                }
                if (file.renameTo(file2)) {
                    c71183WpV.A0D.delete();
                    c71183WpV.A02 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2, true), charset));
                }
            } catch (Throwable th) {
                A07(bufferedWriter);
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.A02 != null) {
            Iterator A0n = AbstractC65702TsY.A0n(this.A0A.values());
            while (A0n.hasNext()) {
                C69582Vrl c69582Vrl = ((C69371VmH) A0n.next()).A00;
                if (c69582Vrl != null) {
                    c69582Vrl.A00();
                }
            }
            A02(this);
            A07(this.A02);
            this.A02 = null;
        }
    }

    public static void A01(C71183WpV c71183WpV) {
        if (c71183WpV.A02 != null) {
        } else {
            throw new IllegalStateException("cache is closed");
        }
    }

    public static void A02(C71183WpV c71183WpV) {
        while (c71183WpV.A01 > c71183WpV.A03) {
            LinkedHashMap linkedHashMap = c71183WpV.A0A;
            String str = (String) MSZ.A0m(AbstractC166997dE.A14(linkedHashMap));
            synchronized (c71183WpV) {
                A01(c71183WpV);
                C69371VmH c69371VmH = (C69371VmH) linkedHashMap.get(str);
                if (c69371VmH != null && c69371VmH.A00 == null) {
                    for (int i = 0; i < c71183WpV.A06; i = 1) {
                        File file = c69371VmH.A02[i];
                        if (file.exists() && !file.delete()) {
                            throw new IOException(AbstractC167017dG.A0n(file, "failed to delete ", new StringBuilder()));
                        }
                        long j = c71183WpV.A01;
                        long[] jArr = c69371VmH.A05;
                        c71183WpV.A01 = j - jArr[i];
                        jArr[i] = 0;
                    }
                    c71183WpV.A00++;
                    A04(c71183WpV, c71183WpV.A02, "REMOVE", str);
                    linkedHashMap.remove(str);
                    if (A08(c71183WpV)) {
                        c71183WpV.A0C.submit(c71183WpV.A0B);
                    }
                }
            }
        }
    }

    public static boolean A08(C71183WpV c71183WpV) {
        int i = c71183WpV.A00;
        if (i >= 2000 && i >= c71183WpV.A0A.size()) {
            return true;
        }
        return false;
    }

    public static void A04(C71183WpV c71183WpV, Writer writer, CharSequence charSequence, CharSequence charSequence2) {
        writer.append(charSequence);
        c71183WpV.A02.append(' ');
        c71183WpV.A02.append(charSequence2);
        c71183WpV.A02.append('\n');
    }

    public static void A05(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void A06(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void A07(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
