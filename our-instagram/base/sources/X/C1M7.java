package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.stash.core.FileStash;
import com.facebook.stash.core.Stash;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: X.1M7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1M7 {
    public static final InterfaceC09390do A04 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.1M9
        @Override // X.InterfaceC16820sZ
        public final Object invoke() {
            return new C1M7(C23111Aq.A00(), AbstractC23881Ey.A00());
        }
    });
    public final LightweightQuickPerformanceLogger A00;
    public final C23111Aq A01;
    public final C1MA A02 = new C1MA(this);
    public final C1B4 A03;

    public final C1MR A04(int i) {
        return A06(A08(null, i), i);
    }

    public final C1MR A05(int i) {
        return A06(A08(null, i), i);
    }

    public final C59852oS A09(final C1MD c1md, File file) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A00;
        String str = c1md.A05;
        int hashCode = str.hashCode();
        lightweightQuickPerformanceLogger.markerStart(42991640, hashCode);
        MarkerEditor withMarker = lightweightQuickPerformanceLogger.withMarker(42991640, hashCode);
        withMarker.annotate(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        withMarker.markerEditingCompleted();
        try {
            final File file2 = new File(file, "clean");
            final File file3 = new File(file, "dirty");
            C59752oI A00 = C1MQ.A00(c1md);
            A00.A0B = false;
            final C59812oO A03 = A03(A07(A00.A00(), file2), str);
            C59752oI A002 = C1MQ.A00(c1md);
            A002.A00 = false;
            A002.A05 = AnonymousClass001.A0R(str, "-dirty");
            A002.A0B = false;
            A002.A08 = null;
            C1MR A07 = A07(A002.A00(), file3);
            this.A01.A04(C05F.A0C).execute(new Runnable() { // from class: X.2oR
                @Override // java.lang.Runnable
                public final void run() {
                    C1B4 A003 = AbstractC23881Ey.A00();
                    C1MD c1md2 = c1md;
                    String str2 = c1md2.A05;
                    C25471Mb c25471Mb = new C25471Mb(c1md2.A01, c1md2.A02, str2);
                    C1B8 c1b8 = A003.A00;
                    File file4 = file2;
                    C1F9 c1f9 = new C1F9(str2);
                    c1f9.A00(c25471Mb);
                    C1FD.A00(c1b8, c1f9, file4);
                    File file5 = file3;
                    C1F9 c1f92 = new C1F9(AnonymousClass001.A0R(str2, "-dirty"));
                    c1f92.A00(new C1MF(null, new C1FC(SandboxRepository.CACHE_TTL, false), "file", AnonymousClass001.A0R(str2, "-dirty")));
                    C1FD.A00(c1b8, c1f92, file5);
                    ((C1ME) c25471Mb).A00 = new WeakReference(A03);
                }
            });
            return new C59852oS(A07, A03, c1md);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.1B1, X.1MF, X.1ME] */
    public static final C1F9 A00(C1MD c1md, String str, int i) {
        C1F9 c1f9 = new C1F9(str);
        c1f9.A00 = i;
        c1f9.A00(c1md.A03);
        C1FB c1fb = c1md.A01;
        if (c1fb == null && c1md.A02 == null) {
            throw new IllegalArgumentException(AnonymousClass001.A0g("Config for ", c1md.A05, " didn't specify an eviction config. Is this what you want?"));
        }
        ?? c1mf = new C1MF(c1fb, c1md.A02, "stash", c1md.A05);
        c1mf.A00 = new WeakReference(null);
        c1f9.A00(c1mf);
        return c1f9;
    }

    public static synchronized C1M7 A01() {
        C1M7 c1m7;
        synchronized (C1M7.class) {
            c1m7 = (C1M7) A04.getValue();
        }
        return c1m7;
    }

    public static final void A02(Stash stash, C1F9 c1f9) {
        Iterator it = new ArrayList(c1f9.A03.values()).iterator();
        while (it.hasNext()) {
            C1B1 c1b1 = (C1B1) it.next();
            if (c1b1 instanceof C1ME) {
                ((C1ME) c1b1).A00 = new WeakReference(stash);
            }
        }
    }

    public final C1MR A06(C1MD c1md, int i) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A00;
        lightweightQuickPerformanceLogger.markerStart(42991640, i);
        try {
            String str = c1md.A05;
            lightweightQuickPerformanceLogger.markerAnnotate(42991640, "stash_name", str);
            C1F9 A00 = A00(c1md, str, -1);
            C1B4 c1b4 = this.A03;
            HashMap hashMap = null;
            File file = null;
            C23131As c23131As = null;
            String str2 = c1md.A07;
            if (str2 != null) {
                hashMap = new HashMap();
                hashMap.put("__subdir__", str2);
            }
            C23131As c23131As2 = c1md.A00;
            if (c23131As2 != null) {
                String str3 = c23131As2.A01;
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                hashMap.put("__scope__", str3);
                c23131As = c23131As2;
            }
            File file2 = c1md.A04;
            if (file2 != null) {
                file = file2;
            }
            File CHo = c1b4.CHo(new C1MG(c23131As, file, hashMap, null), i);
            if (file2 != null) {
                AbstractC50432Tm.A00(file2, CHo, false);
            }
            C1MR A07 = A07(c1md, CHo);
            A02(A07, A00);
            C1FD.A00(c1b4.A00, A00, CHo);
            return A07;
        } finally {
            lightweightQuickPerformanceLogger.markerEnd(42991640, i, (short) 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.3yP] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [X.86r] */
    /* JADX WARN: Type inference failed for: r4v6, types: [X.1ML] */
    public final C1MR A07(C1MD c1md, File file) {
        List emptyList;
        final String str;
        final long j;
        InterfaceC89203yM interfaceC89203yM;
        C23111Aq c23111Aq = this.A01;
        final C1MH c1mh = new C1MH(c23111Aq, file);
        if (C20150ym.A07(AbstractC20100yh.A00(36319111038376899L))) {
            int A01 = ((int) C20150ym.A01(AbstractC20100yh.A00(36600586015149998L))) * 1024;
            c1mh.A01 = true;
            c1mh.A00 = A01;
        }
        if (c1md.A09) {
            final ?? c1ml = new C1ML(c1mh);
            c23111Aq.A04(C05F.A0C).execute(new Runnable() { // from class: X.1MO
                @Override // java.lang.Runnable
                public final void run() {
                    C1ML c1ml2 = c1ml;
                    c1ml2.getAllKeys();
                    c1ml2.getSizeBytes();
                }
            });
            c1mh = c1ml;
        }
        if (c1md.A0A) {
            final ?? c1822986r = new C1822986r(c1mh, this.A02, c1md.A05);
            c23111Aq.A04(C05F.A00).execute(new Runnable() { // from class: X.86s
                @Override // java.lang.Runnable
                public final void run() {
                    c1822986r.getSizeBytes();
                }
            });
            C218914p.A08.A0A(new C1823186t(c1822986r, this));
            c1mh = c1822986r;
        }
        if ((c1md instanceof C1MQ) && ((C1MQ) c1md).A00) {
            if (C89163yI.A05 == null) {
                C89163yI c89163yI = new C89163yI(C23111Aq.A00());
                C89163yI.A05 = c89163yI;
                C218914p.A08.A0A(c89163yI);
            }
            C89163yI c89163yI2 = C89163yI.A05;
            final String str2 = c1md.A05;
            if (c1md.A0C) {
                str = c89163yI2.A03.A01().A01;
                if (TextUtils.isEmpty(str)) {
                    interfaceC89203yM = new Object();
                    emptyList = Collections.singletonList(new C89223yO(interfaceC89203yM, c89163yI2.A04));
                }
            } else {
                str = "sessionless";
            }
            final C89183yK c89183yK = c89163yI2.A02;
            synchronized (c89163yI2) {
                j = c89163yI2.A00;
                if (j <= 0) {
                    SharedPreferences sharedPreferences = c89163yI2.A01;
                    if (sharedPreferences.getLong("__tracking_salt_v2__", 0L) == 0) {
                        c89163yI2.A00 = Math.abs(new Random().nextLong()) + 1;
                        sharedPreferences.edit().putLong("__tracking_salt_v2__", c89163yI2.A00).apply();
                    }
                    j = c89163yI2.A00;
                }
            }
            interfaceC89203yM = new InterfaceC89203yM(c89183yK, str2, str, j) { // from class: X.3yL
                public final long A00;
                public final C89183yK A01;
                public final String A02;
                public final String A03;

                @Override // X.InterfaceC89213yN
                public final void DJK(String str3, int i, Map map) {
                    if (CcH(str3)) {
                        C89183yK c89183yK2 = this.A01;
                        c89183yK2.A03.execute(new RunnableC71420Wti(new C69330Vlc(this.A02, this.A03, str3, "__get", "", i), c89183yK2));
                    }
                }

                @Override // X.InterfaceC89213yN
                public final void DMI(String str3, int i, Map map) {
                    String str4;
                    if (CcH(str3)) {
                        if ((i & 8) == 8) {
                            str4 = "refresh";
                        } else {
                            str4 = "";
                        }
                        C89183yK c89183yK2 = this.A01;
                        c89183yK2.A03.execute(new RunnableC71420Wti(new C69330Vlc(this.A02, this.A03, str3, "__insert", str4, i), c89183yK2));
                    }
                }

                @Override // X.InterfaceC89213yN
                public final void Deo(int i, int i2, String str3, Map map) {
                    String str4;
                    if (CcH(str3)) {
                        if (i != 0) {
                            if (i != 2) {
                                if (i != 3) {
                                    str4 = "unknown";
                                } else {
                                    str4 = "evicted";
                                }
                            } else {
                                str4 = "stale";
                            }
                        } else {
                            str4 = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
                        }
                        C89183yK c89183yK2 = this.A01;
                        c89183yK2.A03.execute(new RunnableC71420Wti(new C69330Vlc(this.A02, this.A03, str3, AbstractC111324zv.A00(1870), str4, i2), c89183yK2));
                    }
                }

                @Override // X.InterfaceC89203yM
                public final boolean CcH(String str3) {
                    if ((this.A00 + str3.hashCode()) % 1000 != 0) {
                        return false;
                    }
                    return true;
                }

                @Override // X.InterfaceC89203yM
                public final void D8x(String str3, String str4, String str5) {
                    if (CcH(str3)) {
                        C89183yK c89183yK2 = this.A01;
                        c89183yK2.A03.execute(new RunnableC71420Wti(new C69330Vlc(this.A02, this.A03, str3, "__key_size", str5, 2), c89183yK2));
                    }
                }

                {
                    this.A01 = c89183yK;
                    this.A00 = j;
                    this.A02 = str2;
                    this.A03 = str;
                }
            };
            emptyList = Collections.singletonList(new C89223yO(interfaceC89203yM, c89163yI2.A04));
        } else {
            emptyList = Collections.emptyList();
        }
        List list = c1md.A08;
        if ((list != null && !list.isEmpty()) || !emptyList.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.addAll(emptyList);
            final ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof C89223yO) {
                    arrayList2.add(next);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("StashWithEvents can only be created with IStashEventListeners (passed ");
                    sb.append(next.getClass());
                    sb.append(" instead)");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            c1mh = new C1MM(c1mh, arrayList2) { // from class: X.3yP
                public final List A01 = new LinkedList();
                public final List A00 = new LinkedList();
                public final List A02 = new LinkedList();

                private void A00(String str3, int i) {
                    Iterator it2 = this.A00.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC89213yN) it2.next()).DJK(str3, i, null);
                    }
                }

                private void A01(String str3, int i) {
                    Iterator it2 = this.A01.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC89213yN) it2.next()).DMI(str3, i, null);
                    }
                }

                public final boolean A02(String str3, int i) {
                    List list2 = this.A02;
                    boolean isEmpty = list2.isEmpty();
                    boolean remove = super.A00.remove(str3, i);
                    if (!isEmpty) {
                        int i2 = 1;
                        if (remove) {
                            i2 = 2;
                        }
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC89213yN) it2.next()).Deo(i, i2, str3, null);
                        }
                    }
                    return remove;
                }

                @Override // X.C1MM, com.facebook.stash.core.Stash
                public final boolean remove(String str3) {
                    return A02(str3, 0);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v0 */
                /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
                @Override // X.C1MM, com.facebook.stash.core.FileStash
                public final File getFile(String str3) {
                    if (this.A00.isEmpty()) {
                        return super.A00.getFile(str3);
                    }
                    int i = 0;
                    try {
                        FileStash fileStash = super.A00;
                        File file2 = fileStash.getFile(str3);
                        i = fileStash.hasKey(str3);
                        int i2 = 1;
                        if (i != 0) {
                            i2 = 6;
                        }
                        return file2;
                    } finally {
                        A00(str3, i);
                    }
                }

                @Override // X.C1MM, com.facebook.stash.core.FileStash
                public final File insertFile(String str3) {
                    boolean isEmpty = this.A01.isEmpty();
                    FileStash fileStash = super.A00;
                    if (isEmpty) {
                        return fileStash.insertFile(str3);
                    }
                    int i = 0;
                    if (fileStash.hasKey(str3)) {
                        i = 8;
                    }
                    try {
                        return fileStash.insertFile(str3);
                    } finally {
                        A01(str3, i | 4 | 2);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v0 */
                /* JADX WARN: Type inference failed for: r1v2, types: [java.io.InputStream] */
                @Override // X.C1MM, com.facebook.stash.core.Stash
                public final InputStream read(String str3) {
                    if (this.A00.isEmpty()) {
                        return super.A00.read(str3);
                    }
                    int i = 0;
                    try {
                        i = super.A00.read(str3);
                        int i2 = 1;
                        if (i != 0) {
                            i2 = 6;
                        }
                        return i;
                    } finally {
                        A00(str3, i);
                    }
                }

                @Override // X.C1MM, com.facebook.stash.core.Stash
                public final byte[] readResourceToMemory(String str3) {
                    if (this.A00.isEmpty()) {
                        return super.A00.readResourceToMemory(str3);
                    }
                    int i = 0;
                    int i2 = 1;
                    try {
                        byte[] readResourceToMemory = super.A00.readResourceToMemory(str3);
                        if (readResourceToMemory != null) {
                            i2 = 2;
                        }
                        A00(str3, i2);
                        return readResourceToMemory;
                    } catch (IOException e) {
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            i = 1;
                            A00(str3, i);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        A00(str3, i);
                        throw th;
                    }
                }

                @Override // X.C1MM, com.facebook.stash.core.Stash
                public final OutputStream write(String str3) {
                    if (this.A01.isEmpty()) {
                        return super.A00.write(str3);
                    }
                    int i = 1;
                    int i2 = 0;
                    try {
                        FileStash fileStash = super.A00;
                        if (fileStash.hasKey(str3)) {
                            i2 = 8;
                        }
                        OutputStream write = fileStash.write(str3);
                        if (write != null) {
                            i = i2 | 4 | 2;
                        }
                        A01(str3, i);
                        return write;
                    } catch (IOException e) {
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            i2 = 1;
                            A01(str3, i2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        A01(str3, i2);
                        throw th;
                    }
                }

                {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        C89223yO c89223yO = (C89223yO) it2.next();
                        c89223yO.A00 = new C89243yQ(this);
                        this.A01.add(c89223yO);
                        this.A00.add(c89223yO);
                        this.A02.add(c89223yO);
                    }
                }

                @Override // X.C1MM, com.facebook.stash.core.Stash
                public final boolean remove(String str3, int i) {
                    return A02(str3, i);
                }

                @Override // X.C1MM, com.facebook.stash.core.Stash
                public final void write(String str3, byte[] bArr) {
                    boolean isEmpty = this.A01.isEmpty();
                    FileStash fileStash = super.A00;
                    if (isEmpty) {
                        fileStash.write(str3, bArr);
                        return;
                    }
                    int i = 0;
                    if (fileStash.hasKey(str3)) {
                        i = 8;
                    }
                    try {
                        try {
                            fileStash.write(str3, bArr);
                            A01(str3, i | 2);
                        } catch (IOException e) {
                            i |= 1;
                            throw e;
                        }
                    } catch (Throwable th) {
                        A01(str3, i);
                        throw th;
                    }
                }
            };
        }
        return new C1MR(this.A00, c1mh, c1md.A05, c1md.A06, c1md.A0B);
    }

    public final C1MD A08(C1MD c1md, int i) {
        C1FB A00;
        C1FC A01;
        C1MC c1mc;
        String str;
        C1B0 c1b0;
        if (c1md != null) {
            String str2 = c1md.A05;
            if ("<override-ignore>".equals(str2) && (c1b0 = c1md.A03) == null) {
                A00 = c1md.A01;
                if (A00 == null) {
                    A00 = AbstractC23201Az.A00(i);
                }
                A01 = c1md.A02;
                if (A01 == null) {
                    A01 = AbstractC23201Az.A01(i);
                }
                c1mc = new C1MC();
                c1mc.A05 = str2;
                c1mc.A06 = c1md.A06;
                c1mc.A09 = c1md.A09;
                c1mc.A0A = c1md.A0A;
                c1mc.A0B = c1md.A0B;
                c1mc.A00 = c1md.A00;
                c1mc.A03 = c1b0;
                c1mc.A01 = A00;
                c1mc.A02 = A01;
                c1mc.A08 = c1md.A08;
                c1mc.A07 = c1md.A07;
                c1mc.A04 = c1md.A04;
            } else {
                throw new IllegalArgumentException("Cannot override cache name or UserScopeConfig. Use CacheLike.builderForOverrides().");
            }
        } else {
            A00 = AbstractC23201Az.A00(i);
            A01 = AbstractC23201Az.A01(i);
            c1mc = new C1MC();
        }
        c1mc.A05 = AbstractC23201Az.A04(i);
        if (i != 538797458) {
            str = null;
        } else {
            str = "ig_ras_blobs";
        }
        c1mc.A06 = str;
        c1mc.A03 = AbstractC23201Az.A02(i);
        c1mc.A01 = A00;
        c1mc.A02 = A01;
        return c1mc.A00();
    }

    public C1M7(C23111Aq c23111Aq, C1B4 c1b4) {
        this.A01 = c23111Aq;
        this.A00 = c23111Aq.A07;
        this.A03 = c1b4;
    }

    public final C59812oO A03(FileStash fileStash, String str) {
        return new C59812oO(fileStash, new C59792oM(this.A01.A02(), fileStash.getBaseStoragePath_ForInternalUse(), str));
    }
}
