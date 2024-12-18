package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class G44 implements C7Q8 {
    public final /* synthetic */ FOg A00;

    public G44(FOg fOg) {
        this.A00 = fOg;
    }

    @Override // X.C7Q8
    public final /* bridge */ /* synthetic */ boolean DBb(Object obj, Object obj2) {
        String str;
        G49 g49 = (G49) obj;
        InterfaceC165017Zq interfaceC165017Zq = this.A00.A0G;
        MessageIdentifier messageIdentifier = g49.A03;
        long micros = TimeUnit.MILLISECONDS.toMicros(g49.A00);
        C2EY c2ey = g49.A02;
        boolean z = g49.A06;
        List list = g49.A04;
        if (list != null) {
            str = (String) AbstractC001800i.A0J(list);
        } else {
            str = null;
        }
        interfaceC165017Zq.DT8(c2ey, messageIdentifier, "double_tap", str, null, micros, z);
        return true;
    }
}
