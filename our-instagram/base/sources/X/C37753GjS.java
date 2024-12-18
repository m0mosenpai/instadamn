package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.GjS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37753GjS extends AbstractC116895Qv {
    public final Context A00;
    public final ClipsViewerConfig A01;
    public final UserSession A02;
    public final C57782kr A03;
    public final C28091Xn A04;
    public final C37824Gke A05;
    public final C37705Gig A06;
    public final IE3 A07;
    public final String A08;
    public final InterfaceC16820sZ A09;

    public C37753GjS(Context context, ClipsViewerConfig clipsViewerConfig, UserSession userSession, C37705Gig c37705Gig, IE3 ie3, String str, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(str, 5);
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = clipsViewerConfig;
        this.A09 = interfaceC16820sZ;
        this.A08 = str;
        this.A07 = ie3;
        this.A06 = c37705Gig;
        C28091Xn A0Q = AbstractC37302Gc3.A0Q(userSession);
        C14360o3.A07(A0Q);
        this.A04 = A0Q;
        this.A03 = C57782kr.A00(userSession);
        this.A05 = AbstractC37696GiX.A00(userSession);
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5H(C37818GkY c37818GkY) {
        ImmutableList immutableList;
        C14360o3.A0B(c37818GkY, 0);
        InterfaceC124295jj interfaceC124295jj = c37818GkY.A01;
        boolean BUt = interfaceC124295jj.BbA().BUt();
        UserSession userSession = this.A02;
        List list = c37818GkY.A09;
        List A00 = AbstractC37761Gja.A00(userSession, this.A08, list);
        IE3 ie3 = this.A07;
        boolean z = c37818GkY.A0D;
        C17280tP.A4E.A01(AbstractC25225BEi.A0F(ie3.A00));
        if (C18U.A06(C06090Tz.A05, userSession, 36325845547103669L) || C1LE.A05(userSession) || C1LE.A04(userSession)) {
            ClipsViewerConfig clipsViewerConfig = this.A01;
            if ((clipsViewerConfig.A1I != null || ((immutableList = clipsViewerConfig.A0E) != null && !immutableList.isEmpty())) && z) {
                C37705Gig c37705Gig = this.A06;
                String str = c37818GkY.A04;
                UserSession userSession2 = c37705Gig.A05;
                if ((!C1LE.A05(userSession2) && !C1LE.A04(userSession2)) || str != null) {
                    ArrayList A0U = AbstractC001800i.A0U(A00);
                    if (C1LE.A05(userSession)) {
                        ArrayList A1E = AbstractC166987dD.A1E();
                        for (Object obj : list) {
                            if (AbstractC37647Ghg.A01(((C120985dq) obj).A01)) {
                                A1E.add(obj);
                            }
                        }
                        A0U.addAll(A1E);
                    }
                    if (c37818GkY.A0C) {
                        C37824Gke c37824Gke = this.A05;
                        Long l = c37818GkY.A02;
                        Long l2 = c37818GkY.A03;
                        c37824Gke.A05.clear();
                        c37824Gke.A04.clear();
                        c37824Gke.A01(-1, false, A0U);
                        UserSession userSession3 = c37824Gke.A02;
                        if ((C1LE.A05(userSession3) || C1LE.A04(userSession3)) && ((l == null || l.longValue() == -1) && l2 != null)) {
                            c37824Gke.A01 = l2.longValue();
                            InterfaceC19610xo ARD = c37824Gke.A03.ARD();
                            ARD.E7G("latest_headload_timestamp", c37824Gke.A01);
                            ARD.apply();
                        }
                    } else {
                        this.A05.A01(-1, false, A0U);
                    }
                }
            }
        }
        ((C37546Gg2) this.A09.invoke()).A0E(A00, z, c37818GkY.A0G, interfaceC124295jj.Cew(), BUt, c37818GkY.A0E);
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5E(C38971HDz c38971HDz) {
        ((C37546Gg2) this.A09.invoke()).A03 = false;
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5F() {
        this.A09.invoke();
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5G(C37752GjR c37752GjR) {
        InterfaceC16820sZ interfaceC16820sZ = this.A09;
        ((C37546Gg2) interfaceC16820sZ.invoke()).A0C(null);
        ((C37546Gg2) interfaceC16820sZ.invoke()).A03 = false;
    }
}
