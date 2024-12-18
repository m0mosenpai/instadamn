package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", i = {}, l = {CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL, CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0VU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0VU extends AbstractC23611Dp implements InterfaceC16610sE {
    public int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ InterfaceC16610sE A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0VU(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16610sE interfaceC16610sE) {
        super(3, interfaceC23621Ds);
        this.A03 = interfaceC16610sE;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C0VU c0vu = new C0VU((InterfaceC23621Ds) obj3, this.A03);
        c0vu.A01 = obj;
        c0vu.A02 = obj2;
        return c0vu.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        InterfaceC19960yQ interfaceC19960yQ;
        C1JX c1jx = C1JX.A02;
        int i = this.A00;
        if (i != 0) {
            if (i != 1) {
                AbstractC09560e7.A00(obj);
                return C0eB.A00;
            }
            interfaceC19960yQ = (InterfaceC19960yQ) this.A01;
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            interfaceC19960yQ = (InterfaceC19960yQ) this.A01;
            Object[] objArr = (Object[]) this.A02;
            InterfaceC16610sE interfaceC16610sE = this.A03;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            this.A01 = interfaceC19960yQ;
            this.A00 = 1;
            obj = interfaceC16610sE.invoke(obj2, obj3, this);
            if (obj == c1jx) {
                return c1jx;
            }
        }
        this.A01 = null;
        this.A00 = 2;
        if (interfaceC19960yQ.emit(obj, this) == c1jx) {
            return c1jx;
        }
        return C0eB.A00;
    }
}
