package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.List;

/* renamed from: X.XNa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72082XNa extends C40791um implements C3DC {
    public final C37960Gn2 A00;

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
    public final boolean getCanSeeBroadcastChats() {
        return this.A00.getBooleanValue(AbstractC43591JPw.A00(825));
    }

    @Override // X.InterfaceC40821up
    public final boolean getCanSeeNotes() {
        return this.A00.getBooleanValue(AbstractC43591JPw.A00(826));
    }

    @Override // X.InterfaceC40821up
    public final String getCategory() {
        return this.A00.getStringValue("category");
    }

    @Override // X.InterfaceC40821up
    public final String getCheckpointUrl() {
        return this.A00.getStringValue(AbstractC111324zv.A00(4087));
    }

    @Override // X.InterfaceC40821up
    public final String getClientFacingErrorMessage() {
        return this.A00.getStringValue(AbstractC43591JPw.A00(842));
    }

    @Override // X.InterfaceC40821up
    public final String getDialogueType() {
        return this.A00.getStringValue(AbstractC111324zv.A00(4266));
    }

    @Override // X.InterfaceC40821up
    public final String getEnrollmentTime() {
        return this.A00.getStringValue(AbstractC111324zv.A00(4379));
    }

    @Override // X.InterfaceC40821up
    public final String getErrorBody() {
        return this.A00.getStringValue(AbstractC111324zv.A00(2316));
    }

    @Override // X.InterfaceC40821up
    public final String getErrorCode() {
        return this.A00.getStringValue(TraceFieldType.ErrorCode);
    }

    @Override // X.InterfaceC40821up
    public final String getErrorSource() {
        return this.A00.getStringValue(AbstractC111324zv.A00(2320));
    }

    @Override // X.InterfaceC40821up
    public final String getErrorTitle() {
        return this.A00.getStringValue(AbstractC58317Pt9.A00(24));
    }

    @Override // X.InterfaceC40821up
    public final String getErrorType() {
        return this.A00.getStringValue("error_type");
    }

    @Override // X.InterfaceC40821up
    public final String getExpirationTime() {
        return this.A00.getStringValue(AbstractC58317Pt9.A00(776));
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackAction() {
        return this.A00.getStringValue(AbstractC111324zv.A00(2377));
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackAppealLabel() {
        return this.A00.getStringValue(AbstractC111324zv.A00(2378));
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackIgnoreLabel() {
        return this.A00.getStringValue(AbstractC111324zv.A00(2379));
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackMessage() {
        return this.A00.getStringValue(AbstractC111324zv.A00(2380));
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackTitle() {
        return this.A00.getStringValue(AbstractC111324zv.A00(2382));
    }

    @Override // X.InterfaceC40821up
    public final String getFeedbackUrl() {
        return this.A00.getStringValue(AbstractC111324zv.A00(2383));
    }

    @Override // X.InterfaceC40821up
    public final String getLocalizedErrorMessage() {
        return this.A00.getStringValue(AbstractC111324zv.A00(4847));
    }

    @Override // X.InterfaceC40821up
    public final String getLogoutReason() {
        return this.A00.getStringValue(AbstractC111324zv.A00(2684));
    }

    @Override // X.InterfaceC40821up
    public final boolean getNewsURLIsRegulated() {
        return this.A00.getBooleanValue("news_url_is_regulated");
    }

    @Override // X.InterfaceC40821up
    public final String getReasonsThrown() {
        return this.A00.getStringValue(AbstractC111324zv.A00(5158));
    }

    @Override // X.InterfaceC40821up
    public final String getResponsiblePolicy() {
        return this.A00.getStringValue(AbstractC111324zv.A00(5227));
    }

    @Override // X.InterfaceC40821up
    public final String getRestrictionDetailUseCase() {
        return this.A00.getStringValue(AbstractC111324zv.A00(5230));
    }

    @Override // X.InterfaceC40821up
    public final String getRestrictionExtraData() {
        return this.A00.getStringValue(AbstractC111324zv.A00(5231));
    }

    @Override // X.InterfaceC40821up
    public final String getRestrictionType() {
        return this.A00.getStringValue(AbstractC111324zv.A00(5232));
    }

    @Override // X.InterfaceC40821up
    public final boolean getSentryBlockRestrictionDialogueUnificationEnabled() {
        return this.A00.getBooleanValue("sentry_block_restriction_dialogue_unification_enabled");
    }

    @Override // X.InterfaceC40821up
    public final boolean getShouldShowWebviewCancelButton() {
        return !this.A00.getBooleanValue("lock");
    }

    @Override // X.InterfaceC40821up
    public final boolean getSpam() {
        return this.A00.getBooleanValue("is_spam");
    }

    @Override // X.InterfaceC40821up
    public final String getStatus() {
        String stringValue = this.A00.getStringValue(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
        if (stringValue == null) {
            return "";
        }
        return stringValue;
    }

    @Override // X.InterfaceC40821up
    public final boolean isEpdError() {
        return this.A00.getBooleanValue(AbstractC43591JPw.A00(1108));
    }

    @Override // X.InterfaceC40821up
    public final boolean isFeedbackRequired() {
        if (this.A00.getBooleanValue(AbstractC111324zv.A00(2381))) {
            return true;
        }
        return false;
    }

    public AbstractC72082XNa(C37960Gn2 c37960Gn2) {
        this.A00 = c37960Gn2;
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

    @Override // X.C40791um, X.InterfaceC40801un
    public final boolean isOk() {
        return C14360o3.A0K(getStatus(), "ok");
    }
}
