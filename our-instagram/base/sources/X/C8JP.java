package X;

import com.instagram.creation.cameraconfiguration.CameraConfiguration;

/* renamed from: X.8JP, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C8JP implements InterfaceC14180ni, AnonymousClass822 {
    public final /* synthetic */ C8JI A00;

    public C8JP(C8JI c8ji) {
        this.A00 = c8ji;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof AnonymousClass822) && (obj instanceof InterfaceC14180ni)) {
            return C14360o3.A0K(getFunctionDelegate(), ((InterfaceC14180ni) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(1, this.A00, C8JI.class, "onCameraConfigurationChanged", "onCameraConfigurationChanged(Lcom/instagram/creation/cameraconfiguration/CameraConfiguration;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.AnonymousClass822
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C8JL c8jl;
        CameraConfiguration cameraConfiguration = (CameraConfiguration) obj;
        C14360o3.A0B(cameraConfiguration, 0);
        C8JI c8ji = this.A00;
        InterfaceC25209BDh interfaceC25209BDh = c8ji.A01;
        if (interfaceC25209BDh != null) {
            c8jl = interfaceC25209BDh.BNn();
        } else {
            c8jl = null;
        }
        if (c8jl instanceof C8JN) {
            boolean z = c8ji.A05;
            C55U c55u = cameraConfiguration.A03;
            C1811981v c1811981v = c8ji.A0A.A09;
            if (z != AbstractC190348bs.A00(c55u, (java.util.Set) c1811981v.A00)) {
                c8ji.A05 = AbstractC190348bs.A00(c55u, (java.util.Set) c1811981v.A00);
                C8JI.A02(c55u, c8ji);
            }
        }
    }
}
