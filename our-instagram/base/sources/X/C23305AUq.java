package X;

import android.os.Bundle;
import com.facebook.iabeventlogging.model.IABEmptyEvent;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABUnifiedEvent;
import com.facebook.privacy.zone.policy.ZonePolicy;
import java.util.HashMap;

/* renamed from: X.AUq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23305AUq implements BCL {
    public static final Bundle A04 = AbstractC166987dD.A0b();
    public final C63305ShB A01;
    public final String A03;
    public final C0JM A02 = C03250Di.A00;
    public HashMap A00 = AbstractC166987dD.A1G();

    @Override // X.BCL
    public final void Chu(IABEvent iABEvent) {
        this.A01.A06(A04, iABEvent, ZonePolicy.A05);
    }

    @Override // X.BCL
    public final void Ci0(EnumC223219t5 enumC223219t5, Integer num) {
        long now = this.A02.now();
        String str = this.A03;
        IABEmptyEvent iABEmptyEvent = IABEvent.A04;
        C14360o3.A0B(num, 5);
        Chu(new IABUnifiedEvent(enumC223219t5, num, str, null, now, now));
    }

    public C23305AUq(C63305ShB c63305ShB, String str) {
        this.A01 = c63305ShB;
        this.A03 = str;
    }
}
