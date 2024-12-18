package X;

import android.app.Activity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.model.reels.Reel;

/* renamed from: X.Eie, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33081Eie extends AbstractC140596Xn {
    public final RecyclerView A00;
    public final C31890Dzw A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33081Eie(Activity activity, RecyclerView recyclerView, C31890Dzw c31890Dzw, InterfaceC63982vJ interfaceC63982vJ) {
        super(activity, interfaceC63982vJ);
        C14360o3.A0B(c31890Dzw, 4);
        this.A00 = recyclerView;
        this.A01 = c31890Dzw;
    }

    @Override // X.AbstractC140596Xn
    public final C6PN A07(Reel reel, C41181vS c41181vS) {
        C6PN A01;
        C14360o3.A0B(reel, 0);
        C31890Dzw c31890Dzw = this.A01;
        int indexOf = c31890Dzw.A00().indexOf(reel);
        RecyclerView recyclerView = this.A00;
        C3OO A0V = recyclerView.A0V(indexOf);
        if (A0V instanceof E25) {
            AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
            C14360o3.A0C(abstractC70663Fe, AbstractC43591JPw.A00(20));
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC70663Fe;
            int indexOf2 = c31890Dzw.A00().indexOf(reel);
            if (indexOf2 >= linearLayoutManager.A1c() && indexOf2 <= linearLayoutManager.A1d()) {
                A01 = C6PN.A04(((E25) A0V).A01.getAvatarBounds());
                C14360o3.A0A(A01);
                return A01;
            }
        }
        A01 = C6PN.A01();
        C14360o3.A0A(A01);
        return A01;
    }

    @Override // X.AbstractC140596Xn
    public final void A09(Reel reel, C41181vS c41181vS) {
    }

    @Override // X.AbstractC140596Xn
    public final void A0B(Reel reel, C41181vS c41181vS) {
    }

    @Override // X.AbstractC140596Xn
    public final void A08(Reel reel) {
    }
}
