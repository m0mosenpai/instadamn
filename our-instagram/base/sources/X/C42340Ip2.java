package X;

/* renamed from: X.Ip2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42340Ip2 implements InterfaceC66482zP, InterfaceC43426JGq {
    public final C51758Mth A00;
    public final C40985IDg A01;
    public final boolean A02;

    @Override // X.InterfaceC43426JGq
    public final C51758Mth BmN() {
        return this.A00;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "upcoming-event-reminder-button";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C51758Mth c51758Mth;
        C42340Ip2 c42340Ip2 = (C42340Ip2) obj;
        C51758Mth c51758Mth2 = this.A00;
        if (c42340Ip2 != null) {
            c51758Mth = c42340Ip2.A00;
        } else {
            c51758Mth = null;
        }
        return C14360o3.A0K(c51758Mth2, c51758Mth);
    }

    public C42340Ip2(C51758Mth c51758Mth, C40985IDg c40985IDg, boolean z) {
        this.A00 = c51758Mth;
        this.A02 = z;
        this.A01 = c40985IDg;
    }
}
