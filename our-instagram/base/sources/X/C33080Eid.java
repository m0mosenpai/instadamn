package X;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.model.reels.Reel;
import java.util.Iterator;

/* renamed from: X.Eid, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33080Eid extends AbstractC140596Xn {
    public final RecyclerView A00;
    public final E08 A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33080Eid(Activity activity, RecyclerView recyclerView, E08 e08, InterfaceC63982vJ interfaceC63982vJ) {
        super(activity, interfaceC63982vJ);
        C14360o3.A0B(e08, 4);
        this.A00 = recyclerView;
        this.A01 = e08;
    }

    @Override // X.AbstractC140596Xn
    public final C6PN A07(Reel reel, C41181vS c41181vS) {
        C6PN A01;
        C14360o3.A0B(reel, 0);
        Iterator it = this.A01.A00.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (C14360o3.A0K(reel.getId(), ((C32095E8t) it.next()).A02)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        C3OO A0V = this.A00.A0V(i);
        if (A0V instanceof C31987E3p) {
            A01 = C6PN.A04(((C31987E3p) A0V).A06.getAvatarBounds());
        } else {
            A01 = C6PN.A01();
        }
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
