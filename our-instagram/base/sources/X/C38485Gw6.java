package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gw6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38485Gw6 extends C3OO {
    public final Context A00;
    public final FrameLayout A01;
    public final C126545np A02;
    public final C62862tP A03;
    public final UserSession A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38485Gw6(FrameLayout frameLayout, C62862tP c62862tP, UserSession userSession) {
        super(frameLayout);
        C14360o3.A0B(frameLayout, 1);
        this.A01 = frameLayout;
        this.A04 = userSession;
        this.A03 = c62862tP;
        Context A0L = AbstractC166997dE.A0L(frameLayout);
        this.A00 = A0L;
        C126545np c126545np = new C126545np(A0L);
        frameLayout.addView(c126545np);
        this.A02 = c126545np;
    }
}
