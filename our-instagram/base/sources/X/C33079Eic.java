package X;

import android.app.Activity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.Eic, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33079Eic extends AbstractC140596Xn {
    public final RecyclerView A00;
    public final List A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33079Eic(Activity activity, RecyclerView recyclerView, InterfaceC63982vJ interfaceC63982vJ, List list) {
        super(activity, interfaceC63982vJ);
        AbstractC167007dF.A1F(interfaceC63982vJ, 2, list);
        this.A00 = recyclerView;
        this.A01 = list;
    }

    @Override // X.AbstractC140596Xn
    public final C6PN A07(Reel reel, C41181vS c41181vS) {
        C6PN A01;
        LinearLayoutManager linearLayoutManager;
        int indexOf;
        C14360o3.A0B(reel, 0);
        List list = this.A01;
        int indexOf2 = list.indexOf(reel);
        RecyclerView recyclerView = this.A00;
        C3OO A0V = recyclerView.A0V(indexOf2);
        if (A0V instanceof E2V) {
            AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
            if ((abstractC70663Fe instanceof GridLayoutManager) && (linearLayoutManager = (LinearLayoutManager) abstractC70663Fe) != null && (indexOf = list.indexOf(reel)) >= linearLayoutManager.A1c() && indexOf <= linearLayoutManager.A1d()) {
                A01 = C6PN.A04(((E2V) A0V).A02.getAvatarBounds());
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
    }

    @Override // X.AbstractC140596Xn
    public final void A09(Reel reel, C41181vS c41181vS) {
    }

    @Override // X.AbstractC140596Xn
    public final void A0B(Reel reel, C41181vS c41181vS) {
    }
}
