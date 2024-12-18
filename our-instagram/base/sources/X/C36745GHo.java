package X;

import com.instagram.direct.fragment.channels.activityfeed.BroadcastChannelActivityFeedV2ViewModel;
import java.util.Collection;
import java.util.List;

/* renamed from: X.GHo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36745GHo implements InterfaceC62602sz {
    public final int A00;
    public final Object A01;

    public C36745GHo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        List list;
        boolean isEmpty;
        switch (this.A00) {
            case 0:
                isEmpty = ((JT7) this.A01).A0G.A05.isEmpty();
                return !isEmpty;
            case 1:
                if (((AbstractC43842Ja5) this.A01).getAdapter().getItemCount() > 1) {
                    return true;
                }
                return false;
            case 2:
                list = ((FIT) ((BroadcastChannelActivityFeedV2ViewModel) this.A01).A08.getValue()).A01;
                isEmpty = list.isEmpty();
                return !isEmpty;
            case 3:
                list = ((FIV) ((EOD) this.A01).A0C().A0A().getValue()).A01;
                isEmpty = list.isEmpty();
                return !isEmpty;
            case 4:
                list = ((C32372ENy) this.A01).A0E;
                isEmpty = list.isEmpty();
                return !isEmpty;
            case 5:
                if (((C32282EJt) this.A01).A02 != null) {
                    return true;
                }
                return false;
            case 6:
                list = ((EMG) this.A01).A08;
                isEmpty = list.isEmpty();
                return !isEmpty;
            case 7:
                isEmpty = ((Collection) ((C31831Dyp) this.A01).A03.A0A.getValue()).isEmpty();
                return !isEmpty;
            case 8:
                list = ((C67910V2a) this.A01).A06;
                isEmpty = list.isEmpty();
                return !isEmpty;
            default:
                EQI eqi = ((ENX) this.A01).A02;
                if (eqi == null) {
                    AbstractC31171DnF.A0t();
                    throw C00O.createAndThrow();
                }
                if (eqi.A00 > 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        switch (this.A00) {
            case 0:
                return ((JT7) this.A01).A0G.A01;
            case 1:
                return ((EOJ) this.A01).A0E().A0D();
            case 2:
                return ((BroadcastChannelActivityFeedV2ViewModel) this.A01).A03();
            case 3:
                return ((EOD) this.A01).A0C().A0D();
            case 4:
                InterfaceC37194Ga5 interfaceC37194Ga5 = ((C32372ENy) this.A01).A04;
                if (interfaceC37194Ga5 != null && interfaceC37194Ga5.C04() == C05F.A0Y) {
                    return true;
                }
                return false;
            case 5:
                C35003Fba c35003Fba = ((C32282EJt) this.A01).A02;
                if (c35003Fba != null && !c35003Fba.A02.equals("MINCURSOR")) {
                    return true;
                }
                return false;
            case 6:
                GFJ gfj = ((EMG) this.A01).A06;
                if (gfj == null) {
                    C14360o3.A0F("savedCollectionsFetcher");
                    throw C00O.createAndThrow();
                }
                return gfj.A02.A05();
            case 7:
                if (((C31831Dyp) this.A01).A03.A09.getValue() != null) {
                    return true;
                }
                return false;
            case 8:
                return false;
            default:
                return !AbstractC13670mt.A0B(AbstractC31174DnI.A0h((ENX) this.A01).A02.A01);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0005 A[ORIG_RETURN, RETURN] */
    @Override // X.InterfaceC62602sz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean CUG() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 1: goto L7;
                case 2: goto L5;
                case 3: goto L5;
                case 4: goto L1e;
                case 5: goto L3f;
                case 6: goto L5;
                case 7: goto L5;
                case 8: goto L5;
                case 9: goto L2d;
                default: goto L5;
            }
        L5:
            r2 = 0
        L6:
            return r2
        L7:
            java.lang.Object r0 = r3.A01
            X.EOJ r0 = (X.EOJ) r0
            X.Dz7 r0 = r0.A0E()
            X.E6h r0 = X.Dz7.A00(r0)
            if (r0 == 0) goto L5
            java.lang.Boolean r0 = r0.A07
            if (r0 == 0) goto L5
            boolean r2 = r0.booleanValue()
            return r2
        L1e:
            java.lang.Object r0 = r3.A01
            X.ENy r0 = (X.C32372ENy) r0
            X.Ga5 r0 = r0.A04
            if (r0 == 0) goto L5
            java.lang.Integer r1 = r0.C04()
            java.lang.Integer r0 = X.C05F.A0C
            goto L3b
        L2d:
            java.lang.Object r0 = r3.A01
            X.ENX r0 = (X.ENX) r0
            X.DzD r0 = X.AbstractC31174DnI.A0h(r0)
            X.FLD r0 = r0.A02
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = X.C05F.A01
        L3b:
            r2 = 1
            if (r1 == r0) goto L6
            goto L5
        L3f:
            java.lang.Object r0 = r3.A01
            X.EJt r0 = (X.C32282EJt) r0
            boolean r2 = r0.A08
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36745GHo.CUG():boolean");
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        switch (this.A00) {
            case 4:
                InterfaceC37194Ga5 interfaceC37194Ga5 = ((C32372ENy) this.A01).A04;
                if (interfaceC37194Ga5 != null && interfaceC37194Ga5.C04() == C05F.A01) {
                    return true;
                }
                return false;
            case 5:
            case 7:
            default:
                return true;
            case 6:
                GFJ gfj = ((EMG) this.A01).A06;
                if (gfj == null) {
                    C14360o3.A0F("savedCollectionsFetcher");
                    throw C00O.createAndThrow();
                }
                return gfj.A02.A05();
            case 8:
                return ((C67910V2a) this.A01).A01;
            case 9:
                return isLoading();
        }
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        switch (this.A00) {
            case 0:
                ((JT7) this.A01).AD4();
                return;
            case 1:
                ((EOJ) this.A01).A0E().A06();
                return;
            case 2:
                ((BroadcastChannelActivityFeedV2ViewModel) this.A01).A02();
                return;
            case 3:
                ((EOD) this.A01).A0C().A0B();
                return;
            case 4:
            case 8:
            default:
                return;
            case 5:
                C32282EJt.A01((C32282EJt) this.A01);
                return;
            case 6:
                ((EMG) this.A01).AD4();
                return;
            case 7:
                ((C31831Dyp) this.A01).A01(false, false);
                return;
            case 9:
                C31845DzD A0h = AbstractC31174DnI.A0h((ENX) this.A01);
                if (!A0h.A02.A02) {
                    return;
                }
                C31845DzD.A00(A0h, null, false);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0016 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC62602sz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isLoading() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L79;
                case 1: goto L18;
                case 2: goto L2d;
                case 3: goto L3e;
                case 4: goto L55;
                case 5: goto L82;
                case 6: goto L89;
                case 7: goto L64;
                case 8: goto La0;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.A01
            X.ENX r0 = (X.ENX) r0
            X.DzD r0 = X.AbstractC31174DnI.A0h(r0)
            X.FLD r0 = r0.A02
            java.lang.Integer r0 = r0.A00
            java.lang.Integer r2 = X.C05F.A00
        L13:
            r1 = 1
            if (r0 == r2) goto L17
        L16:
            r1 = 0
        L17:
            return r1
        L18:
            java.lang.Object r0 = r3.A01
            X.EOJ r0 = (X.EOJ) r0
            X.Dz7 r0 = r0.A0E()
            X.E6h r0 = X.Dz7.A00(r0)
            if (r0 == 0) goto L2b
            X.Eoe r0 = r0.A03
        L28:
            X.Eoe r2 = X.EnumC33345Eoe.A03
            goto L13
        L2b:
            r0 = 0
            goto L28
        L2d:
            java.lang.Object r0 = r3.A01
            com.instagram.direct.fragment.channels.activityfeed.BroadcastChannelActivityFeedV2ViewModel r0 = (com.instagram.direct.fragment.channels.activityfeed.BroadcastChannelActivityFeedV2ViewModel) r0
            X.0UO r0 = r0.A08
            java.lang.Object r0 = r0.getValue()
            X.FIT r0 = (X.FIT) r0
            X.Eoo r0 = r0.A00
            X.Eoo r2 = X.EnumC33355Eoo.A04
            goto L13
        L3e:
            java.lang.Object r0 = r3.A01
            X.EOD r0 = (X.EOD) r0
            com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel r0 = r0.A0C()
            X.0UO r0 = r0.A0A()
            java.lang.Object r0 = r0.getValue()
            X.FIV r0 = (X.FIV) r0
            X.Eop r0 = r0.A00
            X.Eop r2 = X.EnumC33356Eop.A04
            goto L13
        L55:
            java.lang.Object r0 = r3.A01
            X.ENy r0 = (X.C32372ENy) r0
            X.Ga5 r0 = r0.A04
            if (r0 == 0) goto L16
            java.lang.Integer r0 = r0.C04()
            java.lang.Integer r2 = X.C05F.A01
            goto L13
        L64:
            java.lang.Object r0 = r3.A01
            X.Dyp r0 = (X.C31831Dyp) r0
            X.0UO r0 = r0.A09
            java.lang.Object r1 = r0.getValue()
            boolean r0 = r1 instanceof X.C45284K2m
            if (r0 == 0) goto L16
            X.K2m r1 = (X.C45284K2m) r1
            if (r1 == 0) goto L16
            boolean r1 = r1.A06
            return r1
        L79:
            java.lang.Object r0 = r3.A01
            X.JT7 r0 = (X.JT7) r0
            X.JT6 r0 = r0.A0G
            boolean r1 = r0.A02
            return r1
        L82:
            java.lang.Object r0 = r3.A01
            X.EJt r0 = (X.C32282EJt) r0
            boolean r1 = r0.A06
            return r1
        L89:
            java.lang.Object r0 = r3.A01
            X.EMG r0 = (X.EMG) r0
            X.GFJ r0 = r0.A06
            if (r0 != 0) goto L9b
            java.lang.String r0 = "savedCollectionsFetcher"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L9b:
            boolean r1 = r0.A03()
            return r1
        La0:
            java.lang.Object r0 = r3.A01
            X.V2a r0 = (X.C67910V2a) r0
            boolean r1 = r0.A01
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36745GHo.isLoading():boolean");
    }
}
