package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.rtc.rsys.camera.IgLiteCameraProxy;

/* loaded from: classes9.dex */
public final class OLL {
    public final /* synthetic */ OW9 A00;

    public final void A01(CameraAREffect cameraAREffect, Boolean bool, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, boolean z, boolean z2) {
        C14360o3.A0B(interfaceC16820sZ2, 6);
        OW9 ow9 = this.A00;
        D8O d8o = new D8O(22, cameraAREffect, ow9, false);
        C57536PgA c57536PgA = new C57536PgA(20, interfaceC16820sZ2, ow9);
        C57413PeB c57413PeB = C57413PeB.A00;
        C14360o3.A0B(c57413PeB, 5);
        C55207OeK c55207OeK = ow9.A0Z;
        C14360o3.A0B(interfaceC16820sZ, 6);
        C55207OeK.A02(c55207OeK, new C25079B8a(cameraAREffect, c55207OeK, bool, str, d8o, c57413PeB, interfaceC16820sZ, c57536PgA, z, z2));
    }

    public OLL(OW9 ow9) {
        this.A00 = ow9;
    }

    public final void A00(long j) {
        C55207OeK.A02(this.A00.A0Z, new JXD(j, 12));
    }

    public final void A02(boolean z, int i) {
        C52000Myq c52000Myq = this.A00.A0Z.A02;
        if (c52000Myq != null && (c52000Myq.A0B.getValue() instanceof IgLiteCameraProxy)) {
            AbstractC52007Mz4 A00 = C52000Myq.A00(c52000Myq);
            C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.rtc.rsys.camera.IgLiteCameraProxy");
            C214129eC A002 = AG0.A00(((IgLiteCameraProxy) A00).A04(), true);
            if (A002 != null) {
                A002.A01 = z;
                A002.A00(811);
                synchronized (A002) {
                    ColorFilter colorFilter = A002.A00;
                    if (colorFilter != null) {
                        colorFilter.A00 = i / 100.0f;
                    }
                }
            }
        }
    }
}
