package X;

import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes11.dex */
public final class WYG implements C4RS {
    public final /* synthetic */ UAE A00;

    @Override // X.C4RS
    public final /* synthetic */ void Cy0(C98704bq c98704bq) {
    }

    @Override // X.C4RS
    public final /* synthetic */ void D5g(String str, boolean z) {
    }

    @Override // X.C4RS
    public final void D9S(long j, String str, boolean z) {
    }

    @Override // X.C4RS
    public final void D9T(int i, int i2, int i3, int i4) {
    }

    @Override // X.C4RS
    public final void DBq(C98704bq c98704bq, String str, List list, long j, boolean z) {
    }

    @Override // X.C4RS
    public final void DER(C117275Sm c117275Sm, String str, String str2, String str3, long j) {
    }

    @Override // X.C4RS
    public final /* synthetic */ void DIJ(String str, long j) {
    }

    @Override // X.C4RS
    public final /* synthetic */ void DLl(String str, byte[] bArr, long j) {
    }

    @Override // X.C4RS
    public final void DPI(boolean z) {
    }

    @Override // X.C4RS
    public final void DPK(String str, byte[] bArr, long j, long j2) {
    }

    @Override // X.C4RS
    public final /* synthetic */ void DPS(C68692VaS c68692VaS) {
    }

    @Override // X.C4RS
    public final /* synthetic */ void DTa(Object obj) {
    }

    @Override // X.C4RS
    public final void DVN(byte[] bArr, long j) {
    }

    @Override // X.C4RS
    public final /* synthetic */ void DY8(String str, String str2) {
    }

    @Override // X.C4RS
    public final /* synthetic */ void DZ6(EnumC46692Ch enumC46692Ch) {
    }

    @Override // X.C4RS
    public final void DZA(C4RU c4ru, float f, long j) {
    }

    @Override // X.C4RS
    public final void DaY() {
    }

    @Override // X.C4RS
    public final void Dny(C4RV c4rv, C4RU c4ru, String str, long j, boolean z, boolean z2) {
    }

    @Override // X.C4RS
    public final void Dou(long j, long j2, boolean z, boolean z2, boolean z3) {
    }

    @Override // X.C4RS
    public final void DpT(boolean z) {
    }

    @Override // X.C4RS
    public final void DtM(List list) {
    }

    @Override // X.C4RS
    public final void Duk(C117275Sm c117275Sm, C98704bq c98704bq, C98704bq c98704bq2, String str, String str2, List list, long j) {
    }

    @Override // X.C4RS
    public final void Dyn(C4RV c4rv, C4RU c4ru, String str, String str2, String str3, String str4, long j, boolean z) {
    }

    @Override // X.C4RS
    public final void DzE(C5n5 c5n5, C4RV c4rv, C4RU c4ru, Integer num, String str, String str2, String str3, String str4, String str5, long j, long j2, boolean z) {
    }

    @Override // X.C4RS
    public final void Dzn() {
    }

    @Override // X.C4RS
    public final void Dzs() {
    }

    @Override // X.C4RS
    public final void E1K(boolean z, boolean z2) {
    }

    @Override // X.C4RS
    public final void E1j(C117275Sm c117275Sm) {
    }

    @Override // X.C4RS
    public final void onCues(List list) {
    }

    @Override // X.C4RS
    public final void onDrawnToSurface() {
    }

    @Override // X.C4RS
    public final void onSeeking(long j) {
    }

    public WYG(UAE uae) {
        this.A00 = uae;
    }

    @Override // X.C4RS
    public final void DZ0() {
        UAE uae = this.A00;
        HeroPlayerSetting heroPlayerSetting = UAE.A0A;
        int i = uae.A07;
        InterfaceC71850X7i interfaceC71850X7i = uae.A04;
        if (interfaceC71850X7i != null) {
            C70167WEj c70167WEj = ((WYT) interfaceC71850X7i).A00;
            int i2 = c70167WEj.A00 % 2;
            if (i != c70167WEj.A01) {
                c70167WEj.A01 = i;
                if (i == i2) {
                    Iterator it = c70167WEj.A0A.iterator();
                    while (it.hasNext()) {
                        C161917Nb c161917Nb = ((C7NZ) it.next()).A00.A00;
                        if (c161917Nb != null) {
                            c161917Nb.A03(EnumC161927Nc.A09);
                        }
                    }
                }
            }
        }
    }

    @Override // X.C4RS
    public final void DZ1(C5n5 c5n5, C117275Sm c117275Sm, C4RV c4rv, C4RU c4ru, String str) {
        UAE uae = this.A00;
        HeroPlayerSetting heroPlayerSetting = UAE.A0A;
        int i = uae.A07;
        if (c117275Sm == null) {
            c117275Sm = new C117275Sm();
        }
        uae.A02 = c117275Sm;
        InterfaceC71850X7i interfaceC71850X7i = uae.A04;
        if (interfaceC71850X7i != null) {
            if (str == null) {
                str = "";
            }
            C70167WEj c70167WEj = ((WYT) interfaceC71850X7i).A00;
            if (i == c70167WEj.A00 % 2) {
                String str2 = c70167WEj.A03;
                if (str2 != null && str2.equals(c70167WEj.A04)) {
                    C70167WEj.A02(c70167WEj, str, false);
                    return;
                }
                return;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = c70167WEj.A0B;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            C4SS c4ss = (C4SS) concurrentLinkedQueue.poll();
            C14360o3.A0A(c4ss);
            C70167WEj.A00(c4ss, c70167WEj, false);
        }
    }

    @Override // X.C4RS
    public final void DaU(long j, String str) {
        String str2;
        String str3;
        UAE uae = this.A00;
        HeroPlayerSetting heroPlayerSetting = UAE.A0A;
        int i = uae.A07;
        InterfaceC71850X7i interfaceC71850X7i = uae.A04;
        if (interfaceC71850X7i != null) {
            C4SS c4ss = uae.A03;
            if (c4ss != null) {
                str2 = c4ss.A0K.A0G;
            } else {
                str2 = null;
            }
            boolean z = uae.A06;
            String str4 = uae.A05;
            C14360o3.A0B(str4, 3);
            C70167WEj c70167WEj = ((WYT) interfaceC71850X7i).A00;
            c70167WEj.A04 = str2;
            int i2 = c70167WEj.A00;
            if (i == i2 % 2) {
                Iterator it = c70167WEj.A0A.iterator();
                while (it.hasNext()) {
                    C161917Nb c161917Nb = ((C7NZ) it.next()).A00.A00;
                    if (c161917Nb != null) {
                        c161917Nb.A02();
                    }
                }
            } else if (i == (i2 + 1) % 2) {
                Iterator it2 = c70167WEj.A0A.iterator();
                while (it2.hasNext()) {
                    C161917Nb c161917Nb2 = ((C7NZ) it2.next()).A00.A00;
                    if (c161917Nb2 != null) {
                        c161917Nb2.A07.schedule(new X28(c161917Nb2), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                    }
                }
            }
            if (z && (str3 = c70167WEj.A03) != null && str3.equals(c70167WEj.A04)) {
                C70167WEj.A02(c70167WEj, str4, true);
            }
        }
    }

    @Override // X.C4RS
    public final void Dp7(C5n5 c5n5) {
        UAE uae = this.A00;
        HeroPlayerSetting heroPlayerSetting = UAE.A0A;
        InterfaceC71850X7i interfaceC71850X7i = uae.A04;
        if (interfaceC71850X7i != null) {
            C4RQ c4rq = uae.A08;
            if (c4rq != null) {
                c4rq.A08();
            }
            C117275Sm c117275Sm = uae.A02;
            if (c117275Sm == null) {
                c117275Sm = new C117275Sm();
            }
            String str = uae.A05;
            if (str == null) {
                str = "";
            }
            C14360o3.A0B(c117275Sm, 7);
            Iterator it = ((WYT) interfaceC71850X7i).A00.A0A.iterator();
            while (it.hasNext()) {
                C161917Nb c161917Nb = ((C7NZ) it.next()).A00.A00;
                if (c161917Nb != null) {
                    c161917Nb.A04.get(str);
                    Iterator it2 = c161917Nb.A06.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (r1.equals(r14.A04) == false) goto L28;
     */
    @Override // X.C4RS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dyu(X.C5n5 r28, X.C4RV r29, X.C4RU r30, java.lang.Integer r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WYG.Dyu(X.5n5, X.4RV, X.4RU, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    @Override // X.C4RS
    public final void Dzu(int i, int i2, float f) {
        UAE uae = this.A00;
        HeroPlayerSetting heroPlayerSetting = UAE.A0A;
        int i3 = uae.A07;
        InterfaceC71850X7i interfaceC71850X7i = uae.A04;
        if (interfaceC71850X7i != null) {
            C66626UPo c66626UPo = new C66626UPo(i, i2, f);
            C70167WEj c70167WEj = ((WYT) interfaceC71850X7i).A00;
            c70167WEj.A0C[i3] = c66626UPo;
            C70167WEj.A01(c70167WEj, i3);
            Iterator it = c70167WEj.A0A.iterator();
            while (it.hasNext()) {
                C161917Nb c161917Nb = ((C7NZ) it.next()).A00.A00;
                if (c161917Nb != null) {
                    Iterator it2 = c161917Nb.A06.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                }
            }
        }
    }

    @Override // X.C4RS
    public final void E08(C4RV c4rv, C4RU c4ru, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2) {
        C4SS c4ss;
        UAE uae = this.A00;
        HeroPlayerSetting heroPlayerSetting = UAE.A0A;
        uae.A02 = null;
        uae.A00 = j;
        InterfaceC71850X7i interfaceC71850X7i = uae.A04;
        if (interfaceC71850X7i != null) {
            C70167WEj c70167WEj = ((WYT) interfaceC71850X7i).A00;
            if (!c70167WEj.A06) {
                ConcurrentLinkedQueue concurrentLinkedQueue = c70167WEj.A0B;
                if (!concurrentLinkedQueue.isEmpty() && (c4ss = (C4SS) concurrentLinkedQueue.poll()) != null) {
                    C70167WEj.A00(c4ss, c70167WEj, false);
                }
            }
        }
    }

    public WYG() {
    }
}
