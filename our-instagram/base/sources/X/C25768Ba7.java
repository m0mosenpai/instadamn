package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;

/* renamed from: X.Ba7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25768Ba7 extends C2DC {
    public final InterfaceC137546La A00;

    public C25768Ba7(InterfaceC137546La interfaceC137546La) {
        C14360o3.A0B(interfaceC137546La, 1);
        this.A00 = interfaceC137546La;
    }

    @Override // X.C2DC
    public final void A04(InterfaceC1128857w interfaceC1128857w) {
        C14360o3.A0B(interfaceC1128857w, 0);
        Paint A0S = AbstractC166987dD.A0S(7);
        Bitmap A00 = C62Z.A00(this.A00);
        Shader.TileMode A002 = AbstractC25293BHm.A00(1);
        A0S.setShader(new BitmapShader(A00, A002, A002));
        A0S.setAntiAlias(true);
        AnonymousClass597.A00(AbstractC25233BEq.A0C(interfaceC1128857w)).drawPaint(A0S);
    }

    @Override // X.C2DC
    public final long A03() {
        return 9205357640488583168L;
    }
}
