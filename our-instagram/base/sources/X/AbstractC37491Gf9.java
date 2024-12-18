package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gf9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37491Gf9 {
    public static final Map A00 = AbstractC166987dD.A1I();

    public static final ArrayList A00(List list) {
        ArrayList A12 = AbstractC166997dE.A12(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5H2 c5h2 = (C5H2) it.next();
            C0Zx c0Zx = new C0Zx();
            c0Zx.A03("is_ad", Boolean.valueOf(c5h2.CdW()));
            String CAP = c5h2.CAP();
            if (CAP != null) {
                c0Zx.A06("tracking", CAP);
            }
            String AZE = c5h2.AZE();
            if (AZE != null) {
                c0Zx.A06("ad_id", AZE);
            }
            String CAR = c5h2.CAR();
            if (CAR != null) {
                c0Zx.A06("tracking_token", CAR);
            }
            A12.add(c0Zx);
        }
        return A12;
    }

    public static final ArrayList A01(List list) {
        ArrayList A12 = AbstractC166997dE.A12(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C71353Hw c71353Hw = (C71353Hw) it.next();
            C0Zx c0Zx = new C0Zx();
            c0Zx.A01((EnumC71343Hv) c71353Hw.A01, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            if (c71353Hw.A00 != null) {
                c0Zx.A05("index", Long.valueOf(r0.intValue()));
            }
            A12.add(c0Zx);
        }
        return A12;
    }
}
