package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GCC implements C5OV {
    public final int A00;
    public final C47382Fl A01;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        int i;
        Integer A01 = this.A01.A01();
        C14360o3.A07(A01);
        switch (A01.intValue()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        return AbstractC167007dF.A1P(i, this.A00);
    }

    public GCC(UserSession userSession, int i) {
        this.A00 = i;
        C47382Fl A00 = C47382Fl.A00(userSession);
        C14360o3.A07(A00);
        this.A01 = A00;
    }
}
