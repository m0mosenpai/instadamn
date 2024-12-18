package X;

import android.content.ContentResolver;
import android.content.ContentValues;

/* renamed from: X.Rbt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60939Rbt extends C2AG {
    public final /* synthetic */ C33225ElD A00;
    public final /* synthetic */ C36731GHa A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    @Override // X.C11R
    public final int getRunnableId() {
        return 438;
    }

    public C60939Rbt(C33225ElD c33225ElD, C36731GHa c36731GHa, boolean z, boolean z2) {
        this.A00 = c33225ElD;
        this.A01 = c36731GHa;
        this.A03 = z;
        this.A02 = z2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        try {
            C33225ElD c33225ElD = this.A00;
            SXA sxa = c33225ElD.A00;
            ContentResolver contentResolver = c33225ElD.requireContext().getContentResolver();
            android.net.Uri A0L = AbstractC58321PtD.A0L(sxa.A06);
            ContentValues contentValues = new ContentValues();
            AbstractC58318PtA.A1B(contentValues, "auto_updates", sxa.A02 ? 1 : 0);
            AbstractC58318PtA.A1B(contentValues, "notif_update_available", sxa.A04 ? 1 : 0);
            AbstractC58318PtA.A1B(contentValues, "notif_update_installed", sxa.A05 ? 1 : 0);
            String str = sxa.A00;
            if (str == null) {
                contentValues.putNull("rollout_token");
            } else {
                contentValues.put("rollout_token", str);
            }
            AbstractC58318PtA.A1B(contentValues, "terms_of_service_accepted", sxa.A03 ? 1 : 0);
            AbstractC58318PtA.A1B(contentValues, "updates_over_cellular_enabled", sxa.A01 ? 1 : 0);
            if (contentResolver.update(A0L, contentValues, null, null) < 0) {
                throw AbstractC166987dD.A14("Failed to update settings");
            }
            return null;
        } catch (IllegalStateException e) {
            this.A00.getActivity().runOnUiThread(new Runnable() { // from class: X.TP5
                @Override // java.lang.Runnable
                public final void run() {
                    C60939Rbt.this.onFail(e);
                }
            });
            return null;
        }
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        if (this.A02) {
            C33225ElD c33225ElD = this.A00;
            C36731GHa c36731GHa = this.A01;
            boolean z = this.A03;
            C193328hC c193328hC = new C193328hC(c33225ElD.getContext());
            c193328hC.A0A(2131953407);
            c193328hC.A09(2131953406);
            c193328hC.A0J(new DialogInterfaceOnClickListenerC55285Og0(2, c36731GHa, c33225ElD, z), 2131953408);
            c193328hC.A0D(new DialogInterfaceOnClickListenerC35447Fk4(3, c33225ElD, c36731GHa, z));
            C0fJ.A00(c193328hC.A02());
        }
        C0w9.A07("omvp_app_updates", exc);
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (this.A01 == null) {
            C33225ElD c33225ElD = this.A00;
            c33225ElD.A01.A1y();
            c33225ElD.A01.A01.getBoolean("oxp_show_app_update_available_notifications", true);
            c33225ElD.A01.A01.getBoolean("oxp_show_app_update_installed_notifications", true);
        }
    }
}
