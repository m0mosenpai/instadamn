package X;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.AMj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23130AMj {
    public static final void A05(Context context) {
        C1ZT AR9 = C1U4.A00(context).A00("XE_ACCESS_LIBRARY_DATA").AR9();
        AR9.A0A("account_manager_migration_completed", false);
        AR9.A0B();
    }

    public final ListenableFuture A07(Context context, AbstractC12990ll abstractC12990ll, String str, String str2, java.util.Set set) {
        C14360o3.A0B(abstractC12990ll, 1);
        return A00(context, abstractC12990ll, new C200908uX(abstractC12990ll), this, str, str2, set);
    }

    public static final C200918uY A04(C200908uX c200908uX, AbstractC48762Lu abstractC48762Lu) {
        C200758uI c200758uI = new C200758uI();
        C14360o3.A0B(c200908uX, 0);
        c200758uI.A04 = c200908uX;
        c200758uI.A01 = abstractC48762Lu;
        return new C200918uY(c200758uI);
    }

    public static final boolean A06(AbstractC12990ll abstractC12990ll, String str, String str2) {
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C1AD.A06(c06090Tz, 18298948683237280L)) {
            if (C1AD.A06(c06090Tz, 18298948683368353L)) {
                return AbstractC86593tX.A0r(new C105914q2(abstractC12990ll), C05F.A00, str, str2);
            }
            String A04 = C1AD.A04(c06090Tz, 18861898636722274L);
            return AbstractC105924q3.A00(new C105914q2(abstractC12990ll), C05F.A00, A04, str2, str, false);
        }
        if (C1AD.A06(c06090Tz, 18298948682844062L)) {
            try {
                JSONArray jSONArray = new JSONArray(C1AD.A04(c06090Tz, 18861898636197981L));
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (str.equals(jSONArray.getString(i))) {
                        return true;
                    }
                }
                return false;
            } catch (JSONException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, java.lang.Runnable, X.3Qv] */
    public static final ListenableFuture A00(Context context, AbstractC12990ll abstractC12990ll, C200908uX c200908uX, C23130AMj c23130AMj, String str, String str2, java.util.Set set) {
        ArrayList A1E = AbstractC166987dD.A1E();
        if (!A06(abstractC12990ll, str, str2)) {
            return new C25191Kx(A1E);
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        A1E2.addAll(AbstractC001800i.A0a(set));
        A6O a6o = new A6O(A1E2);
        c200908uX.A01 = "3.0";
        AbstractC48762Lu A00 = C48702Lo.A02.A00();
        if (A00 != null) {
            A00.A00 = "3.0";
        }
        C23545Abz c23545Abz = new C23545Abz(context, c200908uX, c23130AMj, A00, str, a6o);
        ExecutorC14040nU executorC14040nU = new ExecutorC14040nU(C14120nc.A00(), 583345440, 2, false, true);
        ?? obj = new Object();
        obj.A00 = new C6VB(c23545Abz, obj);
        executorC14040nU.execute(obj);
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ca, code lost:
    
        if (r6.moveToNext() != true) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList A01(android.content.Context r36, java.lang.String r37, X.A9D r38, X.C200918uY r39) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23130AMj.A01(android.content.Context, java.lang.String, X.A9D, X.8uY):java.util.ArrayList");
    }

    public static ArrayList A02(Context context, String str, A9D a9d, C200918uY c200918uY) {
        ArrayList A1E;
        ArrayList A1E2 = AbstractC166987dD.A1E();
        EnumC200938ua enumC200938ua = a9d.A03;
        EnumC200808uN enumC200808uN = a9d.A02;
        EnumC200798uM A01 = AbstractC200928uZ.A01(enumC200808uN);
        if (A01 != null) {
            EnumC200938ua enumC200938ua2 = EnumC200938ua.SAVED_ACCOUNTS;
            if (enumC200938ua == enumC200938ua2) {
                A1E = AbstractC166987dD.A1E();
                List list = A4L.A02;
                ArrayList A1E3 = AbstractC166987dD.A1E();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC200848uR.A00(A01, A1E3, it);
                }
                Iterator it2 = A1E3.iterator();
                while (it2.hasNext()) {
                    C200918uY.A03(context, str, A1E, (AbstractC200848uR) it2.next(), enumC200808uN, enumC200938ua2, c200918uY);
                }
            } else {
                EnumC200938ua enumC200938ua3 = EnumC200938ua.ACTIVE_ACCOUNT;
                A1E = AbstractC166987dD.A1E();
                if (enumC200938ua == enumC200938ua3) {
                    List list2 = A4L.A00;
                    ArrayList A1E4 = AbstractC166987dD.A1E();
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        AbstractC200848uR.A00(A01, A1E4, it3);
                    }
                    Iterator it4 = A1E4.iterator();
                    while (it4.hasNext()) {
                        C200918uY.A03(context, str, A1E, (AbstractC200848uR) it4.next(), enumC200808uN, enumC200938ua3, c200918uY);
                    }
                } else {
                    List list3 = A4L.A01;
                    ArrayList A1E5 = AbstractC166987dD.A1E();
                    Iterator it5 = list3.iterator();
                    while (it5.hasNext()) {
                        AbstractC200848uR.A00(A01, A1E5, it5);
                    }
                    Iterator it6 = A1E5.iterator();
                    while (it6.hasNext()) {
                        C200918uY.A03(context, str, A1E, (AbstractC200848uR) it6.next(), enumC200808uN, EnumC200938ua.ALL_ACCOUNTS, c200918uY);
                    }
                }
            }
            A1E2.addAll(Collections.unmodifiableList(A1E));
        }
        return A1E2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:115|(2:117|(2:119|120))|121|122|123|(1:134)(4:125|(2:127|(1:129)(1:132))(1:133)|130|131)|120) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0094, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0095, code lost:
    
        X.C0K8.A0O(r2, "SecurityException", "sso_data", r5);
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x024a, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x024b, code lost:
    
        X.C0K8.A0O(r8, "SecurityException", "account_switcher_data", r9);
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        r13 = X.AbstractC200928uZ.A00(r6);
        X.C14360o3.A0B(r13, 2);
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        if (r7 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
    
        android.accounts.AccountManager.get(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        r12 = android.accounts.AccountManager.get(r20).getUserData(r7, "sso_data");
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0107 A[Catch: JSONException -> 0x012e, JSONException -> 0x01ca, TryCatch #4 {JSONException -> 0x012e, blocks: (B:37:0x00db, B:39:0x00e6, B:41:0x00ec, B:43:0x00f2, B:47:0x00fd, B:48:0x0101, B:50:0x0107, B:51:0x010b, B:53:0x0111, B:54:0x0115, B:56:0x011b, B:57:0x011f), top: B:36:0x00db, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111 A[Catch: JSONException -> 0x012e, JSONException -> 0x01ca, TryCatch #4 {JSONException -> 0x012e, blocks: (B:37:0x00db, B:39:0x00e6, B:41:0x00ec, B:43:0x00f2, B:47:0x00fd, B:48:0x0101, B:50:0x0107, B:51:0x010b, B:53:0x0111, B:54:0x0115, B:56:0x011b, B:57:0x011f), top: B:36:0x00db, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011b A[Catch: JSONException -> 0x012e, JSONException -> 0x01ca, TryCatch #4 {JSONException -> 0x012e, blocks: (B:37:0x00db, B:39:0x00e6, B:41:0x00ec, B:43:0x00f2, B:47:0x00fd, B:48:0x0101, B:50:0x0107, B:51:0x010b, B:53:0x0111, B:54:0x0115, B:56:0x011b, B:57:0x011f), top: B:36:0x00db, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0137 A[Catch: JSONException -> 0x01ca, TryCatch #3 {JSONException -> 0x01ca, blocks: (B:27:0x00a7, B:30:0x00b4, B:32:0x00c3, B:34:0x00d5, B:37:0x00db, B:39:0x00e6, B:41:0x00ec, B:43:0x00f2, B:47:0x00fd, B:48:0x0101, B:50:0x0107, B:51:0x010b, B:53:0x0111, B:54:0x0115, B:56:0x011b, B:57:0x011f, B:59:0x0137, B:67:0x012f, B:71:0x00c9, B:72:0x014b, B:74:0x0151, B:76:0x0157, B:80:0x0167, B:82:0x016d, B:83:0x0171, B:85:0x0177, B:86:0x017b, B:88:0x0181, B:89:0x0185, B:91:0x0193, B:93:0x019d, B:94:0x01a3, B:96:0x01aa, B:99:0x0163), top: B:26:0x00a7, inners: #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList A03(android.content.Context r20, X.A9D r21) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23130AMj.A03(android.content.Context, X.A9D):java.util.ArrayList");
    }
}
