package X;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes11.dex */
public final class WQZ implements InterfaceC65626Tpm, XBU {
    public CW5 A00;
    public String A01;
    public boolean A02;
    public final CWZ A03;

    public WQZ(Context context, Bundle bundle, C07T c07t, InterfaceC72040XGi interfaceC72040XGi) {
        Object A02;
        c07t.A09(this);
        if (bundle != null) {
            int i = bundle.getInt("containerArguments", -1);
            if (i == -1) {
                A02 = null;
            } else {
                A02 = AbstractC66261U6f.A02(CW5.class, Integer.valueOf(i));
            }
            C14360o3.A0C(A02, "null cannot be cast to non-null type com.meta.foa.cds.bottomsheet.CdsBottomSheetOpenContainerArgs<kotlin.Any, com.meta.foa.screens.DataSource>");
            CW5 cw5 = (CW5) A02;
            String string = bundle.getString("dark_mode_config");
            if (string != null) {
                int intValue = U76.A00(string).intValue();
                boolean z = true;
                if (intValue != 0) {
                    if (intValue != 1) {
                        z = AbstractC72723Nt.A00(context);
                    } else {
                        z = false;
                    }
                }
                CWZ cwz = new CWZ(context, cw5.A03, z);
                cwz.A00 = interfaceC72040XGi;
                this.A03 = cwz;
                this.A00 = cw5;
                this.A01 = cw5.A02.A00;
                this.A02 = true;
                return;
            }
            throw new IllegalStateException("Dark mode config is missing from the bundle. Please check that 'dark_mode_config' field is set.");
        }
        throw new UnsupportedOperationException("Navigation from Bloks to Native is not yet supported.");
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onPause(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStop(C07X c07x) {
    }

    @Override // X.XBU
    public final C69750Vuk Aba() {
        String str = this.A01;
        if (str != null) {
            return new C69750Vuk(str, str);
        }
        return null;
    }

    @Override // X.InterfaceC65626Tpm
    public final void onDestroy(C07X c07x) {
        this.A03.A00 = null;
    }

    @Override // X.InterfaceC65626Tpm
    public final void onResume(C07X c07x) {
        if (this.A02) {
            CW5 cw5 = this.A00;
            if (cw5 != null) {
                this.A03.A01(cw5);
                this.A00 = null;
            }
            this.A02 = false;
        }
    }
}
