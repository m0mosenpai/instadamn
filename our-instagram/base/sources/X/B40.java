package X;

import com.instagram.creation.cameraconfiguration.CameraConfiguration;

/* loaded from: classes4.dex */
public final /* synthetic */ class B40 implements InterfaceC14180ni, AnonymousClass822 {
    public final /* synthetic */ C8HB A00;

    public B40(C8HB c8hb) {
        this.A00 = c8hb;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(1, this.A00, C8HB.class, "onCameraConfigurationChanged", "onCameraConfigurationChanged(Lcom/instagram/creation/cameraconfiguration/CameraConfiguration;)V", 0);
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
        int i;
        CameraConfiguration cameraConfiguration = (CameraConfiguration) obj;
        C14360o3.A0B(cameraConfiguration, 0);
        C8HB c8hb = this.A00;
        C55U c55u = cameraConfiguration.A03;
        C81R c81r = C81R.A00;
        if (c55u == c81r) {
            i = 20;
        } else {
            if (c8hb.A00 == c81r) {
                c8hb.A08.A0B();
                i = 21;
            }
            c8hb.A00 = c55u;
        }
        C8HB.A00(c8hb, new C57519Pft(c8hb, i));
        c8hb.A00 = c55u;
    }
}
