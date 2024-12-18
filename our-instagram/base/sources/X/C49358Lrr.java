package X;

import android.content.Context;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lrr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49358Lrr implements InterfaceC37121GXg {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C49358Lrr(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = obj;
    }

    @Override // X.InterfaceC37121GXg
    public final void D7j() {
        if (this.A00 != 0) {
            LLk.A0C((C31446Drq) this.A03, (LLk) this.A01, (C3o9) this.A02);
        } else {
            JR2 jr2 = (JR2) this.A03;
            UserSession A0p = jr2.A0p();
            Context requireContext = jr2.A1L.requireContext();
            C2EC c2ec = (C2EC) this.A02;
            JR2.A0B((RectF) this.A01, C22P.A2K, jr2, LKW.A02(requireContext, A0p, c2ec, c2ec.C7I()), c2ec.BKb());
        }
    }
}
