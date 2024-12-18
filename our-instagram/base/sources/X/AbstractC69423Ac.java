package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;

/* renamed from: X.3Ac, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC69423Ac extends C1I4 implements InterfaceC62892tS {
    public int A00;

    @Override // X.InterfaceC62892tS
    public final void DXP(int i, int i2) {
    }

    @Override // X.InterfaceC62892tS
    public final void DXb(int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC62892tS
    public final void Diq(C3VZ c3vz, float f, float f2) {
    }

    @Override // X.InterfaceC62892tS
    public final void DrZ(int i, int i2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DyE(int i, float f) {
    }

    @Override // X.InterfaceC62892tS
    public final void E0r(View view) {
    }

    public final void A00(int i) {
        int A03;
        int i2;
        if (this instanceof C69413Ab) {
            C69413Ab c69413Ab = (C69413Ab) this;
            A03 = C0f9.A03(1661800009);
            if (i == 1 || i == 2) {
                C3AZ c3az = c69413Ab.A00;
                HashSet hashSet = c3az.A03;
                if (!hashSet.isEmpty()) {
                    C3AZ.A01(C3G5.A0H, c3az, hashSet);
                    hashSet.clear();
                }
            }
            i2 = 1691399930;
        } else {
            C3B4 c3b4 = (C3B4) this;
            A03 = C0f9.A03(1601986727);
            if (i == 1) {
                C69453Af c69453Af = c3b4.A00;
                c69453Af.A0M.A01("SCROLL_REEL_TRAY");
                C1OR.A00(c69453Af.A0F).A0D(C05F.A00);
            }
            i2 = -1653581475;
        }
        C0f9.A0A(i2, A03);
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ boolean CtU() {
        return false;
    }

    @Override // X.InterfaceC62892tS
    public final void Diy(C3VZ c3vz, C3VZ c3vz2) {
        int A03 = C0f9.A03(-1615305865);
        C14360o3.A0B(c3vz, 0);
        C14360o3.A0B(c3vz2, 1);
        if (c3vz != c3vz2) {
            int ordinal = c3vz.ordinal();
            int i = 2;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    i = 0;
                }
            } else {
                i = 1;
            }
            this.A00 = i;
            A00(i);
        }
        C0f9.A0A(-380779998, A03);
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = C0f9.A03(-1708389473);
        C14360o3.A0B(recyclerView, 0);
        super.onScrollStateChanged(recyclerView, i);
        if (i != this.A00) {
            this.A00 = i;
            A00(i);
        }
        C0f9.A0A(1694166288, A03);
    }
}
