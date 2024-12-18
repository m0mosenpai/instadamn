package X;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Size;

/* renamed from: X.SkS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63449SkS implements ImageDecoder.OnHeaderDecodedListener {
    public final int A00;
    public final int A01;
    public final EnumC61099RfD A02;
    public final EnumC61083Rex A03;
    public final SNC A04;
    public final C63171SeW A05 = C63171SeW.A00();
    public final boolean A06;

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named named;
        C63171SeW c63171SeW = this.A05;
        int i = this.A01;
        int i2 = this.A00;
        int i3 = 1;
        if (c63171SeW.A01(i, i2, this.A06, false)) {
            i3 = 3;
        }
        imageDecoder.setAllocator(i3);
        if (this.A02 == EnumC61099RfD.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C63450SkT(this));
        Size size = imageInfo.getSize();
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getHeight();
        }
        float A00 = this.A04.A00(size.getWidth(), size.getHeight(), i, i2);
        int A0A = AbstractC166987dD.A0A(size.getWidth(), A00);
        int A0A2 = AbstractC166987dD.A0A(size.getHeight(), A00);
        if (android.util.Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(A0A, A0A2);
        EnumC61083Rex enumC61083Rex = this.A03;
        if (enumC61083Rex != null) {
            if (enumC61083Rex == EnumC61083Rex.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                named = ColorSpace.Named.DISPLAY_P3;
            } else {
                named = ColorSpace.Named.SRGB;
            }
            imageDecoder.setTargetColorSpace(ColorSpace.get(named));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0032, code lost:
    
        if (X.AbstractC166987dD.A1a(r3.A00(r1)) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C63449SkS(X.C63729Ssj r3, int r4, int r5) {
        /*
            r2 = this;
            r2.<init>()
            X.SeW r0 = X.C63171SeW.A00()
            r2.A05 = r0
            r2.A01 = r4
            r2.A00 = r5
            X.SaL r0 = X.C63360SiJ.A06
            java.lang.Object r0 = r3.A00(r0)
            X.RfD r0 = (X.EnumC61099RfD) r0
            r2.A02 = r0
            X.SaL r0 = X.SNC.A00
            java.lang.Object r0 = r3.A00(r0)
            X.SNC r0 = (X.SNC) r0
            r2.A04 = r0
            X.SaL r1 = X.C63360SiJ.A05
            java.lang.Object r0 = r3.A00(r1)
            if (r0 == 0) goto L34
            java.lang.Object r0 = r3.A00(r1)
            boolean r1 = X.AbstractC166987dD.A1a(r0)
            r0 = 1
            if (r1 != 0) goto L35
        L34:
            r0 = 0
        L35:
            r2.A06 = r0
            X.SaL r0 = X.C63360SiJ.A09
            java.lang.Object r0 = r3.A00(r0)
            X.Rex r0 = (X.EnumC61083Rex) r0
            r2.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63449SkS.<init>(X.Ssj, int, int):void");
    }
}
