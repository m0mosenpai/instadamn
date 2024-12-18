package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.42G, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C42G extends C42H {
    public final /* synthetic */ C41J A00;
    public final /* synthetic */ C41H A01;
    public final /* synthetic */ C41Q A02;
    public final /* synthetic */ C3VW A03;
    public final /* synthetic */ C3W3 A04;
    public final /* synthetic */ InterfaceC60442pS A05;
    public final /* synthetic */ C75113Zb A06;

    @Override // X.C42H, X.InterfaceC62892tS
    public final void Diy(C3VZ c3vz, C3VZ c3vz2) {
        C14360o3.A0B(c3vz, 0);
        C75113Zb c75113Zb = this.A06;
        if (c3vz != c75113Zb.A0i) {
            c75113Zb.A0i = c3vz;
            C75113Zb.A00(c75113Zb, 16);
        }
        C4ZF c4zf = c75113Zb.A0s;
        if (c4zf != null) {
            c4zf.A01();
        }
        boolean z = false;
        if (c3vz != C3VZ.A03) {
            z = true;
        }
        c75113Zb.A2T = z;
    }

    public C42G(C41J c41j, C41H c41h, C41Q c41q, C3VW c3vw, C3W3 c3w3, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb) {
        this.A04 = c3w3;
        this.A06 = c75113Zb;
        this.A03 = c3vw;
        this.A01 = c41h;
        this.A00 = c41j;
        this.A02 = c41q;
        this.A05 = interfaceC60442pS;
    }

    @Override // X.C42H, X.InterfaceC62892tS
    public final void DXP(int i, int i2) {
        C3YH c3yh;
        InterfaceC16660sJ interfaceC16660sJ;
        C3W3 c3w3 = this.A04;
        View A00 = c3w3.A00();
        if (A00 != null) {
            AbstractC56932jR.A07(A00, null);
            this.A06.A0A(i);
            if (!C903540u.A00.A01(this.A03.A02, this.A01.A0C) && !C3VW.A00(c3w3)) {
                return;
            }
            C12500ku c12500ku = new C12500ku(c3w3.A09);
            while (c12500ku.hasNext()) {
                Object tag = ((View) c12500ku.next()).getTag();
                if ((tag instanceof C905741s) && (c3yh = ((C905741s) tag).A0I.A04) != null && (interfaceC16660sJ = c3yh.A04) != null) {
                    interfaceC16660sJ.invoke(Integer.valueOf(i));
                }
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        if (r24 < r25) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0144  */
    @Override // X.C42H, X.InterfaceC62892tS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DXb(int r24, int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42G.DXb(int, int, boolean):void");
    }

    @Override // X.C42H, X.InterfaceC62892tS
    public final void Diq(C3VZ c3vz, float f, float f2) {
        C41H c41h = this.A01;
        if (c41h.A0L) {
            ReboundViewPager reboundViewPager = this.A04.A09;
            int i = reboundViewPager.A09;
            int i2 = reboundViewPager.A0A;
            float abs = Math.abs(i - f);
            C75113Zb c75113Zb = this.A06;
            c75113Zb.A0S = i;
            c75113Zb.A0B = i2;
            c75113Zb.A01 = abs;
            C75113Zb.A00(c75113Zb, 14);
        }
        C3VW c3vw = this.A03;
        C3W3 c3w3 = this.A04;
        C38321qM c38321qM = c41h.A0C;
        C903540u c903540u = C903540u.A00;
        UserSession userSession = c3vw.A02;
        if (!c903540u.A01(userSession, c38321qM) && !C3VW.A00(c3w3)) {
            return;
        }
        ReboundViewPager reboundViewPager2 = c3w3.A09;
        int width = reboundViewPager2.getWidth();
        C06090Tz c06090Tz = C06090Tz.A05;
        float A00 = (float) C18U.A00(c06090Tz, userSession, 37175093726216817L);
        float A002 = (float) C18U.A00(c06090Tz, userSession, 37175093725823600L);
        C12500ku c12500ku = new C12500ku(reboundViewPager2);
        while (c12500ku.hasNext()) {
            Object tag = ((View) c12500ku.next()).getTag();
            if (tag instanceof InterfaceC905841t) {
                ((InterfaceC905841t) tag).D7U(userSession, c38321qM, A00, A002, width);
            }
        }
    }
}
