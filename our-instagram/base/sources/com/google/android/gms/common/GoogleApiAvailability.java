package com.google.android.gms.common;

import X.AbstractC10360h2;
import X.AbstractC58317Pt9;
import X.AbstractC63323ShX;
import X.AbstractDialogInterfaceOnClickListenerC129415t3;
import X.C0SG;
import X.C3U5;
import X.HandlerC60675RLe;
import X.XN9;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.NotificationCompat$BigTextStyle;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.util.DeviceProperties;

/* loaded from: classes2.dex */
public final class GoogleApiAvailability extends GoogleApiAvailabilityLight {
    public static final Object A01 = new Object();
    public static final GoogleApiAvailability A00 = new Object();

    public static final AlertDialog A00(Context context, DialogInterface.OnCancelListener onCancelListener, AbstractDialogInterfaceOnClickListenerC129415t3 abstractDialogInterfaceOnClickListenerC129415t3, int i) {
        AlertDialog.Builder builder;
        int i2;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        } else {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(AbstractC63323ShX.A01(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        if (i != 1) {
            if (i != 2) {
                i2 = 2131956528;
                if (i != 3) {
                    i2 = R.string.ok;
                }
            } else {
                i2 = 2131956538;
            }
        } else {
            i2 = 2131956531;
        }
        String string = resources.getString(i2);
        if (string != null) {
            builder.setPositiveButton(string, abstractDialogInterfaceOnClickListenerC129415t3);
        }
        String A02 = AbstractC63323ShX.A02(context, i);
        if (A02 != null) {
            builder.setTitle(A02);
        }
        Log.w(AbstractC58317Pt9.A00(180), String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder.create();
    }

    public final void A06(PendingIntent pendingIntent, Context context, int i) {
        String A02;
        String format;
        int i2;
        String format2 = String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        String A002 = AbstractC58317Pt9.A00(180);
        Log.w(A002, format2, illegalArgumentException);
        if (i == 18) {
            new HandlerC60675RLe(context, this).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i != 6) {
                return;
            }
            Log.w(A002, "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            return;
        }
        if (i == 6) {
            A02 = AbstractC63323ShX.A03(context, "common_google_play_services_resolution_required_title");
        } else {
            A02 = AbstractC63323ShX.A02(context, i);
        }
        if (A02 == null) {
            A02 = context.getResources().getString(2131956535);
        }
        if (i != 6 && i != 19) {
            format = AbstractC63323ShX.A01(context, i);
        } else {
            String A003 = AbstractC63323ShX.A00(context);
            Resources resources = context.getResources();
            String A03 = AbstractC63323ShX.A03(context, "common_google_play_services_resolution_required_text");
            if (A03 == null) {
                A03 = resources.getString(2131956536);
            }
            format = String.format(resources.getConfiguration().locale, A03, A003);
        }
        Resources resources2 = context.getResources();
        Object systemService = context.getSystemService("notification");
        C3U5.A02(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        XN9 xn9 = new XN9(context, (String) null);
        xn9.A0g = true;
        xn9.A0E(true);
        xn9.A0C(A02);
        NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = new NotificationCompat$BigTextStyle();
        notificationCompat$BigTextStyle.A06(format);
        xn9.A0A(notificationCompat$BigTextStyle);
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = DeviceProperties.A00;
        if (bool == null) {
            boolean z = false;
            if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            bool = Boolean.valueOf(z);
            DeviceProperties.A00 = bool;
        }
        if (bool.booleanValue()) {
            xn9.A04(((PackageItemInfo) context.getApplicationInfo()).icon);
            xn9.A05 = 2;
            if (DeviceProperties.A00(context)) {
                xn9.A06(pendingIntent, resources2.getString(2131956544), com.facebook.R.drawable.common_full_open_on_phone);
            } else {
                xn9.A0C = pendingIntent;
            }
        } else {
            xn9.A04(R.drawable.stat_sys_warning);
            xn9.A0D(resources2.getString(2131956535));
            xn9.A0A.when = System.currentTimeMillis();
            xn9.A0C = pendingIntent;
            xn9.A0B(format);
        }
        synchronized (A01) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(2131956534);
        if (notificationChannel == null) {
            notificationChannel = new NotificationChannel("com.google.android.gms.availability", string, 4);
        } else {
            if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
            }
            xn9.A0U = "com.google.android.gms.availability";
            Notification A032 = xn9.A03();
            if (i == 1 && i != 2 && i != 3) {
                i2 = 39789;
            } else {
                GooglePlayServicesUtil.A02.set(false);
                i2 = 10436;
            }
            notificationManager.notify(i2, A032);
        }
        notificationManager.createNotificationChannel(notificationChannel);
        xn9.A0U = "com.google.android.gms.availability";
        Notification A0322 = xn9.A03();
        if (i == 1) {
        }
        GooglePlayServicesUtil.A02.set(false);
        i2 = 10436;
        notificationManager.notify(i2, A0322);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Q0y, android.app.DialogFragment] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0SG, X.Q7m] */
    public static final void A01(Activity activity, Dialog dialog, DialogInterface.OnCancelListener onCancelListener, String str) {
        try {
            if (activity instanceof FragmentActivity) {
                AbstractC10360h2 supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
                ?? c0sg = new C0SG();
                C3U5.A03(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                c0sg.A00 = dialog;
                c0sg.A01 = onCancelListener;
                c0sg.A0B(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ?? dialogFragment = new DialogFragment();
        C3U5.A03(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        dialogFragment.A00 = dialog;
        dialogFragment.A01 = onCancelListener;
        dialogFragment.show(fragmentManager, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r5.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C58698Q1o A05(android.content.Context r5, X.AbstractC61585Rq9 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "android.intent.action.PACKAGE_ADDED"
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>(r0)
            java.lang.String r0 = "package"
            r1.addDataScheme(r0)
            X.Q1o r2 = new X.Q1o
            r2.<init>(r6)
            boolean r0 = X.AbstractC225409x3.A00()
            if (r0 == 0) goto L22
            r0 = 2
            r5.registerReceiver(r2, r1, r0)
        L1b:
            r2.A00 = r5
            java.lang.String r3 = "com.google.android.gms"
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtil.A00
            goto L26
        L22:
            r5.registerReceiver(r2, r1)
            goto L1b
        L26:
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L35
            android.content.pm.PackageInstaller r0 = r0.getPackageInstaller()     // Catch: java.lang.Throwable -> L35
            java.util.List r0 = r0.getAllSessions()     // Catch: java.lang.Throwable -> L35
            goto L3d
        L33:
            if (r0 != 0) goto L57
        L35:
            r6.A00()
            r2.A00()
            r0 = 0
            return r0
        L3d:
            java.util.Iterator r1 = r0.iterator()
        L41:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L58
            java.lang.Object r0 = r1.next()
            android.content.pm.PackageInstaller$SessionInfo r0 = (android.content.pm.PackageInstaller.SessionInfo) r0
            java.lang.String r0 = r0.getAppPackageName()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L41
        L57:
            return r2
        L58:
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            r0 = 8192(0x2000, float:1.148E-41)
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo(r3, r0)
            boolean r0 = r0.enabled
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleApiAvailability.A05(android.content.Context, X.Rq9):X.Q1o");
    }
}
