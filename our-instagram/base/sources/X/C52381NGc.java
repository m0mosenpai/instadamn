package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;

/* renamed from: X.NGc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52381NGc extends AbstractRunnableC14200nk {
    public final /* synthetic */ PSV A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ String A02;

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        try {
            PSV psv = this.A00;
            C3MQ c3mq = psv.A00;
            UserSession userSession = c3mq.A00;
            InterfaceC60442pS interfaceC60442pS = c3mq.A03;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_media_screenshot");
            String str2 = this.A02;
            A0f.A9K("mediaid", AbstractC25228BEl.A13(str2.split("[_@]")[0]));
            Integer num = psv.A01;
            switch (num.intValue()) {
                case 1:
                    str = "reel";
                    break;
                case 2:
                    str = "clips";
                    break;
                default:
                    str = "feed";
                    break;
            }
            A0f.AAP("media_source", str);
            A0f.A9K("viewer_id", AbstractC25228BEl.A13(userSession.userId));
            A0f.AAP("ranking_info_token", psv.A02);
            AbstractC25233BEq.A17(A0f, "containermodule", interfaceC60442pS.getModuleName());
            C38321qM c38321qM = this.A01;
            if (c38321qM != null) {
                A0f.AAP(CacheBehaviorLogger.SOURCE, c38321qM.A0C.BJN());
                A0f.AAP("delivery_class", AbstractC86623ta.A00(c38321qM.A2P()));
                C3MS c3ms = c3mq.A04;
                O8Z o8z = new O8Z(c3ms.A00);
                if (c38321qM.A5T()) {
                    if (C18U.A06(C06090Tz.A05, ((C3BN) o8z.A01.getValue()).A00, 2342171564885425796L)) {
                        ((C27966CUm) c3ms.A03.getValue()).A00(c38321qM, "screenshot", null);
                    }
                }
            }
            Integer A00 = C4q7.A00(str2);
            if (A00 != null) {
                A0f.A9K("client_position", Long.valueOf(A00.longValue()));
            }
            Long A01 = C4q7.A01(str2);
            if (A01 != null) {
                A0f.A8I(AbstractC111324zv.A00(5584), Double.valueOf(A01.doubleValue()));
            }
            A0f.Cht();
            C38321qM A02 = C1DW.A00(userSession).A02(c3mq.A01.getMediaId());
            if (A02 != null && A02.A2E(userSession) != null && EnumC76383bi.A07.equals(A02.A1x())) {
                C99694dm A002 = AbstractC99684dl.A00(userSession);
                long parseLong = Long.parseLong(A02.A2E(userSession).getId());
                String id = A02.getId();
                id.getClass();
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(A002.A00, "instagram_fan_club_story_screenshot_detected");
                AbstractC31171DnF.A1I(A0f2, "story_viewer");
                A0f2.A9K("creator_igid", Long.valueOf(parseLong));
                A0f2.AAk("media_ids", AbstractC166987dD.A1J(id));
                A0f2.Cht();
            }
            if (num.equals(C05F.A00)) {
                if (c38321qM != null && c38321qM.CdW()) {
                    return;
                }
                C24461Hp c24461Hp = c3mq.A02;
                if (C18U.A06(C06090Tz.A05, c24461Hp.A00, 36317083814204197L) && !AbstractC001900j.A0T(str2)) {
                    c24461Hp.A05.add(str2);
                }
            }
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52381NGc(PSV psv, C38321qM c38321qM, String str) {
        super(1373352527, 5, false, false);
        this.A00 = psv;
        this.A02 = str;
        this.A01 = c38321qM;
    }
}
