package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.VQw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68440VQw {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C102884kP A0O = AbstractC65702TsY.A0O(c6fw);
        String str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        String A0E = A0O.A0E();
        if (A0E != null) {
            str = A0E;
        }
        Integer A00 = U63.A00(str);
        C14360o3.A07(A00);
        WGI.A04(C6BQ.A04(c6fq), new C68108VBr(A00), null);
        return null;
    }
}
