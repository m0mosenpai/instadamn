package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Oe0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55194Oe0 {
    public final UserSession A00;
    public final EnumC53117NeU A01;

    /* JADX WARN: Removed duplicated region for block: B:37:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList A06(com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r6, X.C51754Mtd r7) {
        /*
            r5 = this;
            r0 = 1
            java.util.ArrayList r2 = X.AbstractC166997dE.A12(r6, r0)
            java.util.List r0 = r5.A01(r6)
            if (r0 == 0) goto L52
            java.util.ArrayList r3 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r4 = r0.iterator()
        L13:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L52
            java.lang.Object r1 = r4.next()
            X.Nkp r1 = (X.AbstractC53462Nkp) r1
            boolean r0 = r1 instanceof X.NJU
            if (r0 == 0) goto L37
            r0 = r1
            X.NJU r0 = (X.NJU) r0
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r0 = r0.A00
            boolean r0 = r5.A07(r0, r6, r7)
        L2c:
            if (r0 == 0) goto L31
        L2e:
            r2.add(r1)
        L31:
            X.0eB r0 = X.C0eB.A00
            r3.add(r0)
            goto L13
        L37:
            boolean r0 = r1 instanceof X.NJV
            if (r0 == 0) goto L45
            r0 = r1
            X.NJV r0 = (X.NJV) r0
            java.lang.Integer r0 = r0.A00
            boolean r0 = r5.A08(r6, r7, r0)
            goto L2c
        L45:
            boolean r0 = r1 instanceof X.NJX
            if (r0 != 0) goto L2e
            boolean r0 = r1 instanceof X.NJW
            if (r0 != 0) goto L2e
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L52:
            r3 = 0
            r4 = 0
        L54:
            int r0 = r2.size()
            if (r4 >= r0) goto L9e
            java.lang.Object r0 = X.AbstractC001800i.A0O(r2, r4)
            boolean r0 = r0 instanceof X.NJW
            if (r0 == 0) goto L80
            if (r4 == 0) goto L76
            int r0 = r2.size()
            int r0 = r0 + (-1)
            if (r4 == r0) goto L76
            int r1 = r4 + (-1)
        L6e:
            java.lang.Object r0 = X.AbstractC001800i.A0O(r2, r1)
            boolean r0 = r0 instanceof X.NJW
            if (r0 == 0) goto L9b
        L76:
            r2.remove(r4)
            int r0 = r4 + (-1)
            int r4 = java.lang.Math.max(r3, r0)
            goto L54
        L80:
            java.lang.Object r0 = X.AbstractC001800i.A0O(r2, r4)
            boolean r0 = r0 instanceof X.NJX
            if (r0 == 0) goto L9b
            int r0 = r2.size()
            int r0 = r0 + (-1)
            if (r4 == r0) goto L76
            int r1 = r4 + 1
            java.lang.Object r0 = X.AbstractC001800i.A0O(r2, r1)
            boolean r0 = r0 instanceof X.NJX
            if (r0 != 0) goto L76
            goto L6e
        L9b:
            int r4 = r4 + 1
            goto L54
        L9e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC55194Oe0.A06(com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType, X.Mtd):java.util.ArrayList");
    }

    public final boolean A07(PublishScreenCategoryType publishScreenCategoryType, PublishScreenCategoryType publishScreenCategoryType2, C51754Mtd c51754Mtd) {
        C14360o3.A0B(publishScreenCategoryType, 0);
        List A01 = A01(publishScreenCategoryType);
        if (A01 != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : A01) {
                if (obj instanceof NJV) {
                    A1E.add(obj);
                }
            }
            if ((A1E instanceof Collection) && A1E.isEmpty()) {
                return false;
            }
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                if (A08(publishScreenCategoryType2, c51754Mtd, ((NJV) it.next()).A00)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x02ec, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36328547082321532L) != false) goto L71;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:43:0x015e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0016. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List A01(com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r7) {
        /*
            Method dump skipped, instructions count: 1564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC55194Oe0.A01(com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType):java.util.List");
    }

    public static void A02(PublishScreenCategoryType publishScreenCategoryType, AbstractCollection abstractCollection) {
        abstractCollection.add(new NJU(publishScreenCategoryType));
    }

    public static void A03(Integer num, AbstractCollection abstractCollection) {
        abstractCollection.add(new NJV(num));
        abstractCollection.add(new NJV(C05F.A06));
    }

    public static void A04(Integer num, AbstractCollection abstractCollection) {
        abstractCollection.add(new NJV(num));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x002f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:153:0x021b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A08(com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r8, X.C51754Mtd r9, java.lang.Integer r10) {
        /*
            Method dump skipped, instructions count: 1174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC55194Oe0.A08(com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType, X.Mtd, java.lang.Integer):boolean");
    }

    public AbstractC55194Oe0(UserSession userSession, EnumC53117NeU enumC53117NeU) {
        this.A00 = userSession;
        this.A01 = enumC53117NeU;
    }

    public static void A05(AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new NJX(Integer.valueOf(i)));
    }
}
