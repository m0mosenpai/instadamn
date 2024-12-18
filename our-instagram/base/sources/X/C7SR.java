package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7SR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7SR implements InterfaceC161697Me {
    public final C7QD A00;
    public final View A01;
    public final View A02;
    public final C7QF A03;
    public final C7SS A04;
    public final C7QH A05;
    public final C7QD A06;
    public final C7QD A07;
    public final C7QD A08;
    public final C7QD A09;
    public final C7QD A0A;
    public final C7QD A0B;
    public final C7QD A0C;
    public final C7QD A0D;
    public final C7QD A0E;
    public final C7QD A0F;
    public final C7QD A0G;
    public final C7QD A0H;
    public final C7QD A0I;
    public final C7QD A0J;
    public final C7QD A0K;

    @Override // X.InterfaceC161697Me
    public final void DCG(Canvas canvas, Integer num, float f) {
        int i;
        View BKF;
        C14360o3.A0B(num, 2);
        if (this.A03 != null) {
            int height = this.A02.getHeight();
            C7QD c7qd = this.A00;
            if (c7qd != null && (BKF = c7qd.BKF()) != null) {
                i = BKF.getHeight();
            } else {
                i = 0;
            }
            int i2 = height - i;
            int i3 = new int[]{0, i2}[0];
            if (i2 > i3) {
                i3 = i2;
            }
            this.A04.A01(canvas, C4a(), num, f, r3.getTop() + (i3 / 2), r3.getLeft(), r3.getRight());
        }
    }

    @Override // X.InterfaceC161697Me
    public final void Drc(Integer num) {
        C162897Ra c162897Ra;
        Object obj;
        C14360o3.A0B(num, 0);
        C7QF c7qf = this.A03;
        if (c7qf != null && (c162897Ra = c7qf.A01) != null && (obj = ((C7QG) c7qf).A00) != null) {
            InterfaceC129525tH interfaceC129525tH = (InterfaceC129525tH) obj;
            if (num == C05F.A00 && interfaceC129525tH.BPA().A0X) {
                c162897Ra.A00.ElE(interfaceC129525tH, EnumC46202Kce.SWIPE, new MessageIdentifier(interfaceC129525tH.BSy().A01, interfaceC129525tH.BSy().A00()));
            } else {
                if (num != C05F.A01) {
                    return;
                }
                ((InterfaceC165257aE) c162897Ra.A00).Ekd(interfaceC129525tH.BSy(), null, interfaceC129525tH.BPA().A04, null, null, null, "swipe");
            }
        }
    }

    @Override // X.InterfaceC161697Me
    public final boolean AG9() {
        InterfaceC129525tH interfaceC129525tH;
        InterfaceC165507ad interfaceC165507ad;
        C7QF c7qf = this.A03;
        if (c7qf != null && (interfaceC129525tH = (InterfaceC129525tH) ((C7QG) c7qf).A00) != null && ((interfaceC165507ad = (InterfaceC165507ad) c7qf.A02) == null || !interfaceC165507ad.CQu())) {
            C7QV BPA = interfaceC129525tH.BPA();
            if (BPA.A0X || BPA.A0E) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC161697Me
    public final Integer C4a() {
        Object obj;
        Integer num;
        C7QF c7qf = this.A03;
        if (c7qf != null && c7qf.A01 != null && (obj = ((C7QG) c7qf).A00) != null) {
            boolean A02 = AbstractC13620mo.A02(c7qf.A00);
            boolean CVC = ((InterfaceC129525tH) obj).CVC();
            if (!A02 ? !CVC : CVC) {
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
            C14360o3.A07(num);
            return num;
        }
        return C05F.A00;
    }

    @Override // X.InterfaceC161697Me
    public final float C4c() {
        if (this.A03 != null) {
            C7SS c7ss = this.A04;
            return c7ss.A02 + c7ss.A03;
        }
        return Float.MAX_VALUE;
    }

    @Override // X.InterfaceC161697Me
    public final List CGY() {
        ArrayList arrayList = new ArrayList();
        C7QD c7qd = this.A0E;
        if (c7qd != null) {
            View BKF = c7qd.BKF();
            C14360o3.A07(BKF);
            arrayList.add(BKF);
        }
        C7QD c7qd2 = this.A06;
        if (c7qd2 != null) {
            View BKF2 = c7qd2.BKF();
            C14360o3.A07(BKF2);
            arrayList.add(BKF2);
        }
        C7QD c7qd3 = this.A0K;
        if (c7qd3 != null) {
            View BKF3 = c7qd3.BKF();
            C14360o3.A07(BKF3);
            arrayList.add(BKF3);
        }
        C7QD c7qd4 = this.A0J;
        if (c7qd4 != null) {
            View BKF4 = c7qd4.BKF();
            C14360o3.A07(BKF4);
            arrayList.add(BKF4);
        }
        C7QD c7qd5 = this.A0F;
        if (c7qd5 != null) {
            View BKF5 = c7qd5.BKF();
            C14360o3.A07(BKF5);
            arrayList.add(BKF5);
        }
        C7QD c7qd6 = this.A0C;
        if (c7qd6 != null) {
            View BKF6 = c7qd6.BKF();
            C14360o3.A07(BKF6);
            arrayList.add(BKF6);
        }
        C7QD c7qd7 = this.A0B;
        if (c7qd7 != null) {
            View BKF7 = c7qd7.BKF();
            C14360o3.A07(BKF7);
            arrayList.add(BKF7);
        }
        return arrayList;
    }

    @Override // X.InterfaceC161697Me
    public final List CGZ() {
        ArrayList arrayList = new ArrayList();
        if (this.A03 != null) {
            View BKF = this.A0I.BKF();
            C14360o3.A07(BKF);
            arrayList.add(BKF);
            C7QD c7qd = this.A08;
            if (c7qd != null) {
                View BKF2 = c7qd.BKF();
                C14360o3.A07(BKF2);
                arrayList.add(BKF2);
            }
            C7QD c7qd2 = this.A09;
            if (c7qd2 != null) {
                View BKF3 = c7qd2.BKF();
                C14360o3.A07(BKF3);
                arrayList.add(BKF3);
            }
            View view = this.A01;
            if (view != null) {
                arrayList.add(view);
            }
            C7QD c7qd3 = this.A0H;
            if (c7qd3 != null) {
                View BKF4 = c7qd3.BKF();
                C14360o3.A07(BKF4);
                arrayList.add(BKF4);
            }
            C7QD c7qd4 = this.A07;
            if (c7qd4 != null) {
                View BKF5 = c7qd4.BKF();
                C14360o3.A07(BKF5);
                arrayList.add(BKF5);
            }
            C7QD c7qd5 = this.A0D;
            if (c7qd5 != null) {
                View BKF6 = c7qd5.BKF();
                C14360o3.A07(BKF6);
                arrayList.add(BKF6);
            }
            C7QD c7qd6 = this.A0A;
            if (c7qd6 != null) {
                View BKF7 = c7qd6.BKF();
                C14360o3.A07(BKF7);
                arrayList.add(BKF7);
            }
            C7QD c7qd7 = this.A0G;
            if (c7qd7 != null) {
                View BKF8 = c7qd7.BKF();
                C14360o3.A07(BKF8);
                arrayList.add(BKF8);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.7QH] */
    public C7SR(Context context, View view, View view2, C7QD c7qd, C7QD c7qd2, C7QD c7qd3, C7QD c7qd4, C7QD c7qd5, C7QD c7qd6, C7QD c7qd7, C7QD c7qd8, C7QD c7qd9, C7QD c7qd10, C7QD c7qd11, C7QD c7qd12, C7QD c7qd13, C7QD c7qd14, C7QD c7qd15, C7QD c7qd16) {
        C7QF c7qf;
        C7QE c7qe;
        this.A02 = view;
        this.A0I = c7qd;
        this.A08 = c7qd2;
        this.A09 = c7qd3;
        this.A01 = view2;
        this.A0H = c7qd4;
        this.A00 = c7qd5;
        this.A07 = c7qd6;
        this.A0D = c7qd7;
        this.A0E = c7qd8;
        this.A06 = c7qd9;
        this.A0K = c7qd10;
        this.A0J = c7qd11;
        this.A0A = c7qd12;
        this.A0F = c7qd13;
        this.A0C = c7qd14;
        this.A0G = c7qd15;
        this.A0B = c7qd16;
        this.A04 = new C7SS(context);
        if ((c7qd instanceof C7QE) && (c7qe = (C7QE) c7qd) != null) {
            c7qf = c7qe.BYl();
        } else {
            c7qf = null;
        }
        this.A05 = c7qf;
        this.A03 = c7qf instanceof C7QF ? c7qf : null;
    }

    @Override // X.InterfaceC161697Me
    public final boolean AGA(MotionEvent motionEvent) {
        return AG9();
    }
}
