package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.Handler;

/* renamed from: X.3UW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3UW {
    public static final C3UW A02 = new C3UW();
    public boolean A00 = false;
    public final C0Gd A01;

    public final boolean A07(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter, Handler handler, Boolean bool) {
        try {
            C0DJ.A02(broadcastReceiver, context, intentFilter, handler, null, bool.booleanValue());
            return true;
        } catch (IllegalArgumentException | SecurityException e) {
            C0K8.A0G("RtiGracefulSystemMethodHelper", "Failed to registerReceiver", e);
            return false;
        } catch (RuntimeException e2) {
            if (!(e2.getCause() instanceof DeadObjectException)) {
                throw e2;
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0097 A[Catch: RuntimeException -> 0x00a8, NameNotFoundException -> 0x00b7, TryCatch #3 {NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8, blocks: (B:3:0x0007, B:5:0x0013, B:7:0x0017, B:9:0x001b, B:11:0x001f, B:13:0x0023, B:15:0x0032, B:17:0x003a, B:19:0x0045, B:22:0x0085, B:24:0x008f, B:26:0x0097, B:27:0x0099, B:30:0x009c, B:32:0x00a4, B:35:0x0052, B:37:0x005f, B:38:0x008b, B:39:0x0062, B:41:0x0066, B:43:0x006c, B:45:0x0075, B:47:0x007c, B:48:0x007f, B:49:0x0082), top: B:2:0x0007, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c A[Catch: RuntimeException -> 0x00a8, NameNotFoundException -> 0x00b7, TryCatch #3 {NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8, blocks: (B:3:0x0007, B:5:0x0013, B:7:0x0017, B:9:0x001b, B:11:0x001f, B:13:0x0023, B:15:0x0032, B:17:0x003a, B:19:0x0045, B:22:0x0085, B:24:0x008f, B:26:0x0097, B:27:0x0099, B:30:0x009c, B:32:0x00a4, B:35:0x0052, B:37:0x005f, B:38:0x008b, B:39:0x0062, B:41:0x0066, B:43:0x006c, B:45:0x0075, B:47:0x007c, B:48:0x007f, B:49:0x0082), top: B:2:0x0007, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C3UX A01(android.content.Context r7, java.lang.String r8, int r9) {
        /*
            r6 = this;
            java.lang.String r5 = "RtiGracefulSystemMethodHelper"
            X.3UX r4 = new X.3UX
            r4.<init>(r8)
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r8, r9)     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            r4.A01 = r0     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            if (r0 == 0) goto Lbb
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            if (r0 == 0) goto Lbb
            android.content.pm.PackageInfo r1 = r4.A01     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            if (r1 == 0) goto L82
            android.content.pm.ApplicationInfo r0 = r1.applicationInfo     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            if (r0 == 0) goto L82
            boolean r0 = r0.enabled     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            if (r0 == 0) goto L62
            java.lang.String r3 = r1.packageName     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            java.lang.Object r2 = X.C3UY.A00     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            X.3Uq r2 = (X.C74123Uq) r2     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            java.lang.String r0 = r2.A05     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            boolean r0 = r0.equals(r3)     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            r1 = 1
            if (r0 != 0) goto L8b
            java.lang.String r0 = r2.A04     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            boolean r0 = r0.equals(r3)     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            if (r0 != 0) goto L8b
            java.lang.String r1 = "com.facebook.rti.fbns.intent.RECEIVE"
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            r0.<init>(r1)     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            android.content.Intent r2 = r0.setPackage(r3)     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            android.content.pm.PackageManager r1 = r7.getPackageManager()     // Catch: java.lang.RuntimeException -> L51 java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            r0 = 0
            java.util.List r0 = r1.queryBroadcastReceivers(r2, r0)     // Catch: java.lang.RuntimeException -> L51 java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            if (r0 == 0) goto L60
            goto L85
        L51:
            r1 = move-exception
            java.lang.String r0 = "Failed to queryBroadcastReceivers"
            X.C0K8.A0G(r5, r0, r1)     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            java.lang.Throwable r0 = r1.getCause()     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            boolean r0 = r0 instanceof android.os.DeadObjectException     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            if (r0 != 0) goto L60
            throw r1     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
        L60:
            r1 = 0
            goto L8f
        L62:
            boolean r0 = r6.A00     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            if (r0 == 0) goto L7f
            android.content.pm.PackageManager r3 = r7.getPackageManager()     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            if (r3 == 0) goto L82
            java.lang.String r2 = r4.A00     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            int r1 = r3.getApplicationEnabledSetting(r2)     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            r0 = 2
            if (r1 == r0) goto L7c
            int r1 = r3.getApplicationEnabledSetting(r2)     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            r0 = 4
            if (r1 != r0) goto L82
        L7c:
            java.lang.Integer r0 = X.C05F.A0j     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            goto L99
        L7f:
            java.lang.Integer r0 = X.C05F.A0C     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            goto L99
        L82:
            java.lang.Integer r0 = X.C05F.A00     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            goto L99
        L85:
            boolean r0 = r0.isEmpty()     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            r1 = r0 ^ 1
        L8b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
        L8f:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            boolean r0 = r0.equals(r1)     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            if (r0 == 0) goto L9c
            java.lang.Integer r0 = X.C05F.A0Y     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
        L99:
            r4.A02 = r0     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            goto La7
        L9c:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            boolean r0 = r0.equals(r1)     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            if (r0 == 0) goto L82
            java.lang.Integer r0 = X.C05F.A0N     // Catch: java.lang.RuntimeException -> La8 android.content.pm.PackageManager.NameNotFoundException -> Lb7
            goto L99
        La7:
            return r4
        La8:
            r1 = move-exception
            java.lang.String r0 = "Failed to getPackageInfo"
            X.C0K8.A0G(r5, r0, r1)
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 != 0) goto Lbb
            throw r1
        Lb7:
            java.lang.Integer r0 = X.C05F.A01
            r4.A02 = r0
        Lbb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3UW.A01(android.content.Context, java.lang.String, int):X.3UX");
    }

    public final void A02(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        try {
            alarmManager.setAndAllowWhileIdle(i, j, pendingIntent);
        } catch (SecurityException e) {
            C0K8.A0G("RtiGracefulSystemMethodHelper", "Failed to setAndAllowWhileIdle", e);
            if (this.A01 != null) {
                this.A01.EmQ("RtiGracefulSystemMethodHelper", e);
            }
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof DeadObjectException) {
                C0Gd c0Gd = this.A01;
                if (c0Gd != null) {
                    c0Gd.EmP("RtiGracefulSystemMethodHelper", "setAndAllowWhileIdle DeadObjectException", e2);
                    return;
                }
                return;
            }
            throw e2;
        }
    }

    public final void A04(Context context, AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        try {
            if (A00(alarmManager, context)) {
                if (Build.VERSION.SDK_INT >= 23) {
                    alarmManager.setExactAndAllowWhileIdle(i, j, pendingIntent);
                } else if (Build.VERSION.SDK_INT >= 19) {
                    alarmManager.setExact(i, j, pendingIntent);
                } else {
                    alarmManager.set(i, j, pendingIntent);
                }
            } else if (Build.VERSION.SDK_INT >= 23) {
                alarmManager.setAndAllowWhileIdle(i, j, pendingIntent);
            } else {
                alarmManager.set(i, j, pendingIntent);
            }
        } catch (IllegalStateException e) {
            C0Gd c0Gd = this.A01;
            if (c0Gd != null) {
                c0Gd.EmP("RtiGracefulSystemMethodHelper", "set alarm IllegalStateException", e);
            }
        } catch (NullPointerException e2) {
            C0Gd c0Gd2 = this.A01;
            if (c0Gd2 != null) {
                c0Gd2.EmP("RtiGracefulSystemMethodHelper", "set alarm NullPointerException", e2);
            }
        } catch (SecurityException e3) {
            C0K8.A0G("RtiGracefulSystemMethodHelper", "Failed to set alarm", e3);
            C0Gd c0Gd3 = this.A01;
            if (c0Gd3 != null) {
                c0Gd3.EmQ("RtiGracefulSystemMethodHelper", e3);
            }
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof DeadObjectException) {
                C0Gd c0Gd4 = this.A01;
                if (c0Gd4 != null) {
                    c0Gd4.EmP("RtiGracefulSystemMethodHelper", "set alarm DeadObjectException", e4);
                    return;
                }
                return;
            }
            throw e4;
        }
    }

    @Deprecated
    public final void A05(Context context, Intent intent) {
        try {
            context.startService(intent);
        } catch (IllegalStateException unused) {
        } catch (SecurityException e) {
            C0K8.A0G("RtiGracefulSystemMethodHelper", "Failed to startService", e);
        } catch (RuntimeException e2) {
            if (!(e2.getCause() instanceof DeadObjectException)) {
                throw e2;
            }
        }
    }

    public final boolean A06(BroadcastReceiver broadcastReceiver, Context context) {
        try {
            context.unregisterReceiver(broadcastReceiver);
            return true;
        } catch (IllegalArgumentException e) {
            C0K8.A0I("RtiGracefulSystemMethodHelper", "failed to unregisterReceiver", e);
            return false;
        } catch (SecurityException e2) {
            C0K8.A0G("RtiGracefulSystemMethodHelper", "Failed to unregisterReceiver", e2);
            return false;
        } catch (RuntimeException e3) {
            if (!(e3.getCause() instanceof DeadObjectException)) {
                throw e3;
            }
            return false;
        }
    }

    @Deprecated
    public final boolean A08(Context context, Intent intent) {
        try {
            context.sendBroadcast(intent);
            return true;
        } catch (SecurityException e) {
            C0K8.A0G("RtiGracefulSystemMethodHelper", "Failed to sendBroadcast", e);
            return false;
        } catch (RuntimeException e2) {
            if (!(e2.getCause() instanceof DeadObjectException)) {
                throw e2;
            }
            return false;
        }
    }

    public static final boolean A00(AlarmManager alarmManager, Context context) {
        return AbstractC02620Al.A00(alarmManager, context);
    }

    public final void A03(AlarmManager alarmManager, PendingIntent pendingIntent) {
        try {
            alarmManager.cancel(pendingIntent);
        } catch (SecurityException unused) {
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof DeadObjectException)) {
                throw e;
            }
        }
    }
}
