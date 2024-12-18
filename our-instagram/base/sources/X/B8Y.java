package X;

import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.camera.effect.models.CameraAREffect;

/* loaded from: classes4.dex */
public final class B8Y extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ C8YY A00;
    public final /* synthetic */ InterfaceC193848i5 A01;
    public final /* synthetic */ C183978Ee A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B8Y(C8YY c8yy, InterfaceC193848i5 interfaceC193848i5, C183978Ee c183978Ee, boolean z) {
        super(1);
        this.A00 = c8yy;
        this.A01 = interfaceC193848i5;
        this.A02 = c183978Ee;
        this.A03 = z;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        GenAIToolInfoDict genAIToolInfoDict;
        C183978Ee c183978Ee = (C183978Ee) obj;
        C14360o3.A0B(c183978Ee, 0);
        C8YY c8yy = this.A00;
        c8yy.A0X.A00().Cns(c183978Ee);
        InterfaceC193848i5 interfaceC193848i5 = this.A01;
        if (interfaceC193848i5.CWE()) {
            CameraAREffect cameraAREffect = c8yy.A0C.A00().A05.A09;
            if (cameraAREffect != null && cameraAREffect.A0Z.get("galleryPicker") != null) {
                C4T4.A00(c8yy.A0E).Cj1(c8yy.A0O.A00.A01, AnonymousClass249.PHOTO, cameraAREffect.A0K, cameraAREffect.A0M);
                c8yy.A0S.A01(c183978Ee.A07, c183978Ee.A06(), true);
            }
            interfaceC193848i5.EW5(false);
        } else if (interfaceC193848i5.CWF() && (genAIToolInfoDict = c8yy.A0N.A0I) != null && genAIToolInfoDict.A00 != null) {
            c8yy.A0P.A02(c8yy.A0i, this.A02);
        } else {
            c8yy.A0P.A03(c183978Ee, this.A03);
        }
        c8yy.A0L(true);
        return C0eB.A00;
    }
}
