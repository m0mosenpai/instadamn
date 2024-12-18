package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.LDi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47888LDi {
    public static long A00;

    public static final DirectShareTarget A00(EnumC152186t3 enumC152186t3, UserSession userSession, C45128JyU c45128JyU, String str) {
        InterfaceC50424MOe interfaceC50424MOe;
        C6C9 BXJ;
        String str2;
        Long A0j;
        long currentTimeMillis = System.currentTimeMillis() - A00;
        A00 = System.currentTimeMillis();
        if (currentTimeMillis < 2000) {
            return null;
        }
        User user = c45128JyU.A06;
        C122145g6 c122145g6 = new C122145g6(AbstractC31177DnL.A0j(user));
        DirectShareTarget directShareTarget = new DirectShareTarget(c122145g6, null, c122145g6.A00, false);
        C4F5 c4f5 = c45128JyU.A05;
        if (c4f5 != null) {
            List list = c4f5.A0J;
            if (list == null || (interfaceC50424MOe = (InterfaceC50424MOe) AbstractC001800i.A0J(list)) == null || (BXJ = interfaceC50424MOe.BXJ()) == null || (str2 = c45128JyU.A0A) == null || (A0j = AbstractC166997dE.A0j(str2)) == null) {
                return null;
            }
            C28531Zo c28531Zo = C28531Zo.A04;
            String str3 = BXJ.A0J;
            String fullName = user.getFullName();
            if (fullName == null) {
                fullName = "";
            }
            c28531Zo.A08(userSession, null, directShareTarget, AbstractC43593JPy.A0g(user), user, Boolean.valueOf(C28531Zo.A04.A0I(userSession, directShareTarget)), A0j, str, str3, fullName, str, null, null, null);
            C135976Dc A01 = AbstractC135966Db.A01(userSession);
            A01.A0L(enumC152186t3, c4f5);
            A01.A0D(EnumC46303KeZ.A0V);
        } else {
            String str4 = c45128JyU.A0B;
            C14360o3.A0B(str4, 3);
            if (directShareTarget.A01() instanceof InterfaceC83703oF) {
                C7YG A002 = C7YF.A00(userSession);
                InterfaceC83713oG A012 = directShareTarget.A01();
                C14360o3.A0C(A012, "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadTarget");
                A002.A02((InterfaceC83703oF) A012, AbstractC31175DnJ.A0f(directShareTarget), new C50366MLs(userSession, directShareTarget, str4, str, (String) null, 2), true);
                return directShareTarget;
            }
        }
        return directShareTarget;
    }

    public static final void A01(Context context, ViewGroup viewGroup, InterfaceC30947Dj4 interfaceC30947Dj4, InterfaceC31150Dmu interfaceC31150Dmu) {
        C14360o3.A0B(viewGroup, 3);
        String[] stringArray = context.getResources().getStringArray(R.array.friend_map_presence_emoji_replies);
        C14360o3.A07(stringArray);
        for (String str : stringArray) {
            IgTextView igTextView = new IgTextView(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.weight = 1.0f;
            igTextView.setLayoutParams(layoutParams);
            igTextView.setTextSize(2, 18.0f);
            igTextView.setText(str);
            igTextView.setGravity(17);
            viewGroup.addView(igTextView);
            C0fQ.A00(new ViewOnClickListenerC28652Cl0(interfaceC30947Dj4, interfaceC31150Dmu, igTextView, str, 2), igTextView);
        }
    }
}
