package X;

import android.content.Context;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lrt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49360Lrt implements GZ6 {
    public final /* synthetic */ RectF A00;
    public final /* synthetic */ JR2 A01;
    public final /* synthetic */ C2EC A02;

    @Override // X.GZ6
    public final void D1h(int i) {
    }

    public C49360Lrt(RectF rectF, JR2 jr2, C2EC c2ec) {
        this.A01 = jr2;
        this.A02 = c2ec;
        this.A00 = rectF;
    }

    @Override // X.GZ6
    public final void Dod(C3o9 c3o9, int i) {
        JR2 jr2 = this.A01;
        UserSession A0p = jr2.A0p();
        Context requireContext = jr2.A1L.requireContext();
        C2EC c2ec = this.A02;
        JR2.A0B(this.A00, C22P.A2K, jr2, LKW.A02(requireContext, A0p, c2ec, c2ec.C7I()), c2ec.BKb());
    }
}
