package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3qn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84993qn {
    public Integer A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final UserSession A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;

    public final boolean A00() {
        InterfaceC09390do interfaceC09390do = this.A07;
        if (((C23031Ai) interfaceC09390do.getValue()).A01.getBoolean("content_note_rec_nux_shown", false)) {
            this.A06.getValue();
            long currentTimeMillis = System.currentTimeMillis() - ((C23031Ai) interfaceC09390do.getValue()).A01.getLong("content_note_rec_nux_last_shown_timestamp", 0L);
            TimeUnit timeUnit = TimeUnit.MINUTES;
            UserSession userSession = this.A05;
            C14360o3.A0B(userSession, 0);
            if (currentTimeMillis > timeUnit.toMillis(C18U.A01(C06090Tz.A05, userSession, 36602093554438745L))) {
                return true;
            }
        }
        return false;
    }

    public C84993qn(UserSession userSession) {
        this.A05 = userSession;
        EnumC09460dv enumC09460dv = EnumC09460dv.A04;
        this.A07 = AbstractC09440dt.A00(enumC09460dv, new C9E0(this, 26));
        this.A06 = AbstractC09440dt.A00(enumC09460dv, C85003qo.A00);
        this.A00 = C05F.A00;
    }
}
