package X;

import com.instagram.creation.cameraconfiguration.CameraConfiguration;

/* renamed from: X.B3z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C25003B3z implements InterfaceC14180ni, AnonymousClass822 {
    public final /* synthetic */ C8HD A00;

    public C25003B3z(C8HD c8hd) {
        this.A00 = c8hd;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(1, this.A00, C8HD.class, "onCameraConfigurationChanged", "onCameraConfigurationChanged(Lcom/instagram/creation/cameraconfiguration/CameraConfiguration;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass822) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return AbstractC167007dF.A1Y(obj, getFunctionDelegate());
    }

    @Override // X.AnonymousClass822
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        CameraConfiguration cameraConfiguration = (CameraConfiguration) obj;
        C14360o3.A0B(cameraConfiguration, 0);
        C14360o3.A0K(cameraConfiguration.A03, C81Q.A00);
    }
}
