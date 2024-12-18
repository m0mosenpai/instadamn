package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.YDu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73451YDu implements C3DC, InterfaceC168867gL {
    public final H9G A00;
    public final boolean A01;
    public final String A02;

    @Override // X.InterfaceC40821up
    public final boolean getCanSeeBroadcastChats() {
        return this.A00.getCanSeeBroadcastChats();
    }

    @Override // X.InterfaceC40821up
    public final boolean getCanSeeNotes() {
        return this.A00.getCanSeeNotes();
    }

    @Override // X.InterfaceC40821up
    public final String getCategory() {
        return this.A00.getCategory();
    }

    @Override // X.InterfaceC40821up
    public final String getClientFacingErrorMessage() {
        return this.A00.getClientFacingErrorMessage();
    }

    @Override // X.InterfaceC40821up
    public final String getErrorCode() {
        return this.A00.getErrorCode();
    }

    @Override // X.InterfaceC40821up
    public final String getErrorMessage() {
        return this.A00.getErrorMessage();
    }

    @Override // X.InterfaceC40821up
    public final String getStatus() {
        String status = this.A00.getStatus();
        C14360o3.A07(status);
        return status;
    }

    @Override // X.InterfaceC40821up
    public final boolean isCheckpointRequired() {
        return this.A00.isCheckpointRequired();
    }

    @Override // X.InterfaceC40821up
    public final boolean isConsentRequired() {
        return this.A00.isConsentRequired();
    }

    @Override // X.InterfaceC40821up
    public final boolean isDelegateAccessBlocked() {
        return this.A00.isDelegateAccessBlocked();
    }

    @Override // X.InterfaceC40821up
    public final boolean isEpdError() {
        return this.A00.isEpdError();
    }

    @Override // X.InterfaceC40821up
    public final boolean isFeedbackRequired() {
        return this.A00.isFeedbackRequired();
    }

    @Override // X.InterfaceC40821up
    public final boolean isLoginRequired() {
        return this.A00.isLoginRequired();
    }

    @Override // X.InterfaceC40801un
    public final boolean isOk() {
        return this.A00.isOk();
    }

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        XVT xvt = this.A00.A00;
        if (xvt == null) {
            AbstractC31171DnF.A0w();
            throw C00O.createAndThrow();
        }
        return xvt;
    }

    @Override // X.InterfaceC40821up
    public final FNM getCheckpoint() {
        return this.A00.mCheckpoint;
    }

    @Override // X.InterfaceC40821up
    public final String getCheckpointUrl() {
        return this.A00.mCheckpointUrl;
    }

    @Override // X.InterfaceC40821up
    public final IGK getConsentData() {
        return this.A00.mConsentData;
    }

    @Override // X.InterfaceC40821up
    public final String getDialogueType() {
        return this.A00.mDialogueType;
    }

    @Override // X.InterfaceC40821up
    public final String getEnrollmentTime() {
        return this.A00.mEnrollmentTime;
    }

    @Override // X.InterfaceC40821up
    public final String getErrorBody() {
        return this.A00.mErrorBody;
    }

    @Override // X.InterfaceC40821up
    public final String getErrorSource() {
        return this.A00.mErrorSource;
    }

    @Override // X.InterfaceC40821up
    public final List getErrorStrings() {
        return this.A00.mErrorStrings;
    }

    @Override // X.InterfaceC40821up
    public final String getErrorTitle() {
        return this.A00.mErrorTitle;
    }

    @Override // X.InterfaceC40821up
    public final String getErrorType() {
        return this.A00.mErrorType;
    }

    @Override // X.InterfaceC40821up
    public final String getExpirationTime() {
        return this.A00.mExpirationTime;
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackAction() {
        return this.A00.mFeedbackAction;
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackAppealLabel() {
        return this.A00.mFeedbackAppealLabel;
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackIgnoreLabel() {
        return this.A00.mFeedbackIgnoreLabel;
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackMessage() {
        return this.A00.mFeedbackMessage;
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackTitle() {
        return this.A00.mFeedbackTitle;
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackUrl() {
        return this.A00.mFeedbackUrl;
    }

    @Override // X.InterfaceC40821up
    public final String getLocalizedErrorMessage() {
        return this.A00.mLocalizedErrorMessage;
    }

    @Override // X.InterfaceC40821up
    public final String getLogoutReason() {
        return this.A00.mLogoutReason;
    }

    @Override // X.InterfaceC40821up
    public final boolean getNewsURLIsRegulated() {
        return this.A00.mNewsURLIsRegulated;
    }

    @Override // X.InterfaceC40821up
    public final String getReasonsThrown() {
        return this.A00.mReasonsThrown;
    }

    @Override // X.InterfaceC40801un
    public final long getResponseTimestamp() {
        return this.A00.mResponseTimestamp;
    }

    @Override // X.InterfaceC40821up
    public final String getResponsiblePolicy() {
        return this.A00.mResponsiblePolicy;
    }

    @Override // X.InterfaceC40821up
    public final String getRestrictionDetailUseCase() {
        return this.A00.mRestrictionDetailUseCase;
    }

    @Override // X.InterfaceC40821up
    public final String getRestrictionExtraData() {
        return this.A00.mRestrictionExtraData;
    }

    @Override // X.InterfaceC40821up
    public final String getRestrictionType() {
        return this.A00.mRestrictionType;
    }

    @Override // X.InterfaceC40821up
    public final boolean getSentryBlockRestrictionDialogueUnificationEnabled() {
        return this.A00.mSentryBlockRestrictionDialogueUnificationEnabled;
    }

    @Override // X.InterfaceC40821up
    public final boolean getShouldShowWebviewCancelButton() {
        return !this.A00.mLockCheckpointDialog;
    }

    @Override // X.InterfaceC40821up
    public final boolean getSpam() {
        return this.A00.mSpam;
    }

    @Override // X.InterfaceC40801un
    public final int getStatusCode() {
        return this.A00.mStatusCode;
    }

    @Override // X.InterfaceC40821up
    public final List getSystemMessages() {
        return this.A00.mSystemMessages;
    }

    @Override // X.InterfaceC40801un
    public final void setFromDiskCache(boolean z) {
        this.A00.mFromDiskCache = z;
    }

    @Override // X.InterfaceC40801un
    public final void setResponseId(int i) {
        this.A00.mResponseId = i;
    }

    @Override // X.InterfaceC40801un
    public final void setResponseTimestamp(long j) {
        this.A00.mResponseTimestamp = j;
    }

    @Override // X.InterfaceC40801un
    public final void setServerElapsedTime(long j) {
        this.A00.mServerElapsedTime = j;
    }

    @Override // X.InterfaceC40801un
    public final void setStatusCode(int i) {
        this.A00.mStatusCode = i;
    }

    public C73451YDu(H9G h9g) {
        this.A00 = h9g;
        XVT xvt = h9g.A00;
        if (xvt == null) {
            AbstractC31171DnF.A0w();
            throw C00O.createAndThrow();
        }
        this.A01 = xvt.A02;
        this.A02 = xvt.A00;
    }

    @Override // X.InterfaceC168867gL
    public final Object B3l() {
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final String Bk6() {
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final Integer BmK() {
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final String Bo9() {
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final List Bri() {
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final /* bridge */ /* synthetic */ boolean CLI() {
        return this.A01;
    }

    @Override // X.InterfaceC168867gL
    public final List getItems() {
        ArrayList A1E = AbstractC166987dD.A1E();
        XVT xvt = this.A00.A00;
        if (xvt == null) {
            AbstractC31171DnF.A0w();
            throw C00O.createAndThrow();
        }
        List list = xvt.A01;
        if (list != null) {
            A1E.addAll(list);
        }
        return AbstractC001800i.A0a(A1E);
    }

    @Override // X.InterfaceC168867gL, X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return this.A02;
    }
}
