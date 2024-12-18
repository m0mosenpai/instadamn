package X;

import android.content.Context;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.business.fragment.SupportServiceEditUrlFragment;

/* renamed from: X.GKs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36819GKs implements Runnable {
    public final /* synthetic */ C32548EUy A00;

    public RunnableC36819GKs(C32548EUy c32548EUy) {
        this.A00 = c32548EUy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i;
        SupportServiceEditUrlFragment supportServiceEditUrlFragment = (SupportServiceEditUrlFragment) this.A00.A01;
        Context context = supportServiceEditUrlFragment.getContext();
        SMBPartnerType sMBPartnerType = supportServiceEditUrlFragment.A01;
        if (sMBPartnerType.equals(SMBPartnerType.A09)) {
            context.getClass();
            i = 2131972314;
        } else if (sMBPartnerType.equals(SMBPartnerType.A06)) {
            context.getClass();
            i = 2131972205;
        } else if (sMBPartnerType.equals(SMBPartnerType.A05)) {
            context.getClass();
            i = 2131972209;
        } else {
            str = null;
            AbstractC31180DnO.A1E(supportServiceEditUrlFragment, str);
            SupportServiceEditUrlFragment.A01(supportServiceEditUrlFragment);
        }
        str = context.getString(i);
        AbstractC31180DnO.A1E(supportServiceEditUrlFragment, str);
        SupportServiceEditUrlFragment.A01(supportServiceEditUrlFragment);
    }
}
