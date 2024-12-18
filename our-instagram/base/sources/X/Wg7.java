package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* loaded from: classes11.dex */
public final class Wg7 implements C1EH {
    public static final Wg7 A00 = new Wg7();

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.UPU] */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        ?? obj = new Object();
        obj.A07 = "";
        obj.A09 = "";
        obj.A06 = null;
        obj.A00 = null;
        obj.A08 = null;
        obj.A04 = null;
        obj.A03 = null;
        obj.A05 = null;
        obj.A01 = null;
        obj.A02 = null;
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for User should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -1677176261:
                        if (A0s.equals("full_name")) {
                            obj.A06 = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -265713450:
                        if (A0s.equals(AbstractC65709Tsi.A01())) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                obj.A09 = A1P2;
                                break;
                            }
                        }
                        break;
                    case -227009660:
                        if (A0s.equals(AbstractC111324zv.A00(2614))) {
                            obj.A02 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 3355:
                        if (A0s.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                obj.A07 = A1P;
                                break;
                            }
                        }
                        break;
                    case 1185812334:
                        if (A0s.equals("is_private")) {
                            obj.A03 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 1490300194:
                        if (A0s.equals("charity_id")) {
                            obj.A05 = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1565553213:
                        if (A0s.equals("is_verified")) {
                            obj.A04 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 1757470412:
                        if (A0s.equals(AbstractC58317Pt9.A00(104))) {
                            obj.A00 = (C26068Bfw) C16V.A01(c16l, C70735Wg6.A00);
                            break;
                        }
                        break;
                    case 1782139044:
                        if (A0s.equals("profile_pic_url")) {
                            obj.A08 = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1958764699:
                        if (A0s.equals("is_facebook_onboarded_charity")) {
                            obj.A01 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                }
                C0K8.A0C("UserJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return obj;
    }
}
