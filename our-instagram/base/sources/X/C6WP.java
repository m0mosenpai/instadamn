package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.reels.Reel;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.6WP, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6WP {
    public static C41181vS A00;
    public static InterfaceC1119053c A01;
    public static boolean A03;
    public static C141596ac A04;
    public static final HashMap A05 = new HashMap();
    public static final HashSet A06 = new HashSet();
    public static Integer A02 = C05F.A00;

    public static final void A00() {
        A03 = false;
        if (A02 != C05F.A01) {
            C141596ac c141596ac = A04;
            if (c141596ac == null) {
                C14360o3.A0F("itemState");
                throw C00O.createAndThrow();
            }
            A04(A00, c141596ac);
        }
    }

    public static final void A02(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C41181vS c41181vS, C41551w4 c41551w4, C141596ac c141596ac, C6UN c6un, boolean z) {
        H7Z h7z;
        String str;
        String str2;
        String str3;
        List list;
        H7Z h7z2;
        String str4;
        String str5;
        int i;
        List list2;
        A00 = c41181vS;
        A04 = c141596ac;
        if (z) {
            c141596ac.A02(0.0f);
            A03 = false;
            A02 = C05F.A00;
        }
        c6un.A04.setVisibility(0);
        Reel reel = c41551w4.A0H;
        C38541qi c38541qi = reel.A0I;
        String str6 = null;
        if (c38541qi != null && (list2 = c38541qi.A09) != null) {
            h7z = (H7Z) AbstractC001800i.A0O(list2, 0);
        } else {
            h7z = null;
        }
        C38541qi c38541qi2 = reel.A0I;
        if (c38541qi2 != null) {
            str = c38541qi2.A06;
        } else {
            str = null;
        }
        if (h7z != null && str != null && str.length() != 0) {
            IgTextView igTextView = c6un.A02;
            if (igTextView != null) {
                String str7 = h7z.A02;
                if (str7 == null) {
                    str7 = "";
                }
                igTextView.setText(str7);
                LinearLayout linearLayout = c6un.A01;
                if (linearLayout != null) {
                    int i2 = 0;
                    linearLayout.setVisibility(0);
                    linearLayout.removeAllViews();
                    List<H6R> list3 = h7z.A04;
                    if (list3 != null && Integer.valueOf(list3.size()) != null) {
                        for (H6R h6r : list3) {
                            String str8 = h7z.A01;
                            if (str8 != null) {
                                String str9 = A46.A00;
                                if (str9 != null && !str8.equals(str9)) {
                                    A46.A01.clear();
                                }
                                if (A46.A01.isEmpty()) {
                                    A46.A00 = str8;
                                }
                            }
                            if (C18U.A06(C06090Tz.A05, userSession, 2342172599972282788L)) {
                                str4 = "v3";
                            } else {
                                str4 = "v2";
                            }
                            boolean equals = str4.equals("v3");
                            int i3 = R.layout.brand_survey_question_answer_row_view_v2;
                            if (equals) {
                                i3 = R.layout.brand_survey_question_answer_row_view_v3;
                            }
                            View inflate = LayoutInflater.from(linearLayout.getContext()).inflate(i3, (ViewGroup) linearLayout, false);
                            C14360o3.A0A(inflate);
                            OEY oey = new OEY(inflate);
                            inflate.setTag(oey);
                            oey.A00 = str4;
                            TextView textView = oey.A05;
                            if (textView != null) {
                                Context context = textView.getContext();
                                if (context != null) {
                                    i = Math.round(50.0f * context.getResources().getDisplayMetrics().density);
                                } else {
                                    i = 0;
                                }
                                textView.setMinHeight(i);
                            }
                            View view = oey.A03;
                            if (view != null) {
                                view.setVisibility(0);
                            }
                            Object tag = inflate.getTag();
                            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.reels.viewer.sponsored.BrandSurveyAnswerRowViewBinder.Holder");
                            OEY oey2 = (OEY) tag;
                            int i4 = i2 + 1;
                            HashSet hashSet = (HashSet) A05.get(str8);
                            C14360o3.A0B(oey2, 0);
                            C14360o3.A0B(h6r, 1);
                            TextView textView2 = oey2.A05;
                            if (textView2 != null) {
                                if (hashSet != null) {
                                    A46.A01 = hashSet;
                                }
                                textView2.setText(h6r.A02);
                                textView2.setGravity(16);
                                TextView textView3 = oey2.A06;
                                if (textView3 != null) {
                                    if (i2 >= 0 && i2 <= 25) {
                                        str5 = String.valueOf((char) ((i2 % 26) + 65));
                                    } else {
                                        str5 = "";
                                    }
                                    textView3.setText(str5);
                                }
                                if (C14360o3.A0K(oey2.A00, "v3")) {
                                    textView2.setTextAppearance(R.style.igds_emphasized_body_1);
                                    AbstractC54027Nud.A00(textView2);
                                }
                                HashSet hashSet2 = A46.A01;
                                boolean z2 = true;
                                String str10 = h6r.A03;
                                if (!hashSet2.contains(str10)) {
                                    z2 = false;
                                }
                                if (z2) {
                                    ImageView imageView = oey2.A04;
                                    if (imageView != null) {
                                        imageView.setVisibility(0);
                                    }
                                    View view2 = oey2.A02;
                                    if (view2 != null) {
                                        view2.setVisibility(8);
                                    }
                                    boolean contains = A46.A01.contains(str10);
                                    Drawable drawable = null;
                                    View view3 = oey2.A01;
                                    if (!contains) {
                                        if (view3 != null) {
                                            view3.setBackgroundResource(R.drawable.brand_survey_answer_background_transition);
                                            drawable = view3.getBackground();
                                        }
                                        TransitionDrawable transitionDrawable = (TransitionDrawable) drawable;
                                        if (str10 != null) {
                                            A46.A01.add(str10);
                                        }
                                        if (transitionDrawable != null) {
                                            transitionDrawable.startTransition(150);
                                        }
                                    } else {
                                        if (view3 != null) {
                                            view3.setBackground(null);
                                        }
                                        boolean A0K = C14360o3.A0K(oey2.A00, "v3");
                                        int i5 = R.drawable.brand_survey_answer_background_selected;
                                        if (A0K) {
                                            i5 = R.drawable.brand_survey_answer_background_selected_v3;
                                        }
                                        if (view3 != null) {
                                            view3.setBackgroundResource(i5);
                                        }
                                    }
                                    if (C14360o3.A0K(oey2.A00, "v2")) {
                                        Context context2 = textView2.getContext();
                                        textView2.setTextColor(context2.getColor(AbstractC53242c7.A0E(context2)));
                                    }
                                } else {
                                    A46.A01.remove(str10);
                                    ImageView imageView2 = oey2.A04;
                                    if (imageView2 != null) {
                                        imageView2.setVisibility(8);
                                    }
                                    View view4 = oey2.A02;
                                    if (view4 != null) {
                                        view4.setVisibility(0);
                                    }
                                    View view5 = oey2.A01;
                                    if (view5 != null) {
                                        view5.setBackgroundResource(R.drawable.brand_survey_answer_background);
                                    }
                                }
                                linearLayout.addView(inflate);
                                i2 = i4;
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    }
                    C38541qi c38541qi3 = reel.A0I;
                    if (c38541qi3 != null && (list = c38541qi3.A09) != null && (h7z2 = (H7Z) AbstractC001800i.A0O(list, 0)) != null) {
                        str6 = h7z2.A03;
                    }
                    boolean equals2 = str6 != null ? str6.equals("multiple") : false;
                    A03(h7z, c6un, str, equals2);
                    IgdsButton igdsButton = c6un.A03;
                    if (igdsButton != null) {
                        C0fQ.A00(new ViewOnClickListenerC42002IjX(userSession, interfaceC60442pS, c41181vS, c41551w4, c6un, str), igdsButton);
                        if (A02 != C05F.A01) {
                            A04(c41181vS, c141596ac);
                        }
                        C38541qi c38541qi4 = reel.A0I;
                        if (c38541qi4 != null && (str3 = c38541qi4.A06) != null && str3.length() != 0) {
                            LinearLayout linearLayout2 = c6un.A01;
                            if (linearLayout2 != null) {
                                int childCount = linearLayout2.getChildCount();
                                for (int i6 = 0; i6 < childCount; i6++) {
                                    LinearLayout linearLayout3 = c6un.A01;
                                    if (linearLayout3 != null) {
                                        C0fQ.A00(new ViewOnClickListenerC42016Ijl(userSession, interfaceC60442pS, h7z, c41181vS, c41551w4, c141596ac, c6un, str3, i6, equals2), linearLayout3.getChildAt(i6));
                                    }
                                }
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        str2 = "submitButton";
                    }
                }
                str2 = "questionList";
            } else {
                str2 = "questionTitle";
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
    }

    public static final void A01(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C38541qi c38541qi, String str) {
        if (c38541qi != null && str != null && str.length() != 0) {
            A06.add(str);
            List list = c38541qi.A09;
            H7Z h7z = null;
            if (list != null) {
                h7z = (H7Z) AbstractC001800i.A0O(list, 0);
            }
            String A0R = AnonymousClass001.A0R("instagram_ad_", "survey_question_response");
            if (h7z != null && A0R != null) {
                HashMap hashMap = A05;
                String str2 = h7z.A01;
                HashSet hashSet = (HashSet) hashMap.get(str2);
                C14360o3.A0C(hashSet, "null cannot be cast to non-null type java.util.HashSet<kotlin.String>");
                C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS, A0R);
                c82713mZ.A7Q = c38541qi.A08;
                c82713mZ.A6e = str2;
                c82713mZ.A8A = new ArrayList(hashSet);
                c82713mZ.A73 = "in_feed_survey";
                C32U.A0H(userSession, c82713mZ, interfaceC60442pS);
            }
            new Handler(Looper.getMainLooper()).postDelayed(RunnableC43162J5z.A00, 2000L);
        }
    }

    public static final void A03(H7Z h7z, C6UN c6un, String str, boolean z) {
        boolean z2;
        boolean A0u = AbstractC001800i.A0u(A06, str);
        boolean z3 = true;
        AbstractCollection abstractCollection = (AbstractCollection) A05.get(h7z.A01);
        if (abstractCollection != null) {
            z2 = abstractCollection.isEmpty();
        } else {
            z2 = true;
        }
        IgdsButton igdsButton = c6un.A03;
        if (z) {
            if (igdsButton != null) {
                igdsButton.setVisibility(0);
                IgdsButton igdsButton2 = c6un.A03;
                if (igdsButton2 != null) {
                    if (A0u || z2) {
                        z3 = false;
                    }
                    igdsButton2.setEnabled(z3);
                    return;
                }
            }
        } else if (igdsButton != null) {
            igdsButton.setVisibility(8);
            return;
        }
        C14360o3.A0F("submitButton");
        throw C00O.createAndThrow();
    }

    public static final void A04(C41181vS c41181vS, C141596ac c141596ac) {
        if (c141596ac.A0B < 1.0f && !A03) {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC43125J4o(c41181vS, c141596ac), 100L);
        }
    }
}
