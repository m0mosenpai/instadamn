package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.3FX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3FX {
    public final UserSession A00;
    public final C70013Cl A01;
    public final C69453Af A02;
    public final C61552rI A03;
    public final C3FV A04;
    public final C61582rL A05;
    public final C61842rl A06;
    public final C60662pp A07;
    public final C62592sy A08;
    public final C3CX A09;

    public C3FX(UserSession userSession, C70013Cl c70013Cl, C69453Af c69453Af, C61552rI c61552rI, C3FV c3fv, C61582rL c61582rL, C61842rl c61842rl, C60662pp c60662pp, C62592sy c62592sy, C3CX c3cx) {
        C14360o3.A0B(c70013Cl, 2);
        C14360o3.A0B(c61842rl, 7);
        this.A00 = userSession;
        this.A01 = c70013Cl;
        this.A02 = c69453Af;
        this.A09 = c3cx;
        this.A07 = c60662pp;
        this.A04 = c3fv;
        this.A06 = c61842rl;
        this.A08 = c62592sy;
        this.A05 = c61582rL;
        this.A03 = c61552rI;
    }

    public final void A00() {
        if (this.A07.A0Y()) {
            if (C18U.A06(C06090Tz.A05, this.A00, 36323341581626549L)) {
                return;
            }
        }
        A03(true);
    }

    public final void A01(Bundle bundle) {
        C23031Ai A00 = AbstractC23021Ah.A00(this.A00);
        if (bundle != null) {
            InterfaceC16530ry interfaceC16530ry = A00.A5w;
            C0YR[] c0yrArr = C23031Ai.A8c;
            if (((Boolean) interfaceC16530ry.CES(A00, c0yrArr[390])).booleanValue()) {
                interfaceC16530ry.Egi(A00, false, c0yrArr[390]);
                InterfaceC19610xo ARD = A00.A01.ARD();
                ARD.E7K("injected_post_to_feed_id", "");
                ARD.apply();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008b, code lost:
    
        if (r1 != true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e9, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r11.A00, 36317594915771770L) == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.C1EN r12, java.util.Map r13) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3FX.A02(X.1EN, java.util.Map):void");
    }

    public final void A03(boolean z) {
        C60662pp c60662pp = this.A07;
        A01(c60662pp.mArguments);
        if (z) {
            c60662pp.A0A().A0v().A00();
        }
        if (c60662pp.mView != null) {
            C3FR c3fr = (C3FR) c60662pp.getScrollingViewProxy();
            if (c3fr != null && c3fr.CbL() && !c60662pp.A0Q) {
                c3fr.ElT();
            }
            c60662pp.A0X(true, true);
        }
    }
}
