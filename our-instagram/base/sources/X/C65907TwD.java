package X;

import android.graphics.Bitmap;
import com.instagram.giphy.webp.IgWebPAnimDecoder;

/* renamed from: X.TwD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65907TwD implements XEC {
    public final int A00;
    public final int A01;
    public final IgWebPAnimDecoder A02;

    public C65907TwD(IgWebPAnimDecoder igWebPAnimDecoder) {
        C14360o3.A0B(igWebPAnimDecoder, 1);
        this.A02 = igWebPAnimDecoder;
        this.A01 = igWebPAnimDecoder.getWidth();
        this.A00 = igWebPAnimDecoder.getHeight();
    }

    @Override // X.XEC
    public final int EMm(int i, Bitmap bitmap) {
        C14360o3.A0B(bitmap, 1);
        return this.A02.seekToTime(i, bitmap);
    }

    @Override // X.XEC
    public final int getDuration() {
        IgWebPAnimDecoder igWebPAnimDecoder = this.A02;
        if (igWebPAnimDecoder.getFrameCount() == 0) {
            return 0;
        }
        return igWebPAnimDecoder.getDuration();
    }

    @Override // X.XEC
    public final int getFrameCount() {
        return this.A02.getFrameCount();
    }

    @Override // X.XEC
    public final int getHeight() {
        return this.A00;
    }

    @Override // X.XEC
    public final int getWidth() {
        return this.A01;
    }
}
