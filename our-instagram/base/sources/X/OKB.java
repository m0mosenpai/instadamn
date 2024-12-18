package X;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes9.dex */
public final class OKB {
    public final AbstractC12990ll A00;

    public OKB(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 1);
        this.A00 = abstractC12990ll;
    }

    public final void A00(Context context, AbstractC53642Nnn abstractC53642Nnn, String str, String str2, String str3) {
        A01(context, abstractC53642Nnn, str, str2, null, null, str3);
    }

    public final void A01(Context context, AbstractC53642Nnn abstractC53642Nnn, String str, String str2, String str3, String str4, String str5) {
        String A0p;
        Bundle A0C = AbstractC31177DnL.A0C(context);
        AbstractC60492pY.A03(A0C, this.A00);
        OVR ovr = OVR.A00;
        AbstractC06930Yk.A0E();
        OVR ovr2 = OVR.A00;
        synchronized (ovr2) {
            A0p = AbstractC25231BEo.A0p();
            OVR.A02.put(A0p, abstractC53642Nnn);
        }
        synchronized (ovr2) {
            AbstractC06930Yk.A0E();
            new C57271Pbt(context, A0C, A0p, str, str2, str3, str4, str5).invoke();
        }
    }
}
