package X;

import android.util.Pair;
import com.facebook.cameracore.audio.fbaaudiopostprocessing.AudioPostProcessorCallback;
import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
public final class WUJ implements AudioPostProcessorCallback {
    public int A00;
    public ByteBuffer A01;
    public final /* synthetic */ C69267Vkb A02;

    public WUJ(C69267Vkb c69267Vkb) {
        this.A02 = c69267Vkb;
    }

    @Override // com.facebook.cameracore.audio.fbaaudiopostprocessing.AudioPostProcessorCallback
    public final Object requestOutputBuffer() {
        InterfaceC71947XBy interfaceC71947XBy = this.A02.A00;
        if (interfaceC71947XBy != null) {
            Pair EJD = interfaceC71947XBy.EJD();
            ByteBuffer byteBuffer = (ByteBuffer) EJD.first;
            this.A01 = byteBuffer;
            this.A00 = ((Number) EJD.second).intValue();
            return byteBuffer;
        }
        return null;
    }

    @Override // com.facebook.cameracore.audio.fbaaudiopostprocessing.AudioPostProcessorCallback
    public final void returnOutputBuffer() {
        C69267Vkb c69267Vkb = this.A02;
        InterfaceC71947XBy interfaceC71947XBy = c69267Vkb.A00;
        if (interfaceC71947XBy != null) {
            interfaceC71947XBy.DX8(this.A01, this.A00, c69267Vkb.A02);
            this.A01 = null;
        }
    }
}
