package X;

import android.R;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2rd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61762rd implements InterfaceC61772re, InterfaceC61782rf {
    public final long A00;
    public final UserSession A01;
    public final Map A0B = new HashMap();
    public final Map A0H = new HashMap();
    public final Map A0I = new HashMap();
    public final Map A05 = new HashMap();
    public final Map A0K = new HashMap();
    public final Map A07 = new HashMap();
    public final Map A06 = new HashMap();
    public final Map A0L = new HashMap();
    public final Map A0F = new HashMap();
    public final Map A04 = new HashMap();
    public final Map A09 = new HashMap();
    public final Map A08 = new HashMap();
    public final Map A0A = new HashMap();
    public final Map A0E = new HashMap();
    public final Map A0C = new HashMap();
    public final Map A0G = new HashMap();
    public final Map A02 = new HashMap();
    public final Map A0D = new HashMap();
    public final Map A0J = new HashMap();
    public final Map A03 = new HashMap();

    public final C60R A01(C76403bk c76403bk) {
        C14360o3.A0B(c76403bk, 0);
        Map map = this.A0K;
        String id = c76403bk.getId();
        Object obj = map.get(id);
        if (obj == null) {
            obj = new C60R();
            map.put(id, obj);
        }
        return (C60R) obj;
    }

    @Override // X.InterfaceC61772re, X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        C84923qg A1V;
        C14360o3.A0B(c38321qM, 0);
        Map map = this.A0B;
        C75113Zb c75113Zb = (C75113Zb) map.get(c38321qM.getId());
        if (c75113Zb == null) {
            c75113Zb = new C75113Zb(c38321qM.A0p(), c38321qM.A4w());
            AnonymousClass341 anonymousClass341 = AnonymousClass341.A0H;
            C14360o3.A0B(anonymousClass341, 0);
            c75113Zb.A0o = anonymousClass341;
            UserSession userSession = this.A01;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36314433819052596L)) {
                c75113Zb.A37 = true;
            }
            if (AbstractC75343a1.A08(userSession, c38321qM) && (!C18U.A06(c06090Tz, userSession, 2342165869759113931L) || c38321qM.A1V() == null || ((A1V = c38321qM.A1V()) != null && !A1V.A0i))) {
                c75113Zb.A0N(EnumC75183Zl.A06);
            }
            map.put(c38321qM.getId(), c75113Zb);
        }
        return c75113Zb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r0.length() != 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C114385Ef A00(X.C47K r6) {
        /*
            r5 = this;
            java.util.Map r4 = r5.A0H
            java.lang.String r3 = r6.A0F
            if (r3 != 0) goto L8
            java.lang.String r3 = ""
        L8:
            java.lang.Object r2 = r4.get(r3)
            if (r2 != 0) goto L2a
            X.5Ef r2 = new X.5Ef
            r2.<init>()
            X.1XV r0 = r6.A05
            if (r0 != 0) goto L19
            X.1XV r0 = X.C1XV.A0v
        L19:
            int r0 = r0.ordinal()
            r1 = 1
            switch(r0) {
                case 2: goto L2d;
                case 3: goto L37;
                case 4: goto L37;
                case 5: goto L21;
                case 6: goto L21;
                case 7: goto L2d;
                case 8: goto L2d;
                case 9: goto L21;
                case 10: goto L37;
                default: goto L21;
            }
        L21:
            r2.A08 = r1
            boolean r0 = r6.A0S
            r2.A09 = r0
            r4.put(r3, r2)
        L2a:
            X.5Ef r2 = (X.C114385Ef) r2
            return r2
        L2d:
            java.lang.String r0 = r6.A0A
            if (r0 == 0) goto L37
            int r0 = r0.length()
            if (r0 != 0) goto L21
        L37:
            r1 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61762rd.A00(X.47K):X.5Ef");
    }

    public final C5IV A02(C101274gj c101274gj) {
        boolean z;
        Map map = this.A0L;
        String id = c101274gj.getId();
        C5IV c5iv = (C5IV) map.get(id);
        if (c5iv == null) {
            Boolean bool = c101274gj.A00.A02;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            C5IV c5iv2 = new C5IV(z);
            map.put(id, c5iv2);
            return c5iv2;
        }
        return c5iv;
    }

    public C61762rd(Context context, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = (long) (context.getResources().getInteger(R.integer.config_longAnimTime) * C18U.A00(C06090Tz.A05, userSession, 37154860146819076L));
    }
}
