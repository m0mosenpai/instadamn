package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes9.dex */
public final class NTX extends AbstractC55206OeJ {
    public int A00;
    public int A01;
    public Bitmap A02;
    public WEY A03;
    public C50641MXd A04;
    public C51868MwC A05;
    public String A06;
    public List A07;
    public final int A08;
    public final Activity A09;
    public final Context A0A;
    public final UserSession A0B;
    public final OI6 A0C;
    public final C55177Odh A0D;
    public final C56029Ou0 A0E;
    public final OHO A0F;
    public final PCP A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.NTX r11) {
        /*
            r3 = 0
            r2 = 0
            java.lang.String r0 = X.AbstractC916948n.A0D(r2, r3, r3)
            java.lang.String r0 = X.AbstractC916948n.A0C(r0)
            java.io.File r0 = X.AbstractC166987dD.A11(r0)
            java.lang.String r8 = r0.getCanonicalPath()
            r11.A06 = r8
            android.content.Context r5 = r11.A0A
            com.instagram.common.session.UserSession r6 = r11.A0B
            int r9 = r11.A01
            int r10 = r11.A00
            X.O5A r7 = new X.O5A
            r7.<init>(r11)
            X.WEY r4 = new X.WEY
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11.A03 = r4
            int r1 = r11.A08
            r0 = 1
            if (r1 != r0) goto L62
            X.C14360o3.A0A(r8)
            X.NjZ r1 = X.EnumC53384NjZ.A07
        L32:
            X.C14360o3.A0B(r8, r3)
            r4.A04 = r1
            r4.A0G = r3
            X.7x4 r0 = r4.A00
            if (r0 == 0) goto L5a
            r4.A05 = r8
            r4.A04 = r1
            android.os.Handler r1 = r4.A08
            X.Wrl r0 = new X.Wrl
            r0.<init>(r4)
            r1.post(r0)
        L4b:
            X.WEY r2 = r11.A03
            if (r2 == 0) goto L59
            android.os.Handler r1 = r2.A08
            X.Wrj r0 = new X.Wrj
            r0.<init>(r2)
            r1.post(r0)
        L59:
            return
        L5a:
            java.lang.String r1 = "PosesFramesHandlerV1"
            java.lang.String r0 = "Trying to update when capture is not initialized, this could happen if you try to update before a capture"
            X.AbstractC12120kG.A07(r1, r0, r2)
            goto L4b
        L62:
            r0 = 2
            if (r1 != r0) goto L6b
            X.C14360o3.A0A(r8)
            X.NjZ r1 = X.EnumC53384NjZ.A03
            goto L32
        L6b:
            r0 = 3
            if (r1 != r0) goto L74
            X.C14360o3.A0A(r8)
            X.NjZ r1 = X.EnumC53384NjZ.A04
            goto L32
        L74:
            r0 = 4
            if (r1 != r0) goto L4b
            X.C14360o3.A0A(r8)
            X.NjZ r1 = X.EnumC53384NjZ.A08
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NTX.A02(X.NTX):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NTX(Activity activity, Context context, UserSession userSession, OI6 oi6, C55177Odh c55177Odh, PCP pcp) {
        super(AbstractC25225BEi.A1D(C51868MwC.class));
        OHO oho = new OHO(oi6);
        AbstractC167017dG.A1T(c55177Odh, oi6);
        this.A09 = activity;
        this.A0A = context;
        this.A0B = userSession;
        this.A0G = pcp;
        this.A0D = c55177Odh;
        this.A0C = oi6;
        this.A0F = oho;
        this.A0L = C57543PgH.A01(this, 1);
        this.A05 = new C51868MwC(null, null, null, 0, 0L, 0L, 0L, 0L, false);
        this.A07 = AbstractC166987dD.A1E();
        this.A0I = AbstractC09440dt.A01(C57443Pef.A00);
        C56029Ou0 c56029Ou0 = new C56029Ou0(this);
        this.A0E = c56029Ou0;
        this.A08 = AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36591798512189453L);
        this.A0H = C57524Pfy.A00(this, 48);
        this.A0J = C57524Pfy.A00(this, 49);
        this.A0K = C57543PgH.A01(this, 0);
        PCP pcp2 = this.A0G;
        pcp2.A02 = new C56691PEj(this);
        pcp2.A01 = new C56689PEh(this);
        AbstractC25651Mw.A00(userSession).A01(c56029Ou0, C55976Ot9.class);
    }

    public static final int A00(NTX ntx, int i) {
        int i2 = ntx.A05.A00;
        if (i == i2) {
            return 2131969601;
        }
        if (i == i2 - 1) {
            return 2131969603;
        }
        if (i == i2 - 2) {
            return 2131969606;
        }
        if (i != 1) {
            return 2131969600;
        }
        return 2131969602;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.PlO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.PlK, java.lang.Object] */
    public static final void A01(NTX ntx) {
        MSW.A09(ntx.A0I).removeCallbacksAndMessages(null);
        ntx.A0G.A01();
        C50641MXd c50641MXd = ntx.A04;
        if (c50641MXd != null) {
            c50641MXd.A04();
        }
        AbstractC25235BEs.A1Q(ntx.A0L);
        ntx.A07 = AbstractC166987dD.A1E();
        C55177Odh c55177Odh = ntx.A0D;
        c55177Odh.A05(new Object());
        WEY wey = ntx.A03;
        if (wey != null) {
            Handler handler = wey.A08;
            handler.post(new RunnableC71316Wrk(wey));
            handler.post(new RunnableC71314Wri(wey));
            handler.getLooper().quitSafely();
        }
        ntx.A03 = null;
        C55177Odh.A01(c55177Odh, true);
        c55177Odh.A03(new Object());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.PlO, java.lang.Object] */
    public static final void A03(NTX ntx, int i, boolean z) {
        if (i > 0) {
            MSW.A09(ntx.A0I).post(new RunnableC57052PSr(ntx, i, z));
            return;
        }
        C55177Odh c55177Odh = ntx.A0D;
        C55177Odh.A01(c55177Odh, true);
        if (z && !ntx.A07.isEmpty() && !ntx.A09.isFinishing()) {
            C0fJ.A00((Dialog) ntx.A0L.getValue());
        }
        c55177Odh.A05(new Object());
        MSY.A0E(ntx.A0G.A0D).setVisibility(8);
    }
}
