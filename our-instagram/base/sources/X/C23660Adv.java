package X;

import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateApi;
import java.util.Map;

/* renamed from: X.Adv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23660Adv implements InterfaceC25601Mq {
    public final /* synthetic */ CXPNoticeStateApi A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ InterfaceC16660sJ A02;

    public C23660Adv(CXPNoticeStateApi cXPNoticeStateApi, Map map, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = cXPNoticeStateApi;
        this.A01 = map;
        this.A02 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC25601Mq
    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
        C14360o3.A0B(anonymousClass435, 0);
        this.A02.invoke(CXPNoticeStateApi.A02((C55P) anonymousClass435.A01, this.A01));
        return anonymousClass435;
    }
}
