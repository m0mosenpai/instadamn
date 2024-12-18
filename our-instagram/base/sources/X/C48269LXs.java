package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import com.instagram.ui.widget.mediapicker.MediaPickerItemView;

/* renamed from: X.LXs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48269LXs implements C1NJ {
    public final int A00;
    public final Object A01;

    public C48269LXs(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        MediaPickerItemView mediaPickerItemView;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c73033Pe, 1);
                Bitmap bitmap = c73033Pe.A01;
                if (bitmap == null) {
                    return;
                }
                C44306Jhx c44306Jhx = (C44306Jhx) this.A01;
                int i = c44306Jhx.A05;
                int i2 = 0;
                Bitmap A09 = C1NC.A09(bitmap, i, i, 0, false);
                C14360o3.A07(A09);
                int i3 = c44306Jhx.A04;
                int i4 = c44306Jhx.A03;
                int i5 = i3 + i4;
                int i6 = (i - i5) / 2;
                if (c44306Jhx.A0E) {
                    i2 = ((i - i3) / 2) - i4;
                }
                C0fK.A03(A09);
                Bitmap createBitmap = Bitmap.createBitmap(A09, i6, i2, i5, i5);
                C14360o3.A07(createBitmap);
                Path path = c44306Jhx.A07;
                float A02 = AbstractC166987dD.A02(i3);
                path.addCircle(A02 + (i4 / 2), A02 + i4, c44306Jhx.A02, Path.Direction.CCW);
                Paint paint = c44306Jhx.A06;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                c44306Jhx.A01 = true;
                c44306Jhx.invalidateDrawable(c44306Jhx);
                return;
            case 1:
                C69650Vsr c69650Vsr = (C69650Vsr) this.A01;
                c69650Vsr.A07.remove(this);
                c69650Vsr.A00();
                return;
            case 2:
                AbstractC167007dF.A1K(interfaceC59502nt, c73033Pe);
                Object C4x = interfaceC59502nt.C4x();
                if (C4x != null) {
                    MediaPickerItemView mediaPickerItemView2 = (MediaPickerItemView) this.A01;
                    int i7 = MediaPickerItemView.A0X;
                    if (!C4x.equals(mediaPickerItemView2.A09)) {
                        return;
                    }
                }
                mediaPickerItemView = (MediaPickerItemView) this.A01;
                mediaPickerItemView.A00 = c73033Pe.A01;
                mediaPickerItemView.A0A = false;
                mediaPickerItemView.invalidate();
                return;
            default:
                C14360o3.A0B(c73033Pe, 1);
                mediaPickerItemView = (MediaPickerItemView) this.A01;
                mediaPickerItemView.A00 = c73033Pe.A01;
                mediaPickerItemView.invalidate();
                return;
        }
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        switch (this.A00) {
            case 1:
                C69650Vsr c69650Vsr = (C69650Vsr) this.A01;
                c69650Vsr.A07.remove(this);
                c69650Vsr.A00();
                return;
            case 2:
                C14360o3.A0B(interfaceC59502nt, 0);
                MediaPickerItemView mediaPickerItemView = (MediaPickerItemView) this.A01;
                mediaPickerItemView.A0A = false;
                if (mediaPickerItemView.A05 == null) {
                    return;
                }
                interfaceC59502nt.Ba1();
                return;
            default:
                return;
        }
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }
}
