package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import java.util.Date;

/* loaded from: classes9.dex */
public abstract class OMP {
    public long A00;
    public boolean A01;
    public boolean A02;
    public Integer A03;
    public final UserSession A04;
    public final UpcomingEvent A05;
    public final C13920nI A06;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    public final String A02(Context context, Integer num) {
        long j;
        String str;
        int i;
        Object[] objArr;
        String str2;
        UpcomingEvent upcomingEvent = this.A05;
        switch (this.A03.intValue()) {
            case 0:
                j = this.A00;
                str = "MMM yyyy";
                return MX0.A04(str, j);
            case 1:
                j = this.A00;
                str = "MMM d";
                return MX0.A04(str, j);
            case 2:
                String A01 = MX0.A01(context, this.A00);
                if (num == null) {
                    return AbstractC31177DnL.A0b(context, A01, 2131975644);
                }
                return A01;
            case 3:
            case 4:
                j = this.A00;
                if (num != null) {
                    str = "EE";
                    return MX0.A04(str, j);
                }
                i = 2131957560;
                objArr = new Object[2];
                str2 = "EE";
                objArr[0] = MX0.A04(str2, j);
                objArr[1] = MX0.A01(context, j);
                String string = context.getString(i, objArr);
                C14360o3.A07(string);
                return string;
            case 5:
                if (!AbstractC41774Ieq.A05(upcomingEvent) && num == null) {
                    j = this.A00;
                    i = 2131957527;
                    objArr = new Object[2];
                    str2 = "MMM d";
                    objArr[0] = MX0.A04(str2, j);
                    objArr[1] = MX0.A01(context, j);
                    String string2 = context.getString(i, objArr);
                    C14360o3.A07(string2);
                    return string2;
                }
                j = this.A00;
                str = "MMM d";
                return MX0.A04(str, j);
            case 6:
                if (num == null) {
                    j = this.A00;
                    str = "MMM d, yyyy";
                    return MX0.A04(str, j);
                }
                j = this.A00;
                str = "MMM d";
                return MX0.A04(str, j);
            default:
                throw B4Z.A00();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    public final String A03(Context context, Integer num) {
        long j;
        int i;
        Object[] objArr;
        String str;
        String str2;
        UpcomingEvent upcomingEvent = this.A05;
        switch (this.A03.intValue()) {
            case 0:
            case 1:
            case 6:
                j = this.A00;
                str2 = "MMM d";
                return MX0.A04(str2, j);
            case 2:
                String A01 = MX0.A01(context, this.A00);
                if (num == null) {
                    return AbstractC31177DnL.A0b(context, A01, 2131975644);
                }
                return A01;
            case 3:
            case 4:
                j = this.A00;
                if (num != null) {
                    str2 = "EE";
                    return MX0.A04(str2, j);
                }
                i = 2131957560;
                objArr = new Object[2];
                str = "EE";
                objArr[0] = MX0.A04(str, j);
                objArr[1] = MX0.A01(context, j);
                String string = context.getString(i, objArr);
                C14360o3.A07(string);
                return string;
            case 5:
                if (!AbstractC41774Ieq.A05(upcomingEvent) && num == null) {
                    j = this.A00;
                    i = 2131957527;
                    objArr = new Object[2];
                    str = "MMM d";
                    objArr[0] = MX0.A04(str, j);
                    objArr[1] = MX0.A01(context, j);
                    String string2 = context.getString(i, objArr);
                    C14360o3.A07(string2);
                    return string2;
                }
                j = this.A00;
                str2 = "MMM d";
                return MX0.A04(str2, j);
            default:
                throw B4Z.A00();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0085, code lost:
    
        if (r6.A02 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r6.A02 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A00(android.content.Context r7, X.EnumC53260Ngy r8) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.NY7
            r5 = 0
            boolean r4 = X.AbstractC167007dF.A1R(r5, r7, r8)
            boolean r3 = r6.A01
            if (r0 == 0) goto L80
            if (r3 == 0) goto L12
            boolean r0 = r6.A02
            r1 = 1
            if (r0 == 0) goto L13
        L12:
            r1 = 0
        L13:
            X.NgT r2 = r8.A00
            java.lang.Integer r0 = r2.A00
            if (r1 == 0) goto L24
            if (r0 == 0) goto L24
            int r0 = r0.intValue()
            java.lang.String r1 = X.AbstractC166997dE.A0p(r7, r0)
        L23:
            return r1
        L24:
            com.instagram.user.model.UpcomingEvent r0 = r6.A05
            java.lang.Integer r0 = X.AbstractC41774Ieq.A03(r0)
            int r0 = r0.intValue()
            if (r0 == r4) goto L6f
            r3 = 0
        L31:
            int r1 = r2.ordinal()
            if (r1 == r5) goto L66
            if (r1 == r4) goto L61
            r0 = 2
            if (r1 == r0) goto L5c
            r0 = 3
            if (r1 == r0) goto L57
            r0 = 4
            if (r1 != r0) goto L7b
            long r1 = r6.A00
            java.lang.String r0 = "MMM d"
            java.lang.String r1 = X.MX0.A04(r0, r1)
        L4a:
            if (r3 == 0) goto L23
            int r0 = r3.intValue()
            java.lang.String r0 = X.AbstractC167007dF.A0f(r7, r1, r0)
            if (r0 == 0) goto L23
            return r0
        L57:
            java.lang.String r1 = r6.A03(r7, r3)
            goto L4a
        L5c:
            java.lang.String r1 = r6.A02(r7, r3)
            goto L4a
        L61:
            java.lang.String r1 = r6.A01(r7, r3)
            goto L4a
        L66:
            com.instagram.common.session.UserSession r2 = r6.A04
            long r0 = r6.A00
            java.lang.String r1 = X.MX0.A02(r7, r2, r0)
            goto L4a
        L6f:
            boolean r1 = r6.A02
            X.OTY r0 = r8.A01
            if (r1 == 0) goto L78
            java.lang.Integer r3 = r0.A00
            goto L31
        L78:
            java.lang.Integer r3 = r0.A01
            goto L31
        L7b:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L80:
            if (r3 == 0) goto L87
            boolean r0 = r6.A02
            r2 = 1
            if (r0 == 0) goto L88
        L87:
            r2 = 0
        L88:
            X.NgT r1 = r8.A00
            java.lang.Integer r0 = r1.A00
            if (r2 == 0) goto L99
            if (r0 == 0) goto L99
            int r0 = r0.intValue()
            java.lang.String r1 = X.AbstractC166997dE.A0p(r7, r0)
            return r1
        L99:
            int r2 = r1.ordinal()
            r1 = 0
            if (r2 == r5) goto Lc8
            if (r2 == r4) goto Lc3
            r0 = 2
            if (r2 == r0) goto Lbe
            r0 = 3
            if (r2 == r0) goto Lb9
            r0 = 4
            if (r2 != r0) goto Lb4
            long r1 = r6.A00
            java.lang.String r0 = "MMM d"
            java.lang.String r1 = X.MX0.A04(r0, r1)
            return r1
        Lb4:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lb9:
            java.lang.String r1 = r6.A03(r7, r1)
            return r1
        Lbe:
            java.lang.String r1 = r6.A02(r7, r1)
            return r1
        Lc3:
            java.lang.String r1 = r6.A01(r7, r1)
            return r1
        Lc8:
            com.instagram.common.session.UserSession r2 = r6.A04
            long r0 = r6.A00
            java.lang.String r1 = X.MX0.A02(r7, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OMP.A00(android.content.Context, X.Ngy):java.lang.String");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public final String A01(Context context, Integer num) {
        int i;
        int i2;
        switch (this.A03.intValue()) {
            case 0:
            case 6:
                return MX0.A04("MMM d, yyyy", this.A00);
            case 1:
            case 4:
            case 5:
                return MX0.A02(context, this.A04, this.A00);
            case 2:
                if (num != null) {
                    i2 = 2131975646;
                    i = Integer.valueOf(i2).intValue();
                    long j = this.A00;
                    String A0t = AbstractC31174DnI.A0t(context, MX0.A01(context, j), MX0.A03(this.A04, new Date(j)), i);
                    C14360o3.A07(A0t);
                    return A0t;
                }
                i = 2131975645;
                long j2 = this.A00;
                String A0t2 = AbstractC31174DnI.A0t(context, MX0.A01(context, j2), MX0.A03(this.A04, new Date(j2)), i);
                C14360o3.A07(A0t2);
                return A0t2;
            case 3:
                if (num != null) {
                    i2 = 2131975679;
                    i = Integer.valueOf(i2).intValue();
                    long j22 = this.A00;
                    String A0t22 = AbstractC31174DnI.A0t(context, MX0.A01(context, j22), MX0.A03(this.A04, new Date(j22)), i);
                    C14360o3.A07(A0t22);
                    return A0t22;
                }
                i = 2131975678;
                long j222 = this.A00;
                String A0t222 = AbstractC31174DnI.A0t(context, MX0.A01(context, j222), MX0.A03(this.A04, new Date(j222)), i);
                C14360o3.A07(A0t222);
                return A0t222;
            default:
                throw B4Z.A00();
        }
    }

    public OMP(UserSession userSession, C13920nI c13920nI, UpcomingEvent upcomingEvent) {
        long A02;
        this.A04 = userSession;
        this.A05 = upcomingEvent;
        this.A06 = c13920nI;
        long currentTimeMillis = System.currentTimeMillis();
        if (AbstractC41774Ieq.A03(upcomingEvent).intValue() != 0) {
            A02 = AbstractC41774Ieq.A00(upcomingEvent);
        } else {
            A02 = AbstractC41774Ieq.A02(upcomingEvent);
        }
        this.A00 = A02;
        this.A03 = AbstractC53877Ns9.A00(new Date(currentTimeMillis), A02);
        this.A01 = AbstractC41774Ieq.A05(upcomingEvent);
        this.A02 = AbstractC41774Ieq.A0D(upcomingEvent, currentTimeMillis);
    }
}
