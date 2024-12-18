package X;

import android.content.Context;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.business.fragment.SupportServiceEditUrlFragment;

/* renamed from: X.GKq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36817GKq implements Runnable {
    public final /* synthetic */ EUP A00;

    public RunnableC36817GKq(EUP eup) {
        this.A00 = eup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String A01;
        int i;
        SupportServiceEditUrlFragment supportServiceEditUrlFragment = (SupportServiceEditUrlFragment) this.A00.A01;
        boolean z = supportServiceEditUrlFragment.A0C;
        Context context = supportServiceEditUrlFragment.getContext();
        SMBPartnerType sMBPartnerType = supportServiceEditUrlFragment.A01;
        String str = supportServiceEditUrlFragment.A0A;
        if (z) {
            boolean equals = str.equals("sticker");
            boolean equals2 = sMBPartnerType.equals(SMBPartnerType.A09);
            if (equals) {
                if (equals2) {
                    context.getClass();
                    i = 2131976287;
                } else {
                    if (sMBPartnerType.equals(SMBPartnerType.A06)) {
                        context.getClass();
                        i = 2131976263;
                    }
                    A01 = null;
                }
                A01 = context.getString(i);
            } else {
                if (equals2) {
                    context.getClass();
                    i = 2131976286;
                } else if (sMBPartnerType.equals(SMBPartnerType.A06)) {
                    context.getClass();
                    i = 2131976262;
                } else {
                    if (sMBPartnerType.equals(SMBPartnerType.A05)) {
                        context.getClass();
                        i = 2131976264;
                    }
                    A01 = null;
                }
                A01 = context.getString(i);
            }
        } else {
            A01 = AbstractC1566171j.A01(context, sMBPartnerType, str);
        }
        AbstractC31180DnO.A1E(supportServiceEditUrlFragment, A01);
        SupportServiceEditUrlFragment.A01(supportServiceEditUrlFragment);
    }
}
