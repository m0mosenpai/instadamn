package X;

import android.graphics.Bitmap;
import com.instagram.user.model.User;

/* renamed from: X.Act, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23599Act implements C1NJ {
    public final User A00;
    public final String A01;
    public final /* synthetic */ APo A02;

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        boolean A1R = AbstractC167007dF.A1R(0, interfaceC59502nt, c73033Pe);
        APo aPo = this.A02;
        if (aPo.A09 == this.A00) {
            Bitmap bitmap = c73033Pe.A01;
            if (bitmap == null) {
                DLP(interfaceC59502nt, null);
                return;
            }
            Object C4x = interfaceC59502nt.C4x();
            C14360o3.A0C(C4x, "null cannot be cast to non-null type kotlin.Int");
            aPo.A0B[AbstractC166987dD.A0H(C4x)] = new C38687GzS(this.A01, bitmap);
            C38687GzS[] c38687GzSArr = aPo.A0B;
            if (c38687GzSArr[0] == null || c38687GzSArr[A1R ? 1 : 0] == null || c38687GzSArr[2] == null) {
                return;
            }
            aPo.A0M.E4u(new C187988Up(APo.A00(aPo)));
        }
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    public C23599Act(APo aPo, User user, String str) {
        this.A02 = aPo;
        this.A00 = user;
        this.A01 = str;
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        APo aPo = this.A02;
        if (aPo.A09 == this.A00) {
            aPo.A0B = new C38687GzS[3];
            aPo.A0M.E4u(new C187988Up(APo.A00(aPo)));
        }
    }
}
