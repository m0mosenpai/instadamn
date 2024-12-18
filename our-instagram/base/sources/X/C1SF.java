package X;

import com.facebook.tigon.TigonXplatService;
import java.nio.ByteBuffer;

/* renamed from: X.1SF, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1SF extends C03E implements InterfaceC16660sJ {
    public C1SF(Object obj) {
        super(1, obj, TigonXplatService.class, "releaseBodyBuffer", "releaseBodyBuffer(Ljava/nio/ByteBuffer;)V", 0);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((TigonXplatService) this.receiver).releaseBodyBuffer((ByteBuffer) obj);
        return C0eB.A00;
    }
}
