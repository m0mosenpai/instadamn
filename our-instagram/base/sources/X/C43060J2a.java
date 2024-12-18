package X;

import java.util.List;

/* renamed from: X.J2a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43060J2a implements JHZ {
    public final /* synthetic */ C39464Hbq A00;

    @Override // X.JHZ
    public final void DNJ(C120985dq c120985dq, int i) {
    }

    public C43060J2a(C39464Hbq c39464Hbq) {
        this.A00 = c39464Hbq;
    }

    @Override // X.JHZ
    public final void onDataSetChanged() {
        C39464Hbq c39464Hbq = this.A00;
        C38349Gtl c38349Gtl = c39464Hbq.A00;
        if (c38349Gtl != null) {
            List A0J = c39464Hbq.A03.A0A.A0J();
            C14360o3.A0B(A0J, 0);
            c38349Gtl.A01 = A0J;
            C38349Gtl c38349Gtl2 = c39464Hbq.A00;
            if (c38349Gtl2 != null) {
                c38349Gtl2.notifyDataSetChanged();
                return;
            }
        }
        C14360o3.A0F("clipsViewerDebugOverlayAdapter");
        throw C00O.createAndThrow();
    }
}
