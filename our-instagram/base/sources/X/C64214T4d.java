package X;

import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;

/* renamed from: X.T4d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64214T4d implements C2QE {
    public static final HashSet A08 = AbstractC166987dD.A1H();
    public C1121554i A00;
    public long A01;
    public boolean A02;
    public final InterfaceC46402Bc A03;
    public final C63017Sah A04;
    public final File A05;
    public final HashMap A06;
    public final Random A07;

    public final synchronized void A06() {
        C1121554i c1121554i = this.A00;
        if (c1121554i != null) {
            throw c1121554i;
        }
    }

    @Override // X.C2QE
    public final synchronized NavigableSet A9D(InterfaceC46412Bd interfaceC46412Bd, String str) {
        C4B8.A04(AbstractC167007dF.A1N(this.A02 ? 1 : 0));
        str.getClass();
        HashMap hashMap = this.A06;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = AbstractC166987dD.A1E();
            hashMap.put(str, arrayList);
        }
        arrayList.add(interfaceC46412Bd);
        return Ajh(str);
    }

    @Override // X.C2QE
    public final void A9J(String str) {
    }

    @Override // X.C2QE
    public final synchronized void AC5(SEO seo, String str) {
        C4B8.A04(AbstractC167007dF.A1N(this.A02 ? 1 : 0));
        A06();
        C63017Sah c63017Sah = this.A04;
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
        C4B8.A04(AbstractC167007dF.A1N(this.A02 ? 1 : 0));
        if (file.exists()) {
            if (j == 0) {
                file.delete();
            } else {
                C63017Sah c63017Sah = this.A04;
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
        C4B8.A04(AbstractC167007dF.A1N(this.A02 ? 1 : 0));
        return this.A01;
    }

    @Override // X.C2QE
    public final synchronized long Ajd(long j, String str, long j2) {
        long j3;
        C4B8.A04(AbstractC167007dF.A1N(this.A02 ? 1 : 0));
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        SQ9 A00 = C63017Sah.A00(this.A04, str);
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
        C4B8.A04(AbstractC167007dF.A1N(this.A02 ? 1 : 0));
        SQ9 A00 = C63017Sah.A00(this.A04, str);
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
        C4B8.A04(AbstractC167007dF.A1N(this.A02 ? 1 : 0));
        SQ9 A00 = C63017Sah.A00(this.A04, str);
        if (A00 != null) {
            c64217T4g = A00.A00;
        } else {
            c64217T4g = C64217T4g.A02;
        }
        return c64217T4g;
    }

    @Override // X.C2QE
    public final synchronized java.util.Set BKo() {
        C4B8.A04(AbstractC167007dF.A1N(this.A02 ? 1 : 0));
        return AbstractC31171DnF.A0k(this.A04.A03.keySet());
    }

    @Override // X.C2QE
    public final boolean CR5(String str, long j, long j2) {
        return false;
    }

    @Override // X.C2QE
    public final boolean CXn(String str) {
        return true;
    }

    @Override // X.C2QE
    public final synchronized void EEJ(C49802Qq c49802Qq) {
        C4B8.A04(AbstractC167007dF.A1N(this.A02 ? 1 : 0));
        C63017Sah c63017Sah = this.A04;
        SQ9 A00 = C63017Sah.A00(c63017Sah, c49802Qq.A06);
        A00.getClass();
        A00.A02(c49802Qq.A04);
        c63017Sah.A04(A00.A02);
        notifyAll();
    }

    @Override // X.C2QE
    public final synchronized void EFe(InterfaceC46412Bd interfaceC46412Bd, String str) {
        if (!this.A02) {
            HashMap hashMap = this.A06;
            ArrayList arrayList = (ArrayList) hashMap.get(str);
            if (arrayList != null) {
                arrayList.remove(interfaceC46412Bd);
                if (arrayList.isEmpty()) {
                    hashMap.remove(str);
                }
            }
        }
    }

    @Override // X.C2QE
    public final synchronized void EGD(String str) {
        C4B8.A04(AbstractC167007dF.A1N(this.A02 ? 1 : 0));
        Iterator it = Ajh(str).iterator();
        while (it.hasNext()) {
            A01((C49802Qq) it.next());
        }
    }

    @Override // X.C2QE
    public final synchronized void EGK(C49802Qq c49802Qq) {
        C4B8.A04(AbstractC167007dF.A1N(this.A02 ? 1 : 0));
        A01(c49802Qq);
    }

    @Override // X.C2QE
    public final synchronized File EnK(String str, long j, long j2) {
        SQ9 A00;
        File A0w;
        C4B8.A04(AbstractC167007dF.A1N(this.A02 ? 1 : 0));
        A06();
        A00 = C63017Sah.A00(this.A04, str);
        A00.getClass();
        C4B8.A04(A00.A03(j, j2));
        File file = this.A05;
        if (!file.exists()) {
            A04(file);
            A00();
        }
        this.A03.Do1(this, str, j, j2);
        A0w = MSW.A0w(file, Integer.toString(this.A07.nextInt(10)));
        if (!A0w.exists()) {
            A04(A0w);
        }
        return RFh.A01(A0w, A00.A01, j, System.currentTimeMillis());
    }

    @Override // X.C2QE
    public final synchronized C49802Qq Enm(Integer num, String str, long j, long j2) {
        throw C00O.createAndThrow();
    }

    @Override // X.C2QE
    public final synchronized void release() {
        if (!this.A02) {
            this.A06.clear();
            A00();
            try {
                try {
                    this.A04.A03();
                    A05(this.A05);
                } catch (IOException e) {
                    AbstractC46512Bo.A05("SimpleCache", "Storing index file failed", e);
                    A05(this.A05);
                }
                this.A02 = true;
            } catch (Throwable th) {
                A05(this.A05);
                this.A02 = true;
                throw th;
            }
        }
    }

    @Deprecated
    public C64214T4d(InterfaceC46402Bc interfaceC46402Bc, File file) {
        boolean add;
        C63017Sah c63017Sah = new C63017Sah(file);
        synchronized (C64214T4d.class) {
            add = A08.add(file.getAbsoluteFile());
        }
        if (add) {
            this.A05 = file;
            this.A03 = interfaceC46402Bc;
            this.A04 = c63017Sah;
            this.A06 = AbstractC166987dD.A1G();
            this.A07 = new Random();
            ConditionVariable conditionVariable = new ConditionVariable();
            new TY9(conditionVariable, this).start();
            conditionVariable.block();
            return;
        }
        throw AbstractC43594JPz.A0o(file, "Another SimpleCache instance uses the folder: ", AbstractC166987dD.A1C());
    }

    private void A01(C49802Qq c49802Qq) {
        C63017Sah c63017Sah = this.A04;
        String str = c49802Qq.A06;
        SQ9 A00 = C63017Sah.A00(c63017Sah, str);
        if (A00 != null && A00.A04.remove(c49802Qq)) {
            File file = c49802Qq.A05;
            if (file != null) {
                file.delete();
            }
            this.A01 -= c49802Qq.A03;
            c63017Sah.A04(A00.A02);
            AbstractList abstractList = (AbstractList) this.A06.get(str);
            if (abstractList != null) {
                int size = abstractList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        ((InterfaceC46412Bd) abstractList.get(size)).DnQ(this, c49802Qq);
                    }
                }
            }
            this.A03.DnQ(this, c49802Qq);
        }
    }

    public static void A02(C64214T4d c64214T4d, File file, File[] fileArr, boolean z) {
        if (fileArr != null && (fileArr.length) != 0) {
            for (File file2 : fileArr) {
                String name = file2.getName();
                if (z) {
                    if (name.indexOf(46) == -1) {
                        A02(c64214T4d, file2, file2.listFiles(), false);
                    } else if (!name.startsWith("cached_content_index.exi")) {
                        if (name.endsWith(".uid")) {
                        }
                    }
                }
                RFh A00 = RFh.A00(c64214T4d.A04, file2, -1L);
                if (A00 != null) {
                    c64214T4d.A03(A00);
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

    private void A03(RFh rFh) {
        C63017Sah c63017Sah = this.A04;
        String str = rFh.A06;
        c63017Sah.A01(str).A04.add(rFh);
        this.A01 += rFh.A03;
        AbstractList abstractList = (AbstractList) this.A06.get(str);
        if (abstractList != null) {
            int size = abstractList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((InterfaceC46412Bd) abstractList.get(size)).DnP(this, rFh);
                }
            }
        }
        this.A03.DnP(this, rFh);
    }

    public static synchronized void A05(File file) {
        synchronized (C64214T4d.class) {
            A08.remove(file.getAbsoluteFile());
        }
    }

    @Override // X.C2QE
    public final synchronized boolean CR2(String str, long j, long j2) {
        boolean z;
        z = true;
        C4B8.A04(AbstractC167007dF.A1N(this.A02 ? 1 : 0));
        SQ9 A00 = C63017Sah.A00(this.A04, str);
        if (A00 != null) {
            if (A00.A00(0L, j2) >= j2) {
            }
        }
        z = false;
        return z;
    }

    @Override // X.C2QE
    public final synchronized C49802Qq Enn(Integer num, String str, long j, long j2) {
        C49802Qq A01;
        C4B8.A04(AbstractC167007dF.A1N(this.A02 ? 1 : 0));
        A06();
        C63017Sah c63017Sah = this.A04;
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
            ArrayList arrayList = (ArrayList) this.A06.get(str2);
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((InterfaceC46412Bd) arrayList.get(size)).DnR(this, c49802Qq, A01);
                }
            }
            this.A03.DnR(this, c49802Qq, A01);
        } else if (!c63017Sah.A01(str).A04(j, A01.A03)) {
            A01 = null;
        }
        return A01;
    }

    private void A00() {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = Collections.unmodifiableCollection(this.A04.A03.values()).iterator();
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
            A01((C49802Qq) A1E.get(i));
        }
    }

    public static void A04(File file) {
        if (!file.mkdirs() && !file.isDirectory()) {
            String A0n = AbstractC167017dG.A0n(file, "Failed to create cache directory: ", AbstractC166987dD.A1C());
            AbstractC46512Bo.A03("SimpleCache", A0n);
            throw new IOException(A0n);
        }
    }
}
