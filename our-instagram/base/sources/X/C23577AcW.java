package X;

import android.graphics.SurfaceTexture;
import android.view.WindowManager;

/* renamed from: X.AcW, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23577AcW implements YOj {
    public SurfaceTexture A00;
    public int A01;
    public int A02;
    public final WindowManager A04;
    public final Object A03 = new Object();
    public final AWZ A05 = new AWZ(new C211489Wx(), EnumC197748ol.DISABLE, C197578oU.A01, EnumC197888oz.A02, this);

    @Override // X.YOj
    public final void onCameraClosed() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.7oL, java.lang.Object] */
    @Override // X.YOk
    public final C173687oL BHz() {
        Integer num;
        if (this.A01 == 1) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        ?? obj = new Object();
        obj.A00 = num;
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.7oM, java.lang.Object] */
    @Override // X.YOk
    public final C173697oM BI4() {
        int rotation = this.A04.getDefaultDisplay().getRotation();
        int i = this.A02;
        ?? obj = new Object();
        obj.A00 = rotation;
        obj.A01 = i;
        return obj;
    }

    @Override // X.YOj
    public final SurfaceTexture BI7() {
        SurfaceTexture surfaceTexture;
        Object obj = this.A03;
        synchronized (obj) {
            if (this.A00 == null) {
                try {
                    obj.wait(2000L);
                } catch (InterruptedException e) {
                    C0K8.A0F("IgCameraVideoInputV1", "Wait for SurfaceTexture was interrupted", e);
                }
                if (this.A00 == null) {
                    C0w9.A02(EnumC12410kj.A07, "IgCameraVideoInputV1", "MP: Failed SurfaceTexture creation for camera preview", AbstractC166987dD.A14("Failed SurfaceTexture creation for camera preview"));
                }
            }
            surfaceTexture = this.A00;
        }
        return surfaceTexture;
    }

    @Override // X.YOj
    public final InterfaceC199678sJ CFC() {
        return this.A05;
    }

    @Override // X.YOj
    public final void EQt(int i, int i2) {
        AWZ awz = this.A05;
        awz.A0G = new C197738ok(i2, i, i, i2, 0, 0);
        AnonymousClass810 anonymousClass810 = awz.A03;
        if (anonymousClass810 != null) {
            anonymousClass810.A00(awz.A0G.A02, awz.A0G.A01);
        }
    }

    public C23577AcW(WindowManager windowManager) {
        this.A04 = windowManager;
    }

    @Override // X.YOj
    public final void EQq(int i) {
        this.A01 = i;
    }

    @Override // X.YOj
    public final void Edg(int i) {
        this.A02 = i;
    }
}
