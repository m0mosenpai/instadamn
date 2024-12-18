package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public final class TH3 implements MQM {
    public final /* synthetic */ C60890Ray A00;

    public TH3(C60890Ray c60890Ray) {
        this.A00 = c60890Ray;
    }

    @Override // X.MQM
    public final void DLE(Integer num) {
        String str;
        C60890Ray c60890Ray = this.A00;
        AbstractC10360h2 abstractC10360h2 = c60890Ray.A03;
        if (abstractC10360h2 == null) {
            str = "fragmentManager";
        } else {
            AbstractC63248Sg4.A01(abstractC10360h2);
            Context context = c60890Ray.A00;
            if (context == null) {
                str = "context";
            } else {
                C0fJ.A00(FYS.A00(context));
                TF9 tf9 = c60890Ray.A04;
                if (tf9 == null) {
                    str = "idVerificationLogger";
                } else {
                    tf9.A00(EnumC61065Ree.A03, EnumC61067Reg.A01, c60890Ray.A07);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.MQM
    public final void DLF() {
        String str;
        C60890Ray c60890Ray = this.A00;
        Context context = c60890Ray.A00;
        if (context == null) {
            str = "context";
        } else {
            UserSession session = c60890Ray.getSession();
            if (c60890Ray.A02 == null) {
                str = "fragmentActivity";
            } else {
                AbstractC10360h2 abstractC10360h2 = c60890Ray.A03;
                if (abstractC10360h2 == null) {
                    str = "fragmentManager";
                } else {
                    FYS.A01(context, abstractC10360h2, session);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
