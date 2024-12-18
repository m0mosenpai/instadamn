package X;

import android.graphics.SurfaceTexture;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.rsys.avatarcommunication.gen.AvatarCommunicationApi;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.rtc.rsys.camera.IgLiteCameraProxy;
import org.webrtc.SurfaceTextureHelper;

/* renamed from: X.B8a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C25079B8a extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ CameraAREffect A00;
    public final /* synthetic */ C55207OeK A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16820sZ A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25079B8a(CameraAREffect cameraAREffect, C55207OeK c55207OeK, Boolean bool, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, boolean z, boolean z2) {
        super(1);
        this.A02 = bool;
        this.A01 = c55207OeK;
        this.A00 = cameraAREffect;
        this.A03 = str;
        this.A08 = z;
        this.A07 = interfaceC16820sZ;
        this.A06 = interfaceC16820sZ2;
        this.A04 = interfaceC16820sZ3;
        this.A05 = interfaceC16820sZ4;
        this.A09 = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, X.8zj] */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        IgLiteCameraProxy igLiteCameraProxy;
        C203708zZ c203708zZ;
        String str;
        ARRequestAsset aRRequestAsset;
        boolean z;
        C52000Myq c52000Myq = (C52000Myq) obj;
        C14360o3.A0B(c52000Myq, 0);
        AbstractC52007Mz4 abstractC52007Mz4 = (AbstractC52007Mz4) c52000Myq.A0B.getValue();
        if ((abstractC52007Mz4 instanceof IgLiteCameraProxy) && (igLiteCameraProxy = (IgLiteCameraProxy) abstractC52007Mz4) != null) {
            Boolean bool = this.A02;
            C55207OeK c55207OeK = this.A01;
            CameraAREffect cameraAREffect = this.A00;
            String str2 = this.A03;
            boolean z2 = this.A08;
            InterfaceC16820sZ interfaceC16820sZ = this.A07;
            InterfaceC16820sZ interfaceC16820sZ2 = this.A06;
            InterfaceC16820sZ interfaceC16820sZ3 = this.A04;
            InterfaceC16820sZ interfaceC16820sZ4 = this.A05;
            boolean z3 = this.A09;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                SurfaceTextureHelper surfaceTextureHelper = igLiteCameraProxy.A09;
                if (surfaceTextureHelper != null) {
                    InterfaceC179897yf interfaceC179897yf = B2P.A00(igLiteCameraProxy).A02;
                    SurfaceTexture surfaceTexture = surfaceTextureHelper.surfaceTexture;
                    boolean z4 = !booleanValue;
                    C14360o3.A0B(surfaceTexture, 0);
                    C176507t8 c176507t8 = (C176507t8) ((C179887ye) interfaceC179897yf).A04.get(surfaceTexture);
                    if (c176507t8 != null) {
                        c176507t8.A0E = z4;
                    }
                }
            }
            AG0 ag0 = c55207OeK.A0L;
            InterfaceC178067vf Aq0 = igLiteCameraProxy.A04().A00.Aq0(BEQ.A01);
            C14360o3.A07(Aq0);
            BEQ beq = (BEQ) Aq0;
            String str3 = null;
            if (cameraAREffect != null && cameraAREffect.A0H()) {
                c203708zZ = new C203708zZ(new AV7(interfaceC16820sZ3, interfaceC16820sZ4), cameraAREffect.A0D);
            } else {
                c203708zZ = null;
            }
            ?? obj2 = new Object();
            obj2.A00 = c203708zZ;
            obj2.A03 = z2;
            obj2.A02 = false;
            obj2.A01 = false;
            C1819085a c1819085a = new C1819085a();
            c1819085a.A05 = ag0.A00;
            c1819085a.A03 = "instagram_vc";
            if (cameraAREffect != null) {
                str = cameraAREffect.A0Q;
            } else {
                str = null;
            }
            c1819085a.A04 = str;
            if (str2 != null) {
                c1819085a.A01 = str2;
            }
            C1819185b A00 = c1819085a.A00();
            if (cameraAREffect != null) {
                str3 = cameraAREffect.A0K;
                aRRequestAsset = AbstractC202058wk.A00(cameraAREffect, z3);
            } else {
                aRRequestAsset = null;
            }
            beq.ETc(aRRequestAsset, obj2, new C23322AVh(interfaceC16820sZ, interfaceC16820sZ2), A00, str3);
            C51998Myn c51998Myn = c52000Myq.A02;
            if (cameraAREffect != null) {
                z = cameraAREffect.A0M();
            } else {
                z = false;
            }
            AvatarCommunicationApi avatarCommunicationApi = c51998Myn.A00;
            if (avatarCommunicationApi != null) {
                avatarCommunicationApi.sendUsingAvatars(z);
            }
        }
        return C0eB.A00;
    }
}
