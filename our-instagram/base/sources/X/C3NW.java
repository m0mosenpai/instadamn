package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;

/* renamed from: X.3NW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3NW extends C0YY implements InterfaceC16600sD {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ Integer A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3NW(UserSession userSession, Integer num, int i, int i2, int i3, int i4) {
        super(4);
        this.A04 = userSession;
        this.A03 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
        this.A05 = num;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        String str;
        String str2 = (String) obj;
        String str3 = (String) obj2;
        int intValue = ((Number) obj3).intValue();
        int intValue2 = ((Number) obj4).intValue();
        C14360o3.A0B(str2, 0);
        C14360o3.A0B(str3, 1);
        C1ZX A00 = C1ZV.A00(this.A04).A00(C05F.A0Q, 817898837, 0, true);
        A00.A03(CacheBehaviorLogger.SOURCE, str2);
        A00.A03("destination", str3);
        A00.A01("repeated_count", intValue);
        A00.A01("avg_interval", intValue2);
        A00.A01("config_time_window", this.A03);
        A00.A01("config_repeat_count", this.A02);
        A00.A01("config_avg_interval", this.A00);
        A00.A01("config_max_interval", this.A01);
        switch (this.A05.intValue()) {
            case 0:
                str = NetInfoModule.CONNECTION_TYPE_NONE;
                break;
            case 1:
                i = 3124;
                str = AbstractC111324zv.A00(i);
                break;
            case 2:
                i = 2239;
                str = AbstractC111324zv.A00(i);
                break;
            default:
                i = 3123;
                str = AbstractC111324zv.A00(i);
                break;
        }
        A00.A03("config_detection_mode", str);
        A00.A03("nav_path", AnonymousClass001.A0g(str2, "->", str3));
        A00.A03("logview_group_by", "nav_path");
        A00.A00();
        return C0eB.A00;
    }
}
