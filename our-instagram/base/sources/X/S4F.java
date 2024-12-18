package X;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes10.dex */
public abstract class S4F {
    /* JADX WARN: Type inference failed for: r14v0, types: [X.ShQ, java.lang.Object] */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C4IB c4ib;
        Integer num;
        String A0E;
        C102884kP c102884kP = (C102884kP) c6fw.A03(0);
        InterfaceC103384lE A0G = AbstractC31175DnJ.A0G(c6fw);
        if (c102884kP != null && (A0E = c102884kP.A0E()) != null) {
            c4ib = C4IB.valueOf(AbstractC166997dE.A10(Locale.ROOT, A0E));
        } else {
            c4ib = null;
        }
        C14360o3.A0C(c4ib, "null cannot be cast to non-null type com.facebook.runtimepermissions.devicepermissionkit.shared.DevicePermissionAccessLevel");
        List A0O = c102884kP.A0O(38);
        ArrayList A10 = AbstractC31174DnI.A10(A0O);
        Iterator it = A0O.iterator();
        while (it.hasNext()) {
            A10.add(EnumC61136Rfq.valueOf(AbstractC166997dE.A10(Locale.ROOT, (String) AbstractC166997dE.A0l(it))));
        }
        String A0G2 = c102884kP.A0G();
        if (A0G2 != null) {
            num = S1F.A00(AbstractC166997dE.A10(Locale.ROOT, A0G2));
        } else {
            num = null;
        }
        C14360o3.A0C(num, "null cannot be cast to non-null type com.facebook.runtimepermissions.devicepermissionkit.shared.DevicePermissionStorageLevel");
        C51760Mtj c51760Mtj = new C51760Mtj(c4ib, num, A10);
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Activity A01 = AbstractC68641VYw.A00.A01(c6fg.A00);
            if (A01 != null) {
                ?? obj = new Object();
                C64483TFt c64483TFt = new C64483TFt(5, A01, c51760Mtj, new C62560SGl(c6fq, A0G, C63318ShQ.A03(A01, c51760Mtj)), obj);
                C14360o3.A07(A01.getApplicationContext());
                String[] A1b = AbstractC31173DnH.A1b(C63318ShQ.A00(c51760Mtj, obj), 0);
                AbstractC23451Ch.A04(A01, c64483TFt, (String[]) Arrays.copyOf(A1b, A1b.length));
                return null;
            }
        }
        C6FX A0s = AbstractC25225BEi.A0s();
        A0s.A03("status_error", 0);
        AbstractC25227BEk.A1M(c6fq, A0s, A0G);
        return null;
    }
}
