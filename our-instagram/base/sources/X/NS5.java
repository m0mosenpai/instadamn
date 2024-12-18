package X;

import android.app.Activity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.model.reels.Reel;

/* loaded from: classes9.dex */
public final class NS5 extends AbstractC140596Xn {
    public final RecyclerView A00;
    public final C51158Mj1 A01;
    public final O4B A02;

    @Override // X.AbstractC140596Xn
    public final C6PN A07(Reel reel, C41181vS c41181vS) {
        C6PN A01;
        C14360o3.A0B(reel, 0);
        C51158Mj1 c51158Mj1 = this.A01;
        int indexOf = c51158Mj1.A00().indexOf(reel);
        RecyclerView recyclerView = this.A00;
        C3OO A0V = recyclerView.A0V(indexOf);
        if (A0V instanceof C51322Mlj) {
            AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
            C14360o3.A0C(abstractC70663Fe, AbstractC43591JPw.A00(20));
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC70663Fe;
            int indexOf2 = c51158Mj1.A00().indexOf(reel);
            if (indexOf2 >= linearLayoutManager.A1c() && indexOf2 <= linearLayoutManager.A1d()) {
                A01 = C6PN.A04(((C51322Mlj) A0V).A02.getAvatarBounds());
                C14360o3.A0A(A01);
                return A01;
            }
        }
        A01 = C6PN.A01();
        C14360o3.A0A(A01);
        return A01;
    }

    @Override // X.AbstractC140596Xn
    public final void A08(Reel reel) {
        C14360o3.A0B(reel, 0);
        O4B o4b = this.A02;
        if (o4b != null) {
            N7M n7m = o4b.A00;
            InterfaceC09390do interfaceC09390do = n7m.A07;
            if (((C51158Mj1) interfaceC09390do.getValue()).A00().indexOf(reel) + 6 >= ((C51158Mj1) interfaceC09390do.getValue()).A00().size()) {
                AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(n7m.A0L);
                AbstractC31176DnK.A1Z(A0Z, AbstractC141776au.A00(A0Z), 46);
            }
        }
    }

    @Override // X.AbstractC140596Xn
    public final void A09(Reel reel, C41181vS c41181vS) {
    }

    @Override // X.AbstractC140596Xn
    public final void A0B(Reel reel, C41181vS c41181vS) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NS5(Activity activity, RecyclerView recyclerView, InterfaceC63982vJ interfaceC63982vJ, C51158Mj1 c51158Mj1, O4B o4b) {
        super(activity, interfaceC63982vJ);
        AbstractC43594JPz.A1P(interfaceC63982vJ, c51158Mj1);
        this.A00 = recyclerView;
        this.A01 = c51158Mj1;
        this.A02 = o4b;
    }
}
