package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Fgw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35262Fgw {
    public static final C35262Fgw A00 = new Object();

    public static final String A00(TextView textView, String str, float f) {
        CharSequence charSequence = str;
        if (textView.getPaint().measureText(str) >= f) {
            charSequence = TextUtils.ellipsize(charSequence, textView.getPaint(), f, TextUtils.TruncateAt.END, false, null);
        }
        return charSequence.toString();
    }

    public static final void A04(Context context, UserSession userSession, C34603FMm c34603FMm, C31243DoR c31243DoR, DirectShareTarget directShareTarget) {
        String str;
        int i;
        E72 e72;
        IgTextView igTextView = c34603FMm.A02;
        boolean A1N = AbstractC167007dF.A1N(igTextView.getVisibility());
        IgTextView igTextView2 = c34603FMm.A01;
        String A0v = AbstractC31174DnI.A0v(igTextView);
        String A0v2 = AbstractC31174DnI.A0v(igTextView2);
        if (A1N) {
            igTextView2 = igTextView;
        } else {
            A0v = A0v2;
        }
        float dimension = context.getResources().getDimension(R.dimen.account_discovery_bottom_gap);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0v);
        if (directShareTarget.A0K() && !directShareTarget.A0T) {
            str = " ";
            A0H.append((CharSequence) " ");
            i = R.drawable.instagram_lock_pano_filled_16;
        } else {
            if (directShareTarget.A0U()) {
                boolean A0U = directShareTarget.A0U();
                if (AbstractC31231DoE.A00(userSession, directShareTarget)) {
                    e72 = new E72(C05F.A00);
                } else {
                    e72 = null;
                }
                AbstractC31326Dpo.A00(igTextView2, e72, A0v, A0U);
                return;
            }
            if (c31243DoR == null) {
                return;
            }
            str = " ";
            A0H.append((CharSequence) " ");
            i = R.drawable.instagram_clock_dotted_pano_outline_24;
        }
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            int length = A0H.length();
            AbstractC31173DnH.A0y(context, drawable.mutate(), R.color.grey_6);
            int i2 = (int) dimension;
            drawable.setBounds(0, 0, i2, i2);
            C85973sR c85973sR = new C85973sR(drawable);
            A0H.append((CharSequence) str);
            A0H.setSpan(c85973sR, length, length + 1, 33);
        }
        igTextView2.setText(A0H);
    }

    public static final boolean A06(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36327576418925250L) && C18U.A06(c06090Tz, userSession, 36327576418990787L)) {
            return true;
        }
        return false;
    }

    public static final String A01(DirectShareTarget directShareTarget) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        Iterator A13 = AbstractC31174DnI.A13(directShareTarget.A0Q);
        int i = 0;
        while (A13.hasNext()) {
            int i2 = i + 1;
            A1C.append(AbstractC31172DnG.A0p(A13).A0f);
            if (i < AbstractC31176DnK.A00(directShareTarget) - 1) {
                A1C.append(", ");
            }
            i = i2;
        }
        return AbstractC166987dD.A19(A1C);
    }

    public static final String A02(DirectShareTarget directShareTarget) {
        String obj;
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (directShareTarget.A0Q.size() == 1 && directShareTarget.A01 == 47) {
            obj = AbstractC31172DnG.A14(directShareTarget);
        } else {
            Iterator A13 = AbstractC31174DnI.A13(directShareTarget.A0Q);
            int i = 0;
            while (A13.hasNext()) {
                int i2 = i + 1;
                A1C.append(AbstractC31172DnG.A0p(A13).A0f);
                if (i < AbstractC31172DnG.A03(directShareTarget.A0Q, 1)) {
                    A1C.append(", ");
                }
                i = i2;
            }
            obj = A1C.toString();
        }
        C14360o3.A07(obj);
        return obj;
    }

    public static String A03(List list, int i) {
        return ((PendingRecipient) list.get(i)).A0f;
    }

    public static final boolean A05(Context context, DirectShareTarget directShareTarget) {
        Resources resources;
        int i;
        Object[] objArr;
        String string;
        if (!directShareTarget.A0M()) {
            return false;
        }
        if (directShareTarget.A0Q.size() >= 5) {
            int size = directShareTarget.A0Q.size() - 3;
            string = context.getResources().getQuantityString(R.plurals.thread_title_x_y_z_and_n_others, size, AbstractC31178DnM.A0R(directShareTarget, 0).A0f, AbstractC31178DnM.A0R(directShareTarget, 1).A0f, A03(AbstractC31172DnG.A18(directShareTarget), 2), NumberFormat.getInstance(C1Q2.A02()).format(size));
        } else {
            List A0f = AbstractC31175DnJ.A0f(directShareTarget);
            int size2 = A0f.size();
            if (size2 != 2) {
                if (size2 != 3) {
                    if (size2 != 4) {
                        string = null;
                    } else {
                        resources = context.getResources();
                        i = 2131975511;
                        objArr = new Object[]{A03(A0f, 0), A03(A0f, 1), A03(A0f, 2), A03(A0f, 3)};
                    }
                } else {
                    resources = context.getResources();
                    i = 2131975510;
                    objArr = new Object[]{A03(A0f, 0), A03(A0f, 1), A03(A0f, 2)};
                }
            } else {
                resources = context.getResources();
                i = 2131975508;
                objArr = new Object[]{A03(A0f, 0), A03(A0f, 1)};
            }
            string = resources.getString(i, objArr);
        }
        return !AbstractC31172DnG.A14(directShareTarget).equals(string);
    }
}
