package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Cfc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28374Cfc {
    public final C26086BgF A00;
    public final UserSession A01;
    public final ConcurrentHashMap.KeySetView A02 = ConcurrentHashMap.newKeySet();
    public final InterfaceC09390do A03 = AbstractC09440dt.A00(EnumC09460dv.A02, new DGV(this, 3));

    public static final void A00(C28374Cfc c28374Cfc, CRU cru, Boolean bool, Integer num, Integer num2, Integer num3, String str, String str2) {
        String str3;
        Long l;
        Long l2;
        String str4;
        String str5 = null;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2) {
                        str3 = "PILL";
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    str3 = "USER";
                }
            } else {
                str3 = "AUTO";
            }
        } else {
            str3 = null;
        }
        C22C A01 = AnonymousClass229.A01(c28374Cfc.A01);
        C26086BgF c26086BgF = c28374Cfc.A00;
        String str6 = c26086BgF.A03;
        if (num2 != null) {
            l = AbstractC25229BEm.A0n(num2);
        } else {
            l = null;
        }
        if (num3 != null) {
            l2 = AbstractC25229BEm.A0n(num3);
        } else {
            l2 = null;
        }
        if (cru != null) {
            str4 = cru.A02;
            str5 = cru.A00;
        } else {
            str4 = null;
        }
        String str7 = c26086BgF.A04;
        Number number = (Number) c26086BgF.A02;
        C448124l c448124l = A01.A09;
        C14360o3.A0B(str6, 1);
        C25531Mh A08 = C25531Mh.A08(c448124l.A01);
        EnumC114925Hg A0J = c448124l.A0J();
        if (AbstractC25226BEj.A1Z(A08) && A0J != null) {
            A08.A0s("IG_CAMERA_ENTITY_TAP");
            A08.A0q(str);
            C448124l.A00(A08, c448124l);
            A08.A0a(A0J);
            C22M c22m = c448124l.A04;
            A08.A0b(c22m.A09);
            A08.A0T();
            A08.A0U();
            A08.A0m(C22F.A08.getModuleName());
            A08.A0c(c22m.A0A);
            A08.A0R("composition_str_id", c22m.A0M);
            A08.A0M(c22m.A0A, "composition_media_type");
            A08.A0t(AbstractC25225BEi.A14());
            A08.A0R("magicmod_session_id", str6);
            if (str4 != null) {
                A08.A0R("genai_response_id", str4);
            }
            if (str5 != null) {
                A08.A0R("genai_content_id", str5);
            }
            if (str2 != null) {
                A08.A0R("genai_prompt", str2);
            }
            if (str3 != null) {
                A08.A0R("genai_generate_source", str3);
            }
            if (l != null) {
                A08.A0Q("prompt_pill_position", Long.valueOf(l.longValue()));
            }
            if (bool != null) {
                A08.A0O("magicmod_backdrop_default_segment_selected", Boolean.valueOf(bool.booleanValue()));
            }
            if (str7 != null) {
                A08.A0R(MSV.A00(378), str7);
            }
            if (number != null) {
                A08.A0Q(AbstractC43591JPw.A00(742), Long.valueOf(number.longValue()));
            }
            if (l2 != null) {
                A08.A0Q("image_position", Long.valueOf(l2.longValue()));
            }
            A08.Cht();
        }
    }

    public static final void A01(C28374Cfc c28374Cfc, String str) {
        A00(c28374Cfc, null, null, null, null, null, str, null);
    }

    public final void A03(int i, String str) {
        C14360o3.A0B(str, 1);
        int A05 = AbstractC25227BEk.A05((EnumC193878i8) this.A00.A01, 0);
        String str2 = "MAGIC_MOD_BACKDROP_PROMPT_PILL_TAP";
        if (A05 != 0) {
            if (A05 != 1) {
                if (A05 != 2) {
                    throw B4Z.A00();
                }
            } else {
                str2 = "MAGIC_MOD_RESTYLE_PROMPT_PILL_TAP";
            }
        }
        A00(this, null, null, null, Integer.valueOf(i), null, str2, str);
    }

    public final void A04(CRU cru) {
        int A05 = AbstractC25227BEk.A05((EnumC193878i8) this.A00.A01, 0);
        String str = "MAGIC_MOD_BACKDROP_POST_GEN_CANCEL";
        if (A05 != 0) {
            if (A05 != 1) {
                if (A05 != 2) {
                    throw B4Z.A00();
                }
            } else {
                str = "MAGIC_MOD_RESTYLE_POST_GEN_CANCEL";
            }
        }
        A00(this, cru, null, null, null, null, str, null);
    }

    public final void A06(CRU cru, Integer num) {
        int A05 = AbstractC25227BEk.A05((EnumC193878i8) this.A00.A01, 0);
        String str = "MAGIC_MOD_BACKDROP_DONE";
        if (A05 != 0) {
            if (A05 != 1) {
                if (A05 != 2) {
                    throw B4Z.A00();
                }
            } else {
                str = "MAGIC_MOD_RESTYLE_DONE";
            }
        }
        A00(this, cru, null, null, null, num, str, null);
    }

    public final void A07(CRU cru, Integer num, String str) {
        int A05 = AbstractC25227BEk.A05((EnumC193878i8) this.A00.A01, 0);
        String str2 = "MAGIC_MOD_BACKDROP_GENERATE";
        if (A05 != 0) {
            if (A05 != 1) {
                if (A05 != 2) {
                    throw B4Z.A00();
                }
            } else {
                str2 = "MAGIC_MOD_RESTYLE_GENERATE";
            }
        }
        A00(this, cru, null, num, null, null, str2, str);
    }

    public final void A08(CRU cru, String str) {
        int A05 = AbstractC25227BEk.A05((EnumC193878i8) this.A00.A01, 0);
        String str2 = "MAGIC_MOD_BACKDROP_PROMPT_POSTGEN_TAP";
        if (A05 != 0) {
            if (A05 != 1) {
                if (A05 != 2) {
                    throw B4Z.A00();
                }
            } else {
                str2 = "MAGIC_MOD_RESTYLE_PROMPT_POSTGEN_TAP";
            }
        }
        A00(this, cru, null, null, null, null, str2, str);
    }

    public final void A09(CRU cru, String str) {
        int A05 = AbstractC25227BEk.A05((EnumC193878i8) this.A00.A01, 0);
        String str2 = "MAGIC_MOD_BACKDROP_RETRY";
        if (A05 != 0) {
            if (A05 != 1) {
                if (A05 != 2) {
                    throw B4Z.A00();
                }
            } else {
                str2 = "MAGIC_MOD_RESTYLE_RETRY";
            }
        }
        A00(this, cru, null, null, null, null, str2, str);
    }

    public final void A02() {
        int A05 = AbstractC25227BEk.A05((EnumC193878i8) this.A00.A01, 0);
        String str = "MAGIC_MOD_BACKDROP_CANCEL";
        if (A05 != 0) {
            if (A05 != 1) {
                if (A05 != 2) {
                    throw B4Z.A00();
                }
            } else {
                str = "MAGIC_MOD_RESTYLE_CANCEL";
            }
        }
        A01(this, str);
    }

    public final void A05(CRU cru, int i, boolean z) {
        if (z) {
            ConcurrentHashMap.KeySetView keySetView = this.A02;
            Integer valueOf = Integer.valueOf(i);
            if (!keySetView.contains(valueOf)) {
                keySetView.add(valueOf);
            } else {
                return;
            }
        }
        C22C A01 = AnonymousClass229.A01(this.A01);
        C26086BgF c26086BgF = this.A00;
        C81X A00 = A0M.A00((EnumC193878i8) c26086BgF.A01);
        String str = c26086BgF.A03;
        long j = i;
        String str2 = cru.A02;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = cru.A00;
        if (str3 == null) {
            str3 = "";
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(((C22F) A01).A01, "ig_camera_genai_generated_impression");
        EnumC114925Hg A0J = A01.A0J();
        C22M c22m = ((C22F) A01).A04;
        String str4 = c22m.A0L;
        if (A0f.isSampled() && A0J != null && str4 != null) {
            A0f.A8R(A0J, "camera_destination");
            A0f.AAP("camera_session_id", str4);
            A0f.AAP("module", C22F.A08.getModuleName());
            AbstractC166997dE.A1N(A0f, "entity_type", 45);
            A0f.AAP("genai_response_id", str2);
            A0f.AAP("genai_content_id", str3);
            A0f.A9K("image_position", Long.valueOf(j));
            A0f.AAP("magicmod_session_id", str);
            A0f.A8R(A00, "camera_tool");
            AbstractC25225BEi.A1N(A0f, AbstractC25225BEi.A14());
            A0f.A8R(EnumC50631MWs.A0I, "surface");
            A0f.AAP("composition_str_id", c22m.A0M);
            A0f.A8R(c22m.A0A, "composition_media_type");
            A0f.Cht();
        }
    }

    public C28374Cfc(C26086BgF c26086BgF, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = c26086BgF;
    }
}
