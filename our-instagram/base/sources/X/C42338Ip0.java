package X;

/* renamed from: X.Ip0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42338Ip0 implements InterfaceC66482zP, InterfaceC43426JGq {
    public final C51758Mth A00;
    public final C40986IDh A01;

    @Override // X.InterfaceC43426JGq
    public final C51758Mth BmN() {
        return this.A00;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "upcoming-event-reminder-cta";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C51758Mth c51758Mth;
        C42338Ip0 c42338Ip0 = (C42338Ip0) obj;
        C51758Mth c51758Mth2 = this.A00;
        if (c42338Ip0 != null) {
            c51758Mth = c42338Ip0.A00;
        } else {
            c51758Mth = null;
        }
        return C14360o3.A0K(c51758Mth2, c51758Mth);
    }

    public C42338Ip0(C51758Mth c51758Mth, C40986IDh c40986IDh) {
        this.A00 = c51758Mth;
        this.A01 = c40986IDh;
    }
}
