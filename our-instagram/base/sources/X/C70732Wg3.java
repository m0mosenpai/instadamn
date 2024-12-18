package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Wg3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70732Wg3 implements C1EH {
    public static final C70732Wg3 A00 = new C70732Wg3();

    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        VDP vdp;
        C14360o3.A0B(c16l, 0);
        C66630UPs c66630UPs = new C66630UPs(VDP.A04);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaDrawableConfig should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -1789286243:
                        if (A0s.equals("starting_rotation")) {
                            c66630UPs.A03 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case -1679374179:
                        if (A0s.equals("starting_normalized_width")) {
                            c66630UPs.A02 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case -1672693885:
                        if (A0s.equals("starting_scale_factor")) {
                            c66630UPs.A04 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case -1659133332:
                        if (A0s.equals("contour_path_enabled")) {
                            c66630UPs.A0C = c16l.A0d();
                            break;
                        }
                        break;
                    case -1425766239:
                        if (A0s.equals("enable_rotate_gesture")) {
                            c66630UPs.A0G = c16l.A0d();
                            break;
                        }
                        break;
                    case -1416025802:
                        if (A0s.equals("content_description")) {
                            c66630UPs.A08 = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -1401301712:
                        if (A0s.equals("unlink_drawable_when_removed")) {
                            c66630UPs.A0O = c16l.A0d();
                            break;
                        }
                        break;
                    case -1150972356:
                        if (A0s.equals("bounce_in")) {
                            c66630UPs.A0B = c16l.A0d();
                            break;
                        }
                        break;
                    case -1091421752:
                        if (A0s.equals("fade_in")) {
                            c66630UPs.A0J = c16l.A0d();
                            break;
                        }
                        break;
                    case -989224187:
                        if (A0s.equals("bounds_spec")) {
                            c66630UPs.A06 = (UPR) C16V.A01(c16l, C70731Wg2.A00);
                            break;
                        }
                        break;
                    case -896505829:
                        if (A0s.equals(CacheBehaviorLogger.SOURCE)) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null && (vdp = (VDP) VDP.A01.get(A1P)) != null) {
                                c66630UPs.A07 = vdp;
                                break;
                            }
                        }
                        break;
                    case -685774702:
                        if (A0s.equals("starting_layer")) {
                            c66630UPs.A05 = c16l.A1D();
                            break;
                        }
                        break;
                    case -391459676:
                        if (A0s.equals("enable_vertical_translation")) {
                            c66630UPs.A0I = c16l.A0d();
                            break;
                        }
                        break;
                    case -321790287:
                        if (A0s.equals("min_scale_factor")) {
                            c66630UPs.A01 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case -257921825:
                        if (A0s.equals("max_scale_factor")) {
                            c66630UPs.A00 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case -103498427:
                        if (A0s.equals("removable_by_trash_can")) {
                            c66630UPs.A0M = c16l.A0d();
                            break;
                        }
                        break;
                    case 114586:
                        if (A0s.equals("tag")) {
                            c66630UPs.A09 = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 305772914:
                        if (A0s.equals("starting_offset")) {
                            ArrayList arrayList = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    arrayList.add(AbstractC167007dF.A0b(c16l));
                                }
                            }
                            c66630UPs.A0A = arrayList;
                            break;
                        }
                        break;
                    case 739096984:
                        if (A0s.equals("enable_scale_gesture")) {
                            c66630UPs.A0H = c16l.A0d();
                            break;
                        }
                        break;
                    case 977697542:
                        if (A0s.equals("enable_bulk_remove_drawables_by_tag")) {
                            c66630UPs.A0E = c16l.A0d();
                            break;
                        }
                        break;
                    case 979117578:
                        if (A0s.equals("fully_visible_on_screen")) {
                            c66630UPs.A0L = c16l.A0d();
                            break;
                        }
                        break;
                    case 1168745701:
                        if (A0s.equals("enable_bouncy_press_down")) {
                            c66630UPs.A0D = c16l.A0d();
                            break;
                        }
                        break;
                    case 1575154455:
                        if (A0s.equals("touch_enabled_by_default")) {
                            c66630UPs.A0N = c16l.A0d();
                            break;
                        }
                        break;
                    case 1959204290:
                        if (A0s.equals("fully_visible_on_alignment_guide")) {
                            c66630UPs.A0K = c16l.A0d();
                            break;
                        }
                        break;
                    case 1997274450:
                        if (A0s.equals("enable_horizontal_translation")) {
                            c66630UPs.A0F = c16l.A0d();
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaDrawableConfigJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return c66630UPs;
    }
}
