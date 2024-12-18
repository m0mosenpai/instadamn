package X;

/* renamed from: X.NjE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC53363NjE implements InterfaceC02530Ab {
    UNKNOWN(0),
    CELLULAR(1),
    WIFI_BAND_2_4GHZ(2),
    WIFI_BAND_5GHZ(3);

    public final long A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.A00);
    }

    EnumC53363NjE(long j) {
        this.A00 = j;
    }
}
