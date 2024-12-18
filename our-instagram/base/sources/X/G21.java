package X;

import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes6.dex */
public final class G21 implements GXS {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ EnumC33420Epr A02;
    public final /* synthetic */ FRX A03;
    public final /* synthetic */ DirectThreadKey A04;

    public G21(EnumC33420Epr enumC33420Epr, FRX frx, DirectThreadKey directThreadKey, int i, int i2) {
        this.A03 = frx;
        this.A02 = enumC33420Epr;
        this.A04 = directThreadKey;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.GXS
    public final void DWJ() {
        this.A03.A02(EnumC33364Eox.A05, this.A02, this.A04, this.A01, this.A00);
    }
}
