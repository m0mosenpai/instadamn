package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.birthdays.BirthdayPogsApi;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4Eh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92914Eh extends C4A7 {
    public long A00;
    public AnonymousClass195 A01;
    public final UserSession A02;
    public final BirthdayPogsApi A03;
    public final C23031Ai A04;
    public final C05A A05;
    public final C0UO A06;
    public static final C4Ei A08 = new Object();
    public static final long A07 = TimeUnit.DAYS.toMillis(1);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92914Eh(C23031Ai c23031Ai, UserSession userSession) {
        super("Direct", C4A8.A01(2012135052, 3));
        Object obj;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c23031Ai, 2);
        this.A02 = userSession;
        this.A04 = c23031Ai;
        this.A03 = new BirthdayPogsApi(userSession, AbstractC40691uc.A01(userSession));
        InterfaceC19630xq interfaceC19630xq = c23031Ai.A01;
        java.util.Set stringSet = interfaceC19630xq.getStringSet("birthday_user_ids", C16910sj.A00);
        if (stringSet != null) {
            obj = AbstractC001800i.A0X(stringSet);
        } else {
            obj = C16930sl.A00;
        }
        C008002u A00 = C10E.A00(obj);
        this.A05 = A00;
        this.A06 = AbstractC208910l.A02(A00);
        this.A00 = interfaceC19630xq.getLong("birthday_user_ids_last_updated_timestamp", 0L);
    }
}
