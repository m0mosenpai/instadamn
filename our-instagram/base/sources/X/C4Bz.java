package X;

import android.util.Pair;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4Bz, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4Bz implements InterfaceC92374Bs {
    public C4C9 A03;
    public C5J9 A04;
    public InterfaceC92354Bq A06;
    public InterfaceC92344Bp A07;
    public C49802Qq A08;
    public boolean A09;
    public boolean A0A;
    public long A0B;
    public long A0C;
    public C2BB A0D;
    public final int A0G;
    public final long A0H;
    public final long A0I;
    public final C2BZ A0J;
    public final EnumC91984Ae A0K;
    public final C92304Bk A0L;
    public final HeroPlayerSetting A0M;
    public final boolean A0O;
    public final boolean A0P;
    public final C2BY A0Q;
    public final AtomicBoolean A0R;
    public boolean A0F = false;
    public long A01 = -1;
    public final C4C0 A0N = new C4C1(false);
    public C4JB A05 = null;
    public long A02 = 0;
    public long A00 = 0;
    public boolean A0E = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075 A[Catch: all -> 0x00b4, TryCatch #1 {all -> 0x00b4, blocks: (B:3:0x0001, B:5:0x000a, B:6:0x000d, B:8:0x0012, B:10:0x0016, B:12:0x001a, B:13:0x002a, B:14:0x001d, B:16:0x0023, B:21:0x006f, B:24:0x0067, B:25:0x0069, B:35:0x006a, B:36:0x0071, B:38:0x0075, B:40:0x0079, B:43:0x009e, B:53:0x0032, B:55:0x0039, B:20:0x003d, B:34:0x0057, B:31:0x0061, B:28:0x0044, B:30:0x004c, B:32:0x0065), top: B:2:0x0001, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02() {
        /*
            r8 = this;
            r3 = 0
            java.lang.String r0 = "exo-closecurrentstream"
            X.AbstractC460729r.A01(r0)     // Catch: java.lang.Throwable -> Lb4
            X.2Qq r0 = r8.A08     // Catch: java.lang.Throwable -> Lb4
            if (r0 != 0) goto L32
            r8.hashCode()     // Catch: java.lang.Throwable -> Lb4
        Ld:
            X.4Bq r0 = r8.A06     // Catch: java.lang.Throwable -> Lb4
            r2 = 1
            if (r0 == 0) goto L71
            X.2BB r1 = r8.A0D     // Catch: java.lang.Throwable -> Lb4
            if (r1 == 0) goto L1d
            boolean r0 = r8.A0E     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L2a
            r1.Dv8()     // Catch: java.lang.Throwable -> Lb4
        L1d:
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r8.A0M     // Catch: java.lang.Throwable -> Lb4
            boolean r0 = r0.A1k     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L6a
            java.lang.String r4 = "DataSource Close has been interrupted by loadable.cancel: %s"
            X.4Bq r0 = r8.A06     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L71
            goto L3d
        L2a:
            X.4C7 r0 = r8.A00()     // Catch: java.lang.Throwable -> Lb4
            r1.Dv9(r8, r0, r2)     // Catch: java.lang.Throwable -> Lb4
            goto L1d
        L32:
            r8.hashCode()     // Catch: java.lang.Throwable -> Lb4
            java.io.File r0 = r0.A05     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto Ld
            r0.getPath()     // Catch: java.lang.Throwable -> Lb4
            goto Ld
        L3d:
            r0.close()     // Catch: java.io.InterruptedIOException -> L41 X.C93214Fx -> L43 java.lang.Throwable -> L66
            goto L6f
        L41:
            r0 = move-exception
            goto L57
        L43:
            r2 = move-exception
            java.lang.Throwable r0 = r2.getCause()     // Catch: java.lang.Throwable -> L66
            boolean r0 = r0 instanceof java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L65
            java.lang.String r1 = "FbHttpCacheDataSource"
            java.lang.String r0 = r2.getMessage()     // Catch: java.lang.Throwable -> L66
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L66
            goto L61
        L57:
            java.lang.String r1 = "FbHttpCacheDataSource"
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L66
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L66
        L61:
            X.AbstractC459729h.A01(r1, r4, r0)     // Catch: java.lang.Throwable -> L66
            goto L6f
        L65:
            throw r2     // Catch: java.lang.Throwable -> L66
        L66:
            r0 = move-exception
            r8.A06 = r3     // Catch: java.lang.Throwable -> Lb4
            throw r0     // Catch: java.lang.Throwable -> Lb4
        L6a:
            X.4Bq r0 = r8.A06     // Catch: java.lang.Throwable -> Lb4
            r0.close()     // Catch: java.lang.Throwable -> Lb4
        L6f:
            r8.A06 = r3     // Catch: java.lang.Throwable -> Lb4
        L71:
            X.2Qq r2 = r8.A08     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto La3
            boolean r0 = r2.A07     // Catch: java.lang.Throwable -> Lb4
            if (r0 != 0) goto La3
            java.lang.String r7 = "FbHttpCacheDataSource"
            java.lang.String r6 = "Cache data sink close stream. Type:%s, Offset:%d, FileSize:%d, Vid:%s, Key:%s"
            X.4Ae r5 = r8.A0K     // Catch: java.lang.Throwable -> Lb4
            long r0 = r2.A04     // Catch: java.lang.Throwable -> Lb4
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> Lb4
            long r0 = r2.A03     // Catch: java.lang.Throwable -> Lb4
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> Lb4
            X.4Bk r0 = r8.A0L     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = r0.A07     // Catch: java.lang.Throwable -> Lb4
            X.4C9 r0 = r8.A03     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = r0.A06     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r4, r2, r1, r0}     // Catch: java.lang.Throwable -> Lb4
            X.AbstractC459729h.A01(r7, r6, r0)     // Catch: java.lang.Throwable -> Lb4
            X.4JB r0 = r8.A05     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto La3
            r0.close()     // Catch: X.C93234Fz -> La3 java.lang.Throwable -> Lb4
            r8.A05 = r3     // Catch: X.C93234Fz -> La3 java.lang.Throwable -> Lb4
        La3:
            X.2Qq r1 = r8.A08
            if (r1 == 0) goto Lae
            boolean r0 = r1.A07
            if (r0 != 0) goto Lae
            r8.A03(r1)
        Lae:
            r8.A08 = r3
            X.AbstractC460729r.A00()
            return
        Lb4:
            r2 = move-exception
            X.2Qq r1 = r8.A08
            if (r1 == 0) goto Lc0
            boolean r0 = r1.A07
            if (r0 != 0) goto Lc0
            r8.A03(r1)
        Lc0:
            r8.A08 = r3
            X.AbstractC460729r.A00()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Bz.A02():void");
    }

    @Override // X.InterfaceC92354Bq
    public final void cancel() {
        this.A09 = false;
        this.A01 = -1L;
        this.A0E = true;
    }

    @Override // X.InterfaceC92354Bq
    public final android.net.Uri getUri() {
        return null;
    }

    @Override // X.InterfaceC92354Bq
    public final long open(C4C7 c4c7) {
        Boolean valueOf;
        long j;
        C4C9 c4c9;
        android.net.Uri uri;
        this.A0E = false;
        try {
            String str = c4c7.A08;
            C92304Bk c92304Bk = this.A0L;
            String str2 = c92304Bk.A07;
            android.net.Uri uri2 = c4c7.A06;
            boolean z = c92304Bk.A01;
            HeroPlayerSetting heroPlayerSetting = this.A0M;
            boolean z2 = heroPlayerSetting.A3G;
            String A00 = AbstractC459729h.A00(uri2, str, str2, z, z2);
            if (heroPlayerSetting.A1Q) {
                C2QD A03 = this.A0J.A03();
                long j2 = c4c7.A04;
                long j3 = c4c7.A03;
                if (!A03.CR5(A00, j2, j3)) {
                    boolean z3 = false;
                    if (!z) {
                        z3 = true;
                    }
                    String A002 = AbstractC459729h.A00(uri2, str, str2, z3, z2);
                    if (A03.CR5(A002, j2, j3 / 2)) {
                        A00 = A002;
                    }
                }
            }
            if (this.A09 && (c4c9 = this.A03) != null) {
                long j4 = c4c7.A04;
                if (j4 == this.A01 && (uri = c4c9.A04) != null && uri.equals(uri2)) {
                    Long valueOf2 = Long.valueOf(j4);
                    long j5 = c4c7.A03;
                    AbstractC459729h.A01("FbHttpCacheDataSource", "[overfetch] datasource is already open for position: %d length: %d", valueOf2, Long.valueOf(j5));
                    this.A03 = new C4C9(c4c7, A00);
                    this.A09 = false;
                    this.A01 = -1L;
                    return j5;
                }
            }
            if (this.A09) {
                AbstractC459729h.A01("FbHttpCacheDataSource", "[overfetch] unexpected position in open: ds.pos:%d of-pos:%d", Long.valueOf(c4c7.A04), Long.valueOf(this.A01));
                A02();
                this.A09 = false;
                this.A01 = -1L;
                this.A03 = null;
            } else {
                boolean z4 = false;
                if (this.A03 == null) {
                    z4 = true;
                }
                C4B8.A04(z4);
            }
            this.A03 = new C4C9(c4c7, A00);
            if (heroPlayerSetting.A0y.A0K) {
                C5J9 c5j9 = new C5J9(c92304Bk, uri2.toString());
                this.A04 = c5j9;
                C2QD A032 = this.A0J.A03();
                C4C9 c4c92 = this.A03;
                long j6 = c4c92.A02;
                c5j9.A05 = j6;
                long j7 = c4c92.A01;
                long j8 = -1;
                if (j7 != -1) {
                    j8 = j7 + j6;
                }
                c5j9.A04 = j8;
                String str3 = c4c92.A06;
                c5j9.A07 = str3;
                NavigableSet Ajh = A032.Ajh(str3);
                boolean z5 = false;
                if (!Ajh.isEmpty()) {
                    z5 = true;
                }
                c5j9.A09 = z5;
                long j9 = -1;
                if (!Ajh.isEmpty()) {
                    long j10 = ((C49802Qq) Ajh.first()).A04;
                    C49802Qq c49802Qq = (C49802Qq) Ajh.last();
                    long j11 = c49802Qq.A03;
                    if (j11 != -1) {
                        j9 = c49802Qq.A04 + j11;
                    }
                    j = j9;
                    j9 = j10;
                } else {
                    j = -1;
                }
                c5j9.A06 = Pair.create(Long.valueOf(j9), Long.valueOf(j));
            }
            C4C6 c4c6 = c4c7.A07;
            A04();
            String obj = c92304Bk.A00.toString();
            EnumC91984Ae enumC91984Ae = this.A0K;
            Long valueOf3 = Long.valueOf(c4c7.A04);
            Long valueOf4 = Long.valueOf(c4c7.A02);
            long j12 = c4c7.A03;
            AbstractC459729h.A01("FbHttpCacheDataSource", "Cache data source open spec. RequestType: %s, StreamType:%s, Position:%d/%d, Length:%d, Vid:%s, Key:%s", obj, enumC91984Ae, valueOf3, valueOf4, Long.valueOf(j12), str2, A00);
            if (heroPlayerSetting.A0z.enableSloHttpHeaderLogging) {
                if (str2 != null) {
                    OT3 ot3 = OT3.A01;
                    synchronized (ot3) {
                        try {
                            boolean z6 = false;
                            if (ot3.A00.get(str2) != null) {
                                z6 = true;
                            }
                            valueOf = Boolean.valueOf(z6);
                        } finally {
                        }
                    }
                    if (valueOf.booleanValue()) {
                    }
                }
                if (c4c6 == null || !c4c6.A0Q.containsKey("x-fb-qpl-ec")) {
                    C4J9.A02(c4c7);
                    if (c4c6 != null) {
                    }
                }
                Map map = c4c6.A0Q;
                Object obj2 = map.get("x-fb-qpl-ec");
                if (obj2 != null) {
                    c4c7.A01(map);
                    OT3 ot32 = OT3.A01;
                    synchronized (ot32) {
                        try {
                            ot32.A00.put(str2, obj2);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            if (j12 == -1) {
                long j13 = this.A02;
                if (j13 > 0) {
                    return j13;
                }
            }
            String str4 = c92304Bk.A04;
            List asList = Arrays.asList("".split(";"));
            if (str4 != null && !str4.isEmpty() && asList.contains(str4) && j12 == -1 && enumC91984Ae == EnumC91984Ae.PROGRESSIVE) {
                long j14 = this.A00;
                if (j14 > 0) {
                    return j14;
                }
            }
            return j12;
        } catch (IOException e) {
            this.A09 = false;
            this.A01 = -1L;
            if (this.A0M.A0y.A0K) {
                this.A04.A08 = true;
            }
            C2BB c2bb = this.A0D;
            if (c2bb != null) {
                if (this.A0E) {
                    c2bb.Dv8();
                } else {
                    c2bb.DvA(e);
                    throw e;
                }
            }
            throw e;
        }
    }

    private C4C7 A00() {
        File file;
        C4C9 c4c9 = this.A03;
        long j = c4c9.A02;
        long j2 = c4c9.A01;
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        C49802Qq c49802Qq = this.A08;
        if (c49802Qq != null && c49802Qq.A07) {
            j -= c49802Qq.A04;
            j2 = Math.min(c49802Qq.A03 - j, j2);
        }
        android.net.Uri uri = android.net.Uri.EMPTY;
        if (c49802Qq != null && (file = c49802Qq.A05) != null) {
            uri = android.net.Uri.fromFile(file);
        }
        Map emptyMap = Collections.emptyMap();
        if (uri == null) {
            uri = android.net.Uri.EMPTY;
        }
        C4C9 c4c92 = this.A03;
        long j3 = c4c92.A00 - j;
        if (j2 <= 0) {
            j2 = -1;
        }
        String str = c4c92.A06;
        int i = c4c92.A03;
        C4C6 c4c6 = c4c92.A05;
        C4B8.A02(uri);
        C4C7 c4c7 = C4C7.A0B;
        if (c4c6 == null) {
            c4c6 = new C4C6();
        }
        return new C4C7(uri, c4c6, str, emptyMap, null, 1, i, j3, j, j2);
    }

    private C49802Qq A01(C2QE c2qe) {
        for (C49802Qq c49802Qq : c2qe.Ajh(this.A03.A06)) {
            if (this.A03.A02 < c49802Qq.A04) {
                return c49802Qq;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.4rO, java.lang.Object] */
    private void A03(C49802Qq c49802Qq) {
        C2BZ c2bz = this.A0J;
        if (c2bz.A03() != null) {
            if (this.A0M.A0y.A0K) {
                C106664rO c106664rO = C106664rO.A04;
                C106664rO c106664rO2 = c106664rO;
                if (c106664rO == null) {
                    ?? obj = new Object();
                    C106664rO.A04 = obj;
                    c106664rO2 = obj;
                }
                C49802Qq c49802Qq2 = this.A08;
                C106694rR c106694rR = c106664rO2.A00;
                synchronized (c106694rR) {
                    c106694rR.A01.remove(c49802Qq2);
                    c106694rR.A00.remove(c49802Qq2);
                }
            }
            c2bz.A03().EEJ(c49802Qq);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:146|(1:148)|149|(1:151)|152|(1:154)|155|(4:157|2eb|162|(2:164|(4:166|167|168|169)))|174|(2:176|(3:178|(1:180)|181))|(1:183)|184|(1:186)|187|(1:189)(1:259)|190|(1:192)|193|(1:195)|196|197|198|(1:200)|201|(1:203)|204|(4:206|(1:208)|209|(1:211))|212|(3:216|(9:218|(2:220|(1:222))(2:238|239)|223|(1:225)(1:237)|226|(1:228)|229|(1:231)|232)|240)|241|168|169) */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x04c7, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x04c8, code lost:
    
        r37.A09 = false;
        r37.A01 = -1;
        r5 = r37.A07;
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x04d5, code lost:
    
        if ((r6 instanceof X.C93204Fw) == false) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x04e0, code lost:
    
        r1 = X.C4J9.A00(r5.getResponseHeaders(), r14.A1p);
        r37.A02 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x04ec, code lost:
    
        if (r11 != null) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x04ee, code lost:
    
        r11.A04(r13, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x04f1, code lost:
    
        r7 = r37.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x04f7, code lost:
    
        if (r7.A01 == (-1)) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x04f9, code lost:
    
        r1 = r37.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x04fd, code lost:
    
        if (r1 > 0) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x04ff, code lost:
    
        r7.A01 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0501, code lost:
    
        android.util.Log.e("FbHttpCacheDataSource", java.lang.String.format("Returning length 0 after 416 response", new java.lang.Object[0]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:?, code lost:
    
        throw r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021c A[Catch: all -> 0x0522, TryCatch #2 {all -> 0x0522, blocks: (B:96:0x01a0, B:98:0x01a9, B:99:0x01ac, B:101:0x01b0, B:104:0x01c2, B:107:0x01da, B:109:0x0211, B:110:0x0216, B:112:0x021c, B:114:0x022e, B:115:0x0230, B:117:0x0237, B:118:0x0239, B:149:0x02bc, B:151:0x02cb, B:152:0x02d3, B:155:0x02df, B:157:0x02e9, B:158:0x02eb, B:164:0x02f7, B:166:0x02ff, B:173:0x0316, B:176:0x031b, B:178:0x0325, B:181:0x0337, B:183:0x034f, B:184:0x035a, B:186:0x0366, B:187:0x0368, B:190:0x0376, B:192:0x0387, B:193:0x038c, B:195:0x03a5, B:197:0x03af, B:198:0x03b5, B:200:0x03c9, B:201:0x03cc, B:203:0x03d4, B:204:0x03d8, B:206:0x0409, B:208:0x041b, B:209:0x041d, B:211:0x0425, B:212:0x0427, B:214:0x042b, B:218:0x0433, B:220:0x0437, B:223:0x0448, B:225:0x0450, B:226:0x0459, B:228:0x0469, B:229:0x046b, B:231:0x048a, B:232:0x048f, B:237:0x0478, B:239:0x0446, B:235:0x0518, B:236:0x0521, B:240:0x04bb, B:244:0x04c8, B:246:0x04d7, B:248:0x04e0, B:250:0x04ee, B:251:0x04f1, B:253:0x04f9, B:255:0x04ff, B:256:0x0501, B:264:0x0243, B:265:0x0248, B:267:0x01b6, B:269:0x01bd, B:160:0x02ec, B:161:0x02f2), top: B:95:0x01a0, outer: #3, inners: #0, #1, #4, #6 }] */
    /* JADX WARN: Type inference failed for: r2v14, types: [X.4rO, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A04() {
        /*
            Method dump skipped, instructions count: 1335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Bz.A04():boolean");
    }

    @Override // X.InterfaceC92374Bs
    public final void changeHttpPriority(byte b, boolean z) {
        this.A07.changeHttpPriority(b, z);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.4rO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.4rO, java.lang.Object] */
    @Override // X.InterfaceC92354Bq
    public final void close() {
        C4C9 c4c9;
        if (!this.A09) {
            HeroPlayerSetting heroPlayerSetting = this.A0M;
            if (heroPlayerSetting.A1k) {
                c4c9 = null;
                try {
                    if (heroPlayerSetting.A0y.A0K) {
                        C106664rO c106664rO = C106664rO.A04;
                        C106664rO c106664rO2 = c106664rO;
                        if (c106664rO == null) {
                            ?? obj = new Object();
                            C106664rO.A04 = obj;
                            c106664rO2 = obj;
                        }
                        c106664rO2.A00(this.A04);
                    }
                    A02();
                } finally {
                    this.A03 = null;
                }
            } else {
                if (heroPlayerSetting.A0y.A0K) {
                    C106664rO c106664rO3 = C106664rO.A04;
                    C106664rO c106664rO4 = c106664rO3;
                    if (c106664rO3 == null) {
                        ?? obj2 = new Object();
                        C106664rO.A04 = obj2;
                        c106664rO4 = obj2;
                    }
                    c106664rO4.A00(this.A04);
                }
                A02();
                c4c9 = null;
            }
            return;
        }
        C4C9 c4c92 = this.A03;
        AbstractC459729h.A01("FbHttpCacheDataSource", "[overfetch] datasource is attempted to call close, but continue for position: %d length: %d", Long.valueOf(c4c92.A02), Long.valueOf(c4c92.A01));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.4C1, X.4C0] */
    public C4Bz(C2BB c2bb, C2BZ c2bz, EnumC91984Ae enumC91984Ae, C92304Bk c92304Bk, C2BY c2by, HeroPlayerSetting heroPlayerSetting, InterfaceC92344Bp interfaceC92344Bp, AtomicBoolean atomicBoolean, int i, long j, long j2, boolean z, boolean z2, boolean z3) {
        this.A0J = c2bz;
        this.A0L = c92304Bk;
        this.A07 = interfaceC92344Bp;
        this.A0P = z;
        this.A0D = c2bb;
        this.A0Q = c2by;
        this.A0G = i;
        this.A0H = j;
        this.A0A = z2;
        this.A0M = heroPlayerSetting;
        this.A0R = atomicBoolean;
        this.A0K = enumC91984Ae;
        this.A0O = z3;
        this.A0I = j2;
    }

    @Override // X.InterfaceC92354Bq
    public final void addTransferListener(C2BC c2bc) {
        C2BB wva;
        c2bc.getClass();
        if (c2bc instanceof C2BB) {
            wva = (C2BB) c2bc;
        } else {
            wva = new WVA(c2bc);
        }
        this.A0D = wva;
    }

    @Override // X.InterfaceC92354Bq
    public final /* synthetic */ Map getResponseHeaders() {
        return Collections.emptyMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a3, code lost:
    
        if (r4 != (-1)) goto L44;
     */
    @Override // X.InterfaceC92364Br
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Bz.read(byte[], int, int):int");
    }
}
