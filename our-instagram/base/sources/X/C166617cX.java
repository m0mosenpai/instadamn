package X;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableString;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import com.instagram.user.model.User;

/* renamed from: X.7cX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166617cX {
    public static final C166617cX A00 = new Object();

    public static final Editable A00(ComposerAutoCompleteTextView composerAutoCompleteTextView, String str, int i, int i2) {
        Editable replace;
        int i3 = new int[]{i, 0}[0];
        if (0 > i3) {
            i3 = 0;
        }
        if (i3 <= i2) {
            replace = composerAutoCompleteTextView.getText().replace(i3, i2, str);
        } else {
            replace = composerAutoCompleteTextView.getText().replace(composerAutoCompleteTextView.getText().length(), composerAutoCompleteTextView.getText().length(), str);
        }
        C14360o3.A0A(replace);
        return replace;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02d3 A[Catch: all -> 0x0334, TryCatch #0 {all -> 0x0334, blocks: (B:5:0x0023, B:7:0x0031, B:13:0x00e1, B:15:0x00e7, B:16:0x00ed, B:18:0x0145, B:19:0x01e4, B:21:0x021f, B:23:0x0225, B:25:0x0231, B:26:0x0242, B:28:0x0295, B:29:0x0299, B:30:0x02a3, B:34:0x02cc, B:36:0x02d3, B:37:0x02ed, B:43:0x02bb, B:45:0x02bf, B:46:0x02c4, B:50:0x0327, B:52:0x032d, B:53:0x0333, B:9:0x0037, B:11:0x008f, B:12:0x0098), top: B:4:0x0023, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x031f  */
    /* JADX WARN: Type inference failed for: r36v0, types: [X.0oO, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C166627cY A02(android.view.View r37, X.AbstractC59962oe r38, final X.C26025BfE r39, final X.C25814BbV r40, final com.instagram.common.session.UserSession r41, com.instagram.common.ui.base.IgLinearLayout r42, X.InterfaceC60442pS r43, X.C1M1 r44, X.InterfaceC16820sZ r45, final X.InterfaceC16820sZ r46) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166617cX.A02(android.view.View, X.2oe, X.BfE, X.BbV, com.instagram.common.session.UserSession, com.instagram.common.ui.base.IgLinearLayout, X.2pS, X.1M1, X.0sZ, X.0sZ):X.7cY");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(android.widget.TextView r17, X.C9ZB r18, X.InterfaceC168087f3 r19, X.C26025BfE r20, X.C25814BbV r21, X.AbstractC13100lw r22, java.lang.String r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166617cX.A05(android.widget.TextView, X.9ZB, X.7f3, X.BfE, X.BbV, X.0lw, java.lang.String, boolean):void");
    }

    public final void A08(C166627cY c166627cY, CharSequence charSequence, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(c166627cY, 0);
        C14360o3.A0B(interfaceC16820sZ, 2);
        ComposerAutoCompleteTextView composerAutoCompleteTextView = c166627cY.A0B;
        composerAutoCompleteTextView.setText(charSequence);
        composerAutoCompleteTextView.setSelection(composerAutoCompleteTextView.getText().length());
        composerAutoCompleteTextView.sendAccessibilityEvent(8);
        composerAutoCompleteTextView.post(new RunnableC168147f9(c166627cY, interfaceC16820sZ));
    }

    public static final C9ZB A01(C167637eJ c167637eJ) {
        String str;
        C38321qM BQN;
        Integer num = c167637eJ.A04;
        InterfaceC38371qR interfaceC38371qR = c167637eJ.A03;
        if (interfaceC38371qR != null && (BQN = interfaceC38371qR.BQN()) != null) {
            str = BQN.A2u();
        } else {
            str = null;
        }
        if (!c167637eJ.A0E || num == null || str == null || c167637eJ.A00 != null) {
            return null;
        }
        C9ZB c9zb = new C9ZB(num.intValue(), str, "");
        return new C9ZB(c9zb.A00, c9zb.A01, "");
    }

    public static final CharSequence A03(Context context, C26025BfE c26025BfE, C167637eJ c167637eJ, UserSession userSession, User user, boolean z) {
        String str;
        int i;
        int i2;
        Object[] objArr;
        Integer num;
        if (c167637eJ.A0E && (num = c167637eJ.A04) != null) {
            int intValue = num.intValue();
            C14360o3.A0B(context, 0);
            SpannableString spannableString = new SpannableString(context.getString(2131956507, AnonymousClass001.A0O("❏\u200a", intValue + 1)));
            int A04 = AbstractC001900j.A04(spannableString, (char) 10063, 0);
            if (A04 != -1) {
                spannableString.setSpan(AbstractC225879y6.A00(context, false, false), A04, A04 + 1, 33);
            }
            return spannableString;
        }
        if (c167637eJ.A00 != null) {
            if (C0BQ.A00(userSession).CLL()) {
                i = 2131972358;
                objArr = new Object[1];
                str = user.getUsername();
            } else {
                i2 = 2131972362;
                return context.getString(i2);
            }
        } else {
            str = c167637eJ.A05;
            if (str != null && !C14360o3.A0K(user.getUsername(), str)) {
                if (c26025BfE.A0e || (z && !C18U.A06(C06090Tz.A05, userSession, 36322967920061217L))) {
                    i = 2131952293;
                    objArr = new Object[1];
                }
            } else if (C0BQ.A00(userSession).CLL()) {
                i = 2131956438;
                objArr = new Object[1];
                str = user.getUsername();
            }
            i2 = 2131956452;
            return context.getString(i2);
        }
        objArr[0] = str;
        return context.getString(i, objArr);
    }

    public static final void A04(View view) {
        if (view.getVisibility() == 8) {
            AbstractC125325le A01 = AbstractC125325le.A01(view, 0);
            A01.A0U(0.75f, 1.0f, -1.0f);
            A01.A0V(0.75f, 1.0f, -1.0f);
            A01.A0F(true).A0E(C55942hf.A04(90.0d, 1.0d)).A0H();
        }
        view.setVisibility(0);
    }

    public static final void A06(FragmentActivity fragmentActivity, UserSession userSession, C148286ly c148286ly, String str, String str2, boolean z) {
        InterfaceC02590Ai A002;
        long j;
        if (c148286ly != null) {
            String str3 = c148286ly.A0a;
            C14360o3.A07(str3);
            Long A0k = AbstractC003100w.A0k(10, str3);
            if (A0k != null) {
                j = A0k.longValue();
            } else {
                j = 0;
            }
            C14360o3.A0B(userSession, 0);
            C14360o3.A0B(str2, 1);
            C18920wW c18920wW = new C167417dv(userSession).A00;
            A002 = c18920wW.A00(c18920wW.A00, "avatar_stickers_measurement_typeahead_click");
            if (A002.isSampled()) {
                C0Zx c0Zx = new C0Zx();
                c0Zx.A05("non_avatar_sticker_id", Long.valueOf(j));
                c0Zx.A06("referrer_surface", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
                c0Zx.A06("composer_session_id", str2);
                c0Zx.A06("input_text", str);
                A002.AAQ(c0Zx, "event_data");
                A002.AAP("product", "typeahead");
                A002.Cht();
            }
        } else {
            C14360o3.A0B(userSession, 0);
            C14360o3.A0B(str2, 1);
            C18920wW c18920wW2 = new C167417dv(userSession).A00;
            A002 = c18920wW2.A00(c18920wW2.A00, "contextual_recommendations_hint_click");
            if (A002.isSampled()) {
                A002.A9M("extra_client_data", AbstractC06930Yk.A06(new C09530e4("sticker_type", "GIPHY"), new C09530e4("composer_session_id", str2), new C09530e4("surface", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT)));
                A002.Cht();
            }
        }
        C3DN A003 = C3DN.A00.A00(fragmentActivity);
        C189478aR A004 = F86.A00(A003);
        C14360o3.A0B(str, 0);
        KBW kbw = new KBW();
        kbw.setArguments(AbstractC61636Rr0.A00(new C09530e4("args_suggestion_text_input", str), new C09530e4("args_should_show_avatars", Boolean.valueOf(z)), new C09530e4("args_session_id", str2)));
        if (A004 != null) {
            C189448aO c189448aO = new C189448aO(userSession);
            c189448aO.A11 = true;
            c189448aO.A0a = true;
            float f = 0.5f;
            if (z) {
                f = 0.6f;
            }
            c189448aO.A03 = f;
            A004.A0F(kbw, c189448aO);
            return;
        }
        if (A003 == null) {
            return;
        }
        A003.A0K(kbw);
    }

    public static final void A07(AbstractC59962oe abstractC59962oe, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, boolean z) {
        Fragment A09;
        Fragment A092;
        KD9 kd9 = new KD9();
        if (z) {
            kd9.A00(userSession, "avatar_tab");
        }
        C14360o3.A0B(abstractC59962oe, 0);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC60442pS, 4);
        C3DN A002 = C3DN.A00.A00(abstractC59962oe.getActivity());
        C189478aR A003 = F86.A00(A002);
        if (A003 != null) {
            if (A002 != null && (A092 = A002.A09()) != null) {
                ((BottomSheetFragment) A092).A0T(0);
            }
            C189448aO c189448aO = new C189448aO(userSession);
            c189448aO.A11 = true;
            c189448aO.A0a = true;
            c189448aO.A03 = 0.8f;
            c189448aO.A0T = kd9;
            View view = null;
            A003.A0F(kd9, c189448aO);
            if (A002 != null && (A09 = A002.A09()) != null) {
                view = A09.mView;
            }
            if (c38321qM != null && view != null) {
                AbstractC99834e5.A01(view, userSession, c38321qM, interfaceC60442pS, false);
                return;
            }
            return;
        }
        if (A002 == null) {
            return;
        }
        A002.A0K(kd9);
    }
}
