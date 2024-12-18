package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;

/* loaded from: classes9.dex */
public final class NFQ extends C2AH {
    public final int A00;
    public final Object A01;

    public NFQ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C2AH
    public final void onFail(Exception exc) {
        InterfaceC23621Ds interfaceC23621Ds;
        Object obj;
        switch (this.A00) {
            case 1:
                C50745Maz c50745Maz = (C50745Maz) this.A01;
                C1GL c1gl = C50745Maz.A0A;
                c50745Maz.A03 = false;
                c50745Maz.A02 = true;
                C0w9.A07("StaticAnimationDrawableTextureGenerationFailed", exc);
                c50745Maz.invalidateSelf();
                return;
            case 2:
                C14360o3.A0B(exc, 0);
                interfaceC23621Ds = (InterfaceC23621Ds) this.A01;
                obj = C219499mx.A00;
                interfaceC23621Ds.resumeWith(obj);
                return;
            default:
                C14360o3.A0B(exc, 0);
                interfaceC23621Ds = (InterfaceC23621Ds) this.A01;
                obj = AbstractC43592JPx.A0p(exc);
                interfaceC23621Ds.resumeWith(obj);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        InterfaceC23621Ds interfaceC23621Ds;
        Object A0i;
        switch (this.A00) {
            case 0:
                interfaceC23621Ds = (InterfaceC23621Ds) this.A01;
                if (obj != null) {
                    A0i = AbstractC43592JPx.A0p(obj);
                } else {
                    A0i = AbstractC25227BEk.A0i();
                }
                interfaceC23621Ds.resumeWith(A0i);
                return;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                C50745Maz c50745Maz = (C50745Maz) this.A01;
                C1GL c1gl = C50745Maz.A0A;
                c50745Maz.A00 = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                c50745Maz.A01 = bitmapShader;
                c50745Maz.A06.setShader(bitmapShader);
                c50745Maz.A03 = false;
                c50745Maz.A02 = false;
                c50745Maz.invalidateSelf();
                return;
            case 2:
                C14360o3.A0B(obj, 0);
                interfaceC23621Ds = (InterfaceC23621Ds) this.A01;
                A0i = new C8ZT(obj);
                interfaceC23621Ds.resumeWith(A0i);
                return;
            default:
                C14360o3.A0B(obj, 0);
                interfaceC23621Ds = (InterfaceC23621Ds) this.A01;
                A0i = AbstractC25225BEi.A0z(obj);
                interfaceC23621Ds.resumeWith(A0i);
                return;
        }
    }
}
