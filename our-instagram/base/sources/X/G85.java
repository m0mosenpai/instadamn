package X;

import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public final class G85 implements InterfaceC199918sv {
    public final int A00;
    public final Object A01;

    public G85(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC199918sv
    public final void onClick() {
        boolean z;
        InterfaceC16820sZ interfaceC16820sZ;
        switch (this.A00) {
            case 0:
                Fragment fragment = (Fragment) this.A01;
                AbstractC33781Ew7.A00(fragment.requireActivity(), new C31575Du3(fragment, 0));
                return;
            case 1:
                EKa eKa = (EKa) this.A01;
                eKa.A0E.putExtra(AbstractC111324zv.A00(4117), true);
                EKa.A04(eKa);
                return;
            case 2:
                EKa.A05((EKa) this.A01, null);
                return;
            case 3:
                interfaceC16820sZ = ((CS7) this.A01).A03;
                interfaceC16820sZ.invoke();
                return;
            case 4:
            case 5:
            case 10:
            default:
                interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                interfaceC16820sZ.invoke();
                return;
            case 6:
                interfaceC16820sZ = ((C32788Ebs) this.A01).A06;
                interfaceC16820sZ.invoke();
                return;
            case 7:
                FNS fns = (FNS) this.A01;
                AbstractC35257Fgr.A02(fns.A00, fns.A01, EnumC33519Ers.A03);
                return;
            case 8:
                FNS fns2 = (FNS) this.A01;
                C34922Fa8.A00(fns2.A02, "direct_inbox_options_message_settings_click");
                F0J.A00().A01(fns2.A00, fns2.A01, AbstractC43591JPw.A00(145));
                return;
            case 9:
                FNS fns3 = (FNS) this.A01;
                C34922Fa8.A00(fns3.A02, "direct_inbox_options_multi_select_click");
                C31665DvV c31665DvV = fns3.A03;
                C31665DvV.A04(c31665DvV);
                if (c31665DvV.A03) {
                    z = false;
                } else if (!JR3.A09(c31665DvV.A0C.A00)) {
                    return;
                } else {
                    z = true;
                }
                C31665DvV.A07(c31665DvV, z);
                return;
            case 11:
                ((C50676MYu) this.A01).A0A.onClick(null);
                return;
        }
    }
}
