package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.instagram.quicksnap.util.QuickSnapMediaSaver;

/* renamed from: X.Osi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55950Osi implements C1NJ {
    public final int A00;
    public final InterfaceC16660sJ A01;
    public final /* synthetic */ QuickSnapMediaSaver A02;

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        C14360o3.A0B(c73033Pe, 1);
        InterfaceC16660sJ interfaceC16660sJ = this.A01;
        Bitmap bitmap = c73033Pe.A01;
        int i = this.A00;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            C14360o3.A07(createBitmap);
            Bitmap A00 = C0fK.A00(bitmap, i, i, false);
            C14360o3.A07(A00);
            Canvas A06 = AbstractC43592JPx.A06(createBitmap);
            A06.clipPath(AMo.A02(i));
            A06.drawBitmap(A00, 0.0f, 0.0f, (Paint) null);
            bitmap2 = createBitmap;
        }
        interfaceC16660sJ.invoke(bitmap2);
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    public C55950Osi(QuickSnapMediaSaver quickSnapMediaSaver, InterfaceC16660sJ interfaceC16660sJ, int i) {
        this.A02 = quickSnapMediaSaver;
        this.A00 = i;
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        this.A01.invoke(null);
    }
}
