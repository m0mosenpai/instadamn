package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.KPf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45800KPf extends KCM {
    public static final String __redex_internal_original_name = "EncryptedBackupsPinNuxV2Fragment";
    public final InterfaceC09390do A00;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "encrypted_backups_pin_nux_v2_fragment";
    }

    @Override // X.AbstractC59972of
    public final void afterOnViewCreated() {
        String str;
        C44468Jla c44468Jla = (C44468Jla) this.A00.getValue();
        Integer A02 = LLQ.A02(this);
        Integer A03 = LLQ.A03(this);
        Integer A01 = LLQ.A01(this);
        C14360o3.A0B(A02, 0);
        C14360o3.A0B(A03, 1);
        KPI kpi = c44468Jla.A00;
        kpi.A05("SOFT_BLOCK_PIN_LEADING_SCREEN_IMPRESSION");
        int intValue = A02.intValue();
        if (intValue != 10) {
            if (intValue != 11) {
                if (intValue != 4) {
                    if (intValue != 2) {
                        if (intValue == 12) {
                            str = "RETRY_PIN";
                        }
                        kpi.A07("PERIOD", AbstractC46734Klr.A00(A03));
                        JQ1.A0l(kpi, A01, "SETUP_TYPE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
                    }
                    str = "SETTINGS";
                } else {
                    str = "FISHFOODING";
                }
            } else {
                str = "INBOX_BANNER";
            }
        } else {
            str = "THREAD_EXIT";
        }
        kpi.A07("ENTRY_POINT", str);
        kpi.A07("PERIOD", AbstractC46734Klr.A00(A03));
        JQ1.A0l(kpi, A01, "SETUP_TYPE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
    }

    public C45800KPf() {
        MHT mht = new MHT(this, 4);
        InterfaceC09390do A00 = MHT.A00(new MHT(this, 1), EnumC09460dv.A02, 2);
        this.A00 = AbstractC25225BEi.A0a(new MHT(A00, 3), mht, new C50172MDz(14, null, A00), AbstractC25225BEi.A1D(C44468Jla.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(322234296);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_pin_nux_v2, viewGroup, false);
        KCM.A04(inflate, this);
        C64P c64p = (C64P) AbstractC166997dE.A0R(inflate, R.id.bottom_buttons);
        KCM.A07(c64p, this, 61);
        KCM.A06(c64p, this, 62);
        C0f9.A09(-203374183, A02);
        return inflate;
    }
}
