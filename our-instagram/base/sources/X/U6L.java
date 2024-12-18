package X;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class U6L implements InterfaceC65626Tpm {
    public static final W3Q A05 = new Object();
    public U7A A00;
    public Integer A01;
    public final Context A02;
    public final WTT A03;
    public final C6T7 A04;

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onPause(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onResume(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStop(C07X c07x) {
    }

    public final void A00() {
        U7A u7a;
        Integer num;
        String str;
        Integer num2 = this.A01;
        Integer num3 = C05F.A01;
        if (num2 != num3 && (u7a = this.A00) != null) {
            this.A01 = num3;
            if (num2 == C05F.A00) {
                num = num3;
            } else {
                num = C05F.A0C;
            }
            InterfaceC103384lE interfaceC103384lE = u7a.A02;
            if (interfaceC103384lE != null) {
                C102884kP c102884kP = u7a.A01;
                C6FG c6fg = u7a.A00;
                if (num == num3) {
                    str = "forward";
                } else {
                    str = "back";
                }
                AbstractC58322PtE.A1M(c6fg, c102884kP, AbstractC31179DnN.A0I(c6fg), interfaceC103384lE, str);
            }
        }
    }

    public final void A01(Bundle bundle) {
        int i;
        this.A03.A00(bundle, true);
        switch (this.A01.intValue()) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            default:
                i = 0;
                break;
        }
        bundle.putInt("bloks_screen_navigation_state", i);
    }

    public final void A02(Integer num) {
        InterfaceC103384lE interfaceC103384lE;
        String str;
        Integer num2 = this.A01;
        Integer num3 = C05F.A01;
        if (num2 == num3) {
            this.A01 = C05F.A0C;
            U7A u7a = this.A00;
            if (u7a != null && (interfaceC103384lE = u7a.A03) != null) {
                C102884kP c102884kP = u7a.A01;
                C6FG c6fg = u7a.A00;
                if (num == num3) {
                    str = "forward";
                } else {
                    str = "back";
                }
                AbstractC58322PtE.A1M(c6fg, c102884kP, AbstractC31179DnN.A0I(c6fg), interfaceC103384lE, str);
            }
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final void onDestroy(C07X c07x) {
        Iterator it = this.A03.A07.iterator();
        while (it.hasNext()) {
            AbstractC66261U6f.A03(Integer.valueOf(AbstractC167007dF.A0B(it)));
        }
        this.A04.A03();
    }

    public U6L(Context context, SparseArray sparseArray, WTT wtt, InterfaceC62872tQ interfaceC62872tQ, Integer num) {
        this.A02 = context;
        this.A03 = wtt;
        this.A01 = num;
        C6T8 A00 = C6T7.A00(context, wtt.A02, interfaceC62872tQ);
        A00.A02 = wtt.A09;
        A00.A00 = sparseArray;
        this.A04 = A00.A00();
    }
}
