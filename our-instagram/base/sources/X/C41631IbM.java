package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IbM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41631IbM {
    public final C66362zD A00;
    public final UserSession A01;
    public final List A02;
    public final Context A03;
    public final InterfaceC60442pS A04;
    public final C146066i4 A05;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.2zJ, java.lang.Object] */
    public C41631IbM(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, JPm jPm) {
        AbstractC167017dG.A1Q(userSession, interfaceC60442pS);
        this.A01 = userSession;
        this.A03 = context;
        this.A04 = interfaceC60442pS;
        this.A05 = new C146066i4(userSession);
        C66392zG A00 = C66362zD.A00(context);
        A00.A01(new HIG(userSession));
        A00.A01(new HJ0(userSession));
        A00.A01(new HIF(userSession));
        A00.A01(new Object());
        A00.A01(new Object());
        A00.A01(new HIH(userSession));
        C38057Gok.A00(A00, new Object());
        A00.A01(new Object());
        this.A00 = AbstractC31173DnH.A0R(A00, new C39078HIc(context, interfaceC60442pS, userSession, jPm, C05F.A09));
        this.A02 = AbstractC166987dD.A1E();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r5 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r6.CdW() != true) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0155, code lost:
    
        if (r1 != null) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.C41052IFv r19) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41631IbM.A01(X.IFv):void");
    }

    public final void A02(UpcomingEvent upcomingEvent) {
        Integer num;
        List list = this.A02;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (it.next() instanceof InterfaceC43426JGq) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        InterfaceC66482zP interfaceC66482zP = (InterfaceC66482zP) AbstractC001800i.A0O(list, i);
        if (interfaceC66482zP instanceof InterfaceC43426JGq) {
            C51758Mth BmN = ((InterfaceC43426JGq) interfaceC66482zP).BmN();
            if (upcomingEvent.getReminderEnabled()) {
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
            C14360o3.A0B(num, 0);
            BmN.A00 = num;
        }
        this.A00.notifyItemChanged(i);
    }

    private final String A00(C38321qM c38321qM) {
        String BNT;
        if (c38321qM != null && (BNT = c38321qM.A0C.BNT()) != null && BNT.length() > 0 && !BNT.equals(this.A03.getString(2131976237))) {
            return BNT;
        }
        return AbstractC166997dE.A0p(this.A03, 2131976224);
    }
}
