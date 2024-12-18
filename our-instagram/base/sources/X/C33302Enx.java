package X;

import com.instagram.model.direct.DirectShareTarget;
import java.util.BitSet;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.Enx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33302Enx extends C2EN {
    @Override // X.C2EO
    public final /* bridge */ /* synthetic */ BitSet A00(Object obj, int i) {
        List list;
        DirectShareTarget directShareTarget = (DirectShareTarget) obj;
        C14360o3.A0B(directShareTarget, 0);
        BitSet A0j = AbstractC31171DnF.A0j(30);
        String A14 = AbstractC31172DnG.A14(directShareTarget);
        if (A14.length() > 0) {
            A0j.set(Character.toLowerCase(A14.charAt(0)) % 30);
        }
        String str = directShareTarget.A0J;
        if (str == null) {
            str = "";
        }
        List A0h = AbstractC31175DnJ.A0h(str, " ");
        if (!A0h.isEmpty()) {
            ListIterator listIterator = A0h.listIterator(A0h.size());
            while (listIterator.hasPrevious()) {
                if (AbstractC31176DnK.A02(listIterator) != 0) {
                    list = AbstractC31177DnL.A0k(A0h, listIterator);
                    break;
                }
            }
        }
        list = C16930sl.A00;
        for (String str2 : AbstractC31173DnH.A1b(list, 0)) {
            if (str2 != null && str2.length() != 0) {
                A0j.set(Character.toLowerCase(str2.charAt(0)) % 30);
            }
        }
        return A0j;
    }
}
