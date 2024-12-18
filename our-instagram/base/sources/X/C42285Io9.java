package X;

import com.facebook.stash.core.FileStash;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Io9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42285Io9 implements InterfaceC12870lZ, InterfaceC25441Ly, InterfaceC13000lm {
    public final FileStash A00;
    public final UserSession A01;
    public final C1M6 A02;
    public final HashMap A03;
    public final ConcurrentHashMap A04;
    public final InterfaceC09390do A05;
    public final HashSet A06;

    public C42285Io9(UserSession userSession, HashMap hashMap) {
        int i;
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A03 = hashMap;
        this.A05 = J8V.A00(this, 28);
        this.A00 = C1M7.A01().A05(1815290099);
        this.A04 = new ConcurrentHashMap();
        this.A06 = AbstractC166987dD.A1H();
        this.A02 = AbstractC25451Lz.A00(userSession);
        C218914p.A05(this);
        if (Systrace.A0E(1L)) {
            C0fO.A01("AsyncSignalDataPersistentStorage::init", 250515328);
        }
        try {
            int A07 = AbstractC25225BEi.A07(C06090Tz.A05, this.A01, 36599125726989768L);
            if (A07 != 0) {
                if (A07 != 1) {
                    i = 3;
                    if (A07 != 2) {
                        i = 4;
                    }
                } else {
                    i = 2;
                }
            } else {
                i = 1;
            }
            InterfaceC14020nS A00 = C14120nc.A00();
            C14360o3.A07(A00);
            A00.ATO(new HJK(this, i));
            if (Systrace.A0E(1L)) {
                C0fO.A00(1521345446);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1559725790);
            }
            throw th;
        }
    }

    @Override // X.InterfaceC25441Ly
    public final void EGI(String str) {
        C14360o3.A0B(str, 0);
        C9BW c9bw = (C9BW) this.A04.remove(str);
        if (c9bw != null) {
            this.A03.put(str, null);
            this.A06.remove(((AbstractC82583mM) c9bw.A00).A04());
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
    public final void FCF(EnumC74603Ws enumC74603Ws, Collection collection) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r7.A00 != (-1.0f)) goto L19;
     */
    @Override // X.InterfaceC25441Ly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AAM(X.C9BW r10) {
        /*
            r9 = this;
            java.lang.Object r5 = r10.A01
            X.9C7 r5 = (X.C9C7) r5
            java.lang.String r4 = r5.A06
            X.3mN r3 = X.C82593mN.A00
            boolean r0 = X.C82593mN.A00(r10)
            if (r0 == 0) goto L30
            X.3Mc r2 = X.AbstractC72283Mb.A00
            com.instagram.common.session.UserSession r1 = r9.A01
            boolean r0 = X.C72293Mc.A01(r1)
            if (r0 != 0) goto L1e
            boolean r0 = X.C72293Mc.A00(r1)
            if (r0 == 0) goto L30
        L1e:
            X.0do r0 = r9.A05
            java.lang.Object r0 = r0.getValue()
            X.3HZ r0 = (X.C3HZ) r0
            r3.A01(r10, r0)
            boolean r0 = r2.A02(r5, r1)
            if (r0 == 0) goto L30
        L2f:
            return
        L30:
            java.util.concurrent.ConcurrentHashMap r0 = r9.A04
            r0.put(r4, r10)
            java.util.HashMap r0 = r9.A03
            r0.put(r4, r10)
            java.lang.Object r0 = r5.A04
            X.317 r0 = (X.AnonymousClass317) r0
            boolean r0 = X.C82603mO.A01(r0)
            if (r0 != 0) goto L2f
            java.lang.Object r8 = r10.A00
            X.3mM r8 = (X.AbstractC82583mM) r8
            boolean r6 = r8 instanceof X.C82573mL
            r5 = 1
            if (r6 == 0) goto L61
            r7 = r8
            X.3mL r7 = (X.C82573mL) r7
            long r3 = r7.A0A
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L61
            float r1 = r7.A00
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1
            if (r0 == 0) goto L62
        L61:
            r2 = 0
        L62:
            java.util.HashSet r1 = r9.A06
            java.lang.String r0 = r8.A04()
            boolean r1 = r1.add(r0)
            if (r2 != 0) goto L70
            if (r6 != 0) goto L2f
        L70:
            X.1M6 r0 = r9.A02
            if (r2 == 0) goto L7a
            if (r1 != 0) goto L7a
        L76:
            r0.EI9(r10, r5)
            return
        L7a:
            r5 = 0
            goto L76
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42285Io9.AAM(X.9BW):void");
    }

    @Override // X.InterfaceC25441Ly
    public final List AbA() {
        Collection values = this.A04.values();
        C14360o3.A07(values);
        return AbstractC001800i.A0a(values);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        String str;
        int A03 = C0f9.A03(1242356331);
        UserSession userSession = this.A01;
        HashMap hashMap = this.A03;
        C1M6 c1m6 = this.A02;
        I9O.A00(userSession, c1m6, hashMap);
        try {
            int size = hashMap.size();
            int i = 0;
            long currentTimeMillis = System.currentTimeMillis();
            Iterator A14 = AbstractC166997dE.A14(hashMap);
            while (A14.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A14);
                String A17 = AbstractC31172DnG.A17(A1K);
                C9BW c9bw = (C9BW) A1K.getValue();
                if (c9bw == null) {
                    this.A00.remove(A17);
                } else {
                    try {
                        FileStash fileStash = this.A00;
                        C102274j2 A02 = C102274j2.A02();
                        A02.A0I(EnumC912645f.FAIL_ON_EMPTY_BEANS);
                        fileStash.write(A17, A02.A0J(C82603mO.A00.A03(c9bw)));
                        c1m6.EIF(c9bw, A17);
                        i++;
                    } catch (IOException e) {
                        e = e;
                        str = "Error writing signal model to File: ";
                        C0K8.A0F("AsyncSignalDataPersistentStorage", str, e);
                    } catch (Exception e2) {
                        e = e2;
                        str = "Error when write disk cache: ";
                        C0K8.A0F("AsyncSignalDataPersistentStorage", str, e);
                    } catch (ExceptionInInitializerError e3) {
                        e = e3;
                        str = "Error init objectMapper: ";
                        C0K8.A0F("AsyncSignalDataPersistentStorage", str, e);
                    } catch (NoClassDefFoundError unused) {
                        C0K8.A0C("AsyncSignalDataPersistentStorage", "FbObjectMapper class not found, skipping init");
                    }
                }
            }
            FileStash fileStash2 = this.A00;
            c1m6.EII(AbstractC37300Gc1.A00(currentTimeMillis), size, i, fileStash2.getAllKeys().size(), fileStash2.getSizeBytes());
            fileStash2.getItemCount();
        } catch (Exception e4) {
            C0K8.A0F("AsyncSignalDataPersistentStorage", "Error when write disk cache: ", e4);
        } catch (NoClassDefFoundError unused2) {
            C0K8.A0C("AsyncSignalDataPersistentStorage", "Class not found, skipping init");
        }
        C0f9.A0A(-1618786917, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(1115185902, C0f9.A03(1291193945));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C218914p.A06(this);
    }
}
