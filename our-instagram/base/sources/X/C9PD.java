package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.9PD, reason: invalid class name */
/* loaded from: classes4.dex */
public class C9PD extends ACE {
    public boolean A00;
    public final String A01;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (X.AbstractC001900j.A0a(r1, "earth_day", false) == false) goto L10;
     */
    @Override // X.ACE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A01() {
        /*
            r5 = this;
            boolean r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L33
            X.8jg r3 = r5.A02
            java.util.List r0 = r3.A08
            int r0 = r0.size()
            if (r0 > r4) goto L2e
            r2 = 0
            android.graphics.drawable.Drawable r1 = r3.A04()
            X.C14360o3.A07(r1)
            boolean r0 = r1 instanceof X.C202588xc
            if (r0 == 0) goto L2a
            X.8xc r1 = (X.C202588xc) r1
            java.lang.String r1 = r1.A0O
            X.C14360o3.A07(r1)
            java.lang.String r0 = "earth_day"
            boolean r0 = X.AbstractC001900j.A0a(r1, r0, r2)
            if (r0 != 0) goto L2e
        L2a:
            boolean r0 = r3.A05
            if (r0 == 0) goto L33
        L2e:
            boolean r0 = r5.A00
            if (r0 != 0) goto L33
            return r4
        L33:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9PD.A01():boolean");
    }

    public C9PD(Context context, UserSession userSession, C194808jg c194808jg, String str) {
        super(context, userSession, c194808jg);
        this.A01 = str == null ? context.getResources().getString(2131974419) : str;
    }
}
