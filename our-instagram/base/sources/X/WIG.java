package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class WIG implements DialogInterface.OnShowListener {
    public final int A00;
    public final Object A01;

    public WIG(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        String str;
        long currentTimeMillis;
        InterfaceC19610xo ARD;
        String str2;
        switch (this.A00) {
            case 0:
                C14360o3.A0C(dialogInterface, MSV.A00(528));
                if (((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet) == null) {
                    return;
                }
                C2FP.A02().A07().A00(((Fragment) this.A01).requireContext(), 21);
                throw C00O.createAndThrow();
            case 1:
                C14360o3.A0C(dialogInterface, MSV.A00(528));
                View findViewById = ((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet);
                if (findViewById == null) {
                    return;
                }
                C2FP.A0A();
                AbstractC31172DnG.A1B(((Fragment) this.A01).requireContext(), findViewById, R.color.fds_transparent);
                return;
            case 2:
                V16 v16 = (V16) this.A01;
                C23031Ai c23031Ai = v16.A0I;
                str = "userPreferences";
                if (c23031Ai != null) {
                    InterfaceC19630xq interfaceC19630xq = c23031Ai.A01;
                    AbstractC167017dG.A1L(interfaceC19630xq.ARD(), interfaceC19630xq, "promote_direct_inbox_entered_education_dialog_impression_count", 0);
                    C23031Ai c23031Ai2 = v16.A0I;
                    if (c23031Ai2 != null) {
                        currentTimeMillis = System.currentTimeMillis();
                        ARD = c23031Ai2.A01.ARD();
                        str2 = "promote_direct_inbox_entered_education_dialog_last_seen_timestamp";
                        ARD.E7G(str2, currentTimeMillis);
                        ARD.apply();
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 3:
                C23031Ai c23031Ai3 = ((V16) this.A01).A0I;
                if (c23031Ai3 != null) {
                    ARD = c23031Ai3.A01.ARD();
                    ARD.E77("has_seen_promote_direct_inbox_entrypoint_education_dialog", true);
                    ARD.apply();
                    return;
                }
                str = "userPreferences";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 4:
                C23031Ai c23031Ai4 = ((V16) this.A01).A0I;
                if (c23031Ai4 != null) {
                    currentTimeMillis = System.currentTimeMillis();
                    InterfaceC19630xq interfaceC19630xq2 = c23031Ai4.A01;
                    AbstractC167017dG.A1L(interfaceC19630xq2.ARD(), interfaceC19630xq2, "promote_outcome_upsell_education_dialog_impression_count", 0);
                    ARD = interfaceC19630xq2.ARD();
                    str2 = "promote_outcome_upsell_education_dialog_last_seen_timestamp";
                    ARD.E7G(str2, currentTimeMillis);
                    ARD.apply();
                    return;
                }
                str = "userPreferences";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 5:
                final AnonymousClass693 anonymousClass693 = (AnonymousClass693) this.A01;
                C11T.A04(new Runnable() { // from class: X.WsQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass693.this.E4S();
                    }
                }, 300L);
                return;
            default:
                InterfaceC71983XDs interfaceC71983XDs = (InterfaceC71983XDs) this.A01;
                if (interfaceC71983XDs != null) {
                    interfaceC71983XDs.onShow();
                    return;
                }
                return;
        }
    }
}
