package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Wge, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70765Wge implements C1EH {
    public static final C70765Wge A00 = new C70765Wge();

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.UPe] */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        String A1P5;
        String A1P6;
        String A1P7;
        String A1P8;
        String A1P9;
        C14360o3.A0B(c16l, 0);
        ?? obj = new Object();
        obj.A0L = "";
        obj.A0P = null;
        obj.A0M = null;
        obj.A02 = 0.0f;
        obj.A01 = 1.0f;
        obj.A00 = 1.0f;
        obj.A06 = 1.0f;
        obj.A0W = null;
        obj.A07 = 0;
        obj.A04 = 0.0f;
        obj.A05 = 0.0f;
        obj.A0a = null;
        obj.A0Y = "#ffffff";
        obj.A0X = "#ffffff";
        obj.A03 = 0.3f;
        obj.A0D = null;
        obj.A0C = null;
        obj.A0H = null;
        obj.A0S = null;
        obj.A0c = null;
        obj.A0d = null;
        obj.A0I = null;
        obj.A0F = null;
        obj.A09 = 0;
        obj.A0N = null;
        obj.A0E = null;
        obj.A0R = "";
        obj.A0K = "";
        obj.A0b = null;
        obj.A0T = "";
        obj.A0U = "";
        obj.A0J = null;
        obj.A0Q = null;
        obj.A0O = null;
        obj.A0A = 0;
        obj.A0Z = null;
        obj.A0B = 0L;
        obj.A0V = null;
        obj.A0G = null;
        obj.A08 = 0;
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaStaticStickerItem should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -2115337775:
                        if (A0s.equals("text_color")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                obj.A0Y = A1P;
                                break;
                            }
                        }
                        break;
                    case -1928344722:
                        if (A0s.equals("image_width_ratio")) {
                            obj.A02 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case -1891205084:
                        if (A0s.equals("media_insights_id")) {
                            obj.A0O = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -1875184928:
                        if (A0s.equals("question_types")) {
                            ArrayList arrayList = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                        AbstractC65702TsY.A1T(A1P2, arrayList, EnumC68152VDw.A01);
                                    }
                                }
                            }
                            obj.A0c = arrayList;
                            break;
                        }
                        break;
                    case -1853231955:
                        if (A0s.equals("surface")) {
                            obj.A0V = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -1850949118:
                        if (A0s.equals(AbstractC111324zv.A00(2451))) {
                            obj.A0E = (C66617UPe) C16V.A01(c16l, A00);
                            break;
                        }
                        break;
                    case -1773565470:
                        if (A0s.equals("image_width")) {
                            obj.A01 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case -1711509721:
                        if (A0s.equals("has_countdowns")) {
                            obj.A0F = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case -1539906063:
                        if (A0s.equals("font_size")) {
                            obj.A07 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1165870106:
                        if (A0s.equals("question")) {
                            obj.A0S = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -979805852:
                        if (A0s.equals("prompt")) {
                            if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                obj.A0R = A1P3;
                                break;
                            }
                        }
                        break;
                    case -877823861:
                        if (A0s.equals("image_url")) {
                            obj.A0M = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -877020698:
                        if (A0s.equals("text_x")) {
                            obj.A04 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case -877020697:
                        if (A0s.equals("text_y")) {
                            obj.A05 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case -309882753:
                        if (A0s.equals("attribution")) {
                            obj.A0H = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -170158170:
                        if (A0s.equals("num_active_collabs")) {
                            obj.A09 = c16l.A1D();
                            break;
                        }
                        break;
                    case -93074465:
                        if (A0s.equals(AbstractC111324zv.A00(3224))) {
                            obj.A03 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case -91141660:
                        if (A0s.equals(AbstractC111324zv.A00(3225))) {
                            if (c16l.A11() != C16R.A0G && (A1P4 = c16l.A1P()) != null) {
                                obj.A0X = A1P4;
                                break;
                            }
                        }
                        break;
                    case 3355:
                        if (A0s.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                            if (c16l.A11() != C16R.A0G && (A1P5 = c16l.A1P()) != null) {
                                obj.A0L = A1P5;
                                break;
                            }
                        }
                        break;
                    case 101609:
                        if (A0s.equals("fps")) {
                            obj.A08 = c16l.A1D();
                            break;
                        }
                        break;
                    case 3202695:
                        if (A0s.equals("hint")) {
                            if (c16l.A11() != C16R.A0G && (A1P6 = c16l.A1P()) != null) {
                                obj.A0K = A1P6;
                                break;
                            }
                        }
                        break;
                    case 3373707:
                        if (A0s.equals(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
                            obj.A0P = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 3556653:
                        if (A0s.equals("text")) {
                            obj.A0W = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 3575610:
                        if (A0s.equals(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)) {
                            obj.A0a = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 96632902:
                        if (A0s.equals("emoji")) {
                            obj.A0I = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 110371416:
                        if (A0s.equals(DialogModule.KEY_TITLE)) {
                            obj.A0Z = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 163776165:
                        if (A0s.equals(AbstractC58317Pt9.A00(380))) {
                            obj.A06 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case 421050507:
                        if (A0s.equals("image_height")) {
                            obj.A00 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case 440720123:
                        if (A0s.equals("response_types")) {
                            ArrayList arrayList2 = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    if (c16l.A11() != C16R.A0G && (A1P7 = c16l.A1P()) != null) {
                                        AbstractC65702TsY.A1T(A1P7, arrayList2, EnumC68151VDv.A01);
                                    }
                                }
                            }
                            obj.A0d = arrayList2;
                            break;
                        }
                        break;
                    case 523149226:
                        if (A0s.equals("keywords")) {
                            ArrayList arrayList3 = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    AbstractC65702TsY.A1K(c16l, arrayList3);
                                }
                            }
                            obj.A0b = arrayList3;
                            break;
                        }
                        break;
                    case 697547724:
                        if (A0s.equals("hashtag")) {
                            obj.A0C = (UPW) C16V.A01(c16l, C70745WgJ.A00);
                            break;
                        }
                        break;
                    case 820108239:
                        if (A0s.equals(AbstractC111324zv.A00(2677))) {
                            obj.A0N = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1204402210:
                        if (A0s.equals(AbstractC111324zv.A00(404))) {
                            obj.A0J = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1634011452:
                        if (A0s.equals(AbstractC43591JPw.A00(209))) {
                            if (c16l.A11() != C16R.A0G && (A1P8 = c16l.A1P()) != null) {
                                obj.A0T = A1P8;
                                break;
                            }
                        }
                        break;
                    case 1746464963:
                        if (A0s.equals("accessibility_label")) {
                            obj.A0G = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1782139044:
                        if (A0s.equals("profile_pic_url")) {
                            obj.A0Q = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1901043637:
                        if (A0s.equals("location")) {
                            obj.A0D = (C66613UPa) C16V.A01(c16l, C70751WgQ.A00);
                            break;
                        }
                        break;
                    case 1914248592:
                        if (A0s.equals("num_supporters")) {
                            obj.A0A = c16l.A1D();
                            break;
                        }
                        break;
                    case 1931848974:
                        if (A0s.equals("creation_date")) {
                            obj.A0B = c16l.A0y();
                            break;
                        }
                        break;
                    case 2099875758:
                        if (A0s.equals(AbstractC111324zv.A00(270))) {
                            if (c16l.A11() != C16R.A0G && (A1P9 = c16l.A1P()) != null) {
                                obj.A0U = A1P9;
                                break;
                            }
                        }
                        break;
                }
                C0K8.A0C("MediaStaticStickerItemJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return obj;
    }
}
