package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.WgC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70740WgC implements C1EH {
    public static final C70740WgC A00 = new C70740WgC();

    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        String A1P5;
        String A1P6;
        String A1P7;
        VEH veh;
        C14360o3.A0B(c16l, 0);
        US6 us6 = new US6(VEH.A1d, AbstractC167017dG.A0j());
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for IgMediaSticker should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -2030994180:
                        if (A0s.equals("sticker_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P7 = c16l.A1P()) != null && (veh = (VEH) VEH.A01.get(A1P7)) != null) {
                                us6.A09 = veh;
                                break;
                            }
                        }
                        break;
                    case -2007375800:
                        if (A0s.equals("has_collaborators")) {
                            us6.A0Q = c16l.A0d();
                            break;
                        }
                        break;
                    case -2000617044:
                        if (A0s.equals("repost_pill_width")) {
                            us6.A03 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1992012396:
                        if (A0s.equals("duration")) {
                            us6.A0C = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -1985806860:
                        if (A0s.equals("selected_variant_index")) {
                            us6.A04 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1870102005:
                        if (A0s.equals("user_attribution")) {
                            us6.A0M = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -1798207542:
                        if (A0s.equals("padding_x")) {
                            us6.A01 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1798207541:
                        if (A0s.equals("padding_y")) {
                            us6.A02 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1263142544:
                        if (A0s.equals("carousel_child_has_product_tags")) {
                            us6.A0P = c16l.A0d();
                            break;
                        }
                        break;
                    case -1221029593:
                        if (A0s.equals(IgReactMediaPickerNativeModule.HEIGHT)) {
                            us6.A00 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1203619573:
                        if (A0s.equals("drawable_transform")) {
                            us6.A08 = (C66629UPr) C16V.A01(c16l, C70734Wg5.A00);
                            break;
                        }
                        break;
                    case -918445096:
                        if (A0s.equals("carousel_child_media_id")) {
                            if (c16l.A11() != C16R.A0G && (A1P6 = c16l.A1P()) != null) {
                                us6.A0B = A1P6;
                                break;
                            }
                        }
                        break;
                    case -900774058:
                        if (A0s.equals("media_id")) {
                            if (c16l.A11() != C16R.A0G && (A1P5 = c16l.A1P()) != null) {
                                us6.A0I = A1P5;
                                break;
                            }
                        }
                        break;
                    case -761937713:
                        if (A0s.equals("fundraiser_id")) {
                            us6.A0H = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -732121899:
                        if (A0s.equals("is_carousel")) {
                            us6.A0T = c16l.A0d();
                            break;
                        }
                        break;
                    case -478065615:
                        if (A0s.equals("duration_ms")) {
                            us6.A0A = AbstractC31173DnH.A0h(c16l);
                            break;
                        }
                        break;
                    case -450937106:
                        if (A0s.equals("has_product_tags")) {
                            us6.A0R = c16l.A0d();
                            break;
                        }
                        break;
                    case -265713450:
                        if (A0s.equals(AbstractC65709Tsi.A01())) {
                            if (c16l.A11() != C16R.A0G && (A1P4 = c16l.A1P()) != null) {
                                us6.A0N = A1P4;
                                break;
                            }
                        }
                        break;
                    case -15119530:
                        if (A0s.equals("event_action_button_text")) {
                            us6.A0D = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 3601339:
                        if (A0s.equals("uuid")) {
                            if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                us6.A0O = A1P3;
                                break;
                            }
                        }
                        break;
                    case 110371416:
                        if (A0s.equals(DialogModule.KEY_TITLE)) {
                            us6.A0L = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 113126854:
                        if (A0s.equals(IgReactMediaPickerNativeModule.WIDTH)) {
                            us6.A05 = c16l.A1D();
                            break;
                        }
                        break;
                    case 278118624:
                        if (A0s.equals("event_id")) {
                            us6.A0E = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 450436211:
                        if (A0s.equals("event_title")) {
                            us6.A0G = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 704531672:
                        if (A0s.equals("is_autoplay")) {
                            us6.A0S = c16l.A0d();
                            break;
                        }
                        break;
                    case 984361298:
                        if (A0s.equals("event_time")) {
                            us6.A0F = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1260322998:
                        if (A0s.equals("timed_info")) {
                            us6.A06 = (UQL) C16V.A01(c16l, C70767Wgg.A00);
                            break;
                        }
                        break;
                    case 1353515042:
                        if (A0s.equals("media_owner_id")) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                us6.A0J = A1P2;
                                break;
                            }
                        }
                        break;
                    case 1594256643:
                        if (A0s.equals("is_media_author_seller")) {
                            us6.A0U = c16l.A0d();
                            break;
                        }
                        break;
                    case 1776071171:
                        if (A0s.equals("drawable_config")) {
                            us6.A07 = (C66630UPs) C16V.A01(c16l, C70732Wg3.A00);
                            break;
                        }
                        break;
                    case 1782139044:
                        if (A0s.equals("profile_pic_url")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                us6.A0K = A1P;
                                break;
                            }
                        }
                        break;
                }
                C0K8.A0C("IgMediaStickerJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return us6;
    }
}
