package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.8MB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8MB {
    public static final C8MC A04;
    public static final String A05;
    public final AnonymousClass249 A00;
    public final UserSession A01;
    public final C1810281e A02;
    public final List A03;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.8MC, java.lang.Object] */
    static {
        ?? obj = new Object();
        A04 = obj;
        A05 = obj.getClass().getSimpleName();
    }

    public final void A00(int i) {
        int i2;
        C1810281e c1810281e = this.A02;
        if (c1810281e.A00.first != EnumC1810381f.A02) {
            StringBuilder sb = new StringBuilder();
            sb.append(A05);
            sb.append('_');
            sb.append(this.A00);
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Post-capture color filters being used in ");
            sb2.append(c1810281e.A00.first);
            AbstractC12120kG.A07(obj, sb2.toString(), null);
        }
        C22C A01 = AnonymousClass229.A01(this.A01);
        Number number = (Number) AbstractC001800i.A0O(this.A03, i);
        if (number != null) {
            i2 = number.intValue();
        } else {
            i2 = 0;
        }
        A01.A1B(this.A00, EnumC50631MWs.A0I, i2, i);
    }

    public C8MB(AnonymousClass249 anonymousClass249, UserSession userSession, C1810281e c1810281e, List list) {
        this.A01 = userSession;
        this.A03 = list;
        this.A02 = c1810281e;
        this.A00 = anonymousClass249;
    }
}
