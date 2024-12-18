package X;

import com.instagram.model.venue.LocationDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.YDt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73450YDt implements C3DC, InterfaceC168867gL {
    public final N2R A00;

    @Override // X.InterfaceC168867gL
    public final Object B3l() {
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

    @Override // X.InterfaceC168867gL
    public final String Bk6() {
        C51594Mqm c51594Mqm = this.A00.A00;
        if (c51594Mqm == null) {
            AbstractC31171DnF.A0w();
            throw C00O.createAndThrow();
        }
        return c51594Mqm.A00;
    }

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        C51594Mqm c51594Mqm = this.A00.A00;
        if (c51594Mqm == null) {
            AbstractC31171DnF.A0w();
            throw C00O.createAndThrow();
        }
        return c51594Mqm;
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

    @Override // X.InterfaceC168867gL
    public final List getItems() {
        C51594Mqm c51594Mqm = this.A00.A00;
        if (c51594Mqm == null) {
            AbstractC31171DnF.A0w();
            throw C00O.createAndThrow();
        }
        List list = c51594Mqm.A02;
        C14360o3.A0B(list, 0);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(AbstractC69973Vyo.A00((LocationDict) it.next()));
        }
        return A0q;
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

    public C73450YDt(N2R n2r) {
        this.A00 = n2r;
    }

    @Override // X.InterfaceC168867gL
    public final /* bridge */ /* synthetic */ boolean CLI() {
        return false;
    }

    @Override // X.InterfaceC168867gL, X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return null;
    }
}
