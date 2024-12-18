package X;

/* loaded from: classes10.dex */
public final class T93 implements InterfaceC65278ThB {
    public static final EnumC61068Rei A01 = EnumC61068Rei.A00;
    public final C60797RTi A00;

    public T93(C60797RTi key) {
        if (A01.A00()) {
            this.A00 = key;
            return;
        }
        throw AbstractC58318PtA.A0x("Can not use AES-CMAC in FIPS-mode.");
    }
}
