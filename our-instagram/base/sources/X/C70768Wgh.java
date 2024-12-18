package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Wgh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70768Wgh implements C1EH {
    public static final C70768Wgh A00 = new C70768Wgh();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        String A1P2;
        VEH veh;
        String A1P3;
        String A1P4;
        String A1P5;
        String A1P6;
        C14360o3.A0B(c16l, 0);
        float f = 0.0f;
        US5 us5 = new US5(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, f, f, f, f, f, f, f, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 134217727, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaTextSticker should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                VDY vdy = null;
                r3 = null;
                EnumC223009sf enumC223009sf = null;
                r3 = null;
                EnumC68155VDz enumC68155VDz = null;
                r3 = null;
                EnumC68144VDh enumC68144VDh = null;
                vdy = null;
                switch (A0s.hashCode()) {
                    case -2115337775:
                        if (A0s.equals("text_color")) {
                            us5.A09 = c16l.A1D();
                            break;
                        }
                        break;
                    case -2111778553:
                        if (A0s.equals("text_effect_color")) {
                            us5.A0A = c16l.A1D();
                            break;
                        }
                        break;
                    case -2060609828:
                        if (A0s.equals("drawable_source")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                vdy = (VDY) VDY.A01.get(A1P);
                            }
                            us5.A0J = vdy;
                            break;
                        }
                        break;
                    case -2030994180:
                        if (A0s.equals("sticker_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null && (veh = (VEH) VEH.A01.get(A1P2)) != null) {
                                us5.A0K = veh;
                                break;
                            }
                        }
                        break;
                    case -1985806860:
                        if (A0s.equals("selected_variant_index")) {
                            us5.A08 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1798207542:
                        if (A0s.equals("padding_x")) {
                            us5.A03 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case -1798207541:
                        if (A0s.equals("padding_y")) {
                            us5.A04 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case -1783100079:
                        if (A0s.equals("text_alignment")) {
                            if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                enumC68144VDh = (EnumC68144VDh) EnumC68144VDh.A01.get(A1P3);
                            }
                            us5.A0G = enumC68144VDh;
                            break;
                        }
                        break;
                    case -1756466470:
                        if (A0s.equals("line_spacing_add")) {
                            us5.A01 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case -1530233576:
                        if (A0s.equals("is_animated")) {
                            us5.A0P = c16l.A0d();
                            break;
                        }
                        break;
                    case -1468661111:
                        if (A0s.equals("effect_id")) {
                            if (c16l.A11() != C16R.A0G && (A1P4 = c16l.A1P()) != null) {
                                enumC68155VDz = (EnumC68155VDz) EnumC68155VDz.A01.get(A1P4);
                            }
                            us5.A0I = enumC68155VDz;
                            break;
                        }
                        break;
                    case -1238804110:
                        if (A0s.equals("shadow_layer")) {
                            us5.A0C = (C66248U5s) C16V.A01(c16l, C70775Wgo.A00);
                            break;
                        }
                        break;
                    case -1206429896:
                        if (A0s.equals("playback_duration")) {
                            us5.A05 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case -1203619573:
                        if (A0s.equals("drawable_transform")) {
                            us5.A0F = (C66629UPr) C16V.A01(c16l, C70734Wg5.A00);
                            break;
                        }
                        break;
                    case -1037596717:
                        if (A0s.equals("text_size")) {
                            us5.A06 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case -815970172:
                        if (A0s.equals("span_metadata")) {
                            ArrayList arrayList = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    arrayList.add(C16V.A01(c16l, C70776Wgp.A00));
                                }
                            }
                            us5.A0O = arrayList;
                            break;
                        }
                        break;
                    case -747230934:
                        if (A0s.equals("letter_spacing")) {
                            us5.A00 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case -699157868:
                        if (A0s.equals("safe_width")) {
                            us5.A07 = c16l.A1D();
                            break;
                        }
                        break;
                    case 3556653:
                        if (A0s.equals("text")) {
                            us5.A0L = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 3601339:
                        if (A0s.equals("uuid")) {
                            if (c16l.A11() != C16R.A0G && (A1P5 = c16l.A1P()) != null) {
                                us5.A0N = A1P5;
                                break;
                            }
                        }
                        break;
                    case 1173911478:
                        if (A0s.equals("animation_id")) {
                            if (c16l.A11() != C16R.A0G && (A1P6 = c16l.A1P()) != null) {
                                enumC223009sf = (EnumC223009sf) EnumC223009sf.A01.get(A1P6);
                            }
                            us5.A0H = enumC223009sf;
                            break;
                        }
                        break;
                    case 1207469959:
                        if (A0s.equals("truncation_suffix")) {
                            us5.A0M = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1260322998:
                        if (A0s.equals("timed_info")) {
                            us5.A0D = (UQL) C16V.A01(c16l, C70767Wgg.A00);
                            break;
                        }
                        break;
                    case 1384488471:
                        if (A0s.equals("line_spacing_mult")) {
                            us5.A02 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case 1676921617:
                        if (A0s.equals("is_story_text_drawable")) {
                            us5.A0Q = c16l.A0d();
                            break;
                        }
                        break;
                    case 1741994094:
                        if (A0s.equals("truncation_max_lines")) {
                            us5.A0B = c16l.A1D();
                            break;
                        }
                        break;
                    case 1776071171:
                        if (A0s.equals("drawable_config")) {
                            us5.A0E = (C66630UPs) C16V.A01(c16l, C70732Wg3.A00);
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaTextStickerJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return us5;
    }
}
