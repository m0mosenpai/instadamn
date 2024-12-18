package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;

/* renamed from: X.Ct9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29142Ct9 implements C1NJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        C14360o3.A0B(c73033Pe, 1);
        Bitmap bitmap = c73033Pe.A01;
        if (bitmap != null) {
            int i = this.A00;
            InterfaceC16660sJ interfaceC16660sJ = this.A01;
            Bitmap A00 = C0fK.A00(bitmap, i, i, false);
            C14360o3.A07(A00);
            Bitmap A0F = AbstractC167007dF.A0F(A00.getWidth(), A00.getHeight());
            Paint A0Q = AbstractC166997dE.A0Q();
            Rect rect = new Rect(0, 0, A00.getWidth(), A00.getHeight());
            Canvas canvas = new Canvas(A0F);
            A0Q.setAntiAlias(true);
            A0Q.getColor();
            canvas.drawARGB(0, 0, 0, 0);
            canvas.drawCircle(A00.getWidth() / 2, A00.getHeight() / 2, A00.getWidth() / 2, A0Q);
            AbstractC166997dE.A1D(A0Q, PorterDuff.Mode.SRC_IN);
            canvas.drawBitmap(A00, rect, rect, A0Q);
            interfaceC16660sJ.invoke(A0F);
        }
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    public C29142Ct9(int i, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = i;
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        C18950wb.A01.AEp("Exception getting bitmap from user profile image url", 817896325);
    }
}
