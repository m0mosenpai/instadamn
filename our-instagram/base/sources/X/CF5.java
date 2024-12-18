package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CF5 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String A0I;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, AbstractC111324zv.A00(15));
        C1338462s c1338462s = (C1338462s) A03;
        C6FG c6fg = c6fq.A03;
        if (c6fg == null) {
            c6fg = C6BQ.A09(c6fq);
        }
        C102884kP A00 = VSB.A00(c6fg, c6fq, c1338462s.A02);
        C14360o3.A07(A00);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        C14360o3.A0B(A04, 0);
        C193328hC c193328hC = new C193328hC((Context) A04);
        String A0I2 = A00.A0I();
        if (A0I2 != null && A0I2.length() != 0) {
            c193328hC.A05 = A0I2;
        }
        String A0G = A00.A0G();
        if (A0G != null && A0G.length() != 0) {
            c193328hC.A0r(A0G);
        }
        List A0N = A00.A0N(35);
        C14360o3.A07(A0N);
        if (!A0N.isEmpty()) {
            List A0g = AbstractC001800i.A0g(A0N, C29613D2o.A00);
            String A0I3 = ((C102884kP) A0g.get(0)).A0I();
            if (A0I3 != null && !A0I3.equals("emphasized")) {
                A0g = BJT.A00(A0N, 1);
            }
            int size = A0g.size();
            for (int i = 0; i < size; i++) {
                Object obj = A0g.get(i);
                C14360o3.A07(obj);
                C102884kP c102884kP = (C102884kP) obj;
                EnumC193348hE enumC193348hE = EnumC193348hE.A04;
                String A0G2 = c102884kP.A0G();
                InterfaceC103384lE A0B = c102884kP.A0B(35);
                if (c102884kP.A0I() != null && (A0I = c102884kP.A0I()) != null) {
                    int hashCode = A0I.hashCode();
                    if (hashCode != -1829997182) {
                        if (hashCode == 506776930 && A0I.equals("emphasized")) {
                            enumC193348hE = EnumC193348hE.A03;
                        }
                    } else if (A0I.equals("destructive")) {
                        enumC193348hE = EnumC193348hE.A05;
                    }
                }
                DialogInterfaceOnClickListenerC28565Cix dialogInterfaceOnClickListenerC28565Cix = null;
                if (A0B != null) {
                    dialogInterfaceOnClickListenerC28565Cix = new DialogInterfaceOnClickListenerC28565Cix(c6fg, c6fq, c102884kP, A0B);
                }
                if (A0G2 != null) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                c193328hC.A0Y(dialogInterfaceOnClickListenerC28565Cix, enumC193348hE, A0G2, true);
                            }
                        } else {
                            c193328hC.A0X(dialogInterfaceOnClickListenerC28565Cix, enumC193348hE, A0G2, true);
                        }
                    } else {
                        c193328hC.A0Z(dialogInterfaceOnClickListenerC28565Cix, enumC193348hE, A0G2, true);
                    }
                }
            }
        }
        if (A00.A0J() != null && C14360o3.A0K(A00.A0J(), "promotional") && A00.A0F() != null) {
            SimpleImageUrl A0t = AbstractC25225BEi.A0t(A00.A0H());
            String A0F = A00.A0F();
            if (A0F != null) {
                int hashCode2 = A0F.hashCode();
                if (hashCode2 != 1079772361) {
                    if (hashCode2 == 1782764648 && A0F.equals("profile_picture")) {
                        c193328hC.A0o(A0t, C6BQ.A07(c6fg));
                    }
                } else if (A0F.equals("full_width_photo")) {
                    c193328hC.A0p(A0t, C6BQ.A07(c6fg));
                }
            }
            InterfaceC11380iw A07 = C6BQ.A07(c6fg);
            c193328hC.A08 = true;
            c193328hC.A0Z.setImageURL(A0t, A07, null);
        }
        AbstractC166987dD.A1W(c193328hC);
        return null;
    }
}
