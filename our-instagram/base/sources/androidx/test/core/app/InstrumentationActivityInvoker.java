package androidx.test.core.app;

import X.AbstractC58318PtA;
import X.AbstractC58321PtD;
import X.C0f9;
import X.Q1k;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;

/* loaded from: classes10.dex */
public abstract class InstrumentationActivityInvoker {

    /* loaded from: classes10.dex */
    public class BootstrapActivity extends Activity {
        public boolean A00;
        public final BroadcastReceiver A01 = new Q1k(this, 1);

        @Override // android.app.Activity
        public final void onActivityResult(int requestCode, int resultCode, Intent data) {
            if (requestCode == 0) {
                Intent A0E = AbstractC58318PtA.A0E("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_RECEIVED");
                A0E.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_CODE_KEY", resultCode);
                if (data != null) {
                    A0E.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_DATA_KEY", data);
                }
                sendBroadcast(A0E);
                finish();
            }
        }

        @Override // android.app.Activity
        public final void finish() {
            super.finish();
            overridePendingTransition(0, 0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
        
            if (r5.getBoolean("IS_TARGET_ACTIVITY_STARTED_KEY", false) == false) goto L6;
         */
        @Override // android.app.Activity
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onCreate(android.os.Bundle r5) {
            /*
                r4 = this;
                r0 = 1716649766(0x6651ff26, float:2.4792031E23)
                int r3 = X.AbstractC58321PtD.A09(r4, r0)
                super.onCreate(r5)
                android.content.BroadcastReceiver r2 = r4.A01
                java.lang.String r1 = "androidx.test.core.app.InstrumentationActivityInvoker.FINISH_BOOTSTRAP_ACTIVITY"
                android.content.IntentFilter r0 = new android.content.IntentFilter
                r0.<init>(r1)
                androidx.test.core.app.InstrumentationActivityInvoker.A01(r2, r4, r0)
                r2 = 0
                if (r5 == 0) goto L22
                java.lang.String r0 = "IS_TARGET_ACTIVITY_STARTED_KEY"
                boolean r1 = r5.getBoolean(r0, r2)
                r0 = 1
                if (r1 != 0) goto L23
            L22:
                r0 = 0
            L23:
                r4.A00 = r0
                r4.overridePendingTransition(r2, r2)
                r0 = -1451946368(0xffffffffa9750e80, float:-5.4413505E-14)
                X.C0f9.A07(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.test.core.app.InstrumentationActivityInvoker.BootstrapActivity.onCreate(android.os.Bundle):void");
        }

        @Override // android.app.Activity
        public final void onDestroy() {
            int A00 = C0f9.A00(-897451316);
            super.onDestroy();
            unregisterReceiver(this.A01);
            C0f9.A07(31942809, A00);
        }

        @Override // android.app.Activity
        public final void onResume() {
            int A00 = C0f9.A00(1698697661);
            super.onResume();
            if (!this.A00) {
                this.A00 = true;
                Parcelable parcelableExtra = getIntent().getParcelableExtra("androidx.test.core.app.InstrumentationActivityInvoker.START_TARGET_ACTIVITY_INTENT_KEY");
                parcelableExtra.getClass();
                PendingIntent pendingIntent = (PendingIntent) parcelableExtra;
                Bundle A002 = InstrumentationActivityInvoker.A00(getIntent().getBundleExtra("androidx.test.core.app.InstrumentationActivityInvoker.TARGET_ACTIVITY_OPTIONS_BUNDLE_KEY"));
                try {
                    if (A002 == null) {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 0, null, 268435456, 0, 0);
                    } else {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 0, null, 268435456, 0, 0, A002);
                    }
                } catch (IntentSender.SendIntentException e) {
                    Log.e("androidx.test.core.app.InstrumentationActivityInvoker$BootstrapActivity", "Failed to start target activity.", e);
                    RuntimeException A0f = AbstractC58318PtA.A0f(e);
                    C0f9.A07(1849125782, A00);
                    throw A0f;
                }
            }
            C0f9.A07(-1576145524, A00);
        }

        @Override // android.app.Activity
        public final void onSaveInstanceState(Bundle outState) {
            super.onSaveInstanceState(outState);
            outState.putBoolean("IS_TARGET_ACTIVITY_STARTED_KEY", this.A00);
        }
    }

    /* loaded from: classes10.dex */
    public class EmptyActivity extends Activity {
        public final BroadcastReceiver A00 = new Q1k(this, 2);

        @Override // android.app.Activity
        public final void finish() {
            super.finish();
            overridePendingTransition(0, 0);
        }

        @Override // android.app.Activity
        public final void onCreate(Bundle savedInstanceState) {
            int A09 = AbstractC58321PtD.A09(this, 2007609749);
            super.onCreate(savedInstanceState);
            InstrumentationActivityInvoker.A01(this.A00, this, new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_EMPTY_ACTIVITIES"));
            overridePendingTransition(0, 0);
            C0f9.A07(131107804, A09);
        }

        @Override // android.app.Activity
        public final void onDestroy() {
            int A00 = C0f9.A00(-2061992265);
            super.onDestroy();
            unregisterReceiver(this.A00);
            C0f9.A07(-1720267599, A00);
        }

        @Override // android.app.Activity
        public final void onResume() {
            int A00 = C0f9.A00(465916527);
            super.onResume();
            sendBroadcast(AbstractC58318PtA.A0E("androidx.test.core.app.InstrumentationActivityInvoker.EMPTY_ACTIVITY_RESUMED"));
            C0f9.A07(-1766033802, A00);
        }
    }

    /* loaded from: classes10.dex */
    public class EmptyFloatingActivity extends Activity {
        public final BroadcastReceiver A00 = new Q1k(this, 3);

        @Override // android.app.Activity
        public final void finish() {
            super.finish();
            overridePendingTransition(0, 0);
        }

        @Override // android.app.Activity
        public final void onCreate(Bundle savedInstanceState) {
            int A09 = AbstractC58321PtD.A09(this, 840797698);
            super.onCreate(savedInstanceState);
            InstrumentationActivityInvoker.A01(this.A00, this, new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_EMPTY_ACTIVITIES"));
            overridePendingTransition(0, 0);
            C0f9.A07(-1497505514, A09);
        }

        @Override // android.app.Activity
        public final void onDestroy() {
            int A00 = C0f9.A00(-1365335671);
            super.onDestroy();
            unregisterReceiver(this.A00);
            C0f9.A07(345698783, A00);
        }

        @Override // android.app.Activity
        public final void onResume() {
            int A00 = C0f9.A00(-673341291);
            super.onResume();
            sendBroadcast(AbstractC58318PtA.A0E("androidx.test.core.app.InstrumentationActivityInvoker.EMPTY_FLOATING_ACTIVITY_RESUMED"));
            C0f9.A07(-619770408, A00);
        }
    }

    public static Bundle A00(Bundle activityOptionsBundle) {
        if (Build.VERSION.SDK_INT < 34) {
            return activityOptionsBundle;
        }
        Bundle bundle = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
        if (activityOptionsBundle != null) {
            bundle.putAll(activityOptionsBundle);
        }
        return bundle;
    }

    public static void A01(BroadcastReceiver context, Context broadcastReceiver, IntentFilter intentFilter) {
        if (Build.VERSION.SDK_INT < 33) {
            broadcastReceiver.registerReceiver(context, intentFilter);
        } else {
            broadcastReceiver.registerReceiver(context, intentFilter, 2);
        }
    }
}
