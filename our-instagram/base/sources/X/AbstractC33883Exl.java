package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.Exl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33883Exl {
    /* JADX WARN: Multi-variable type inference failed */
    public static final C0eB A00(C6FQ c6fq, C6FW c6fw) {
        ArrayList arrayList = (ArrayList) c6fw.A03(0);
        InterfaceC103384lE A0G = AbstractC31175DnJ.A0G(c6fw);
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            C34578FLn c34578FLn = new C34578FLn(c6fg.A00, c6fq, A0G);
            C14360o3.A0B(arrayList, 0);
            if (!arrayList.isEmpty()) {
                Activity activity = c34578FLn.A00;
                if (activity instanceof FragmentActivity) {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Iterator A13 = AbstractC166997dE.A13(arrayList);
                    while (true) {
                        String str = "INVALID_PERMISSION_NAME";
                        if (!A13.hasNext()) {
                            break;
                        }
                        Object obj = FEP.A00.get(AbstractC166997dE.A0l(A13));
                        if (obj != 0) {
                            str = obj;
                        }
                        A1E.add(str);
                    }
                    if (A1E.contains("INVALID_PERMISSION_NAME")) {
                        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(AbstractC06950Ym.A1E(arrayList, 10)));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            A18.put(it.next(), "DENIED");
                        }
                        AbstractC25227BEk.A1M(c34578FLn.A01, AbstractC31179DnN.A0I(A18), c34578FLn.A02);
                    }
                    Activity parent = activity.getParent();
                    if (parent == null) {
                        parent = activity;
                    }
                    C36162Fxc c36162Fxc = new C36162Fxc(c34578FLn, 0);
                    String[] strArr = (String[]) A1E.toArray(new String[0]);
                    AbstractC23451Ch.A04(parent, c36162Fxc, (String[]) Arrays.copyOf(strArr, strArr.length));
                    return C0eB.A00;
                }
            }
            LinkedHashMap A182 = AbstractC25225BEi.A18(AbstractC167017dG.A01(AbstractC06950Ym.A1E(arrayList, 10)));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                A182.put(it2.next(), "DENIED");
            }
            AbstractC25227BEk.A1M(c34578FLn.A01, AbstractC31179DnN.A0I(A182), c34578FLn.A02);
            return C0eB.A00;
        }
        throw AbstractC166997dE.A0g();
    }
}
