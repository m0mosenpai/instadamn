package X;

import android.view.View;

/* renamed from: X.3h0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79533h0 implements InterfaceC79483gv {
    @Override // X.InterfaceC79483gv
    public final float AX6(C51292Xc c51292Xc) {
        C14360o3.A0B(c51292Xc, 0);
        C50952Vr c50952Vr = c51292Xc.A03;
        if (c50952Vr != null && (c50952Vr.A0F & 524288) != 0) {
            return c50952Vr.A04;
        }
        return 1.0f;
    }

    @Override // X.InterfaceC79483gv
    public final float AX7(Object obj) {
        C14360o3.A0B(obj, 0);
        View A02 = AbstractC79463gt.A02(this, obj);
        float scaleX = A02.getScaleX();
        if (scaleX == A02.getScaleY()) {
            return scaleX;
        }
        throw new RuntimeException("Tried to get scale of view, but scaleX and scaleY are different");
    }

    @Override // X.InterfaceC79483gv
    public final void EJZ(Object obj) {
        C14360o3.A0B(obj, 0);
        View A02 = AbstractC79463gt.A02(this, obj);
        A02.setScaleX(1.0f);
        A02.setScaleY(1.0f);
    }

    @Override // X.InterfaceC79483gv
    public final void EOy(Object obj, float f) {
        C14360o3.A0B(obj, 0);
        View A02 = AbstractC79463gt.A02(this, obj);
        A02.setScaleX(f);
        A02.setScaleY(f);
    }

    @Override // X.InterfaceC79483gv
    public final String getName() {
        return "scale";
    }
}
