package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.challenge.activity.ChallengeActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.3Na, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC72533Na {
    /* JADX WARN: Type inference failed for: r2v5, types: [X.FNM, java.lang.Object] */
    public static final void A00(InterfaceC40821up interfaceC40821up, AbstractC12990ll abstractC12990ll, String str) {
        String str2;
        String str3;
        AbstractC12990ll abstractC12990ll2;
        String A02;
        C3II c3ii;
        Float f;
        C14360o3.A0B(interfaceC40821up, 1);
        List<C33598EtA> systemMessages = interfaceC40821up.getSystemMessages();
        if (systemMessages != null) {
            for (C33598EtA c33598EtA : systemMessages) {
                if (c33598EtA != null) {
                    synchronized (C2Sm.class) {
                        String str4 = c33598EtA.A01;
                        InterfaceC42241xE interfaceC42241xE = (InterfaceC42241xE) C2Sm.A00.get(str4);
                        if (interfaceC42241xE != null) {
                            C19740y2 A00 = AbstractC19730y1.A00(AbstractC12960li.A00);
                            C14360o3.A0B(str4, 0);
                            String A0R = AnonymousClass001.A0R("system_message_", str4);
                            InterfaceC19630xq interfaceC19630xq = A00.A00;
                            if (interfaceC19630xq.contains(A0R)) {
                                f = Float.valueOf(interfaceC19630xq.getFloat(A0R, -1.0f));
                            } else {
                                f = null;
                            }
                            float f2 = c33598EtA.A00;
                            if (f == null || f.floatValue() < f2) {
                                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                                ARD.E7A(AnonymousClass001.A0R("system_message_", str4), f2);
                                ARD.apply();
                                interfaceC42241xE.accept(abstractC12990ll);
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        if (!interfaceC40821up.isOk() && !abstractC12990ll.hasEnded()) {
            if (!(abstractC12990ll instanceof UserSession) || ((UserSession) abstractC12990ll).isManaged) {
                if (interfaceC40821up.isFeedbackRequired() && C28121Xq.A00 != null) {
                    c3ii = new C3II(abstractC12990ll, new C35027Fc0(interfaceC40821up.getFeedbackTitle(), interfaceC40821up.getFeedbackMessage(), interfaceC40821up.getFeedbackAppealLabel(), interfaceC40821up.getFeedbackAction(), interfaceC40821up.getFeedbackIgnoreLabel(), interfaceC40821up.getFeedbackUrl(), interfaceC40821up.getEnrollmentTime(), interfaceC40821up.getExpirationTime(), interfaceC40821up.getDialogueType(), interfaceC40821up.getErrorCode(), interfaceC40821up.getReasonsThrown(), interfaceC40821up.getSpam(), interfaceC40821up.getSentryBlockRestrictionDialogueUnificationEnabled()), interfaceC40821up.getRestrictionDetailUseCase(), interfaceC40821up.getRestrictionType(), interfaceC40821up.getResponsiblePolicy(), interfaceC40821up.getCategory(), interfaceC40821up.getRestrictionExtraData());
                } else {
                    if (interfaceC40821up.isLoginRequired()) {
                        C1VL c1vl = C1VL.A00;
                        if (c1vl != null) {
                            c1vl.A00(abstractC12990ll, "login_required_response_from_server", interfaceC40821up.getErrorTitle(), interfaceC40821up.getErrorBody(), interfaceC40821up.getLogoutReason(), str);
                            return;
                        } else {
                            str2 = "IG_API_UTIL";
                            str3 = "IgApiLoginRequiredErrorHandler.getInstance() hasn't been initialized yet.";
                        }
                    } else if (interfaceC40821up.isCheckpointRequired()) {
                        FNM checkpoint = interfaceC40821up.getCheckpoint();
                        FNM fnm = checkpoint;
                        if (checkpoint == null) {
                            String checkpointUrl = interfaceC40821up.getCheckpointUrl();
                            if (checkpointUrl != null && checkpointUrl.length() != 0) {
                                boolean shouldShowWebviewCancelButton = interfaceC40821up.getShouldShowWebviewCancelButton();
                                ?? obj = new Object();
                                obj.A02 = checkpointUrl;
                                obj.A05 = shouldShowWebviewCancelButton;
                                fnm = obj;
                            } else {
                                str2 = "checkpoint";
                                str3 = "Checkpoint is required but none was provided.";
                            }
                        }
                        if (fnm.A04 && C28121Xq.A00 != null) {
                            c3ii = new C3II(abstractC12990ll, new C35027Fc0());
                        } else {
                            G06 A002 = FTX.A00(abstractC12990ll);
                            C14360o3.A07(A002);
                            A002.A02(abstractC12990ll.getDeviceSession().A06(), fnm);
                            return;
                        }
                    } else if (interfaceC40821up.isConsentRequired()) {
                        IGK consentData = interfaceC40821up.getConsentData();
                        if (consentData != null) {
                            G06 A003 = FTX.A00(abstractC12990ll);
                            C14360o3.A07(A003);
                            Context A06 = abstractC12990ll.getDeviceSession().A06();
                            synchronized (A003) {
                                if (A003.A03 && !A003.A02 && !A003.A05 && (A02 = AbstractC03270Dk.A02((abstractC12990ll2 = A003.A06))) != null && C0BQ.A00(abstractC12990ll2).CPH(A02)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("ConsentFragment.param.headline", consentData.A02);
                                    bundle.putString("ConsentFragment.param.content", consentData.A01);
                                    bundle.putString("ConsentFragment.param.button.text", consentData.A00);
                                    A003.A05 = true;
                                    String token = abstractC12990ll2.getToken();
                                    C14360o3.A0B(token, 0);
                                    Intent intent = new Intent(A06, (Class<?>) ChallengeActivity.class);
                                    intent.addFlags(335544320);
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString(AbstractC111324zv.A00(3531), "consent");
                                    bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", token);
                                    bundle2.putBundle(AbstractC111324zv.A00(3530), bundle);
                                    intent.putExtras(bundle2);
                                    try {
                                        C12260kU.A0C(A06, intent);
                                    } catch (IllegalStateException e) {
                                        C0w9.A07(AbstractC111324zv.A00(296), e);
                                    }
                                }
                            }
                            return;
                        }
                        str2 = "consent";
                        str3 = "consent data is required but none was provided.";
                    } else {
                        if (!interfaceC40821up.isDelegateAccessBlocked()) {
                            return;
                        }
                        String errorBody = interfaceC40821up.getErrorBody();
                        String errorMessage = interfaceC40821up.getErrorMessage();
                        if (errorBody == null) {
                            return;
                        }
                        if (errorMessage == null) {
                            errorMessage = "unknown";
                        }
                        C146106i8 c146106i8 = new C146106i8();
                        c146106i8.A0D = errorBody;
                        c146106i8.A05();
                        c146106i8.A0H = errorMessage;
                        AbstractC35176FfT.A03(new C3KD(c146106i8.A00()));
                        return;
                    }
                    C0w9.A03(str2, str3);
                    return;
                }
                C41451vu.A01.E4s(c3ii);
            }
        }
    }
}
