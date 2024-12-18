package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.newsfeed.ui.InlineLinkUrn;
import java.text.BreakIterator;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Matcher;

/* renamed from: X.ChJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28467ChJ {
    public static void A03(Context context, SpannableStringBuilder spannableStringBuilder, C5HW c5hw, boolean z) {
        String str = c5hw.A04.A0n;
        if (TextUtils.isEmpty(str) && z && (str = c5hw.A08) == null) {
            Double A05 = c5hw.A05();
            if (A05 != null) {
                str = C23831Eq.A0B(context.getResources(), A05.doubleValue(), false);
                c5hw.A08 = str;
            } else {
                return;
            }
        }
        if (str != null) {
            spannableStringBuilder.append(" ").append((CharSequence) str);
            String obj = spannableStringBuilder.toString();
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(obj);
            int last = characterInstance.last();
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(context.getColor(AbstractC53242c7.A09(context)));
            String A0R = AnonymousClass001.A0R(" ", str);
            BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
            characterInstance2.setText(A0R);
            spannableStringBuilder.setSpan(foregroundColorSpan, last - characterInstance2.last(), last, 33);
        }
    }

    public static SpannableStringBuilder A00(final Context context, UserSession userSession, final InterfaceC58311Pt3 interfaceC58311Pt3, final InterfaceC31118Dm0 interfaceC31118Dm0, C26030BfJ c26030BfJ, final C5HW c5hw, final int i) {
        int i2;
        InterfaceC30949Dj6 interfaceC30949Dj6;
        Function function = new Function() { // from class: X.D2t
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                InterfaceC58311Pt3 interfaceC58311Pt32 = interfaceC58311Pt3;
                InterfaceC31118Dm0 interfaceC31118Dm02 = interfaceC31118Dm0;
                C5HW c5hw2 = c5hw;
                int i3 = i;
                new OI1(interfaceC58311Pt32, interfaceC31118Dm02).A00(null, c5hw2, (InlineLinkUrn) obj, i3);
                return null;
            }
        };
        boolean A1a = AbstractC25229BEm.A1a(interfaceC31118Dm0, InterfaceC31118Dm0.A01);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(c5hw.A04.A0j)) {
            String str = c5hw.A04.A0j;
            str.getClass();
            if (AbstractC25231BEo.A1b(c26030BfJ.A00)) {
                interfaceC30949Dj6 = C29323CwI.A00;
            } else {
                interfaceC30949Dj6 = C29322CwH.A00;
            }
            interfaceC30949Dj6.E68(spannableStringBuilder, str, new M8Z(2, context, function));
            A02(context, spannableStringBuilder, userSession, c5hw, function, A1a);
            A03(context, spannableStringBuilder, c5hw, true);
        } else {
            if (!TextUtils.isEmpty(c5hw.A04.A0o)) {
                spannableStringBuilder.append((CharSequence) c5hw.A04.A0o);
                A02(context, spannableStringBuilder, userSession, c5hw, function, A1a);
                A03(context, spannableStringBuilder, c5hw, true);
                List<C26000Beo> list = c5hw.A04.A0w;
                if (list != null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.textColorBoldLink, typedValue, true);
                    int i3 = typedValue.data;
                    for (C26000Beo c26000Beo : list) {
                        C32966Eex c32966Eex = new C32966Eex(c26000Beo, c5hw, function, i3);
                        int i4 = c26000Beo.A01;
                        if (i4 >= 0 && (i2 = c26000Beo.A00) < spannableStringBuilder.length()) {
                            spannableStringBuilder.setSpan(c32966Eex, i4, i2, 33);
                        } else {
                            C0w9.A07("NewsfeedStoryUtil.addLink()", new IndexOutOfBoundsException(AnonymousClass001.A0p("length: ", ", start: ", AbstractC111324zv.A00(1412), spannableStringBuilder.length(), i4, c26000Beo.A00)));
                        }
                    }
                }
            }
            return spannableStringBuilder;
        }
        Matcher matcher = AbstractC85443rZ.A01().matcher(spannableStringBuilder.toString());
        while (matcher.find()) {
            spannableStringBuilder.setSpan(new C27227Bzm(matcher.group(1), function, 0), matcher.start(1), matcher.end(1), 33);
        }
        Matcher A09 = AbstractC13670mt.A09(spannableStringBuilder.toString());
        while (A09.find()) {
            spannableStringBuilder.setSpan(new C27227Bzm(A09.group(1), function, 1), A09.start(1), A09.end(1), 33);
        }
        return spannableStringBuilder;
    }

    public static String A01(Context context, C26030BfJ c26030BfJ, C5HW c5hw) {
        InterfaceC30949Dj6 interfaceC30949Dj6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(c5hw.A04.A0j)) {
            String str = c5hw.A04.A0j;
            if (!TextUtils.isEmpty(str)) {
                if (AbstractC25231BEo.A1b(c26030BfJ.A00)) {
                    interfaceC30949Dj6 = C29323CwI.A00;
                } else {
                    interfaceC30949Dj6 = C29322CwH.A00;
                }
                interfaceC30949Dj6.E68(spannableStringBuilder, str, new C71679WyX(5));
            }
            A03(context, spannableStringBuilder, c5hw, false);
        } else if (!TextUtils.isEmpty(c5hw.A04.A0o)) {
            spannableStringBuilder.append((CharSequence) c5hw.A04.A0o);
        }
        String str2 = c5hw.A0B;
        if (str2 == null) {
            Double A05 = c5hw.A05();
            if (A05 != null) {
                str2 = C23831Eq.A03(context, A05.doubleValue());
                c5hw.A0B = str2;
            }
            return spannableStringBuilder.toString();
        }
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) str2);
        }
        return spannableStringBuilder.toString();
    }

    public static void A02(Context context, SpannableStringBuilder spannableStringBuilder, UserSession userSession, C5HW c5hw, Function function, boolean z) {
        if ((z || !C18U.A06(C06090Tz.A05, userSession, 36327563534088893L)) && spannableStringBuilder.length() > 100 && !c5hw.A03.A03) {
            int i = 100;
            if (spannableStringBuilder.length() > 101 && AbstractC168797gD.A02(spannableStringBuilder.subSequence(99, 101).toString())) {
                i = 101;
            }
            spannableStringBuilder.delete(i, spannableStringBuilder.length());
            String string = context.getString(2131954794);
            spannableStringBuilder.append((CharSequence) string);
            spannableStringBuilder.setSpan(new C27227Bzm(string, function, context.getColor(AbstractC53242c7.A09(context)), 2), i + 2, i + string.length(), 33);
        }
    }

    public static void A04(Context context, View view, View view2, TextView textView, UserSession userSession, InterfaceC58311Pt3 interfaceC58311Pt3, C26030BfJ c26030BfJ, C5HW c5hw, int i) {
        U9O u9o;
        textView.setText(A00(context, userSession, interfaceC58311Pt3, InterfaceC31118Dm0.A01, c26030BfJ, c5hw, i));
        if (!(view instanceof ConstraintLayout)) {
            C0w9.A03("NewsfeedStoryUtil", "View container is not constraint layout.");
        } else {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int lineCount = textView.getLineCount();
            if (lineCount == 0) {
                textView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC28690Clc(view2, textView, constraintLayout));
            } else {
                A05(view2, textView, constraintLayout, lineCount);
            }
        }
        textView.setContentDescription(A01(context, c26030BfJ, c5hw));
        textView.setTag(R.id.tag_span_touch_key, view);
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        if (((AccessibilityManager) systemService).isEnabled()) {
            u9o = null;
        } else {
            u9o = U9O.A00;
        }
        textView.setMovementMethod(u9o);
    }

    public static void A05(View view, TextView textView, ConstraintLayout constraintLayout, int i) {
        C56302iJ c56302iJ = (C56302iJ) textView.getLayoutParams();
        C110964z8 c110964z8 = new C110964z8();
        c110964z8.A0I(constraintLayout);
        if (i != 1 && textView.getLineCount() != 1) {
            if (c56302iJ.A0u == constraintLayout.getId() && c56302iJ.A0G == -1) {
                return;
            }
            AbstractC13880nE.A0d(textView, textView.getResources().getDimensionPixelSize(R.dimen.album_music_sticker_text_vertical_padding));
            c110964z8.A0C(textView.getId(), 3, constraintLayout.getId(), 3);
            c110964z8.A09(textView.getId(), 4);
        } else {
            if (c56302iJ.A0u == view.getId() && c56302iJ.A0F == view.getId()) {
                return;
            }
            AbstractC13880nE.A0d(textView, 0);
            c110964z8.A0I(constraintLayout);
            c110964z8.A0E(textView.getId(), 4, view.getId(), 4, view.getPaddingTop());
            c110964z8.A0E(textView.getId(), 3, view.getId(), 3, view.getPaddingBottom());
            c110964z8.A0G(constraintLayout);
        }
        c110964z8.A0G(constraintLayout);
    }
}
