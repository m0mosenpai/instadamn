package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Kak, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46086Kak extends C30P {
    public final UserSession A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46086Kak(UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        super(interfaceC60442pS, null);
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Zx, X.4So] */
    @Override // X.C30P
    public final /* bridge */ /* synthetic */ C95804So A05(Object obj) {
        String obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        String str;
        String str2;
        EnumC95784Sm valueOf;
        L56 l56 = (L56) obj;
        C14360o3.A0B(l56, 0);
        String str3 = l56.A07;
        ?? c0Zx = new C0Zx();
        C95824Sr c95824Sr = C4Sq.A00;
        c0Zx.A05("media_id", Long.valueOf(c95824Sr.A01(str3)));
        AbstractC43594JPz.A1A(EnumC95784Sm.NONE, c0Zx, this);
        c0Zx.A06("tracking_token", null);
        c0Zx.A06("author_id", null);
        c0Zx.A06("pre_processing_media_id", str3);
        Map map = l56.A08;
        if (map != null) {
            Object obj6 = map.get("m_pk");
            if (obj6 instanceof String) {
                obj2 = (String) obj6;
            } else {
                if (obj6 instanceof Number) {
                    obj2 = obj6.toString();
                }
                obj3 = map.get("a_i");
                if ((obj3 instanceof String) && (valueOf = EnumC95784Sm.valueOf((String) obj3)) != null) {
                    c0Zx.A01(valueOf, "tracking_type");
                }
                obj4 = map.get("tracking_token");
                if ((obj4 instanceof String) && (str2 = (String) obj4) != null) {
                    c0Zx.A06("tracking_token", str2);
                }
                obj5 = map.get("a_pk");
                if ((obj5 instanceof String) && (str = (String) obj5) != null) {
                    c0Zx.A06("author_id", str);
                }
            }
            if (obj2 != null) {
                c95824Sr.A01(obj2);
            }
            obj3 = map.get("a_i");
            if (obj3 instanceof String) {
                c0Zx.A01(valueOf, "tracking_type");
            }
            obj4 = map.get("tracking_token");
            if (obj4 instanceof String) {
                c0Zx.A06("tracking_token", str2);
            }
            obj5 = map.get("a_pk");
            if (obj5 instanceof String) {
                c0Zx.A06("author_id", str);
            }
        }
        return c0Zx;
    }

    @Override // X.C30P
    public final /* bridge */ /* synthetic */ C4SH A07(Object obj) {
        String obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        String str;
        String str2;
        EnumC95784Sm valueOf;
        L56 l56 = (L56) obj;
        C14360o3.A0B(l56, 0);
        String str3 = l56.A07;
        EnumC76383bi enumC76383bi = EnumC76383bi.A06;
        boolean z = false;
        String str4 = null;
        String str5 = str3;
        String str6 = this.A00.userId;
        C75363a3 c75363a3 = l56.A05;
        Map map = l56.A08;
        if (map != null) {
            Object obj6 = map.get("m_pk");
            if (obj6 instanceof String) {
                obj2 = (String) obj6;
            } else {
                if (obj6 instanceof Number) {
                    obj2 = obj6.toString();
                }
                obj3 = map.get("a_i");
                if ((obj3 instanceof String) && (valueOf = EnumC95784Sm.valueOf((String) obj3)) != null) {
                    z = AbstractC167007dF.A1X(valueOf, EnumC95784Sm.ORGANIC);
                }
                obj4 = map.get("tracking_token");
                if ((obj4 instanceof String) && (str2 = (String) obj4) != null) {
                    str4 = str2;
                }
                obj5 = map.get("a_pk");
                if ((obj5 instanceof String) && (str = (String) obj5) != null) {
                    str6 = str;
                }
            }
            if (obj2 != null) {
                str5 = obj2;
            }
            obj3 = map.get("a_i");
            if (obj3 instanceof String) {
                z = AbstractC167007dF.A1X(valueOf, EnumC95784Sm.ORGANIC);
            }
            obj4 = map.get("tracking_token");
            if (obj4 instanceof String) {
                str4 = str2;
            }
            obj5 = map.get("a_pk");
            if (obj5 instanceof String) {
                str6 = str;
            }
        }
        return new C4SH(enumC76383bi, null, null, c75363a3, null, str3, null, str5, str4, str6, null, null, null, null, null, null, null, null, null, null, null, 0L, false, z, false, false, false);
    }

    @Override // X.C30P
    public final Integer A08() {
        return C05F.A0u;
    }
}
