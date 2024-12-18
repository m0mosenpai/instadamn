package X;

/* renamed from: X.Hia, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC39645Hia implements InterfaceC02530Ab {
    BASIC_ADS_TIER_NONE(0),
    BASIC_ADS_TIER_A(1),
    BASIC_ADS_TIER_B(2),
    BASIC_ADS_TIER_C(3),
    BASIC_ADS_TIER_0(4),
    BASIC_ADS_TIER_YOUTH(5),
    BASIC_ADS_TIER_C_TEST(6),
    BASIC_ADS_TIER_SHARED(7),
    BASIC_ADS_TIER_P(8);

    public final long A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.A00);
    }

    EnumC39645Hia(long j) {
        this.A00 = j;
    }
}
