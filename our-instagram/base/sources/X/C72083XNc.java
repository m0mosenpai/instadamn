package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.XNc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72083XNc implements InterfaceC124295jj, InterfaceC72043Lc {
    public final InterfaceC124225jb A00;
    public final C72084XNd A01;
    public final List A02;
    public final C65943Two A03;
    public final UserSession A04;
    public final C1DU A05;
    public final List A06;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public C72083XNc(C72084XNd c72084XNd, C65943Two c65943Two, UserSession userSession, C1DU c1du) {
        ?? r0;
        C14360o3.A0B(c1du, 4);
        this.A04 = userSession;
        this.A03 = c65943Two;
        this.A01 = c72084XNd;
        this.A05 = c1du;
        C37981GnO A0E = c65943Two.A0E(c1du);
        this.A00 = A0E;
        List items = A0E.getItems();
        ArrayList A0q = AbstractC167017dG.A0q(items);
        Iterator it = items.iterator();
        while (it.hasNext()) {
            A0q.add(AbstractC128065qa.A02((InterfaceC111044zG) it.next()));
        }
        this.A02 = A0q;
        List<InterfaceC43554JLo> BKG = this.A00.BKG();
        if (BKG != null) {
            r0 = AbstractC166987dD.A1E();
            for (InterfaceC43554JLo interfaceC43554JLo : BKG) {
                interfaceC43554JLo.E8q(new C1DY((C1DV) this.A05, 6, false));
                C120985dq A03 = AbstractC128065qa.A03(interfaceC43554JLo);
                if (A03 != null) {
                    r0.add(A03);
                }
            }
        } else {
            r0 = C16930sl.A00;
        }
        this.A06 = r0;
    }

    @Override // X.InterfaceC55612h1
    public final /* synthetic */ void EQh(String str) {
    }

    @Override // X.InterfaceC124295jj
    public final HashMap Ahz() {
        Map BR0 = this.A00.BR0();
        if (BR0 != null) {
            return new HashMap(BR0);
        }
        return null;
    }

    @Override // X.InterfaceC55612h1
    public final long AjZ() {
        return this.A01.A00;
    }

    @Override // X.InterfaceC55612h1
    public final long Ajf() {
        return this.A01.A01;
    }

    @Override // X.InterfaceC124295jj
    public final List AoN() {
        List BKG = this.A00.BKG();
        if (BKG == null) {
            return C16930sl.A00;
        }
        return BKG;
    }

    @Override // X.InterfaceC124295jj
    public final String Bb1() {
        return this.A00.Bm2();
    }

    @Override // X.InterfaceC124295jj
    public final InterfaceC111084zP BbA() {
        return this.A00.Bb9();
    }

    @Override // X.InterfaceC124295jj
    public final String Boh() {
        return this.A00.Aqj();
    }

    @Override // X.InterfaceC74303Vl
    public final boolean CQG() {
        return this.A00.Bb9().BUt();
    }

    @Override // X.InterfaceC74303Vl
    public final boolean CQT() {
        InterfaceC111044zG interfaceC111044zG;
        C38321qM BQN;
        InterfaceC124225jb interfaceC124225jb = this.A00;
        if (C14360o3.A0K(interfaceC124225jb.Bb9().BPp(), "0") || (!interfaceC124225jb.getItems().isEmpty() && (interfaceC111044zG = (InterfaceC111044zG) interfaceC124225jb.getItems().get(0)) != null && (BQN = interfaceC111044zG.BQN()) != null && BQN.A0C.BtM() != null)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC55612h1
    public final boolean CR4() {
        return this.A01.CR4();
    }

    @Override // X.InterfaceC124295jj
    public final boolean Cew() {
        return AbstractC166997dE.A1Z(this.A00.CCI(), true);
    }

    @Override // X.InterfaceC55612h1
    public final void EQg(long j) {
        this.A01.A00 = j;
    }

    @Override // X.InterfaceC55612h1
    public final void EQi(long j) {
        this.A01.A01 = j;
    }

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        return ((AbstractC72082XNa) this.A01).A00.reinterpret(C37981GnO.class);
    }

    @Override // X.InterfaceC40821up
    public final boolean getCanSeeBroadcastChats() {
        return this.A01.getCanSeeBroadcastChats();
    }

    @Override // X.InterfaceC40821up
    public final boolean getCanSeeNotes() {
        return this.A01.getCanSeeNotes();
    }

    @Override // X.InterfaceC40821up
    public final String getCategory() {
        return this.A01.getCategory();
    }

    @Override // X.InterfaceC40821up
    public final String getCheckpointUrl() {
        return this.A01.getCheckpointUrl();
    }

    @Override // X.InterfaceC40821up
    public final String getClientFacingErrorMessage() {
        return this.A01.getClientFacingErrorMessage();
    }

    @Override // X.InterfaceC40821up
    public final String getDialogueType() {
        return this.A01.getDialogueType();
    }

    @Override // X.InterfaceC40821up
    public final String getEnrollmentTime() {
        return this.A01.getEnrollmentTime();
    }

    @Override // X.InterfaceC40821up
    public final String getErrorBody() {
        return this.A01.getErrorBody();
    }

    @Override // X.InterfaceC40821up
    public final String getErrorCode() {
        return this.A01.getErrorCode();
    }

    @Override // X.InterfaceC40821up
    public final String getErrorSource() {
        return this.A01.getErrorSource();
    }

    @Override // X.InterfaceC40821up
    public final String getErrorTitle() {
        return this.A01.getErrorTitle();
    }

    @Override // X.InterfaceC40821up
    public final String getErrorType() {
        return this.A01.getErrorType();
    }

    @Override // X.InterfaceC40821up
    public final String getExpirationTime() {
        return this.A01.getExpirationTime();
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackAction() {
        return this.A01.getFeedbackAction();
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackAppealLabel() {
        return this.A01.getFeedbackAppealLabel();
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackIgnoreLabel() {
        return this.A01.getFeedbackIgnoreLabel();
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackMessage() {
        return this.A01.getFeedbackMessage();
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackTitle() {
        return this.A01.getFeedbackTitle();
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackUrl() {
        return this.A01.getFeedbackUrl();
    }

    @Override // X.InterfaceC40821up
    public final String getLocalizedErrorMessage() {
        return this.A01.getLocalizedErrorMessage();
    }

    @Override // X.InterfaceC40821up
    public final String getLogoutReason() {
        return this.A01.getLogoutReason();
    }

    @Override // X.InterfaceC40821up
    public final boolean getNewsURLIsRegulated() {
        return this.A01.getNewsURLIsRegulated();
    }

    @Override // X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return this.A00.Bb9().BPp();
    }

    @Override // X.InterfaceC40821up
    public final String getReasonsThrown() {
        return this.A01.getReasonsThrown();
    }

    @Override // X.InterfaceC40801un
    public final long getResponseTimestamp() {
        return this.A01.mResponseTimestamp;
    }

    @Override // X.InterfaceC40821up
    public final String getResponsiblePolicy() {
        return this.A01.getResponsiblePolicy();
    }

    @Override // X.InterfaceC40821up
    public final String getRestrictionDetailUseCase() {
        return this.A01.getRestrictionDetailUseCase();
    }

    @Override // X.InterfaceC40821up
    public final String getRestrictionExtraData() {
        return this.A01.getRestrictionExtraData();
    }

    @Override // X.InterfaceC40821up
    public final String getRestrictionType() {
        return this.A01.getRestrictionType();
    }

    @Override // X.InterfaceC40821up
    public final boolean getSentryBlockRestrictionDialogueUnificationEnabled() {
        return this.A01.getSentryBlockRestrictionDialogueUnificationEnabled();
    }

    @Override // X.InterfaceC40821up
    public final boolean getShouldShowWebviewCancelButton() {
        return this.A01.getShouldShowWebviewCancelButton();
    }

    @Override // X.InterfaceC40821up
    public final boolean getSpam() {
        return this.A01.getSpam();
    }

    @Override // X.InterfaceC40821up
    public final String getStatus() {
        return this.A01.getStatus();
    }

    @Override // X.InterfaceC40801un
    public final int getStatusCode() {
        return this.A01.mStatusCode;
    }

    @Override // X.InterfaceC40821up
    public final boolean isEpdError() {
        return this.A01.isEpdError();
    }

    @Override // X.InterfaceC40821up
    public final boolean isFeedbackRequired() {
        return this.A01.isFeedbackRequired();
    }

    @Override // X.InterfaceC40801un
    public final boolean isOk() {
        return this.A01.isOk();
    }

    @Override // X.InterfaceC40801un
    public final void setFromDiskCache(boolean z) {
        this.A01.mFromDiskCache = z;
    }

    @Override // X.InterfaceC40801un
    public final void setResponseId(int i) {
        this.A01.mResponseId = i;
    }

    @Override // X.InterfaceC40801un
    public final void setResponseTimestamp(long j) {
        this.A01.mResponseTimestamp = j;
    }

    @Override // X.InterfaceC40801un
    public final void setServerElapsedTime(long j) {
        this.A01.mServerElapsedTime = j;
    }

    @Override // X.InterfaceC40801un
    public final void setStatusCode(int i) {
        this.A01.mStatusCode = i;
    }

    @Override // X.InterfaceC124295jj
    public final List Ahw() {
        return C16930sl.A00;
    }

    @Override // X.InterfaceC124295jj
    public final List AoM() {
        return this.A06;
    }

    @Override // X.InterfaceC124295jj
    public final List AoP() {
        return this.A02;
    }

    @Override // X.InterfaceC40821up
    public final FNM getCheckpoint() {
        return null;
    }

    @Override // X.InterfaceC40821up
    public final IGK getConsentData() {
        return null;
    }

    @Override // X.InterfaceC40821up
    public final String getErrorMessage() {
        return null;
    }

    @Override // X.InterfaceC40821up
    public final List getErrorStrings() {
        return null;
    }

    @Override // X.InterfaceC40821up
    public final List getSystemMessages() {
        return null;
    }

    @Override // X.InterfaceC40821up
    public final boolean isCheckpointRequired() {
        return false;
    }

    @Override // X.InterfaceC40821up
    public final boolean isConsentRequired() {
        return false;
    }

    @Override // X.InterfaceC40821up
    public final boolean isDelegateAccessBlocked() {
        return false;
    }

    @Override // X.InterfaceC40821up
    public final boolean isLoginRequired() {
        return false;
    }
}
