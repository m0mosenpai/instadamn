package com.facebook.instagram.msys.secure;

import X.C09170dP;
import com.facebook.msys.mci.CQLResultSetImpl;

/* loaded from: classes4.dex */
public class ChildResultSetUtils {
    public static ChildResultSetUtils sInstance;

    public static native CQLResultSetImpl getInstagramSecureThreadListMessageAdditionalInfoFromInstagramSecureThreadListNative(CQLResultSetImpl cQLResultSetImpl, int i);

    public static native CQLResultSetImpl getInstagramSecureThreadListMessageTextListFromInstagramSecureThreadListNative(CQLResultSetImpl cQLResultSetImpl, int i);

    public static native CQLResultSetImpl getInstagramSecureThreadListParticipantListFromInstagramSecureThreadListNative(CQLResultSetImpl cQLResultSetImpl, int i);

    public static native CQLResultSetImpl getInstagramSecureThreadListReceiptStateListFromInstagramSecureThreadListNative(CQLResultSetImpl cQLResultSetImpl, int i);

    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.instagram.msys.secure.ChildResultSetUtils, java.lang.Object] */
    static {
        C09170dP.A0C("securethreadlistchildresultsetutils");
        sInstance = new Object();
    }
}
