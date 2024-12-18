package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.2hA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C55702hA {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.1um, X.1ul] */
    public static C40781ul parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                A01(c16l, c40791um, A0q);
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C40781ul c40781ul) {
        if (c40781ul.mSystemMessages != null) {
            C16V.A03(anonymousClass182, "_messages");
            for (C33598EtA c33598EtA : c40781ul.mSystemMessages) {
                if (c33598EtA != null) {
                    anonymousClass182.A0d();
                    String str = c33598EtA.A01;
                    if (str != null) {
                        anonymousClass182.A0S("key", str);
                    }
                    anonymousClass182.A0P("time", c33598EtA.A00);
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        String str2 = c40781ul.mErrorMessage;
        if (str2 != null) {
            anonymousClass182.A0S(DialogModule.KEY_MESSAGE, str2);
        }
        String str3 = c40781ul.mErrorType;
        if (str3 != null) {
            anonymousClass182.A0S("error_type", str3);
        }
        String str4 = c40781ul.mErrorSource;
        if (str4 != null) {
            anonymousClass182.A0S("error_source", str4);
        }
        String str5 = c40781ul.mErrorTitle;
        if (str5 != null) {
            anonymousClass182.A0S("error_title", str5);
        }
        String str6 = c40781ul.mErrorBody;
        if (str6 != null) {
            anonymousClass182.A0S("error_body", str6);
        }
        String str7 = c40781ul.mClientFacingErrorMessage;
        if (str7 != null) {
            anonymousClass182.A0S("client_facing_error_message", str7);
        }
        anonymousClass182.A0T("is_epd_error", c40781ul.mIsEpdError);
        anonymousClass182.A0T("can_see_notes", c40781ul.mCanSeeNotes);
        anonymousClass182.A0T("can_see_broadcast_chats", c40781ul.mCanSeeBroadcastChats);
        String str8 = c40781ul.mLogoutReason;
        if (str8 != null) {
            anonymousClass182.A0S("logout_reason", str8);
        }
        String str9 = c40781ul.mCheckpointUrl;
        if (str9 != null) {
            anonymousClass182.A0S("checkpoint_url", str9);
        }
        if (c40781ul.mCheckpoint != null) {
            anonymousClass182.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE);
            FNM fnm = c40781ul.mCheckpoint;
            anonymousClass182.A0d();
            String str10 = fnm.A02;
            if (str10 != null) {
                anonymousClass182.A0S("url", str10);
            }
            anonymousClass182.A0T("lock", fnm.A05);
            String str11 = fnm.A00;
            if (str11 != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(1920), str11);
            }
            anonymousClass182.A0T(AbstractC111324zv.A00(2450), fnm.A03);
            String str12 = fnm.A01;
            if (str12 != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(4073), str12);
            }
            anonymousClass182.A0T(AbstractC111324zv.A00(2602), fnm.A04);
            anonymousClass182.A0a();
        }
        if (c40781ul.mConsentData != null) {
            anonymousClass182.A0r("consent_data");
            IGK igk = c40781ul.mConsentData;
            anonymousClass182.A0d();
            String str13 = igk.A02;
            if (str13 != null) {
                anonymousClass182.A0S("headline", str13);
            }
            String str14 = igk.A01;
            if (str14 != null) {
                anonymousClass182.A0S("content", str14);
            }
            String str15 = igk.A00;
            if (str15 != null) {
                anonymousClass182.A0S("button_text", str15);
            }
            anonymousClass182.A0a();
        }
        String str16 = c40781ul.mStatus;
        if (str16 != null) {
            anonymousClass182.A0S(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, str16);
        }
        anonymousClass182.A0T("lock", c40781ul.mLockCheckpointDialog);
        anonymousClass182.A0T("feedback_required", c40781ul.mFeedbackRequired);
        String str17 = c40781ul.mFeedbackTitle;
        if (str17 != null) {
            anonymousClass182.A0S("feedback_title", str17);
        }
        String str18 = c40781ul.mFeedbackMessage;
        if (str18 != null) {
            anonymousClass182.A0S("feedback_message", str18);
        }
        String str19 = c40781ul.mFeedbackAppealLabel;
        if (str19 != null) {
            anonymousClass182.A0S("feedback_appeal_label", str19);
        }
        String str20 = c40781ul.mFeedbackIgnoreLabel;
        if (str20 != null) {
            anonymousClass182.A0S("feedback_ignore_label", str20);
        }
        String str21 = c40781ul.mFeedbackAction;
        if (str21 != null) {
            anonymousClass182.A0S("feedback_action", str21);
        }
        String str22 = c40781ul.mFeedbackUrl;
        if (str22 != null) {
            anonymousClass182.A0S("feedback_url", str22);
        }
        String str23 = c40781ul.mLocalizedErrorMessage;
        if (str23 != null) {
            anonymousClass182.A0S("localized_error_message", str23);
        }
        anonymousClass182.A0T("is_spam", c40781ul.mSpam);
        anonymousClass182.A0T("sentry_block_restriction_dialogue_unification_enabled", c40781ul.mSentryBlockRestrictionDialogueUnificationEnabled);
        String str24 = c40781ul.mRestrictionDetailUseCase;
        if (str24 != null) {
            anonymousClass182.A0S("restriction_detail_use_case", str24);
        }
        String str25 = c40781ul.mRestrictionType;
        if (str25 != null) {
            anonymousClass182.A0S("restriction_type", str25);
        }
        String str26 = c40781ul.mEnrollmentTime;
        if (str26 != null) {
            anonymousClass182.A0S("enrollment_time", str26);
        }
        String str27 = c40781ul.mExpirationTime;
        if (str27 != null) {
            anonymousClass182.A0S("expiration_time", str27);
        }
        String str28 = c40781ul.mRestrictionExtraData;
        if (str28 != null) {
            anonymousClass182.A0S("restriction_extra_data", str28);
        }
        String str29 = c40781ul.mDialogueType;
        if (str29 != null) {
            anonymousClass182.A0S("dialogue_type", str29);
        }
        String str30 = c40781ul.mResponsiblePolicy;
        if (str30 != null) {
            anonymousClass182.A0S("responsible_policy", str30);
        }
        String str31 = c40781ul.mCategory;
        if (str31 != null) {
            anonymousClass182.A0S("category", str31);
        }
        String str32 = c40781ul.mErrorCode;
        if (str32 != null) {
            anonymousClass182.A0S(TraceFieldType.ErrorCode, str32);
        }
        String str33 = c40781ul.mReasonsThrown;
        if (str33 != null) {
            anonymousClass182.A0S("reasons_thrown", str33);
        }
        anonymousClass182.A0T("news_url_is_regulated", c40781ul.mNewsURLIsRegulated);
        if (c40781ul.mXpostingSendStatus != null) {
            anonymousClass182.A0r("xposting_send_status");
            C34504FIq c34504FIq = c40781ul.mXpostingSendStatus;
            anonymousClass182.A0d();
            String str34 = c34504FIq.A01;
            if (str34 != null) {
                anonymousClass182.A0S(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, str34);
            }
            String str35 = c34504FIq.A00;
            if (str35 != null) {
                anonymousClass182.A0S("error_message", str35);
            }
            anonymousClass182.A0a();
        }
    }

    public static boolean A01(C16L c16l, C40781ul c40781ul, String str) {
        String str2 = null;
        ArrayList arrayList = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        if ("_messages".equals(str)) {
            if (c16l.A11() == C16R.A0C) {
                arrayList = new ArrayList();
                while (c16l.A1J() != C16R.A08) {
                    C33598EtA parseFromJson = AbstractC33654Eu4.parseFromJson(c16l);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            c40781ul.mSystemMessages = arrayList;
            return true;
        }
        if (DialogModule.KEY_MESSAGE.equals(str)) {
            c40781ul.parseError(c16l);
            return true;
        }
        if ("error_type".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str3 = c16l.A1P();
            }
            c40781ul.mErrorType = str3;
            return true;
        }
        if ("error_source".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str4 = c16l.A1P();
            }
            c40781ul.mErrorSource = str4;
            return true;
        }
        if ("error_title".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str5 = c16l.A1P();
            }
            c40781ul.mErrorTitle = str5;
            return true;
        }
        if ("error_body".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str6 = c16l.A1P();
            }
            c40781ul.mErrorBody = str6;
            return true;
        }
        if ("client_facing_error_message".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str7 = c16l.A1P();
            }
            c40781ul.mClientFacingErrorMessage = str7;
            return true;
        }
        if ("is_epd_error".equals(str)) {
            c40781ul.mIsEpdError = c16l.A0d();
            return true;
        }
        if ("can_see_notes".equals(str)) {
            c40781ul.mCanSeeNotes = c16l.A0d();
            return true;
        }
        if ("can_see_broadcast_chats".equals(str)) {
            c40781ul.mCanSeeBroadcastChats = c16l.A0d();
            return true;
        }
        if ("logout_reason".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str8 = c16l.A1P();
            }
            c40781ul.mLogoutReason = str8;
            return true;
        }
        if ("checkpoint_url".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str9 = c16l.A1P();
            }
            c40781ul.mCheckpointUrl = str9;
            return true;
        }
        if (PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE.equals(str)) {
            c40781ul.mCheckpoint = AbstractC34036F0p.parseFromJson(c16l);
            return true;
        }
        if ("consent_data".equals(str)) {
            c40781ul.mConsentData = AbstractC40545HyR.parseFromJson(c16l);
            return true;
        }
        if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str10 = c16l.A1P();
            }
            c40781ul.mStatus = str10;
            return true;
        }
        if ("lock".equals(str)) {
            c40781ul.mLockCheckpointDialog = c16l.A0d();
            return true;
        }
        if ("feedback_required".equals(str)) {
            c40781ul.mFeedbackRequired = c16l.A0d();
            return true;
        }
        if ("feedback_title".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str11 = c16l.A1P();
            }
            c40781ul.mFeedbackTitle = str11;
            return true;
        }
        if ("feedback_message".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str12 = c16l.A1P();
            }
            c40781ul.mFeedbackMessage = str12;
            return true;
        }
        if ("feedback_appeal_label".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str13 = c16l.A1P();
            }
            c40781ul.mFeedbackAppealLabel = str13;
            return true;
        }
        if ("feedback_ignore_label".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str14 = c16l.A1P();
            }
            c40781ul.mFeedbackIgnoreLabel = str14;
            return true;
        }
        if ("feedback_action".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str15 = c16l.A1P();
            }
            c40781ul.mFeedbackAction = str15;
            return true;
        }
        if ("feedback_url".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str16 = c16l.A1P();
            }
            c40781ul.mFeedbackUrl = str16;
            return true;
        }
        if ("localized_error_message".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str17 = c16l.A1P();
            }
            c40781ul.mLocalizedErrorMessage = str17;
            return true;
        }
        if ("is_spam".equals(str)) {
            c40781ul.mSpam = c16l.A0d();
            return true;
        }
        if ("sentry_block_restriction_dialogue_unification_enabled".equals(str)) {
            c40781ul.mSentryBlockRestrictionDialogueUnificationEnabled = c16l.A0d();
            return true;
        }
        if ("restriction_detail_use_case".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str18 = c16l.A1P();
            }
            c40781ul.mRestrictionDetailUseCase = str18;
            return true;
        }
        if ("restriction_type".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str19 = c16l.A1P();
            }
            c40781ul.mRestrictionType = str19;
            return true;
        }
        if ("enrollment_time".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str20 = c16l.A1P();
            }
            c40781ul.mEnrollmentTime = str20;
            return true;
        }
        if ("expiration_time".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str21 = c16l.A1P();
            }
            c40781ul.mExpirationTime = str21;
            return true;
        }
        if ("restriction_extra_data".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str22 = c16l.A1P();
            }
            c40781ul.mRestrictionExtraData = str22;
            return true;
        }
        if ("dialogue_type".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str23 = c16l.A1P();
            }
            c40781ul.mDialogueType = str23;
            return true;
        }
        if ("responsible_policy".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str24 = c16l.A1P();
            }
            c40781ul.mResponsiblePolicy = str24;
            return true;
        }
        if ("category".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str25 = c16l.A1P();
            }
            c40781ul.mCategory = str25;
            return true;
        }
        if (TraceFieldType.ErrorCode.equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str26 = c16l.A1P();
            }
            c40781ul.mErrorCode = str26;
            return true;
        }
        if ("reasons_thrown".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str2 = c16l.A1P();
            }
            c40781ul.mReasonsThrown = str2;
            return true;
        }
        if ("news_url_is_regulated".equals(str)) {
            c40781ul.mNewsURLIsRegulated = c16l.A0d();
            return true;
        }
        if ("xposting_send_status".equals(str)) {
            c40781ul.mXpostingSendStatus = F4V.parseFromJson(c16l);
            return true;
        }
        return false;
    }
}
