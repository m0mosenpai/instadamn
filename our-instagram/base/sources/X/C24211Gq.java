package X;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1Gq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24211Gq {
    public static final Charset A08 = Charset.forName("US-ASCII");
    public C27341Um A00;
    public AtomicInteger A01;
    public boolean A02;
    public final InterfaceC14020nS A03;
    public final File A04;
    public final String A05;
    public final int A06;
    public final List A07 = new LinkedList();

    public final void A01(AbstractC12990ll abstractC12990ll) {
        LinkedList linkedList;
        synchronized (this) {
            List list = this.A07;
            linkedList = new LinkedList(list);
            list.clear();
        }
        this.A03.ATO(new RcU(abstractC12990ll, this, linkedList));
    }

    public static void A00(C24211Gq c24211Gq, List list) {
        BufferedWriter bufferedWriter;
        File file = c24211Gq.A04;
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                try {
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), A08));
                } catch (IOException unused) {
                    return;
                }
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
            if (0 == 0) {
                throw th;
            }
        }
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C60472pW c60472pW = (C60472pW) it.next();
                StringBuilder sb = new StringBuilder();
                sb.append(c60472pW.A04);
                sb.append("@");
                sb.append(c60472pW.A00);
                sb.append("@");
                sb.append(c60472pW.A01);
                sb.append("@");
                sb.append(c60472pW.A05);
                sb.append("@");
                sb.append(c60472pW.A02);
                sb.append("@");
                sb.append(c60472pW.A03);
                sb.append(C60472pW.A06);
                String obj = sb.toString();
                C14360o3.A07(obj);
                bufferedWriter.write(obj);
            }
            bufferedWriter.close();
        } catch (IOException e2) {
            e = e2;
            bufferedWriter2 = bufferedWriter;
            C0w9.A03("IgCacheLoggerImpl", AbstractC13670mt.A06("IOException found for file %s. Error message: %s", file.getName(), e.getLocalizedMessage()));
            if (bufferedWriter2 != null) {
                bufferedWriter2.close();
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            try {
                bufferedWriter2.close();
                throw th;
            } catch (IOException unused2) {
                throw th;
            }
        }
    }

    public C24211Gq(File file, String str, int i) {
        this.A05 = str;
        this.A06 = i;
        File file2 = new File(file, AbstractC13670mt.A06("%s%s", str, "v3"));
        this.A04 = file2;
        if (!file2.exists()) {
            file2.createNewFile();
        }
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "IgCacheLogger";
        this.A03 = new C18240vB(A00);
        this.A01 = new AtomicInteger();
        this.A03.ATO(new AbstractRunnableC14200nk() { // from class: X.1Gr
            {
                super(297, 3, false, true);
            }

            @Override // java.lang.Runnable
            public final void run() {
                C24211Gq c24211Gq = C24211Gq.this;
                c24211Gq.A00 = new C27341Um(c24211Gq.A04);
                c24211Gq.A02 = true;
            }
        });
    }

    public final void A02(String str, String str2, int i, int i2, long j) {
        C60472pW c60472pW = new C60472pW(Integer.toHexString(str.hashCode()), str2, i, i2, j);
        if (this.A02) {
            C27341Um c27341Um = this.A00;
            c27341Um.getClass();
            int i3 = c60472pW.A00;
            Map map = c27341Um.A00;
            if (i3 == 0) {
                String str3 = c60472pW.A04;
                boolean containsKey = map.containsKey(str3);
                map.put(str3, Long.valueOf(c60472pW.A03));
                if (containsKey) {
                    return;
                }
            } else {
                map.remove(c60472pW.A04);
            }
        }
        synchronized (this) {
            List list = this.A07;
            if (list.size() > this.A06) {
                final LinkedList linkedList = new LinkedList(list);
                list.clear();
                this.A03.ATO(new AbstractRunnableC14200nk() { // from class: X.5iy
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(296);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C24211Gq.A00(C24211Gq.this, linkedList);
                    }
                });
            } else {
                list.add(c60472pW);
            }
        }
    }
}
