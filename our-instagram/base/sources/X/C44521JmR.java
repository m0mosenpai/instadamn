package X;

import com.instagram.appreciation.analytics.creator.CreatorLoggingData;
import com.instagram.common.session.UserSession;

/* renamed from: X.JmR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44521JmR extends AbstractC52922bZ {
    public final LLN A00;
    public final CreatorLoggingData A01;
    public final C43893Jb2 A02;
    public final C47702L4j A03;
    public final C104234ml A04;
    public final UserSession A05;
    public final InterfaceC19390xP A06;

    public final void A00(boolean z) {
        Integer num;
        LLN lln = this.A00;
        Integer num2 = C05F.A04;
        if (z) {
            num = C05F.A0u;
        } else {
            num = C05F.A09;
        }
        CreatorLoggingData creatorLoggingData = this.A01;
        lln.A07(Boolean.valueOf(creatorLoggingData.A01), Boolean.valueOf(creatorLoggingData.A02), null, null, num2, num, creatorLoggingData.A00, null, AbstractC06930Yk.A0E());
    }

    public C44521JmR(LLN lln, CreatorLoggingData creatorLoggingData, C43893Jb2 c43893Jb2, C47702L4j c47702L4j, C104234ml c104234ml, UserSession userSession) {
        AbstractC167017dG.A1R(lln, creatorLoggingData);
        C14360o3.A0B(c104234ml, 6);
        this.A03 = c47702L4j;
        this.A00 = lln;
        this.A01 = creatorLoggingData;
        this.A05 = userSession;
        this.A02 = c43893Jb2;
        this.A04 = c104234ml;
        this.A06 = new C43818JZg(3, c47702L4j.A06, this);
    }
}
