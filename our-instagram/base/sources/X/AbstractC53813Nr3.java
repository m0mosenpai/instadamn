package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.privacy.consent.bloks.instagram.InstagramConsentFlowHostActivity;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.Nr3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53813Nr3 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A03;
        String A0Z = AbstractC31175DnJ.A0Z(c6fw, "null cannot be cast to non-null type kotlin.String");
        List list = c6fw.A00;
        String A0s = AbstractC31173DnH.A0s(list, 2);
        String A0s2 = AbstractC31173DnH.A0s(list, 3);
        String A0s3 = AbstractC31173DnH.A0s(list, 4);
        String A0y = AbstractC43593JPy.A0y(c6fw, 5);
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 6);
        InterfaceC103384lE A0I2 = AbstractC31175DnJ.A0I(c6fw, 7);
        InterfaceC103384lE A0I3 = AbstractC31175DnJ.A0I(c6fw, 8);
        InterfaceC103384lE A0I4 = AbstractC31175DnJ.A0I(c6fw, 9);
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC60492pY.A03(A0b, C6BQ.A0B(c6fq));
        AbstractC167007dF.A1K(str, A0Z);
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Context context = c6fg.A00;
            OU3 ou3 = new OU3(c6fq, A0I, A0I2, A0I3, A0I4);
            synchronized (OVR.A00) {
                AbstractC06930Yk.A0E();
                String A0h = AbstractC31171DnF.A0h(str, OVR.A01);
                if (A0h != null) {
                    str = A0h;
                }
                Intent A08 = MSW.A08(context, InstagramConsentFlowHostActivity.class);
                A08.putExtra("flow_name", A0Z);
                A08.putExtra("experience_id", str);
                if (A0s != null) {
                    A08.putExtra(CacheBehaviorLogger.SOURCE, A0s);
                }
                if (A0s2 != null) {
                    A08.putExtra(AbstractC58361Pu1.A01(0, 9, 38), A0s2);
                }
                if (A0s3 == null) {
                    A0s3 = "flow.action";
                }
                A08.putExtra("app_id", AnonymousClass001.A0R("com.bloks.www.consent.", A0s3));
                if (A0y != null) {
                    A08.putExtra("extra_params_json", A0y);
                }
                A08.putExtras(A0b);
                String A0T = AnonymousClass001.A0T(str, A0Z, '$');
                OVR.A03.addLast(A0T);
                ReentrantReadWriteLock.WriteLock A0r = AbstractC50522MSa.A0r(A0T);
                try {
                    AbstractC54958OSi.A00.put(A0T, ou3);
                    A0r.unlock();
                    C0b3.A00().A07().A0G(context, A08);
                } catch (Throwable th) {
                    A0r.unlock();
                    throw th;
                }
            }
            return null;
        }
        throw AbstractC166997dE.A0g();
    }
}
