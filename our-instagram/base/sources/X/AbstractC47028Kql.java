package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Kql, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47028Kql {
    /* JADX WARN: Multi-variable type inference failed */
    public static final NoteBubbleView A00(Context context, C71196Wpl c71196Wpl, UserSession userSession, C4F5 c4f5, Integer num, boolean z) {
        InterfaceC50424MOe interfaceC50424MOe;
        C6C9 BXJ;
        int length;
        CharSequence charSequence;
        String str;
        AbstractC167007dF.A1D(context, 0, userSession);
        C14360o3.A0B(num, 5);
        if (c4f5 != null && (interfaceC50424MOe = (InterfaceC50424MOe) AbstractC001800i.A0J(c4f5.A0J)) != null && (BXJ = interfaceC50424MOe.BXJ()) != null) {
            String str2 = BXJ.A0J;
            boolean z2 = true;
            if (str2 != null && (length = str2.length()) != 0) {
                NoteBubbleView noteBubbleView = new NoteBubbleView(context);
                noteBubbleView.setVisibility(0);
                Integer num2 = C05F.A00;
                if (num == num2 || num == C05F.A01) {
                    noteBubbleView.setCustomTheme(c4f5.A06);
                }
                if (num == num2) {
                    charSequence = AbstractC166997dE.A0p(context, 2131962874);
                } else if (z) {
                    SpannableStringBuilder A0H = AbstractC25225BEi.A0H(str2);
                    A0H.setSpan(new StyleSpan(1), 0, length, 33);
                    A0H.setSpan(new ForegroundColorSpan(context.getColor(R.color.igds_secondary_text)), 0, length, 33);
                    charSequence = A0H;
                } else {
                    charSequence = JX9.A04(userSession, str2);
                }
                if (num != num2 && (!BXJ.A0Q || AbstractC13670mt.A00(str2) > 3)) {
                    z2 = false;
                }
                if (c71196Wpl != 0 && (!(c71196Wpl instanceof Collection) || !((Collection) c71196Wpl).isEmpty())) {
                    Iterator it = c71196Wpl.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        if (AbstractC43592JPx.A0j(it).A05 != null && (i = i + 1) < 0) {
                            AbstractC16960so.A1T();
                            throw C00O.createAndThrow();
                        }
                    }
                    if (i > 1) {
                        str = AbstractC31177DnL.A0b(context, Integer.valueOf(i - 1), 2131963361);
                        noteBubbleView.setText(charSequence, z2, str, new C50158MDl(noteBubbleView, 43));
                        NoteBubbleView.setContentLayout$default(noteBubbleView, 0, null, 3, null);
                        return noteBubbleView;
                    }
                }
                str = "";
                noteBubbleView.setText(charSequence, z2, str, new C50158MDl(noteBubbleView, 43));
                NoteBubbleView.setContentLayout$default(noteBubbleView, 0, null, 3, null);
                return noteBubbleView;
            }
        }
        return null;
    }
}
