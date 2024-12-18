package com.google.android.gms.flags.impl;

import X.AbstractC58321PtD;
import X.AbstractC61537RpH;
import X.AbstractC62207S2c;
import X.C0f9;
import X.CallableC64784TTw;
import X.TUI;
import X.TUJ;
import X.TUK;
import X.TUL;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.flags.zzb;

/* loaded from: classes10.dex */
public class FlagProviderImpl extends zzb implements IInterface {
    public SharedPreferences A00;
    public boolean A01;

    public FlagProviderImpl(int i) {
        int A03 = C0f9.A03(579507904);
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
        C0f9.A0A(-948036037, A03);
        C0f9.A0A(908346635, C0f9.A03(2060808163));
    }

    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        Boolean bool;
        int A03 = C0f9.A03(-2070042418);
        if (!this.A01) {
            C0f9.A0A(1788763518, A03);
            return z;
        }
        SharedPreferences sharedPreferences = this.A00;
        Boolean valueOf = Boolean.valueOf(z);
        try {
            bool = (Boolean) AbstractC62207S2c.A00(new TUI(sharedPreferences, valueOf, str));
        } catch (Exception e) {
            Log.w("FlagDataUtils", AbstractC58321PtD.A0w("Flag value not available, returning default: ", e.getMessage()));
            bool = valueOf;
        }
        boolean booleanValue = bool.booleanValue();
        C0f9.A0A(1630667707, A03);
        return booleanValue;
    }

    public int getIntFlagValue(String str, int i, int i2) {
        Integer num;
        int A03 = C0f9.A03(2065136014);
        if (!this.A01) {
            C0f9.A0A(-697527951, A03);
            return i;
        }
        SharedPreferences sharedPreferences = this.A00;
        Integer valueOf = Integer.valueOf(i);
        try {
            num = (Integer) AbstractC62207S2c.A00(new TUJ(sharedPreferences, valueOf, str));
        } catch (Exception e) {
            Log.w("FlagDataUtils", AbstractC58321PtD.A0w("Flag value not available, returning default: ", e.getMessage()));
            num = valueOf;
        }
        int intValue = num.intValue();
        C0f9.A0A(716281568, A03);
        return intValue;
    }

    public long getLongFlagValue(String str, long j, int i) {
        Long l;
        int A03 = C0f9.A03(-2136135437);
        if (!this.A01) {
            C0f9.A0A(1634664166, A03);
            return j;
        }
        SharedPreferences sharedPreferences = this.A00;
        Long valueOf = Long.valueOf(j);
        try {
            l = (Long) AbstractC62207S2c.A00(new TUK(sharedPreferences, valueOf, str));
        } catch (Exception e) {
            Log.w("FlagDataUtils", AbstractC58321PtD.A0w("Flag value not available, returning default: ", e.getMessage()));
            l = valueOf;
        }
        long longValue = l.longValue();
        C0f9.A0A(-2105866292, A03);
        return longValue;
    }

    public String getStringFlagValue(String str, String str2, int i) {
        String str3;
        int A03 = C0f9.A03(-1939083101);
        if (!this.A01) {
            C0f9.A0A(440927957, A03);
            return str2;
        }
        try {
            str3 = (String) AbstractC62207S2c.A00(new TUL(this.A00, str, str2));
        } catch (Exception e) {
            Log.w("FlagDataUtils", AbstractC58321PtD.A0w("Flag value not available, returning default: ", e.getMessage()));
            str3 = str2;
        }
        C0f9.A0A(-1556420234, A03);
        return str3;
    }

    public void init(IObjectWrapper iObjectWrapper) {
        int i;
        SharedPreferences sharedPreferences;
        int A03 = C0f9.A03(-1400581887);
        Context context = (Context) ObjectWrapper.A00(iObjectWrapper);
        if (this.A01) {
            i = 1138904607;
        } else {
            try {
                Context createPackageContext = context.createPackageContext("com.google.android.gms", 0);
                synchronized (SharedPreferences.class) {
                    sharedPreferences = AbstractC61537RpH.A00;
                    if (sharedPreferences == null) {
                        sharedPreferences = (SharedPreferences) AbstractC62207S2c.A00(new CallableC64784TTw(createPackageContext));
                        AbstractC61537RpH.A00 = sharedPreferences;
                    }
                }
                this.A00 = sharedPreferences;
                this.A01 = true;
                i = -752775161;
            } catch (PackageManager.NameNotFoundException unused) {
                C0f9.A0A(190901158, A03);
                return;
            } catch (Exception e) {
                Log.w("FlagProviderImpl", AbstractC58321PtD.A0w("Could not retrieve sdk flags, continuing with defaults: ", e.getMessage()));
                i = -537315490;
            }
        }
        C0f9.A0A(i, A03);
    }

    public FlagProviderImpl() {
        this(0);
        int A03 = C0f9.A03(-1741199633);
        this.A01 = false;
        C0f9.A0A(-1023645763, A03);
    }
}
