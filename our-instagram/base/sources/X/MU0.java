package X;

/* loaded from: classes9.dex */
public enum MU0 implements InterfaceC02530Ab {
    VIEW("view"),
    UNAVAILABLE("unavailable"),
    ONE_TIME_ON("one_time_on"),
    ONE_TIME_OFF("one_time_off"),
    AUTO_ON("auto_on"),
    AUTO_OFF("auto_off"),
    SHARE_CLICK("share_click");

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    MU0(String str) {
        this.A00 = str;
    }
}
