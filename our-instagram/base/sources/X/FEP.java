package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class FEP {
    public static final Map A00;
    public static final Map A01;

    static {
        LinkedHashMap A06 = AbstractC06930Yk.A06(AbstractC166987dD.A1L("READ_PHONE_STATE", "android.permission.READ_PHONE_STATE"), AbstractC166987dD.A1L("READ_CALL_LOG", "android.permission.READ_CALL_LOG"), AbstractC166987dD.A1L("CALL_PHONE", "android.permission.CALL_PHONE"), AbstractC166987dD.A1L("READ_CONTACTS", "android.permission.READ_CONTACTS"), AbstractC166987dD.A1L("GET_ACCOUNTS", "android.permission.GET_ACCOUNTS"), AbstractC166987dD.A1L("READ_PHONE_NUMBERS", "android.permission.READ_PHONE_NUMBERS"), AbstractC166987dD.A1L("POST_NOTIFICATIONS", "android.permission.POST_NOTIFICATIONS"));
        A01 = A06;
        A00 = AbstractC06930Yk.A0C(A06, AbstractC166987dD.A1L("ANSWER_PHONE_CALLS", "android.permission.ANSWER_PHONE_CALLS"));
    }
}
