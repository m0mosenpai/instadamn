package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableString;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.9NK, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9NK {
    public static final int A00(Editable editable) {
        C14360o3.A0B(editable, 0);
        int selectionEnd = Selection.getSelectionEnd(editable) - 1;
        int i = selectionEnd;
        while (true) {
            if (-1 >= i || editable.charAt(i) == ' ') {
                break;
            }
            if (editable.charAt(i) == '#') {
                if (i == selectionEnd) {
                    break;
                }
                return i;
            }
            i--;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.8xB, java.lang.Object, X.6RB] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.8xB, java.lang.Object, X.6RB] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.8xB, java.lang.Object, X.6RB] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.8xB, java.lang.Object, X.6RB] */
    public static final C194808jg A01(Context context, UserSession userSession, String str, float f, int i) {
        C14360o3.A0B(str, 2);
        int A0F = AbstractC167017dG.A0F(context);
        ArrayList A1E = AbstractC166987dD.A1E();
        SpannableString spannableString = new SpannableString(str);
        AMr.A09(AbstractC166997dE.A0M(context), spannableString, A0F, -1, AbstractC167007dF.A09(context, R.attr.igds_color_creation_tools_pink));
        ?? c6rb = new C6RB(context, i);
        float f2 = A0F;
        AbstractC167017dG.A1N(userSession, context);
        AbstractC167017dG.A0z(context, c6rb);
        AbstractC167007dF.A1A(c6rb, f, f2, f2);
        c6rb.A0L(spannableString);
        c6rb.A00 = "hashtag_sticker_gradient";
        A1E.add(c6rb);
        SpannableString spannableString2 = new SpannableString(str);
        Resources resources = context.getResources();
        AMr.A04(context, spannableString2, A0F);
        ?? c6rb2 = new C6RB(context, i);
        AbstractC167017dG.A1N(userSession, context);
        AbstractC167017dG.A0z(context, c6rb2);
        AbstractC167007dF.A1A(c6rb2, f, f2, f2);
        c6rb2.A0L(spannableString2);
        c6rb2.A00 = "hashtag_sticker_subtle";
        A1E.add(c6rb2);
        SpannableString spannableString3 = new SpannableString(str);
        C14360o3.A0A(resources);
        C14360o3.A0B(resources, 1);
        AMr.A0A(resources, spannableString3, C50R.A01, A0F);
        ?? c6rb3 = new C6RB(context, i);
        AbstractC167017dG.A1N(userSession, context);
        AbstractC167017dG.A0z(context, c6rb3);
        AbstractC167007dF.A1A(c6rb3, f, f2, f2);
        c6rb3.A0L(spannableString3);
        c6rb3.A00 = "hashtag_sticker_rainbow_gradient";
        A1E.add(c6rb3);
        SpannableString spannableString4 = new SpannableString(str);
        AMr.A03(context, resources, spannableString4, A0F);
        ?? c6rb4 = new C6RB(context, i);
        AbstractC167017dG.A1N(userSession, context);
        AbstractC167017dG.A0z(context, c6rb4);
        AbstractC167007dF.A1A(c6rb4, f, f2, f2);
        c6rb4.A0L(spannableString4);
        c6rb4.A00 = "hashtag_sticker_hero_gradient";
        A1E.add(c6rb4);
        C194808jg c194808jg = new C194808jg(context, userSession, A1E);
        c194808jg.A03 = new C217879kK(str, i, f);
        return c194808jg;
    }
}
