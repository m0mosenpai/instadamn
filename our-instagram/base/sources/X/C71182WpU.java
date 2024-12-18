package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: X.WpU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71182WpU implements Closeable {
    public int A00;
    public long A01;
    public Writer A03;
    public final File A07;
    public final File A08;
    public final File A09;
    public final File A0D;
    public static final Charset A0F = Charset.forName("US-ASCII");
    public static final Charset A0G = Charset.forName(ReactWebViewManager.HTML_ENCODING);
    public static final Pattern A0H = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final OutputStream A0E = new VCO();
    public long A02 = 0;
    public final LinkedHashMap A0A = new LinkedHashMap(0, 0.75f, true);
    public long A04 = 0;
    public final ThreadPoolExecutor A0C = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final Callable A0B = new CallableC71666WyI(this, 1);
    public final int A05 = 2;
    public final int A06 = 1;

    public C71182WpU(File file, long j) {
        this.A07 = file;
        this.A08 = new File(file, "journal");
        this.A09 = new File(file, "journal.tmp");
        this.A0D = new File(file, "journal.bkp");
        this.A01 = j;
    }

    public static synchronized void A00(C69601Vs4 c69601Vs4, C71182WpU c71182WpU, boolean z) {
        synchronized (c71182WpU) {
            C69705Vu0 c69705Vu0 = c69601Vs4.A02;
            if (c69705Vu0.A00 == c69601Vs4) {
                if (z && !c69705Vu0.A01) {
                    for (int i = 0; i < c71182WpU.A06; i = 1) {
                        if (c69601Vs4.A03[i]) {
                            if (!c69705Vu0.A01().exists()) {
                                c69601Vs4.A00();
                                break;
                            }
                        } else {
                            c69601Vs4.A00();
                            throw AbstractC31175DnJ.A0U("Newly created entry didn't create value for index ", i);
                        }
                    }
                }
                for (int i2 = 0; i2 < c71182WpU.A06; i2 = 1) {
                    File A01 = c69705Vu0.A01();
                    if (z) {
                        if (A01.exists()) {
                            File A00 = c69705Vu0.A00();
                            A01.renameTo(A00);
                            long[] jArr = c69705Vu0.A03;
                            long j = jArr[i2];
                            long length = A00.length();
                            jArr[i2] = length;
                            c71182WpU.A02 = (c71182WpU.A02 - j) + length;
                        }
                    } else {
                        A04(A01);
                    }
                }
                c71182WpU.A00++;
                c69705Vu0.A00 = null;
                if (c69705Vu0.A01 | z) {
                    c69705Vu0.A01 = true;
                    Writer writer = c71182WpU.A03;
                    String str = c69705Vu0.A02;
                    StringBuilder sb = new StringBuilder();
                    long[] jArr2 = c69705Vu0.A03;
                    int length2 = jArr2.length;
                    for (int i3 = 0; i3 < length2; i3 = 1) {
                        long j2 = jArr2[i3];
                        sb.append(' ');
                        sb.append(j2);
                    }
                    writer.write(AnonymousClass001.A0h("CLEAN ", str, sb.toString(), '\n'));
                    if (z) {
                        c71182WpU.A04 = 1 + c71182WpU.A04;
                    }
                } else {
                    LinkedHashMap linkedHashMap = c71182WpU.A0A;
                    String str2 = c69705Vu0.A02;
                    linkedHashMap.remove(str2);
                    c71182WpU.A03.write(AnonymousClass001.A0S("REMOVE ", str2, '\n'));
                }
                c71182WpU.A03.flush();
                if (c71182WpU.A02 > c71182WpU.A01 || A06(c71182WpU)) {
                    c71182WpU.A0C.submit(c71182WpU.A0B);
                }
            }
        }
    }

    public static synchronized void A01(C71182WpU c71182WpU) {
        synchronized (c71182WpU) {
            Writer writer = c71182WpU.A03;
            if (writer != null) {
                writer.close();
            }
            File file = c71182WpU.A09;
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            Charset charset = A0F;
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, charset));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write(RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(c71182WpU.A05));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(c71182WpU.A06));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                Iterator A0k = AbstractC167007dF.A0k(c71182WpU.A0A);
                while (A0k.hasNext()) {
                    C69705Vu0 c69705Vu0 = (C69705Vu0) A0k.next();
                    if (c69705Vu0.A00 != null) {
                        bufferedWriter.write(AnonymousClass001.A0S("DIRTY ", c69705Vu0.A02, '\n'));
                    } else {
                        String str = c69705Vu0.A02;
                        StringBuilder sb = new StringBuilder();
                        long[] jArr = c69705Vu0.A03;
                        int length = jArr.length;
                        for (int i = 0; i < length; i = 1) {
                            long j = jArr[i];
                            sb.append(' ');
                            sb.append(j);
                        }
                        bufferedWriter.write(AnonymousClass001.A0h("CLEAN ", str, sb.toString(), '\n'));
                    }
                }
                bufferedWriter.close();
                File file2 = c71182WpU.A08;
                if (file2.exists()) {
                    File file3 = c71182WpU.A0D;
                    A04(file3);
                    if (!file2.renameTo(file3)) {
                        throw new IOException();
                    }
                }
                if (file.renameTo(file2)) {
                    c71182WpU.A0D.delete();
                    c71182WpU.A03 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2, true), charset));
                }
            } catch (Throwable th) {
                bufferedWriter.close();
                throw th;
            }
        }
    }

    public final synchronized void A07(String str) {
        if (this.A03 != null) {
            A05(str);
            LinkedHashMap linkedHashMap = this.A0A;
            C69705Vu0 c69705Vu0 = (C69705Vu0) linkedHashMap.get(str);
            if (c69705Vu0 != null && c69705Vu0.A00 == null) {
                for (int i = 0; i < this.A06; i = 1) {
                    File A00 = c69705Vu0.A00();
                    if (!A00.exists() || A00.delete()) {
                        long j = this.A02;
                        long[] jArr = c69705Vu0.A03;
                        this.A02 = j - jArr[i];
                        jArr[i] = 0;
                    } else {
                        throw new IOException(AbstractC167017dG.A0n(A00, "failed to delete ", new StringBuilder()));
                    }
                }
                this.A00++;
                this.A03.append((CharSequence) AnonymousClass001.A0S("REMOVE ", str, '\n'));
                linkedHashMap.remove(str);
                if (A06(this)) {
                    this.A0C.submit(this.A0B);
                }
            }
        } else {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.A03 != null) {
            LinkedHashMap linkedHashMap = this.A0A;
            Iterator A0n = AbstractC65702TsY.A0n(linkedHashMap.values());
            while (A0n.hasNext()) {
                C69601Vs4 c69601Vs4 = ((C69705Vu0) A0n.next()).A00;
                if (c69601Vs4 != null) {
                    c69601Vs4.A00();
                }
            }
            while (this.A02 > this.A01) {
                A07((String) MSZ.A0m(AbstractC166997dE.A14(linkedHashMap)));
            }
            this.A03.close();
            this.A03 = null;
        }
    }

    public static void A02(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void A05(String str) {
        if (A0H.matcher(str).matches()) {
        } else {
            throw new IllegalArgumentException(AnonymousClass001.A0g("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    public static boolean A06(C71182WpU c71182WpU) {
        int i = c71182WpU.A00;
        if (i >= 2000 && i >= c71182WpU.A0A.size()) {
            return true;
        }
        return false;
    }

    public static void A03(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    A03(file2);
                }
                if (!file2.delete()) {
                    throw new IOException(AbstractC167017dG.A0n(file2, "failed to delete file: ", new StringBuilder()));
                }
            }
            return;
        }
        throw new IOException(AbstractC167017dG.A0n(file, "not a readable directory: ", new StringBuilder()));
    }

    public static void A04(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }
}
