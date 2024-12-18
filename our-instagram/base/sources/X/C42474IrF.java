package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IrF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42474IrF implements InterfaceC76813cT {
    @Override // X.InterfaceC76813cT
    public final CharSequence Brc(Context context, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb) {
        C14360o3.A0B(c38321qM, 3);
        C76463bq c76463bq = AbstractC76453bp.A00;
        C5GU A02 = c76463bq.A02(c38321qM);
        if (A02 != null && A02.ordinal() == 6) {
            return c76463bq.A04(c38321qM);
        }
        return null;
    }

    @Override // X.InterfaceC76813cT
    public final CharSequence C5v(Context context, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb) {
        Object obj;
        JMT Bgt;
        JL0 AyK;
        JL0 AyK2;
        JL0 AyK3;
        String AcQ;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(c38321qM, 1);
        C76463bq c76463bq = AbstractC76453bp.A00;
        C5GU A02 = c76463bq.A02(c38321qM);
        if (A02 != null && A02.ordinal() == 6) {
            String A04 = c76463bq.A04(c38321qM);
            JMT Bgt2 = c38321qM.A0C.Bgt();
            String str = null;
            if (Bgt2 != null && (AyK3 = Bgt2.AyK()) != null && (AcQ = AyK3.AcQ()) != null) {
                str = AcQ;
            } else {
                List A01 = C76463bq.A01(c38321qM);
                if (A01 != null) {
                    Iterator it = A01.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            JMT Bgt3 = ((C38321qM) obj).A0C.Bgt();
                            if (Bgt3 != null && (AyK2 = Bgt3.AyK()) != null && AyK2.AcQ() != null) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    C38321qM c38321qM2 = (C38321qM) obj;
                    if (c38321qM2 != null && (Bgt = c38321qM2.A0C.Bgt()) != null && (AyK = Bgt.AyK()) != null) {
                        str = AyK.AcQ();
                    }
                }
            }
            return AbstractC40634Hzs.A00(context, A04, str, c76463bq.A06(c38321qM));
        }
        return AbstractC166997dE.A0p(context, 2131976835);
    }

    @Override // X.InterfaceC76813cT
    public final boolean EjR(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        return true;
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ Integer BEt() {
        return null;
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ boolean Ejq() {
        return false;
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ String BTZ(Context context, C38321qM c38321qM, C75113Zb c75113Zb) {
        return null;
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ List Bre(C38321qM c38321qM, C75113Zb c75113Zb) {
        return null;
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ boolean EjP(UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb) {
        return false;
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ boolean EjQ(UserSession userSession, C38321qM c38321qM) {
        return false;
    }
}
