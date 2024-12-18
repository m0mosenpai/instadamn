package X;

import java.io.IOException;

/* renamed from: X.Wgp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70776Wgp implements C1EH {
    public static final C70776Wgp A00 = new C70776Wgp();

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.UPC] */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        String A1P2;
        VEE vee;
        C14360o3.A0B(c16l, 0);
        VEE vee2 = VEE.A0R;
        ?? obj = new Object();
        obj.A02 = 0;
        obj.A00 = 0;
        obj.A01 = 0;
        obj.A04 = "";
        obj.A03 = vee2;
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for TextSpanMetadata should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -1938130407:
                        if (A0s.equals("metadata_model")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                obj.A04 = A1P;
                                break;
                            }
                        }
                        break;
                    case -1893976672:
                        if (A0s.equals("metadata_model_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null && (vee = (VEE) VEE.A01.get(A1P2)) != null) {
                                obj.A03 = vee;
                                break;
                            }
                        }
                        break;
                    case 1511663954:
                        if (A0s.equals("span_flags")) {
                            obj.A01 = c16l.A1D();
                            break;
                        }
                        break;
                    case 1523908397:
                        if (A0s.equals("span_start")) {
                            obj.A02 = c16l.A1D();
                            break;
                        }
                        break;
                    case 2057435750:
                        if (A0s.equals("span_end")) {
                            obj.A00 = c16l.A1D();
                            break;
                        }
                        break;
                }
                C0K8.A0C("TextSpanMetadataJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return obj;
    }
}
