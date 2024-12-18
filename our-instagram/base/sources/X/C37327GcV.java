package X;

import com.instagram.common.session.UserSession;
import com.instagram.feed.media.flashmedia.FlashMediaCacheImpl;
import com.instagram.feed.media.flashmedia.FlashMediaRepository;

/* renamed from: X.GcV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37327GcV {
    public static final /* synthetic */ C37327GcV A00 = new Object();

    public static final InterfaceC43545JLf A00(UserSession userSession, EnumC37328GcW enumC37328GcW) {
        Class cls;
        int i;
        C14360o3.A0B(userSession, 0);
        if (enumC37328GcW == EnumC37328GcW.A04) {
            cls = FlashMediaRepository.class;
            i = 10;
        } else {
            cls = FlashMediaCacheImpl.class;
            i = 11;
        }
        return (InterfaceC43545JLf) userSession.A01(cls, new J7S(userSession, i));
    }
}
