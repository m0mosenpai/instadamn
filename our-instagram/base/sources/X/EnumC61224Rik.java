package X;

/* renamed from: X.Rik, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC61224Rik implements InterfaceC65497TlL {
    ServiceName(0),
    ClientCoreName(1),
    NotificationStoreName(2),
    Country(3),
    NetworkType(4),
    NetworkSubtype(5),
    ConnectionQuality(6),
    AppState(7),
    ScreenState(8),
    YearClass(9),
    MqttGKs(10),
    MqttQEs(11),
    MqttFlags(12),
    IsEmployee(13),
    ValidCompatibleApps(14),
    EnabledCompatibleApps(15),
    RegisteredApps(16);

    public final Class A00 = String.class;
    public final String A01;

    EnumC61224Rik(int i) {
        this.A01 = r3;
    }

    @Override // X.InterfaceC65497TlL
    public final String BKd() {
        return this.A01;
    }

    @Override // X.InterfaceC65497TlL
    public final Class CEb() {
        return this.A00;
    }
}
