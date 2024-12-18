package X;

import android.content.res.Resources;
import java.util.List;

/* renamed from: X.Vz1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69982Vz1 {
    /* JADX WARN: Type inference failed for: r0v6, types: [X.W1u, X.VAS] */
    public static VAS A00(Resources resources, C69423Vn8 c69423Vn8, int i, int i2) {
        int i3;
        Object[] A1Z;
        String string;
        String str = c69423Vn8.A00.A00;
        String str2 = c69423Vn8.A03;
        if (i == -1) {
            string = null;
        } else {
            if (i2 == -1) {
                i3 = 2131974787;
                A1Z = AbstractC25228BEl.A1Y(i);
            } else {
                i3 = 2131974786;
                A1Z = AbstractC25228BEl.A1Z(Integer.valueOf(i), i2);
            }
            string = resources.getString(i3, A1Z);
        }
        ?? c70077W1u = new C70077W1u(VDB.QUESTION, str2);
        c70077W1u.A01 = string;
        c70077W1u.A00 = str;
        return c70077W1u;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.W1u, X.VAV] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.VJX, java.lang.Object] */
    public static void A01(C69423Vn8 c69423Vn8, C69128ViJ c69128ViJ, List list, boolean z) {
        VAX vax;
        Object c70077W1u;
        String str = c69128ViJ.A01.A00;
        int i = c69128ViJ.A00;
        String str2 = c69128ViJ.A02;
        ?? obj = new Object();
        obj.A00 = i;
        obj.A02 = str2;
        obj.A01 = str;
        if (z) {
            vax = new VAX(obj, VDB.RADIOWRITEIN, c69423Vn8.A03);
        } else {
            ?? c70077W1u2 = new C70077W1u(VDB.RADIO, c69423Vn8.A03);
            c70077W1u2.A00 = obj;
            vax = c70077W1u2;
        }
        list.add(vax);
        if (z) {
            c70077W1u = new VAT();
        } else {
            c70077W1u = new C70077W1u(VDB.DIVIDER, c69423Vn8.A03);
        }
        list.add(c70077W1u);
    }
}
