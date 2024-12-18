package X;

import android.content.DialogInterface;
import com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel;

/* renamed from: X.Ncw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53024Ncw extends PJX {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C53024Ncw(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.PJX, X.MRA
    public final void Czw(boolean z) {
        DialogInterface.OnDismissListener onDismissListener;
        DialogInterface dialogInterface;
        C41181vS c41181vS;
        C38321qM c38321qM;
        switch (this.A00) {
            case 3:
                onDismissListener = (DialogInterface.OnDismissListener) this.A01;
                dialogInterface = null;
                break;
            case 4:
                onDismissListener = (DialogInterface.OnDismissListener) this.A02;
                dialogInterface = C55909Os0.A0X;
                break;
            case 5:
            default:
                return;
            case 6:
                if (!z) {
                    return;
                }
                GIS gis = (GIS) this.A02;
                C38266GsB c38266GsB = (C38266GsB) this.A01;
                C84923qg c84923qg = c38266GsB.A02;
                if (c84923qg == null || (c41181vS = c38266GsB.A0K) == null || (c38321qM = c41181vS.A0b) == null) {
                    return;
                }
                AbstractC50567MTy.A03(c38321qM, c84923qg.A0G);
                gis.A07.CtK(c38266GsB);
                return;
        }
        onDismissListener.onDismiss(dialogInterface);
    }

    @Override // X.PJX, X.MRA
    public final void Dfe() {
        switch (this.A00) {
            case 2:
                C9GR.A0E(AbstractC31172DnG.A0C(this.A01), "report_failed_to_load");
                return;
            case 3:
            case 4:
            default:
                return;
            case 5:
                IgLiveOptionsDialogViewModel A00 = C55064OaK.A00(this.A02);
                C57164PZi.A03(A00, AbstractC141776au.A00(A00), 39);
                return;
        }
    }

    @Override // X.PJX, X.MRA
    public final void DpZ(String str) {
        EnumC75193Zm enumC75193Zm;
        Object obj;
        InterfaceC43428JGs interfaceC43428JGs;
        EnumC75193Zm enumC75193Zm2;
        C56803PIu c56803PIu;
        switch (this.A00) {
            case 0:
                if (str == null) {
                    return;
                }
                C6FQ c6fq = (C6FQ) this.A01;
                InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A02;
                C6FX c6fx = new C6FX();
                c6fx.A01(c6fq.A03);
                AbstractC25227BEk.A1M(c6fq, c6fx, interfaceC103384lE);
                return;
            case 1:
                C6BQ.A0E((C6FQ) this.A01, (InterfaceC103384lE) this.A02, new Object[0]);
                return;
            case 2:
                if ("ig_spam_v3".equals(str)) {
                    enumC75193Zm = EnumC75193Zm.A0I;
                } else if ("ig_false_news".equals(str)) {
                    enumC75193Zm = EnumC75193Zm.A0H;
                } else {
                    enumC75193Zm = EnumC75193Zm.A0G;
                }
                obj = this.A02;
                break;
            case 3:
                if ("ig_false_news".equals(str)) {
                    interfaceC43428JGs = (InterfaceC43428JGs) this.A02;
                    enumC75193Zm2 = EnumC75193Zm.A0H;
                } else {
                    boolean equals = "ig_spam_v3".equals(str);
                    interfaceC43428JGs = (InterfaceC43428JGs) this.A02;
                    if (equals) {
                        enumC75193Zm2 = EnumC75193Zm.A0I;
                    } else {
                        enumC75193Zm2 = EnumC75193Zm.A0G;
                    }
                }
                interfaceC43428JGs.DKc(enumC75193Zm2);
                return;
            case 4:
                if ("ig_false_news".equals(str)) {
                    enumC75193Zm = EnumC75193Zm.A0H;
                } else {
                    enumC75193Zm = EnumC75193Zm.A0G;
                }
                obj = this.A01;
                break;
            case 5:
                IgLiveOptionsDialogViewModel A00 = C55064OaK.A00(this.A02);
                InterfaceC58171Pqb interfaceC58171Pqb = (InterfaceC58171Pqb) this.A01;
                if (!(interfaceC58171Pqb instanceof C56803PIu) || (c56803PIu = (C56803PIu) interfaceC58171Pqb) == null) {
                    return;
                }
                String pk = c56803PIu.getPk();
                if (pk != null) {
                    AbstractC31177DnL.A1N(A00.A03.A00, pk, true);
                }
                c56803PIu.A07 = EnumC84933qh.A03;
                c56803PIu.A0E = true;
                PZY.A02(c56803PIu, A00, AbstractC141776au.A00(A00), 38);
                return;
            default:
                return;
        }
        ((InterfaceC43428JGs) obj).DKc(enumC75193Zm);
    }
}
