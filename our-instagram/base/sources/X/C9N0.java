package X;

import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;

/* renamed from: X.9N0, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9N0 implements InterfaceC16820sZ {
    public final /* synthetic */ C8LZ A00;

    public C9N0(C8LZ c8lz) {
        this.A00 = c8lz;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        MultiListenerTextureView multiListenerTextureView = this.A00.A0E.A0D;
        if (multiListenerTextureView != null) {
            return multiListenerTextureView.getBitmap(36, 64);
        }
        return null;
    }
}
