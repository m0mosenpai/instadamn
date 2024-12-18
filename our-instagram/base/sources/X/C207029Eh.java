package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.9Eh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207029Eh extends C0YY implements InterfaceC16660sJ {
    public final float A00;
    public final int A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207029Eh(Object obj, float f, int i) {
        super(1);
        this.A01 = i;
        this.A02 = obj;
        this.A00 = f;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A01) {
            case 0:
                C206189Bb c206189Bb = (C206189Bb) obj;
                C14360o3.A0B(c206189Bb, 0);
                ((C190988cu) this.A02).A02.A0l((Drawable) c206189Bb.A03, this.A00);
                break;
            case 1:
                C206189Bb c206189Bb2 = (C206189Bb) obj;
                C14360o3.A0B(c206189Bb2, 0);
                C190988cu c190988cu = (C190988cu) this.A02;
                int dimensionPixelSize = c190988cu.A00.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
                c190988cu.A02.A0m((Drawable) c206189Bb2.A03, (this.A00 * dimensionPixelSize) / r2.getIntrinsicHeight());
                break;
            default:
                Bitmap bitmap = (Bitmap) obj;
                C14360o3.A0B(bitmap, 0);
                ((Canvas) this.A02).drawBitmap(bitmap, -this.A00, 0.0f, (Paint) null);
                break;
        }
        return C0eB.A00;
    }
}
