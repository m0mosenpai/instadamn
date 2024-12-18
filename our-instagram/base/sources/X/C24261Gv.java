package X;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

/* renamed from: X.1Gv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24261Gv implements InterfaceC24271Gw, InterfaceC24281Gx {
    public int A00;
    public long A01;
    public C1NR A02;
    public int A03;
    public int A04;
    public final File A05;
    public final LinkedHashMap A08;
    public final List A09;
    public final AtomicLong A0A;
    public final boolean A0B;
    public final C1H1 A0C;
    public final Runnable A0E;
    public final ReentrantLock A0F;
    public static final Pattern A0I = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final ThreadPoolExecutor A0H = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public static final File A0G = new File("/dev/null");
    public final C18340vL A0D = new C18340vL(C14120nc.A00(), 1);
    public final Object A06 = new Object();
    public final Object A07 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0191, code lost:
    
        if (r8.A03.A0B != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0193, code lost:
    
        r10 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x019b, code lost:
    
        if (r10.hasNext() == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x019d, code lost:
    
        r3 = (java.lang.String) r10.next();
        r2 = (X.C1H2) r5.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a9, code lost:
    
        if (r2 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ab, code lost:
    
        r1 = r2.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01b3, code lost:
    
        if (r1.exists() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01b5, code lost:
    
        r1.delete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01b8, code lost:
    
        r1 = r2.A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c0, code lost:
    
        if (r1.exists() == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c2, code lost:
    
        r1.delete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01c5, code lost:
    
        r5.remove(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01c9, code lost:
    
        X.C1H1.A01(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cc, code lost:
    
        r16.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018a, code lost:
    
        X.C1H1.A02(r6, false);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C24261Gv(X.C1NR r19, X.InterfaceC14020nS r20, java.io.File r21, int r22, long r23) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24261Gv.<init>(X.1NR, X.0nS, java.io.File, int, long):void");
    }

    @Override // X.InterfaceC24271Gw
    public final C59732oG ARB(String str) {
        return A01(null, str, false);
    }

    @Override // X.InterfaceC24271Gw
    public final C59732oG ARH(C107954te c107954te, String str, boolean z) {
        return A01(c107954te, str, true);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.2oG, java.lang.Object] */
    private C59732oG A00(C1H2 c1h2) {
        if (c1h2 != null && c1h2.A09()) {
            this.A03++;
            try {
                C3IP c3ip = new C3IP(c1h2);
                ?? obj = new Object();
                obj.A00 = c3ip;
                return obj;
            } catch (IOException unused) {
                return new C59732oG();
            }
        }
        this.A04++;
        return new C59732oG();
    }

    public static void A03(C24261Gv c24261Gv) {
        List list;
        Map.Entry entry;
        C1NR c1nr;
        IllegalStateException th;
        Object obj = c24261Gv.A07;
        synchronized (obj) {
            list = c24261Gv.A09;
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                C1H2 c1h2 = (C1H2) listIterator.next();
                if (c1h2 != null) {
                    File A02 = c1h2.A02();
                    if (A02.exists() && A02.delete()) {
                        c24261Gv.A0A.getAndAdd(-c1h2.A00());
                        listIterator.remove();
                    }
                }
            }
        }
        synchronized (c24261Gv.A06) {
            LinkedHashMap linkedHashMap = c24261Gv.A08;
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext() && ((linkedHashMap.size() > 0 && c24261Gv.A0A.get() > c24261Gv.A01) || linkedHashMap.size() > c24261Gv.A00)) {
                try {
                    entry = (Map.Entry) it.next();
                    c1nr = c24261Gv.A02;
                } catch (IllegalStateException | NoSuchElementException unused) {
                }
                if (c1nr != null) {
                    if (c1nr.A02((C1H2) entry.getValue(), (String) entry.getKey())) {
                        continue;
                    }
                }
                C1H2 c1h22 = (C1H2) entry.getValue();
                if (c1h22 != null) {
                    if (c1h22.A01() == null) {
                        File A022 = c1h22.A02();
                        File A04 = c1h22.A04();
                        if ((!A022.exists() || A022.delete()) && (!A04.exists() || A04.delete())) {
                            c24261Gv.A0A.getAndAdd(-c1h22.A00());
                        } else {
                            synchronized (obj) {
                                try {
                                    list.add(c1h22);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    } else {
                        th = new IllegalStateException("trying to clear a disk cache entry that is still under edit.");
                    }
                    throw th;
                    break;
                }
                it.remove();
            }
            if (linkedHashMap.isEmpty()) {
                AtomicLong atomicLong = c24261Gv.A0A;
                long j = atomicLong.get();
                long j2 = c24261Gv.A01;
                if (j > j2) {
                    C0w9.A07("IgDiskCache", new RuntimeException(String.format(Locale.US, "Unable to trim disk size to limit. mMaxSizeInBytes = %d, mSizeInBytes = %d, mLruEntries.size() = %d", Long.valueOf(j2), Long.valueOf(atomicLong.get()), Integer.valueOf(linkedHashMap.size()))));
                }
            }
        }
    }

    public static void A04(String str) {
        if (A0I.matcher(str).matches()) {
        } else {
            throw new IllegalArgumentException(AnonymousClass001.A0g("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    @Override // X.InterfaceC24271Gw
    public final HashSet BKn() {
        HashSet hashSet = new HashSet();
        synchronized (this.A06) {
            hashSet.addAll(this.A08.keySet());
        }
        return hashSet;
    }

    @Override // X.InterfaceC24271Gw
    public final long BQ5() {
        return this.A01;
    }

    @Override // X.InterfaceC24271Gw
    public final void EJ9(String str) {
        C1NR c1nr = this.A02;
        if (c1nr != null) {
            c1nr.A00(str);
            return;
        }
        throw new IllegalStateException("requestHoldItem called but no eviction blocker!");
    }

    @Override // X.InterfaceC24271Gw
    public final void EYh(long j) {
        this.A01 = j;
        A0H.execute(this.A0E);
    }

    @Override // X.InterfaceC24271Gw
    public final void clear() {
        HashSet hashSet = new HashSet();
        synchronized (this.A06) {
            hashSet.addAll(this.A08.keySet());
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                EEk((String) it.next());
            } catch (IllegalStateException | NoSuchElementException unused) {
            }
        }
    }

    @Override // X.InterfaceC24271Gw
    public final void close() {
        File file;
        BufferedWriter bufferedWriter;
        C11T.A05("This operation can't be run on UI thread.");
        A03(this);
        this.A0C.A03();
        C1NR c1nr = this.A02;
        if (c1nr != null) {
            synchronized (c1nr.A02) {
                C1NV c1nv = c1nr.A01;
                try {
                    file = c1nv.A03;
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), C1NV.A04));
                } catch (IOException e) {
                    C0w9.A06("BlockerJournal", "IOException while rebuilding journal file", e);
                }
                try {
                    Iterator it = new ArrayList(c1nv.A00.A00.A03.values()).iterator();
                    while (it.hasNext()) {
                        CRP crp = (CRP) it.next();
                        StringBuilder sb = new StringBuilder();
                        sb.append(crp.A02);
                        sb.append(' ');
                        sb.append(crp.A01);
                        sb.append(' ');
                        sb.append(crp.A00);
                        sb.append('\n');
                        bufferedWriter.write(sb.toString());
                    }
                    bufferedWriter.flush();
                    file.renameTo(c1nv.A02);
                    bufferedWriter.close();
                } finally {
                }
            }
        }
    }

    @Override // X.InterfaceC24271Gw
    public final long size() {
        return this.A0A.get();
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [X.2oG, java.lang.Object] */
    private C59732oG A01(C107954te c107954te, String str, boolean z) {
        AbstractC71443Ii abstractC71443Ii;
        C59732oG c59732oG;
        A04(str);
        if (this.A01 != 0 && this.A00 != 0) {
            File file = A0G;
            File file2 = this.A05;
            if (!file.equals(file2) && (!z || c107954te != null)) {
                try {
                    ReentrantLock reentrantLock = this.A0F;
                    reentrantLock.lock();
                    final C1H2 A05 = A05(str);
                    if (A05 == null) {
                        A05 = new C1H2(file2, str);
                        synchronized (this.A06) {
                            this.A08.put(str, A05);
                        }
                    }
                    reentrantLock.unlock();
                    if (A05.A01() == null) {
                        A05.A07(c107954te, z);
                        C1H1 c1h1 = this.A0C;
                        c1h1.A04.ATO(new C71413If(c1h1, AnonymousClass001.A0S("DIRTY ", str, '\n')));
                        synchronized (this) {
                            if (A05.A01() == null) {
                                try {
                                    abstractC71443Ii = new AbstractC71443Ii(A05, this) { // from class: X.3Ih
                                        public final C1H2 A00;
                                        public final C24261Gv A01;

                                        @Override // X.AbstractC71443Ii
                                        public final synchronized void A02() {
                                            if (!super.A00) {
                                                A00();
                                                close();
                                                super.A00 = true;
                                                this.A01.A06(this.A00);
                                            }
                                        }

                                        /* JADX WARN: Code restructure failed: missing block: B:47:0x00ca, code lost:
                                        
                                            if (r3 != false) goto L49;
                                         */
                                        /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
                                        /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
                                        @Override // X.AbstractC71443Ii
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                            To view partially-correct add '--show-bad-code' argument
                                        */
                                        public final synchronized boolean A03() {
                                            /*
                                                Method dump skipped, instructions count: 229
                                                To view this dump add '--comments-level debug' option
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: X.C71433Ih.A03():boolean");
                                        }

                                        private final void A00() {
                                            if (!super.A00) {
                                                if (this.A00.A01() == this) {
                                                    return;
                                                } else {
                                                    throw new IllegalStateException("Two editors trying to write to the same cached file");
                                                }
                                            }
                                            throw new IllegalStateException("Try to operate on an EditorOutputStream that is already closed");
                                        }

                                        @Override // X.AbstractC71443Ii
                                        public final FileChannel A01() {
                                            OutputStream outputStream = this.A02;
                                            C14360o3.A0C(outputStream, "null cannot be cast to non-null type java.io.FileOutputStream");
                                            FileChannel channel = ((FileOutputStream) outputStream).getChannel();
                                            C14360o3.A07(channel);
                                            return channel;
                                        }

                                        {
                                            super(new FileOutputStream(A05.A03()));
                                            this.A00 = A05;
                                            this.A01 = this;
                                        }
                                    };
                                } catch (FileNotFoundException unused) {
                                    file2.mkdirs();
                                    try {
                                        abstractC71443Ii = new AbstractC71443Ii(A05, this) { // from class: X.3Ih
                                            public final C1H2 A00;
                                            public final C24261Gv A01;

                                            @Override // X.AbstractC71443Ii
                                            public final synchronized void A02() {
                                                if (!super.A00) {
                                                    A00();
                                                    close();
                                                    super.A00 = true;
                                                    this.A01.A06(this.A00);
                                                }
                                            }

                                            @Override // X.AbstractC71443Ii
                                            public final synchronized boolean A03() {
                                                /*  JADX ERROR: Method code generation error
                                                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                                                    	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                                    */
                                                /*
                                                    Method dump skipped, instructions count: 229
                                                    To view this dump add '--comments-level debug' option
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: X.C71433Ih.A03():boolean");
                                            }

                                            private final void A00() {
                                                if (!super.A00) {
                                                    if (this.A00.A01() == this) {
                                                        return;
                                                    } else {
                                                        throw new IllegalStateException("Two editors trying to write to the same cached file");
                                                    }
                                                }
                                                throw new IllegalStateException("Try to operate on an EditorOutputStream that is already closed");
                                            }

                                            @Override // X.AbstractC71443Ii
                                            public final FileChannel A01() {
                                                OutputStream outputStream = this.A02;
                                                C14360o3.A0C(outputStream, "null cannot be cast to non-null type java.io.FileOutputStream");
                                                FileChannel channel = ((FileOutputStream) outputStream).getChannel();
                                                C14360o3.A07(channel);
                                                return channel;
                                            }

                                            {
                                                super(new FileOutputStream(A05.A03()));
                                                this.A00 = A05;
                                                this.A01 = this;
                                            }
                                        };
                                    } catch (FileNotFoundException unused2) {
                                        c59732oG = new C59732oG();
                                    }
                                }
                                A05.A06(abstractC71443Ii);
                                ?? obj = new Object();
                                obj.A00 = abstractC71443Ii;
                                c59732oG = obj;
                            } else {
                                throw new IllegalStateException("Trying to edit a disk cache entry while another edit is in progress.");
                            }
                        }
                        return c59732oG;
                    }
                    throw new IllegalStateException("Trying to edit a disk cache entry while another edit is in progress.");
                } catch (Throwable th) {
                    this.A0F.unlock();
                    throw th;
                }
            }
        }
        return new C59732oG();
    }

    public static void A02(C1H2 c1h2, C24261Gv c24261Gv) {
        int size;
        if (c1h2.A09()) {
            C1H1 c1h1 = c24261Gv.A0C;
            c1h1.A04.ATO(new C71413If(c1h1, C1H1.A00(c1h2.A06, c1h2.A00(), c1h2.A08())));
        } else {
            synchronized (c24261Gv.A06) {
                c24261Gv.A08.remove(c1h2.A06);
            }
        }
        if (c24261Gv.A0A.get() <= c24261Gv.A01) {
            synchronized (c24261Gv.A06) {
                size = c24261Gv.A08.size();
            }
            if (size <= c24261Gv.A00) {
                return;
            }
        }
        A0H.execute(c24261Gv.A0E);
    }

    public final C1H2 A05(String str) {
        C1H2 c1h2;
        A04(str);
        synchronized (this.A06) {
            c1h2 = (C1H2) this.A08.get(str);
        }
        return c1h2;
    }

    public final void A06(C1H2 c1h2) {
        File A03 = c1h2.A03();
        if (A03.exists()) {
            A03.delete();
        }
        c1h2.A06(null);
        c1h2.A07(null, false);
        A02(c1h2, this);
    }

    @Override // X.InterfaceC24271Gw
    public final C59732oG AXI(String str) {
        C1H2 A05 = A05(str);
        if (A05 != null && A05.A08()) {
            throw new IllegalStateException("IgDiskCache.getWithMetadata() must be used for items that have crucial metadata");
        }
        return A00(A05);
    }

    @Override // X.InterfaceC24271Gw
    public final long B2T(String str) {
        C1H2 A05 = A05(str);
        if (A05 != null) {
            return A05.A00();
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x004d, code lost:
    
        if (r4.A08() != false) goto L21;
     */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.2oG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.2oG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.4te, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.2p9, java.lang.Object] */
    @Override // X.InterfaceC24271Gw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C59732oG CHm(java.lang.String r6) {
        /*
            r5 = this;
            X.1H2 r4 = r5.A05(r6)
            if (r4 == 0) goto L4f
            java.io.File r1 = r4.A04()
            boolean r0 = r1.canRead()
            r3 = 0
            if (r0 == 0) goto L49
            java.io.FileReader r0 = new java.io.FileReader     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e java.lang.Throwable -> L43
            r1.<init>()     // Catch: java.lang.Throwable -> L3e java.lang.Throwable -> L43
        L20:
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L3e java.lang.Throwable -> L43
            if (r0 == 0) goto L2a
            r1.append(r0)     // Catch: java.lang.Throwable -> L3e java.lang.Throwable -> L43
            goto L20
        L2a:
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L3e java.lang.Throwable -> L43
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3e java.lang.Throwable -> L43
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3e java.lang.Throwable -> L43
            X.4te r0 = new X.4te     // Catch: java.lang.Throwable -> L3e java.lang.Throwable -> L43
            r0.<init>()     // Catch: java.lang.Throwable -> L3e java.lang.Throwable -> L43
            r0.A00 = r1     // Catch: java.lang.Throwable -> L3e java.lang.Throwable -> L43
            r2.close()     // Catch: java.io.IOException -> L5b
            goto L5b
        L3e:
            r0 = move-exception
            r2.close()     // Catch: java.io.IOException -> L48
            throw r0
        L43:
            r2.close()     // Catch: java.lang.Throwable -> L49
            goto L49
        L47:
            r0 = move-exception
        L48:
            throw r0
        L49:
            boolean r0 = r4.A08()
            if (r0 == 0) goto L5c
        L4f:
            int r0 = r5.A04
            int r0 = r0 + 1
            r5.A04 = r0
        L55:
            X.2oG r0 = new X.2oG
            r0.<init>()
            return r0
        L5b:
            r3 = r0
        L5c:
            X.2oG r1 = r5.A00(r4)
            java.lang.Object r0 = r1.A00
            if (r0 == 0) goto L55
            java.lang.Object r0 = r1.A00()
            X.2p8 r0 = (X.AbstractC60252p8) r0
            X.2p9 r1 = new X.2p9
            r1.<init>()
            r1.A01 = r0
            X.2oG r0 = new X.2oG
            if (r3 == 0) goto L84
            r0.<init>()
            r0.A00 = r3
        L7a:
            r1.A00 = r0
            X.2oG r0 = new X.2oG
            r0.<init>()
            r0.A00 = r1
            return r0
        L84:
            r0.<init>()
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24261Gv.CHm(java.lang.String):X.2oG");
    }

    @Override // X.InterfaceC24271Gw
    public final boolean CKd(String str) {
        C1H2 c1h2;
        A04(str);
        synchronized (this.A06) {
            c1h2 = (C1H2) this.A08.get(str);
        }
        if (c1h2 != null && c1h2.A09() && c1h2.A02().exists()) {
            if (!c1h2.A08() || c1h2.A04().exists()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC24281Gx
    public final boolean Cb3(String str) {
        A04(str);
        return this.A08.keySet().contains(str);
    }

    @Override // X.InterfaceC24271Gw
    public final void EEk(String str) {
        C1H2 c1h2;
        A04(str);
        synchronized (this.A06) {
            c1h2 = (C1H2) this.A08.remove(str);
        }
        if (c1h2 != null) {
            if (c1h2.A01() == null) {
                File A02 = c1h2.A02();
                File A04 = c1h2.A04();
                if ((!A02.exists() || A02.delete()) && (!A04.exists() || A04.delete())) {
                    this.A0A.getAndAdd(-c1h2.A00());
                    return;
                }
                synchronized (this.A07) {
                    this.A09.add(c1h2);
                }
                return;
            }
            throw new IllegalStateException("trying to remove a disk cache entry that is still under edit.");
        }
    }
}
