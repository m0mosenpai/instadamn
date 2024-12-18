package X;

import android.view.View;

/* renamed from: X.3gz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79523gz implements InterfaceC79483gv {
    @Override // X.InterfaceC79483gv
    public final float AX6(C51292Xc c51292Xc) {
        C14360o3.A0B(c51292Xc, 0);
        C50952Vr c50952Vr = c51292Xc.A03;
        if (c50952Vr != null && (c50952Vr.A0F & 1048576) != 0) {
            return c50952Vr.A00;
        }
        return 1.0f;
    }

    @Override // X.InterfaceC79483gv
    public final float AX7(Object obj) {
        C14360o3.A0B(obj, 0);
        if (obj instanceof View) {
            return ((View) obj).getAlpha();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Tried to get alpha of unsupported mount content: ");
        sb.append(obj);
        throw new UnsupportedOperationException(sb.toString());
    }

    @Override // X.InterfaceC79483gv
    public final void EJZ(Object obj) {
        C14360o3.A0B(obj, 0);
        EOy(obj, 1.0f);
    }

    @Override // X.InterfaceC79483gv
    public final void EOy(Object obj, float f) {
        C14360o3.A0B(obj, 0);
        if (obj instanceof View) {
            ((View) obj).setAlpha(f);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Setting alpha on unsupported mount content: ");
        sb.append(obj);
        throw new UnsupportedOperationException(sb.toString());
    }

    @Override // X.InterfaceC79483gv
    public final String getName() {
        return "alpha";
    }
}
