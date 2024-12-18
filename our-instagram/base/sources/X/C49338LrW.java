package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.LrW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49338LrW implements C7T2 {
    public final C7T0 A00;
    public final C7TT A01;

    public C49338LrW(C7T0 c7t0, C7TT c7tt) {
        C14360o3.A0B(c7tt, 2);
        this.A00 = c7t0;
        this.A01 = c7tt;
    }

    @Override // X.C7T2
    public final String CEx() {
        return null;
    }

    @Override // X.C7T2
    public final boolean CLw() {
        return true;
    }

    @Override // X.C7T2
    public final boolean CeU(Context context, UserSession userSession) {
        return false;
    }

    @Override // X.C7T2
    public final boolean CeV(Context context, UserSession userSession) {
        return false;
    }

    private final C7TT A00() {
        C7TT C7W;
        C7T0 c7t0 = this.A00;
        if (c7t0 == null || (C7W = c7t0.C7W()) == null) {
            return this.A01;
        }
        return C7W;
    }

    @Override // X.C7T2
    public final List Ab0() {
        List list = A00().A0b;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1E.add(AbstractC25226BEj.A15(it).Bhu());
        }
        return AbstractC001800i.A0a(A1E);
    }

    @Override // X.C7T2
    public final EnumC53137Neq B06() {
        boolean z = A00().A0r;
        if (z) {
            return EnumC53137Neq.A02;
        }
        if (!z) {
            return EnumC53137Neq.A04;
        }
        throw B4Z.A00();
    }

    @Override // X.C7T2
    public final Map BJh() {
        return A00().A0e;
    }

    @Override // X.C7T2
    public final List BSD() {
        String obj;
        List list = A00().A0b;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long BTC = AbstractC25226BEj.A15(it).BTC();
            if (BTC != null && (obj = BTC.toString()) != null) {
                A1E.add(obj);
            }
        }
        return A1E;
    }

    @Override // X.C7T2
    public final List BSF() {
        String obj;
        List list = A00().A0b;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long BTC = AbstractC25226BEj.A15(it).BTC();
            if (BTC != null && (obj = BTC.toString()) != null) {
                A1E.add(obj);
            }
        }
        return A1E;
    }

    @Override // X.C7T2
    public final List BSH() {
        return AbstractC31173DnH.A0L(A00().A0b);
    }

    @Override // X.C7T2
    public final User Ba5() {
        return (User) AbstractC001800i.A0J(A00().A0b);
    }

    @Override // X.C7T2
    public final List Bl3() {
        String obj;
        List list = A00().A0b;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long BTC = AbstractC25226BEj.A15(it).BTC();
            if (BTC != null && (obj = BTC.toString()) != null) {
                A1E.add(obj);
            }
        }
        return A1E;
    }

    @Override // X.C7T2
    public final String C7I() {
        return A00().A0Y;
    }

    @Override // X.C7T2
    public final String C7X() {
        Long l;
        InterfaceC83733oI interfaceC83733oI = A00().A0P;
        if (interfaceC83733oI != null && (l = AbstractC1345466e.A03(interfaceC83733oI).A02) != null) {
            return l.toString();
        }
        return null;
    }

    @Override // X.C7T2
    public final int C7g() {
        return A00().A08;
    }

    @Override // X.C7T2
    public final String C7m(Context context, UserSession userSession) {
        String str;
        String str2 = A00().A0W;
        if (str2 == null) {
            InterfaceC83733oI interfaceC83733oI = A00().A0P;
            if (interfaceC83733oI != null) {
                str = String.valueOf(AbstractC1345466e.A03(interfaceC83733oI).A00);
            } else {
                str = null;
            }
            return AnonymousClass001.A0R("Thread: ", str);
        }
        return str2;
    }

    @Override // X.C7T2
    public final String C7q() {
        InterfaceC83733oI interfaceC83733oI = A00().A0P;
        if (interfaceC83733oI != null) {
            return String.valueOf(AbstractC1345466e.A03(interfaceC83733oI).A00);
        }
        return null;
    }

    @Override // X.C7T2
    public final String CEy() {
        return A00().A0X;
    }

    @Override // X.C7T2
    public final boolean CKe() {
        Integer num;
        Integer num2 = A00().A0R;
        if ((num2 != null && num2.intValue() == 4) || ((num = A00().A0R) != null && num.intValue() == 1)) {
            return true;
        }
        return false;
    }

    @Override // X.C7T2
    public final boolean CKg() {
        Integer num = A00().A0R;
        if (num == null || num.intValue() != 3) {
            Integer num2 = A00().A0R;
            if (num2 != null && num2.intValue() == 2) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // X.C7T2
    public final boolean CVQ() {
        return A00().A0r;
    }

    @Override // X.C7T2
    public final boolean CWO() {
        return A00().A0x;
    }

    @Override // X.C7T2
    public final boolean CWf() {
        return A00().A1A;
    }

    @Override // X.C7T2
    public final boolean CX1() {
        return A00().A0y;
    }

    @Override // X.C7T2
    public final boolean CbK() {
        return A00().A16;
    }

    @Override // X.C7T2
    public final boolean CeT(Context context, UserSession userSession) {
        if (A00().A03 > 1) {
            if (!AbstractC31224Do7.A03(A00().A0b, A00().A0r)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C7T2
    public final boolean CfZ(Context context, UserSession userSession) {
        List BSH = BSH();
        if (BSH.size() != 1) {
            return false;
        }
        User user = (User) BSH.get(0);
        if (user.A0I() == EnumC222416a.A05 && user.isVerified()) {
            return true;
        }
        return false;
    }
}
