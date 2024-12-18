package X;

import android.os.Bundle;
import com.facebook.iabeventlogging.model.IABEmptyEvent;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABUnifiedEvent;

/* loaded from: classes4.dex */
public abstract class A1A {
    public static final void A00(EnumC223219t5 enumC223219t5, String str) {
        C14360o3.A0B(str, 0);
        Bundle bundle = C23305AUq.A04;
        C23305AUq c23305AUq = new C23305AUq(C63305ShB.A00(), str);
        IABEmptyEvent iABEmptyEvent = IABEvent.A04;
        c23305AUq.Chu(new IABUnifiedEvent(enumC223219t5, C05F.A0C, str, null, System.currentTimeMillis(), System.currentTimeMillis()));
    }
}
