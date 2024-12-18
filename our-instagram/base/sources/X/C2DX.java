package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2DX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2DX {
    public final C006802i A00;
    public final UserSession A01;

    public final void A00() {
        this.A00.markerEnd(1060769796, (short) 416);
    }

    public final void A01() {
        this.A00.markerEnd(1060769796, (short) 2);
    }

    public final void A02(String str) {
        this.A00.markerPoint(1060769796, str);
    }

    public final void A03(String str, int i) {
        this.A00.markerAnnotate(1060769796, str, i);
    }

    public C2DX(UserSession userSession) {
        this.A01 = userSession;
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        this.A00 = c006802i;
    }
}
