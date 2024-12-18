package X;

import android.graphics.Bitmap;
import com.instagram.giphy.webp.IgWebPAnimDecoder;

/* renamed from: X.WkQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70921WkQ implements XEC {
    public int A00;
    public int A01;
    public Integer A02;
    public final int A03;
    public final int A04;
    public final InterfaceC09390do A05;
    public final IgWebPAnimDecoder A06;

    @Override // X.XEC
    public final int EMm(int i, Bitmap bitmap) {
        int seekToTime;
        Bitmap A00;
        int i2;
        int i3;
        C14360o3.A0B(bitmap, 1);
        Integer num = this.A02;
        if (num == C05F.A0C) {
            IgWebPAnimDecoder igWebPAnimDecoder = this.A06;
            InterfaceC09390do interfaceC09390do = this.A05;
            seekToTime = igWebPAnimDecoder.seekToTime(i, (Bitmap) AbstractC166987dD.A17(interfaceC09390do));
            int minCropX = igWebPAnimDecoder.getMinCropX();
            int minCropY = igWebPAnimDecoder.getMinCropY();
            Bitmap bitmap2 = (Bitmap) AbstractC166987dD.A17(interfaceC09390do);
            int A01 = A01();
            int A002 = A00();
            C0fK.A03(bitmap2);
            A00 = Bitmap.createBitmap(bitmap2, minCropX, minCropY, A01, A002);
            C14360o3.A07(A00);
            i2 = this.A04;
            i3 = this.A03;
        } else {
            Integer num2 = C05F.A01;
            IgWebPAnimDecoder igWebPAnimDecoder2 = this.A06;
            if (num == num2) {
                InterfaceC09390do interfaceC09390do2 = this.A05;
                seekToTime = igWebPAnimDecoder2.seekToTime(i, (Bitmap) AbstractC166987dD.A17(interfaceC09390do2));
                A00 = C0fK.A00((Bitmap) AbstractC166987dD.A17(interfaceC09390do2), this.A01, this.A00, true);
                C14360o3.A07(A00);
                i2 = this.A01;
                i3 = this.A00;
            } else {
                return igWebPAnimDecoder2.seekToTime(i, bitmap);
            }
        }
        int[] iArr = new int[i2 * i3];
        A00.getPixels(iArr, 0, A00.getWidth(), 0, 0, A00.getWidth(), A00.getHeight());
        bitmap.setPixels(iArr, 0, A00.getWidth(), 0, 0, A00.getWidth(), A00.getHeight());
        A00.recycle();
        return seekToTime;
    }

    public final int A00() {
        IgWebPAnimDecoder igWebPAnimDecoder = this.A06;
        return igWebPAnimDecoder.getMaxCropY() - igWebPAnimDecoder.getMinCropY();
    }

    public final int A01() {
        IgWebPAnimDecoder igWebPAnimDecoder = this.A06;
        return igWebPAnimDecoder.getMaxCropX() - igWebPAnimDecoder.getMinCropX();
    }

    public final boolean A02() {
        return AbstractC167007dF.A1X(this.A02, C05F.A0C);
    }

    @Override // X.XEC
    public final int getDuration() {
        IgWebPAnimDecoder igWebPAnimDecoder = this.A06;
        if (igWebPAnimDecoder.getFrameCount() == 0) {
            return 0;
        }
        return igWebPAnimDecoder.getDuration();
    }

    @Override // X.XEC
    public final int getFrameCount() {
        return this.A06.getFrameCount();
    }

    @Override // X.XEC
    public final int getHeight() {
        int i = this.A00;
        if (i == -1) {
            return this.A06.getHeight();
        }
        return i;
    }

    @Override // X.XEC
    public final int getWidth() {
        int i = this.A01;
        if (i == -1) {
            return this.A06.getWidth();
        }
        return i;
    }

    public C70921WkQ(IgWebPAnimDecoder igWebPAnimDecoder, Integer num) {
        AbstractC167017dG.A1P(igWebPAnimDecoder, num);
        this.A06 = igWebPAnimDecoder;
        this.A02 = num;
        int width = igWebPAnimDecoder.getWidth();
        this.A04 = width;
        int height = igWebPAnimDecoder.getHeight();
        this.A03 = height;
        int i = this.A02 == C05F.A00 ? -1 : 360;
        this.A01 = -1;
        this.A00 = -1;
        this.A05 = AbstractC09440dt.A01(new C50152MDf(this, 43));
        if (this.A02 == C05F.A01) {
            if (width < height) {
                this.A01 = i;
                this.A00 = (int) ((i / width) * height);
            } else {
                this.A00 = i;
                this.A01 = (int) ((i / height) * width);
            }
        }
    }
}
