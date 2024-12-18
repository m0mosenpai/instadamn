package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3ye, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC89383ye {
    public static final SpannableStringBuilder A00(Context context, C51761Mtk c51761Mtk, UserSession userSession, C38321qM c38321qM, CPA cpa, C75113Zb c75113Zb, int i, int i2) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c51761Mtk, 2);
        C14360o3.A0B(cpa, 3);
        return AbstractC76633c8.A00(context, userSession, c38321qM, null, null, "sans-serif-medium", new D8M(46, cpa, c51761Mtk), new C30509Dbs(i2, 48, c51761Mtk, c75113Zb, cpa), i, false);
    }

    public static final SpannableStringBuilder A01(Context context, UserSession userSession, C77143d0 c77143d0, final C100584fN c100584fN, final C76593c4 c76593c4, final int i) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c76593c4, 2);
        C14360o3.A0B(c100584fN, 3);
        C14360o3.A0B(c77143d0, 5);
        List list = c76593c4.A03;
        int size = list.size();
        boolean z = false;
        if (new ArrayList(list).size() > 2) {
            z = true;
        }
        SpannableStringBuilder A00 = AbstractC100574fM.A00(context, userSession, new InterfaceC85403rV() { // from class: X.4fO
            @Override // X.InterfaceC85403rV
            public final void D4A(ClickableSpan clickableSpan, View view, UserSession userSession2, String str) {
                String str2;
                C14360o3.A0B(userSession2, 0);
                C14360o3.A0B(str, 1);
                C14360o3.A0B(view, 2);
                C76593c4 c76593c42 = c76593c4;
                for (User user : c76593c42.A03) {
                    if (user != null) {
                        str2 = user.getUsername();
                    } else {
                        str2 = null;
                    }
                    if (C14360o3.A0K(str2, str)) {
                        C71313Hs.A00(userSession2).A0B(view, new String[0]);
                        C100584fN c100584fN2 = c100584fN;
                        int i2 = i;
                        C14360o3.A0B(user, 1);
                        C100544fJ c100544fJ = c100584fN2.A00;
                        C38321qM c38321qM = c76593c42.A01;
                        C75113Zb c75113Zb = c76593c42.A02;
                        C14360o3.A0B(c38321qM, 0);
                        C14360o3.A0B(c75113Zb, 1);
                        c100544fJ.A00.D4g(c38321qM, c75113Zb, user.getId(), i2, false);
                        return;
                    }
                }
                C100544fJ c100544fJ2 = c100584fN.A00;
                C38321qM c38321qM2 = c76593c42.A01;
                C75113Zb c75113Zb2 = c76593c42.A02;
                C14360o3.A0B(c38321qM2, 0);
                C14360o3.A0B(c75113Zb2, 1);
                c100544fJ2.A00.D4e(c38321qM2, c75113Zb2, true);
            }
        }, "sans-serif-medium", list, size, c77143d0.A09, z, true, false).A00();
        C14360o3.A07(A00);
        return A00;
    }

    public static final void A02(Context context, SpannableStringBuilder spannableStringBuilder, int i) {
        if (spannableStringBuilder.length() != 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(" • ");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, spannableStringBuilder.length(), 0);
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) context.getString(2131962752));
        spannableStringBuilder.setSpan(foregroundColorSpan, length2, spannableStringBuilder.length(), 33);
    }

    public static final void A03(Context context, SpannableStringBuilder spannableStringBuilder, int i) {
        if (spannableStringBuilder.length() != 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(" • ");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, spannableStringBuilder.length(), 0);
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) context.getString(2131964611));
        spannableStringBuilder.setSpan(foregroundColorSpan, length2, spannableStringBuilder.length(), 33);
    }

    public static final void A04(Context context, SpannableStringBuilder spannableStringBuilder, UserSession userSession, C38321qM c38321qM, C77613dl c77613dl, C76743cM c76743cM, String str, int i, int i2) {
        EnumC124565kK enumC124565kK;
        int i3;
        C14360o3.A0B(str, 2);
        String A2u = c38321qM.A2u();
        if (c38321qM.A5P()) {
            enumC124565kK = EnumC124565kK.REEL;
        } else {
            enumC124565kK = EnumC124565kK.POST;
        }
        AbstractC86593tX.A0e(enumC124565kK, c38321qM.A1J(), userSession, null, str, "genai_transparency_label_impression", A2u);
        boolean A01 = C124575kL.A01(userSession);
        if (spannableStringBuilder.length() != 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(" • ");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, spannableStringBuilder.length(), 0);
        }
        C44327JiP c44327JiP = new C44327JiP(c77613dl, c76743cM, i);
        int length2 = spannableStringBuilder.length();
        if (!A01) {
            Drawable drawable = context.getDrawable(R.drawable.instagram_third_party_gen_ai_pano_outline_24);
            if (drawable != null) {
                Drawable mutate = drawable.mutate();
                if (mutate != null) {
                    mutate.setColorFilter(C3DY.A00(i));
                }
                drawable.setBounds(0, 0, i2, i2);
            }
            spannableStringBuilder.append(" ");
            if (drawable != null) {
                spannableStringBuilder.setSpan(new C85973sR(drawable), length2, length2 + 1, 33);
                spannableStringBuilder.append(" ");
                i3 = 2131963164;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            i3 = 2131963165;
        }
        spannableStringBuilder.append((CharSequence) context.getString(i3));
        spannableStringBuilder.setSpan(c44327JiP, length2 + 1, spannableStringBuilder.length(), 33);
    }

    public static final void A05(Context context, SpannableStringBuilder spannableStringBuilder, C38321qM c38321qM, C77613dl c77613dl, C76743cM c76743cM, int i, int i2) {
        String str;
        if (spannableStringBuilder.length() != 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(" • ");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, spannableStringBuilder.length(), 0);
        }
        Drawable drawable = context.getDrawable(R.drawable.instagram_app_horizon_pano_filled_24);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            if (mutate != null) {
                mutate.setColorFilter(C3DY.A00(i));
            }
            drawable.setBounds(0, 0, i2, i2);
        }
        C44389JjS c44389JjS = new C44389JjS(c77613dl, c76743cM, i);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append(" ");
        if (drawable != null) {
            C85973sR c85973sR = new C85973sR(drawable);
            int i3 = length2 + 1;
            spannableStringBuilder.setSpan(c85973sR, length2, i3, 33);
            spannableStringBuilder.append(" ");
            InterfaceC43580JMo CHL = c38321qM.A0C.CHL();
            if (CHL == null || (str = CHL.getAttributionTitle()) == null) {
                str = "Meta Horizon";
            }
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.setSpan(c44389JjS, i3, spannableStringBuilder.length(), 33);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A06(Context context, SpannableStringBuilder spannableStringBuilder, final C38321qM c38321qM, final InterfaceC75453aC interfaceC75453aC, final C75113Zb c75113Zb, final int i) {
        CharSequence string;
        String A2n = c38321qM.A2n();
        String A2m = c38321qM.A2m();
        if (A2m != null && !AbstractC001900j.A0T(A2m) && A2n != null && !AbstractC001900j.A0T(A2n)) {
            string = CJ1.A00(A2m, A2n);
        } else {
            string = context.getString(2131974885);
            C14360o3.A0A(string);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string);
        spannableStringBuilder2.setSpan(new AnonymousClass522(c38321qM, interfaceC75453aC, c75113Zb, i) { // from class: X.521
            public final /* synthetic */ C38321qM A00;
            public final /* synthetic */ InterfaceC75453aC A01;
            public final /* synthetic */ C75113Zb A02;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(Integer.valueOf(i));
            }

            @Override // X.AnonymousClass522, android.text.style.ClickableSpan
            public final void onClick(View view) {
                InterfaceC75453aC interfaceC75453aC2 = this.A01;
                C38321qM c38321qM2 = this.A00;
                C75113Zb c75113Zb2 = this.A02;
                interfaceC75453aC2.D4i(c38321qM2, c75113Zb2, c75113Zb2.getPosition());
            }
        }, 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
    }

    public static final void A07(Context context, SpannableStringBuilder spannableStringBuilder, C77143d0 c77143d0, long j) {
        C14360o3.A0B(spannableStringBuilder, 0);
        C14360o3.A0B(c77143d0, 3);
        spannableStringBuilder.append(" ");
        int length = spannableStringBuilder.length();
        Resources resources = context.getResources();
        C14360o3.A07(resources);
        spannableStringBuilder.append((CharSequence) C23831Eq.A09(resources, j));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(c77143d0.A05), length, spannableStringBuilder.length(), 33);
    }

    public static final void A08(Context context, SpannableStringBuilder spannableStringBuilder, C77613dl c77613dl, C76743cM c76743cM, int i, int i2) {
        if (spannableStringBuilder.length() > 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(" • ");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, spannableStringBuilder.length(), 0);
        }
        C44388JjR c44388JjR = new C44388JjR(c77613dl, c76743cM, i);
        Drawable drawable = context.getDrawable(R.drawable.instagram_gen_ai_pano_filled_24);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            if (mutate != null) {
                mutate.setColorFilter(C3DY.A00(i));
            }
            drawable.setBounds(0, 0, i2, i2);
        }
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append(" ");
        if (drawable != null) {
            int i3 = length2 + 1;
            spannableStringBuilder.setSpan(new C85973sR(drawable), length2, i3, 33);
            spannableStringBuilder.append((CharSequence) AnonymousClass001.A0D(context.getString(2131971708), ' '));
            spannableStringBuilder.setSpan(c44388JjR, i3, spannableStringBuilder.length(), 33);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A09(Context context, SpannableStringBuilder spannableStringBuilder, C77613dl c77613dl, C76743cM c76743cM, String str, int i) {
        if (spannableStringBuilder.length() != 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(" • ");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, spannableStringBuilder.length(), 0);
        }
        Drawable drawable = context.getDrawable(R.drawable.instagram_glasses_pano_outline_12);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            if (mutate != null) {
                mutate.setColorFilter(C3DY.A00(i));
            }
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        C44390JjT c44390JjT = new C44390JjT(c77613dl, c76743cM, i);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append(" ");
        if (drawable != null) {
            C85973sR c85973sR = new C85973sR(drawable);
            int i2 = length2 + 1;
            spannableStringBuilder.setSpan(c85973sR, length2, i2, 33);
            spannableStringBuilder.append(" ");
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.setSpan(c44390JjT, i2, spannableStringBuilder.length(), 33);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A0A(Context context, SpannableStringBuilder spannableStringBuilder, C77613dl c77613dl, String str, int i, int i2) {
        if (spannableStringBuilder.length() != 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(" • ");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, spannableStringBuilder.length(), 0);
        }
        Drawable drawable = context.getDrawable(R.drawable.instagram_app_horizon_pano_filled_24);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            if (mutate != null) {
                mutate.setColorFilter(C3DY.A00(i));
            }
            drawable.setBounds(0, 0, i2, i2);
        }
        C44386JjP c44386JjP = new C44386JjP(c77613dl, i);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append(" ");
        if (drawable != null) {
            C85973sR c85973sR = new C85973sR(drawable);
            int i3 = length2 + 1;
            spannableStringBuilder.setSpan(c85973sR, length2, i3, 33);
            spannableStringBuilder.append(" ");
            if (str == null) {
                str = context.getString(2131966614);
                C14360o3.A07(str);
            }
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.setSpan(c44386JjP, i3, spannableStringBuilder.length(), 33);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A0B(SpannableStringBuilder spannableStringBuilder, final InterfaceC75453aC interfaceC75453aC, final C76733cL c76733cL, final Integer num, String str, final int i, final int i2, final boolean z) {
        C14360o3.A0B(num, 2);
        C14360o3.A0B(c76733cL, 7);
        if (spannableStringBuilder.length() != 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(" • ");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, spannableStringBuilder.length(), 0);
        }
        ClickableSpan clickableSpan = new ClickableSpan() { // from class: X.4hK
            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                int i3;
                C14360o3.A0B(textPaint, 0);
                textPaint.setUnderlineText(false);
                if (!z && num != C05F.A0C) {
                    i3 = i;
                } else {
                    i3 = i2;
                }
                textPaint.setColor(i3);
            }

            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                InterfaceC75453aC interfaceC75453aC2 = InterfaceC75453aC.this;
                if (interfaceC75453aC2 != null) {
                    if (z || num == C05F.A0C) {
                        interfaceC75453aC2.D46(c76733cL.A00);
                    }
                }
            }
        };
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.setSpan(clickableSpan, length2, spannableStringBuilder.length(), 33);
    }

    public static final void A0C(C38681GzM c38681GzM, InterfaceC75453aC interfaceC75453aC, C75113Zb c75113Zb) {
        C14360o3.A0B(interfaceC75453aC, 0);
        C14360o3.A0B(c38681GzM, 1);
        C14360o3.A0B(c75113Zb, 2);
        interfaceC75453aC.D41(((C76733cL) c38681GzM.A03).A00, c75113Zb, (Hashtag) c38681GzM.A01, c75113Zb.getPosition());
    }
}
