package X;

/* loaded from: classes10.dex */
public final class T94 implements InterfaceC65278ThB {
    public static final EnumC61068Rei A01 = EnumC61068Rei.A01;
    public final C60798RTj A00;

    public T94(C60798RTj key) {
        if (A01.A00()) {
            this.A00 = key;
            return;
        }
        throw AbstractC58318PtA.A0x("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
