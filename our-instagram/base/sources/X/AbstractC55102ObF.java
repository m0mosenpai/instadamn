package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.streaming.common.BroadcastFailureType;

/* renamed from: X.ObF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55102ObF {
    public int A00;
    public int A01;
    public InterfaceC58005Pnp A02;
    public String A03;
    public boolean A04;
    public final Context A05;
    public final InterfaceC174767qC A06;
    public final UserSession A07;
    public final OWY A08;
    public final C73314Y4c A09;
    public final HandlerThread A0A;

    public final void A0H(SurfaceTexture surfaceTexture) {
        Integer num;
        if (this instanceof C53020Ncs) {
            C53020Ncs c53020Ncs = (C53020Ncs) this;
            C14360o3.A0B(surfaceTexture, 0);
            ((AbstractC55102ObF) c53020Ncs).A08.A02(surfaceTexture, new C52247NAl(c53020Ncs, 7), c53020Ncs.A01, c53020Ncs.A00, c53020Ncs.A0H);
            if (c53020Ncs.A0C) {
                num = C05F.A02;
            } else {
                c53020Ncs.A0C = true;
                C11T.A02(new RunnableC56953POu(c53020Ncs));
                num = C05F.A01;
            }
            if (c53020Ncs.A0E) {
                c53020Ncs.A0K.A0A("broadcast resumed", OQV.A01(num));
                c53020Ncs.A0E = false;
                C52247NAl c52247NAl = new C52247NAl(c53020Ncs, 8);
                InterfaceC58192Pqy interfaceC58192Pqy = c53020Ncs.A07;
                if (interfaceC58192Pqy != null) {
                    interfaceC58192Pqy.EnI(new C52245NAj(5, c52247NAl, c53020Ncs));
                    return;
                } else {
                    c52247NAl.A03(AbstractC166987dD.A14("mCurrentStreamingSession == NULL"));
                    return;
                }
            }
            return;
        }
        C53021Nct c53021Nct = (C53021Nct) this;
        C14360o3.A0B(surfaceTexture, 0);
        c53021Nct.A08 = surfaceTexture;
        if (!c53021Nct.A0U && !c53021Nct.A0T) {
            ((AbstractC55102ObF) c53021Nct).A08.A02(surfaceTexture, new C52247NAl(c53021Nct, 4), c53021Nct.A03, c53021Nct.A02, AbstractC23021Ah.A00(((AbstractC55102ObF) c53021Nct).A07).A1v());
        } else {
            C73314Y4c c73314Y4c = ((AbstractC55102ObF) c53021Nct).A09;
            c73314Y4c.A09.obtainMessage(2, c53021Nct.A03, c53021Nct.A02, null).sendToTarget();
        }
        C53021Nct.A0A(c53021Nct, C05F.A02);
    }

    public static void A0B(BroadcastFailureType broadcastFailureType, C53021Nct c53021Nct, String str, String str2, Throwable th) {
        C53021Nct.A02(new C52029N0d(str, str2, th), broadcastFailureType, c53021Nct);
    }

    public static void A0C(C53021Nct c53021Nct, Throwable th) {
        OQX.A01(c53021Nct.A0Y, ((AbstractC55102ObF) c53021Nct).A07).A00();
        OQW.A00(th);
    }

    public void A0D() {
        this.A0A.quitSafely();
    }

    public final void A0E() {
        if (this instanceof C53020Ncs) {
            C53020Ncs c53020Ncs = (C53020Ncs) this;
            AbstractC53633Nne abstractC53633Nne = c53020Ncs.A05;
            if (abstractC53633Nne != null) {
                abstractC53633Nne.A00();
                c53020Ncs.A05 = null;
                return;
            }
            return;
        }
        C53021Nct c53021Nct = (C53021Nct) this;
        AbstractC53633Nne abstractC53633Nne2 = c53021Nct.A0A;
        if (abstractC53633Nne2 == null) {
            return;
        }
        abstractC53633Nne2.A00();
        c53021Nct.A0A = null;
    }

    public final void A0F(int i) {
        C54817OKs A00;
        if (this instanceof C53020Ncs) {
            A00 = (C54817OKs) AbstractC54266Nym.A00(this.A07, EnumC142806cg.A04).A07.getValue();
        } else {
            A00 = OYB.A00(this.A07);
        }
        A00.A01(null, null, Integer.valueOf(i));
    }

    public final void A0G(long j) {
        C55142Ocx c55142Ocx;
        if (this instanceof C53020Ncs) {
            c55142Ocx = ((C53020Ncs) this).A08;
        } else {
            c55142Ocx = ((C53021Nct) this).A0G;
        }
        if (c55142Ocx != null) {
            c55142Ocx.A0I.A00(j);
        }
    }

    public final void A0I(YQR yqr) {
        InterfaceC58192Pqy interfaceC58192Pqy;
        if (!(this instanceof C53020Ncs) && (interfaceC58192Pqy = ((C53021Nct) this).A0F) != null) {
            interfaceC58192Pqy.CsN(yqr);
        }
    }

    public AbstractC55102ObF(Context context, InterfaceC174767qC interfaceC174767qC, C1815383g c1815383g, UserSession userSession) {
        this.A07 = userSession;
        this.A06 = interfaceC174767qC;
        this.A05 = AbstractC166987dD.A0O(context);
        OWY owy = new OWY(interfaceC174767qC);
        this.A08 = owy;
        HandlerThread A0A = MSY.A0A("Live Streaming HandlerThread");
        this.A0A = A0A;
        A0A.start();
        owy.A02 = 720;
        if (!this.A04) {
            this.A08.A06 = c1815383g;
            this.A04 = true;
        }
        Looper looper = A0A.getLooper();
        C14360o3.A07(looper);
        C73314Y4c c73314Y4c = new C73314Y4c(looper, interfaceC174767qC, c1815383g);
        this.A09 = c73314Y4c;
        c73314Y4c.A04 = this;
        owy.A00 = 720;
    }
}
