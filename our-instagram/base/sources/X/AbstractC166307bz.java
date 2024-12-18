package X;

import com.instagram.api.schemas.IGCommentSheetMoreInfo;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7bz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC166307bz {
    public static final C169207gt A01(C9BW c9bw, C168557fp c168557fp, boolean z, boolean z2, boolean z3) {
        String str;
        Integer num;
        String str2;
        int i;
        Integer num2;
        if (z) {
            str = ((C167297di) c9bw.A01).A0K;
            num = C05F.A00;
            str2 = c168557fp.A05;
            List list = (List) ((C206209Bd) c9bw.A00).A01;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((C167297di) obj).A0H == C05F.A0u) {
                    arrayList.add(obj);
                }
            }
            i = arrayList.size();
            num2 = C05F.A0C;
        } else if (z2) {
            str = ((C167297di) c9bw.A01).A0K;
            num = C05F.A00;
            str2 = c168557fp.A05;
            i = c168557fp.A00;
            num2 = C05F.A01;
        } else {
            if (z3) {
                String str3 = ((C167297di) c9bw.A01).A0K;
                Integer num3 = C05F.A00;
                return new C169207gt(true, num3, c168557fp.A02, num3, str3, c168557fp.A05, c168557fp.A00);
            }
            return null;
        }
        return new C169207gt(true, num, num, num2, str, str2, i);
    }

    public static final C169207gt A00(C9BW c9bw, C168557fp c168557fp, Boolean bool, boolean z) {
        if (z) {
            String str = ((C167297di) c9bw.A01).A0K;
            return new C169207gt(bool, C05F.A01, c168557fp.A03, C05F.A00, str, c168557fp.A04, c168557fp.A01);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r5.A06 == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C9BW r11, X.EnumC168507fk r12, java.util.List r13) {
        /*
            java.lang.Object r10 = r11.A01
            X.7di r10 = (X.C167297di) r10
            java.lang.Integer r0 = r10.A0H
            boolean r0 = A05(r0)
            if (r0 == 0) goto L9b
            X.7fk r0 = r10.A05
            if (r0 != r12) goto L9b
            java.lang.Object r6 = r11.A00
            X.9Bd r6 = (X.C206209Bd) r6
            java.lang.Object r5 = r6.A00
            X.7fp r5 = (X.C168557fp) r5
            boolean r7 = r5.A08
            r4 = 1
            if (r7 != 0) goto L26
            boolean r0 = r5.A07
            if (r0 != 0) goto L26
            boolean r0 = r5.A06
            r3 = 1
            if (r0 != 0) goto L27
        L26:
            r3 = 0
        L27:
            java.lang.Object r9 = r6.A01
            java.util.List r9 = (java.util.List) r9
            boolean r0 = r9.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L3f
            if (r3 == 0) goto L3f
            boolean r0 = r9 instanceof java.util.Collection
            if (r0 == 0) goto L71
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L71
        L3f:
            r4 = 0
        L40:
            boolean r8 = r5.A07
            r13.add(r10)
            r0 = 0
            X.7gt r0 = A00(r11, r5, r0, r7)
            if (r0 == 0) goto L4f
            r13.add(r0)
        L4f:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r2 = r9.iterator()
        L58:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.7di r0 = (X.C167297di) r0
            java.lang.Integer r0 = r0.A0H
            boolean r0 = A05(r0)
            if (r0 == 0) goto L58
            r7.add(r1)
            goto L58
        L71:
            java.util.Iterator r2 = r9.iterator()
        L75:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r0 = r2.next()
            X.7di r0 = (X.C167297di) r0
            java.lang.Integer r1 = r0.A0H
            java.lang.Integer r0 = X.C05F.A0u
            if (r1 != r0) goto L75
            goto L40
        L88:
            r13.addAll(r7)
            java.lang.Object r0 = r6.A02
            java.util.Collection r0 = (java.util.Collection) r0
            r13.addAll(r0)
            X.7gt r0 = A01(r11, r5, r4, r3, r8)
            if (r0 == 0) goto L9b
            r13.add(r0)
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC166307bz.A02(X.9BW, X.7fk, java.util.List):void");
    }

    public static final void A03(C166047bW c166047bW, List list) {
        String str;
        boolean z;
        User user = c166047bW.A0A;
        IGCommentSheetMoreInfo iGCommentSheetMoreInfo = c166047bW.A01;
        if (iGCommentSheetMoreInfo != null) {
            str = iGCommentSheetMoreInfo.getText();
        } else {
            str = null;
        }
        if (user != null && str != null) {
            String str2 = c166047bW.A0I;
            int i = c166047bW.A00;
            int length = str.length();
            if (i <= 0 ? i != 0 || length <= 400 : length <= 160) {
                z = false;
            } else {
                z = true;
            }
            list.add(new C215189fu(user, str2, str, z));
        }
    }

    public static final boolean A04(C166137bh c166137bh) {
        C166087bc c166087bc = c166137bh.A03;
        if (!c166087bc.A03 && !c166087bc.A04) {
            List list = c166137bh.A06;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    EnumC168507fk enumC168507fk = ((C167297di) ((C9BW) it.next()).A01).A05;
                    if (enumC168507fk == EnumC168507fk.A02 || enumC168507fk == EnumC168507fk.A03) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean A05(Integer num) {
        int intValue = num.intValue();
        if (intValue != 2 && intValue != 6 && intValue != 7) {
            return true;
        }
        return false;
    }
}
