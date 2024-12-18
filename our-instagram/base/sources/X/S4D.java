package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class S4D {
    /* JADX WARN: Type inference failed for: r4v2, types: [X.ShQ, java.lang.Object] */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C4IB c4ib;
        Integer num;
        Context context;
        Map map;
        C4IC c4ic;
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
            context = c6fg.A00;
        } else {
            context = null;
        }
        ?? obj = new Object();
        if (context != null) {
            List A00 = C63318ShQ.A00(c51760Mtj, obj);
            LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC50522MSa.A09(A00));
            for (Object obj2 : A00) {
                if (AbstractC23451Ch.A07(context, (String) obj2)) {
                    c4ic = C4IC.A06;
                } else {
                    c4ic = C4IC.A05;
                }
                A18.put(obj2, c4ic);
            }
            map = C63318ShQ.A01(c51760Mtj, obj, A18);
        } else {
            map = null;
        }
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (map != null) {
            Iterator A12 = AbstractC43593JPy.A12(map);
            while (A12.hasNext()) {
                Object next = A12.next();
                C4IC c4ic2 = (C4IC) map.get(next);
                if (c4ic2 != null) {
                    A1I.put(next, c4ic2.A00);
                }
            }
        }
        C131845xK.A00(c6fq, AbstractC58320PtC.A0g(A1I), A0G);
        return null;
    }
}
