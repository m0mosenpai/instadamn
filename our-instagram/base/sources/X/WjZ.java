package X;

/* loaded from: classes11.dex */
public final class WjZ implements InterfaceC71918XAc {
    public final /* synthetic */ V1R A00;

    public WjZ(V1R v1r) {
        this.A00 = v1r;
    }

    @Override // X.InterfaceC71918XAc
    public final void Drm(EnumC68206VFy enumC68206VFy) {
        C68034V7f c68034V7f = this.A00.A08;
        if (c68034V7f == null) {
            C14360o3.A0F("dataSource");
            throw C00O.createAndThrow();
        }
        c68034V7f.A08(enumC68206VFy, true);
    }
}
