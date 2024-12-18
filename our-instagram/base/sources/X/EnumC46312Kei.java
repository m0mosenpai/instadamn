package X;

/* renamed from: X.Kei, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC46312Kei implements InterfaceC65443TkF {
    DEVICE_ADMIN_MESSAGE_TYPE_NONE(0),
    DEVICE_ADMIN_MESSAGE_TYPE_LOCAL_USER_CHANGED_IDENTITY_KEY_NAMED_DEVICE(1),
    DEVICE_ADMIN_MESSAGE_TYPE_SECURITY_ALERT_PARTICIPANT_KEY_CHANGE(2),
    DEVICE_ADMIN_MESSAGE_TYPE_SECURITY_ALERT_PARTICIPANT_NEW_LOGIN(3);

    public final int A00;

    @Override // X.InterfaceC65443TkF
    public final int BY9() {
        return this.A00;
    }

    EnumC46312Kei(int i) {
        this.A00 = i;
    }
}
