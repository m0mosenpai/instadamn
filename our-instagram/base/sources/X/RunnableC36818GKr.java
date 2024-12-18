package X;

import android.content.Context;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.business.fragment.SupportServiceEditUrlFragment;

/* renamed from: X.GKr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36818GKr implements Runnable {
    public final /* synthetic */ C32548EUy A00;

    public RunnableC36818GKr(C32548EUy c32548EUy) {
        this.A00 = c32548EUy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        String str;
        SupportServiceEditUrlFragment supportServiceEditUrlFragment = (SupportServiceEditUrlFragment) this.A00.A01;
        Context context = supportServiceEditUrlFragment.getContext();
        SMBPartnerType sMBPartnerType = supportServiceEditUrlFragment.A01;
        boolean equals = supportServiceEditUrlFragment.A0A.equals("sticker");
        boolean equals2 = sMBPartnerType.equals(SMBPartnerType.A09);
        if (equals) {
            if (equals2) {
                context.getClass();
                i = 2131972316;
            } else {
                if (sMBPartnerType.equals(SMBPartnerType.A06)) {
                    context.getClass();
                    i = 2131972207;
                }
                str = null;
            }
            str = context.getString(i);
        } else {
            if (equals2) {
                context.getClass();
                i = 2131972315;
            } else if (sMBPartnerType.equals(SMBPartnerType.A06)) {
                context.getClass();
                i = 2131972206;
            } else {
                if (sMBPartnerType.equals(SMBPartnerType.A05)) {
                    context.getClass();
                    i = 2131972210;
                }
                str = null;
            }
            str = context.getString(i);
        }
        AbstractC31180DnO.A1E(supportServiceEditUrlFragment, str);
        SupportServiceEditUrlFragment.A01(supportServiceEditUrlFragment);
    }
}
