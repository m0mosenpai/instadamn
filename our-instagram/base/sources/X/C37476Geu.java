package X;

import android.os.SystemClock;
import com.instagram.adshistory.fragment.RecentAdActivityFragment;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.refresh.RefreshableListView;

/* renamed from: X.Geu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37476Geu extends C1P1 {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C37476Geu(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        int i2;
        Integer num;
        int i3;
        int i4;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(953237385);
                C14360o3.A0B(abstractC115105If, 0);
                IJS ijs = (IJS) this.A01;
                if (!ijs.A02) {
                    i2 = 699476215;
                    break;
                } else {
                    C40791um c40791um = (C40791um) abstractC115105If.A00();
                    if (c40791um != null) {
                        i = c40791um.mStatusCode;
                    } else {
                        i = 0;
                    }
                    C42948Iz0 c42948Iz0 = ijs.A03;
                    long elapsedRealtime = SystemClock.elapsedRealtime() - ijs.A00;
                    C31G c31g = c42948Iz0.A01;
                    if (c31g != null) {
                        c31g.CiD(i, false, elapsedRealtime);
                    }
                    EnumC74603Ws enumC74603Ws = EnumC74603Ws.A04;
                    java.util.Set set = c42948Iz0.A03;
                    if (set != null) {
                        c42948Iz0.A0A.FCF(enumC74603Ws, set);
                        c42948Iz0.A03 = null;
                    }
                    IBV ibv = ijs.A01;
                    if (ibv != null) {
                        boolean z = this.A02;
                        HL6 hl6 = ibv.A00;
                        IntentAwareAdPivotState intentAwareAdPivotState = hl6.A00;
                        if (intentAwareAdPivotState == null) {
                            C14360o3.A0F("intentAwareAdPivotState");
                            throw C00O.createAndThrow();
                        }
                        intentAwareAdPivotState.A0D = false;
                        C61712rY c61712rY = hl6.A0A.A04;
                        String str = hl6.A0B;
                        if (z) {
                            num = C05F.A00;
                        } else {
                            num = C05F.A0C;
                        }
                        c61712rY.A03(null, num, str);
                        if (z) {
                            hl6.A04 = false;
                        }
                        hl6.A09.Dfp();
                    }
                    i2 = 2141576108;
                    break;
                }
            case 1:
                A03 = C0f9.A03(811561771);
                boolean z2 = this.A02;
                C41620IbA c41620IbA = (C41620IbA) this.A01;
                if (z2) {
                    c41620IbA.A02 = C05F.A0C;
                    C1ON c1on = c41620IbA.A01;
                    if (c1on != null) {
                        c1on.cancel();
                        c41620IbA.A01 = null;
                    }
                    RecentAdActivityFragment recentAdActivityFragment = c41620IbA.A07;
                    C9GR.A01(recentAdActivityFragment.getContext(), null, 2131972429, 1);
                    RefreshableListView refreshableListView = recentAdActivityFragment.A05;
                    if (refreshableListView != null) {
                        refreshableListView.setIsLoading(false);
                    }
                    EmptyStateView emptyStateView = recentAdActivityFragment.A04;
                    if (emptyStateView != null) {
                        emptyStateView.A0J();
                    }
                } else {
                    c41620IbA.A02 = C05F.A01;
                    C9GR.A06(c41620IbA.A07.getContext(), 2131952222);
                }
                i2 = -1966120407;
                break;
            case 2:
            default:
                super.onFail(abstractC115105If);
                return;
            case 3:
                A03 = C0f9.A03(1847471291);
                C14360o3.A0B(abstractC115105If, 0);
                IKQ ikq = (IKQ) this.A01;
                C37477Gev c37477Gev = ikq.A05;
                C40791um c40791um2 = (C40791um) abstractC115105If.A00();
                if (c40791um2 != null) {
                    i3 = c40791um2.mStatusCode;
                } else {
                    i3 = 0;
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - ikq.A02;
                C42953Iz5 c42953Iz5 = (C42953Iz5) c37477Gev.A01;
                c42953Iz5.A0A.CiD(i3, c42953Iz5.A05, elapsedRealtime2);
                c42953Iz5.A05 = false;
                i2 = -1828380266;
                break;
            case 4:
                A03 = C0f9.A03(-650220315);
                C14360o3.A0B(abstractC115105If, 0);
                C37473Ger c37473Ger = (C37473Ger) this.A01;
                C37477Gev c37477Gev2 = c37473Ger.A06;
                C40791um c40791um3 = (C40791um) abstractC115105If.A00();
                if (c40791um3 != null) {
                    i4 = c40791um3.mStatusCode;
                } else {
                    i4 = 0;
                }
                long elapsedRealtime3 = SystemClock.elapsedRealtime() - c37473Ger.A02;
                C37447GeR c37447GeR = (C37447GeR) c37477Gev2.A01;
                c37447GeR.A0G.CiD(i4, c37447GeR.A07, elapsedRealtime3);
                c37447GeR.A07 = false;
                EnumC74603Ws enumC74603Ws2 = EnumC74603Ws.A04;
                java.util.Set set2 = c37447GeR.A06;
                if (set2 != null) {
                    c37447GeR.A0J.FCF(enumC74603Ws2, set2);
                    c37447GeR.A06 = null;
                }
                i2 = -344450923;
                break;
        }
        C0f9.A0A(i2, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (r0 == 0) goto L13;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFinish() {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L9;
                case 1: goto L5;
                case 2: goto L5;
                case 3: goto L41;
                case 4: goto L5a;
                default: goto L5;
            }
        L5:
            super.onFinish()
            return
        L9:
            r0 = -2128047567(0xffffffff81289231, float:-3.0961614E-38)
            int r2 = X.C0f9.A03(r0)
            java.lang.Object r3 = r4.A01
            X.IJS r3 = (X.IJS) r3
            boolean r0 = r3.A02
            if (r0 != 0) goto L1c
            r0 = 704612567(0x29ff88d7, float:1.1348013E-13)
            goto L72
        L1c:
            X.Iz0 r1 = r3.A03
            com.instagram.common.session.UserSession r0 = r1.A09
            boolean r0 = X.AbstractC39718Hjo.A00(r0)
            if (r0 == 0) goto L2e
            int r0 = r1.A00
            int r0 = r0 + (-1)
            r1.A00 = r0
            if (r0 != 0) goto L32
        L2e:
            java.lang.Integer r0 = X.C05F.A00
            r1.A02 = r0
        L32:
            X.IBV r0 = r3.A01
            if (r0 == 0) goto L3d
            X.HL6 r0 = r0.A00
            X.JIJ r0 = r0.A09
            r0.Dfz()
        L3d:
            r0 = 2013365441(0x780184c1, float:1.0507795E34)
            goto L72
        L41:
            r0 = -119810626(0xfffffffff8dbd5be, float:-3.5670257E34)
            int r2 = X.C0f9.A03(r0)
            java.lang.Object r0 = r4.A01
            X.IKQ r0 = (X.IKQ) r0
            X.Gev r0 = r0.A05
            java.lang.Object r1 = r0.A01
            X.Iz5 r1 = (X.C42953Iz5) r1
            java.lang.Integer r0 = X.C05F.A00
            r1.A04 = r0
            r0 = -724511936(0xffffffffd4d0d340, float:-7.175179E12)
            goto L72
        L5a:
            r0 = -410748777(0xffffffffe7847897, float:-1.2511537E24)
            int r2 = X.C0f9.A03(r0)
            java.lang.Object r0 = r4.A01
            X.Ger r0 = (X.C37473Ger) r0
            X.Gev r0 = r0.A06
            java.lang.Object r1 = r0.A01
            X.GeR r1 = (X.C37447GeR) r1
            java.lang.Integer r0 = X.C05F.A00
            r1.A05 = r0
            r0 = 536121261(0x1ff48fad, float:1.0357571E-19)
        L72:
            X.C0f9.A0A(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37476Geu.onFinish():void");
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        Integer num;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(531137758);
                IJS ijs = (IJS) this.A01;
                if (!ijs.A02) {
                    i = -1818082126;
                    break;
                } else {
                    ijs.A00 = SystemClock.elapsedRealtime();
                    IBV ibv = ijs.A01;
                    if (ibv != null) {
                        boolean z = this.A02;
                        HL6 hl6 = ibv.A00;
                        C37445GeP c37445GeP = hl6.A0A;
                        c37445GeP.A08(null, z);
                        C61712rY c61712rY = c37445GeP.A04;
                        String str = hl6.A0B;
                        if (z) {
                            num = C05F.A00;
                        } else {
                            num = C05F.A0C;
                        }
                        Integer num2 = C05F.A00;
                        Integer num3 = num2;
                        c61712rY.A07(num, str, AbstractC111324zv.A00(599), str);
                        if (!z) {
                            num2 = C05F.A0C;
                        }
                        String str2 = hl6.A01;
                        if (str2 == null) {
                            C14360o3.A0F("seedAdId");
                            throw C00O.createAndThrow();
                        }
                        c61712rY.A07(num2, str, "AD_ID", str2);
                        if (!z) {
                            num3 = C05F.A0C;
                        }
                        c61712rY.A01(null, num3, C05F.A03, str);
                        hl6.A09.DgF();
                    }
                    i = 494192683;
                    break;
                }
            case 1:
            case 2:
            default:
                super.onStart();
                return;
            case 3:
                A03 = C0f9.A03(855310970);
                ((IKQ) this.A01).A02 = SystemClock.elapsedRealtime();
                i = 1532773146;
                break;
            case 4:
                A03 = C0f9.A03(-67744939);
                ((C37473Ger) this.A01).A02 = SystemClock.elapsedRealtime();
                i = -223613761;
                break;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0417, code lost:
    
        if (r12 != null) goto L121;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x08cf  */
    /* JADX WARN: Type inference failed for: r12v5, types: [X.1ux, X.Gem] */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.1ux, X.Gem] */
    /* JADX WARN: Type inference failed for: r6v6, types: [X.1ux, X.Gem] */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 2826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37476Geu.onSuccess(java.lang.Object):void");
    }
}
