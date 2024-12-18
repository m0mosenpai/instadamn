package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.direct.prompts.DirectPromptTypes;
import java.util.Map;

/* renamed from: X.7FQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7FQ implements InterfaceC13000lm {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC09390do A05 = AbstractC09440dt.A01(new C9EW(this, 23));
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new C9EW(this, 20));
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(new C9EW(this, 22));
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(new C9EW(this, 21));

    public final void A00(DirectPromptTypes directPromptTypes, String str, String str2, int i, int i2) {
        if (i != 28) {
            if (i != 29) {
                if (i != 61) {
                    C18920wW c18920wW = ((FRk) this.A05.getValue()).A00;
                    InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_all_responses_tab_add_response");
                    if (A00.isSampled()) {
                        Map A0M = AbstractC16850sd.A0M(new C09530e4("prompt_type", directPromptTypes.A01));
                        A00.AAP("action", "tap");
                        A00.AAP(CacheBehaviorLogger.SOURCE, PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
                        A00.A9M("extra", A0M);
                        A00.Cht();
                        return;
                    }
                    return;
                }
            } else {
                C36288Fzi.A00((C36288Fzi) this.A02.getValue(), Integer.valueOf(i2), str, str2, "direct_all_responses_tab_add_response", "tap", PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, AbstractC16850sd.A0M(new C09530e4("prompt_type", directPromptTypes.A01)));
                return;
            }
        }
        C36293Fzn.A01((C36293Fzn) this.A04.getValue(), "direct_all_responses_tab_add_response", "tap", AbstractC16850sd.A0M(new C09530e4("prompt_type", directPromptTypes.A01)));
    }

    public final void A01(DirectPromptTypes directPromptTypes, String str, String str2, int i, int i2) {
        if (i != 28) {
            if (i != 29) {
                if (i != 61) {
                    C18920wW c18920wW = ((FRk) this.A05.getValue()).A00;
                    InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_open_question_tab");
                    Map A0M = AbstractC16850sd.A0M(new C09530e4("prompt_type", directPromptTypes.A01));
                    if (A00.isSampled()) {
                        A00.AAP("action", "impression");
                        A00.AAP(CacheBehaviorLogger.SOURCE, "question");
                        A00.A9M("extra", A0M);
                        A00.Cht();
                        return;
                    }
                    return;
                }
            } else {
                C36288Fzi.A00((C36288Fzi) this.A02.getValue(), Integer.valueOf(i2), str, str2, "direct_open_question_tab", "impression", "prompt", AbstractC16850sd.A0M(new C09530e4("prompt_type", directPromptTypes.A01)));
                return;
            }
        }
        C36293Fzn.A00(EnumC33514Ern.A0N, EnumC33512Erl.THREAD_VIEW, (C36293Fzn) this.A04.getValue(), "direct_open_question_tab", "impression", AbstractC16850sd.A0M(new C09530e4("prompt_type", directPromptTypes.A01)));
    }

    public final void A02(DirectPromptTypes directPromptTypes, String str, String str2, int i, int i2) {
        if (i != 28) {
            if (i != 29) {
                if (i != 61) {
                    return;
                }
            } else {
                C36288Fzi.A00((C36288Fzi) this.A02.getValue(), Integer.valueOf(i2), str, str2, "remove_user_response_attempt", "tap", PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, AbstractC16850sd.A0M(new C09530e4("prompt_type", directPromptTypes.A01)));
                return;
            }
        }
        C36293Fzn.A01((C36293Fzn) this.A04.getValue(), "remove_user_response_attempt", "tap", AbstractC16850sd.A0M(new C09530e4("prompt_type", directPromptTypes.A01)));
    }

    public final void A03(DirectPromptTypes directPromptTypes, String str, String str2, int i, int i2) {
        if (i != 28) {
            if (i != 29) {
                if (i != 61) {
                    return;
                }
            } else {
                C36288Fzi.A00((C36288Fzi) this.A02.getValue(), Integer.valueOf(i2), str, str2, "remove_user_response_error", "impression", PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, AbstractC16850sd.A0M(new C09530e4("prompt_type", directPromptTypes.A01)));
                return;
            }
        }
        C36293Fzn.A01((C36293Fzn) this.A04.getValue(), "remove_user_response_error", "impression", AbstractC16850sd.A0M(new C09530e4("prompt_type", directPromptTypes.A01)));
    }

    public final void A04(DirectPromptTypes directPromptTypes, String str, String str2, int i, int i2) {
        if (i != 28) {
            if (i != 29) {
                if (i != 61) {
                    return;
                }
            } else {
                C36288Fzi.A00((C36288Fzi) this.A02.getValue(), Integer.valueOf(i2), str, str2, "remove_user_response_success", "impression", PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, AbstractC16850sd.A0M(new C09530e4("prompt_type", directPromptTypes.A01)));
                return;
            }
        }
        C36293Fzn.A01((C36293Fzn) this.A04.getValue(), "remove_user_response_success", "impression", AbstractC16850sd.A0M(new C09530e4("prompt_type", directPromptTypes.A01)));
    }

    public final void A05(DirectPromptTypes directPromptTypes, String str, String str2, int i, int i2) {
        if (i != 28) {
            if (i != 29) {
                if (i != 61) {
                    return;
                }
            } else {
                C36288Fzi.A00((C36288Fzi) this.A02.getValue(), Integer.valueOf(i2), str, str2, "direct_question_sticker", "tap", "prompt", AbstractC16850sd.A0M(new C09530e4("prompt_type", directPromptTypes.A01)));
                return;
            }
        }
        C36293Fzn.A00(EnumC33514Ern.A0N, EnumC33512Erl.THREAD_VIEW, (C36293Fzn) this.A04.getValue(), "direct_question_sticker", "tap", AbstractC16850sd.A0M(new C09530e4("prompt_type", directPromptTypes.A01)));
    }

    public final void A06(DirectPromptTypes directPromptTypes, String str, String str2, int i, int i2) {
        if (i != 28) {
            if (i != 29) {
                if (i != 61) {
                    return;
                }
            } else {
                C36288Fzi.A00((C36288Fzi) this.A02.getValue(), Integer.valueOf(i2), str, str2, "unsend_response_attempt", "tap", PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, AbstractC16850sd.A0M(new C09530e4("prompt_type", directPromptTypes.A01)));
                return;
            }
        }
        C36293Fzn.A01((C36293Fzn) this.A04.getValue(), "unsend_response_attempt", "tap", AbstractC16850sd.A0M(new C09530e4("prompt_type", directPromptTypes.A01)));
    }

    public final void A07(DirectPromptTypes directPromptTypes, String str, String str2, int i, int i2) {
        if (i != 28) {
            if (i != 29) {
                if (i != 61) {
                    return;
                }
            } else {
                C36288Fzi.A00((C36288Fzi) this.A02.getValue(), Integer.valueOf(i2), str, str2, "unsend_response_error", "impression", PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, AbstractC16850sd.A0M(new C09530e4("prompt_type", directPromptTypes.A01)));
                return;
            }
        }
        C36293Fzn.A01((C36293Fzn) this.A04.getValue(), "unsend_response_error", "impression", AbstractC16850sd.A0M(new C09530e4("prompt_type", directPromptTypes.A01)));
    }

    public final void A08(DirectPromptTypes directPromptTypes, String str, String str2, int i, int i2) {
        if (i != 28) {
            if (i != 29) {
                if (i != 61) {
                    return;
                }
            } else {
                C36288Fzi.A00((C36288Fzi) this.A02.getValue(), Integer.valueOf(i2), str, str2, "unsend_response_success", "impression", PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, AbstractC16850sd.A0M(new C09530e4("prompt_type", directPromptTypes.A01)));
                return;
            }
        }
        C36293Fzn.A01((C36293Fzn) this.A04.getValue(), "unsend_response_success", "impression", AbstractC16850sd.A0M(new C09530e4("prompt_type", directPromptTypes.A01)));
    }

    public final void A09(DirectPromptTypes directPromptTypes, String str, String str2, int i, int i2, boolean z) {
        String str3;
        String str4;
        if (i != 28) {
            if (i != 29) {
                if (i != 61) {
                    ((FRk) this.A05.getValue()).A05(directPromptTypes, false);
                    return;
                }
            } else {
                C36288Fzi c36288Fzi = (C36288Fzi) this.A02.getValue();
                Integer valueOf = Integer.valueOf(i2);
                C09530e4 c09530e4 = new C09530e4("prompt_type", directPromptTypes.A01);
                if (z) {
                    str4 = "True";
                } else {
                    str4 = "False";
                }
                C36288Fzi.A00(c36288Fzi, valueOf, str, str2, "direct_question_tab_send_attempt", "tap", "prompt", AbstractC06930Yk.A06(c09530e4, new C09530e4("did_user_tap_on_dice_roll", str4)));
                return;
            }
        }
        C36293Fzn c36293Fzn = (C36293Fzn) this.A04.getValue();
        EnumC33514Ern enumC33514Ern = EnumC33514Ern.A0N;
        EnumC33512Erl enumC33512Erl = EnumC33512Erl.THREAD_VIEW;
        C09530e4 c09530e42 = new C09530e4("prompt_type", directPromptTypes.A01);
        if (z) {
            str3 = "True";
        } else {
            str3 = "False";
        }
        C36293Fzn.A00(enumC33514Ern, enumC33512Erl, c36293Fzn, "direct_question_tab_send_attempt", "tap", AbstractC06930Yk.A06(c09530e42, new C09530e4("did_user_tap_on_dice_roll", str3)));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.A03(C7FQ.class);
    }

    public C7FQ(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }
}
