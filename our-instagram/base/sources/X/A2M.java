package X;

import com.facebook.graphql.enums.EnumHelper;
import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public abstract class A2M {
    public static final void A00(C82G c82g, UserSession userSession, CXPNoticeStateRepository cXPNoticeStateRepository, OMW omw) {
        AbstractC167017dG.A1P(cXPNoticeStateRepository, c82g);
        String A03 = omw.A03();
        EnumC46582Bw enumC46582Bw = EnumC46582Bw.A0Z;
        EnumC46582Bw enumC46582Bw2 = (EnumC46582Bw) EnumHelper.A00(A03, enumC46582Bw);
        C14360o3.A07(enumC46582Bw2);
        C9B9 A00 = cXPNoticeStateRepository.A00(enumC46582Bw2);
        cXPNoticeStateRepository.A02.A01(new C9B9(false, A00.A00 + 1, A00.A01, (int) TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()), 0), enumC46582Bw2);
        C9B9 A02 = omw.A02(userSession, cXPNoticeStateRepository);
        EnumC46582Bw enumC46582Bw3 = (EnumC46582Bw) EnumHelper.A00(A03, enumC46582Bw);
        C14360o3.A07(enumC46582Bw3);
        cXPNoticeStateRepository.A03(A02, enumC46582Bw3);
    }
}
