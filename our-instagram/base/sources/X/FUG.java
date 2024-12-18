package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.thread.ChannelsContextLine;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.List;
import java.util.Locale;

/* loaded from: classes6.dex */
public abstract class FUG {
    public static final SpannableStringBuilder A00(Context context, UserSession userSession, DirectShareTarget directShareTarget, String str, int i) {
        String str2;
        ChannelsContextLine channelsContextLine;
        C14360o3.A0B(context, 0);
        AbstractC167007dF.A1F(userSession, 1, str);
        if (directShareTarget.A0F()) {
            return null;
        }
        if (directShareTarget.A0H() && (channelsContextLine = directShareTarget.A03) != null) {
            str2 = channelsContextLine.A00;
        } else {
            String A05 = directShareTarget.A05();
            if (A05 != null && A05.length() > 0) {
                str2 = directShareTarget.A05();
            } else {
                str2 = null;
            }
        }
        if (directShareTarget.A0X(userSession.userId) || str2 == null || (directShareTarget.A0L() && (i == 7 || i == 18 || i == 6))) {
            if (directShareTarget.A0K() && !directShareTarget.A0T) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Drawable drawable = context.getDrawable(R.drawable.instagram_lock_filled_12);
                AbstractC25231BEo.A0x(context, drawable.mutate(), AbstractC53242c7.A09(context));
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.setSpan(new C85973sR(drawable), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) context.getString(2131953209));
                return spannableStringBuilder;
            }
            List A0f = AbstractC31175DnJ.A0f(directShareTarget);
            if (A0f.size() == 1) {
                if (i != 11 && i != 13) {
                    str2 = AbstractC101904i3.A01(context, (AnonymousClass172) A0f.get(0));
                } else {
                    str2 = null;
                }
            } else if (A0f.isEmpty()) {
                str2 = AbstractC101904i3.A06(AbstractC166997dE.A0Y(userSession));
            } else {
                str2 = AbstractC101904i3.A00(context, userSession, A0f);
            }
            if (TextUtils.equals(str, str2)) {
                str2 = null;
            }
            if (directShareTarget.A07 == EnumC46982Dm.A04) {
                String A0p = AbstractC166997dE.A0p(context, 2131959679);
                if (str2 != null) {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                        A1C.append(A0p);
                        A1C.append(" · ");
                        A1C.append(str2);
                    } else {
                        A1C.append(str2);
                        A1C.append(" · ");
                        A1C.append(A0p);
                    }
                    A0p = A1C.toString();
                }
                str2 = A0p;
            }
            if (str2 == null || str2.length() == 0) {
                return null;
            }
        }
        return AbstractC25225BEi.A0H(str2);
    }

    public static final SpannableStringBuilder A01(Context context, DirectShareTarget directShareTarget, int i) {
        String A05;
        String str;
        String str2;
        C14360o3.A0B(context, 0);
        List A0f = AbstractC31175DnJ.A0f(directShareTarget);
        if (directShareTarget.A0H()) {
            A05 = directShareTarget.A0N;
            if (A05 == null) {
                ChannelsContextLine channelsContextLine = directShareTarget.A03;
                if (channelsContextLine == null || (str2 = channelsContextLine.A02) == null) {
                    return null;
                }
                return AbstractC25225BEi.A0H(str2);
            }
        } else {
            if (directShareTarget.A0F()) {
                if (AbstractC31178DnM.A0R(directShareTarget, 0).A01 == 2 && i == 6) {
                    str = context.getString(2131959688);
                } else {
                    String A052 = directShareTarget.A05();
                    if ((A052 == null || A052.length() <= 0 || (str = directShareTarget.A05()) == null) && (((PendingRecipient) A0f.get(0)).A09 == null || (str = ((PendingRecipient) A0f.get(0)).A09) == null)) {
                        return null;
                    }
                }
                return AbstractC25225BEi.A0H(str);
            }
            if (directShareTarget.A0I() || A0f.size() != 1 || directShareTarget.A05() == null) {
                return null;
            }
            if (directShareTarget.A0L() && (i == 7 || i == 18 || i == 6)) {
                return null;
            }
            A05 = directShareTarget.A05();
        }
        return AbstractC25225BEi.A0H(A05);
    }
}
