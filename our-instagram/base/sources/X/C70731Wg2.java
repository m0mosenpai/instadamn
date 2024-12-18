package X;

import java.io.IOException;

/* renamed from: X.Wg2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70731Wg2 implements C1EH {
    public static final C70731Wg2 A00 = new C70731Wg2();

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.UPR] */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        ?? obj = new Object();
        obj.A08 = null;
        obj.A00 = 0.0f;
        obj.A01 = 0.0f;
        obj.A04 = 0.0f;
        obj.A05 = 0.0f;
        obj.A06 = 0;
        obj.A02 = 0.0f;
        obj.A03 = 0.0f;
        obj.A07 = null;
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaDrawableBoundsSpec should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -1389337486:
                        if (A0s.equals("bias_x")) {
                            obj.A00 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case -1389337485:
                        if (A0s.equals("bias_y")) {
                            obj.A01 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case 3496420:
                        if (A0s.equals("rect")) {
                            obj.A07 = (UQ7) C16V.A01(c16l, C70733Wg4.A00);
                            break;
                        }
                        break;
                    case 280523342:
                        if (A0s.equals("gravity")) {
                            obj.A06 = c16l.A1D();
                            break;
                        }
                        break;
                    case 746438708:
                        if (A0s.equals("bounds_spec_type")) {
                            obj.A08 = (EnumC68149VDt) AbstractC166997dE.A0m(EnumC68149VDt.A01, c16l.A1D());
                            break;
                        }
                        break;
                    case 962465437:
                        if (A0s.equals("gravity_offset_x")) {
                            obj.A02 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case 962465438:
                        if (A0s.equals("gravity_offset_y")) {
                            obj.A03 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case 1658006358:
                        if (A0s.equals("normalized_center_x")) {
                            obj.A04 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case 1658006359:
                        if (A0s.equals("normalized_center_y")) {
                            obj.A05 = (float) c16l.A0U();
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaDrawableBoundsSpecJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return obj;
    }
}
