package X;

import android.content.Context;
import android.os.Build;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class OWe {
    public InterfaceC57911PmH A00;
    public C54845OMq A01;
    public OIB A02;
    public InterfaceC57998Pni A03;
    public InterfaceC58128Ppr A04;
    public InterfaceC16820sZ A05;
    public InterfaceC16660sJ A06;
    public InterfaceC16620sF A07;
    public boolean A08;
    public final Context A09;
    public final C54786OJd A0A;
    public final C55141Ocj A0B;
    public final UserSession A0C;
    public final C23031Ai A0D;
    public final InterfaceC09390do A0E = AbstractC09440dt.A00(EnumC09460dv.A02, new C57239PbN(this, 1));

    public final AbstractC55106ObM A01() {
        C190298bn A01 = C190298bn.A03.A01(this.A0C);
        if (A01 != null) {
            return A01.A00();
        }
        return null;
    }

    public final boolean A02() {
        StringBuilder A1C;
        C195988ln c195988ln = AbstractC195978lm.A02;
        c195988ln.A01("sup:MediaStreamControllerDelegate", "Checking bluetooth permissions...");
        String[] A00 = AbstractC54337Nzv.A00.A00();
        int length = A00.length;
        if (length == 0) {
            A1C = AbstractC166987dD.A1C();
            A1C.append("Android API ");
            A1C.append(Build.VERSION.SDK_INT);
            A1C.append(AbstractC58317Pt9.A00(412));
        } else {
            int i = 0;
            do {
                String str = A00[i];
                Context context = this.A09;
                if (!AbstractC23451Ch.A07(context, str)) {
                    A1C = AbstractC166987dD.A1C();
                    A1C.append("Permissions not granted for: ");
                    ArrayList A1E = AbstractC166987dD.A1E();
                    int i2 = 0;
                    do {
                        String str2 = A00[i2];
                        if (!AbstractC23451Ch.A07(context, str2)) {
                            A1E.add(str2);
                        }
                        i2++;
                    } while (i2 < length);
                    A1C.append(A1E);
                } else {
                    i++;
                }
            } while (i < length);
            return true;
        }
        c195988ln.A04("sup:MediaStreamControllerDelegate", A1C.toString(), null);
        return false;
    }

    public OWe(Context context, C54786OJd c54786OJd, C55141Ocj c55141Ocj, UserSession userSession, C23031Ai c23031Ai) {
        this.A0B = c55141Ocj;
        this.A09 = context;
        this.A0C = userSession;
        this.A0A = c54786OJd;
        this.A0D = c23031Ai;
    }

    public static final boolean A00(OWe oWe) {
        AbstractC53639Nnk abstractC53639Nnk;
        AbstractC55106ObM A01 = oWe.A01();
        if (A01 != null && (abstractC53639Nnk = (AbstractC53639Nnk) A01.A03.getValue()) != null && (abstractC53639Nnk instanceof N1P)) {
            N1P n1p = (N1P) abstractC53639Nnk;
            if (!n1p.A01 && ((AbstractC54520O6x) n1p.A00.A01).A01 == C05F.A0C) {
                return true;
            }
        }
        return false;
    }
}
