package X;

import android.app.Activity;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Fa2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34916Fa2 {
    public static final Map A01 = AbstractC25232BEp.A1F(3, "android.permission.READ_PHONE_STATE", AbstractC166987dD.A1L(1, "android.permission.GET_ACCOUNTS"), AbstractC166987dD.A1L(2, "android.permission.READ_CONTACTS"));
    public static final Map A00 = AbstractC167017dG.A0u(4, "android.permission.READ_PHONE_NUMBERS", AbstractC166987dD.A1L(1, "android.permission.GET_ACCOUNTS"), AbstractC166987dD.A1L(2, "android.permission.READ_CONTACTS"), AbstractC166987dD.A1L(3, "android.permission.READ_PHONE_STATE"));

    public static final Boolean A00(C6FQ c6fq, C6FW c6fw) {
        AbstractCollection abstractCollection = (AbstractCollection) c6fw.A03(0);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            Object A0m = AbstractC166997dE.A0m(A00, AbstractC167007dF.A0B(it));
            if (A0m != null) {
                A1E.add(A0m);
            }
        }
        String[] strArr = (String[]) A1E.toArray(new String[0]);
        InterfaceC103384lE A0G = AbstractC31175DnJ.A0G(c6fw);
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Activity activity = (Activity) c6fg.A00;
            Activity parent = activity.getParent();
            if (parent != null) {
                activity = parent;
            }
            AbstractC23451Ch.A04(activity, new C70784Wgx(0, c6fq, A0G, AbstractC166987dD.A1E()), (String[]) Arrays.copyOf(strArr, strArr.length));
            return null;
        }
        return false;
    }
}
