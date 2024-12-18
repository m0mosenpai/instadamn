package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.faceswarm.IgdsFaceSwarm;
import com.instagram.model.direct.HighlightRange;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public abstract class FU9 {
    public static SpannableStringBuilder A00(Context context, C31984E3m c31984E3m, String str, String str2, boolean z) {
        ImmutableList immutableList = c31984E3m.A00;
        SpannableString spannableString = new SpannableString(str);
        Pattern pattern = AbstractC13670mt.A01;
        int A0A = AbstractC167007dF.A0A(str);
        C1LC it = immutableList.iterator();
        while (it.hasNext()) {
            HighlightRange highlightRange = (HighlightRange) it.next();
            if (highlightRange.A02 >= Math.min(highlightRange.A00 + 1, A0A)) {
                break;
            }
            spannableString.setSpan(new StyleSpan(1), highlightRange.A02, Math.min(highlightRange.A00 + 1, A0A), 33);
            spannableString.setSpan(new ForegroundColorSpan(AbstractC31174DnI.A01(context)), highlightRange.A02, Math.min(highlightRange.A00 + 1, A0A), 33);
        }
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(spannableString);
        if (z) {
            str2 = AnonymousClass001.A0R("…", str2);
        }
        A0H.append((CharSequence) str2);
        return A0H;
    }

    public static void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C31984E3m c31984E3m, Boolean bool, List list) {
        boolean booleanValue = bool.booleanValue();
        if (booleanValue && C18U.A06(C06090Tz.A05, userSession, 36327576418925250L)) {
            ArrayList A05 = AbstractC81683kd.A05(AbstractC166987dD.A10(userSession), list, false);
            c31984E3m.A02.setVisibility(8);
            IgdsFaceSwarm A0J = AbstractC31171DnF.A0J(c31984E3m.A01);
            A0J.setVisibility(0);
            A0J.A08 = false;
            A0J.setImageUrls(A05, interfaceC11380iw);
            return;
        }
        AbstractC31179DnN.A1P(c31984E3m.A01);
        C3AY A02 = AbstractC81683kd.A02(null, AbstractC166987dD.A10(userSession), null, list);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = c31984E3m.A02;
        Object obj = A02.A00;
        if (!booleanValue) {
            gradientSpinnerAvatarView.A0F(null, interfaceC11380iw, (ImageUrl) obj);
        } else {
            AbstractC31175DnJ.A0w(A02, interfaceC11380iw, gradientSpinnerAvatarView, obj);
        }
    }
}
