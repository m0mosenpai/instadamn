package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Wgm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70773Wgm implements C1EH {
    public static final C70773Wgm A00 = new C70773Wgm();

    /* JADX WARN: Type inference failed for: r3v0, types: [X.UPL, java.lang.Object] */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        ?? obj = new Object();
        obj.A05 = null;
        obj.A02 = 0.0f;
        obj.A03 = 0.0f;
        obj.A00 = 0.0f;
        obj.A01 = 0.0f;
        obj.A06 = null;
        obj.A04 = "";
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for RingSpec should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -1354842768:
                        if (A0s.equals("colors")) {
                            ArrayList arrayList = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    AbstractC65702TsY.A1K(c16l, arrayList);
                                }
                            }
                            obj.A05 = arrayList;
                            break;
                        }
                        break;
                    case -1197189282:
                        if (A0s.equals("locations")) {
                            ArrayList arrayList2 = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    arrayList2.add(AbstractC167007dF.A0b(c16l));
                                }
                            }
                            obj.A06 = arrayList2;
                            break;
                        }
                        break;
                    case 3373707:
                        if (A0s.equals(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                obj.A04 = A1P;
                                break;
                            }
                        }
                        break;
                    case 355688997:
                        if (A0s.equals("end_point_x")) {
                            obj.A00 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case 355688998:
                        if (A0s.equals("end_point_y")) {
                            obj.A01 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case 2020091564:
                        if (A0s.equals("start_point_x")) {
                            obj.A02 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case 2020091565:
                        if (A0s.equals("start_point_y")) {
                            obj.A03 = (float) c16l.A0U();
                            break;
                        }
                        break;
                }
                C0K8.A0C("RingSpecJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return obj;
    }
}
