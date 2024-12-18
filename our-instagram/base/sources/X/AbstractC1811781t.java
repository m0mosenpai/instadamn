package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.81t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1811781t {
    public final Context A00;
    public final C1811981v A01;
    public final UserSession A02;
    public final C55U A03;
    public final Map A04 = new HashMap();
    public final boolean A05;

    public static final HashSet A00(AbstractC1811781t abstractC1811781t) {
        C81W c81w;
        java.util.Set of;
        HashSet hashSet = new HashSet();
        Map map = abstractC1811781t.A04;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (!((Boolean) entry.getValue()).booleanValue()) {
                hashSet.add(key);
            }
        }
        if (abstractC1811781t instanceof C1811681s) {
            of = new HashSet();
        } else {
            if (abstractC1811781t instanceof C1812081w) {
                of = EnumSet.of(C81W.A0b, C81W.A0W);
            } else {
                if (abstractC1811781t instanceof C1812281y) {
                    c81w = C81W.A09;
                } else {
                    c81w = C81W.A0D;
                }
                of = EnumSet.of(c81w);
            }
            C14360o3.A07(of);
        }
        for (Object obj : of) {
            if (!map.containsKey(obj) || !C14360o3.A0K(map.get(obj), true)) {
                hashSet.add(obj);
            }
        }
        return hashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r9.A02, 36327159807228230L) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ea, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r9.A02, 36327159807162693L) == false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC1811781t(android.content.Context r10, com.instagram.common.session.UserSession r11, X.C55U r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1811781t.<init>(android.content.Context, com.instagram.common.session.UserSession, X.55U, boolean):void");
    }
}
