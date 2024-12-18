package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", i = {}, l = {CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL, 30}, m = "emit", n = {}, s = {})
/* renamed from: X.105, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass105 extends C1Dq {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ C14910p5 A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass105(InterfaceC23621Ds interfaceC23621Ds, C14910p5 c14910p5) {
        super(interfaceC23621Ds);
        this.A02 = c14910p5;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A01 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A02.emit(null, this);
    }
}
