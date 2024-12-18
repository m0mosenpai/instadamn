package X;

/* loaded from: classes8.dex */
public final class JZN implements Runnable {
    public final /* synthetic */ TextureViewSurfaceTextureListenerC147506ka A00;
    public final /* synthetic */ String A01;

    public JZN(TextureViewSurfaceTextureListenerC147506ka textureViewSurfaceTextureListenerC147506ka, String str) {
        this.A00 = textureViewSurfaceTextureListenerC147506ka;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC147506ka textureViewSurfaceTextureListenerC147506ka = this.A00;
        C41181vS c41181vS = textureViewSurfaceTextureListenerC147506ka.A0L;
        if (c41181vS != null && !textureViewSurfaceTextureListenerC147506ka.A0X) {
            String str = this.A01;
            if (str.equals(c41181vS.A0j)) {
                if (c41181vS.A18()) {
                    textureViewSurfaceTextureListenerC147506ka.A0u.EIr(TextureViewSurfaceTextureListenerC147506ka.A04(textureViewSurfaceTextureListenerC147506ka), c41181vS);
                }
                textureViewSurfaceTextureListenerC147506ka.A0R = str;
            }
        }
        textureViewSurfaceTextureListenerC147506ka.A0g = false;
    }
}
