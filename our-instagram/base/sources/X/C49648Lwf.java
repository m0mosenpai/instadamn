package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.List;

/* renamed from: X.Lwf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49648Lwf implements C7OC {
    public final int A00;
    public final Object A01;

    public C49648Lwf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C7OC
    public final void DDL(Drawable drawable, View view, C148336m3 c148336m3) {
        String str;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c148336m3, 0);
                ((C167757eV) this.A01).A04.invoke(c148336m3.A02);
                return;
            case 1:
                C14360o3.A0B(c148336m3, 0);
                C47974LIk c47974LIk = ((LJZ) this.A01).A03;
                if (c47974LIk.A0K) {
                    C44539Jmj c44539Jmj = c47974LIk.A0E;
                    String str2 = c47974LIk.A0G;
                    int i = c47974LIk.A06;
                    if (str2 == null) {
                        return;
                    }
                    AbstractC166987dD.A1Z(new MC6(c44539Jmj, c148336m3, (InterfaceC23621Ds) null, i), AbstractC141776au.A00(c44539Jmj));
                    return;
                }
                c47974LIk.A0F.A05(c148336m3);
                InterfaceC50481MQj interfaceC50481MQj = c47974LIk.A0D.A00.A01;
                if (interfaceC50481MQj == null) {
                    C14360o3.A0F("delegate");
                    throw C00O.createAndThrow();
                }
                interfaceC50481MQj.DDM(c148336m3);
                return;
            case 2:
                AbstractC167007dF.A1K(c148336m3, view);
                C148176ln c148176ln = (C148176ln) this.A01;
                C145356gu c145356gu = c148176ln.A0O;
                Context A0L = AbstractC166997dE.A0L(view);
                String str3 = c148336m3.A02;
                String str4 = c148336m3.A01;
                C41181vS c41181vS = c148176ln.A00;
                if (c41181vS != null) {
                    c145356gu.A01(A0L, view, c148176ln.A0D, c41181vS, str3, str4, false);
                    C148196lp c148196lp = c148176ln.A0M;
                    C14360o3.A0B(str3, 0);
                    C148336m3 A01 = C168157fA.A01(str3);
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    List<C83863oV> A00 = C148196lp.A00(c148196lp);
                    if (A00 == null) {
                        A00 = C83863oV.A05;
                    }
                    for (C83863oV c83863oV : A00) {
                        C148336m3 A012 = C168157fA.A01(c83863oV.A02);
                        A1C.append(c83863oV.A01);
                        A1C.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                        if (AbstractC170297ii.A01(A01, A012)) {
                            str = A01.A02;
                        } else {
                            str = A012.A02;
                        }
                        A1C.append(str);
                        A1C.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                        A1C.append(c83863oV.A00);
                        A1C.append(";");
                    }
                    C23031Ai c23031Ai = c148196lp.A02;
                    String obj = A1C.toString();
                    C14360o3.A0B(obj, 0);
                    InterfaceC19610xo A0w = AbstractC166987dD.A0w(c23031Ai);
                    A0w.E7K(AbstractC111324zv.A00(3706), obj);
                    A0w.apply();
                    c148196lp.A05(c148336m3);
                    C148176ln.A06(c148176ln);
                    return;
                }
                throw AbstractC166997dE.A0g();
            default:
                C14360o3.A0B(c148336m3, 0);
                ((AbstractC43757JWv) this.A01).A0G(c148336m3.A02, "quick_emoji_tray");
                return;
        }
    }
}
