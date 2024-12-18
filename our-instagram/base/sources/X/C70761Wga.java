package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Wga, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70761Wga implements C1EH {
    public static final C70761Wga A00 = new C70761Wga();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        VEH veh;
        String A1P2;
        String A1P3;
        String A1P4;
        C14360o3.A0B(c16l, 0);
        US1 us1 = new US1(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 131071);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaQuestionSticker should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                EnumC68152VDw enumC68152VDw = null;
                switch (A0s.hashCode()) {
                    case -2115337775:
                        if (A0s.equals("text_color")) {
                            us1.A0E = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -2030994180:
                        if (A0s.equals("sticker_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null && (veh = (VEH) VEH.A01.get(A1P)) != null) {
                                us1.A05 = veh;
                                break;
                            }
                        }
                        break;
                    case -1985806860:
                        if (A0s.equals("selected_variant_index")) {
                            us1.A00 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1475936846:
                        if (A0s.equals("is_clips_v2_media")) {
                            us1.A06 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case -1203619573:
                        if (A0s.equals("drawable_transform")) {
                            us1.A03 = (C66629UPr) C16V.A01(c16l, C70734Wg5.A00);
                            break;
                        }
                        break;
                    case -1165870106:
                        if (A0s.equals("question")) {
                            us1.A0C = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -1030321165:
                        if (A0s.equals("question_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                enumC68152VDw = (EnumC68152VDw) EnumC68152VDw.A01.get(A1P2);
                            }
                            us1.A04 = enumC68152VDw;
                            break;
                        }
                        break;
                    case -900774058:
                        if (A0s.equals("media_id")) {
                            us1.A0A = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 3601339:
                        if (A0s.equals("uuid")) {
                            if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                us1.A0F = A1P3;
                                break;
                            }
                        }
                        break;
                    case 440720123:
                        if (A0s.equals("response_types")) {
                            ArrayList arrayList = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    if (c16l.A11() != C16R.A0G && (A1P4 = c16l.A1P()) != null) {
                                        AbstractC65702TsY.A1T(A1P4, arrayList, EnumC68151VDv.A01);
                                    }
                                }
                            }
                            us1.A0G = arrayList;
                            break;
                        }
                        break;
                    case 678672082:
                        if (A0s.equals("viewer_can_interact")) {
                            us1.A07 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 964289556:
                        if (A0s.equals("question_id")) {
                            us1.A0D = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1260322998:
                        if (A0s.equals("timed_info")) {
                            us1.A01 = (UQL) C16V.A01(c16l, C70767Wgg.A00);
                            break;
                        }
                        break;
                    case 1776071171:
                        if (A0s.equals("drawable_config")) {
                            us1.A02 = (C66630UPs) C16V.A01(c16l, C70732Wg3.A00);
                            break;
                        }
                        break;
                    case 1781202186:
                        if (A0s.equals("question_response_count")) {
                            us1.A08 = AbstractC31173DnH.A0h(c16l);
                            break;
                        }
                        break;
                    case 1782139044:
                        if (A0s.equals("profile_pic_url")) {
                            us1.A0B = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 2036780306:
                        if (A0s.equals("background_color")) {
                            us1.A09 = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaQuestionStickerJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return us1;
    }
}
