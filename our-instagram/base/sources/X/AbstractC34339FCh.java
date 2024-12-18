package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FCh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34339FCh {
    public static final void A00(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, List list) {
        String str3;
        boolean A1U = AbstractC167007dF.A1U(userSession);
        ArrayList A0q = AbstractC25230BEn.A0q(list);
        Iterator it = list.iterator();
        while (true) {
            str3 = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC83713oG A0O = AbstractC31171DnF.A0O(AbstractC31172DnG.A0m(it));
            if (A0O instanceof C83693oE) {
                str3 = ((C83693oE) A0O).A00;
            }
            A0q.add(str3);
        }
        if (interfaceC11380iw != null) {
            str3 = interfaceC11380iw.getModuleName();
        }
        LD0.A01(userSession, str3, str, null, A0q);
        String str4 = "banner";
        if (A0q.size() > 1) {
            AbstractC34103F3f.A00().A00(context, interfaceC11380iw, "all");
            return;
        }
        FragmentActivity A07 = AbstractC31179DnN.A07();
        if (A07 == null) {
            return;
        }
        if (str2 != null) {
            str4 = str2;
        }
        if (interfaceC11380iw != null) {
            C36881nl A01 = C36881nl.A01(A07, interfaceC11380iw, userSession, str4);
            A01.A0B = AbstractC31171DnF.A0O(AbstractC31172DnG.A0n(list, A1U ? 1 : 0));
            A01.A06();
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
