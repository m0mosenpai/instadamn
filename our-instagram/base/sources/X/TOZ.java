package X;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes10.dex */
public final class TOZ implements Runnable {
    public final SER A00;
    public final /* synthetic */ AbstractDialogInterfaceOnCancelListenerC1336061o A01;

    public TOZ(SER ser, AbstractDialogInterfaceOnCancelListenerC1336061o abstractDialogInterfaceOnCancelListenerC1336061o) {
        this.A01 = abstractDialogInterfaceOnCancelListenerC1336061o;
        this.A00 = ser;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PendingIntent pendingIntent;
        AbstractDialogInterfaceOnCancelListenerC1336061o abstractDialogInterfaceOnCancelListenerC1336061o = this.A01;
        if (abstractDialogInterfaceOnCancelListenerC1336061o.A03) {
            SER ser = this.A00;
            ConnectionResult connectionResult = ser.A01;
            int i = connectionResult.A01;
            if (i != 0 && (pendingIntent = connectionResult.A02) != null) {
                InterfaceC65566Tms interfaceC65566Tms = ((LifecycleCallback) abstractDialogInterfaceOnCancelListenerC1336061o).A00;
                Activity BN7 = interfaceC65566Tms.BN7();
                C3U5.A02(BN7);
                int i2 = ser.A00;
                Intent A08 = MSW.A08(BN7, GoogleApiActivity.class);
                A08.putExtra("pending_intent", pendingIntent);
                A08.putExtra("failing_client_id", i2);
                A08.putExtra("notify_manager", false);
                interfaceC65566Tms.startActivityForResult(A08, 1);
                return;
            }
            InterfaceC65566Tms interfaceC65566Tms2 = ((LifecycleCallback) abstractDialogInterfaceOnCancelListenerC1336061o).A00;
            Activity BN72 = interfaceC65566Tms2.BN7();
            C3U5.A02(BN72);
            GoogleApiAvailability googleApiAvailability = abstractDialogInterfaceOnCancelListenerC1336061o.A00;
            if (googleApiAvailability.A04(BN72, null, i) != null) {
                Activity BN73 = interfaceC65566Tms2.BN7();
                C3U5.A02(BN73);
                AlertDialog A00 = GoogleApiAvailability.A00(BN73, abstractDialogInterfaceOnCancelListenerC1336061o, new RKN(googleApiAvailability.A04(BN73, "d", i), interfaceC65566Tms2), i);
                if (A00 == null) {
                    return;
                }
                GoogleApiAvailability.A01(BN73, A00, abstractDialogInterfaceOnCancelListenerC1336061o, "GooglePlayServicesErrorDialog");
                return;
            }
            if (i == 18) {
                Activity BN74 = interfaceC65566Tms2.BN7();
                C3U5.A02(BN74);
                ProgressBar progressBar = new ProgressBar(BN74, null, R.attr.progressBarStyleLarge);
                progressBar.setIndeterminate(true);
                progressBar.setVisibility(0);
                AlertDialog.Builder builder = new AlertDialog.Builder(BN74);
                builder.setView(progressBar);
                builder.setMessage(AbstractC63323ShX.A01(BN74, 18));
                builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                AlertDialog create = builder.create();
                GoogleApiAvailability.A01(BN74, create, abstractDialogInterfaceOnCancelListenerC1336061o, "GooglePlayServicesUpdatingDialog");
                Activity BN75 = interfaceC65566Tms2.BN7();
                C3U5.A02(BN75);
                googleApiAvailability.A05(BN75.getApplicationContext(), new C60666RGu(create, this));
                return;
            }
            int i3 = ser.A00;
            abstractDialogInterfaceOnCancelListenerC1336061o.A01.set(null);
            abstractDialogInterfaceOnCancelListenerC1336061o.A0A(connectionResult, i3);
        }
    }
}
