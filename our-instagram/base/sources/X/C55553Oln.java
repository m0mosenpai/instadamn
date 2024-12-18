package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.Oln, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55553Oln implements C06Z {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C55553Oln(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, int i) {
        this.A00 = i;
        switch (i) {
            case 1:
            case 2:
            case 4:
                this.A02 = interfaceC103384lE;
                this.A01 = c6fq;
                break;
            case 3:
            default:
                this.A01 = c6fq;
                this.A02 = interfaceC103384lE;
                break;
        }
    }

    @Override // X.C06Z
    public final void DIA(String str, Bundle bundle) {
        InterfaceC103384lE A09;
        C6FQ c6fq;
        C6FX c6fx;
        Object valueOf;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(bundle, 1);
                if (!bundle.getBoolean("is_bottom_sheet_open")) {
                    ((View) this.A01).setClickable(true);
                }
                C51464MoB c51464MoB = (C51464MoB) this.A02;
                boolean z = bundle.getBoolean("submitted");
                c51464MoB.A00 = z;
                if (!z) {
                    return;
                }
                ((AbstractC58880QEq) c51464MoB).A02 = true;
                c51464MoB.A02();
                return;
            case 1:
            case 2:
            case 4:
            default:
                A09 = (InterfaceC103384lE) this.A02;
                c6fx = new C6FX();
                c6fq = (C6FQ) this.A01;
                valueOf = c6fq.A03;
                c6fx.A01(valueOf);
                AbstractC25227BEk.A1M(c6fq, c6fx, A09);
            case 3:
                C14360o3.A0B(bundle, 1);
                A09 = ((C102884kP) this.A01).A09();
                break;
            case 5:
                C14360o3.A0B(bundle, 1);
                boolean z2 = bundle.getBoolean(AbstractC31581Du9.A02(9, 15, 44));
                C6FQ c6fq2 = (C6FQ) this.A01;
                InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A02;
                C6FX c6fx2 = new C6FX();
                c6fx2.A01(Boolean.valueOf(z2));
                AbstractC25227BEk.A1M(c6fq2, c6fx2, interfaceC103384lE);
                return;
            case 6:
                C14360o3.A0B(bundle, 1);
                C102884kP c102884kP = (C102884kP) this.A01;
                if (c102884kP == null) {
                    return;
                }
                A09 = c102884kP.A0B(40);
                break;
            case 7:
                C14360o3.A0B(bundle, 1);
                boolean z3 = bundle.getBoolean(AbstractC43591JPw.A00(459));
                if (z3) {
                    C9GR.A07(AbstractC31172DnG.A0C(this.A02), 2131957436);
                }
                ((AbstractC10360h2) this.A01).A0w(AbstractC43591JPw.A00(898));
                KC9 kc9 = (KC9) this.A02;
                int i = 0;
                AbstractC25231BEo.A0c(kc9.requireActivity(), kc9.A04).A06();
                FragmentActivity activity = kc9.getActivity();
                if (activity == null) {
                    return;
                }
                Integer num = kc9.A00;
                if (num == null) {
                    C14360o3.A0F("entryPoint");
                    throw C00O.createAndThrow();
                }
                if (num != C05F.A15) {
                    return;
                }
                if (z3) {
                    i = -1;
                }
                activity.setResult(i);
                activity.finish();
                return;
        }
        if (A09 == null) {
            return;
        }
        int i2 = bundle.getInt(TraceFieldType.ErrorCode);
        c6fq = (C6FQ) this.A02;
        c6fx = new C6FX();
        valueOf = Integer.valueOf(i2);
        c6fx.A01(valueOf);
        AbstractC25227BEk.A1M(c6fq, c6fx, A09);
    }

    public C55553Oln(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }
}
