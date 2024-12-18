package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NT6 extends NT7 {
    public float A00;
    public C51875MwJ A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final UserSession A06;
    public final InterfaceC57985PnV A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final C55177Odh A0C;
    public final PC1 A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NT6(Context context, ViewGroup viewGroup, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C55177Odh c55177Odh, PC1 pc1) {
        super(AbstractC25225BEi.A1D(C51875MwJ.class));
        C14360o3.A0B(c55177Odh, 5);
        this.A05 = context;
        this.A0D = pc1;
        this.A0C = c55177Odh;
        this.A06 = userSession;
        this.A07 = new PCC(viewGroup, interfaceC11380iw, userSession, ((NT7) this).A00);
        this.A09 = AbstractC09440dt.A01(new C57516Pfq(this, 35));
        this.A0B = AbstractC09440dt.A01(new C57516Pfq(this, 37));
        this.A08 = AbstractC09440dt.A01(new C57516Pfq(this, 34));
        this.A0A = C57516Pfq.A00(this, 36);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r7 == X.EnumC53143New.A02) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r21.A04 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007c, code lost:
    
        if (X.AbstractC31178DnM.A1a(r21.A0A) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0082, code lost:
    
        r20 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008a, code lost:
    
        if (X.AbstractC31178DnM.A1a(r21.A0A) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
    
        r20 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008e, code lost:
    
        r11 = new X.C51894Mwc(r12, r13, r14, r15, r16, true, r18, r19, r20);
        r21.A07.ADV(r11);
        A0J(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009d, code lost:
    
        if (r8 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a1, code lost:
    
        if (r21.A03 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a3, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a4, code lost:
    
        r6 = X.AbstractC25225BEi.A15(r21.A08);
        X.C14360o3.A0B(r6, 2);
        r4 = r21.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b0, code lost:
    
        if (r10 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b2, code lost:
    
        r5 = r4.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b8, code lost:
    
        if (X.MSY.A05(r5) == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ba, code lost:
    
        X.AbstractC166987dD.A0d(r5).setVisibility(0);
        X.AbstractC166987dD.A0d(r5).setAlpha(0.0f);
        X.MSX.A0A(X.AbstractC166987dD.A0d(r5), 1.0f).start();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d5, code lost:
    
        X.MSY.A1H(r6, r4.A02);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00da, code lost:
    
        r3 = r21.A0C;
        X.C55177Odh.A00(r3, X.C56615PBl.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e1, code lost:
    
        if (r8 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e3, code lost:
    
        r3.A04(X.C56615PBl.A00, 70000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00eb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f2, code lost:
    
        if (X.MSZ.A1Y(r4.A01) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f4, code lost:
    
        r1 = r4.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fa, code lost:
    
        if (X.MSY.A05(r1) != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fc, code lost:
    
        X.MSX.A14(X.AbstractC43594JPz.A0G(X.AbstractC166987dD.A0d(r1)), new X.RunnableC56920PNn(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0080, code lost:
    
        if (r4 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x006e, code lost:
    
        if (r21.A04 != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0M(X.C51875MwJ r22) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NT6.A0M(X.MwJ):void");
    }
}
