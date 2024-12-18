package X;

import com.facebook.fixie.fixes.acodec.ACodecFixer$NativeImpl;

/* renamed from: X.1T8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1T8 extends C0R8 {
    @Override // X.InterfaceC05710Rv
    public final String getName() {
        return "ACodecFixer";
    }

    @Override // X.InterfaceC05710Rv
    public final void CNZ() {
        A05(C10420hA.class).getClass();
        if (C20150ym.A07(AbstractC20100yh.A00(36314103111682506L))) {
            C0K8.A0D("Fixie/ACodecFixer", "Enable ACodec Hooks");
            ACodecFixer$NativeImpl.install(C20150ym.A07(AbstractC20100yh.A00(36314103111682506L)));
        }
    }
}
