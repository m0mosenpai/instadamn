package X;

import com.instagram.direct.msys.subtype.MsysThreadSubtype;

/* loaded from: classes8.dex */
public final class L8R {
    public final C45313K3q A00;

    public L8R(C45313K3q c45313K3q) {
        C14360o3.A0B(c45313K3q, 1);
        this.A00 = c45313K3q;
    }

    public final MsysThreadSubtype A00() {
        return AbstractC46878KoL.A00(AbstractC43593JPy.A0q(this.A00.mResultSet, 0, 18));
    }

    public final String A01() {
        C45313K3q c45313K3q = this.A00;
        String string = c45313K3q.mResultSet.getString(0, 3);
        if (string == null) {
            return c45313K3q.mResultSet.getString(0, 2);
        }
        return string;
    }
}
