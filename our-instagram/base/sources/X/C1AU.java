package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Deprecated;

/* renamed from: X.1AU, reason: invalid class name */
/* loaded from: classes.dex */
public class C1AU implements InterfaceC13050lr {
    public static final C1AT A02 = new Object();
    public final C12N A00;
    public final UserSession A01;

    public C1AU(C12N c12n, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c12n, 2);
        this.A01 = userSession;
        this.A00 = c12n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (r4 != 5) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C17320tT A01(X.C1AV r9, java.lang.String r10) {
        /*
            r8 = this;
            r3 = 0
            X.0sJ r0 = r9.A01
            com.instagram.common.session.UserSession r2 = r8.A01
            java.lang.Object r1 = r0.invoke(r2)
            X.0xt r0 = X.EnumC19660xt.A02
            if (r1 == r0) goto L72
            java.lang.String r1 = r9.A00(r2)
            android.content.Context r0 = X.AbstractC12290kX.A00
            android.content.SharedPreferences r6 = r0.getSharedPreferences(r1, r3)
            X.C14360o3.A07(r6)
            r0 = 36321181213009081(0x8109ec000624b9, double:3.032999480539997E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r7 = X.C20150ym.A07(r0)
            r0 = 36602656189846238(0x8209ec000812de, double:3.2110053893005726E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            long r0 = X.C20150ym.A01(r0)
            int r4 = (int) r0
            r5 = 5
            r3 = 4
            r2 = 2
            r1 = 1
            r0 = 3
            if (r4 == r1) goto L70
            if (r4 == r2) goto L6e
            if (r4 == r0) goto L44
            if (r4 == r3) goto L6c
            if (r4 == r5) goto L45
        L44:
            r5 = 3
        L45:
            r1 = 58
            java.lang.String r0 = r9.name()
            java.lang.String r0 = X.AnonymousClass001.A0T(r10, r0, r1)
            X.0tT r4 = new X.0tT
            r4.<init>(r6, r0)
            r4.A00 = r5
            if (r7 == 0) goto L6b
            X.0MT r3 = new X.0MT
            r3.<init>(r6)
            X.0nS r2 = X.C14120nc.A00()
            int r1 = r4.A00
            X.0tU r0 = new X.0tU
            r0.<init>(r1)
            r2.ATO(r0)
        L6b:
            return r4
        L6c:
            r5 = 4
            goto L45
        L6e:
            r5 = 2
            goto L45
        L70:
            r5 = 1
            goto L45
        L72:
            java.lang.String r1 = r9.name()
            java.lang.String r0 = " is running as DATASTORE - access only via getAsyncStore_EXPERIMENTAL"
            java.lang.String r1 = X.AnonymousClass001.A0R(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AU.A01(X.1AV, java.lang.String):X.0tT");
    }

    public InterfaceC100484fC A02(C1AV c1av, Class cls) {
        InterfaceC09390do A00;
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        InterfaceC16660sJ interfaceC16660sJ = c1av.A01;
        UserSession userSession = this.A01;
        int ordinal = ((EnumC19660xt) interfaceC16660sJ.invoke(userSession)).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                String A002 = c1av.A00(userSession);
                return AbstractC50543MSw.A00(context, null, A002, new C50361MLn(A002, 43));
            }
            throw new RuntimeException();
        }
        String A003 = c1av.A00(userSession);
        C9FL c9fl = new C9FL(1, c1av, cls, this);
        C14360o3.A0B(A003, 1);
        ConcurrentHashMap concurrentHashMap = AbstractC100464fA.A00;
        Object obj = concurrentHashMap.get(A003);
        if (obj == null && (obj = concurrentHashMap.putIfAbsent(A003, (A00 = AbstractC09440dt.A00(EnumC09460dv.A04, new C9EQ(c9fl, 11))))) == null) {
            obj = A00;
        }
        return (InterfaceC100484fC) ((InterfaceC09390do) obj).getValue();
    }

    public InterfaceC19630xq A04(C1AV c1av, Class cls) {
        C14360o3.A0B(c1av, 0);
        return A03(c1av);
    }

    @Deprecated(message = "Use get(fileType: UserSharedPreferencesFileType, sharedPreferenceClass: Class<*>?)")
    public InterfaceC19630xq A03(C1AV c1av) {
        return A01(c1av, "UserSharedPreferences");
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        if (z) {
            C1AV[] values = C1AV.values();
            ArrayList<C1AV> arrayList = new ArrayList();
            for (C1AV c1av : values) {
                if (c1av.A02) {
                    arrayList.add(c1av);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
            for (C1AV c1av2 : arrayList) {
                if (c1av2.A02) {
                    arrayList2.add(AbstractC23641Du.A04(AnonymousClass191.A00, new PZX(this, c1av2, (InterfaceC23621Ds) null, 22), AnonymousClass194.A02(this.A00.CPG(174, 3))));
                } else {
                    throw new IllegalStateException(AnonymousClass001.A0R(c1av2.name(), " is not DestroyOnLogout"));
                }
            }
        }
    }
}
