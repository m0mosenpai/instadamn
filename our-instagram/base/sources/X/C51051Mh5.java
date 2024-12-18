package X;

import android.content.Context;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Mh5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51051Mh5 extends AbstractC52922bZ implements InterfaceC25221BDv {
    public OJH A00;
    public C22993ABs A01;
    public OW5 A02;
    public C195868lW A03;
    public final C2GT A04;
    public final C2GS A05;
    public final C2GS A06;
    public final UserSession A07;
    public final C2GT A08;
    public final AnonymousClass840 A09;
    public final InterfaceC57936Pmg A0A;
    public final C8K6 A0B;

    @Override // X.InterfaceC25221BDv
    public final void AUd(Context context) {
        String str;
        C2GS c2gs;
        Object obj;
        C14360o3.A0B(context, 0);
        C195868lW A04 = this.A09.A02.A01.A04();
        if (A04 == null) {
            c2gs = this.A06;
            obj = C218429lE.A00;
        } else {
            Long l = null;
            String str2 = A04.A0k;
            C6S5 c6s5 = C6S5.A05;
            C16930sl c16930sl = C16930sl.A00;
            this.A01 = new C22993ABs(c6s5, null, null, str2, AbstractC166987dD.A1G(), c16930sl, c16930sl, 0, 0, -1);
            try {
                OW5 ow5 = new OW5(context, this.A07, AbstractC166987dD.A11(A04.A0k), null);
                ow5.A01 = this;
                ow5.A00();
                this.A02 = ow5;
            } catch (IOException unused) {
                this.A06.A0A(C218429lE.A00);
            }
            C2GT c2gt = this.A04;
            Long l2 = null;
            if (!(c2gt.A02() instanceof C218429lE)) {
                String A07 = A04.A07();
                C195868lW c195868lW = this.A03;
                if (c195868lW != null) {
                    str = c195868lW.A07();
                } else {
                    str = null;
                }
                if (C14360o3.A0K(A07, str)) {
                    if (c2gt.A02() instanceof C218409lC) {
                        C22993ABs c22993ABs = this.A01;
                        if (c22993ABs != null) {
                            List list = c22993ABs.A07;
                            c2gs = this.A06;
                            obj = new C218409lC(list);
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    } else {
                        c2gs = this.A06;
                        obj = C218419lD.A00;
                    }
                }
            }
            this.A03 = A04;
            int i = A04.A0H;
            int i2 = A04.A06;
            C8K6 c8k6 = this.A0B;
            String str3 = A04.A0k;
            InterfaceC57936Pmg interfaceC57936Pmg = this.A0A;
            if (i > 0) {
                l = AbstractC31171DnF.A0V(i);
            }
            if (i2 > 0) {
                l2 = AbstractC31171DnF.A0V(i2);
            }
            c8k6.A01(this.A07, interfaceC57936Pmg, l, l2, str3);
            return;
        }
        c2gs.A0A(obj);
    }

    @Override // X.InterfaceC25221BDv
    public final int C9o(Context context) {
        String str;
        C1815483h c1815483h = this.A09.A02.A01;
        C195868lW A04 = c1815483h.A04();
        if (A04 != null) {
            int i = A04.A06 - A04.A0H;
            if (i > 0) {
                return i;
            }
        }
        C195868lW A042 = c1815483h.A04();
        if (A042 != null) {
            str = AbstractC166987dD.A11(A042.A0k).getCanonicalPath();
        } else {
            str = null;
        }
        MYB A02 = AbstractC55147OdA.A02(context, str, false);
        if (A02 != null) {
            return (int) A02.A07;
        }
        return 0;
    }

    @Override // X.InterfaceC25221BDv
    public final /* synthetic */ void ETa(String str, String str2) {
        AbstractC226599zH.A00(this, str, str2);
    }

    @Override // X.InterfaceC25221BDv
    public final void reset() {
        this.A03 = null;
        this.A01 = null;
        OW5 ow5 = this.A02;
        if (ow5 != null) {
            ow5.A01 = null;
        }
        this.A02 = null;
    }

    private final SortedSet A00(List list, Map map) {
        int i;
        C195868lW A04 = this.A09.A02.A01.A04();
        int i2 = 0;
        if (A04 != null && (i = A04.A0H) > 0) {
            i2 = i;
        }
        C225117n A05 = AbstractC224517h.A05(new PV2(new C30507Dbq(i2, 34, list, map), AbstractC001800i.A0o(list)));
        TreeSet treeSet = new TreeSet(new C50583MUt(5));
        C14360o3.A0B(A05, 0);
        Iterator it = A05.iterator();
        while (it.hasNext()) {
            treeSet.add(it.next());
        }
        return treeSet;
    }

    @Override // X.InterfaceC25221BDv
    public final void AHd() {
        C22993ABs c22993ABs = this.A01;
        if (c22993ABs != null) {
            this.A05.A0A(AbstractC166987dD.A11(c22993ABs.A08));
        }
    }

    @Override // X.InterfaceC25221BDv
    public final C2GT AgF() {
        return this.A08;
    }

    @Override // X.InterfaceC25221BDv
    public final C22993ABs BKP() {
        return this.A01;
    }

    @Override // X.InterfaceC25221BDv
    public final C2GT C9B() {
        return this.A04;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [X.OW6, java.lang.Object] */
    @Override // X.InterfaceC25221BDv
    public final void F8C(Context context) {
        C22993ABs c22993ABs = this.A01;
        if (c22993ABs != null) {
            OW5 ow5 = this.A02;
            if (ow5 == null) {
                ow5 = new OW5(context, this.A07, AbstractC166987dD.A11(c22993ABs.A08), A00(c22993ABs.A07, c22993ABs.A09));
                ow5.A01 = this;
                ow5.A00();
                this.A02 = ow5;
            }
            ow5.A01 = this;
            SortedSet A00 = A00(c22993ABs.A07, c22993ABs.A09);
            if (!C14360o3.A0K(ow5.A03, A00)) {
                ow5.A03 = A00;
                if (ow5.A02 == null) {
                    ow5.A00();
                    AbstractC12120kG.A05("KaraokeBleepAudioConcatInteractor_setBleepInfo", "bleepFileIsNotInitialized", null);
                    return;
                }
                C1126256q c1126256q = new C1126256q();
                C1125856m c1125856m = new C1125856m(EnumC1125356h.VIDEO);
                File file = ow5.A0A;
                AbstractC50522MSa.A1K(c1126256q, c1125856m, new C1125656k(file));
                C1125856m c1125856m2 = new C1125856m(EnumC1125356h.AUDIO);
                Iterator it = ow5.A03.iterator();
                long j = 0;
                while (it.hasNext()) {
                    C09530e4 A17 = AbstractC43592JPx.A17(it);
                    long A0N = AbstractC166987dD.A0N(A17.A00);
                    long A0N2 = AbstractC166987dD.A0N(A17.A01);
                    if (A0N > j) {
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        MSY.A1B(new C1125456i(timeUnit, j, A0N), c1125856m2, new C1125656k(file));
                    }
                    for (long j2 = 0; j2 < A0N2; j2 += ow5.A00) {
                        long j3 = A0N2 - j2;
                        if (j3 >= ow5.A00) {
                            j3 = -1;
                        }
                        File file2 = ow5.A02;
                        if (file2 == null) {
                            C14360o3.A0F("bleepFile");
                            throw C00O.createAndThrow();
                        }
                        MSY.A1B(new C1125456i(TimeUnit.MILLISECONDS, 0L, j3), c1125856m2, new C1125656k(file2));
                    }
                    j = A0N + A0N2;
                }
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                C1125656k c1125656k = new C1125656k(file);
                c1125656k.A03 = new C1125456i(timeUnit2, j, -1L);
                AbstractC50522MSa.A1K(c1126256q, c1125856m2, c1125656k);
                W3N w3n = new W3N();
                w3n.A08 = new MediaComposition(c1126256q);
                w3n.A07 = ow5.A05;
                ?? obj = new Object();
                obj.A0C = new C69489VoC(w3n);
                obj.A00 = ow5.A04;
                obj.A07 = ow5.A06;
                obj.A0E = ow5.A0B;
                obj.A0A = ow5.A09;
                obj.A08 = ow5.A07;
                obj.A09 = ow5.A08;
                AbstractC55147OdA.A00(obj.A01());
            }
        }
    }

    public C51051Mh5(UserSession userSession, AnonymousClass840 anonymousClass840) {
        this.A07 = userSession;
        this.A09 = anonymousClass840;
        InterfaceC14020nS A00 = C14120nc.A00();
        C14360o3.A07(A00);
        this.A0B = new C8K6(A00);
        this.A0A = new OyK(this);
        C2GS A0E = MSW.A0E();
        this.A06 = A0E;
        C2GS A0E2 = MSW.A0E();
        this.A05 = A0E2;
        this.A04 = A0E;
        this.A08 = A0E2;
    }

    @Override // X.InterfaceC25221BDv
    public final void AIc(Context context) {
        F8C(context);
    }

    @Override // X.InterfaceC25221BDv
    public final void EWp(C22993ABs c22993ABs) {
        this.A01 = c22993ABs;
    }
}
