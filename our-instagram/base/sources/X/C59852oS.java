package X;

import com.facebook.stash.core.FileStash;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;

/* renamed from: X.2oS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59852oS implements InterfaceC24271Gw, InterfaceC24281Gx {
    public final C59812oO A00;
    public final FileStash A01;
    public final C1MD A02;
    public final java.util.Set A03 = new HashSet();

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2oG, java.lang.Object] */
    @Override // X.InterfaceC24271Gw
    public final C59732oG ARB(String str) {
        C14360o3.A0B(str, 0);
        A01(str);
        try {
            C59812oO c59812oO = this.A00;
            FileStash fileStash = this.A01;
            C14360o3.A0B(c59812oO, 3);
            C85853sE c85853sE = new C85853sE(fileStash, c59812oO, this, null, str, false);
            ?? obj = new Object();
            obj.A00 = c85853sE;
            return obj;
        } catch (IOException unused) {
            A00(this, str);
            return new C59732oG();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2oG, java.lang.Object] */
    @Override // X.InterfaceC24271Gw
    public final C59732oG ARH(C107954te c107954te, String str, boolean z) {
        C14360o3.A0B(str, 0);
        A01(str);
        try {
            C85853sE c85853sE = new C85853sE(this.A01, this.A00, this, c107954te, str, true);
            ?? obj = new Object();
            obj.A00 = c85853sE;
            return obj;
        } catch (IOException unused) {
            A00(this, str);
            return new C59732oG();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.2oG, java.lang.Object] */
    @Override // X.InterfaceC24271Gw
    public final C59732oG AXI(String str) {
        C14360o3.A0B(str, 0);
        C59812oO c59812oO = this.A00;
        if (!c59812oO.getFilePath(str).canExecute()) {
            InputStream read = c59812oO.read(str);
            if (read != null) {
                File filePath = c59812oO.getFilePath(str);
                C14360o3.A07(filePath);
                C60242p7 c60242p7 = new C60242p7(filePath, read);
                ?? obj = new Object();
                obj.A00 = c60242p7;
                return obj;
            }
            return new C59732oG();
        }
        throw new IllegalStateException("IgDiskCache.getWithMetadata() must be used for items that have crucial metadata");
    }

    @Override // X.InterfaceC24271Gw
    public final long B2T(String str) {
        C14360o3.A0B(str, 0);
        return this.A00.getFilePath(str).length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r4.getFilePath(r6).canExecute() != false) goto L6;
     */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.2oG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.2oG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.2p9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.4te, java.lang.Object] */
    @Override // X.InterfaceC24271Gw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C59732oG CHm(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            X.2oO r4 = r5.A00
            X.2oM r0 = r4.A00
            X.1F5 r1 = r0.A00
            java.lang.String r0 = "metadata"
            java.lang.Object r0 = r1.A02(r6, r0)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            if (r0 != 0) goto L25
            r3 = 0
            java.io.File r0 = r4.getFilePath(r6)
            boolean r0 = r0.canExecute()
            if (r0 == 0) goto L2c
        L1f:
            X.2oG r0 = new X.2oG
            r0.<init>()
            return r0
        L25:
            X.4te r3 = new X.4te
            r3.<init>()
            r3.A00 = r0
        L2c:
            java.io.InputStream r2 = r4.read(r6)
            if (r2 == 0) goto L1f
            java.io.File r1 = r4.getFilePath(r6)
            X.C14360o3.A07(r1)
            X.2p7 r0 = new X.2p7
            r0.<init>(r1, r2)
            X.2p9 r1 = new X.2p9
            r1.<init>()
            r1.A01 = r0
            X.2oG r0 = new X.2oG
            if (r3 == 0) goto L58
            r0.<init>()
            r0.A00 = r3
        L4e:
            r1.A00 = r0
            X.2oG r0 = new X.2oG
            r0.<init>()
            r0.A00 = r1
            return r0
        L58:
            r0.<init>()
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59852oS.CHm(java.lang.String):X.2oG");
    }

    @Override // X.InterfaceC24281Gx
    public final boolean Cb3(String str) {
        C14360o3.A0B(str, 0);
        return this.A00.hasKey(str);
    }

    @Override // X.InterfaceC24271Gw
    public final void EEk(String str) {
        C14360o3.A0B(str, 0);
        this.A00.remove(str);
        this.A01.remove(str);
    }

    @Override // X.InterfaceC24271Gw
    public final void EYh(long j) {
    }

    @Override // X.InterfaceC24271Gw
    public final void close() {
    }

    public static final void A00(C59852oS c59852oS, String str) {
        java.util.Set set = c59852oS.A03;
        synchronized (set) {
            set.remove(str);
        }
    }

    private final void A01(String str) {
        java.util.Set set = this.A03;
        synchronized (set) {
            if (!set.contains(str)) {
                set.add(str);
            } else {
                throw new IllegalStateException("Two editors trying to write to the same cached file");
            }
        }
    }

    @Override // X.InterfaceC24271Gw
    public final HashSet BKn() {
        return new HashSet();
    }

    @Override // X.InterfaceC24271Gw
    public final long BQ5() {
        C1FB c1fb = this.A02.A01;
        if (c1fb != null) {
            return c1fb.A01;
        }
        return -1L;
    }

    @Override // X.InterfaceC24271Gw
    public final void EJ9(String str) {
        C1F5 c1f5 = this.A00.A00.A00;
        c1f5.A04(str, Long.MAX_VALUE, "eviction_priority");
        c1f5.A04(str, Long.valueOf(System.currentTimeMillis() + 604800000), "eviction_timestamps");
    }

    @Override // X.InterfaceC24271Gw
    public final void clear() {
        this.A00.removeAll();
        this.A01.removeAll();
    }

    @Override // X.InterfaceC24271Gw
    public final long size() {
        return this.A00.getSizeBytes() + this.A01.getSizeBytes();
    }

    public C59852oS(FileStash fileStash, C59812oO c59812oO, C1MD c1md) {
        this.A02 = c1md;
        this.A00 = c59812oO;
        this.A01 = fileStash;
    }

    @Override // X.InterfaceC24271Gw
    public final boolean CKd(String str) {
        throw C00O.createAndThrow();
    }
}
