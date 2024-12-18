package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* loaded from: classes11.dex */
public class UF5 extends C06K implements C06N {
    public boolean A00;
    public String A01;
    public final int A02;
    public final AbstractC10360h2 A03;
    public final InterfaceC16660sJ A04;
    public final Fragment A05;

    @Override // X.C06K
    public final void A02(Bundle bundle, Fragment fragment, AbstractC10360h2 abstractC10360h2) {
        if (!fragment.equals(this.A05) && this.A01 == null && bundle == null) {
            String hexString = Integer.toHexString(System.identityHashCode(fragment));
            C14360o3.A07(hexString);
            this.A01 = hexString;
            this.A04.invoke(EnumC68126VCk.A04);
        }
    }

    @Override // X.C06K
    public final void A09(Fragment fragment, AbstractC10360h2 abstractC10360h2) {
        InterfaceC16660sJ interfaceC16660sJ;
        EnumC68126VCk enumC68126VCk;
        int A0L = this.A03.A0L() - this.A02;
        if (A0L == 1) {
            interfaceC16660sJ = this.A04;
            enumC68126VCk = EnumC68126VCk.A04;
        } else {
            if (A0L > -1) {
                return;
            }
            interfaceC16660sJ = this.A04;
            enumC68126VCk = EnumC68126VCk.A03;
        }
        interfaceC16660sJ.invoke(enumC68126VCk);
    }

    @Override // X.C06N
    public final void onBackStackChanged() {
        InterfaceC16660sJ interfaceC16660sJ;
        EnumC68126VCk enumC68126VCk;
        int A0L = this.A03.A0L() - this.A02;
        if (A0L == 1) {
            interfaceC16660sJ = this.A04;
            enumC68126VCk = EnumC68126VCk.A04;
        } else if (A0L <= -1) {
            interfaceC16660sJ = this.A04;
            enumC68126VCk = EnumC68126VCk.A03;
        } else {
            if (A0L != 0) {
                return;
            }
            interfaceC16660sJ = this.A04;
            enumC68126VCk = EnumC68126VCk.A02;
        }
        interfaceC16660sJ.invoke(enumC68126VCk);
    }

    public UF5(Fragment fragment, AbstractC10360h2 abstractC10360h2, InterfaceC16660sJ interfaceC16660sJ, int i) {
        this.A05 = fragment;
        this.A03 = abstractC10360h2;
        this.A02 = i;
        this.A04 = interfaceC16660sJ;
    }

    @Override // X.C06K
    public void A04(Fragment fragment, AbstractC10360h2 abstractC10360h2) {
        String hexString = Integer.toHexString(System.identityHashCode(fragment));
        C14360o3.A07(hexString);
        if (hexString.equals(this.A01)) {
            this.A04.invoke(EnumC68126VCk.A02);
            this.A01 = null;
        }
    }
}
