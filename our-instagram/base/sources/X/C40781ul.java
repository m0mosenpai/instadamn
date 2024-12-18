package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1ul, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C40781ul extends C40791um implements InterfaceC40821up {
    public boolean mCanSeeBroadcastChats;
    public boolean mCanSeeNotes;
    public String mCategory;
    public FNM mCheckpoint;
    public String mCheckpointUrl;
    public String mClientFacingErrorMessage;
    public IGK mConsentData;
    public String mDialogueType;
    public String mEnrollmentTime;
    public String mErrorBody;
    public String mErrorCode;
    public String mErrorMessage;
    public String mErrorSource;
    public List mErrorStrings;
    public String mErrorTitle;
    public String mErrorType;
    public String mExpirationTime;
    public String mFeedbackAction;
    public String mFeedbackAppealLabel;
    public String mFeedbackIgnoreLabel;
    public String mFeedbackMessage;
    public boolean mFeedbackRequired;
    public String mFeedbackTitle;
    public String mFeedbackUrl;
    public boolean mIsEpdError;
    public String mLocalizedErrorMessage;
    public boolean mLockCheckpointDialog;
    public String mLogoutReason;
    public boolean mNewsURLIsRegulated;
    public String mReasonsThrown;
    public String mResponsiblePolicy;
    public String mRestrictionDetailUseCase;
    public String mRestrictionExtraData;
    public String mRestrictionType;
    public boolean mSentryBlockRestrictionDialogueUnificationEnabled;
    public boolean mSpam;
    public String mStatus;
    public List mSystemMessages;
    public C34504FIq mXpostingSendStatus;

    @Override // X.InterfaceC40821up
    public boolean getCanSeeBroadcastChats() {
        return this.mCanSeeBroadcastChats;
    }

    @Override // X.InterfaceC40821up
    public boolean getCanSeeNotes() {
        return this.mCanSeeNotes;
    }

    @Override // X.InterfaceC40821up
    public String getCategory() {
        return this.mCategory;
    }

    @Override // X.InterfaceC40821up
    public FNM getCheckpoint() {
        return this.mCheckpoint;
    }

    @Override // X.InterfaceC40821up
    public String getCheckpointUrl() {
        return this.mCheckpointUrl;
    }

    @Override // X.InterfaceC40821up
    public String getClientFacingErrorMessage() {
        return this.mClientFacingErrorMessage;
    }

    @Override // X.InterfaceC40821up
    public IGK getConsentData() {
        return this.mConsentData;
    }

    @Override // X.InterfaceC40821up
    public String getDialogueType() {
        return this.mDialogueType;
    }

    @Override // X.InterfaceC40821up
    public String getEnrollmentTime() {
        return this.mEnrollmentTime;
    }

    @Override // X.InterfaceC40821up
    public String getErrorBody() {
        return this.mErrorBody;
    }

    @Override // X.InterfaceC40821up
    public String getErrorCode() {
        return this.mErrorCode;
    }

    @Override // X.InterfaceC40821up
    public String getErrorMessage() {
        return this.mErrorMessage;
    }

    @Override // X.InterfaceC40821up
    public String getErrorSource() {
        return this.mErrorSource;
    }

    @Override // X.InterfaceC40821up
    public List getErrorStrings() {
        return this.mErrorStrings;
    }

    @Override // X.InterfaceC40821up
    public String getErrorTitle() {
        return this.mErrorTitle;
    }

    @Override // X.InterfaceC40821up
    public String getErrorType() {
        return this.mErrorType;
    }

    @Override // X.InterfaceC40821up
    public String getExpirationTime() {
        return this.mExpirationTime;
    }

    @Override // X.InterfaceC40821up
    public String getFeedbackAction() {
        return this.mFeedbackAction;
    }

    @Override // X.InterfaceC40821up
    public String getFeedbackAppealLabel() {
        return this.mFeedbackAppealLabel;
    }

    @Override // X.InterfaceC40821up
    public String getFeedbackIgnoreLabel() {
        return this.mFeedbackIgnoreLabel;
    }

    @Override // X.InterfaceC40821up
    public String getFeedbackMessage() {
        return this.mFeedbackMessage;
    }

    @Override // X.InterfaceC40821up
    public String getFeedbackTitle() {
        return this.mFeedbackTitle;
    }

    @Override // X.InterfaceC40821up
    public String getFeedbackUrl() {
        return this.mFeedbackUrl;
    }

    @Override // X.InterfaceC40821up
    public String getLocalizedErrorMessage() {
        return this.mLocalizedErrorMessage;
    }

    @Override // X.InterfaceC40821up
    public String getLogoutReason() {
        return this.mLogoutReason;
    }

    @Override // X.InterfaceC40821up
    public boolean getNewsURLIsRegulated() {
        return this.mNewsURLIsRegulated;
    }

    @Override // X.InterfaceC40821up
    public String getReasonsThrown() {
        return this.mReasonsThrown;
    }

    @Override // X.InterfaceC40821up
    public String getResponsiblePolicy() {
        return this.mResponsiblePolicy;
    }

    @Override // X.InterfaceC40821up
    public String getRestrictionDetailUseCase() {
        return this.mRestrictionDetailUseCase;
    }

    @Override // X.InterfaceC40821up
    public String getRestrictionExtraData() {
        return this.mRestrictionExtraData;
    }

    @Override // X.InterfaceC40821up
    public String getRestrictionType() {
        return this.mRestrictionType;
    }

    @Override // X.InterfaceC40821up
    public boolean getSentryBlockRestrictionDialogueUnificationEnabled() {
        return this.mSentryBlockRestrictionDialogueUnificationEnabled;
    }

    @Override // X.InterfaceC40821up
    public boolean getShouldShowWebviewCancelButton() {
        return !this.mLockCheckpointDialog;
    }

    @Override // X.InterfaceC40821up
    public boolean getSpam() {
        return this.mSpam;
    }

    @Override // X.InterfaceC40821up
    public String getStatus() {
        String str = this.mStatus;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC40821up
    public List getSystemMessages() {
        return this.mSystemMessages;
    }

    public C34504FIq getXpostingSendStatus() {
        return this.mXpostingSendStatus;
    }

    public boolean hasErrorType(String str) {
        String str2 = this.mErrorType;
        if (str2 != null && str2.equals(str)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC40821up
    public boolean isCheckpointRequired() {
        String str = this.mErrorMessage;
        if (!"checkpoint_required".equals(str) && !"challenge_required".equals(str)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC40821up
    public boolean isConsentRequired() {
        return "consent_required".equals(this.mErrorMessage);
    }

    @Override // X.InterfaceC40821up
    public boolean isDelegateAccessBlocked() {
        return "delegate_access_blocked".equals(this.mErrorMessage);
    }

    @Override // X.InterfaceC40821up
    public boolean isEpdError() {
        return this.mIsEpdError;
    }

    @Override // X.InterfaceC40821up
    public boolean isFeedbackRequired() {
        if (!this.mFeedbackRequired && !"feedback_required".equals(this.mErrorMessage)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC40821up
    public boolean isLoginRequired() {
        return "login_required".equals(this.mErrorMessage);
    }

    public boolean isNoContent() {
        if (this.mStatusCode != 204) {
            return false;
        }
        return true;
    }

    public boolean isViolatingBrandedContentPolicy() {
        return "branded_content_policy_violated".equals(this.mErrorMessage);
    }

    public void setStatus(String str) {
        this.mStatus = str;
    }

    @Override // X.C40791um, X.InterfaceC40801un
    public boolean isOk() {
        return "ok".equals(getStatus());
    }

    public void parseError(C16L c16l) {
        C16R A11 = c16l.A11();
        if (A11 == C16R.A0D) {
            ArrayList arrayList = new ArrayList();
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (A0q != null && A0q.equals("errors")) {
                    c16l.A1J();
                    if (c16l.A11() == C16R.A0C) {
                        while (c16l.A1J() != C16R.A08) {
                            arrayList.add(c16l.A1P());
                        }
                    }
                } else {
                    c16l.A0z();
                }
            }
            this.mErrorStrings = arrayList;
            return;
        }
        if (A11 == C16R.A0C) {
            c16l.A0z();
        } else {
            this.mErrorMessage = c16l.A1P();
        }
    }

    public boolean hasErrorType() {
        if (this.mErrorType == null) {
            return false;
        }
        return true;
    }
}
