package X;

import com.facebook.video.cache.igdatasource.IgHttpDataSource;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2Ac, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46182Ac extends C2Ai {
    public AbstractC12990ll A00;
    public final HeroPlayerSetting A01;
    public final AtomicReference A02;
    public final AtomicReference A03;

    public C46182Ac(HeroPlayerSetting heroPlayerSetting, AtomicReference atomicReference, AtomicReference atomicReference2) {
        C14360o3.A0B(heroPlayerSetting, 1);
        C14360o3.A0B(atomicReference, 2);
        C14360o3.A0B(atomicReference2, 3);
        this.A01 = heroPlayerSetting;
        this.A02 = atomicReference;
        this.A03 = atomicReference2;
    }

    @Override // X.C2Ai
    public final String A01() {
        return "IgHttpDataSourceFactory";
    }

    @Override // X.C2Ai
    public final InterfaceC92344Bp A00(C92304Bk c92304Bk, InterfaceC92334Bn interfaceC92334Bn, C2BC c2bc, String str, int i, int i2) {
        return new IgHttpDataSource(c2bc, i2, this.A01, this.A02, c92304Bk, this.A03, this.A00);
    }
}
