package X;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.internal.auth.zzd;
import com.google.android.gms.internal.auth.zze;
import com.google.android.gms.internal.auth.zzw;
import com.google.android.gms.internal.auth.zzx;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: X.Siz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63384Siz {
    public static final String[] A02 = {"com.google", "com.google.work", "cn.google"};
    public static final ComponentName A00 = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    public static final C62679SLs A01 = new C62679SLs("Auth", "GoogleAuthUtil");

    public static Object A01(C5KS c5ks, String str) {
        try {
            return AbstractC58434PvD.A00(c5ks);
        } catch (InterruptedException e) {
            String format = String.format("Interrupted while waiting for the task of %s to finish.", str);
            A01.A00(format, new Object[0]);
            throw new IOException(format, e);
        } catch (CancellationException e2) {
            String format2 = String.format("Canceled while waiting for the task of %s to finish.", str);
            A01.A00(format2, new Object[0]);
            throw new IOException(format2, e2);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof Rk3) {
                throw cause;
            }
            String format3 = String.format("Unable to get a result for %s due to ExecutionException.", str);
            A01.A00(format3, new Object[0]);
            throw new IOException(format3, e3);
        }
    }

    public static TokenData A00(Context context, Bundle bundle) {
        EnumC61175Rgb enumC61175Rgb;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 != null) {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            TokenData tokenData = (TokenData) bundle2.getParcelable("TokenData");
            if (tokenData != null) {
                return tokenData;
            }
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent");
        EnumC61175Rgb[] values = EnumC61175Rgb.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                enumC61175Rgb = values[i];
                if (enumC61175Rgb.A00.equals(string)) {
                    break;
                }
                i++;
            } else {
                enumC61175Rgb = EnumC61175Rgb.A0J;
                break;
            }
        }
        C62679SLs c62679SLs = A01;
        c62679SLs.A00(String.format("[GoogleAuthUtil] error status:%s with method:%s", enumC61175Rgb, "getTokenWithDetails"), new Object[0]);
        if (!EnumC61175Rgb.A0H.equals(enumC61175Rgb) && !EnumC61175Rgb.A0K.equals(enumC61175Rgb) && !EnumC61175Rgb.A0L.equals(enumC61175Rgb) && !EnumC61175Rgb.A0M.equals(enumC61175Rgb) && !EnumC61175Rgb.A0I.equals(enumC61175Rgb) && !EnumC61175Rgb.A0N.equals(enumC61175Rgb) && !EnumC61175Rgb.A0B.equals(enumC61175Rgb) && !EnumC61175Rgb.A03.equals(enumC61175Rgb) && !EnumC61175Rgb.A04.equals(enumC61175Rgb) && !EnumC61175Rgb.A05.equals(enumC61175Rgb) && !EnumC61175Rgb.A06.equals(enumC61175Rgb) && !EnumC61175Rgb.A07.equals(enumC61175Rgb) && !EnumC61175Rgb.A08.equals(enumC61175Rgb) && !EnumC61175Rgb.A0A.equals(enumC61175Rgb) && !EnumC61175Rgb.A02.equals(enumC61175Rgb) && !EnumC61175Rgb.A09.equals(enumC61175Rgb)) {
            if (!EnumC61175Rgb.A0E.equals(enumC61175Rgb) && !EnumC61175Rgb.A0F.equals(enumC61175Rgb) && !EnumC61175Rgb.A0G.equals(enumC61175Rgb) && !EnumC61175Rgb.A0C.equals(enumC61175Rgb) && !EnumC61175Rgb.A0D.equals(enumC61175Rgb)) {
                throw new Exception(string);
            }
            throw MSW.A0y(string);
        }
        AbstractC63298Sgz.A00(context);
        if (pendingIntent != null && intent != null) {
            throw new UserRecoverableAuthException(pendingIntent, intent, EnumC61073Ren.AUTH_INSTANTIATION, string);
        }
        boolean z = GooglePlayServicesUtil.A00;
        try {
            int i2 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            if (i2 >= 233800000 && pendingIntent == null) {
                AbstractC58321PtD.A1Q(c62679SLs.A01, String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", Integer.valueOf(i2), "getTokenWithDetails", 233800000), "Auth");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            android.util.Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
        }
        if (intent == null) {
            AbstractC58321PtD.A1Q(c62679SLs.A01, String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", string, "getTokenWithDetails"), "Auth");
        }
        throw new UserRecoverableAuthException(null, intent, EnumC61073Ren.LEGACY, string);
    }

    public static void A03(Account account) {
        if (account != null) {
            if (!TextUtils.isEmpty(account.name)) {
                String[] strArr = A02;
                int i = 0;
                while (!strArr[i].equals(account.type)) {
                    i++;
                    if (i >= 3) {
                        throw AbstractC166987dD.A12("Account type not supported");
                    }
                }
                return;
            }
            throw AbstractC166987dD.A12("Account name cannot be empty!");
        }
        throw AbstractC166987dD.A12("Account cannot be null");
    }

    public static void A06(Context context, String str) {
        Parcelable parcelable;
        C3U5.A05("Calling this from your main thread can lead to deadlock");
        A04(context);
        Bundle A0b = AbstractC166987dD.A0b();
        A05(context, A0b);
        AbstractC63298Sgz.A00(context);
        C64242T5r.A01.A00.FFc();
        if (AbstractC166987dD.A1a(SVH.A09.A02()) && A07(context)) {
            final RGY rgy = new RGY(context);
            final zzbw zzbwVar = new zzbw();
            zzbwVar.A00 = str;
            C62947SYp A002 = SWk.A00();
            A002.A03 = new Feature[]{SA5.A0C};
            A002.A01 = new InterfaceC65406Tjd() { // from class: X.T5N
                @Override // X.InterfaceC65406Tjd
                public final void accept(Object obj, Object obj2) {
                    zza zzaVar = (zza) ((BaseGmsClient) obj).A03();
                    zzx zzxVar = new zzx((C58411Pup) obj2);
                    zzbw zzbwVar2 = zzbwVar;
                    int A03 = C0f9.A03(-1783021223);
                    Parcel A003 = zzaVar.A00();
                    AbstractC58321PtD.A19(zzxVar, A003);
                    C63095Scv.A00(A003, zzbwVar2);
                    zzaVar.A02(A003, 2);
                    C0f9.A0A(1505747303, A03);
                }
            };
            try {
                A01(C62947SYp.A00(rgy, A002, 1513, 1), "clear token");
                return;
            } catch (Rk3 e) {
                A01.A00("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", "clear token", android.util.Log.getStackTraceString(e));
            }
        }
        ComponentName componentName = A00;
        ServiceConnectionC63441SkK serviceConnectionC63441SkK = new ServiceConnectionC63441SkK();
        C61m A003 = C61m.A00(context);
        try {
            try {
                if (A003.A03(serviceConnectionC63441SkK, new C64F(componentName), "GoogleAuthUtil")) {
                    try {
                        C3U5.A05("BlockingServiceConnection.getService() called on main thread");
                        if (!serviceConnectionC63441SkK.A00) {
                            serviceConnectionC63441SkK.A00 = true;
                            zzd zzdVar = (zzd) zze.A00((IBinder) serviceConnectionC63441SkK.A01.take());
                            int A03 = C0f9.A03(-563278640);
                            Parcel A004 = zzdVar.A00();
                            A004.writeString(str);
                            C63095Scv.A00(A004, A0b);
                            Parcel A012 = zzdVar.A01(A004, 2);
                            Parcelable.Creator creator = Bundle.CREATOR;
                            if (A012.readInt() == 0) {
                                parcelable = null;
                            } else {
                                parcelable = (Parcelable) creator.createFromParcel(A012);
                            }
                            Bundle bundle = (Bundle) parcelable;
                            A012.recycle();
                            C0f9.A0A(-1304510792, A03);
                            if (bundle != null) {
                                String string = bundle.getString("Error");
                                if (bundle.getBoolean("booleanResult")) {
                                    return;
                                } else {
                                    throw new Exception(string);
                                }
                            }
                            A01.A00("Service call returned null.", AbstractC58318PtA.A1b());
                            throw MSW.A0y("Service unavailable.");
                        }
                        throw AbstractC166987dD.A14("Cannot call get on this connection more than once");
                    } catch (RemoteException | InterruptedException | TimeoutException e2) {
                        throw new IOException("Error on service connection.", e2);
                    }
                }
                throw MSW.A0y("Could not bind to service.");
            } finally {
                A003.A01(componentName, serviceConnectionC63441SkK);
            }
        } catch (SecurityException e3) {
            android.util.Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", AbstractC58319PtB.A1Z(e3)));
            throw new IOException("SecurityException while binding to Auth service.", e3);
        }
    }

    public static boolean A07(Context context) {
        if (GoogleApiAvailability.A00.A03(context, 17895000) == 0) {
            C64242T5r.A01.A00.FFc();
            InterfaceC65689TsB interfaceC65689TsB = ((RLP) SVH.A04.A02()).zzd;
            String str = ((PackageItemInfo) context.getApplicationInfo()).packageName;
            Iterator it = interfaceC65689TsB.iterator();
            while (it.hasNext()) {
                if (AbstractC166987dD.A1B(it).equals(str)) {
                }
            }
            return true;
        }
        return false;
    }

    public static String A02(final Account account, Context context, final String str) {
        ComponentName componentName;
        ServiceConnectionC63441SkK serviceConnectionC63441SkK;
        C61m A002;
        Parcelable parcelable;
        TokenData A003;
        Bundle bundle;
        Bundle A0b = AbstractC166987dD.A0b();
        A03(account);
        C3U5.A05("Calling this from your main thread can lead to deadlock");
        C3U5.A06(str, "Scope cannot be empty or null.");
        A03(account);
        A04(context);
        final Bundle bundle2 = new Bundle(A0b);
        A05(context, bundle2);
        AbstractC63298Sgz.A00(context);
        C64242T5r.A01.A00.FFc();
        try {
            try {
                if (AbstractC166987dD.A1a(SVH.A09.A02()) && A07(context)) {
                    final RGY rgy = new RGY(context);
                    C3U5.A03(account, "Account name cannot be null!");
                    C3U5.A06(str, "Scope cannot be null!");
                    C62947SYp A004 = SWk.A00();
                    A004.A03 = new Feature[]{SA5.A0C};
                    A004.A01 = new InterfaceC65406Tjd() { // from class: X.T5Q
                        @Override // X.InterfaceC65406Tjd
                        public final void accept(Object obj, Object obj2) {
                            zza zzaVar = (zza) ((BaseGmsClient) obj).A03();
                            zzw zzwVar = new zzw((C58411Pup) obj2);
                            Account account2 = account;
                            String str2 = str;
                            Bundle bundle3 = bundle2;
                            int A03 = C0f9.A03(1258638941);
                            Parcel A005 = zzaVar.A00();
                            AbstractC58321PtD.A19(zzwVar, A005);
                            C63095Scv.A00(A005, account2);
                            A005.writeString(str2);
                            C63095Scv.A00(A005, bundle3);
                            zzaVar.A02(A005, 1);
                            C0f9.A0A(1270717686, A03);
                        }
                    };
                    try {
                        bundle = (Bundle) A01(C62947SYp.A00(rgy, A004, 1512, 1), "token retrieval");
                    } catch (Rk3 e) {
                        A01.A00("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", "token retrieval", android.util.Log.getStackTraceString(e));
                    }
                    if (bundle != null) {
                        A003 = A00(context, bundle);
                        return A003.A01;
                    }
                    A01.A00("Service call returned null.", new Object[0]);
                    throw MSW.A0y("Service unavailable.");
                }
                if (A002.A03(serviceConnectionC63441SkK, new C64F(componentName), "GoogleAuthUtil")) {
                    try {
                        C3U5.A05("BlockingServiceConnection.getService() called on main thread");
                        if (!serviceConnectionC63441SkK.A00) {
                            serviceConnectionC63441SkK.A00 = true;
                            zzd zzdVar = (zzd) zze.A00((IBinder) serviceConnectionC63441SkK.A01.take());
                            int A03 = C0f9.A03(1500115526);
                            Parcel A005 = zzdVar.A00();
                            C63095Scv.A00(A005, account);
                            A005.writeString(str);
                            C63095Scv.A00(A005, bundle2);
                            Parcel A012 = zzdVar.A01(A005, 5);
                            Parcelable.Creator creator = Bundle.CREATOR;
                            if (A012.readInt() == 0) {
                                parcelable = null;
                            } else {
                                parcelable = (Parcelable) creator.createFromParcel(A012);
                            }
                            Bundle bundle3 = (Bundle) parcelable;
                            A012.recycle();
                            C0f9.A0A(-1545798608, A03);
                            if (bundle3 != null) {
                                A003 = A00(context, bundle3);
                                return A003.A01;
                            }
                            throw MSW.A0y("Service call returned null");
                        }
                        throw AbstractC166987dD.A14("Cannot call get on this connection more than once");
                    } catch (RemoteException | InterruptedException | TimeoutException e2) {
                        throw new IOException("Error on service connection.", e2);
                    }
                }
                throw MSW.A0y("Could not bind to service.");
            } finally {
                A002.A01(componentName, serviceConnectionC63441SkK);
            }
        } catch (SecurityException e3) {
            android.util.Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", AbstractC58319PtB.A1Z(e3)));
            throw new IOException("SecurityException while binding to Auth service.", e3);
        }
        componentName = A00;
        serviceConnectionC63441SkK = new ServiceConnectionC63441SkK();
        A002 = C61m.A00(context);
    }

    public static void A04(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            boolean z = GooglePlayServicesUtil.A00;
            GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.A00;
            int A03 = googleApiAvailabilityLight.A03(applicationContext, 8400000);
            if (A03 != 0) {
                Intent A04 = googleApiAvailabilityLight.A04(applicationContext, "e", A03);
                android.util.Log.e("GooglePlayServicesUtil", AnonymousClass001.A0O("GooglePlayServices not available due to error ", A03));
                if (A04 == null) {
                    throw new Exception();
                }
            }
        } catch (RG7 e) {
            throw new UserRecoverableAuthException(null, new Intent(((Rk2) e).A00), EnumC61073Ren.LEGACY, e.getMessage());
        } catch (C61256Rju | GooglePlayServicesIncorrectManifestValueException e2) {
            throw new Exception(e2.getMessage(), e2);
        }
    }

    public static void A05(Context context, Bundle bundle) {
        String str = ((PackageItemInfo) context.getApplicationInfo()).packageName;
        bundle.putString("clientPackageName", str);
        if (TextUtils.isEmpty(bundle.getString("androidPackageName"))) {
            bundle.putString("androidPackageName", str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }
}
