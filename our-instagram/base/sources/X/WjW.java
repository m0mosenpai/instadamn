package X;

/* loaded from: classes11.dex */
public final class WjW implements InterfaceC71951XCd {
    public final /* synthetic */ V1R A00;

    public WjW(V1R v1r) {
        this.A00 = v1r;
    }

    @Override // X.InterfaceC71951XCd
    public final EnumC68206VFy C4m() {
        C68034V7f c68034V7f = this.A00.A08;
        if (c68034V7f == null) {
            C14360o3.A0F("dataSource");
            throw C00O.createAndThrow();
        }
        EnumC68206VFy enumC68206VFy = c68034V7f.A00;
        C14360o3.A07(enumC68206VFy);
        return enumC68206VFy;
    }

    @Override // X.InterfaceC71951XCd
    public final int C4p() {
        C68034V7f c68034V7f = this.A00.A08;
        if (c68034V7f == null) {
            C14360o3.A0F("dataSource");
            throw C00O.createAndThrow();
        }
        return c68034V7f.A05();
    }
}
