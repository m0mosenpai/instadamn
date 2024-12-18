package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Gf3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37485Gf3 implements InterfaceC61732ra {
    public final int A00;

    @Override // X.InterfaceC61732ra
    public final /* bridge */ /* synthetic */ List AMo(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Object obj, int i) {
        C38321qM c38321qM;
        switch (this.A00) {
            case 0:
                return C3ZG.A01(context, interfaceC11380iw, userSession, AbstractC166987dD.A1J(obj), i);
            case 1:
                ArrayList A1E = AbstractC166987dD.A1E();
                if (obj instanceof C38321qM) {
                    c38321qM = (C38321qM) obj;
                } else if (obj instanceof C40971v4) {
                    c38321qM = ((C40971v4) obj).A0K;
                } else {
                    if (!(obj instanceof C47K)) {
                        return A1E;
                    }
                    C3ZG.A03(context, interfaceC11380iw, userSession, (C47K) obj, A1E, i);
                    return A1E;
                }
                C3ZG.A02(context, interfaceC11380iw, userSession, c38321qM, A1E, i);
                return A1E;
            default:
                return null;
        }
    }

    public C37485Gf3(int i) {
        this.A00 = i;
    }
}
