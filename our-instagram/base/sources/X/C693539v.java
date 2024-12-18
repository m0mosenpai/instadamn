package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ConfirmationStyle;
import com.instagram.api.schemas.ConfirmationTitleStyle;
import com.instagram.api.schemas.MediaOptionStyle;
import com.instagram.api.schemas.UndoStyle;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.39v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C693539v {
    public static final void A04(InterfaceC84443pn interfaceC84443pn, UserSession userSession, C38321qM c38321qM, C38525Gwl c38525Gwl, C75113Zb c75113Zb) {
        ConfirmationStyle AqJ = interfaceC84443pn.AqJ();
        if (AqJ == null) {
            AqJ = ConfirmationStyle.A07;
        }
        if (AqJ.ordinal() != 1) {
            A01(new ViewOnClickListenerC41882IhK(c38525Gwl), interfaceC84443pn, userSession, c38321qM, c38525Gwl, c75113Zb);
            ConfirmationTitleStyle AqL = interfaceC84443pn.AqL();
            if (AqL == null) {
                AqL = ConfirmationTitleStyle.A04;
            }
            UndoStyle CCV = interfaceC84443pn.CCV();
            if (CCV == null) {
                CCV = UndoStyle.A04;
            }
            A03(AqJ, AqL, CCV, c38525Gwl);
            return;
        }
        C54842OMn c54842OMn = new C54842OMn(userSession);
        List<InterfaceC88183wS> B7a = interfaceC84443pn.B7a();
        if (B7a != null) {
            for (InterfaceC88183wS interfaceC88183wS : B7a) {
                Object obj = MediaOptionStyle.A01.get(interfaceC88183wS.C39());
                if (obj == null) {
                    obj = MediaOptionStyle.A08;
                }
                Context context = c38525Gwl.A07.getContext();
                C14360o3.A07(context);
                String text = interfaceC88183wS.getText();
                boolean z = false;
                if (obj == MediaOptionStyle.A05) {
                    z = true;
                }
                c54842OMn.A03(context, new ViewOnClickListenerC41984IjF(interfaceC88183wS, userSession, c38321qM, c38525Gwl, c75113Zb), text, null, -1, z);
            }
            OJT ojt = new OJT(c54842OMn);
            Context context2 = c38525Gwl.A07.getContext();
            C14360o3.A07(context2);
            ojt.A00(context2);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A06(C38525Gwl c38525Gwl) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(200L).setInterpolator(new LinearInterpolator());
        View view = c38525Gwl.A0B;
        view.setAlpha(0.0f);
        view.setVisibility(0);
        ofFloat.addUpdateListener(new C41780Iew(c38525Gwl));
        ofFloat.addListener(new C39406Haq(c38525Gwl));
        ofFloat.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A09(C51757Mtg c51757Mtg, UserSession userSession, C38525Gwl c38525Gwl, C75113Zb c75113Zb) {
        MUW muw;
        int i;
        ImmutableList copyOf;
        C75113Zb c75113Zb2;
        C14360o3.A0B(c75113Zb, 2);
        c38525Gwl.A01();
        C37995Gng c37995Gng = (C37995Gng) c51757Mtg.A00;
        C26066Bfu c26066Bfu = (C26066Bfu) ((InterfaceC16820sZ) c37995Gng.A01).invoke();
        Resources resources = c38525Gwl.itemView.getContext().getResources();
        C5QE c5qe = (C5QE) c26066Bfu.A03;
        if (c5qe != null) {
            TextView textView = c38525Gwl.A0F;
            C14360o3.A0A(resources);
            C14360o3.A0B(resources, 0);
            textView.setText(c5qe.A01(resources));
        }
        C5QE c5qe2 = (C5QE) c26066Bfu.A02;
        if (c5qe2 != null) {
            TextView textView2 = c38525Gwl.A0E;
            textView2.setVisibility(0);
            C14360o3.A0A(resources);
            C14360o3.A0B(resources, 0);
            textView2.setText(c5qe2.A01(resources));
        }
        C5QE c5qe3 = (C5QE) c26066Bfu.A04;
        if (c5qe3 != null) {
            TextView textView3 = c38525Gwl.A0G;
            C14360o3.A0A(resources);
            C14360o3.A0B(resources, 0);
            textView3.setText(c5qe3.A01(resources));
        }
        if (c26066Bfu.A0B) {
            ViewOnClickListenerC41879IhH viewOnClickListenerC41879IhH = new ViewOnClickListenerC41879IhH(c51757Mtg);
            TextView textView4 = c38525Gwl.A0G;
            textView4.getPaint().setFakeBoldText(true);
            AbstractC56952jT.A01(textView4);
            C0fQ.A00(viewOnClickListenerC41879IhH, textView4);
            IQZ.A01(c38525Gwl, 0);
        }
        if (c26066Bfu.A09) {
            C38321qM c38321qM = c38525Gwl.A01;
            if (c38321qM != null) {
                View view = c38525Gwl.A06;
                C0fQ.A00(new ViewOnClickListenerC41902Ihv(c38321qM, c38525Gwl), view);
                view.setVisibility(0);
                view.bringToFront();
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (c26066Bfu.A07) {
            IQZ.A01(c38525Gwl, 8);
        }
        if (c26066Bfu.A08 && (c75113Zb2 = c38525Gwl.A03) != null) {
            c75113Zb2.A0L(c38525Gwl, null, false);
        }
        if (c26066Bfu.A0A) {
            if (((InterfaceC16820sZ) c37995Gng.A04).invoke() != null) {
                C38321qM c38321qM2 = c38525Gwl.A01;
                if (c38321qM2 != null) {
                    A04((InterfaceC84443pn) ((InterfaceC16820sZ) c37995Gng.A05).invoke(), userSession, c38321qM2, c38525Gwl, c75113Zb);
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else if (((InterfaceC16820sZ) c37995Gng.A02).invoke() != null) {
                C38321qM c38321qM3 = c38525Gwl.A01;
                if (c38321qM3 != null) {
                    List list = c38321qM3.A0S;
                    if (list != null && (copyOf = ImmutableList.copyOf((Collection) list)) != null) {
                        c38525Gwl.A02(copyOf.size());
                        int size = copyOf.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            H3M h3m = (H3M) copyOf.get(i2);
                            Object obj = c38525Gwl.A0J.get(i2);
                            C14360o3.A07(obj);
                            View view2 = (View) obj;
                            String str = h3m.A00;
                            String str2 = h3m.A01;
                            View requireViewById = view2.requireViewById(R.id.survey_tombstone_reason_text);
                            C14360o3.A07(requireViewById);
                            ((TextView) requireViewById).setText(str2);
                            C0fQ.A00(new ViewOnClickListenerC41966Iix(c38321qM3, c38525Gwl, c75113Zb, str), view2);
                        }
                        i = 2131973185;
                    } else {
                        c38525Gwl.A02(0);
                        i = 2131975675;
                    }
                    String string = c38525Gwl.A08.getResources().getString(i);
                    C14360o3.A07(string);
                    c38525Gwl.A03(new ViewOnClickListenerC41882IhK(c38525Gwl), UndoStyle.A04, C05F.A01, string, null);
                    A02(new ViewOnClickListenerC41933IiQ(c38321qM3, c38525Gwl, c75113Zb), c38525Gwl);
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        }
        if (c26066Bfu.A06 && (muw = (MUW) c26066Bfu.A05) != null) {
            String str3 = muw.A02;
            Integer num = (Integer) muw.A00;
            String str4 = muw.A03;
            UndoStyle undoStyle = (UndoStyle) muw.A01;
            c38525Gwl.A03(new ViewOnClickListenerC41882IhK(c38525Gwl), undoStyle, num, str3, str4);
            C06090Tz c06090Tz = C06090Tz.A05;
            boolean A06 = C18U.A06(c06090Tz, userSession, 36311938443707207L);
            int i3 = 2;
            int i4 = 1;
            if (A06) {
                i4 = 2;
            }
            boolean A062 = C18U.A06(c06090Tz, userSession, 36311938443772744L);
            if (A062) {
                i4++;
            }
            c38525Gwl.A02(i4);
            ArrayList arrayList = c38525Gwl.A0J;
            Object obj2 = arrayList.get(0);
            C14360o3.A07(obj2);
            View view3 = (View) obj2;
            View requireViewById2 = view3.requireViewById(R.id.survey_tombstone_reason_text);
            C14360o3.A07(requireViewById2);
            String string2 = view3.getContext().getString(2131972402);
            C14360o3.A07(string2);
            ((TextView) requireViewById2).setText(string2);
            C0fQ.A00(new ViewOnClickListenerC41903Ihw(c51757Mtg, c38525Gwl), view3);
            if (A06) {
                Object obj3 = arrayList.get(1);
                C14360o3.A07(obj3);
                View view4 = (View) obj3;
                View requireViewById3 = view4.requireViewById(R.id.survey_tombstone_reason_text);
                C14360o3.A07(requireViewById3);
                String string3 = view4.getContext().getString(2131968099, c51757Mtg.A02);
                C14360o3.A07(string3);
                ((TextView) requireViewById3).setText(string3);
                C0fQ.A00(new ViewOnClickListenerC41880IhI(c51757Mtg), view4);
            } else {
                i3 = 1;
            }
            if (A062) {
                Object obj4 = arrayList.get(i3);
                C14360o3.A07(obj4);
                View view5 = (View) obj4;
                View requireViewById4 = view5.requireViewById(R.id.survey_tombstone_reason_text);
                C14360o3.A07(requireViewById4);
                String string4 = view5.getContext().getString(2131976084, c51757Mtg.A02);
                C14360o3.A07(string4);
                ((TextView) requireViewById4).setText(string4);
                C0fQ.A00(new ViewOnClickListenerC41881IhJ(c51757Mtg), view5);
            }
            if (undoStyle == UndoStyle.A04) {
                C38321qM c38321qM4 = (C38321qM) c51757Mtg.A01;
                if (c38321qM4 != null) {
                    A02(new ViewOnClickListenerC41933IiQ(c38321qM4, c38525Gwl, c75113Zb), c38525Gwl);
                    return;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            A07(c38525Gwl, 8);
            IQZ.A01(c38525Gwl, 8);
        }
    }

    public static final View A00(Context context, ViewGroup viewGroup, String str, int i) {
        C693439u.A02 = str;
        View inflate = LayoutInflater.from(context).inflate(R.layout.row_feed_tombstone, viewGroup, false);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(inflate);
        inflate.setTag(new C38525Gwl(inflate, i));
        return inflate;
    }

    public static final void A01(View.OnClickListener onClickListener, InterfaceC84443pn interfaceC84443pn, UserSession userSession, C38321qM c38321qM, C38525Gwl c38525Gwl, C75113Zb c75113Zb) {
        int i;
        UndoStyle undoStyle;
        Context context;
        int i2;
        int i3;
        C18U.A06(C06090Tz.A05, userSession, 36317079518843678L);
        List B7a = interfaceC84443pn.B7a();
        if (B7a != null) {
            c38525Gwl.A02(B7a.size());
            int size = B7a.size();
            for (int i4 = 0; i4 < size; i4++) {
                InterfaceC88183wS interfaceC88183wS = (InterfaceC88183wS) B7a.get(i4);
                Object obj = c38525Gwl.A0J.get(i4);
                C14360o3.A07(obj);
                View view = (View) obj;
                View requireViewById = view.requireViewById(R.id.survey_tombstone_reason);
                C14360o3.A07(requireViewById);
                LinearLayout linearLayout = (LinearLayout) requireViewById;
                View requireViewById2 = view.requireViewById(R.id.survey_tombstone_reason_text);
                C14360o3.A07(requireViewById2);
                TextView textView = (TextView) requireViewById2;
                MediaOptionStyle mediaOptionStyle = (MediaOptionStyle) MediaOptionStyle.A01.get(interfaceC88183wS.C39());
                if (mediaOptionStyle == null) {
                    mediaOptionStyle = MediaOptionStyle.A08;
                }
                int ordinal = mediaOptionStyle.ordinal();
                if (ordinal != 1) {
                    context = textView.getContext();
                    if (ordinal != 2) {
                        i2 = R.attr.igds_color_primary_text;
                    } else {
                        i2 = R.attr.igds_color_error_or_destructive;
                    }
                } else {
                    context = textView.getContext();
                    i2 = R.attr.igds_color_primary_button;
                }
                textView.setTextColor(context.getColor(AbstractC53242c7.A0H(context, i2)));
                CharSequence fromHtml = Html.fromHtml(interfaceC88183wS.getText(), 63);
                C14360o3.A07(fromHtml);
                if (c38321qM != null) {
                    Context context2 = c38525Gwl.A08.getContext();
                    C14360o3.A07(context2);
                    C14360o3.A0B(userSession, 0);
                    C85383rT c85383rT = new C85383rT(new SpannableStringBuilder(fromHtml), userSession);
                    c85383rT.A0L = true;
                    c85383rT.A01 = AbstractC53242c7.A0F(context2, R.attr.textColorBoldLink);
                    c85383rT.A03(new C85393rU(userSession, c38321qM, false));
                    c85383rT.A0Q = true;
                    fromHtml = c85383rT.A00();
                    C14360o3.A07(fromHtml);
                }
                textView.setText(fromHtml);
                textView.getPaint().setFakeBoldText(false);
                if (mediaOptionStyle == MediaOptionStyle.A07) {
                    linearLayout.setGravity(3);
                }
                View requireViewById3 = view.requireViewById(R.id.survey_tombstone_reason_icon);
                C14360o3.A07(requireViewById3);
                ImageView imageView = (ImageView) requireViewById3;
                EnumC39593He3 A01 = IQd.A01(interfaceC88183wS.getId());
                if (interfaceC88183wS.BwU() && A01 != null && (i3 = A01.A00) != 0) {
                    imageView.setVisibility(0);
                    imageView.setImageResource(i3);
                    linearLayout.setGravity(19);
                }
                if (c38321qM != null && c75113Zb != null) {
                    C0fQ.A00(new ViewOnClickListenerC41984IjF(interfaceC88183wS, userSession, c38321qM, c38525Gwl, c75113Zb), view);
                }
            }
            i = 2131973185;
        } else {
            c38525Gwl.A02(0);
            i = 2131975675;
        }
        String AqK = interfaceC84443pn.AqK();
        String AqH = interfaceC84443pn.AqH();
        if (AqH == null || AqH.length() == 0) {
            AqH = c38525Gwl.A08.getResources().getString(i);
        }
        Integer A00 = CJ0.A00(interfaceC84443pn.AqI());
        UndoStyle CCV = interfaceC84443pn.CCV();
        if (AqH != null) {
            if (CCV == null) {
                undoStyle = UndoStyle.A04;
            } else {
                undoStyle = CCV;
            }
            c38525Gwl.A03(onClickListener, undoStyle, A00, AqH, AqK);
        }
        if (CCV == UndoStyle.A04) {
            if (c38321qM != null && c75113Zb != null) {
                A02(new ViewOnClickListenerC41933IiQ(c38321qM, c38525Gwl, c75113Zb), c38525Gwl);
                return;
            } else {
                A02(onClickListener, c38525Gwl);
                return;
            }
        }
        A07(c38525Gwl, 8);
        IQZ.A01(c38525Gwl, 8);
    }

    public static final void A02(View.OnClickListener onClickListener, C38525Gwl c38525Gwl) {
        TextView textView = c38525Gwl.A0I;
        Context context = textView.getContext();
        textView.getPaint().setFakeBoldText(true);
        AbstractC56952jT.A01(textView);
        C0fQ.A00(onClickListener, textView);
        C14360o3.A0A(context);
        textView.setTextColor(C02G.A02(context, C1QI.A01(context)));
        A07(c38525Gwl, 0);
    }

    public static final void A03(ConfirmationStyle confirmationStyle, ConfirmationTitleStyle confirmationTitleStyle, UndoStyle undoStyle, C38525Gwl c38525Gwl) {
        View view = c38525Gwl.A07;
        Context context = view.getContext();
        boolean z = false;
        if (confirmationStyle == ConfirmationStyle.A08) {
            z = true;
        }
        View view2 = c38525Gwl.A00;
        if (view2 != null) {
            View requireViewById = view2.requireViewById(R.id.tombstone_header_text);
            C14360o3.A07(requireViewById);
            TextView textView = (TextView) requireViewById;
            textView.setAccessibilityHeading(true);
            textView.setFocusable(1);
            View requireViewById2 = view2.requireViewById(R.id.tombstone_feedback_text);
            C14360o3.A07(requireViewById2);
            TextView textView2 = (TextView) requireViewById2;
            View view3 = null;
            if (undoStyle == UndoStyle.A04) {
                view3 = c38525Gwl.A0I;
            } else {
                ArrayList arrayList = c38525Gwl.A0J;
                if (arrayList.size() > 0 && z) {
                    view3 = ((View) arrayList.get(arrayList.size() - 1)).requireViewById(R.id.survey_tombstone_reason);
                }
            }
            int color = context.getColor(AbstractC53242c7.A0H(context, R.attr.igdsPrimaryBackground));
            int color2 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igdsSecondaryBackground));
            int color3 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text));
            int color4 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igdsSecondaryText));
            if (z) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                view.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                view.setBackgroundColor(color);
                if (confirmationTitleStyle == ConfirmationTitleStyle.A05) {
                    textView.setGravity(3);
                    textView2.setGravity(3);
                    textView2.setTextSize(2, 12.0f);
                    textView.setTextAppearance(R.style.igds_emphasized_title);
                } else {
                    textView.setGravity(17);
                    textView2.setGravity(1);
                    textView2.setTextSize(2, 14.0f);
                    textView.setTextAppearance(R.style.igds_emphasized_body_1);
                    AbstractC54027Nud.A00(textView);
                }
                if (textView.getVisibility() == 0) {
                    color3 = color4;
                }
                textView2.setTextColor(color3);
                if (view3 != null) {
                    view2.setBackgroundResource(R.drawable.rounded_top_corner_background);
                    view3.setBackgroundResource(R.drawable.rounded_bottom_corner_background);
                    return;
                } else {
                    view2.setBackgroundResource(R.drawable.rounded_corner_background_secondary_color);
                    return;
                }
            }
            view.setPadding(0, view.getPaddingTop(), 0, view.getPaddingBottom());
            view.setBackgroundColor(color2);
            view2.setBackgroundColor(color2);
            textView.setTextAppearance(R.style.igds_body_1);
            textView.setTextColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text)));
            textView.setGravity(17);
            textView2.setTextColor(color4);
            if (view3 == null) {
                return;
            }
            view3.setBackgroundColor(color2);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A05(C38321qM c38321qM, C38525Gwl c38525Gwl, C75113Zb c75113Zb) {
        View view = c38525Gwl.A00;
        if (view != null) {
            view.setVisibility(8);
            IQZ.A00(c38525Gwl);
            TextView textView = c38525Gwl.A0F;
            textView.setText(2131975674);
            textView.getPaint().setFakeBoldText(true);
            ViewOnClickListenerC41930IiN viewOnClickListenerC41930IiN = new ViewOnClickListenerC41930IiN(c38321qM, c38525Gwl, c75113Zb);
            TextView textView2 = c38525Gwl.A0G;
            textView2.getPaint().setFakeBoldText(true);
            AbstractC56952jT.A01(textView2);
            C0fQ.A00(viewOnClickListenerC41930IiN, textView2);
            IQZ.A01(c38525Gwl, 0);
            A06(c38525Gwl);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A07(C38525Gwl c38525Gwl, int i) {
        c38525Gwl.A0C.setVisibility(i);
        c38525Gwl.A0I.setVisibility(i);
    }

    public static final void A08(C38525Gwl c38525Gwl, boolean z) {
        TextView textView = c38525Gwl.A0H;
        textView.setVisibility(0);
        textView.setText(2131975676);
        textView.getPaint().setFakeBoldText(true);
        IQZ.A01(c38525Gwl, 8);
        TextView textView2 = c38525Gwl.A0F;
        textView2.setText(2131975675);
        textView2.getPaint().setFakeBoldText(true);
        TextView textView3 = c38525Gwl.A0E;
        if (z) {
            textView3.setVisibility(0);
            textView3.setText(2131975658);
        } else {
            textView3.setVisibility(4);
        }
    }
}
