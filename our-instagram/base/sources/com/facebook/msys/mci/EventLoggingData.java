package com.facebook.msys.mci;

import X.AbstractC124695ka;
import X.C124705kb;
import X.C53882dS;

/* loaded from: classes.dex */
public class EventLoggingData {
    public final long mEventId;
    public final String mEventName;
    public final boolean mLocal;
    public final int mLogMode;
    public final C124705kb[] mParams;
    public final PrivacyContext mPrivacyContext;

    static {
        C53882dS.A00();
    }

    public EventLoggingData(PrivacyContext privacyContext, String str, long j, int i, boolean z, Object[] objArr) {
        int length = objArr.length;
        AbstractC124695ka.A00(length % 4 == 0);
        int i2 = length / 4;
        this.mPrivacyContext = privacyContext;
        this.mEventName = str;
        this.mEventId = j;
        this.mLogMode = i;
        this.mLocal = z;
        C124705kb[] c124705kbArr = new C124705kb[i2];
        this.mParams = c124705kbArr;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * 4;
            c124705kbArr[i3] = new C124705kb(objArr[i4 + 3], ((Number) objArr[i4 + 2]).byteValue(), ((Number) objArr[i4]).intValue(), ((Number) objArr[i4 + 1]).longValue());
        }
    }
}
