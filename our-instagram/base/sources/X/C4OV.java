package X;

import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.List;

/* renamed from: X.4OV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4OV extends C4NK {
    public String A00;
    public List A01;
    public List A02;

    public final List A00(QuickPromotionSurface quickPromotionSurface) {
        C116975Rg c116975Rg;
        C116995Ri c116995Ri;
        C117015Rk c117015Rk;
        List list;
        C14360o3.A0B(quickPromotionSurface, 0);
        List<C116955Re> list2 = this.A02;
        if (list2 != null) {
            for (C116955Re c116955Re : list2) {
                int i = quickPromotionSurface.A00;
                Integer num = c116955Re.A01;
                if (num != null && i == num.intValue() && (c116975Rg = c116955Re.A00) != null && (c116995Ri = c116975Rg.A00) != null && (c117015Rk = c116995Ri.A00) != null && (list = c117015Rk.A00) != null) {
                    return list;
                }
            }
        }
        return null;
    }
}
