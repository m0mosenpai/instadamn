package com.instagram.debug.logdelegate;

import X.C0BZ;
import X.C0I3;
import X.C0w9;
import X.C14360o3;
import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class IgLogImpl extends C0BZ {
    public static final Companion Companion = new Object();
    public static final IgLogImpl sInstance = new Object();

    /* loaded from: classes.dex */
    public final class Companion {
        public final C0I3 getInstance() {
            return IgLogImpl.sInstance;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    @Override // X.C0BZ, X.C0I3
    public void wtf(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C0w9.A03(str, str2);
        Log.e(str, str2);
    }

    public static final C0I3 getInstance() {
        return sInstance;
    }

    @Override // X.C0BZ, X.C0I3
    public void wtf(String str, String str2, Throwable th) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(th, 2);
        C0w9.A06(str, str2, th);
        Log.e(str, str2, th);
    }
}
