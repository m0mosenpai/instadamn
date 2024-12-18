package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes9.dex */
public final class PEV implements InterfaceC58295Psn {
    public static final C51090Mhp A0D = new C51090Mhp(5);
    public OHM A00;
    public C51906Mwo A01;
    public C51906Mwo A02;
    public C51114MiJ A03;
    public Boolean A04;
    public Integer A05;
    public List A06;
    public boolean A07;
    public final InterfaceC11380iw A08;
    public final UserSession A09;
    public final C55095Ob6 A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;

    public PEV(ViewGroup viewGroup, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C55095Ob6 c55095Ob6) {
        C14360o3.A0B(c55095Ob6, 4);
        this.A08 = interfaceC11380iw;
        this.A09 = userSession;
        this.A0A = c55095Ob6;
        this.A03 = new C51114MiJ(interfaceC11380iw, userSession, this, c55095Ob6);
        this.A0C = C1XM.A00(new C57536PgA(24, viewGroup, this));
        this.A06 = C16930sl.A00;
        this.A0B = C57520Pfu.A00(viewGroup, 19);
    }

    public static final InterfaceC58295Psn A00(PEV pev, Integer num) {
        Object obj;
        if (num == null) {
            return null;
        }
        RecyclerView recyclerView = pev.A03.A00;
        if (recyclerView != null) {
            obj = recyclerView.A0V(num.intValue());
        } else {
            obj = null;
        }
        if (obj instanceof InterfaceC58295Psn) {
            return (InterfaceC58295Psn) obj;
        }
        return null;
    }

    @Override // X.InterfaceC58295Psn
    public final void E4Z(InterfaceC58104PpT interfaceC58104PpT, Boolean bool, Integer num) {
    }

    @Override // X.InterfaceC58295Psn
    public final void EEE() {
    }

    @Override // X.InterfaceC58295Psn
    public final void EZd() {
        this.A07 = true;
    }

    @Override // X.InterfaceC57985PnV
    public final /* bridge */ /* synthetic */ void ADV(InterfaceC57856PlM interfaceC57856PlM) {
        int i;
        int i2;
        C51906Mwo A00;
        List list;
        List list2;
        C51906Mwo c51906Mwo = (C51906Mwo) interfaceC57856PlM;
        C14360o3.A0B(c51906Mwo, 0);
        InterfaceC09390do interfaceC09390do = this.A0C;
        interfaceC09390do.getValue();
        if (((ViewPager2) interfaceC09390do.getValue()).A04.A0A == null) {
            this.A03 = new C51114MiJ(this.A08, this.A09, this, this.A0A);
            ((ViewPager2) interfaceC09390do.getValue()).setAdapter(this.A03);
        }
        C51906Mwo c51906Mwo2 = this.A01;
        this.A02 = c51906Mwo2;
        this.A01 = c51906Mwo;
        List list3 = c51906Mwo.A0K;
        if (list3 != null) {
            if (c51906Mwo2 != null && (list2 = c51906Mwo2.A0K) != null) {
                i = list2.size();
            } else {
                i = 0;
            }
            C51906Mwo c51906Mwo3 = this.A01;
            if (c51906Mwo3 != null && (list = c51906Mwo3.A0K) != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            if (i >= i2) {
                A00 = C51906Mwo.A00(null, null, c51906Mwo, null, null, null, null, 0.0f, 0, -1, 1535, false, false, false, false, false, false, false, false);
                this.A04 = Boolean.valueOf(A00.A0Q);
                boolean z = this.A07;
                Integer num = this.A05;
                if (z) {
                    if (num == null) {
                        return;
                    }
                    int intValue = num.intValue() + 1;
                    if (intValue < list3.size()) {
                        list3.set(intValue, A00);
                        this.A03.notifyItemChanged(intValue);
                        ((ViewPager2) interfaceC09390do.getValue()).A03(intValue, true);
                        return;
                    }
                    this.A07 = false;
                    return;
                }
                if (num == null) {
                    return;
                }
                int intValue2 = num.intValue();
                list3.set(intValue2, A00);
                this.A03.notifyItemChanged(intValue2);
                return;
            }
            this.A03.submitList(list3);
            this.A06 = list3;
            return;
        }
        this.A05 = 0;
        List A1J = AbstractC166987dD.A1J(c51906Mwo);
        this.A06 = A1J;
        this.A03.submitList(A1J);
        this.A04 = Boolean.valueOf(c51906Mwo.A0Q);
    }

    @Override // X.InterfaceC58295Psn
    public final PJO AmJ() {
        InterfaceC58295Psn A00 = A00(this, this.A05);
        if (A00 != null) {
            return A00.AmJ();
        }
        return null;
    }

    @Override // X.InterfaceC58295Psn
    public final PJO CFL() {
        InterfaceC58295Psn A00 = A00(this, this.A05);
        if (A00 != null) {
            return A00.CFL();
        }
        return null;
    }

    @Override // X.InterfaceC58295Psn
    public final void CNT() {
        InterfaceC58295Psn A00 = A00(this, this.A05);
        if (A00 != null) {
            A00.CNT();
        }
    }

    @Override // X.InterfaceC58295Psn
    public final void CNU() {
        InterfaceC58295Psn A00 = A00(this, this.A05);
        if (A00 != null) {
            A00.CNU();
        }
    }

    @Override // X.InterfaceC58295Psn
    public final void E3m() {
        InterfaceC58295Psn A00 = A00(this, this.A05);
        if (A00 != null) {
            A00.E3m();
        }
    }

    @Override // X.InterfaceC58295Psn
    public final void EEA() {
        InterfaceC09390do interfaceC09390do = this.A0C;
        if (interfaceC09390do.CWa()) {
            ((ViewPager2) interfaceC09390do.getValue()).setAdapter(null);
        }
    }

    @Override // X.InterfaceC58295Psn
    public final void EKq() {
        InterfaceC58295Psn A00 = A00(this, this.A05);
        if (A00 != null) {
            A00.EKq();
        }
    }

    @Override // X.InterfaceC58295Psn
    public final void EM0(float f) {
        if (f != 1.0f) {
            InterfaceC09390do interfaceC09390do = this.A0C;
            AbstractC166987dD.A0d(interfaceC09390do).setPivotX(AbstractC166987dD.A07(AbstractC166987dD.A0d(interfaceC09390do)) / 2.0f);
            AbstractC166987dD.A0d(interfaceC09390do).setPivotY(MSZ.A03(this.A0B));
        }
        InterfaceC09390do interfaceC09390do2 = this.A0C;
        AbstractC166987dD.A0d(interfaceC09390do2).setScaleX(f);
        AbstractC166987dD.A0d(interfaceC09390do2).setScaleY(f);
    }

    @Override // X.InterfaceC58295Psn
    public final void ESh(int i) {
        InterfaceC58295Psn A00 = A00(this, this.A05);
        if (A00 != null) {
            A00.ESh(i);
        }
    }

    @Override // X.InterfaceC58295Psn
    public final void ElK() {
        InterfaceC58295Psn A00 = A00(this, this.A05);
        if (A00 != null) {
            A00.ElK();
        }
    }

    @Override // X.InterfaceC58295Psn
    public final void Eok(String str) {
        InterfaceC58295Psn A00;
        Integer num = this.A05;
        if (num != null && (A00 = A00(this, num)) != null) {
            A00.Eok(str);
        }
    }

    @Override // X.InterfaceC58295Psn
    public final void F7q() {
        InterfaceC58295Psn A00 = A00(this, this.A05);
        if (A00 != null) {
            A00.F7q();
        }
    }

    @Override // X.InterfaceC58295Psn
    public final void FCg() {
        InterfaceC58295Psn A00 = A00(this, this.A05);
        if (A00 != null) {
            A00.FCg();
        }
    }

    @Override // X.InterfaceC58295Psn
    public final void onDestroy() {
        InterfaceC58295Psn A00 = A00(this, this.A05);
        if (A00 != null) {
            A00.onDestroy();
        }
    }

    @Override // X.InterfaceC58295Psn
    public final void Eh4(OHM ohm) {
        this.A00 = ohm;
    }
}
