package X;

import android.content.Context;
import android.view.MotionEvent;

/* renamed from: X.ItW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42613ItW implements InterfaceC81103jf {
    public final JPZ A00;
    public final C41157IJw A01;
    public final C81133ji A02;

    public C42613ItW(Context context, JPZ jpz, C38666Gz7 c38666Gz7, C41157IJw c41157IJw) {
        C14360o3.A0B(jpz, 3);
        this.A00 = jpz;
        this.A01 = c41157IJw;
        this.A02 = new C81133ji(context, c38666Gz7.A07.A00(), new C42616ItZ(this), c38666Gz7.A06, c41157IJw.A06, c38666Gz7.A01);
    }

    @Override // X.InterfaceC81103jf
    public final boolean DGb(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return this.A02.DGb(motionEvent);
    }
}
