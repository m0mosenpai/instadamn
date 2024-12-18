package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jrv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44774Jrv extends C3OO implements C7QE {
    public C7QH A00;
    public final int A01;
    public final Context A02;
    public final UserSession A03;
    public final L5W A04;
    public final AnonymousClass988 A05;
    public final LGr A06;
    public final C7IM A07;
    public final C7S0 A08;
    public final C7RC A09;
    public final C35967FuR A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.FuR, X.0iw, java.lang.Object] */
    public C44774Jrv(Context context, View view, UserSession userSession, L5W l5w, C49081Ln7 c49081Ln7, AnonymousClass988 anonymousClass988, C7IM c7im, int i) {
        super(view);
        C14360o3.A0B(l5w, 3);
        AbstractC25234BEr.A0k(4, c49081Ln7, userSession, context, anonymousClass988);
        C14360o3.A0B(c7im, 8);
        this.A01 = i;
        this.A04 = l5w;
        this.A03 = userSession;
        this.A02 = context;
        this.A05 = anonymousClass988;
        this.A07 = c7im;
        LGr lGr = new LGr(view, userSession);
        this.A06 = lGr;
        ?? obj = new Object();
        this.A0A = obj;
        this.A09 = new C7RC(obj, c49081Ln7);
        this.A08 = new C7S0(lGr.A02, c49081Ln7);
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A00;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A00 = c7qh;
    }
}
