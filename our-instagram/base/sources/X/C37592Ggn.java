package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Ggn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37592Ggn extends AbstractC37623GhI implements InterfaceC116905Qw {
    public View A00;
    public View A01;
    public ViewStub A02;
    public IgTextView A03;
    public IgTextView A04;
    public IgImageView A05;
    public Integer A06;
    public final Context A07;
    public final UserSession A08;
    public final InterfaceC60442pS A09;
    public final C37546Gg2 A0A;
    public final EnumC37736GjB A0B;
    public final InterfaceC16820sZ A0C;
    public final JJI A0D;
    public final C37604Ggz A0E;

    public C37592Ggn(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C37546Gg2 c37546Gg2, JJI jji, C37604Ggz c37604Ggz, EnumC37736GjB enumC37736GjB, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC25233BEq.A0w(2, userSession, interfaceC60442pS, c37604Ggz);
        AbstractC167017dG.A1U(enumC37736GjB, jji);
        this.A07 = context;
        this.A08 = userSession;
        this.A09 = interfaceC60442pS;
        this.A0E = c37604Ggz;
        this.A0A = c37546Gg2;
        this.A0B = enumC37736GjB;
        this.A0D = jji;
        this.A0C = interfaceC16820sZ;
        this.A06 = C05F.A0C;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C37592Ggn r11) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37592Ggn.A00(X.Ggn):void");
    }

    @Override // X.InterfaceC116905Qw
    public final void D5F() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r0 != false) goto L8;
     */
    @Override // X.InterfaceC116905Qw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D5H(X.C37818GkY r4) {
        /*
            r3 = this;
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            X.JJI r1 = r3.A0D
            java.util.List r2 = r4.A09
            boolean r0 = r4.A0D
            boolean r0 = r1.CoE(r2, r0)
            if (r0 != 0) goto L37
            X.5jj r1 = r4.A01
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L23
            X.4zP r0 = r1.BbA()
            boolean r0 = r0.BUt()
            r1 = 1
            if (r0 == 0) goto L24
        L23:
            r1 = 0
        L24:
            X.Gg2 r0 = r3.A0A
            X.Gg8 r0 = r0.A0A
            boolean r0 = r0.A0a()
            if (r1 == 0) goto L38
            if (r0 != 0) goto L38
            java.lang.Integer r0 = X.C05F.A0N
        L32:
            r3.A06 = r0
            A00(r3)
        L37:
            return
        L38:
            java.lang.Integer r0 = X.C05F.A0C
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37592Ggn.D5H(X.GkY):void");
    }

    @Override // X.InterfaceC116905Qw
    public final void D5E(C38971HDz c38971HDz) {
        if (!this.A0A.A0A.A0a()) {
            this.A06 = C05F.A01;
        }
        A00(this);
    }

    @Override // X.InterfaceC116905Qw
    public final void D5G(C37752GjR c37752GjR) {
        if (!this.A0A.A0A.A0a()) {
            this.A06 = C05F.A00;
        }
        A00(this);
    }

    @Override // X.AbstractC37623GhI, X.InterfaceC60602pj
    public final void onDestroyView() {
        super.onDestroyView();
        this.A00 = null;
        this.A02 = null;
        this.A05 = null;
        this.A04 = null;
        this.A01 = null;
        this.A03 = null;
    }
}
