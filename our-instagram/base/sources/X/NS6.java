package X;

import android.app.Activity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.model.reels.Reel;
import java.util.List;

/* loaded from: classes9.dex */
public final class NS6 extends AbstractC140596Xn {
    public final RecyclerView A00;
    public final C51175MjJ A01;
    public final O47 A02;
    public final boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NS6(Activity activity, RecyclerView recyclerView, InterfaceC63982vJ interfaceC63982vJ, C51175MjJ c51175MjJ, O47 o47, boolean z) {
        super(activity, interfaceC63982vJ);
        AbstractC167007dF.A1G(interfaceC63982vJ, 2, c51175MjJ);
        this.A03 = z;
        this.A00 = recyclerView;
        this.A01 = c51175MjJ;
        this.A02 = o47;
    }

    @Override // X.AbstractC140596Xn
    public final C6PN A07(Reel reel, C41181vS c41181vS) {
        C6PN A01;
        C14360o3.A0B(reel, 0);
        List list = this.A01.A02;
        int indexOf = list.indexOf(reel) + (this.A03 ? 1 : 0);
        RecyclerView recyclerView = this.A00;
        C3OO A0V = recyclerView.A0V(indexOf);
        if (A0V instanceof C51322Mlj) {
            AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
            C14360o3.A0C(abstractC70663Fe, AbstractC43591JPw.A00(20));
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC70663Fe;
            int indexOf2 = list.indexOf(reel);
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
        O47 o47 = this.A02;
        if (o47 != null) {
            N7L n7l = o47.A00;
            InterfaceC09390do interfaceC09390do = n7l.A0A;
            if (((C51175MjJ) interfaceC09390do.getValue()).A02.indexOf(reel) + 6 >= ((C51175MjJ) interfaceC09390do.getValue()).A02.size()) {
                N7L.A01(n7l);
            }
        }
    }

    @Override // X.AbstractC140596Xn
    public final void A09(Reel reel, C41181vS c41181vS) {
    }

    @Override // X.AbstractC140596Xn
    public final void A0B(Reel reel, C41181vS c41181vS) {
    }
}
