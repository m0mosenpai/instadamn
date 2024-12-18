package X;

import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.List;

/* loaded from: classes12.dex */
public abstract class YFT implements InterfaceC168867gL, InterfaceC72043Lc {
    public final InterfaceC168297fO A00;
    public final /* synthetic */ C72246Xa2 A01;

    @Override // X.InterfaceC55612h1
    public final boolean CR4() {
        return this.A01.CR4();
    }

    @Override // X.InterfaceC55612h1
    public final /* synthetic */ void EQh(String str) {
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

    @Override // X.InterfaceC40821up
    public final String getReasonsThrown() {
        return this.A01.getReasonsThrown();
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

    @Override // X.InterfaceC55612h1
    public final long AjZ() {
        return this.A01.A00;
    }

    @Override // X.InterfaceC55612h1
    public final long Ajf() {
        return this.A01.A01;
    }

    @Override // X.InterfaceC168867gL
    public final String Bk6() {
        return this.A00.Bk6();
    }

    @Override // X.InterfaceC168867gL
    public final /* bridge */ /* synthetic */ boolean CLI() {
        return this.A00.BC6();
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
        return ((AbstractC72082XNa) this.A01).A00.reinterpret(C33023EhR.class);
    }

    @Override // X.InterfaceC168867gL
    public final List getItems() {
        List CEC = this.A00.CEC();
        if (CEC == null) {
            return C16930sl.A00;
        }
        return CEC;
    }

    @Override // X.InterfaceC168867gL, X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return this.A00.getNextMaxId();
    }

    @Override // X.InterfaceC40801un
    public final long getResponseTimestamp() {
        return this.A01.mResponseTimestamp;
    }

    @Override // X.InterfaceC40801un
    public final int getStatusCode() {
        return this.A01.mStatusCode;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.XNa, X.Xa2] */
    public YFT(InterfaceC168297fO interfaceC168297fO) {
        TreeJNI reinterpret = ((TreeJNI) interfaceC168297fO).reinterpret(C37960Gn2.class);
        C14360o3.A07(reinterpret);
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        C37960Gn2 c37960Gn2 = (C37960Gn2) new TreeUpdaterJNI(AbstractC16850sd.A0M(AbstractC166987dD.A1L(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, "ok")), reinterpret).applyToTree(reinterpret);
        C14360o3.A0A(c37960Gn2);
        C14360o3.A0B(c37960Gn2, 1);
        ?? abstractC72082XNa = new AbstractC72082XNa(c37960Gn2);
        abstractC72082XNa.A01 = -1L;
        abstractC72082XNa.A00 = -1L;
        this.A01 = abstractC72082XNa;
        this.A00 = interfaceC168297fO;
    }

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
