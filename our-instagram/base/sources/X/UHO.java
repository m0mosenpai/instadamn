package X;

import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes11.dex */
public final class UHO extends C1I4 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public UHO(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03;
        int i2;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1123763573);
                if (i == 0) {
                    recyclerView.announceForAccessibility(((TextView) this.A02).getText());
                }
                i2 = -1126990581;
                break;
            case 1:
                A03 = AbstractC167017dG.A0N(recyclerView, 1896427939);
                if (i == 0) {
                    VRP.A00((C45125Jxu) this.A02, (UJM) this.A01, (UserSession) this.A03);
                }
                super.onScrollStateChanged(recyclerView, i);
                i2 = 688154723;
                break;
            case 2:
                A03 = AbstractC167017dG.A0N(recyclerView, 2110026);
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    C47974LIk c47974LIk = (C47974LIk) this.A03;
                    int A1a = c47974LIk.A09.A1a();
                    List list = (List) this.A01;
                    int size = list.size() - 1;
                    while (true) {
                        if (-1 < size) {
                            L0O l0o = (L0O) list.get(size);
                            Number number = (Number) c47974LIk.A0C.A04.get(l0o.A00);
                            if (number != null && A1a >= number.intValue()) {
                                ((AbstractC44429Jkg) this.A02).A00(size, true);
                            } else {
                                size--;
                            }
                        }
                    }
                }
                i2 = -483986349;
                break;
            default:
                super.onScrollStateChanged(recyclerView, i);
                return;
        }
        C0f9.A0A(i2, A03);
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A1b;
        if (this.A00 != 0) {
            super.onScrolled(recyclerView, i, i2);
            return;
        }
        int A03 = C0f9.A03(496143394);
        UEx uEx = (UEx) this.A01;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) uEx.A02.A0D;
        if (i < 0) {
            A1b = linearLayoutManager.A1a();
        } else {
            A1b = linearLayoutManager.A1b();
        }
        UGn uGn = (UGn) this.A03;
        uEx.A07 = uGn.A01(A1b);
        ((TextView) this.A02).setText(uGn.A01(A1b).A01(uGn.A01));
        C0f9.A0A(-789925490, A03);
    }
}
