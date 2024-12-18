package X;

import android.content.Context;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.78t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1583378t implements InterfaceC1582578k {
    public static final C1583378t A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (java.lang.Boolean.TRUE.equals(r53.A0c) == false) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C7QY A02(android.content.Context r48, com.instagram.common.session.UserSession r49, X.C7QL r50, X.AnonymousClass988 r51, X.C160787Im r52, X.C910143t r53, boolean r54) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1583378t.A02(android.content.Context, com.instagram.common.session.UserSession, X.7QL, X.988, X.7Im, X.43t, boolean):X.7QY");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C7QY A06(Context context, UserSession userSession, C7QL c7ql, AnonymousClass988 anonymousClass988, C1583678w c1583678w, C160787Im c160787Im, AnonymousClass442 anonymousClass442, C910143t c910143t, List list) {
        String str;
        String str2;
        C83403nh c83403nh = c160787Im.A0e;
        DirectMessageIdentifier directMessageIdentifier = new DirectMessageIdentifier(anonymousClass442.A0F, c83403nh.A0h(), c83403nh.A0g());
        boolean A04 = AbstractC158887Ba.A04(userSession, anonymousClass442);
        String str3 = anonymousClass442.A0U;
        C14360o3.A07(str3);
        User user = c160787Im.A0K;
        if (user != null) {
            str = user.getUsername();
        } else {
            str = null;
        }
        String A0i = c83403nh.A0i();
        C14360o3.A0C(A0i, "null cannot be cast to non-null type kotlin.String");
        String A0g = c83403nh.A0g();
        String str4 = anonymousClass442.A0T;
        if (str4 == null && (str4 = anonymousClass442.A0R) == null) {
            throw new IllegalStateException("message_id and client_context are both null");
        }
        String str5 = anonymousClass442.A0R;
        MessageIdentifier messageIdentifier = new MessageIdentifier(A0i, A0g);
        C7QV c7qv = new C7QV(null, null, "", "", null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        ArrayList A0s = c83403nh.A0s(C17060sy.A01.A01(userSession));
        C2EY c2ey = c83403nh.A10;
        C14360o3.A07(c2ey);
        boolean A0K = C14360o3.A0K(anonymousClass442.A0U, userSession.userId);
        MessageIdentifier messageIdentifier2 = new MessageIdentifier(str4, str5);
        C7P3 A03 = c160787Im.A03();
        C14360o3.A07(A03);
        C7QX c7qx = new C7QX(null, c7qv, A03, c2ey, messageIdentifier, messageIdentifier2, A0s, 0L, true, false, false, A0K, false);
        C7TT c7tt = c160787Im.A0G;
        InterfaceC83733oI interfaceC83733oI = c7tt.A0P;
        int i = c7tt.A08;
        String str6 = c83403nh.A1V;
        ImmutableList A01 = anonymousClass442.A01();
        boolean z = false;
        if (A01 != null && !A01.isEmpty() && (str2 = ((C910143t) A01.get(0)).A0w) != null && str2.startsWith("instagram://generated_sticker_action")) {
            z = true;
        }
        String str7 = AbstractC158887Ba.A02(anonymousClass442).A0u;
        boolean z2 = false;
        if (str7 != null) {
            C14360o3.A0B("cutout_", 1);
            z2 = str7.startsWith("cutout_");
        }
        return A04(context, null, c7qx, c7ql, anonymousClass988, c1583678w, c83403nh, c910143t, null, directMessageIdentifier, interfaceC83733oI, str3, str, str6, null, null, list, i, A04, true, z, z2, false, C78X.A01(userSession, c160787Im.A0G.A0G, c83403nh, c910143t), false, false);
    }

    @Override // X.InterfaceC1582578k
    public final C7QY AMI(Context context, UserSession userSession, C7QL c7ql, AnonymousClass988 anonymousClass988, C160787Im c160787Im) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c7ql, 2);
        C14360o3.A0B(anonymousClass988, 3);
        C14360o3.A0B(c160787Im, 4);
        C83403nh c83403nh = c160787Im.A0e;
        C14360o3.A07(c83403nh);
        return A02(context, userSession, c7ql, anonymousClass988, c160787Im, AbstractC158887Ba.A00(c83403nh), false);
    }

    private final C9CP A00(C9CP c9cp, InterfaceC83733oI interfaceC83733oI, int i, boolean z) {
        String A02;
        String str;
        C31200Dnj c31200Dnj;
        String str2 = c9cp.A04;
        String str3 = c9cp.A05;
        if (z) {
            A02 = c9cp.A02;
        } else {
            A02 = AbstractC1583478u.A02(interfaceC83733oI, i);
        }
        C51755Mte c51755Mte = (C51755Mte) c9cp.A01;
        if (c51755Mte != null && (c31200Dnj = (C31200Dnj) c51755Mte.A00) != null) {
            str = c31200Dnj.A00;
        } else {
            str = null;
        }
        String str4 = c9cp.A03;
        Integer num = (Integer) c9cp.A00;
        String str5 = c9cp.A02;
        return new C9CP(new C9CJ(AbstractC1583478u.A03(str5, DialogModule.KEY_TITLE), AbstractC1583478u.A03(str5, "collection_id"), AbstractC1583478u.A03(str5, "collection_type"), 2), num, str2, str3, A02, str, str4);
    }

    public static final C1583678w A01(C910143t c910143t, InterfaceC09390do interfaceC09390do) {
        String str = c910143t.A13;
        if ((str == null || str.length() == 0) && (!((Boolean) interfaceC09390do.getValue()).booleanValue() || c910143t.A02().isEmpty())) {
            return null;
        }
        List A02 = c910143t.A02();
        C14360o3.A07(A02);
        if (str == null) {
            str = "";
        }
        return new C1583678w(null, null, str, c910143t.A12, null, null, null, null, null, c910143t.A1R, A02);
    }

    public static final C7QY A03(Context context, UserSession userSession, C7QL c7ql, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C910143t c910143t, boolean z) {
        C158747Ak c158747Ak;
        String str;
        C14360o3.A0B(c910143t, 2);
        C83403nh c83403nh = c160787Im.A0e;
        C83553nw c83553nw = c910143t.A0O;
        if (c83553nw != null) {
            c158747Ak = LBz.A01(context, userSession, c160787Im, c7ql.A03, c83553nw, c83403nh.A2P, c160787Im.A0G.A0x, C14360o3.A0K(userSession.userId, c83403nh.BtE()), false);
        } else {
            c158747Ak = null;
        }
        DirectMessageIdentifier A0V = c83403nh.A0V();
        boolean A03 = AbstractC158887Ba.A03(userSession, c83403nh);
        String str2 = c83403nh.A1u;
        C14360o3.A07(str2);
        User user = c160787Im.A0K;
        if (user != null) {
            str = user.getUsername();
        } else {
            str = null;
        }
        C7QX A002 = C7QM.A00(context, userSession, anonymousClass988, c160787Im, c83403nh.A10);
        C7TT c7tt = c160787Im.A0G;
        InterfaceC83733oI interfaceC83733oI = c7tt.A0P;
        int i = c7tt.A08;
        return A04(context, c158747Ak, A002, c7ql, anonymousClass988, A01(c910143t, anonymousClass988.A19), c83403nh, c910143t, null, A0V, interfaceC83733oI, str2, str, c83403nh.A1V, null, null, A05(c910143t, interfaceC83733oI, i, z), i, A03, z, false, false, false, false, false, false);
    }

    public static final List A05(C910143t c910143t, InterfaceC83733oI interfaceC83733oI, int i, boolean z) {
        ImmutableList A01 = c910143t.A01();
        if (A01 != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A01, 10));
            Iterator<E> it = A01.iterator();
            while (it.hasNext()) {
                C9CP c9cp = (C9CP) it.next();
                C1583378t c1583378t = A00;
                C14360o3.A0A(c9cp);
                arrayList.add(c1583378t.A00(c9cp, interfaceC83733oI, i, z));
            }
            return arrayList;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x019a, code lost:
    
        if (r2 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r0.A0Q == X.EnumC910243u.PLAIN) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e1, code lost:
    
        if (r2.intValue() != 5) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0213, code lost:
    
        if (r9 == null) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C7QY A04(android.content.Context r100, X.C158747Ak r101, X.C7QX r102, X.C7QL r103, X.AnonymousClass988 r104, X.C1583678w r105, X.C83403nh r106, X.C910143t r107, X.C910143t r108, com.instagram.model.direct.messageid.DirectMessageIdentifier r109, X.InterfaceC83733oI r110, java.lang.String r111, java.lang.String r112, java.lang.String r113, java.lang.String r114, java.lang.String r115, java.util.List r116, int r117, boolean r118, boolean r119, boolean r120, boolean r121, boolean r122, boolean r123, boolean r124, boolean r125) {
        /*
            Method dump skipped, instructions count: 1230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1583378t.A04(android.content.Context, X.7Ak, X.7QX, X.7QL, X.988, X.78w, X.3nh, X.43t, X.43t, com.instagram.model.direct.messageid.DirectMessageIdentifier, X.3oI, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):X.7QY");
    }
}
