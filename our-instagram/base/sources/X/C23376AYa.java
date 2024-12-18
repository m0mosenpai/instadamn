package X;

import com.facebook.msys.mca.MailboxFeature;
import java.util.Map;

/* renamed from: X.AYa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23376AYa implements InterfaceC124965l1 {
    public final /* synthetic */ C91V A00;
    public final /* synthetic */ String A01;

    public C23376AYa(C91V c91v, String str) {
        this.A00 = c91v;
        this.A01 = str;
    }

    @Override // X.InterfaceC124965l1
    public final void Dh3(Map map) {
        map.getClass();
        this.A00.A00.setResult(MailboxFeature.getNonNullNotificationValue(C91S.A00, map, this.A01, 1));
    }
}
