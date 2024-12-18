package X;

import java.io.IOException;

/* renamed from: X.WgF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70742WgF implements C1EH {
    public static final C70742WgF A00 = new C70742WgF();

    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        VEH veh;
        String A1P2;
        String A1P3;
        C14360o3.A0B(c16l, 0);
        C66655URt c66655URt = new C66655URt(null, null, null, null, null, null, null, 0, 0, 0, 0, 0, 2047);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaBitmapSticker should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -2030994180:
                        if (A0s.equals("sticker_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null && (veh = (VEH) VEH.A01.get(A1P)) != null) {
                                c66655URt.A08 = veh;
                                break;
                            }
                        }
                        break;
                    case -1985806860:
                        if (A0s.equals("selected_variant_index")) {
                            c66655URt.A04 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1785650396:
                        if (A0s.equals("image_file_path")) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                c66655URt.A09 = A1P2;
                                break;
                            }
                        }
                        break;
                    case -1203619573:
                        if (A0s.equals("drawable_transform")) {
                            c66655URt.A07 = (C66629UPr) C16V.A01(c16l, C70734Wg5.A00);
                            break;
                        }
                        break;
                    case -795166598:
                        if (A0s.equals("rect_top")) {
                            c66655URt.A03 = c16l.A1D();
                            break;
                        }
                        break;
                    case 3601339:
                        if (A0s.equals("uuid")) {
                            if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                c66655URt.A0A = A1P3;
                                break;
                            }
                        }
                        break;
                    case 347046913:
                        if (A0s.equals("rect_right")) {
                            c66655URt.A02 = c16l.A1D();
                            break;
                        }
                        break;
                    case 1119391106:
                        if (A0s.equals("rect_left")) {
                            c66655URt.A01 = c16l.A1D();
                            break;
                        }
                        break;
                    case 1260322998:
                        if (A0s.equals("timed_info")) {
                            c66655URt.A05 = (UQL) C16V.A01(c16l, C70767Wgg.A00);
                            break;
                        }
                        break;
                    case 1716393190:
                        if (A0s.equals("rect_bottom")) {
                            c66655URt.A00 = c16l.A1D();
                            break;
                        }
                        break;
                    case 1776071171:
                        if (A0s.equals("drawable_config")) {
                            c66655URt.A06 = (C66630UPs) C16V.A01(c16l, C70732Wg3.A00);
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaBitmapStickerJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return c66655URt;
    }
}
