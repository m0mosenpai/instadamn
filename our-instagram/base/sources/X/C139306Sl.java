package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6Sl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139306Sl implements XEX {
    public static final /* synthetic */ C0YR[] A08 = {new AnonymousClass013(C139306Sl.class, "dominantMediaColor", "getDominantMediaColor()I", 0)};
    public AnimatorSet A00;
    public C133115zd A01;
    public C141596ac A02;
    public XDQ A03;
    public final Animator.AnimatorListener A04;
    public final View A05;
    public final UserSession A06;
    public final InterfaceC16530ry A07;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.0ry] */
    public C139306Sl(View view, UserSession userSession) {
        C14360o3.A0B(view, 1);
        this.A05 = view;
        this.A06 = userSession;
        this.A04 = new C70202WGu(this);
        this.A07 = new Object();
    }

    @Override // X.XEX
    public final void EPk() {
    }

    public static final int A00(C139306Sl c139306Sl) {
        return ((Number) c139306Sl.A07.CES(c139306Sl, A08[0])).intValue();
    }

    @Override // X.XEX
    public final AnimatorSet Ac0() {
        return this.A00;
    }

    @Override // X.XEX
    public final C141596ac Blc() {
        return this.A02;
    }

    @Override // X.XEX
    public final void EK3() {
        XDQ xdq = this.A03;
        if (xdq != null) {
            xdq.EK3();
        }
    }

    @Override // X.XEX
    public final void EhB() {
        C141596ac c141596ac = this.A02;
        if (c141596ac != null && c141596ac.A0k) {
            XDQ xdq = this.A03;
            if (xdq != null) {
                xdq.EhB();
                return;
            }
            return;
        }
        AbstractC65725Tsz.A00(this);
        XDQ xdq2 = this.A03;
        if (xdq2 == null) {
            return;
        }
        xdq2.EK3();
    }

    @Override // X.XEX
    public final void EkX() {
        C141596ac c141596ac = this.A02;
        if (c141596ac != null && c141596ac.A0k) {
            AbstractC65725Tsz.A01(this);
        }
    }

    @Override // X.XEX
    public final void start() {
        AbstractC65725Tsz.A02(this);
    }

    @Override // X.XEX
    public final void EcI(C141596ac c141596ac) {
        this.A02 = c141596ac;
    }
}
