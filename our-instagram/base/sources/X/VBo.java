package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Message;
import com.instagram.xme.threed.view.IgGltfSceneLayoutView;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class VBo extends U9K {
    public static final double A03 = Math.toRadians(30.0d);
    public boolean A00;
    public final W4Y A01;
    public final WeakReference A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VBo(Context context, SurfaceTexture surfaceTexture, TextureViewSurfaceTextureListenerC149336nj textureViewSurfaceTextureListenerC149336nj, W4Y w4y, InterfaceC149306ng interfaceC149306ng, int i, int i2) {
        super(context, surfaceTexture, w4y, textureViewSurfaceTextureListenerC149336nj.A03, interfaceC149306ng, i, i2);
        C14360o3.A0B(context, 1);
        this.A02 = new WeakReference(textureViewSurfaceTextureListenerC149336nj);
        this.A01 = w4y;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(X.VBo r10) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VBo.A00(X.VBo):boolean");
    }

    @Override // X.U9K
    public final void A04() {
        WeakReference weakReference = this.A02;
        TextureViewSurfaceTextureListenerC149336nj textureViewSurfaceTextureListenerC149336nj = (TextureViewSurfaceTextureListenerC149336nj) weakReference.get();
        if (textureViewSurfaceTextureListenerC149336nj != null) {
            InterfaceC141866b4 interfaceC141866b4 = textureViewSurfaceTextureListenerC149336nj.A03.A00;
            if (C05F.A01 == textureViewSurfaceTextureListenerC149336nj.A08 && Math.sqrt(Math.pow(interfaceC141866b4.BdN(), 2.0d) + Math.pow(interfaceC141866b4.BpU(), 2.0d)) > A03 && textureViewSurfaceTextureListenerC149336nj.A06 != null && !textureViewSurfaceTextureListenerC149336nj.A0G) {
                textureViewSurfaceTextureListenerC149336nj.A0G = true;
            }
        }
        if (this.A00) {
            AbstractC09800fd.A01("gltf_scene_gpu_upload", 213291794);
        } else {
            AbstractC09800fd.A01("gltf_scene_cpu_frame_time", -1336067899);
        }
        C180367zQ c180367zQ = this.A03;
        if (c180367zQ != null) {
            c180367zQ.A05();
        }
        super.A04();
        if (this.A00) {
            TextureViewSurfaceTextureListenerC149336nj textureViewSurfaceTextureListenerC149336nj2 = (TextureViewSurfaceTextureListenerC149336nj) weakReference.get();
            if (textureViewSurfaceTextureListenerC149336nj2 != null) {
                Integer num = C05F.A01;
                C149286nd c149286nd = textureViewSurfaceTextureListenerC149336nj2.A06;
                if (c149286nd != null && textureViewSurfaceTextureListenerC149336nj2.A08 != num) {
                    IgGltfSceneLayoutView igGltfSceneLayoutView = c149286nd.A00;
                    igGltfSceneLayoutView.post(new RunnableC57027PRs(igGltfSceneLayoutView, num));
                    textureViewSurfaceTextureListenerC149336nj2.A08 = num;
                }
            }
            this.A00 = false;
            return;
        }
        AbstractC09800fd.A00(-537805061);
    }

    public final void A05(C69253VkM c69253VkM) {
        Handler handler = super.A02;
        if (handler != null) {
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.obj = c69253VkM;
            handler.sendMessage(obtain);
        }
    }

    @Override // X.U9K
    public final void A03() {
        super.A03();
        TextureViewSurfaceTextureListenerC149336nj textureViewSurfaceTextureListenerC149336nj = (TextureViewSurfaceTextureListenerC149336nj) this.A02.get();
        if (textureViewSurfaceTextureListenerC149336nj != null && textureViewSurfaceTextureListenerC149336nj.A0D && this.A03 != null) {
            A00(this);
        }
    }
}
