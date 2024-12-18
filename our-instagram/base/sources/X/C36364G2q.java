package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.G2q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36364G2q implements InterfaceC37156GYt {
    public final Context A00;
    public final View.OnClickListener A01;
    public final UserSession A02;
    public final E70 A03;

    public C36364G2q(Context context, View.OnClickListener onClickListener, UserSession userSession, E70 e70) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = e70;
        this.A01 = onClickListener;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        Context context = this.A00;
        C31335Dq0 A01 = C31335Dq0.A01(context, 2131959456);
        String A0p = AbstractC166997dE.A0p(context, 2131959457);
        return AbstractC16960so.A1Q(A01, new C54737OFo(this.A01, null, null, null, EnumC53237Nga.A04, null, null, null, null, null, null, null, A0p, null, null, true, true), C35246Fgf.A00(context, 2131959454), new C35119FeM(true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r0 = r7.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r0 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r0.intValue() != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (X.C98Q.A00(r3).A00(r1.A0L, 40) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r9 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r7 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (r7.A0H != true) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r8 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (r4 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        r0 = r7.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (r0.isEmpty() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        r0 = r7.A0E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0055, code lost:
    
        if (r0 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        if (r0.isEmpty() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005d, code lost:
    
        if (r6 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0063, code lost:
    
        if (X.C7HD.A04(r3, false) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        return X.AbstractC31176DnK.A1a(X.C06090Tz.A05, r3, 36323079588359100L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x002d, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0020, code lost:
    
        if (r7 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r0.isEmpty() != false) goto L11;
     */
    @Override // X.InterfaceC37156GYt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isEnabled() {
        /*
            r10 = this;
            X.E70 r1 = r10.A03
            X.3kP r7 = r1.A0E
            r0 = 0
            if (r7 == 0) goto L9
            java.lang.String r0 = r7.A07
        L9:
            com.instagram.common.session.UserSession r3 = r10.A02
            boolean r9 = X.AbstractC31171DnF.A1W(r3, r0)
            r5 = 0
            if (r7 == 0) goto L71
            boolean r6 = r7.A0M
            java.util.List r0 = r7.A0G
            if (r0 == 0) goto L1f
            boolean r0 = r0.isEmpty()
            r8 = 0
            if (r0 == 0) goto L22
        L1f:
            r8 = 1
            if (r7 == 0) goto L2d
        L22:
            java.lang.Integer r0 = r7.A06
            if (r0 == 0) goto L2d
            int r0 = r0.intValue()
            r4 = 0
            if (r0 != 0) goto L2e
        L2d:
            r4 = 1
        L2e:
            X.98R r2 = X.C98Q.A00(r3)
            X.3oI r1 = r1.A0L
            r0 = 40
            boolean r0 = r2.A00(r1, r0)
            if (r0 == 0) goto L70
            if (r9 == 0) goto L70
            r1 = 1
            if (r7 == 0) goto L70
            boolean r0 = r7.A0H
            if (r0 != r1) goto L70
            if (r8 == 0) goto L70
            if (r4 == 0) goto L70
            java.util.List r0 = r7.A0D
            if (r0 == 0) goto L53
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L70
        L53:
            java.util.List r0 = r7.A0E
            if (r0 == 0) goto L5d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L70
        L5d:
            if (r6 == 0) goto L70
            boolean r0 = X.C7HD.A04(r3, r5)
            if (r0 == 0) goto L70
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323079588359100(0x810ba600032bbc, double:3.034200020755493E-306)
            boolean r5 = X.AbstractC31176DnK.A1a(r2, r3, r0)
        L70:
            return r5
        L71:
            r6 = 0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36364G2q.isEnabled():boolean");
    }
}
