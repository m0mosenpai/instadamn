package X;

import com.facebook.iabadscontext.IgPromoAdsExtension;
import com.instagram.common.session.UserSession;

/* renamed from: X.QEo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58878QEo extends AbstractC63223SfY implements BEG, InterfaceC65639Tq2, InterfaceC65638Tq1 {
    public final IgPromoAdsExtension A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final C11L A05 = new C11L("^(?!.*\\/checkout(?:s)?\\/$)(?=.*\\/checkout(?:s)?\\/(?!$)(?!.*\\/thank(?:s)?))(?!.*\\/thank(?:_you)?|.*\\/post_purchase|.*\\/purchase\\/thanks).*");
    public final C11L A04 = new C11L("^(?=.*\\/checkout(?:s)?\\/(?!$)(?=.*\\/thank_you)|.*\\/post_purchase|.*\\/purchase\\/thanks)(?!.*\\/checkout(?:s)?\\/$).*");

    public C58878QEo(IgPromoAdsExtension igPromoAdsExtension, UserSession userSession, String str, String str2) {
        this.A01 = userSession;
        this.A02 = str;
        this.A00 = igPromoAdsExtension;
        this.A03 = str2;
    }
}
