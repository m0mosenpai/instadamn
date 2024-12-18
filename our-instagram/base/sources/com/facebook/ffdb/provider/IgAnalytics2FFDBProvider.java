package com.facebook.ffdb.provider;

import X.AbstractC11400iy;
import X.C09170dP;
import X.C14360o3;
import X.InterfaceC38631qu;
import android.content.Context;
import com.facebook.falco.fabric.FFSingletonJNILogger;
import java.io.IOException;

/* loaded from: classes.dex */
public final class IgAnalytics2FFDBProvider implements InterfaceC38631qu {
    public IgAnalytics2FFDBProvider(Context context) {
        C14360o3.A0B(context, 1);
        try {
            C09170dP.A06(context.getApplicationContext(), 0);
        } catch (IOException e) {
            throw new RuntimeException("SoLoader.init() failed", e);
        }
    }

    @Override // X.InterfaceC38631qu
    public final String B3y() {
        int length = AbstractC11400iy.A00().A00().length();
        String fFDBToken = FFSingletonJNILogger.getFFDBToken();
        if (length > 0) {
            if (!fFDBToken.equals(AbstractC11400iy.A00().A00())) {
                FFSingletonJNILogger.setFFDBToken(AbstractC11400iy.A00().A00());
            }
            return AbstractC11400iy.A00().A00();
        }
        C14360o3.A07(fFDBToken);
        return fFDBToken;
    }

    @Override // X.InterfaceC38631qu
    public final boolean BvS() {
        return FFSingletonJNILogger.shouldRequestDebugConfig();
    }

    @Override // X.InterfaceC38631qu
    public final void EU3(String str) {
        FFSingletonJNILogger.setFFDBToken(str);
        AbstractC11400iy.A00().A00.edit().putString("ffdb_token", str).apply();
    }

    @Override // X.InterfaceC38631qu
    public final void ET2(String str) {
        FFSingletonJNILogger.setDebugUserId(str);
    }

    @Override // X.InterfaceC38631qu
    public final void Ee3(boolean z) {
        FFSingletonJNILogger.setShouldRequestDebugConfig(z);
    }
}
