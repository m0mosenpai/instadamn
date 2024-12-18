package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.genericsurvey.fragment.AdBakeOffFragment;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* renamed from: X.Hxf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40497Hxf {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        Fragment A01;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, AbstractC111324zv.A00(15));
        C1338462s c1338462s = (C1338462s) A03;
        C6FG c6fg = c6fq.A03;
        if (c6fg == null) {
            return null;
        }
        C102884kP A00 = VSB.A00(c6fg, c6fq, c1338462s.A02);
        C14360o3.A07(A00);
        String A0E = A00.A0E();
        if (A0E == null) {
            return null;
        }
        String A0s = AbstractC31173DnH.A0s(c6fw.A00, 1);
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 3);
        AbstractC12990ll A0J = AbstractC31175DnJ.A0J(c6fq);
        for (Integer num : C05F.A00(4)) {
            switch (num.intValue()) {
                case 1:
                    str = "bake_off";
                    break;
                case 2:
                    str = AbstractC111324zv.A00(1114);
                    break;
                case 3:
                    str = "acqs";
                    break;
                default:
                    str = "asq";
                    break;
            }
            if (A0E.equals(str)) {
                int A002 = AbstractC66261U6f.A00(new IGH(c6fq, A0I));
                int intValue = num.intValue();
                if (intValue != 2 && intValue != 0 && intValue != 3) {
                    if (intValue != 1) {
                        return null;
                    }
                    IgFragmentFactoryImpl.A00();
                    A01 = new AdBakeOffFragment();
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putString(AbstractC111324zv.A00(288), A0s);
                    A01.setArguments(A0b);
                } else {
                    A01 = IgFragmentFactoryImpl.A00().A01(Integer.valueOf(A002), A0E, A0s, null);
                }
                C14360o3.A0A(A01);
                C140966Yy A0r = AbstractC25225BEi.A0r(C6BQ.A04(c6fq), A0J);
                A0r.A0B(null, A01);
                A0r.A04();
                return null;
            }
        }
        return null;
    }
}
