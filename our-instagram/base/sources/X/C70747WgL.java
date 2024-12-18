package X;

import java.io.IOException;

/* renamed from: X.WgL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70747WgL implements C1EH {
    public static final C70747WgL A00 = new C70747WgL();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        VEH veh;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        C66656URu c66656URu = new C66656URu(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0.0f, 0, objArr, objArr2, objArr3, 16383, objArr4, objArr5);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaIgtvShareSticker should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -2030994180:
                        if (A0s.equals("sticker_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null && (veh = (VEH) VEH.A01.get(A1P)) != null) {
                                c66656URu.A08 = veh;
                                break;
                            }
                        }
                        break;
                    case -2007375800:
                        if (A0s.equals("has_collaborators")) {
                            c66656URu.A0C = c16l.A0d();
                            break;
                        }
                        break;
                    case -1985806860:
                        if (A0s.equals("selected_variant_index")) {
                            c66656URu.A04 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1914105377:
                        if (A0s.equals("media_aspect_ratio")) {
                            c66656URu.A00 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case -1824429564:
                        if (A0s.equals("original_media_id")) {
                            c66656URu.A0A = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -1203619573:
                        if (A0s.equals("drawable_transform")) {
                            c66656URu.A07 = (C66629UPr) C16V.A01(c16l, C70734Wg5.A00);
                            break;
                        }
                        break;
                    case 3601339:
                        if (A0s.equals("uuid")) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                c66656URu.A0B = A1P2;
                                break;
                            }
                        }
                        break;
                    case 6126141:
                        if (A0s.equals(AbstractC111324zv.A00(1103))) {
                            c66656URu.A09 = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 758560904:
                        if (A0s.equals(AbstractC111324zv.A00(840))) {
                            c66656URu.A02 = c16l.A1D();
                            break;
                        }
                        break;
                    case 895256511:
                        if (A0s.equals(AbstractC111324zv.A00(1063))) {
                            c66656URu.A0D = c16l.A0d();
                            break;
                        }
                        break;
                    case 1260322998:
                        if (A0s.equals("timed_info")) {
                            c66656URu.A05 = (UQL) C16V.A01(c16l, C70767Wgg.A00);
                            break;
                        }
                        break;
                    case 1607556773:
                        if (A0s.equals("container_height")) {
                            c66656URu.A01 = c16l.A1D();
                            break;
                        }
                        break;
                    case 1776071171:
                        if (A0s.equals("drawable_config")) {
                            c66656URu.A06 = (C66630UPs) C16V.A01(c16l, C70732Wg3.A00);
                            break;
                        }
                        break;
                    case 1993322383:
                        if (A0s.equals("media_duration")) {
                            c66656URu.A03 = c16l.A1D();
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaIgtvShareStickerJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return c66656URu;
    }
}
