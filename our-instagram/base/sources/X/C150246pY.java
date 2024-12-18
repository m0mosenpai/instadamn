package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6pY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150246pY {
    public final UserSession A00;

    public C150246pY(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final Object A00(C51758Mth c51758Mth, EnumC143276dS enumC143276dS, EnumC143286dT enumC143286dT, Integer num, Integer num2, Integer num3, String str, String str2, InterfaceC23621Ds interfaceC23621Ds) {
        boolean z;
        String A0D;
        String A0R;
        UserSession userSession = this.A00;
        C14360o3.A0B(enumC143286dT, 1);
        C14360o3.A0B(enumC143276dS, 2);
        C149736oQ c149736oQ = EnumC143276dS.A01;
        if (c51758Mth != null) {
            z = c51758Mth.A01;
        } else {
            z = false;
        }
        String A00 = c149736oQ.A00(enumC143276dS, enumC143286dT, userSession, z);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A07 = num;
        C14360o3.A0B(A00, 2);
        if (num == C05F.A00) {
            A0R = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("creatives/sticker_pack//");
            sb.append(userSession.userId);
            sb.append('/');
            if (num3 == null) {
                sb.append(A00);
            } else {
                sb.append(A00);
                sb.append('/');
                sb.append(num3);
            }
            String obj = sb.toString();
            if (str2 == null) {
                A0D = "";
            } else {
                A0D = AnonymousClass001.A0D(str2, '/');
            }
            A0R = AnonymousClass001.A0R(obj, A0D);
        }
        c25621Ms.A0A = A0R;
        c25621Ms.A0B("creatives/sticker_pack/");
        c25621Ms.A9s("sticker_pack_id", A00);
        c25621Ms.A9s("surface", enumC143286dT.A00);
        c25621Ms.A0P(null, K8S.class, C47876LCw.class, false);
        if (num3 != null) {
            c25621Ms.A0D("page_size", num3.intValue());
        }
        if (num2 != null) {
            c25621Ms.A0D("item_cursor", num2.intValue());
        }
        if (c51758Mth != null && c51758Mth.A01) {
            c25621Ms.A9s("user_ids", c51758Mth.A00.toString());
        }
        if (str != null) {
            c25621Ms.A9s("avatar_owner_id", str);
        }
        return c25621Ms.A0N().A02(interfaceC23621Ds, -5, 3, false);
    }
}
