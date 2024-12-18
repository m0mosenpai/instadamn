package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LK9 {
    public final UserSession A00;
    public final Integer A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    public LK9(UserSession userSession, Integer num) {
        C14360o3.A0B(num, 2);
        this.A00 = userSession;
        this.A01 = num;
        this.A02 = AbstractC09440dt.A01(C50243MGy.A00);
        this.A03 = AbstractC09440dt.A01(new C50152MDf(this, 35));
        this.A04 = AbstractC09440dt.A01(new C50152MDf(this, 34));
    }

    public final void A04(CPB cpb) {
        C14360o3.A0B(cpb, 0);
        C006802i A02 = A02(this);
        InterfaceC09390do interfaceC09390do = this.A03;
        int A01 = AbstractC167027dH.A01(interfaceC09390do);
        InterfaceC09390do interfaceC09390do2 = this.A02;
        A02.markerAnnotate(A01, AbstractC167027dH.A01(interfaceC09390do2), "error", cpb.A00);
        A02(this).markerEnd(AbstractC167027dH.A01(interfaceC09390do), AbstractC167027dH.A01(interfaceC09390do2), (short) 3);
    }

    public final void A05(String str) {
        C14360o3.A0B(str, 0);
        C006802i A02 = A02(this);
        InterfaceC09390do interfaceC09390do = this.A03;
        int A01 = AbstractC167027dH.A01(interfaceC09390do);
        InterfaceC09390do interfaceC09390do2 = this.A02;
        A02.markerPoint(A01, AbstractC167027dH.A01(interfaceC09390do2), "image_request_failure");
        A02(this).markerAnnotate(AbstractC167027dH.A01(interfaceC09390do), AbstractC167027dH.A01(interfaceC09390do2), "image_request_error", str);
    }

    public static final int A00(LK9 lk9) {
        return AbstractC167027dH.A01(lk9.A02);
    }

    public static final int A01(LK9 lk9) {
        return AbstractC167027dH.A01(lk9.A03);
    }

    public static final C006802i A02(LK9 lk9) {
        return (C006802i) AbstractC166987dD.A17(lk9.A04);
    }

    public final void A03(int i, String str) {
        String str2;
        C006802i A02 = A02(this);
        InterfaceC09390do interfaceC09390do = this.A03;
        int A01 = AbstractC167027dH.A01(interfaceC09390do);
        InterfaceC09390do interfaceC09390do2 = this.A02;
        A02.markerPoint(A01, AbstractC167027dH.A01(interfaceC09390do2), AnonymousClass001.A0O("image_download_failure_", i));
        C006802i A022 = A02(this);
        int A012 = AbstractC167027dH.A01(interfaceC09390do);
        int A013 = AbstractC167027dH.A01(interfaceC09390do2);
        String A0O = AnonymousClass001.A0O("image_download_error_", i);
        if (str != null) {
            str2 = C00Q.A03(str, 200);
        } else {
            str2 = "";
        }
        A022.markerAnnotate(A012, A013, A0O, str2);
    }
}
