package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Czm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29534Czm implements InterfaceC196048lu {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C29534Czm(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC196048lu
    public final void onFailure() {
        C05A c05a;
        Object c31;
        switch (this.A00) {
            case 0:
                return;
            case 1:
                c05a = ((C29485Cyz) this.A02).A00;
                c31 = new C31(C05F.A01, C16930sl.A00);
                c05a.Egh(c31);
                return;
            default:
                c05a = ((C29486Cz0) this.A02).A00;
                C16930sl c16930sl = C16930sl.A00;
                c31 = new C33(c16930sl, c16930sl, 0);
                c05a.Egh(c31);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC196048lu
    public final void onSuccess() {
        C05A c05a;
        Object c31;
        switch (this.A00) {
            case 0:
                C2NX c2nx = (C2NX) this.A02;
                CallerContext callerContext = C2NX.A08;
                UserSession userSession = c2nx.A04;
                C83743oJ A01 = C83743oJ.A01(userSession);
                String str = userSession.userId;
                A01.A08((Context) c2nx.A06.get(), new C19270xB("aymh"), userSession, Boolean.valueOf(((AnonymousClass253) this.A01).A01), AbstractC166997dE.A0a(), C05F.A0C, str, true);
                return;
            case 1:
                C29485Cyz c29485Cyz = (C29485Cyz) this.A02;
                c05a = c29485Cyz.A00;
                c31 = new C31(C05F.A00, C29485Cyz.A00((C40921uz) this.A01, c29485Cyz));
                c05a.Egh(c31);
                return;
            default:
                C29486Cz0 c29486Cz0 = (C29486Cz0) this.A02;
                C40921uz c40921uz = (C40921uz) this.A01;
                ArrayList A00 = C29486Cz0.A00(c40921uz, c29486Cz0);
                List A012 = C29486Cz0.A01(c29486Cz0, A00);
                c05a = c29486Cz0.A00;
                c31 = new C33(C29486Cz0.A00(c40921uz, c29486Cz0), A012, A00.size());
                c05a.Egh(c31);
                return;
        }
    }
}
