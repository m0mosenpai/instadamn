package X;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.android.exoplayer2.util.Util;
import java.io.File;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;

/* renamed from: X.2QF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2QF extends C2QG {
    public Object A00;
    public boolean A01;
    public int A02;
    public long A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final File A07;
    public final Handler A08;
    public final HashMap A09;
    public final HashMap A0A;
    public final Random A0B;

    @Override // X.C2QG
    public final synchronized long A06(String str) {
        long longValue;
        Long l = (Long) this.A09.get(str);
        if (l != null) {
            longValue = l.longValue();
        } else {
            longValue = -1;
        }
        return longValue;
    }

    @Override // X.C2QG
    public final synchronized String A07() {
        StringBuilder sb;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        sb = new StringBuilder();
        for (C49802Qq c49802Qq : this.A0A.values()) {
            long j = elapsedRealtime - c49802Qq.A01;
            sb.append("lockDurationMs:");
            sb.append(j);
            sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            sb.append("waitCount:");
            sb.append(c49802Qq.A00);
            sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            sb.append("key:");
            sb.append(c49802Qq.A06);
            sb.append("\r\n");
        }
        return sb.toString();
    }

    @Override // X.C2QG
    public final synchronized void A09(InterfaceC46402Bc interfaceC46402Bc) {
        super.A02.add(interfaceC46402Bc);
    }

    @Override // X.C2QG
    public final synchronized void A0B(String str, long j) {
        this.A09.put(str, Long.valueOf(j));
    }

    @Override // X.C2QE
    public final synchronized NavigableSet A9D(InterfaceC46412Bd interfaceC46412Bd, String str) {
        Map map = super.A03;
        List list = (List) map.get(str);
        if (list == null) {
            list = new ArrayList();
            map.put(str, list);
        }
        list.add(interfaceC46412Bd);
        return Ajh(str);
    }

    @Override // X.C2QE
    public final synchronized void A9J(String str) {
        super.A04.add(str);
    }

    @Override // X.C2QE
    public final synchronized void AC5(SEO seo, String str) {
        throw new RuntimeException();
    }

    @Override // X.C2QE
    public final synchronized void AId(File file, long j) {
        boolean z;
        String A0D;
        C49802Qq c49802Qq = null;
        Matcher matcher = C4JC.A01.matcher(file.getName());
        if (matcher.matches() && (A0D = Util.A0D(matcher.group(1))) != null) {
            c49802Qq = new C49802Qq(file, A0D, Long.parseLong(matcher.group(2)), file.length(), Long.parseLong(matcher.group(3)), true);
            z = true;
        } else {
            z = false;
        }
        C4B8.A04(z);
        C4B8.A04(this.A0A.containsKey(c49802Qq.A06));
        if (file.exists()) {
            if (j == 0) {
                file.delete();
            } else {
                A03(c49802Qq);
                notifyAll();
            }
        }
    }

    @Override // X.C2QE
    public final synchronized long Aja() {
        return super.A05;
    }

    @Override // X.C2QE
    public final synchronized long Ajd(long j, String str, long j2) {
        throw new RuntimeException();
    }

    @Override // X.C2QE
    public final synchronized NavigableSet Ajh(String str) {
        TreeSet treeSet;
        NavigableSet navigableSet = (NavigableSet) super.A01.get(str);
        if (navigableSet != null && !navigableSet.isEmpty()) {
            treeSet = new TreeSet((SortedSet) navigableSet);
        } else {
            treeSet = new TreeSet();
        }
        return treeSet;
    }

    @Override // X.C2QE
    public final synchronized InterfaceC65245Tgb Ar2(String str) {
        throw new RuntimeException();
    }

    @Override // X.C2QE
    public final synchronized java.util.Set BKo() {
        return new HashSet(super.A01.keySet());
    }

    @Override // X.C2QE
    public final synchronized void EEJ(C49802Qq c49802Qq) {
        boolean z = false;
        if (c49802Qq == this.A0A.remove(c49802Qq.A06)) {
            z = true;
        }
        C4B8.A04(z);
        notifyAll();
    }

    @Override // X.C2QE
    public final synchronized void EFe(InterfaceC46412Bd interfaceC46412Bd, String str) {
        Map map = super.A03;
        List list = (List) map.get(str);
        if (list != null) {
            list.remove(interfaceC46412Bd);
            if (list.isEmpty()) {
                map.remove(str);
            }
        }
    }

    @Override // X.C2QE
    public final synchronized void EGD(String str) {
        Iterator it = Ajh(str).iterator();
        while (it.hasNext()) {
            EGK((C49802Qq) it.next());
        }
    }

    @Override // X.C2QE
    public final synchronized void EGK(C49802Qq c49802Qq) {
        AbstractMap abstractMap = super.A01;
        String str = c49802Qq.A06;
        NavigableSet navigableSet = (NavigableSet) abstractMap.get(str);
        long j = super.A05;
        long j2 = c49802Qq.A03;
        super.A05 = j - j2;
        if (navigableSet == null || !navigableSet.remove(c49802Qq)) {
            super.A00.DEJ("removeSpan failed", str, (int) c49802Qq.A04, (int) j2);
        }
        c49802Qq.A05.delete();
        if (navigableSet != null && navigableSet.isEmpty()) {
            abstractMap.remove(str);
            super.A04.remove(str);
            this.A09.remove(str);
        }
        A0A(c49802Qq);
    }

    @Override // X.C2QE
    public final synchronized File EnK(String str, long j, long j2) {
        File file;
        C4B8.A04(this.A0A.containsKey(str));
        File file2 = this.A07;
        if (!file2.exists()) {
            A0D();
            file2.mkdirs();
        }
        InterfaceC46402Bc interfaceC46402Bc = super.A00;
        if (interfaceC46402Bc != null) {
            interfaceC46402Bc.Do1(this, str, j, j2);
        }
        Iterator it = super.A02.iterator();
        while (it.hasNext()) {
            ((InterfaceC46402Bc) it.next()).Do1(this, str, j, j2);
        }
        if (this.A04) {
            File file3 = new File(file2, Integer.toString(this.A0B.nextInt(this.A02)));
            if (!file3.exists()) {
                file3.mkdir();
            }
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".");
            sb.append(j);
            sb.append(".");
            sb.append(currentTimeMillis);
            sb.append(".v2.exo");
            file = new File(file3, sb.toString());
        } else {
            long currentTimeMillis2 = System.currentTimeMillis();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(".");
            sb2.append(j);
            sb2.append(".");
            sb2.append(currentTimeMillis2);
            sb2.append(".v2.exo");
            file = new File(file2, sb2.toString());
        }
        return file;
    }

    @Override // X.C2QE
    public final synchronized C49802Qq Enn(Integer num, String str, long j, long j2) {
        return A01(new C49802Qq(null, str, j, -1L, -1L, false), num);
    }

    @Override // X.C2QE
    public final synchronized void release() {
        throw new RuntimeException();
    }

    private C49802Qq A00(C49802Qq c49802Qq) {
        String str = c49802Qq.A06;
        long j = c49802Qq.A04;
        NavigableSet navigableSet = (NavigableSet) super.A01.get(str);
        if (navigableSet != null) {
            C49802Qq c49802Qq2 = (C49802Qq) navigableSet.floor(c49802Qq);
            if (c49802Qq2 != null) {
                long j2 = c49802Qq2.A04;
                if (j2 <= j && j < j2 + c49802Qq2.A03) {
                    if (!c49802Qq2.A05.exists()) {
                        A0D();
                        return A00(c49802Qq);
                    }
                    return c49802Qq2;
                }
            }
            C49802Qq c49802Qq3 = (C49802Qq) navigableSet.ceiling(c49802Qq);
            if (c49802Qq3 != null) {
                return new C49802Qq(null, str, j, c49802Qq3.A04 - j, -1L, false);
            }
        }
        return new C49802Qq(null, str, j, -1L, -1L, false);
    }

    private synchronized C49802Qq A01(C49802Qq c49802Qq, Integer num) {
        try {
            AbstractC460729r.A01("exo-startReadWriteNonBlocking");
            C49802Qq A00 = A00(c49802Qq);
            if (A00.A07) {
                AbstractMap abstractMap = super.A01;
                String str = A00.A06;
                NavigableSet navigableSet = (NavigableSet) abstractMap.get(str);
                if (navigableSet == null || !navigableSet.remove(A00)) {
                    InterfaceC46402Bc interfaceC46402Bc = super.A00;
                    if (interfaceC46402Bc != null) {
                        interfaceC46402Bc.DEJ("startReadWriteNonBlocking", str, (int) A00.A04, (int) A00.A03);
                    }
                    Iterator it = super.A02.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC46402Bc) it.next()).DEJ("startReadWriteNonBlocking", str, (int) A00.A04, (int) A00.A03);
                    }
                }
                long currentTimeMillis = System.currentTimeMillis();
                File file = A00.A05;
                File parentFile = file.getParentFile();
                long j = A00.A04;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".");
                sb.append(j);
                sb.append(".");
                sb.append(currentTimeMillis);
                sb.append(".v2.exo");
                File file2 = new File(parentFile, sb.toString());
                file.renameTo(file2);
                C49802Qq c49802Qq2 = new C49802Qq(file2, str, j, file2.length(), currentTimeMillis, true);
                navigableSet.add(c49802Qq2);
                List list = (List) super.A03.get(str);
                if (list != null) {
                    int size = list.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ((InterfaceC46412Bd) list.get(size)).DnS(this, A00, c49802Qq2, num);
                    }
                }
                InterfaceC46402Bc interfaceC46402Bc2 = super.A00;
                if (interfaceC46402Bc2 != null) {
                    interfaceC46402Bc2.DnS(this, A00, c49802Qq2, num);
                }
                Iterator it2 = super.A02.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC46412Bd) it2.next()).DnS(this, A00, c49802Qq2, num);
                }
                return c49802Qq2;
            }
            HashMap hashMap = this.A0A;
            String str2 = c49802Qq.A06;
            if (!hashMap.containsKey(str2)) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                A00.A01 = elapsedRealtime;
                A00.A08 = elapsedRealtime;
                hashMap.put(str2, A00);
            } else {
                A00 = null;
            }
            return A00;
        } finally {
            AbstractC460729r.A00();
        }
    }

    private void A03(C49802Qq c49802Qq) {
        AbstractMap abstractMap = super.A01;
        String str = c49802Qq.A06;
        java.util.Set set = (java.util.Set) abstractMap.get(str);
        if (set == null) {
            set = new TreeSet();
            abstractMap.put(str, set);
        }
        set.add(c49802Qq);
        super.A05 += c49802Qq.A03;
        List list = (List) super.A03.get(str);
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((InterfaceC46412Bd) list.get(size)).DnP(this, c49802Qq);
                }
            }
        }
        InterfaceC46402Bc interfaceC46402Bc = super.A00;
        if (interfaceC46402Bc != null) {
            interfaceC46402Bc.DnP(this, c49802Qq);
        }
        Iterator it = super.A02.iterator();
        while (it.hasNext()) {
            ((InterfaceC46412Bd) it.next()).DnP(this, c49802Qq);
        }
    }

    @Override // X.C2QG
    public final void A08() {
        Object obj = this.A00;
        synchronized (obj) {
            if (!this.A01) {
                obj.wait();
            }
        }
    }

    @Override // X.C2QG
    public final void A0A(C49802Qq c49802Qq) {
        List list = (List) super.A03.get(c49802Qq.A06);
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((InterfaceC46412Bd) list.get(size)).DnQ(this, c49802Qq);
                }
            }
        }
        InterfaceC46402Bc interfaceC46402Bc = super.A00;
        if (interfaceC46402Bc != null) {
            interfaceC46402Bc.DnQ(this, c49802Qq);
        }
        Iterator it = super.A02.iterator();
        while (it.hasNext()) {
            ((InterfaceC46412Bd) it.next()).DnQ(this, c49802Qq);
        }
    }

    @Override // X.C2QG
    public final boolean A0C() {
        return this.A01;
    }

    public final void A0D() {
        Iterator it = super.A01.entrySet().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((NavigableSet) ((Map.Entry) it.next()).getValue()).iterator();
            boolean z = true;
            while (it2.hasNext()) {
                C49802Qq c49802Qq = (C49802Qq) it2.next();
                if (!c49802Qq.A05.exists()) {
                    it2.remove();
                    if (c49802Qq.A07) {
                        super.A05 -= c49802Qq.A03;
                    }
                    A0A(c49802Qq);
                } else {
                    z = false;
                }
            }
            if (z) {
                it.remove();
            }
        }
    }

    @Override // X.C2QE
    public final synchronized boolean CR2(String str, long j, long j2) {
        C49802Qq c49802Qq;
        NavigableSet navigableSet = (NavigableSet) super.A01.get(str);
        if (navigableSet != null && (c49802Qq = (C49802Qq) navigableSet.floor(new C49802Qq(null, str, j, -1L, -1L, false))) != null) {
            long j3 = c49802Qq.A04 + c49802Qq.A03;
            if (j3 > j) {
                long j4 = j + j2;
                if (j3 < j4) {
                    for (C49802Qq c49802Qq2 : navigableSet.tailSet(c49802Qq, false)) {
                        long j5 = c49802Qq2.A04;
                        if (j5 > j3) {
                            break;
                        }
                        j3 = Math.max(j3, j5 + c49802Qq2.A03);
                        if (j3 >= j4) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.C2QE
    public final boolean CR5(String str, long j, long j2) {
        if (this.A06 && !this.A01) {
            return false;
        }
        return CR2(str, j, j2);
    }

    @Override // X.C2QE
    public final boolean CXn(String str) {
        return super.A04.contains(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
    
        android.util.Log.w("SimpleCache", X.AnonymousClass001.A0r("lock expired after ", "ms for span: ", r9, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d8, code lost:
    
        r0 = -868297321;
     */
    @Override // X.C2QE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized X.C49802Qq Enm(java.lang.Integer r27, java.lang.String r28, long r29, long r31) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2QF.Enm(java.lang.Integer, java.lang.String, long, long):X.2Qq");
    }

    public C2QF(Handler handler, InterfaceC46402Bc interfaceC46402Bc, File file, ArrayList arrayList, int i, long j, boolean z, boolean z2, boolean z3) {
        super(interfaceC46402Bc, arrayList);
        this.A00 = new Object();
        try {
            AbstractC460729r.A01("VPS-SimpleCacheConstructor");
            this.A05 = z2;
            this.A07 = file;
            this.A0A = new HashMap();
            this.A09 = new HashMap();
            this.A0B = new Random();
            this.A04 = z3;
            this.A02 = i;
            this.A06 = z;
            this.A03 = j;
            this.A08 = handler;
            new Thread() { // from class: X.2QH
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    C2QF c2qf = C2QF.this;
                    synchronized (c2qf) {
                        try {
                            AbstractC460729r.A01("VPS-SimpleCacheInit");
                            File file2 = c2qf.A07;
                            if (!file2.exists()) {
                                file2.mkdirs();
                            }
                            C2QF.A02(c2qf, file2, true);
                            AbstractC460729r.A00();
                            Object obj = c2qf.A00;
                            synchronized (obj) {
                                try {
                                    c2qf.A01 = true;
                                    obj.notifyAll();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            AbstractC460729r.A00();
                            throw th2;
                        }
                    }
                }
            }.start();
        } finally {
            AbstractC460729r.A00();
        }
    }

    public static void A02(C2QF c2qf, File file, boolean z) {
        int lastIndexOf;
        int lastIndexOf2;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            if (!z && listFiles.length == 0) {
                file.delete();
                return;
            }
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) == -1) {
                    A02(c2qf, file2, false);
                } else {
                    long length = file2.length();
                    String name = file2.getName();
                    int lastIndexOf3 = name.lastIndexOf(46);
                    if (lastIndexOf3 != -1 && (lastIndexOf = name.lastIndexOf(46, lastIndexOf3 - 1)) != -1 && (lastIndexOf2 = name.lastIndexOf(46, lastIndexOf - 1)) != -1) {
                        String substring = name.substring(lastIndexOf2 + 1, lastIndexOf);
                        int lastIndexOf4 = name.lastIndexOf(46, lastIndexOf2 - 1);
                        if (lastIndexOf4 != -1) {
                            String substring2 = name.substring(lastIndexOf4 + 1, lastIndexOf2);
                            String substring3 = name.substring(0, lastIndexOf4);
                            if (length == -1) {
                                length = file2.length();
                            }
                            if (length != 0) {
                                try {
                                    long parseLong = Long.parseLong(substring);
                                    long parseLong2 = Long.parseLong(substring2);
                                    if (length <= 0) {
                                        length = file2.length();
                                    }
                                    c2qf.A03(new C49802Qq(file2, substring3, parseLong2, length, parseLong, true));
                                } catch (NumberFormatException e) {
                                    android.util.Log.e("CacheSpan", AnonymousClass001.A0R("invalid filename: ", name), e);
                                }
                            }
                        }
                    }
                    file2.delete();
                }
            }
        }
    }
}
