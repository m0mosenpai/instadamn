package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Wgf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70766Wgf implements C1EH {
    public static final C70766Wgf A00 = new C70766Wgf();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        VEH veh;
        String A1P2;
        String A1P3;
        C14360o3.A0B(c16l, 0);
        US8 us8 = new US8(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, Integer.MAX_VALUE, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaStaticSticker should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -2078428843:
                        if (A0s.equals("partnered_account")) {
                            us8.A0U = c16l.A0d();
                            break;
                        }
                        break;
                    case -2030994180:
                        if (A0s.equals("sticker_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null && (veh = (VEH) VEH.A01.get(A1P)) != null) {
                                us8.A06 = veh;
                                break;
                            }
                        }
                        break;
                    case -1985806860:
                        if (A0s.equals("selected_variant_index")) {
                            us8.A00 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1715022168:
                        if (A0s.equals("is_boost_eligible")) {
                            us8.A0A = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case -1413596711:
                        if (A0s.equals("minimum_scale")) {
                            us8.A0C = AbstractC167007dF.A0b(c16l);
                            break;
                        }
                        break;
                    case -1237961642:
                        if (A0s.equals("prompt_titles")) {
                            ArrayList arrayList = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    arrayList.add(C16V.A01(c16l, C70771Wgk.A00));
                                }
                            }
                            us8.A0N = arrayList;
                            break;
                        }
                        break;
                    case -1203619573:
                        if (A0s.equals("drawable_transform")) {
                            us8.A04 = (C66629UPr) C16V.A01(c16l, C70734Wg5.A00);
                            break;
                        }
                        break;
                    case -1170385640:
                        if (A0s.equals("secondary_text")) {
                            us8.A0J = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -979805852:
                        if (A0s.equals("prompt")) {
                            us8.A0H = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -947928398:
                        if (A0s.equals(AbstractC111324zv.A00(2003))) {
                            us8.A08 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case -873453285:
                        if (A0s.equals("titles")) {
                            ArrayList arrayList2 = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    AbstractC65702TsY.A1K(c16l, arrayList2);
                                }
                            }
                            us8.A0R = arrayList2;
                            break;
                        }
                        break;
                    case -309210225:
                        if (A0s.equals("prompts")) {
                            ArrayList arrayList3 = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    AbstractC65702TsY.A1K(c16l, arrayList3);
                                }
                            }
                            us8.A0O = arrayList3;
                            break;
                        }
                        break;
                    case 3355:
                        if (A0s.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                us8.A0G = A1P2;
                                break;
                            }
                        }
                        break;
                    case 3601339:
                        if (A0s.equals("uuid")) {
                            if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                us8.A0K = A1P3;
                                break;
                            }
                        }
                        break;
                    case 58485338:
                        if (A0s.equals("has_attribution")) {
                            us8.A0S = c16l.A0d();
                            break;
                        }
                        break;
                    case 110621003:
                        if (A0s.equals("track")) {
                            us8.A07 = (C66614UPb) C16V.A01(c16l, C70777Wgq.A00);
                            break;
                        }
                        break;
                    case 301343850:
                        if (A0s.equals("ring_spec")) {
                            us8.A05 = (UPL) C16V.A01(c16l, C70773Wgm.A00);
                            break;
                        }
                        break;
                    case 523149226:
                        if (A0s.equals("keywords")) {
                            ArrayList arrayList4 = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    AbstractC65702TsY.A1K(c16l, arrayList4);
                                }
                            }
                            us8.A0M = arrayList4;
                            break;
                        }
                        break;
                    case 661869171:
                        if (A0s.equals(AbstractC58317Pt9.A00(53))) {
                            ArrayList arrayList5 = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    AbstractC65702TsY.A1K(c16l, arrayList5);
                                }
                            }
                            us8.A0Q = arrayList5;
                            break;
                        }
                        break;
                    case 740543069:
                        if (A0s.equals("ring_glyph")) {
                            us8.A01 = (C45116Jxl) C16V.A01(c16l, C70772Wgl.A00);
                            break;
                        }
                        break;
                    case 823889785:
                        if (A0s.equals(AbstractC111324zv.A00(2974))) {
                            us8.A0D = AbstractC166997dE.A0h(c16l);
                            break;
                        }
                        break;
                    case 1035840149:
                        if (A0s.equals("render_framework")) {
                            us8.A0I = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1059064427:
                        if (A0s.equals("maximum_scale")) {
                            us8.A0B = AbstractC167007dF.A0b(c16l);
                            break;
                        }
                        break;
                    case 1260322998:
                        if (A0s.equals("timed_info")) {
                            us8.A02 = (UQL) C16V.A01(c16l, C70767Wgg.A00);
                            break;
                        }
                        break;
                    case 1292844441:
                        if (A0s.equals("button_texts")) {
                            ArrayList arrayList6 = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    AbstractC65702TsY.A1K(c16l, arrayList6);
                                }
                            }
                            us8.A0L = arrayList6;
                            break;
                        }
                        break;
                    case 1297387371:
                        if (A0s.equals("help_text")) {
                            us8.A0F = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1359982558:
                        if (A0s.equals("include_in_recent")) {
                            us8.A0T = c16l.A0d();
                            break;
                        }
                        break;
                    case 1531715286:
                        if (A0s.equals("stickers")) {
                            ArrayList arrayList7 = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    arrayList7.add(C16V.A01(c16l, C70765Wge.A00));
                                }
                            }
                            us8.A0P = arrayList7;
                            break;
                        }
                        break;
                    case 1670245022:
                        if (A0s.equals("has_avatar")) {
                            us8.A09 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 1776071171:
                        if (A0s.equals("drawable_config")) {
                            us8.A03 = (C66630UPs) C16V.A01(c16l, C70732Wg3.A00);
                            break;
                        }
                        break;
                    case 2068129058:
                        if (A0s.equals("default_prompt")) {
                            us8.A0E = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaStaticStickerJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return us8;
    }
}
