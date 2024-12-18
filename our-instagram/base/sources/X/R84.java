package X;

import android.os.ConditionVariable;
import android.os.SystemClock;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;

/* loaded from: classes10.dex */
public final class R84 extends C2QG implements C2QE {
    public static final HashSet A0E = AbstractC166987dD.A1H();
    public C1121554i A00;
    public boolean A01;
    public long A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public long A06;
    public final InterfaceC46402Bc A07;
    public final C63017Sah A08;
    public final File A09;
    public final Object A0A;
    public final ArrayList A0B;
    public final HashMap A0C;
    public final Random A0D;

    @Override // X.C2QG
    public final synchronized long A06(String str) {
        SQ9 A00;
        A00 = C63017Sah.A00(this.A08, str);
        A00.getClass();
        return S2H.A00(A00.A00);
    }

    @Override // X.C2QG
    public final synchronized String A07() {
        StringBuilder A1C;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        A1C = AbstractC166987dD.A1C();
        Iterator it = Collections.unmodifiableCollection(this.A08.A03.values()).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((SQ9) it.next()).A04.iterator();
            while (it2.hasNext()) {
                C49802Qq c49802Qq = (C49802Qq) it2.next();
                long j = elapsedRealtime - c49802Qq.A01;
                A1C.append("lockDurationMs:");
                A1C.append(j);
                A1C.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                A1C.append("waitCount:");
                A1C.append(c49802Qq.A00);
                A1C.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                A1C.append("key:");
                A1C.append(c49802Qq.A06);
                A1C.append("\r\n");
            }
        }
        return A1C.toString();
    }

    @Override // X.C2QG
    public final synchronized void A09(InterfaceC46402Bc interfaceC46402Bc) {
        this.A0B.add(interfaceC46402Bc);
    }

    @Override // X.C2QG
    public final synchronized void A0B(String str, long j) {
    }

    public final synchronized void A0D() {
        C1121554i c1121554i = this.A00;
        if (c1121554i != null) {
            throw c1121554i;
        }
    }

    @Override // X.C2QE
    public final synchronized NavigableSet A9D(InterfaceC46412Bd interfaceC46412Bd, String str) {
        C4B8.A04(AbstractC167007dF.A1N(this.A04 ? 1 : 0));
        str.getClass();
        HashMap hashMap = this.A0C;
        List A18 = MSW.A18(str, hashMap);
        if (A18 == null) {
            A18 = AbstractC166987dD.A1E();
            hashMap.put(str, A18);
        }
        A18.add(interfaceC46412Bd);
        return Ajh(str);
    }

    @Override // X.C2QE
    public final synchronized void A9J(String str) {
    }

    @Override // X.C2QE
    public final synchronized void AC5(SEO seo, String str) {
        C4B8.A04(AbstractC167007dF.A1N(this.A04 ? 1 : 0));
        A0D();
        C63017Sah c63017Sah = this.A08;
        SQ9 A01 = c63017Sah.A01(str);
        A01.A00 = A01.A00.A01(seo);
        if (!r0.equals(r1)) {
            ((C64216T4f) c63017Sah.A00).A01 = true;
        }
        try {
            c63017Sah.A03();
        } catch (IOException e) {
            throw new IOException(e);
        }
    }

    @Override // X.C2QE
    public final synchronized void AId(File file, long j) {
        boolean z = true;
        C4B8.A04(AbstractC167007dF.A1N(this.A04 ? 1 : 0));
        if (file.exists()) {
            if (j == 0) {
                file.delete();
            } else {
                C63017Sah c63017Sah = this.A08;
                RFh A00 = RFh.A00(c63017Sah, file, j);
                A00.getClass();
                SQ9 A002 = C63017Sah.A00(c63017Sah, A00.A06);
                A002.getClass();
                long j2 = A00.A04;
                long j3 = A00.A03;
                C4B8.A04(A002.A03(j2, j3));
                long A003 = S2H.A00(A002.A00);
                if (A003 != -1) {
                    if (j2 + j3 > A003) {
                        z = false;
                    }
                    C4B8.A04(z);
                }
                A03(A00);
                try {
                    c63017Sah.A03();
                    notifyAll();
                } catch (IOException e) {
                    throw new IOException(e);
                }
            }
        }
    }

    @Override // X.C2QE
    public final synchronized long Aja() {
        C4B8.A04(AbstractC167007dF.A1N(this.A04 ? 1 : 0));
        return this.A06;
    }

    @Override // X.C2QE
    public final synchronized long Ajd(long j, String str, long j2) {
        long j3;
        C4B8.A04(AbstractC167007dF.A1N(this.A04 ? 1 : 0));
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        SQ9 A00 = C63017Sah.A00(this.A08, str);
        if (A00 != null) {
            j3 = A00.A00(j, j2);
        } else {
            j3 = -j2;
        }
        return j3;
    }

    @Override // X.C2QE
    public final synchronized NavigableSet Ajh(String str) {
        TreeSet treeSet;
        C4B8.A04(AbstractC167007dF.A1N(this.A04 ? 1 : 0));
        SQ9 A00 = C63017Sah.A00(this.A08, str);
        if (A00 != null) {
            TreeSet treeSet2 = A00.A04;
            if (!treeSet2.isEmpty()) {
                treeSet = new TreeSet((Collection) treeSet2);
            }
        }
        treeSet = new TreeSet();
        return treeSet;
    }

    @Override // X.C2QE
    public final synchronized InterfaceC65245Tgb Ar2(String str) {
        C64217T4g c64217T4g;
        C4B8.A04(AbstractC167007dF.A1N(this.A04 ? 1 : 0));
        SQ9 A00 = C63017Sah.A00(this.A08, str);
        if (A00 != null) {
            c64217T4g = A00.A00;
        } else {
            c64217T4g = C64217T4g.A02;
        }
        return c64217T4g;
    }

    @Override // X.C2QE
    public final synchronized java.util.Set BKo() {
        C4B8.A04(AbstractC167007dF.A1N(this.A04 ? 1 : 0));
        return AbstractC31171DnF.A0k(this.A08.A03.keySet());
    }

    @Override // X.C2QE
    public final synchronized boolean CR2(String str, long j, long j2) {
        boolean z;
        z = true;
        C4B8.A04(AbstractC167007dF.A1N(this.A04 ? 1 : 0));
        SQ9 A00 = C63017Sah.A00(this.A08, str);
        if (A00 != null) {
            if (A00.A00(j, j2) >= j2) {
            }
        }
        z = false;
        return z;
    }

    @Override // X.C2QE
    public final boolean CXn(String str) {
        return true;
    }

    @Override // X.C2QE
    public final synchronized void EEJ(C49802Qq c49802Qq) {
        C4B8.A04(AbstractC167007dF.A1N(this.A04 ? 1 : 0));
        C63017Sah c63017Sah = this.A08;
        SQ9 A00 = C63017Sah.A00(c63017Sah, c49802Qq.A06);
        A00.getClass();
        A00.A02(c49802Qq.A04);
        c63017Sah.A04(A00.A02);
        notifyAll();
    }

    @Override // X.C2QE
    public final synchronized void EFe(InterfaceC46412Bd interfaceC46412Bd, String str) {
        HashMap hashMap;
        List A18;
        if (!this.A04 && (A18 = MSW.A18(str, (hashMap = this.A0C))) != null) {
            A18.remove(interfaceC46412Bd);
            if (A18.isEmpty()) {
                hashMap.remove(str);
            }
        }
    }

    @Override // X.C2QE
    public final synchronized void EGD(String str) {
        C4B8.A04(AbstractC167007dF.A1N(this.A04 ? 1 : 0));
        Iterator it = Ajh(str).iterator();
        while (it.hasNext()) {
            A02((C49802Qq) it.next());
        }
    }

    @Override // X.C2QE
    public final synchronized void EGK(C49802Qq c49802Qq) {
        C4B8.A04(AbstractC167007dF.A1N(this.A04 ? 1 : 0));
        A02(c49802Qq);
    }

    @Override // X.C2QE
    public final synchronized File EnK(String str, long j, long j2) {
        SQ9 A00;
        File A0w;
        C4B8.A04(AbstractC167007dF.A1N(this.A04 ? 1 : 0));
        A0D();
        A00 = C63017Sah.A00(this.A08, str);
        A00.getClass();
        C4B8.A04(A00.A03(j, j2));
        File file = this.A09;
        if (!file.exists()) {
            A04(file);
            A00();
        }
        this.A07.Do1(this, str, j, j2);
        A0w = MSW.A0w(file, Integer.toString(this.A0D.nextInt(10)));
        if (!A0w.exists()) {
            A04(A0w);
        }
        return RFh.A01(A0w, A00.A01, j, System.currentTimeMillis());
    }

    @Override // X.C2QE
    public final synchronized void release() {
        if (!this.A04) {
            this.A0C.clear();
            A00();
            try {
                try {
                    this.A08.A03();
                    A05(this.A09);
                } catch (IOException e) {
                    C0K8.A0F("SimpleCacheV2", "Storing index file failed", e);
                    A05(this.A09);
                }
                this.A04 = true;
            } catch (Throwable th) {
                A05(this.A09);
                this.A04 = true;
                throw th;
            }
        }
    }

    public static void A01(R84 r84, File file, File[] fileArr, boolean z) {
        if (fileArr != null && (fileArr.length) != 0) {
            for (File file2 : fileArr) {
                String name = file2.getName();
                if (z) {
                    if (name.indexOf(46) == -1) {
                        A01(r84, file2, file2.listFiles(), false);
                    } else if (!name.startsWith("cached_content_index.exi")) {
                        if (name.endsWith(".uid")) {
                        }
                    }
                }
                RFh A00 = RFh.A00(r84.A08, file2, -1L);
                if (A00 != null) {
                    r84.A03(A00);
                } else {
                    file2.delete();
                }
            }
            return;
        }
        if (!z) {
            file.delete();
        }
    }

    private void A02(C49802Qq c49802Qq) {
        C63017Sah c63017Sah = this.A08;
        SQ9 A00 = C63017Sah.A00(c63017Sah, c49802Qq.A06);
        if (A00 != null && A00.A04.remove(c49802Qq)) {
            File file = c49802Qq.A05;
            if (file != null) {
                file.delete();
            }
            this.A06 -= c49802Qq.A03;
            c63017Sah.A04(A00.A02);
            A0A(c49802Qq);
        }
    }

    private void A03(RFh rFh) {
        C63017Sah c63017Sah = this.A08;
        String str = rFh.A06;
        c63017Sah.A01(str).A04.add(rFh);
        this.A06 += rFh.A03;
        List A18 = MSW.A18(str, this.A0C);
        if (A18 != null) {
            int size = A18.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((InterfaceC46412Bd) A18.get(size)).DnP(this, rFh);
                }
            }
        }
        this.A07.DnP(this, rFh);
    }

    public static synchronized void A05(File file) {
        synchronized (R84.class) {
            A0E.remove(file.getAbsoluteFile());
        }
    }

    @Override // X.C2QG
    public final void A08() {
        Object obj = this.A0A;
        synchronized (obj) {
            if (!this.A01) {
                obj.wait();
            }
        }
    }

    @Override // X.C2QG
    public final void A0A(C49802Qq c49802Qq) {
        List A18 = MSW.A18(c49802Qq.A06, this.A0C);
        if (A18 != null) {
            int size = A18.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((InterfaceC46412Bd) A18.get(size)).DnQ(this, c49802Qq);
                }
            }
        }
        this.A07.DnQ(this, c49802Qq);
    }

    @Override // X.C2QG
    public final boolean A0C() {
        return this.A01;
    }

    @Override // X.C2QE
    public final boolean CR5(String str, long j, long j2) {
        if (this.A05 && !this.A01) {
            return false;
        }
        return CR2(str, j, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c7, code lost:
    
        X.C0K8.A0D("SimpleCacheV2", X.AnonymousClass001.A0r("lock expired after ", "ms for span: ", r30, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f4, code lost:
    
        r0 = -173080962;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f7, code lost:
    
        X.AbstractC09800fd.A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fb, code lost:
    
        return null;
     */
    @Override // X.C2QE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized X.C49802Qq Enm(java.lang.Integer r29, java.lang.String r30, long r31, long r33) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R84.Enm(java.lang.Integer, java.lang.String, long, long):X.2Qq");
    }

    @Override // X.C2QE
    public final synchronized C49802Qq Enn(Integer num, String str, long j, long j2) {
        C49802Qq A01;
        C4B8.A04(AbstractC167007dF.A1N(this.A04 ? 1 : 0));
        A0D();
        C63017Sah c63017Sah = this.A08;
        HashMap hashMap = c63017Sah.A03;
        SQ9 sq9 = (SQ9) hashMap.get(str);
        if (sq9 != null) {
            while (true) {
                A01 = sq9.A01(j, j2);
                if (!A01.A07 || A01.A05.length() == A01.A03) {
                    break;
                }
                A00();
            }
        } else {
            A01 = new C49802Qq(null, str, j, j2, -9223372036854775807L);
        }
        C49802Qq c49802Qq = A01;
        if (A01.A07) {
            SQ9 sq92 = (SQ9) hashMap.get(str);
            long j3 = A01.A02;
            TreeSet treeSet = sq92.A04;
            C4B8.A04(treeSet.remove(A01));
            File file = A01.A05;
            file.getClass();
            String str2 = A01.A06;
            A01 = new C49802Qq(file, str2, A01.A04, A01.A03, j3);
            treeSet.add(A01);
            List A18 = MSW.A18(str2, this.A0C);
            if (A18 != null) {
                int size = A18.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((InterfaceC46412Bd) A18.get(size)).DnR(this, c49802Qq, A01);
                }
            }
            this.A07.DnR(this, c49802Qq, A01);
        } else if (!c63017Sah.A01(str).A04(j, A01.A03)) {
            A01 = null;
        }
        return A01;
    }

    public R84(InterfaceC46402Bc interfaceC46402Bc, C63017Sah c63017Sah, File file, ArrayList arrayList, long j, boolean z, boolean z2) {
        super(interfaceC46402Bc, arrayList);
        this.A0A = AbstractC58318PtA.A0b();
        this.A06 = 0L;
        try {
            AbstractC460729r.A01("VPS-SimpleCacheV2Constructor");
            this.A09 = file;
            this.A07 = interfaceC46402Bc;
            this.A08 = c63017Sah;
            this.A0C = AbstractC166987dD.A1G();
            this.A0D = new Random();
            this.A0B = arrayList;
            this.A05 = z;
            this.A03 = z2;
            this.A02 = j;
            ConditionVariable conditionVariable = new ConditionVariable();
            new TY8(conditionVariable, this).start();
            conditionVariable.block();
        } finally {
            AbstractC460729r.A00();
        }
    }

    private void A00() {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = Collections.unmodifiableCollection(this.A08.A03.values()).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((SQ9) it.next()).A04.iterator();
            while (it2.hasNext()) {
                C49802Qq c49802Qq = (C49802Qq) it2.next();
                if (c49802Qq.A05.length() != c49802Qq.A03) {
                    A1E.add(c49802Qq);
                }
            }
        }
        for (int i = 0; i < A1E.size(); i++) {
            A02((C49802Qq) A1E.get(i));
        }
    }

    public static void A04(File file) {
        if (!file.mkdirs() && !file.isDirectory()) {
            String A0n = AbstractC167017dG.A0n(file, "Failed to create cache directory: ", AbstractC166987dD.A1C());
            C0K8.A0C("SimpleCacheV2", A0n);
            throw new IOException(A0n);
        }
    }
}
