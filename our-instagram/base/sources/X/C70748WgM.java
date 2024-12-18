package X;

import java.io.IOException;

/* renamed from: X.WgM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70748WgM implements C1EH {
    public static final C70748WgM A00 = new C70748WgM();

    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        VEH veh;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        C66651URp c66651URp = new C66651URp(null, null, null, null, null, null, 0, 0, 511, false, false);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaInternalSticker should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -2051514198:
                        if (A0s.equals(AbstractC111324zv.A00(1054))) {
                            c66651URp.A08 = c16l.A0d();
                            break;
                        }
                        break;
                    case -2030994180:
                        if (A0s.equals("sticker_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null && (veh = (VEH) VEH.A01.get(A1P)) != null) {
                                c66651URp.A05 = veh;
                                break;
                            }
                        }
                        break;
                    case -1985806860:
                        if (A0s.equals("selected_variant_index")) {
                            c66651URp.A01 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1786117967:
                        if (A0s.equals(AbstractC111324zv.A00(1047))) {
                            c66651URp.A07 = c16l.A0d();
                            break;
                        }
                        break;
                    case -1203619573:
                        if (A0s.equals("drawable_transform")) {
                            c66651URp.A04 = (C66629UPr) C16V.A01(c16l, C70734Wg5.A00);
                            break;
                        }
                        break;
                    case -230974677:
                        if (A0s.equals("max_width")) {
                            c66651URp.A00 = c16l.A1D();
                            break;
                        }
                        break;
                    case 3601339:
                        if (A0s.equals("uuid")) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                c66651URp.A06 = A1P2;
                                break;
                            }
                        }
                        break;
                    case 1260322998:
                        if (A0s.equals("timed_info")) {
                            c66651URp.A02 = (UQL) C16V.A01(c16l, C70767Wgg.A00);
                            break;
                        }
                        break;
                    case 1776071171:
                        if (A0s.equals("drawable_config")) {
                            c66651URp.A03 = (C66630UPs) C16V.A01(c16l, C70732Wg3.A00);
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaInternalStickerJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return c66651URp;
    }
}
