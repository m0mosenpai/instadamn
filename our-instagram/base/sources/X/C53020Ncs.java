package X;

import android.content.Context;
import android.view.Surface;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.view.IgLiveWithGuestFragment;
import com.instagram.video.live.streaming.common.BroadcastFailureType;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ncs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53020Ncs extends AbstractC55102ObF implements InterfaceC58006Pnq {
    public static final long A0R = TimeUnit.SECONDS.toMillis(20);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Surface A04;
    public AbstractC53633Nne A05;
    public OL3 A06;
    public InterfaceC58192Pqy A07;
    public C55142Ocx A08;
    public PJF A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final C55085Oah A0J;
    public final C56804PIv A0K;
    public final IgLiveWithGuestFragment A0L;
    public final OJW A0M;
    public final String A0N;
    public final String A0O;
    public final InterfaceC11380iw A0P;
    public final C19L A0Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53020Ncs(Context context, InterfaceC174767qC interfaceC174767qC, C1815383g c1815383g, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C55085Oah c55085Oah, C56804PIv c56804PIv, IgLiveWithGuestFragment igLiveWithGuestFragment, String str, String str2, C19L c19l, int i, int i2, boolean z) {
        super(context, interfaceC174767qC, c1815383g, userSession);
        AbstractC167007dF.A1I(userSession, 2, c1815383g);
        this.A0P = interfaceC11380iw;
        this.A0N = str;
        this.A0Q = c19l;
        this.A0L = igLiveWithGuestFragment;
        this.A0K = c56804PIv;
        this.A0J = c55085Oah;
        this.A0H = z;
        this.A0O = str2;
        this.A00 = i;
        this.A01 = i2;
        long j = A0R;
        this.A0M = new OJW(new PJB(this), new MW9(this, 10), j);
        this.A0A = C16930sl.A00;
        this.A03 = this.A01;
        this.A02 = this.A00;
        this.A0E = true;
        super.A02 = igLiveWithGuestFragment;
    }

    public final void A0J() {
        this.A0F = true;
        if (!this.A0B) {
            A03(this, C05F.A02);
            this.A0K.A0A("stop camera", "");
            HandlerC72131XPd handlerC72131XPd = super.A09.A09;
            handlerC72131XPd.sendMessageAtFrontOfQueue(handlerC72131XPd.obtainMessage(5));
            super.A08.A01();
            OJW ojw = this.A0M;
            ojw.A02.removeCallbacks(ojw.A04);
        }
    }

    public static final void A00(AbstractC53633Nne abstractC53633Nne, C53020Ncs c53020Ncs) {
        c53020Ncs.A0K.A0A("stop encoding", "");
        HandlerC72131XPd handlerC72131XPd = ((AbstractC55102ObF) c53020Ncs).A09.A09;
        handlerC72131XPd.sendMessageAtFrontOfQueue(handlerC72131XPd.obtainMessage(4));
        c53020Ncs.A05 = new C52242NAg(0, abstractC53633Nne, c53020Ncs);
    }

    public static final void A01(BroadcastFailureType broadcastFailureType, C53020Ncs c53020Ncs, String str, String str2) {
        C53404Njt c53404Njt = new C53404Njt(broadcastFailureType, str, str2);
        C0w9 c0w9 = C0w9.A01;
        String message = c53404Njt.getMessage();
        if (message == null) {
            message = "null_message";
        }
        c0w9.EmT("ig_media_creation_broadcast_trace", message, 1, c53404Njt);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("notifyBroadcastFatalError(");
        BroadcastFailureType broadcastFailureType2 = c53404Njt.A00;
        A1C.append(broadcastFailureType2);
        A1C.append(", ");
        String str3 = c53404Njt.A01;
        A1C.append(str3);
        A1C.append("): ");
        C0K8.A0D("IgLiveWithGuestStreamingController", AbstractC166997dE.A0x(c53404Njt.getMessage(), A1C));
        String name = broadcastFailureType2.name();
        String message2 = c53404Njt.getMessage();
        AbstractC25230BEn.A15(1, str3, name);
        c53020Ncs.A0K.A0B(str3, name, message2, true);
        if (!c53020Ncs.A0D) {
            c53020Ncs.A0D = true;
            C11T.A03(new RunnableC57024PRp(c53404Njt, c53020Ncs));
        }
    }

    public static final void A02(C53020Ncs c53020Ncs) {
        if (!c53020Ncs.A0B) {
            if (c53020Ncs.A07 == null) {
                C52241NAf c52241NAf = new C52241NAf(c53020Ncs, 6);
                Context context = ((AbstractC55102ObF) c53020Ncs).A05;
                UserSession userSession = ((AbstractC55102ObF) c53020Ncs).A07;
                String str = c53020Ncs.A0N;
                O9F o9f = new O9F(c53020Ncs.A01, c53020Ncs.A00);
                InterfaceC174767qC interfaceC174767qC = ((AbstractC55102ObF) c53020Ncs).A06;
                OL3 ol3 = c53020Ncs.A06;
                if (ol3 == null) {
                    C14360o3.A0F("previewProvider");
                    throw C00O.createAndThrow();
                }
                PJF pjf = new PJF(context, interfaceC174767qC, userSession, ol3, c53020Ncs.A0J, new PJD(c53020Ncs), o9f, str, false);
                String str2 = c53020Ncs.A0O;
                if (str2 != null) {
                    C57265Pbn c57265Pbn = new C57265Pbn(c52241NAf, pjf, pjf.A0E, str2, 6);
                    pjf.A03 = AbstractC25226BEj.A1L(new C57157PZb(c57265Pbn, pjf, (InterfaceC23621Ds) null, 14), pjf.A0F);
                    pjf.EQ2(AbstractC166987dD.A0y().A0R());
                    c53020Ncs.A0G = pjf.A05;
                    c53020Ncs.A09 = pjf;
                    c53020Ncs.A07 = pjf;
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            if (c53020Ncs.A08 == null) {
                C55142Ocx c55142Ocx = new C55142Ocx(((AbstractC55102ObF) c53020Ncs).A05, ((AbstractC55102ObF) c53020Ncs).A07, ((AbstractC55102ObF) c53020Ncs).A01, ((AbstractC55102ObF) c53020Ncs).A00);
                c55142Ocx.A0B = c53020Ncs;
                c53020Ncs.A08 = c55142Ocx;
            }
            Surface surface = c53020Ncs.A04;
            if (surface != null) {
                ((AbstractC55102ObF) c53020Ncs).A09.A09.obtainMessage(1, surface).sendToTarget();
            }
        }
    }

    public static final void A03(C53020Ncs c53020Ncs, Integer num) {
        if (!c53020Ncs.A0E) {
            c53020Ncs.A0K.A0A("broadcast interrupted", OQV.A01(num));
            c53020Ncs.A0E = true;
            C55142Ocx c55142Ocx = c53020Ncs.A08;
            if (c55142Ocx != null) {
                c55142Ocx.A04();
            }
            A00(null, c53020Ncs);
        }
    }

    public final void A0K(boolean z, boolean z2) {
        InterfaceC02590Ai A0H;
        int i;
        if (this.A0I != z || z2) {
            this.A0I = z;
            if (z) {
                C55142Ocx c55142Ocx = this.A08;
                if (c55142Ocx != null && c55142Ocx.A0E) {
                    c55142Ocx.A04();
                }
                C55142Ocx c55142Ocx2 = this.A08;
                if (c55142Ocx2 != null) {
                    c55142Ocx2.A03 = this.A03;
                    c55142Ocx2.A02 = this.A02;
                    c55142Ocx2.A0A = (YQR) AbstractC001800i.A0J(this.A0A);
                    c55142Ocx2.A09 = C17060sy.A01.A01(c55142Ocx2.A0J).A0C();
                    c55142Ocx2.A05 = null;
                    c55142Ocx2.A08 = null;
                    c55142Ocx2.A04 = null;
                    C1GJ.A03(new NFX(c55142Ocx2));
                }
                super.A08.A01();
                C55142Ocx c55142Ocx3 = this.A08;
                if (c55142Ocx3 != null) {
                    c55142Ocx3.A05(this.A04);
                }
            } else {
                A03(this, C05F.A04);
                A02(this);
            }
        }
        C56804PIv c56804PIv = this.A0K;
        c56804PIv.A06 = z;
        InterfaceC02550Ad interfaceC02550Ad = c56804PIv.A0C;
        if (z) {
            A0H = MSY.A0H(interfaceC02550Ad, "ig_live_broadcast_video_toggled_off");
            i = 231;
        } else {
            A0H = MSY.A0H(interfaceC02550Ad, "ig_live_broadcast_video_toggled_on");
            i = 232;
        }
        C56804PIv.A06(A0H, c56804PIv, i);
        C1GJ.A03(AbstractC55182Odn.A03(super.A07, MSX.A0Y(z ? 1 : 0), this.A0N));
    }

    @Override // X.InterfaceC58006Pnq
    public final void CsP(YQR yqr) {
        InterfaceC58192Pqy interfaceC58192Pqy = this.A07;
        if (interfaceC58192Pqy != null) {
            interfaceC58192Pqy.CsN(yqr);
        }
    }
}
