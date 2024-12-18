package X;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.8sF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199638sF implements InterfaceC199648sG {
    public CameraAREffect A00;
    public final C200558ty A01;
    public final C199628sE A02;

    @Override // X.InterfaceC199648sG
    public final synchronized void EP4(CameraAREffect cameraAREffect) {
        InterfaceC199428rj interfaceC199428rj;
        this.A00 = cameraAREffect;
        C200558ty c200558ty = this.A01;
        if (c200558ty != null) {
            c200558ty.A0D(cameraAREffect);
        }
        C199628sE c199628sE = this.A02;
        boolean z = false;
        if (cameraAREffect != null) {
            z = true;
        }
        C178577wV c178577wV = c199628sE.A00;
        if (c178577wV != null && c178577wV.A08() && (interfaceC199428rj = (InterfaceC199428rj) c178577wV.A02(InterfaceC199428rj.A00)) != null) {
            ((C199418ri) interfaceC199428rj).A00.A00 = Boolean.valueOf(z);
        }
    }

    @Override // X.InterfaceC199648sG
    public final void A9d(C83L c83l) {
        C200558ty c200558ty = this.A01;
        if (c200558ty != null) {
            c200558ty.A0G.add(c83l);
        }
    }

    @Override // X.InterfaceC199648sG
    public final EffectAttribution B0P() {
        AnonymousClass818 anonymousClass818;
        C200558ty c200558ty = this.A01;
        if (c200558ty == null || (anonymousClass818 = c200558ty.A01) == null || anonymousClass818.A0D() == null) {
            return null;
        }
        return c200558ty.A01.A0D().mAttribution;
    }

    @Override // X.InterfaceC199648sG
    public final void E3e() {
        InterfaceC199698sL interfaceC199698sL;
        C200558ty c200558ty = this.A01;
        if (c200558ty != null && (interfaceC199698sL = c200558ty.A03) != null) {
            interfaceC199698sL.pause();
        }
    }

    @Override // X.InterfaceC199648sG
    public final void EFw(C83L c83l) {
        C200558ty c200558ty = this.A01;
        if (c200558ty != null) {
            c200558ty.A0G.remove(c83l);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.7xa, java.lang.Object] */
    @Override // X.InterfaceC199648sG
    public final void EJb() {
        InterfaceC199698sL interfaceC199698sL;
        C200558ty c200558ty = this.A01;
        if (c200558ty != null && (interfaceC199698sL = c200558ty.A03) != 0) {
            ?? obj = new Object();
            AnonymousClass818 anonymousClass818 = c200558ty.A01;
            if (anonymousClass818 != null) {
                interfaceC199698sL.EOG(obj, anonymousClass818);
            } else {
                interfaceC199698sL.EOF(obj);
            }
        }
    }

    @Override // X.InterfaceC199648sG
    public final void EKi() {
        C200558ty c200558ty = this.A01;
        if (c200558ty != null) {
            c200558ty.A0B();
        }
    }

    public C199638sF(C200558ty c200558ty, C199628sE c199628sE) {
        this.A01 = c200558ty;
        this.A02 = c199628sE;
    }
}
