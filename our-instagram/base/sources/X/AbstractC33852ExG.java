package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.ExG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33852ExG {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        Object obj;
        Object obj2;
        EnumC33363Eow enumC33363Eow;
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        boolean A1R = AbstractC167007dF.A1R(0, A0W, A04);
        List list = c6fw.A00;
        String A0s = AbstractC31173DnH.A0s(list, 0);
        C34522FJi c34522FJi = new C34522FJi(c6fq, AbstractC25228BEl.A0t(list, 2));
        Object obj3 = null;
        if (5 < list.size()) {
            obj = list.get(5);
        } else {
            obj = null;
        }
        String str = (String) obj;
        if (6 < list.size()) {
            obj2 = list.get(6);
        } else {
            obj2 = null;
        }
        String str2 = (String) obj2;
        if (str2 == null || (enumC33363Eow = EnumC33363Eow.valueOf(str2)) == null) {
            enumC33363Eow = EnumC33363Eow.A02;
        }
        if (7 < list.size()) {
            obj3 = list.get(7);
        }
        C1XJ.A00.A0T();
        C32232EHq c32232EHq = new C32232EHq();
        Bundle A05 = AbstractC31178DnM.A05(A0W);
        A05.putString(AbstractC111324zv.A00(2908), A0s);
        A05.putString("product_id", str);
        A05.putString("merchant_id", (String) obj3);
        A05.putSerializable("product_guide_picker_entry_point", enumC33363Eow);
        c32232EHq.setArguments(A05);
        c32232EHq.A00 = c34522FJi;
        C140966Yy A0r = AbstractC25225BEi.A0r(A04, A0W);
        A0r.A0B(null, c32232EHq);
        A0r.A0E = A1R;
        A0r.A03();
        return null;
    }
}
