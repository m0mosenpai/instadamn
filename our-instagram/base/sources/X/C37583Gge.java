package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsWatchAndBrowseData;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gge, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37583Gge extends AbstractC37623GhI implements C38Y {
    public boolean A00;
    public boolean A01;
    public final FragmentActivity A02;
    public final ClipsViewerConfig A03;
    public final UserSession A04;
    public final InterfaceC60442pS A05;
    public final C37582Ggd A06;
    public final C37576GgX A07;
    public final boolean A08;
    public final C37560GgG A09;

    public void A0C(C120985dq c120985dq, C37644Ghd c37644Ghd, float f, float f2) {
    }

    public final void A0E(C37644Ghd c37644Ghd) {
        boolean A1W;
        C25370BKn A04;
        C14360o3.A0B(c37644Ghd, 1);
        UserSession userSession = this.A04;
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A06, userSession, 36321211278107872L)) {
            A1W = c37644Ghd.A0Y;
        } else {
            A1W = AbstractC167007dF.A1W(c37644Ghd.A0J);
        }
        this.A01 = A1W;
        C37560GgG c37560GgG = this.A09;
        c37560GgG.A0S(null, AbstractC111324zv.A00(4855), true, false);
        C11T.A02(new BST(this.A06, 8));
        if (this.A01 && C1LE.A07(userSession) && (A04 = C37560GgG.A04(c37560GgG)) != null) {
            C25370BKn.A01(A04, false, false);
        }
    }

    public boolean A0F(C120985dq c120985dq, float f, float f2) {
        return false;
    }

    public boolean A0G(C120985dq c120985dq, C37644Ghd c37644Ghd, float f, float f2) {
        if (c37644Ghd.A0R) {
            return A0H(c37644Ghd, true, true);
        }
        return A0H(c37644Ghd, true, false);
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXR(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXS(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXa(int i, int i2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXc(int i, int i2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DY0() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dim(float f, float f2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dj0(Integer num) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrV() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrY(C120985dq c120985dq, int i) {
    }

    public static final boolean A07(C120985dq c120985dq, C37644Ghd c37644Ghd, C37583Gge c37583Gge) {
        EnumC37732Gj7 enumC37732Gj7;
        ClipsViewerConfig clipsViewerConfig = c37583Gge.A03;
        if (!clipsViewerConfig.A00() || !c120985dq.A0K()) {
            return false;
        }
        C75113Zb c75113Zb = c37644Ghd.A0E;
        EnumC37732Gj7 enumC37732Gj72 = null;
        if (c75113Zb != null) {
            enumC37732Gj7 = c75113Zb.A0n;
        } else {
            enumC37732Gj7 = null;
        }
        if (enumC37732Gj7 == EnumC37732Gj7.A03) {
            return false;
        }
        ClipsWatchAndBrowseData clipsWatchAndBrowseData = clipsViewerConfig.A0K;
        if (clipsWatchAndBrowseData == null || clipsWatchAndBrowseData.A0E) {
            if (c75113Zb != null) {
                enumC37732Gj72 = c75113Zb.A0n;
            }
            if (enumC37732Gj72 != EnumC37732Gj7.A02) {
                return false;
            }
        }
        return true;
    }

    public final void A0B() {
        this.A07.A00();
        this.A06.A0B();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r6 != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0H(X.C37644Ghd r5, boolean r6, boolean r7) {
        /*
            r4 = this;
            boolean r0 = r4.A01
            if (r0 == 0) goto L38
            com.instagram.common.session.UserSession r3 = r4.A04
            boolean r0 = X.C1LE.A07(r3)
            if (r0 == 0) goto L38
            X.0Tz r2 = X.AbstractC25228BEl.A0l(r3)
            r0 = 36321211278173409(0x8109f3000c24e1, double:3.0330184938709805E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L38
            if (r7 == 0) goto L32
            X.Ggd r0 = r4.A06
            r0.A0B()
        L22:
            X.GgG r0 = r4.A09
            X.BKn r1 = X.C37560GgG.A04(r0)
            if (r1 == 0) goto L2e
            r0 = 1
            X.C25370BKn.A01(r1, r0, r0)
        L2e:
            r0 = 0
            r4.A01 = r0
            return r0
        L32:
            if (r6 == 0) goto L22
            r4.A0B()
            goto L22
        L38:
            boolean r0 = r5.A0Z
            if (r0 != 0) goto L4e
            X.GgG r2 = r4.A09
            java.lang.String r1 = "resume"
            r0 = 0
            r2.A0W(r1, r0)
            if (r7 == 0) goto L4c
            X.Ggd r0 = r4.A06
            r0.A0B()
            goto L2e
        L4c:
            if (r6 == 0) goto L2e
        L4e:
            r4.A0B()
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37583Gge.A0H(X.Ghd, boolean, boolean):boolean");
    }

    public C37583Gge(FragmentActivity fragmentActivity, ClipsViewerConfig clipsViewerConfig, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C37582Ggd c37582Ggd, C37576GgX c37576GgX, C37560GgG c37560GgG) {
        AbstractC167027dH.A13(userSession, clipsViewerConfig, c37560GgG);
        C14360o3.A0B(interfaceC60442pS, 7);
        this.A04 = userSession;
        this.A03 = clipsViewerConfig;
        this.A09 = c37560GgG;
        this.A06 = c37582Ggd;
        this.A07 = c37576GgX;
        this.A02 = fragmentActivity;
        this.A05 = interfaceC60442pS;
        this.A08 = C18U.A06(C06090Tz.A05, userSession, 36330690270217182L);
    }

    public void A0D(C120985dq c120985dq, C37644Ghd c37644Ghd, float f, float f2) {
        A0E(c37644Ghd);
    }
}
