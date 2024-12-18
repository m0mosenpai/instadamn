package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.KEo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45549KEo extends C1P1 {
    public final boolean A00;
    public final /* synthetic */ C47957LGt A01;

    public C45549KEo(C47957LGt c47957LGt, String str, boolean z) {
        C14360o3.A0B(str, 2);
        this.A01 = c47957LGt;
        this.A00 = z;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -987841825);
        if (abstractC115105If instanceof C115115Ig) {
            String str = ((K8N) ((C115115Ig) abstractC115105If).A00).A03;
            C14360o3.A07(str);
            this.A01.A07.Dxw(str, this.A00);
        }
        C47957LGt c47957LGt = this.A01;
        if (!this.A00) {
            c47957LGt.A07.DLZ();
        }
        C0f9.A0A(-1654705257, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(624864000);
        boolean z = this.A00;
        C47957LGt c47957LGt = this.A01;
        if (z) {
            c47957LGt.A0A = false;
        } else {
            c47957LGt.A0B = false;
        }
        C0f9.A0A(1225757835, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-945508041);
        C47957LGt c47957LGt = this.A01;
        L77 A00 = AbstractC46618Kjv.A00(c47957LGt.A09);
        AbstractC43592JPx.A1V("lookup_user", A00.A00.now(), A00.A01);
        if (this.A00) {
            c47957LGt.A0A = true;
        } else {
            c47957LGt.A0B = true;
        }
        C0f9.A0A(-1401316306, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        FollowStatus B7L;
        int A03 = C0f9.A03(2055216521);
        K8N k8n = (K8N) obj;
        int A0N = AbstractC167017dG.A0N(k8n, -416839040);
        User user = k8n.A02;
        C14360o3.A07(user);
        C47957LGt c47957LGt = this.A01;
        boolean z = this.A00;
        user.getUsername();
        UserSession userSession = c47957LGt.A09;
        C2TN.A04(userSession, user);
        user.getUsername();
        c47957LGt.A07.Dxn(user, z);
        if (!C2TN.A04(userSession, user) && ((B7L = user.B7L()) == FollowStatus.A05 || B7L == FollowStatus.A07)) {
            user.getUsername();
        }
        C0f9.A0A(-212610346, A0N);
        C0f9.A0A(-841128090, A03);
    }
}
