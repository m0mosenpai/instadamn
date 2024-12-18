package X;

import android.content.DialogInterface;
import com.instagram.api.schemas.BonusPromoDialogType;
import com.instagram.common.session.UserSession;

/* renamed from: X.FhX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnCancelListenerC35298FhX implements DialogInterface.OnCancelListener {
    public final /* synthetic */ E6I A00;
    public final /* synthetic */ BonusPromoDialogType A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C56135Ovv A03;

    public DialogInterfaceOnCancelListenerC35298FhX(E6I e6i, BonusPromoDialogType bonusPromoDialogType, UserSession userSession, C56135Ovv c56135Ovv) {
        this.A03 = c56135Ovv;
        this.A01 = bonusPromoDialogType;
        this.A02 = userSession;
        this.A00 = e6i;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Integer num;
        C56135Ovv c56135Ovv = this.A03;
        BonusPromoDialogType bonusPromoDialogType = this.A01;
        if (bonusPromoDialogType == BonusPromoDialogType.A05) {
            num = C05F.A0u;
        } else {
            num = C05F.A1I;
        }
        c56135Ovv.A00(num, null, null, null);
        UserSession userSession = this.A02;
        String str = this.A00.A01;
        AbstractC166987dD.A1Z(new C57148PXa(userSession, bonusPromoDialogType, str, null, 1), AbstractC167017dG.A0w(C12L.A00, 891600198));
    }
}
