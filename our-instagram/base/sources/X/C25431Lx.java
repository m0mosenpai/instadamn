package X;

import com.facebook.stash.core.FileStash;
import com.instagram.common.session.UserSession;
import com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.ParcelableSignalData;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1Lx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25431Lx implements InterfaceC12870lZ, InterfaceC25441Ly, InterfaceC13000lm {
    public FileStash A00;
    public OCJ A01;
    public Long A02;
    public int A03;
    public final UserSession A04;
    public final C1M6 A05;
    public final HashMap A06;
    public final ConcurrentHashMap A07;
    public final InterfaceC09390do A08;
    public final HashSet A09;
    public final boolean A0A;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C25431Lx(com.instagram.common.session.UserSession r9, java.util.HashMap r10) {
        /*
            r8 = this;
            r5 = 1
            X.C14360o3.A0B(r9, r5)
            r8.<init>()
            r8.A04 = r9
            r8.A06 = r10
            r1 = 16
            X.9Do r0 = new X.9Do
            r0.<init>(r8, r1)
            X.0sx r0 = X.AbstractC09440dt.A01(r0)
            r8.A08 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r8.A07 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r8.A09 = r0
            X.1M6 r0 = X.AbstractC25451Lz.A00(r9)
            r8.A05 = r0
            X.0Tz r7 = X.C06090Tz.A05
            r0 = 36330084679828143(0x811205000042af, double:3.038630068807755E-306)
            boolean r6 = X.C18U.A06(r7, r9, r0)
            r8.A0A = r6
            r0 = 36317650750215624(0x8106b6000b15c8, double:3.030766801653382E-306)
            boolean r2 = X.C18U.A06(r7, r9, r0)
            r3 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L52
            r1 = -1477892942(0xffffffffa7e924b2, float:-6.4710276E-15)
            java.lang.String r0 = "SignalDataPersistentStorage::init"
            X.C0fO.A01(r0, r1)
        L52:
            if (r6 == 0) goto L61
            X.0nS r2 = X.C14120nc.A00()     // Catch: java.lang.Throwable -> L9c
            X.C14360o3.A07(r2)     // Catch: java.lang.Throwable -> L9c
            X.NGK r1 = new X.NGK     // Catch: java.lang.Throwable -> L9c
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L9c
            goto L88
        L61:
            if (r2 == 0) goto L8c
            com.instagram.common.session.UserSession r2 = r8.A04     // Catch: java.lang.Throwable -> L9c
            r0 = 36599125726989768(0x8206b6000c0dc8, double:3.208772710374108E-306)
            long r0 = X.C18U.A01(r7, r2, r0)     // Catch: java.lang.Throwable -> L9c
            int r2 = (int) r0     // Catch: java.lang.Throwable -> L9c
            r1 = 2
            if (r2 == 0) goto L7b
            if (r2 == r5) goto L79
            r0 = 3
            if (r2 == r1) goto L7c
            r0 = 4
            goto L7c
        L79:
            r0 = 2
            goto L7c
        L7b:
            r0 = 1
        L7c:
            X.0nS r2 = X.C14120nc.A00()     // Catch: java.lang.Throwable -> L9c
            X.C14360o3.A07(r2)     // Catch: java.lang.Throwable -> L9c
            X.NGJ r1 = new X.NGJ     // Catch: java.lang.Throwable -> L9c
            r1.<init>(r8, r0)     // Catch: java.lang.Throwable -> L9c
        L88:
            r2.ATO(r1)     // Catch: java.lang.Throwable -> L9c
            goto L8f
        L8c:
            A01(r8)     // Catch: java.lang.Throwable -> L9c
        L8f:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L9b
            r0 = 1019299334(0x3cc14606, float:0.02359296)
            X.C0fO.A00(r0)
        L9b:
            return
        L9c:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto La9
            r0 = 1464397122(0x5748ed42, float:2.2092134E14)
            X.C0fO.A00(r0)
        La9:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25431Lx.<init>(com.instagram.common.session.UserSession, java.util.HashMap):void");
    }

    public static final synchronized void A01(C25431Lx c25431Lx) {
        String str;
        synchronized (c25431Lx) {
            C1MR A05 = C1M7.A01().A05(1815290099);
            c25431Lx.A00 = A05;
            ConcurrentHashMap concurrentHashMap = c25431Lx.A07;
            HashMap hashMap = new HashMap();
            java.util.Set<String> allKeys = A05.getAllKeys();
            C14360o3.A07(allKeys);
            int size = allKeys.size();
            long currentTimeMillis = System.currentTimeMillis();
            int i = 0;
            for (String str2 : allKeys) {
                InputStream read = A05.read(str2);
                if (read != null) {
                    try {
                        C102274j2 A02 = C102274j2.A02();
                        A02.A0I(EnumC912645f.FAIL_ON_EMPTY_BEANS);
                        ParcelableSignalData parcelableSignalData = (ParcelableSignalData) A02.A0B(A02.A09.A01(read), A02.A05.A09(ParcelableSignalData.class));
                        C82603mO c82603mO = C82603mO.A00;
                        C14360o3.A0A(parcelableSignalData);
                        C9BW A022 = c82603mO.A02(parcelableSignalData);
                        hashMap.put(str2, A022);
                        c25431Lx.A05.EID(A022, str2);
                        i++;
                    } catch (IOException e) {
                        e = e;
                        str = "Error reading SignalBundle file into JsonNode: ";
                        C0K8.A0F("SignalDataPersistentStorage", str, e);
                    } catch (Exception e2) {
                        e = e2;
                        str = "Error when read disk cache: ";
                        C0K8.A0F("SignalDataPersistentStorage", str, e);
                    } catch (ExceptionInInitializerError e3) {
                        e = e3;
                        str = "Error init objectMapper: ";
                        C0K8.A0F("SignalDataPersistentStorage", str, e);
                    } catch (NoClassDefFoundError unused) {
                        C0K8.A0C("SignalDataPersistentStorage", "FbObjectMapper class not found, skipping init");
                    }
                }
            }
            c25431Lx.A05.EIG(size, i, System.currentTimeMillis() - currentTimeMillis);
            A05.getItemCount();
            hashMap.size();
            concurrentHashMap.putAll(hashMap);
            boolean z = C218914p.A05;
            C218914p.A03(EnumC220415e.A03, c25431Lx);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        if (r8.A00 != (-1.0f)) goto L34;
     */
    @Override // X.InterfaceC25441Ly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void AAM(X.C9BW r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.Object r8 = r11.A00     // Catch: java.lang.Throwable -> Ld8
            X.3mM r8 = (X.AbstractC82583mM) r8     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r7 = r8.A04()     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r0 = "n/a"
            boolean r0 = X.C14360o3.A0K(r7, r0)     // Catch: java.lang.Throwable -> Ld8
            if (r0 != 0) goto Ld6
            java.lang.Object r2 = r11.A01     // Catch: java.lang.Throwable -> Ld8
            X.9C7 r2 = (X.C9C7) r2     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r4 = r2.A06     // Catch: java.lang.Throwable -> Ld8
            X.3mN r3 = X.C82593mN.A00     // Catch: java.lang.Throwable -> Ld8
            boolean r0 = X.C82593mN.A00(r11)     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L5c
            X.3Mc r6 = X.AbstractC72283Mb.A00     // Catch: java.lang.Throwable -> Ld8
            com.instagram.common.session.UserSession r5 = r10.A04     // Catch: java.lang.Throwable -> Ld8
            boolean r0 = X.C72293Mc.A01(r5)     // Catch: java.lang.Throwable -> Ld8
            if (r0 != 0) goto L30
            boolean r0 = X.C72293Mc.A00(r5)     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L5c
        L30:
            X.0Tz r9 = X.C06090Tz.A05     // Catch: java.lang.Throwable -> Ld8
            r0 = 36318114607601581(0x810722001917ad, double:3.031060146932065E-306)
            boolean r0 = X.C18U.A06(r9, r5, r0)     // Catch: java.lang.Throwable -> Ld8
            if (r0 != 0) goto L55
            X.0Tz r9 = X.C06090Tz.A06     // Catch: java.lang.Throwable -> Ld8
            r0 = 36323217027771476(0x810bc6000a2c54, double:3.0342869379933034E-306)
            boolean r0 = X.C18U.A06(r9, r5, r0)     // Catch: java.lang.Throwable -> Ld8
            if (r0 != 0) goto L55
            X.0do r0 = r10.A08     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> Ld8
            X.3HZ r0 = (X.C3HZ) r0     // Catch: java.lang.Throwable -> Ld8
            r3.A01(r11, r0)     // Catch: java.lang.Throwable -> Ld8
        L55:
            boolean r0 = r6.A02(r2, r5)     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L5c
            goto Ld6
        L5c:
            java.util.concurrent.ConcurrentHashMap r0 = r10.A07     // Catch: java.lang.Throwable -> Ld8
            r0.put(r4, r11)     // Catch: java.lang.Throwable -> Ld8
            java.util.HashMap r0 = r10.A06     // Catch: java.lang.Throwable -> Ld8
            r0.put(r4, r11)     // Catch: java.lang.Throwable -> Ld8
            boolean r0 = X.C82593mN.A00(r11)     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L95
            X.3Mc r0 = X.AbstractC72283Mb.A00     // Catch: java.lang.Throwable -> Ld8
            com.instagram.common.session.UserSession r5 = r10.A04     // Catch: java.lang.Throwable -> Ld8
            X.0Tz r4 = X.C06090Tz.A05     // Catch: java.lang.Throwable -> Ld8
            r0 = 36318114607601581(0x810722001917ad, double:3.031060146932065E-306)
            boolean r0 = X.C18U.A06(r4, r5, r0)     // Catch: java.lang.Throwable -> Ld8
            if (r0 != 0) goto L8a
            X.0Tz r4 = X.C06090Tz.A06     // Catch: java.lang.Throwable -> Ld8
            r0 = 36323217027771476(0x810bc6000a2c54, double:3.0342869379933034E-306)
            boolean r0 = X.C18U.A06(r4, r5, r0)     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L95
        L8a:
            X.0do r0 = r10.A08     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> Ld8
            X.3HZ r0 = (X.C3HZ) r0     // Catch: java.lang.Throwable -> Ld8
            r3.A01(r11, r0)     // Catch: java.lang.Throwable -> Ld8
        L95:
            int r0 = r10.A03     // Catch: java.lang.Throwable -> Ld8
            r6 = 1
            int r0 = r0 + 1
            r10.A03 = r0     // Catch: java.lang.Throwable -> Ld8
            r10.A00()     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object r0 = r2.A04     // Catch: java.lang.Throwable -> Ld8
            X.317 r0 = (X.AnonymousClass317) r0     // Catch: java.lang.Throwable -> Ld8
            boolean r0 = X.C82603mO.A01(r0)     // Catch: java.lang.Throwable -> Ld8
            if (r0 != 0) goto Ld6
            boolean r5 = r8 instanceof X.C82573mL     // Catch: java.lang.Throwable -> Ld8
            if (r5 == 0) goto Lc0
            X.3mL r8 = (X.C82573mL) r8     // Catch: java.lang.Throwable -> Ld8
            long r3 = r8.A0A     // Catch: java.lang.Throwable -> Ld8
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Lc0
            float r1 = r8.A00     // Catch: java.lang.Throwable -> Ld8
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1
            if (r0 == 0) goto Lc1
        Lc0:
            r2 = 0
        Lc1:
            java.util.HashSet r0 = r10.A09     // Catch: java.lang.Throwable -> Ld8
            boolean r1 = r0.add(r7)     // Catch: java.lang.Throwable -> Ld8
            if (r2 != 0) goto Lcb
            if (r5 != 0) goto Ld6
        Lcb:
            X.1M6 r0 = r10.A05     // Catch: java.lang.Throwable -> Ld8
            if (r2 == 0) goto Ld2
            if (r1 != 0) goto Ld2
            goto Ld3
        Ld2:
            r6 = 0
        Ld3:
            r0.EI9(r11, r6)     // Catch: java.lang.Throwable -> Ld8
        Ld6:
            monitor-exit(r10)
            return
        Ld8:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25431Lx.AAM(X.9BW):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r2 == X.EnumC74603Ws.A04) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC25441Ly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List AbA() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.A0A     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L3c
            java.util.concurrent.ConcurrentHashMap r0 = r6.A07     // Catch: java.lang.Throwable -> L4b
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L4b
            X.C14360o3.A07(r0)     // Catch: java.lang.Throwable -> L4b
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4b
            r5.<init>()     // Catch: java.lang.Throwable -> L4b
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> L4b
        L17:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L49
            java.lang.Object r3 = r4.next()     // Catch: java.lang.Throwable -> L4b
            r0 = r3
            X.9BW r0 = (X.C9BW) r0     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r0 = r0.A01     // Catch: java.lang.Throwable -> L4b
            X.9C7 r0 = (X.C9C7) r0     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r2 = r0.A03     // Catch: java.lang.Throwable -> L4b
            X.3Ws r2 = (X.EnumC74603Ws) r2     // Catch: java.lang.Throwable -> L4b
            X.3Ws r0 = X.EnumC74603Ws.A03     // Catch: java.lang.Throwable -> L4b
            if (r2 == r0) goto L35
            X.3Ws r1 = X.EnumC74603Ws.A04     // Catch: java.lang.Throwable -> L4b
            r0 = 0
            if (r2 != r1) goto L36
        L35:
            r0 = 1
        L36:
            if (r0 == 0) goto L17
            r5.add(r3)     // Catch: java.lang.Throwable -> L4b
            goto L17
        L3c:
            java.util.concurrent.ConcurrentHashMap r0 = r6.A07     // Catch: java.lang.Throwable -> L4b
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L4b
            X.C14360o3.A07(r0)     // Catch: java.lang.Throwable -> L4b
            java.util.List r5 = X.AbstractC001800i.A0a(r0)     // Catch: java.lang.Throwable -> L4b
        L49:
            monitor-exit(r6)
            return r5
        L4b:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25431Lx.AbA():java.util.List");
    }

    @Override // X.InterfaceC25441Ly
    public final synchronized void EGI(String str) {
        C14360o3.A0B(str, 0);
        C9BW c9bw = (C9BW) this.A07.remove(str);
        if (c9bw != null) {
            this.A06.put(str, null);
            this.A09.remove(((AbstractC82583mM) c9bw.A00).A04());
            C9C7 c9c7 = (C9C7) c9bw.A01;
            AnonymousClass317 anonymousClass317 = (AnonymousClass317) c9c7.A04;
            if (AbstractC106574rB.A00(anonymousClass317) != AnonymousClass317.A0S) {
                String str2 = c9c7.A06;
                AnonymousClass317 A00 = AbstractC106574rB.A00(anonymousClass317);
                EnumC74603Ws enumC74603Ws = (EnumC74603Ws) c9c7.A03;
                EnumC64222vh enumC64222vh = (EnumC64222vh) c9c7.A05;
                AAM(new C9BW(new C9C7((C9CQ) c9c7.A02, (EnumC64262vl) c9c7.A01, enumC74603Ws, A00, enumC64222vh, str2), (AbstractC82583mM) c9bw.A00));
            }
        }
    }

    @Override // X.InterfaceC25441Ly
    public final synchronized void FCF(EnumC74603Ws enumC74603Ws, Collection collection) {
        if (this.A0A && !collection.isEmpty()) {
            int ordinal = enumC74603Ws.ordinal();
            if (ordinal != 1 && ordinal != 3) {
                if (ordinal == 2) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        EGI((String) it.next());
                    }
                }
            } else {
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    ConcurrentHashMap concurrentHashMap = this.A07;
                    C9BW c9bw = (C9BW) concurrentHashMap.get(str);
                    if (c9bw != null) {
                        C9C7 c9c7 = (C9C7) c9bw.A01;
                        String str2 = c9c7.A06;
                        C9BW c9bw2 = new C9BW(new C9C7((C9CQ) c9c7.A02, (EnumC64262vl) c9c7.A01, enumC74603Ws, (AnonymousClass317) c9c7.A04, (EnumC64222vh) c9c7.A05, str2), (AbstractC82583mM) c9bw.A00);
                        concurrentHashMap.put(str, c9bw2);
                        this.A06.put(str, c9bw2);
                    }
                }
            }
            this.A03 += collection.size();
            A00();
        }
    }

    @Override // X.InterfaceC13000lm
    public final synchronized void onSessionWillEnd() {
        C218914p.A06(this);
    }

    private final void A00() {
        Long l = this.A02;
        if (l != null) {
            if (this.A03 >= l.longValue()) {
                InterfaceC14020nS A00 = C14120nc.A00();
                C14360o3.A07(A00);
                A00.ATO(new NGL(this));
                this.A03 = 0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0109, code lost:
    
        X.C14360o3.A0F("stash");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0110, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /* JADX WARN: Type inference failed for: r12v1, types: [X.0pQ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized void A02(X.C25431Lx r18) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25431Lx.A02(X.1Lx):void");
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(229815388);
        if (C18U.A06(C06090Tz.A05, this.A04, 36326816209713291L)) {
            InterfaceC14020nS A00 = C14120nc.A00();
            C14360o3.A07(A00);
            A00.ATO(new NGM(this));
        } else {
            A02(this);
        }
        C0f9.A0A(-758030165, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(-797020704, C0f9.A03(-922949122));
    }
}
