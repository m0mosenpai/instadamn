package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class YE5 implements InterfaceC124295jj, InterfaceC72043Lc {
    public final C72084XNd A00;
    public final C124215ja A01;

    public YE5(C1DV c1dv, C72084XNd c72084XNd) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C14360o3.A0B(c1dv, 2);
        this.A00 = c72084XNd;
        C37981GnO c37981GnO = (C37981GnO) ((AbstractC72082XNa) c72084XNd).A00.reinterpret(C37981GnO.class);
        C1DY c1dy = new C1DY(c1dv, 6, false);
        List AoL = c37981GnO.AoL();
        if (AoL != null) {
            arrayList = AbstractC167007dF.A0i(AoL);
            Iterator it = AoL.iterator();
            while (it.hasNext()) {
                AbstractC37304Gc5.A1C(c1dy, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        String stringValueByHashCode = c37981GnO.getStringValueByHashCode(1759802346);
        c37981GnO.A0j(235795787);
        List items = c37981GnO.getItems();
        ArrayList A0i = AbstractC167007dF.A0i(items);
        Iterator it2 = items.iterator();
        while (it2.hasNext()) {
            AbstractC37304Gc5.A1C(c1dy, A0i, it2);
        }
        List BKG = c37981GnO.BKG();
        if (BKG != null) {
            arrayList2 = AbstractC167007dF.A0i(BKG);
            Iterator it3 = BKG.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((InterfaceC43554JLo) it3.next()).Ery(c1dy));
            }
        } else {
            arrayList2 = null;
        }
        C111074zO Ext = c37981GnO.Bb9().Ext();
        String stringValueByHashCode2 = c37981GnO.getStringValueByHashCode(-1198642808);
        c37981GnO.A0j(37109963);
        this.A01 = new C124215ja(Ext, c37981GnO.A0B(2079275687), stringValueByHashCode, stringValueByHashCode2, null, arrayList, A0i, arrayList2);
    }

    @Override // X.InterfaceC124295jj
    public final boolean Cew() {
        Boolean bool = true;
        return bool.equals(this.A01.A01);
    }

    @Override // X.InterfaceC55612h1
    public final /* synthetic */ void EQh(String str) {
    }

    @Override // X.InterfaceC124295jj
    public final HashMap Ahz() {
        return this.A01.A04;
    }

    @Override // X.InterfaceC55612h1
    public final long AjZ() {
        return this.A00.A00;
    }

    @Override // X.InterfaceC55612h1
    public final long Ajf() {
        return this.A00.A01;
    }

    @Override // X.InterfaceC124295jj
    public final List AoM() {
        List list = this.A01.A06;
        if (list != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C120985dq A03 = AbstractC128065qa.A03((C38695H2g) it.next());
                if (A03 != null) {
                    A1E.add(A03);
                }
            }
            return A1E;
        }
        return C16930sl.A00;
    }

    @Override // X.InterfaceC124295jj
    public final List AoN() {
        List list = this.A01.A06;
        if (list == null) {
            return C16930sl.A00;
        }
        return list;
    }

    @Override // X.InterfaceC124295jj
    public final List AoP() {
        List list = this.A01.A05;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(AbstractC128065qa.A02((C111034zF) it.next()));
        }
        return A0q;
    }

    @Override // X.InterfaceC124295jj
    public final String Bb1() {
        return this.A01.A03;
    }

    @Override // X.InterfaceC124295jj
    public final InterfaceC111084zP BbA() {
        return this.A01.A00;
    }

    @Override // X.InterfaceC124295jj
    public final String Boh() {
        return this.A01.A02;
    }

    @Override // X.InterfaceC74303Vl
    public final boolean CQG() {
        return this.A01.A00.BUt();
    }

    @Override // X.InterfaceC55612h1
    public final boolean CR4() {
        return this.A00.CR4();
    }

    @Override // X.InterfaceC55612h1
    public final void EQg(long j) {
        this.A00.A00 = j;
    }

    @Override // X.InterfaceC55612h1
    public final void EQi(long j) {
        this.A00.A01 = j;
    }

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        return ((AbstractC72082XNa) this.A00).A00.reinterpret(C37981GnO.class);
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
    public final String getCheckpointUrl() {
        return this.A00.getCheckpointUrl();
    }

    @Override // X.InterfaceC40821up
    public final String getClientFacingErrorMessage() {
        return this.A00.getClientFacingErrorMessage();
    }

    @Override // X.InterfaceC40821up
    public final String getDialogueType() {
        return this.A00.getDialogueType();
    }

    @Override // X.InterfaceC40821up
    public final String getEnrollmentTime() {
        return this.A00.getEnrollmentTime();
    }

    @Override // X.InterfaceC40821up
    public final String getErrorBody() {
        return this.A00.getErrorBody();
    }

    @Override // X.InterfaceC40821up
    public final String getErrorCode() {
        return this.A00.getErrorCode();
    }

    @Override // X.InterfaceC40821up
    public final String getErrorSource() {
        return this.A00.getErrorSource();
    }

    @Override // X.InterfaceC40821up
    public final String getErrorTitle() {
        return this.A00.getErrorTitle();
    }

    @Override // X.InterfaceC40821up
    public final String getErrorType() {
        return this.A00.getErrorType();
    }

    @Override // X.InterfaceC40821up
    public final String getExpirationTime() {
        return this.A00.getExpirationTime();
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackAction() {
        return this.A00.getFeedbackAction();
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackAppealLabel() {
        return this.A00.getFeedbackAppealLabel();
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackIgnoreLabel() {
        return this.A00.getFeedbackIgnoreLabel();
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackMessage() {
        return this.A00.getFeedbackMessage();
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackTitle() {
        return this.A00.getFeedbackTitle();
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackUrl() {
        return this.A00.getFeedbackUrl();
    }

    @Override // X.InterfaceC40821up
    public final String getLocalizedErrorMessage() {
        return this.A00.getLocalizedErrorMessage();
    }

    @Override // X.InterfaceC40821up
    public final String getLogoutReason() {
        return this.A00.getLogoutReason();
    }

    @Override // X.InterfaceC40821up
    public final boolean getNewsURLIsRegulated() {
        return this.A00.getNewsURLIsRegulated();
    }

    @Override // X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return this.A01.A00.BPp();
    }

    @Override // X.InterfaceC40821up
    public final String getReasonsThrown() {
        return this.A00.getReasonsThrown();
    }

    @Override // X.InterfaceC40801un
    public final long getResponseTimestamp() {
        return this.A00.mResponseTimestamp;
    }

    @Override // X.InterfaceC40821up
    public final String getResponsiblePolicy() {
        return this.A00.getResponsiblePolicy();
    }

    @Override // X.InterfaceC40821up
    public final String getRestrictionDetailUseCase() {
        return this.A00.getRestrictionDetailUseCase();
    }

    @Override // X.InterfaceC40821up
    public final String getRestrictionExtraData() {
        return this.A00.getRestrictionExtraData();
    }

    @Override // X.InterfaceC40821up
    public final String getRestrictionType() {
        return this.A00.getRestrictionType();
    }

    @Override // X.InterfaceC40821up
    public final boolean getSentryBlockRestrictionDialogueUnificationEnabled() {
        return this.A00.getSentryBlockRestrictionDialogueUnificationEnabled();
    }

    @Override // X.InterfaceC40821up
    public final boolean getShouldShowWebviewCancelButton() {
        return this.A00.getShouldShowWebviewCancelButton();
    }

    @Override // X.InterfaceC40821up
    public final boolean getSpam() {
        return this.A00.getSpam();
    }

    @Override // X.InterfaceC40821up
    public final String getStatus() {
        return this.A00.getStatus();
    }

    @Override // X.InterfaceC40801un
    public final int getStatusCode() {
        return this.A00.mStatusCode;
    }

    @Override // X.InterfaceC40821up
    public final boolean isEpdError() {
        return this.A00.isEpdError();
    }

    @Override // X.InterfaceC40821up
    public final boolean isFeedbackRequired() {
        return this.A00.isFeedbackRequired();
    }

    @Override // X.InterfaceC40801un
    public final boolean isOk() {
        return this.A00.isOk();
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

    @Override // X.InterfaceC124295jj
    public final List Ahw() {
        return C16930sl.A00;
    }

    @Override // X.InterfaceC74303Vl
    public final boolean CQT() {
        if (!C14360o3.A0K(getNextMaxId(), "0")) {
            List list = this.A01.A05;
            if (!AbstractC166987dD.A1b(list) || ((C111034zF) list.get(0)).A00.A0C.BtM() == null) {
                return false;
            }
        }
        return true;
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
