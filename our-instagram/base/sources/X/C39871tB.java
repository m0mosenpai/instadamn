package X;

import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: X.1tB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39871tB implements InterfaceC39191rv {
    public final /* synthetic */ C38151q2 A00;

    public C39871tB(C38151q2 c38151q2) {
        this.A00 = c38151q2;
    }

    @Override // X.InterfaceC39191rv
    public final C39111rk Af2() {
        C37571ou c37571ou = this.A00.A02;
        return new C39111rk(c37571ou.A0f, c37571ou.A0d, c37571ou.A0e, c37571ou.A0c);
    }

    @Override // X.InterfaceC39191rv
    public final C39111rk B7t() {
        float f;
        C38151q2 c38151q2 = this.A00;
        C38031pn c38031pn = c38151q2.A04;
        if (c38031pn.A02) {
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
            int i = (calendar.get(11) * 60) + calendar.get(12);
            int i2 = c38031pn.A01;
            if (i <= c38031pn.A00 && i2 <= i) {
                f = c38151q2.A02.A00;
                C37571ou c37571ou = c38151q2.A02;
                return new C39111rk(((float) c37571ou.A0j) * f, ((float) c37571ou.A0h) * f, ((float) c37571ou.A0i) * f, ((float) c37571ou.A0g) * f);
            }
        }
        f = 1.0f;
        C37571ou c37571ou2 = c38151q2.A02;
        return new C39111rk(((float) c37571ou2.A0j) * f, ((float) c37571ou2.A0h) * f, ((float) c37571ou2.A0i) * f, ((float) c37571ou2.A0g) * f);
    }
}
