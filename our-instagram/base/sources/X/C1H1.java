package X;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1H1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1H1 {
    public static final Charset A09 = Charset.forName("US-ASCII");
    public int A00 = 0;
    public Writer A01;
    public final int A02;
    public final C24261Gv A03;
    public final InterfaceC14020nS A04;
    public final File A05;
    public final File A06;
    public final File A07;
    public final File A08;

    public static String A00(String str, long j, boolean z) {
        StringBuilder sb = new StringBuilder("CLEAN");
        sb.append(' ');
        sb.append(str);
        sb.append(' ');
        sb.append(String.valueOf(j));
        sb.append(' ');
        sb.append(String.valueOf(z));
        sb.append('\n');
        return sb.toString();
    }

    public static void A01(C1H1 c1h1) {
        try {
            c1h1.A01 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c1h1.A06, true), A09));
        } catch (IOException unused) {
            Writer writer = c1h1.A01;
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException unused2) {
                }
            }
            c1h1.A01 = null;
        }
    }

    public final void A03() {
        ArrayList arrayList;
        Writer writer = this.A01;
        if (writer != null) {
            try {
                writer.close();
            } catch (IOException unused) {
            }
        }
        try {
            try {
                C24261Gv c24261Gv = this.A03;
                synchronized (c24261Gv.A06) {
                    arrayList = new ArrayList(c24261Gv.A08.values());
                }
                this.A00 = arrayList.size();
                File file = this.A08;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), A09));
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C1H2 c1h2 = (C1H2) it.next();
                        if (c1h2.A09()) {
                            bufferedWriter.write(A00(c1h2.A06, c1h2.A00(), c1h2.A08()));
                        } else {
                            bufferedWriter.write(AnonymousClass001.A0S("DIRTY ", c1h2.A06, '\n'));
                        }
                    }
                    bufferedWriter.flush();
                    File file2 = this.A06;
                    if (file2.exists()) {
                        file2.renameTo(this.A07);
                    }
                    file.renameTo(file2);
                    A01(this);
                    this.A07.delete();
                    bufferedWriter.close();
                } catch (IOException unused2) {
                    bufferedWriter.close();
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                        throw th;
                    } catch (IOException unused3) {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (IOException unused4) {
        }
    }

    public C1H1(C24261Gv c24261Gv, InterfaceC14020nS interfaceC14020nS, File file, int i) {
        this.A06 = new File(file, "journal");
        this.A08 = new File(file, "journal.tmp");
        this.A07 = new File(file, "journal.bkp");
        this.A05 = file;
        this.A03 = c24261Gv;
        this.A04 = interfaceC14020nS;
        this.A02 = Math.max(1000, i * 2);
    }

    public static void A02(File file, boolean z) {
        File[] listFiles;
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                String name = file2.getName();
                if ((name.endsWith(".tmp") || (z && (name.endsWith(".clean") || name.endsWith(".metadata")))) && file2.exists()) {
                    file2.delete();
                }
            }
        }
    }
}
