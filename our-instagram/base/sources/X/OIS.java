package X;

import android.util.Base64;
import com.instagram.common.session.UserSession;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/* loaded from: classes9.dex */
public final class OIS {
    public OAJ A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;

    public OIS(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57241PbP(this, 38));
    }

    public final OAJ A00() {
        C51958Mxf c51958Mxf;
        OAJ oaj = this.A00;
        if (oaj == null) {
            String string = ((InterfaceC19630xq) this.A02.getValue()).getString("igsignals_ttnc_estimator_metadata_v1.0", null);
            if (string != null) {
                try {
                    Object readObject = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(string, 0))).readObject();
                    if ((readObject instanceof C51958Mxf) && (c51958Mxf = (C51958Mxf) readObject) != null) {
                        List list = c51958Mxf.A01;
                        list.size();
                        oaj = new OAJ(c51958Mxf.A00, list);
                    }
                } catch (IOException | ClassNotFoundException unused) {
                }
                oaj = new OAJ(null, C16930sl.A00);
            } else {
                oaj = new OAJ(null, C16930sl.A00);
            }
            this.A00 = oaj;
        }
        return oaj;
    }
}
