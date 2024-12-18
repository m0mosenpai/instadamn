package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Lln, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48999Lln implements InterfaceC50431MOl {
    public static final C48999Lln A00 = new Object();

    @Override // X.InterfaceC50431MOl
    public final C51761Mtk AWo(Context context, C51753Mtc c51753Mtc, C160787Im c160787Im, int i, int i2, boolean z) {
        String str;
        String str2;
        String A0c;
        C50679MYx c50679MYx = (C50679MYx) c51753Mtc.A02;
        if (c50679MYx == null || (str = c50679MYx.A01) == null) {
            str = "";
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
        if (z) {
            A01.append((CharSequence) AbstractC31177DnL.A0b(context, str, 2131955135));
        } else {
            User user = c160787Im.A0K;
            if (user == null) {
                str2 = "";
            } else {
                str2 = user.getUsername();
            }
            String A0t = AbstractC31174DnI.A0t(context, str2, str, 2131955134);
            C14360o3.A07(A0t);
            int length = str2.length();
            if (length != 0) {
                int A08 = AbstractC001900j.A08(A0t, str2, 0, false);
                A01.append((CharSequence) A0t);
                A01.setSpan(new C89403yg(C05F.A0u, str2, "", i2, true), A08, length + A08, 33);
                A1E.add(AnonymousClass001.A0R("instagram://user?username=", str2));
            }
        }
        String A0p = AbstractC166997dE.A0p(context, 2131955136);
        A01.append((CharSequence) " ");
        int length2 = A01.length();
        int length3 = A0p.length() + length2;
        A01.append((CharSequence) A0p);
        A01.setSpan(new C89403yg(C05F.A0u, A0p, "", i2, true), length2, length3, 33);
        InterfaceC83733oI interfaceC83733oI = c160787Im.A0G.A0P;
        if (interfaceC83733oI != null && (A0c = AbstractC31171DnF.A0c(interfaceC83733oI)) != null && A0c.length() != 0) {
            A1E.add(AnonymousClass001.A0g(AbstractC111324zv.A00(2546), A0c, "/details/change_theme"));
        }
        return new C51761Mtk(AbstractC43592JPx.A07(A01), (List) A1E);
    }
}
