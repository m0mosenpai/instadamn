package X;

import android.app.Dialog;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.OnB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55626OnB implements CallerContextable {
    public Dialog A00;
    public String A01;
    public boolean A02;
    public final C82G A03;
    public final AbstractC59962oe A04;
    public final C34395FEl A05;
    public final UserSession A06;
    public final C131995xZ A07;
    public final C41181vS A08;
    public final InterfaceC146856jN A09;
    public final CharSequence A0A;
    public final CharSequence A0B;
    public final Integer A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final boolean A0O;
    public final boolean A0P;
    public static final String __redex_internal_original_name = "StorySharingOptionsDialogController";
    public static final CallerContext A0Q = CallerContext.A01(__redex_internal_original_name);

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Zx, X.MnJ] */
    public static final void A00(MU0 mu0, C55626OnB c55626OnB) {
        C82G c82g = c55626OnB.A03;
        if (c82g != null) {
            UserSession userSession = c55626OnB.A06;
            MU1 mu1 = MU1.STORY;
            ?? c0Zx = new C0Zx();
            int ordinal = mu0.ordinal();
            boolean z = true;
            if (ordinal != 2 && ordinal != 4) {
                z = (ordinal == 3 || ordinal == 5) ? false : c55626OnB.A0O;
            }
            c0Zx.A03("is_xpost_enabled", Boolean.valueOf(z));
            AbstractC50568MTz.A00(mu0, mu1, c82g, c0Zx, userSession);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55626OnB.A01():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0148  */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.FEl, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C55626OnB(X.C82G r7, X.AbstractC59962oe r8, com.instagram.common.session.UserSession r9, X.C41181vS r10, X.InterfaceC146856jN r11, java.lang.Integer r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55626OnB.<init>(X.82G, X.2oe, com.instagram.common.session.UserSession, X.1vS, X.6jN, java.lang.Integer, boolean, boolean):void");
    }
}
