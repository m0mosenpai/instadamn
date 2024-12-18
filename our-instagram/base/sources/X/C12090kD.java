package X;

import com.facebook.logginginfra.falco.Identity;

/* renamed from: X.0kD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12090kD {
    public String A00;

    public final Identity A00() {
        Long l;
        XSC xsc = new XSC();
        XSD xsd = new XSD();
        String str = this.A00;
        if (str != null) {
            l = AbstractC003100w.A0k(10, str);
        } else {
            l = null;
        }
        xsd.A01(l);
        xsd.A02(this.A00);
        xsc.A01(xsd.A00());
        return xsc.A00();
    }
}
