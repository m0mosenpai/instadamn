package X;

import android.widget.TextView;

/* renamed from: X.FxN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36149FxN implements InterfaceC41501vz {
    public final /* synthetic */ C114875Gx A00;

    public C36149FxN(C114875Gx c114875Gx) {
        this.A00 = c114875Gx;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-1740726518);
        int A032 = C0f9.A03(957492299);
        C114875Gx c114875Gx = this.A00;
        boolean z = !((C36096FwW) obj).A00;
        TextView textView = c114875Gx.A04;
        if (textView != null) {
            int i = 2131977218;
            if (z) {
                i = 2131977219;
            }
            textView.setText(i);
        }
        C0f9.A0A(1105218713, A032);
        C0f9.A0A(-1337561138, A03);
    }
}
