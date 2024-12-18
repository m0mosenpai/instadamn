package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.YDr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73448YDr implements C3DC, InterfaceC55612h1, InterfaceC74303Vl, InterfaceC57963Pn9 {
    public final C38832H8g A02;
    public long A01 = -1;
    public long A00 = -1;

    @Override // X.InterfaceC55612h1
    public final /* synthetic */ void EQh(String str) {
    }

    @Override // X.InterfaceC40821up
    public final boolean getCanSeeBroadcastChats() {
        return this.A02.getCanSeeBroadcastChats();
    }

    @Override // X.InterfaceC40821up
    public final boolean getCanSeeNotes() {
        return this.A02.getCanSeeNotes();
    }

    @Override // X.InterfaceC40821up
    public final String getCategory() {
        return this.A02.getCategory();
    }

    @Override // X.InterfaceC40821up
    public final String getClientFacingErrorMessage() {
        return this.A02.getClientFacingErrorMessage();
    }

    @Override // X.InterfaceC40821up
    public final String getErrorCode() {
        return this.A02.getErrorCode();
    }

    @Override // X.InterfaceC40821up
    public final String getErrorMessage() {
        return this.A02.getErrorMessage();
    }

    @Override // X.InterfaceC40821up
    public final String getStatus() {
        String status = this.A02.getStatus();
        C14360o3.A07(status);
        return status;
    }

    @Override // X.InterfaceC40821up
    public final boolean isCheckpointRequired() {
        return this.A02.isCheckpointRequired();
    }

    @Override // X.InterfaceC40821up
    public final boolean isConsentRequired() {
        return this.A02.isConsentRequired();
    }

    @Override // X.InterfaceC40821up
    public final boolean isDelegateAccessBlocked() {
        return this.A02.isDelegateAccessBlocked();
    }

    @Override // X.InterfaceC40821up
    public final boolean isEpdError() {
        return this.A02.isEpdError();
    }

    @Override // X.InterfaceC40821up
    public final boolean isFeedbackRequired() {
        return this.A02.isFeedbackRequired();
    }

    @Override // X.InterfaceC40821up
    public final boolean isLoginRequired() {
        return this.A02.isLoginRequired();
    }

    @Override // X.InterfaceC40801un
    public final boolean isOk() {
        return this.A02.isOk();
    }

    @Override // X.InterfaceC55612h1
    public final boolean CR4() {
        return AbstractC167007dF.A1M((this.A01 > (-1L) ? 1 : (this.A01 == (-1L) ? 0 : -1)));
    }

    @Override // X.InterfaceC57963Pn9
    public final C38071Gp0 EqR() {
        ArrayList A1E;
        C38071Gp0 c38071Gp0 = new C38071Gp0();
        C38664Gz5 c38664Gz5 = this.A02.A00;
        if (c38664Gz5 == null) {
            AbstractC31171DnF.A0w();
            throw C00O.createAndThrow();
        }
        List A00 = c38664Gz5.A00();
        if (A00 != null) {
            A1E = AbstractC167017dG.A0q(A00);
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                A1E.add(new C38061Goo((InterfaceC43511JJx) it.next()));
            }
        } else {
            A1E = AbstractC166987dD.A1E();
        }
        c38071Gp0.A05 = A1E;
        String str = c38071Gp0.A04;
        if (str != null) {
            AbstractC38076Gp5.A00(A1E, str);
        }
        return c38071Gp0;
    }

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        C38664Gz5 c38664Gz5 = this.A02.A00;
        if (c38664Gz5 == null) {
            AbstractC31171DnF.A0w();
            throw C00O.createAndThrow();
        }
        return c38664Gz5;
    }

    @Override // X.InterfaceC40821up
    public final FNM getCheckpoint() {
        return this.A02.mCheckpoint;
    }

    @Override // X.InterfaceC40821up
    public final String getCheckpointUrl() {
        return this.A02.mCheckpointUrl;
    }

    @Override // X.InterfaceC40821up
    public final IGK getConsentData() {
        return this.A02.mConsentData;
    }

    @Override // X.InterfaceC40821up
    public final String getDialogueType() {
        return this.A02.mDialogueType;
    }

    @Override // X.InterfaceC40821up
    public final String getEnrollmentTime() {
        return this.A02.mEnrollmentTime;
    }

    @Override // X.InterfaceC40821up
    public final String getErrorBody() {
        return this.A02.mErrorBody;
    }

    @Override // X.InterfaceC40821up
    public final String getErrorSource() {
        return this.A02.mErrorSource;
    }

    @Override // X.InterfaceC40821up
    public final List getErrorStrings() {
        return this.A02.mErrorStrings;
    }

    @Override // X.InterfaceC40821up
    public final String getErrorTitle() {
        return this.A02.mErrorTitle;
    }

    @Override // X.InterfaceC40821up
    public final String getErrorType() {
        return this.A02.mErrorType;
    }

    @Override // X.InterfaceC40821up
    public final String getExpirationTime() {
        return this.A02.mExpirationTime;
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackAction() {
        return this.A02.mFeedbackAction;
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackAppealLabel() {
        return this.A02.mFeedbackAppealLabel;
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackIgnoreLabel() {
        return this.A02.mFeedbackIgnoreLabel;
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackMessage() {
        return this.A02.mFeedbackMessage;
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackTitle() {
        return this.A02.mFeedbackTitle;
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackUrl() {
        return this.A02.mFeedbackUrl;
    }

    @Override // X.InterfaceC40821up
    public final String getLocalizedErrorMessage() {
        return this.A02.mLocalizedErrorMessage;
    }

    @Override // X.InterfaceC40821up
    public final String getLogoutReason() {
        return this.A02.mLogoutReason;
    }

    @Override // X.InterfaceC40821up
    public final boolean getNewsURLIsRegulated() {
        return this.A02.mNewsURLIsRegulated;
    }

    @Override // X.InterfaceC40821up
    public final String getReasonsThrown() {
        return this.A02.mReasonsThrown;
    }

    @Override // X.InterfaceC40801un
    public final long getResponseTimestamp() {
        return this.A02.mResponseTimestamp;
    }

    @Override // X.InterfaceC40821up
    public final String getResponsiblePolicy() {
        return this.A02.mResponsiblePolicy;
    }

    @Override // X.InterfaceC40821up
    public final String getRestrictionDetailUseCase() {
        return this.A02.mRestrictionDetailUseCase;
    }

    @Override // X.InterfaceC40821up
    public final String getRestrictionExtraData() {
        return this.A02.mRestrictionExtraData;
    }

    @Override // X.InterfaceC40821up
    public final String getRestrictionType() {
        return this.A02.mRestrictionType;
    }

    @Override // X.InterfaceC40821up
    public final boolean getSentryBlockRestrictionDialogueUnificationEnabled() {
        return this.A02.mSentryBlockRestrictionDialogueUnificationEnabled;
    }

    @Override // X.InterfaceC40821up
    public final boolean getShouldShowWebviewCancelButton() {
        return !this.A02.mLockCheckpointDialog;
    }

    @Override // X.InterfaceC40821up
    public final boolean getSpam() {
        return this.A02.mSpam;
    }

    @Override // X.InterfaceC40801un
    public final int getStatusCode() {
        return this.A02.mStatusCode;
    }

    @Override // X.InterfaceC40821up
    public final List getSystemMessages() {
        return this.A02.mSystemMessages;
    }

    @Override // X.InterfaceC40801un
    public final void setFromDiskCache(boolean z) {
        this.A02.mFromDiskCache = z;
    }

    @Override // X.InterfaceC40801un
    public final void setResponseId(int i) {
        this.A02.mResponseId = i;
    }

    @Override // X.InterfaceC40801un
    public final void setResponseTimestamp(long j) {
        this.A02.mResponseTimestamp = j;
    }

    @Override // X.InterfaceC40801un
    public final void setServerElapsedTime(long j) {
        this.A02.mServerElapsedTime = j;
    }

    @Override // X.InterfaceC40801un
    public final void setStatusCode(int i) {
        this.A02.mStatusCode = i;
    }

    public C73448YDr(C38832H8g c38832H8g) {
        this.A02 = c38832H8g;
    }

    @Override // X.InterfaceC55612h1
    public final long AjZ() {
        return this.A00;
    }

    @Override // X.InterfaceC55612h1
    public final long Ajf() {
        return this.A01;
    }

    @Override // X.InterfaceC74303Vl
    public final boolean CQG() {
        return true;
    }

    @Override // X.InterfaceC74303Vl
    public final boolean CQT() {
        return false;
    }

    @Override // X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return null;
    }

    @Override // X.InterfaceC55612h1
    public final void EQg(long j) {
        this.A00 = j;
    }

    @Override // X.InterfaceC55612h1
    public final void EQi(long j) {
        this.A01 = j;
    }
}
