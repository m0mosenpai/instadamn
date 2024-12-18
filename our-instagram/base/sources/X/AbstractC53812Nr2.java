package X;

import android.content.Context;
import android.os.Bundle;
import java.util.List;

/* renamed from: X.Nr2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53812Nr2 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String A0p;
        Object A03 = c6fw.A03(0);
        AbstractC25225BEi.A1S(A03);
        String str = (String) A03;
        List list = c6fw.A00;
        String A0s = AbstractC31173DnH.A0s(list, 1);
        String A0s2 = AbstractC31173DnH.A0s(list, 2);
        String A0s3 = AbstractC31173DnH.A0s(list, 3);
        String A0s4 = AbstractC31173DnH.A0s(list, 4);
        InterfaceC103384lE A0t = AbstractC25228BEl.A0t(list, 5);
        InterfaceC103384lE A0t2 = AbstractC25228BEl.A0t(list, 6);
        InterfaceC103384lE A0t3 = AbstractC25228BEl.A0t(list, 7);
        InterfaceC103384lE A0t4 = AbstractC25228BEl.A0t(list, 8);
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC60492pY.A03(A0b, C6BQ.A0B(c6fq));
        C14360o3.A0B(str, 0);
        C6FG c6fg = c6fq.A03;
        if (c6fg == null) {
            return null;
        }
        Context context = c6fg.A00;
        C51973MyG c51973MyG = new C51973MyG(c6fq, A0t, A0t2, A0t3, A0t4);
        OVR ovr = OVR.A00;
        AbstractC06930Yk.A0E();
        OVR ovr2 = OVR.A00;
        synchronized (ovr2) {
            A0p = AbstractC25231BEo.A0p();
            OVR.A02.put(A0p, c51973MyG);
        }
        synchronized (ovr2) {
            AbstractC06930Yk.A0E();
            new C57271Pbt(context, A0b, A0p, str, A0s, A0s2, A0s3, A0s4).invoke();
        }
        return null;
    }
}
