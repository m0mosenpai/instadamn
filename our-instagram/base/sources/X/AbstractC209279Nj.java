package X;

import android.content.Context;
import android.text.format.DateFormat;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Calendar;

/* renamed from: X.9Nj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC209279Nj {
    public static final ArrayList A00;

    public static final String A01(Context context, long j) {
        int i;
        String str;
        String valueOf;
        String str2;
        C14360o3.A0B(context, 1);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        boolean is24HourFormat = DateFormat.is24HourFormat(context);
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (is24HourFormat) {
            i = calendar.get(11);
            if (i < 10) {
                str = AnonymousClass001.A00('0', i);
            }
            str = String.valueOf(i);
        } else {
            i = calendar.get(10);
            if (i == 0) {
                str = "12";
            }
            str = String.valueOf(i);
        }
        A1C.append(str);
        A1C.append(":");
        int i2 = calendar.get(12);
        if (i2 < 10) {
            valueOf = AnonymousClass001.A00('0', i2);
        } else {
            valueOf = String.valueOf(i2);
        }
        A1C.append(valueOf);
        if (!is24HourFormat) {
            A1C.append(" ");
            if (calendar.get(9) == 0) {
                str2 = "AM";
            } else {
                str2 = "PM";
            }
            A1C.append(str2);
        }
        return AbstractC166987dD.A19(A1C);
    }

    static {
        ArrayList A1E = AbstractC166987dD.A1E();
        A00 = A1E;
        A1E.add(new Pair(-1, "white"));
        A1E.add(new Pair(-16777216, "black"));
        A1E.add(new Pair(Integer.valueOf(AbstractC209259Nh.A00(EnumC209229Ne.A0N)), "red"));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.9kD, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C194808jg A00(android.content.Context r8, com.instagram.common.session.UserSession r9, X.C148276lx r10, long r11) {
        /*
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            android.content.res.Resources r4 = r8.getResources()
            long r5 = java.lang.System.currentTimeMillis()
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r5 = r5 - r0
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 >= 0) goto L4b
            java.util.ArrayList r0 = X.AbstractC209279Nj.A00
            java.util.Iterator r6 = X.AbstractC166997dE.A13(r0)
        L1a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lb5
            java.lang.Object r5 = X.AbstractC166997dE.A0l(r6)
            android.util.Pair r5 = (android.util.Pair) r5
            X.C14360o3.A0A(r4)
            X.9ST r2 = new X.9ST
            r2.<init>(r8, r4, r11)
            java.lang.String r1 = "date_sticker_"
            java.lang.Object r0 = r5.second
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
            r2.EVu(r0)
            java.lang.Object r0 = r5.first
            X.C14360o3.A06(r0)
            int r0 = X.AbstractC166987dD.A0H(r0)
            X.AbstractC166997dE.A1F(r2, r0)
            r3.add(r2)
            goto L1a
        L4b:
            java.util.List r0 = r10.A0O
            java.util.Iterator r7 = r0.iterator()
            r1 = 0
        L52:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lb5
            java.lang.Object r5 = r7.next()
            X.6ly r5 = (X.C148286ly) r5
            java.lang.String r6 = r5.A0S
            int r2 = r6.hashCode()
            r0 = -1601339484(0xffffffffa08d7fa4, float:-2.3970795E-19)
            if (r2 == r0) goto La4
            r0 = -271649308(0xffffffffefcef5e4, float:-1.2810235E29)
            if (r2 == r0) goto L93
            r0 = 2051669793(0x7a49ff21, float:2.6220657E35)
            if (r2 != r0) goto L85
            java.lang.String r0 = "time_sticker_text"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L85
            X.C14360o3.A0A(r4)
            X.9ST r1 = new X.9ST
            r1.<init>(r8, r4, r11)
        L83:
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
        L85:
            if (r1 == 0) goto L52
            r2 = r1
            X.8xo r2 = (X.InterfaceC202708xo) r2
            java.lang.String r0 = r5.A0S
            r2.EVu(r0)
            r3.add(r1)
            goto L52
        L93:
            java.lang.String r0 = "time_sticker_analog"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L85
            X.C14360o3.A0A(r4)
            X.9SU r1 = new X.9SU
            r1.<init>(r8, r4, r11)
            goto L83
        La4:
            java.lang.String r0 = "time_sticker_digital"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L85
            X.C14360o3.A0A(r4)
            X.9Pb r1 = new X.9Pb
            r1.<init>(r8, r4, r11)
            goto L83
        Lb5:
            X.8jg r1 = new X.8jg
            r1.<init>(r8, r9, r3)
            X.9kD r0 = new X.9kD
            r0.<init>()
            r0.A00 = r11
            r1.A03 = r0
            X.9k3 r0 = new X.9k3
            r0.<init>(r8, r9, r1)
            r1.A0C(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC209279Nj.A00(android.content.Context, com.instagram.common.session.UserSession, X.6lx, long):X.8jg");
    }
}
