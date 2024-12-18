package X;

/* renamed from: X.Ip1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42339Ip1 implements InterfaceC66482zP, InterfaceC43426JGq {
    public final C51758Mth A00;
    public final C38687GzS A01;
    public final C40984IDf A02;

    @Override // X.InterfaceC43426JGq
    public final C51758Mth BmN() {
        return this.A00;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "upcoming-event-dual-cta";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C51758Mth c51758Mth;
        C42339Ip1 c42339Ip1 = (C42339Ip1) obj;
        C51758Mth c51758Mth2 = this.A00;
        if (c42339Ip1 != null) {
            c51758Mth = c42339Ip1.A00;
        } else {
            c51758Mth = null;
        }
        return C14360o3.A0K(c51758Mth2, c51758Mth);
    }

    public C42339Ip1(C51758Mth c51758Mth, C38687GzS c38687GzS, C40984IDf c40984IDf) {
        this.A00 = c51758Mth;
        this.A01 = c38687GzS;
        this.A02 = c40984IDf;
    }
}
