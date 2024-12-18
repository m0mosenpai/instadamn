package X;

import android.graphics.Rect;
import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.model.reels.Reel;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class KZ1 extends AbstractC140596Xn {
    public final C45509KCy A00;
    public final C3Ow A01;

    @Override // X.AbstractC140596Xn
    public final boolean A06() {
        return true;
    }

    @Override // X.AbstractC140596Xn
    public final void A08(Reel reel) {
    }

    @Override // X.AbstractC140596Xn
    public final void A09(Reel reel, C41181vS c41181vS) {
    }

    @Override // X.AbstractC140596Xn
    public final void A0A(Reel reel, C41181vS c41181vS) {
        int i;
        C14360o3.A0B(c41181vS, 1);
        C45509KCy c45509KCy = this.A00;
        String str = c41181vS.A0k;
        C14360o3.A07(str);
        List list = c45509KCy.A09;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (C14360o3.A0K(((Reel) it.next()).getId(), str)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
        } else {
            i = 0;
        }
        RecyclerView recyclerView = c45509KCy.A00;
        if (recyclerView != null) {
            recyclerView.A0o(Math.max(i, 0));
        }
    }

    @Override // X.AbstractC140596Xn
    public final void A0B(Reel reel, C41181vS c41181vS) {
    }

    public KZ1(C45509KCy c45509KCy, C3Ow c3Ow) {
        this.A01 = c3Ow;
        this.A00 = c45509KCy;
    }

    @Override // X.AbstractC140596Xn
    public final C6PN A07(Reel reel, C41181vS c41181vS) {
        Rect A0U = AbstractC166987dD.A0U();
        this.A01.Aek().getWindowVisibleDisplayFrame(A0U);
        float f = (A0U.bottom / 2) * 3;
        return C6PN.A03(new RectF(A0U.left, f, A0U.right, f));
    }
}
