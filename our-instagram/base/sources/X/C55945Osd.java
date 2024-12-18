package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;

/* renamed from: X.Osd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55945Osd implements C1NJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C50745Maz A01;

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    public C55945Osd(C50745Maz c50745Maz, long j) {
        this.A01 = c50745Maz;
        this.A00 = j;
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        C50745Maz c50745Maz = this.A01;
        Bitmap bitmap = c73033Pe.A01;
        C1GL c1gl = C50745Maz.A0A;
        c50745Maz.A00 = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        c50745Maz.A01 = bitmapShader;
        c50745Maz.A06.setShader(bitmapShader);
        c50745Maz.A03 = false;
        c50745Maz.A02 = false;
        System.currentTimeMillis();
        bitmap.getWidth();
        bitmap.getHeight();
        bitmap.getByteCount();
        c50745Maz.invalidateSelf();
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        C50745Maz c50745Maz = this.A01;
        C1GL c1gl = C50745Maz.A0A;
        c50745Maz.A03 = false;
        c50745Maz.A02 = true;
        C0w9.A03("StaticAnimationDrawableTextureLoadFailed", "failed fetching from IgImageInfra");
        c50745Maz.invalidateSelf();
    }
}
