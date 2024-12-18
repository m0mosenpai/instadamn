package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2Er, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47252Er implements InterfaceC13000lm {
    public boolean A00;
    public boolean A01;
    public final C006802i A02;
    public final UserSession A03;

    public C47252Er(C006802i c006802i, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A02 = c006802i;
    }

    public final void A00(String str) {
        String str2;
        if (str.equals("Iris")) {
            this.A01 = true;
        } else {
            this.A00 = true;
        }
        if (C18U.A06(C06090Tz.A05, this.A03, 36326154785928895L)) {
            if (this.A00) {
                str2 = "e2ee_success";
            } else {
                return;
            }
        } else if (!this.A01) {
            return;
        } else {
            str2 = "open_success";
        }
        A01("end_reason", str2);
        this.A02.markerEnd(20132307, 0, (short) 2);
    }

    public final void A01(String str, String str2) {
        C006802i c006802i = this.A02;
        if (c006802i.isMarkerOn(20132307, 0)) {
            c006802i.markerAnnotate(20132307, 0, str, str2);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A02.markerEnd(20132307, 0, (short) 3);
    }
}
