package com.facebook.featurelimits.mca;

import X.C09170dP;
import java.util.List;

/* loaded from: classes4.dex */
public class MailboxFeatureLimitsJNI {
    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native List getHeaderFields();

    static {
        C09170dP.A0C("mailboxfeaturelimitsjni");
    }
}
