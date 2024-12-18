package X;

import android.content.Context;
import java.util.Collection;

/* renamed from: X.KEr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45552KEr extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C45552KEr(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A00;
        int i;
        switch (this.A00) {
            case 0:
                A00 = A00(this, 247296007);
                i = 430486731;
                break;
            case 1:
                A00 = A00(this, 1690155318);
                i = -984026071;
                break;
            case 2:
                A00 = A00(this, 1271717260);
                i = 64128462;
                break;
            default:
                A00 = C0f9.A03(-1913677479);
                C14360o3.A0B(abstractC115105If, 0);
                super.onFail(abstractC115105If);
                KZT kzt = (KZT) this.A03;
                KZT.A00(kzt, C05F.A01);
                Context context = ((L6S) this.A01).A00.A01;
                C9GR.A00(context, context.getString(2131960612), "ERROR", 0);
                kzt.A01.markerEnd(834875525, (short) 3);
                i = -7267713;
                break;
        }
        C0f9.A0A(i, A00);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-733722269);
                C0f9.A0A(1378875647, A01(this, (C45554KEt) obj, 1658585040));
                i = -900934929;
                break;
            case 1:
                A03 = C0f9.A03(-487998704);
                C0f9.A0A(323967908, A01(this, (C45554KEt) obj, 817064330));
                i = -2142078008;
                break;
            case 2:
                A03 = C0f9.A03(-1616812113);
                C0f9.A0A(748228638, A01(this, (C45554KEt) obj, 804071353));
                i = 508043795;
                break;
            default:
                A03 = C0f9.A03(-637511764);
                int A0N = AbstractC167017dG.A0N(obj, -778931566);
                super.onSuccess(obj);
                ((L6S) this.A01).A00(((Collection) this.A02).size());
                KZT kzt = (KZT) this.A03;
                KZT.A00(kzt, C05F.A01);
                kzt.A01.markerEnd(834875525, (short) 2);
                C0f9.A0A(-1242729732, A0N);
                i = 1804039694;
                break;
        }
        C0f9.A0A(i, A03);
    }

    public static int A00(C45552KEr c45552KEr, int i) {
        int A03 = C0f9.A03(i);
        C6BQ.A0E((C6FQ) c45552KEr.A01, (InterfaceC103384lE) c45552KEr.A02, new Object[0]);
        return A03;
    }

    public static int A01(C45552KEr c45552KEr, C45554KEt c45554KEt, int i) {
        int A03 = C0f9.A03(i);
        C6BQ.A0E((C6FQ) c45552KEr.A01, (InterfaceC103384lE) c45552KEr.A03, c45554KEt.A00);
        return A03;
    }
}
