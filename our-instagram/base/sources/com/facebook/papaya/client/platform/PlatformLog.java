package com.facebook.papaya.client.platform;

import X.AnonymousClass001;
import X.C09170dP;
import com.facebook.common.stringformat.StringFormatUtil;

/* loaded from: classes10.dex */
public final class PlatformLog {
    public static PlatformLogHandlerImpl A00;

    static {
        C09170dP.A0C("papaya");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.facebook.papaya.client.platform.PlatformLogHandlerImpl] */
    public static synchronized void A00() {
        synchronized (PlatformLog.class) {
            if (A00 == null) {
                A00 = new Object();
            }
        }
    }

    public static void A01(Class cls, String str, Object... objArr) {
        A00();
        PlatformLogHandlerImpl.nativeLog(3, cls.getSimpleName(), AnonymousClass001.A0B(StringFormatUtil.formatStrLocaleSafe(str, objArr)));
    }

    public static void A02(Class cls, String str, Object... objArr) {
        A00();
        PlatformLogHandlerImpl.nativeLog(1, cls.getSimpleName(), AnonymousClass001.A0B(StringFormatUtil.formatStrLocaleSafe(str, objArr)));
    }
}
