package X;

import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* renamed from: X.3Rr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73653Rr implements InterfaceC73623Ro {
    public final C0JM A00;

    public C73653Rr(C0JM c0jm) {
        C14360o3.A0B(c0jm, 1);
        this.A00 = c0jm;
    }

    @Override // X.InterfaceC73623Ro
    public final C3SN ATr(OdinContext odinContext) {
        long now = (this.A00.now() / 1000) * 1000;
        C3R9[] c3r9Arr = FeatureData.A0E;
        Type type = Type.A09;
        Date date = new Date(now);
        Calendar calendar = Calendar.getInstance();
        C14360o3.A07(calendar);
        calendar.setTime(date);
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        calendar.clear();
        calendar.set(i, i2, i3);
        Date time = calendar.getTime();
        C14360o3.A07(time);
        List singletonList = Collections.singletonList(new FeatureData(type, "2620", null, null, 0.0d, 16376, now - time.getTime()));
        C14360o3.A07(singletonList);
        return new C3SN(singletonList, null, true);
    }

    @Override // X.InterfaceC73623Ro
    public final String getId() {
        return "DateTime";
    }
}
