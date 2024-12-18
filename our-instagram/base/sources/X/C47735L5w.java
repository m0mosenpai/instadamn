package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.L5w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47735L5w {
    public final /* synthetic */ C47409Kwy A00;

    public C47735L5w(C47409Kwy c47409Kwy) {
        this.A00 = c47409Kwy;
    }

    public final void A00(LLZ llz, String str) {
        List list;
        boolean z;
        Map map;
        int A0K;
        String str2 = llz.A0L;
        C14360o3.A06(str2);
        String str3 = llz.A0D;
        String str4 = llz.A0E;
        String str5 = llz.A0C;
        String str6 = llz.A09;
        List list2 = llz.A0G;
        if (list2 != null) {
            list = Collections.unmodifiableList(list2);
        } else {
            list = null;
        }
        String str7 = llz.A0B;
        byte[] bArr = llz.A0H;
        byte[] bArr2 = llz.A0I;
        Integer valueOf = Integer.valueOf(llz.A05);
        Integer valueOf2 = Integer.valueOf(llz.A04);
        Integer valueOf3 = Integer.valueOf(llz.A03);
        Integer valueOf4 = Integer.valueOf(llz.A02);
        if (str4 == null && str3 == null && bArr == null && bArr2 == null) {
            z = false;
        } else {
            z = true;
            if (str7 != null) {
                C14360o3.A0B("/image/", 1);
            }
            LHs.A00(str);
        }
        C47954LGp c47954LGp = this.A00.A00;
        C44999Jvp c44999Jvp = null;
        if (z) {
            byte[] bArr3 = bArr2;
            if (bArr2 == null) {
                bArr3 = bArr;
                if (bArr == null) {
                    if (str4 != null && str3 != null) {
                        c44999Jvp = new C44999Jvp(str2, str4, str3, str5, str6, list, C47954LGp.A06, 1, 1);
                        c47954LGp.A00.put(c44999Jvp.A03, c44999Jvp);
                    }
                }
            }
            if (bArr3.equals(bArr2)) {
                A0K = AbstractC167017dG.A0K(valueOf4);
            } else if (bArr3.equals(bArr)) {
                A0K = AbstractC167017dG.A0K(valueOf2);
                valueOf3 = valueOf;
            }
            int A06 = AbstractC25227BEk.A06(valueOf3, 0);
            if (A0K != 0 && A06 != 0) {
                c44999Jvp = new C44999Jvp(str2, str4, str3, str5, str6, list, bArr3, A0K, A06);
                c47954LGp.A00.put(c44999Jvp.A03, c44999Jvp);
            }
        }
        c47954LGp.A01.accept(C0eB.A00);
        UserSession userSession = c47954LGp.A02;
        if (!C18U.A06(C06090Tz.A05, userSession, 2342156760134650096L)) {
            C51u c51u = (C51u) c47954LGp.A03.remove(str);
            if (c51u == null) {
                c51u = C47954LGp.A05;
            }
            String str8 = (String) c51u.A00;
            C3o9 c3o9 = (C3o9) c51u.A01;
            InterfaceC83713oG interfaceC83713oG = (InterfaceC83713oG) c51u.A02;
            if (str8.length() > 0 && c3o9 != null && interfaceC83713oG != null) {
                Ld6 A00 = AbstractC46920Kp1.A00(userSession);
                MsysThreadId A03 = JRE.A03(c3o9);
                C14360o3.A0B(A03, 0);
                long j = A03.A00;
                Map map2 = A00.A02;
                Long valueOf5 = Long.valueOf(j);
                if (map2.containsKey(valueOf5) && (map = (Map) map2.get(valueOf5)) != null) {
                    map.remove(str8);
                    map2.put(valueOf5, map);
                }
                LLU.A06(userSession, c44999Jvp, interfaceC83713oG, str);
            }
        }
    }
}
