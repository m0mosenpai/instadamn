package com.google.android.gms.common.api;

import X.AbstractC166987dD;
import X.AbstractC31173DnH;
import X.AbstractC58321PtD;
import X.AnonymousClass001;
import X.C0f9;
import X.C129425t4;
import X.C1335961f;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.facebook.proxygen.TraceFieldType;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes10.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public int A00 = 0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.A00 = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.A00);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.A00 = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C1335961f A01 = C1335961f.A01(this);
                if (i2 != -1) {
                    if (i2 == 0) {
                        A01.A06(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                    }
                } else {
                    Handler handler = A01.A06;
                    handler.sendMessage(handler.obtainMessage(3));
                }
            }
        } else if (i == 2) {
            this.A00 = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        int A09 = AbstractC58321PtD.A09(this, 717675665);
        super.onCreate(bundle);
        if (bundle != null) {
            this.A00 = bundle.getInt("resolution");
        }
        if (this.A00 != 1) {
            Bundle A0A = AbstractC31173DnH.A0A(this);
            if (A0A == null) {
                str = "Activity started without extras";
            } else {
                PendingIntent pendingIntent = (PendingIntent) A0A.get("pending_intent");
                Object obj = A0A.get(TraceFieldType.ErrorCode);
                if (pendingIntent == null) {
                    if (obj != null) {
                        int A0H = AbstractC166987dD.A0H(obj);
                        AlertDialog A00 = GoogleApiAvailability.A00(this, this, new C129425t4(this, GoogleApiAvailability.A00.A04(this, "d", A0H), 2), A0H);
                        if (A00 != null) {
                            GoogleApiAvailability.A01(this, A00, this, "GooglePlayServicesErrorDialog");
                        }
                        this.A00 = 1;
                    } else {
                        str = "Activity started without resolution";
                    }
                } else {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                        this.A00 = 1;
                    } catch (ActivityNotFoundException e) {
                        if (A0A.getBoolean("notify_manager", true)) {
                            C1335961f.A01(this).A06(new ConnectionResult(22, null), getIntent().getIntExtra("failing_client_id", -1));
                        } else {
                            String A0g = AnonymousClass001.A0g("Activity not found while launching ", pendingIntent.toString(), ".");
                            if (Build.FINGERPRINT.contains("generic")) {
                                A0g = A0g.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                            }
                            Log.e("GoogleApiActivity", A0g, e);
                        }
                        this.A00 = 1;
                    } catch (IntentSender.SendIntentException e2) {
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e2);
                        finish();
                    }
                }
                i = 1256905274;
            }
            Log.e("GoogleApiActivity", str);
            finish();
            i = 1256905274;
        } else {
            i = -695541485;
        }
        C0f9.A07(i, A09);
    }
}
