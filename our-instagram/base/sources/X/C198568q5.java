package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluConfigHolder;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.TextureLoaderWeakPtr;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.IgTextureLoader;

/* renamed from: X.8q5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198568q5 implements InterfaceC198588q7 {
    public InterfaceC198588q7 A00;
    public boolean A01;

    @Override // X.InterfaceC198588q7
    public final void attach(IgluConfigHolder igluConfigHolder) {
        InterfaceC198588q7 interfaceC198588q7;
        InterfaceC198588q7 interfaceC198588q72 = this.A00;
        if (interfaceC198588q72 == null) {
            interfaceC198588q72 = new IgTextureLoader();
            this.A00 = interfaceC198588q72;
        }
        interfaceC198588q72.attach(igluConfigHolder);
        if (this.A01 && (interfaceC198588q7 = this.A00) != null && (interfaceC198588q7 instanceof IgTextureLoader)) {
            ((IgTextureLoader) interfaceC198588q7).tryGPULoading();
        }
    }

    @Override // X.InterfaceC198588q7
    public final void detach() {
        InterfaceC198588q7 interfaceC198588q7 = this.A00;
        if (interfaceC198588q7 == null) {
            interfaceC198588q7 = new IgTextureLoader();
            this.A00 = interfaceC198588q7;
        }
        interfaceC198588q7.detach();
        this.A00 = null;
    }

    @Override // X.InterfaceC198588q7
    public final TextureLoaderWeakPtr getTextureLoaderWeakPtr() {
        InterfaceC198588q7 interfaceC198588q7 = this.A00;
        if (interfaceC198588q7 == null) {
            interfaceC198588q7 = new IgTextureLoader();
            this.A00 = interfaceC198588q7;
        }
        TextureLoaderWeakPtr textureLoaderWeakPtr = interfaceC198588q7.getTextureLoaderWeakPtr();
        C14360o3.A07(textureLoaderWeakPtr);
        return textureLoaderWeakPtr;
    }
}
