package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Swx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63971Swx implements CallerContextable {
    public static final CallerContext A06 = CallerContext.A00(C63971Swx.class);
    public static final String __redex_internal_original_name = "IGAutofillProvider";
    public Bundle A00;
    public SYP A01;
    public UserSession A02;
    public HashMap A03;
    public List A04;
    public boolean A05;

    public static void A00(C63971Swx c63971Swx, String str, String str2) {
        HashMap hashMap = c63971Swx.A03;
        if (hashMap.get(str) == null) {
            hashMap.put(str, AbstractC166987dD.A1E());
        }
        Object obj = hashMap.get(str);
        obj.getClass();
        ((List) obj).add(str2);
    }
}
