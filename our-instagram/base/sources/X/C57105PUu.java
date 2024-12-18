package X;

import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.PUu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C57105PUu implements InterfaceC14180ni, C83N {
    public final /* synthetic */ C56049OuO A00;

    public C57105PUu(C56049OuO c56049OuO) {
        this.A00 = c56049OuO;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(2, this.A00, C56049OuO.class, "onEffectSetStarted", "onEffectSetStarted(Lcom/instagram/camera/effect/models/CameraAREffect;Lcom/instagram/camera/effect/models/CameraAREffect;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.C83N
    public final void DD7(CameraAREffect cameraAREffect, CameraAREffect cameraAREffect2) {
        String str;
        C51044Mgw A00 = C56049OuO.A00(this.A00);
        if (cameraAREffect != null) {
            str = cameraAREffect.A0K;
        } else {
            str = null;
        }
        A00.A00.A06.Egh(str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C83N) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return AbstractC167007dF.A1Y(obj, getFunctionDelegate());
    }
}
