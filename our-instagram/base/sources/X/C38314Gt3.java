package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gt3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38314Gt3 extends AbstractC10330gz implements JG3 {
    public final AbstractC10330gz A00;
    public final Map A01;
    public final UserSession A02;
    public final List A03;

    public C38314Gt3(AbstractC10360h2 abstractC10360h2, UserSession userSession, List list) {
        super(abstractC10360h2, 0);
        this.A02 = userSession;
        this.A03 = list;
        this.A01 = AbstractC166987dD.A1G();
        this.A00 = this;
    }

    @Override // X.AbstractC10330gz
    public final Fragment A00(int i) {
        if (i <= 1) {
            HDG hdg = new HDG();
            Bundle A0b = AbstractC166987dD.A0b();
            C3XG c3xg = ((IKO) this.A03.get(i)).A02;
            if (c3xg != null) {
                C38321qM A0E = AbstractC37300Gc1.A0E(c3xg);
                if (A0E != null) {
                    A0b.putString("BakeoffAdCardFragment.ARGUMENTS_MEDIA_ID", A0E.getId());
                    A0b.putBoolean("BakeoffAdCardFragment.ARGUMENTS_IS_EXPLORE_STORY", c3xg.A06 == C1XV.A0H);
                    AbstractC31173DnH.A1C(A0b, this.A02);
                    hdg.setArguments(A0b);
                    this.A01.put(Integer.valueOf(i), AbstractC25225BEi.A16(hdg));
                    return hdg;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC25230BEn.A0n("Invalid position: ", i);
    }

    @Override // X.AbstractC021208i
    public final int getCount() {
        return 2;
    }

    @Override // X.AbstractC021208i
    public final int getItemPosition(Object obj) {
        return -2;
    }

    @Override // X.AbstractC021208i, X.JG3
    public final void notifyDataSetChanged() {
        this.A00.notifyDataSetChanged();
    }
}
