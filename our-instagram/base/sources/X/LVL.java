package X;

import com.facebook.msys.mca.MailboxFeature;
import java.util.Map;

/* loaded from: classes8.dex */
public final class LVL implements InterfaceC124965l1 {
    public final /* synthetic */ LUE A00;
    public final /* synthetic */ String A01;

    public LVL(LUE lue, String str) {
        this.A00 = lue;
        this.A01 = str;
    }

    @Override // X.InterfaceC124965l1
    public final void Dh3(Map map) {
        map.getClass();
        this.A00.A03.setResult(MailboxFeature.getNonNullNotificationValue(C133255zr.A00, map, this.A01, 3));
    }
}
