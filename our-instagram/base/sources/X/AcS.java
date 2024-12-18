package X;

import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AcS implements InterfaceC203668zV {
    public final /* synthetic */ C200558ty A00;

    public AcS(C200558ty c200558ty) {
        this.A00 = c200558ty;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.7xa, java.lang.Object, X.7vF] */
    /* JADX WARN: Type inference failed for: r20v1, types: [X.6pt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.lang.Object, X.6pr] */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.Object, X.6pv] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.Object, X.6pp] */
    @Override // X.InterfaceC203668zV
    public final void DCy(C203678zW c203678zW, RkH rkH, CameraAREffect cameraAREffect) {
        C8zr c8zr;
        synchronized (C200558ty.class) {
            C200558ty c200558ty = this.A00;
            if (cameraAREffect != c200558ty.A0M) {
                AnonymousClass830 anonymousClass830 = c200558ty.A02;
                if (anonymousClass830 != null && cameraAREffect != null) {
                    anonymousClass830.FDQ(cameraAREffect.A0K, "stale_request");
                }
                return;
            }
            if (rkH != null) {
                AbstractC12120kG.A07(C200558ty.__redex_internal_original_name, "Unable to set effect", rkH);
                AnonymousClass830 anonymousClass8302 = c200558ty.A02;
                if (anonymousClass8302 != null && cameraAREffect != null) {
                    anonymousClass8302.AVn(rkH, cameraAREffect.A0K);
                }
            } else {
                AnonymousClass830 anonymousClass8303 = c200558ty.A02;
                if (anonymousClass8303 != null && cameraAREffect != null) {
                    anonymousClass8303.Cn1(cameraAREffect.A0K);
                }
            }
            ?? obj = new Object();
            ?? obj2 = new Object();
            InterfaceC149836oc interfaceC149836oc = c200558ty.A0B;
            UserSession userSession = c200558ty.A0E;
            C83W c83w = c200558ty.A09;
            C83Y c83y = c200558ty.A0A;
            Integer num = c200558ty.A0F;
            Integer num2 = C05F.A01;
            EnumC150616qF enumC150616qF = EnumC150616qF.USER_INTERACTION;
            boolean CUZ = new C178317w5(userSession).CUZ(71);
            if (cameraAREffect != null) {
                c8zr = new C8zr(new Object(), obj, new Object(), obj2, cameraAREffect.A0K);
            } else {
                c8zr = null;
            }
            C177797vD AMy = interfaceC149836oc.AMy(c203678zW, null, c200558ty.A07, c200558ty.A0C, c200558ty.A08, enumC150616qF, null, null, c83w, c83y, c8zr, null, c200558ty, cameraAREffect, userSession, num, num2, null, "instagram_post_capture", CUZ);
            synchronized (c200558ty) {
                AnonymousClass818 anonymousClass818 = c200558ty.A01;
                InterfaceC199698sL interfaceC199698sL = c200558ty.A03;
                if (interfaceC199698sL != 0 && AMy != null && anonymousClass818 != null) {
                    AnonymousClass830 anonymousClass8304 = c200558ty.A02;
                    if (anonymousClass8304 != null && cameraAREffect != null) {
                        anonymousClass8304.Cn3(cameraAREffect.A0K, false);
                    }
                    if (interfaceC199698sL.isConnected()) {
                        interfaceC199698sL.EOG(AMy, anonymousClass818);
                        Integer num3 = C05F.A0C;
                        ?? obj3 = new Object();
                        obj3.A00 = num3;
                        interfaceC199698sL.EOF(obj3);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC203668zV
    public final void DgL(C1819185b c1819185b, String str) {
        AnonymousClass830 anonymousClass830 = this.A00.A02;
        if (anonymousClass830 != null) {
            anonymousClass830.Cn2(str, c1819185b.A00, c1819185b.A01);
        }
    }
}
