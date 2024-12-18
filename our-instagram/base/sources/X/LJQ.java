package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public abstract class LJQ {
    public static final C1571273r A00(Context context) {
        C1571273r c1571273r = new C1571273r();
        c1571273r.A02 = R.drawable.instagram_error_outline_96;
        c1571273r.A0D = context.getString(2131959911);
        c1571273r.A07 = context.getString(2131960484);
        c1571273r.A0C = null;
        c1571273r.A06 = null;
        return c1571273r;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1571273r A01(android.content.Context r7, com.instagram.common.session.UserSession r8, X.EnumC46220Kcw r9, X.InterfaceC1571373s r10, boolean r11) {
        /*
            r3 = 1
            r5 = 4
            int r2 = r9.ordinal()
            r1 = 6
            r0 = 2
            if (r2 == r3) goto L7d
            if (r2 == r0) goto L84
            r4 = 2131960059(0x7f1320fb, float:1.9556776E38)
            if (r2 == r1) goto L79
            r4 = 2131960061(0x7f1320fd, float:1.955678E38)
            if (r2 == r5) goto L52
            r0 = 5
            r6 = 2131960098(0x7f132122, float:1.9556855E38)
            if (r2 == r0) goto L1f
            r6 = 2131960060(0x7f1320fc, float:1.9556778E38)
        L1f:
            r5 = 0
        L20:
            r0 = 2131231768(0x7f080418, float:1.8079626E38)
            if (r11 == 0) goto L28
            r0 = 2131237943(0x7f081c37, float:1.809215E38)
        L28:
            X.73r r2 = new X.73r
            r2.<init>()
            r2.A02 = r0
            java.lang.String r0 = r7.getString(r4)
            r2.A0D = r0
            java.lang.String r0 = r7.getString(r6)
            r2.A07 = r0
            r1 = 0
            if (r5 == 0) goto L50
            int r0 = r5.intValue()
            java.lang.String r0 = r7.getString(r0)
        L46:
            r2.A0C = r0
            if (r5 != 0) goto L4b
            r10 = r1
        L4b:
            r2.A06 = r10
            r2.A0L = r3
            return r2
        L50:
            r0 = r1
            goto L46
        L52:
            java.lang.Class<X.LEQ> r2 = X.LEQ.class
            r1 = 17
            X.MDm r0 = new X.MDm
            r0.<init>(r8, r1)
            java.lang.Object r0 = r8.A01(r2, r0)
            X.LEQ r0 = (X.LEQ) r0
            java.util.Set r0 = r0.A01
            int r1 = r0.size()
            java.util.List r0 = X.LEQ.A02
            int r0 = r0.size()
            r6 = 2131960101(0x7f132125, float:1.9556861E38)
            if (r1 == r0) goto L75
            r6 = 2131960099(0x7f132123, float:1.9556857E38)
        L75:
            r0 = 2131960100(0x7f132124, float:1.955686E38)
            goto L8d
        L79:
            r6 = 2131960058(0x7f1320fa, float:1.9556774E38)
            goto L8a
        L7d:
            r4 = 2131960103(0x7f132127, float:1.9556865E38)
            r6 = 2131960102(0x7f132126, float:1.9556863E38)
            goto L8a
        L84:
            r4 = 2131960091(0x7f13211b, float:1.955684E38)
            r6 = 2131960090(0x7f13211a, float:1.9556839E38)
        L8a:
            r0 = 2131960065(0x7f132101, float:1.9556788E38)
        L8d:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LJQ.A01(android.content.Context, com.instagram.common.session.UserSession, X.Kcw, X.73s, boolean):X.73r");
    }

    public static final C1571273r A02(Context context, UserSession userSession, LE4 le4) {
        C1571273r c1571273r = new C1571273r();
        c1571273r.A02 = R.drawable.instagram_error_outline_96;
        c1571273r.A0D = context.getString(2131959911);
        c1571273r.A07 = context.getString(2131960116);
        c1571273r.A0C = context.getString(2131960115);
        c1571273r.A06 = new C49629LwM(0, userSession, le4);
        return c1571273r;
    }

    public static final C1571273r A03(Context context, InterfaceC1571373s interfaceC1571373s, boolean z, boolean z2, boolean z3) {
        Integer num;
        String str;
        int i = z3 ? 2131960061 : 2131960086;
        if (z) {
            num = 2131960084;
        } else {
            num = null;
        }
        int i2 = R.drawable.empty_state_direct;
        if (z2) {
            i2 = R.drawable.instagram_app_messenger_outline_96;
        }
        C1571273r c1571273r = new C1571273r();
        c1571273r.A02 = i2;
        c1571273r.A0D = context.getString(i);
        c1571273r.A07 = context.getString(2131960085);
        if (num != null) {
            str = context.getString(num.intValue());
        } else {
            str = null;
        }
        c1571273r.A0C = str;
        if (num == null) {
            interfaceC1571373s = null;
        }
        c1571273r.A06 = interfaceC1571373s;
        c1571273r.A0L = true;
        return c1571273r;
    }
}
