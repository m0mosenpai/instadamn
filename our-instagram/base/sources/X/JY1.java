package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteAudienceItem;
import com.instagram.direct.inbox.notes.models.NoteStyle;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;

/* loaded from: classes8.dex */
public final class JY1 {
    public static final JY1 A00 = new Object();

    public static final L5X A00(View view, Fragment fragment, NotePogVideoDict notePogVideoDict, C6C9 c6c9, C45216Jzw c45216Jzw, InterfaceC50465MPt interfaceC50465MPt, Integer num, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        if (interfaceC50465MPt instanceof C48755LhN) {
            if (str != null) {
                if (str2 != null) {
                    return LKX.A04(c6c9, str, str2, AbstractC25227BEk.A06(num, 0));
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        if (interfaceC50465MPt instanceof C48756LhO) {
            return LKX.A03(notePogVideoDict, c6c9, str, str2, z2, z4);
        }
        boolean isAdded = fragment.isAdded();
        Integer Bkb = c6c9.A0D.Bkb();
        if (Bkb != null) {
            Bkb.intValue();
        }
        return LKX.A01(view, notePogVideoDict, c6c9, null, c45216Jzw, isAdded, z, z2, z3);
    }

    public static final InterfaceC50465MPt A01(FragmentActivity fragmentActivity, C6C9 c6c9, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C4F7 c4f7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        InterfaceC50465MPt c48754LhM;
        if (z) {
            c48754LhM = new C48755LhN(fragmentActivity, interfaceC11380iw, userSession, 16, z2);
        } else if (z3) {
            c48754LhM = new C48756LhO(fragmentActivity, interfaceC11380iw, userSession, null, c4f7);
        } else if (z4) {
            c48754LhM = new C48753LhL(fragmentActivity, c6c9, interfaceC11380iw, userSession);
        } else if (z5) {
            c48754LhM = new C48752LhK(fragmentActivity, c6c9, userSession, c4f7);
        } else {
            c48754LhM = new C48754LhM(fragmentActivity, interfaceC11380iw, userSession, null, c4f7);
        }
        return c48754LhM;
    }

    public static final String A02(Context context, long j) {
        int i;
        Object[] objArr;
        Integer valueOf;
        String string;
        int A05 = JQ0.A05(j);
        int i2 = A05 / 60;
        if (i2 == 0 && A05 == 0) {
            string = context.getString(2131968811);
        } else {
            if (i2 == 0) {
                i = 2131968810;
                objArr = new Object[1];
                valueOf = Integer.valueOf(A05);
            } else {
                i = 2131968809;
                objArr = new Object[1];
                valueOf = Integer.valueOf(i2);
            }
            objArr[0] = valueOf;
            string = context.getString(i, objArr);
        }
        C14360o3.A0A(string);
        return string;
    }

    public static final void A04(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C4F7 c4f7, String str, String str2, String str3) {
        AbstractC25229BEm.A1I(str2, 4, str3);
        User A0k = AbstractC31174DnI.A0k(userSession, str3);
        if (A0k != null) {
            String username = A0k.getUsername();
            C193328hC A0H = AbstractC31171DnF.A0H(fragmentActivity);
            A0H.A05 = AbstractC167007dF.A0f(fragmentActivity, username, 2131956737);
            A0H.A09(2131968768);
            A0H.A0s(true);
            A0H.A0t(true);
            A0H.A0L(new DialogInterfaceOnClickListenerC35373Fio(fragmentActivity, interfaceC11380iw, userSession, c4f7, A0k, str, str2), 2131956736);
            AbstractC31176DnK.A16(DialogInterfaceOnClickListenerC48008LMd.A00, A0H, 2131968770);
        }
    }

    public static final boolean A06(UserSession userSession, C4F5 c4f5) {
        C14360o3.A0B(userSession, 0);
        List list = c4f5.A0K;
        if (list != null) {
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(((User) it.next()).getId(), userSession.userId)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final C45216Jzw A08(Context context, C6C9 c6c9) {
        C14360o3.A0B(c6c9, 0);
        String str = c6c9.A0J;
        long parseLong = Long.parseLong(c6c9.A0H);
        User user = c6c9.A0D;
        NoteAudienceItem noteAudienceItem = new NoteAudienceItem(BFV.A00(Integer.valueOf(c6c9.A00)), null, null, 0);
        boolean z = c6c9.A0P;
        String A02 = A02(context, c6c9.A02);
        Object obj = NoteStyle.A01.get(Integer.valueOf(c6c9.A01));
        if (obj == null) {
            obj = NoteStyle.A0E;
        }
        return new C45216Jzw(noteAudienceItem, user, str, A02, parseLong, z, AbstractC166997dE.A1Z(c6c9.A0E, true), AbstractC167007dF.A1X(obj, NoteStyle.A0F), false);
    }

    @Deprecated(message = "Not exhaustive! Use specific NoteConsumptionHandlers directly.")
    public final void A09(Fragment fragment, NotePogVideoDict notePogVideoDict, C6C9 c6c9, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C4F7 c4f7, Integer num, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        AbstractC167007dF.A1F(userSession, 0, c6c9);
        if (fragment.isAdded()) {
            InterfaceC50465MPt A01 = A01(fragment.requireActivity(), c6c9, interfaceC11380iw, userSession, c4f7, z2, z, AbstractC31174DnI.A1Y(c6c9.A0D, userSession.userId), z3, z7);
            A01.DW3(A00(null, fragment, notePogVideoDict, c6c9, null, A01, num, str, str2, z4, z5, false, z6));
        }
    }

    public static final void A03(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, long j, boolean z) {
        C46096Kaw c46096Kaw = new C46096Kaw(fragmentActivity, userSession, j, z);
        WEz A01 = AbstractC69993VzD.A01(fragmentActivity, interfaceC11380iw, userSession, EnumC65855TvH.A16, VG2.A0e, String.valueOf(j));
        if (C18U.A06(C06090Tz.A05, userSession, 36321267113075995L)) {
            A01.A03 = c46096Kaw;
        }
        WEz.A00(null, A01);
        AbstractC135966Db.A01(userSession).A0D(EnumC46303KeZ.A0W);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0014, code lost:
    
        if (X.C4AC.A05(r4) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (X.C4AC.A08(r4) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A05(com.instagram.common.session.UserSession r4, X.C4F5 r5) {
        /*
            boolean r1 = r5.A0T
            r3 = 1
            if (r1 != 0) goto Lc
            boolean r0 = X.C4AC.A08(r4)
            r2 = 1
            if (r0 != 0) goto L16
        Lc:
            r2 = 0
            if (r1 == 0) goto L16
            boolean r0 = X.C4AC.A05(r4)
            r1 = 1
            if (r0 != 0) goto L17
        L16:
            r1 = 0
        L17:
            boolean r0 = r5.A0S
            if (r0 != 0) goto L28
            boolean r0 = r5.A0R
            if (r0 != 0) goto L28
            boolean r0 = r5.A0Q
            if (r0 != 0) goto L28
            if (r2 != 0) goto L27
            if (r1 == 0) goto L28
        L27:
            return r3
        L28:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JY1.A05(com.instagram.common.session.UserSession, X.4F5):boolean");
    }

    public static final boolean A07(UserSession userSession, String str) {
        String str2;
        User A14;
        C38321qM A0h = AbstractC25229BEm.A0h(userSession, str);
        if (A0h != null && (A14 = AbstractC25226BEj.A14(A0h)) != null) {
            str2 = A14.getId();
        } else {
            str2 = null;
        }
        if (AbstractC31171DnF.A1W(userSession, str2) && C18U.A06(C06090Tz.A05, userSession, 36320618573144802L)) {
            return true;
        }
        return false;
    }
}
