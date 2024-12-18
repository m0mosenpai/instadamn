package com.google.android.gms.auth;

import X.C61255Rjt;
import X.EnumC61073Ren;
import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes10.dex */
public class UserRecoverableAuthException extends C61255Rjt {
    public final PendingIntent A00;
    public final Intent A01;
    public final EnumC61073Ren A02;

    public final Intent A00() {
        String str;
        Intent intent = this.A01;
        if (intent == null) {
            int ordinal = this.A02.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        str = "this instantiation of UserRecoverableAuthException doesn't support an Intent.";
                    } else {
                        return null;
                    }
                } else {
                    str = "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.";
                }
                Log.e("Auth", str);
                return null;
            }
            Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
            return null;
        }
        return new Intent(intent);
    }

    public UserRecoverableAuthException(PendingIntent pendingIntent, Intent intent, EnumC61073Ren enumC61073Ren, String str) {
        super(str);
        this.A00 = pendingIntent;
        this.A01 = intent;
        this.A02 = enumC61073Ren;
    }
}
