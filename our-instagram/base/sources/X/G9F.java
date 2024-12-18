package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public final class G9F implements InterfaceC190658cN {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;

    public G9F(Object obj, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
        this.A03 = z2;
    }

    @Override // X.InterfaceC190658cN
    public final boolean onToggle(boolean z) {
        Fragment c32291EKe;
        Integer num;
        String str;
        if (this.A00 != 0) {
            C33221El9 c33221El9 = (C33221El9) this.A01;
            if (z) {
                InterfaceC09390do interfaceC09390do = c33221El9.A02;
                AbstractC35075Fcm.A00(AbstractC166987dD.A0r(interfaceC09390do), C05F.A03);
                boolean A0J = AbstractC14490oL.A0J(c33221El9.requireContext().getPackageManager(), AbstractC31178DnM.A0W());
                boolean A1Y = AbstractC31179DnN.A1Y(c33221El9.requireContext());
                AbstractC35179FfW.A03();
                Bundle requireArguments = c33221El9.requireArguments();
                if (A0J) {
                    if (A1Y) {
                        num = C05F.A0C;
                    } else {
                        num = C05F.A00;
                    }
                } else if (A1Y) {
                    num = C05F.A01;
                } else {
                    c32291EKe = new C32291EKe();
                    c32291EKe.setArguments(requireArguments);
                    AbstractC25233BEq.A0j(c33221El9, interfaceC09390do).A0D(c32291EKe);
                    return true;
                }
                switch (num.intValue()) {
                    case 0:
                        str = "Duo Mobile";
                        break;
                    case 1:
                        str = "Google Authenticator";
                        break;
                    default:
                        str = "Authentication App";
                        break;
                }
                requireArguments.putString("arg_two_fac_app_name", str);
                c32291EKe = new C32292EKf();
                c32291EKe.setArguments(requireArguments);
                AbstractC25233BEq.A0j(c33221El9, interfaceC09390do).A0D(c32291EKe);
                return true;
            }
            AbstractC35075Fcm.A00(AbstractC166987dD.A0r(c33221El9.A02), C05F.A05);
            C33221El9.A01(c33221El9, null, this.A03, this.A02, false);
            return true;
        }
        P15 p15 = (P15) this.A01;
        p15.A03.Dwf(p15.A01, this.A02, this.A03);
        return false;
    }
}
