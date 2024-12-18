package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.creation.photo.crop.LayoutImageView;
import com.instagram.creation.photo.util.ExifImageData;
import java.io.File;

/* loaded from: classes11.dex */
public final class WR4 implements InterfaceC018507f {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C69105Vhv A02;
    public final /* synthetic */ C66486UJo A03;
    public final /* synthetic */ String A04;

    @Override // X.InterfaceC018507f
    public final /* bridge */ /* synthetic */ void DPn(AbstractC019307n abstractC019307n, Object obj) {
        final C44262Jh8 c44262Jh8 = (C44262Jh8) obj;
        final int i = this.A01;
        final int i2 = this.A00;
        final C69105Vhv c69105Vhv = this.A02;
        C176567tE.A00(new Runnable() { // from class: X.WxH
            @Override // java.lang.Runnable
            public final void run() {
                int i3;
                WR4 wr4 = this;
                int i4 = i;
                int i5 = i2;
                C44262Jh8 c44262Jh82 = c44262Jh8;
                C66486UJo c66486UJo = wr4.A03;
                int i6 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                LayoutImageView layoutImageView = c66486UJo.A0G;
                FragmentActivity fragmentActivity = c66486UJo.A0A;
                Bitmap bitmap = c44262Jh82.A00;
                ExifImageData exifImageData = c44262Jh82.A01;
                if (exifImageData == null) {
                    i3 = 0;
                } else {
                    i3 = exifImageData.A00;
                }
                InterfaceC197178nn interfaceC197178nn = c44262Jh82.A02;
                if (bitmap == null) {
                    C9GR.A0F(fragmentActivity, AbstractC43591JPw.A00(219), 2131976043);
                } else {
                    if (fragmentActivity == null || fragmentActivity.isFinishing() || interfaceC197178nn == null) {
                        return;
                    }
                    layoutImageView.A0P(i4, i5, bitmap, i3);
                }
            }
        });
    }

    public WR4(C69105Vhv c69105Vhv, C66486UJo c66486UJo, String str, int i, int i2) {
        this.A03 = c66486UJo;
        this.A04 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = c69105Vhv;
    }

    @Override // X.InterfaceC018507f
    public final AbstractC019307n D8C(Bundle bundle, int i) {
        C66486UJo c66486UJo = this.A03;
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C44095JeK(c66486UJo.A0A, android.net.Uri.fromFile(new File(this.A04)), null, c66486UJo.A0C);
    }
}
