package com.facebook.cutoverinternal.mca;

import X.C09170dP;
import java.util.List;

/* loaded from: classes8.dex */
public class MailboxCutoverInternalJNI {
    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native List getHeaderFields();

    static {
        C09170dP.A0C("mailboxcutoverinternaljni");
    }
}
