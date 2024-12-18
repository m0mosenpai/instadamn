package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Kl4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46687Kl4 {
    public static final void A00(Context context, UserSession userSession, KKF kkf, boolean z, boolean z2) {
        Integer num;
        int A0D;
        AbstractC167027dH.A12(kkf, context, userSession);
        if (z2) {
            num = C05F.A01;
        } else {
            num = C05F.A00;
        }
        if (num.intValue() != 0) {
            kkf.setCtaButtonColor(R.color.grey_0);
            kkf.setDescriptionTextColor(R.color.grey_4);
            A0D = R.color.black;
        } else {
            kkf.setCtaButtonColor(AbstractC53242c7.A07(context));
            kkf.setDescriptionTextColor(AbstractC53242c7.A09(context));
            A0D = AbstractC53242c7.A0D(context);
        }
        AbstractC31172DnG.A1B(kkf.getContext(), kkf.A01, A0D);
        kkf.A02.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        kkf.setOnManagePermissionsClickedListener(new B61(14, context, userSession));
    }
}
