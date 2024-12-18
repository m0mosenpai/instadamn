package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: X.7ha, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169607ha {
    public static final C169607ha A00 = new Object();

    public static final SpannableStringBuilder A00(Context context, SpannableString spannableString, UserSession userSession, String str, List list, final Map map, InterfaceC16820sZ interfaceC16820sZ, final InterfaceC16660sJ interfaceC16660sJ, final InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF, final InterfaceC16620sF interfaceC16620sF2, int i, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(list, 4);
        if (AbstractC13620mo.A02(context)) {
            str = AnonymousClass001.A0D(str, (char) 8207);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int A0F = AbstractC53242c7.A0F(context, i);
        C85383rT c85383rT = new C85383rT(spannableStringBuilder, userSession);
        c85383rT.A03 = A0F;
        c85383rT.A01 = A0F;
        c85383rT.A0L = z2;
        c85383rT.A0M = z3;
        c85383rT.A04 = A0F;
        c85383rT.A02 = AbstractC53242c7.A0F(context, R.attr.textColorSecondary);
        c85383rT.A03(new InterfaceC85403rV() { // from class: X.7hc
            @Override // X.InterfaceC85403rV
            public final void D4A(ClickableSpan clickableSpan, View view, UserSession userSession2, String str2) {
                C14360o3.A0B(str2, 1);
                InterfaceC16660sJ.this.invoke(str2);
            }
        });
        InterfaceC85403rV interfaceC85403rV = new InterfaceC85403rV() { // from class: X.7hd
            @Override // X.InterfaceC85403rV
            public final void D4A(ClickableSpan clickableSpan, View view, UserSession userSession2, String str2) {
                Object obj;
                InterfaceC16620sF interfaceC16620sF3;
                C14360o3.A0B(str2, 1);
                Map map2 = map;
                if (map2 != null && map2.containsKey(str2) && (obj = map2.get(str2)) != null && (interfaceC16620sF3 = interfaceC16620sF2) != null) {
                    interfaceC16620sF3.invoke(str2, obj);
                }
            }
        };
        c85383rT.A07 = context;
        c85383rT.A0C = interfaceC85403rV;
        c85383rT.A0J = map;
        c85383rT.A0W = true;
        if (z) {
            c85383rT.A02(new InterfaceC85423rX() { // from class: X.7he
                @Override // X.InterfaceC85423rX
                public final void D40(ClickableSpan clickableSpan, View view, String str2) {
                    C14360o3.A0B(str2, 0);
                    InterfaceC16660sJ.this.invoke(str2);
                }
            });
        }
        if ((!list.isEmpty()) && new C57382kD(userSession).A01()) {
            c85383rT.A01(context, new AjG(interfaceC16620sF), list);
        }
        SpannableStringBuilder A002 = c85383rT.A00();
        C14360o3.A07(A002);
        if (spannableString != null) {
            spannableString.setSpan(new C31746Dwz(context, interfaceC16820sZ), 0, spannableString.length(), 33);
            A002.append(' ').append((CharSequence) spannableString);
        }
        return A002;
    }

    public final SpannableStringBuilder A01(Context context, C166047bW c166047bW, final UserSession userSession, User user, final InterfaceC16820sZ interfaceC16820sZ, final int i, boolean z) {
        String str;
        C40971v4 c40971v4;
        String str2;
        boolean z2;
        int length;
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(user, 4);
        boolean A02 = AbstractC13620mo.A02(context);
        if (c166047bW == null) {
            str = null;
        } else {
            String str3 = c166047bW.A0I;
            str = c166047bW.A0D;
            C14360o3.A0B(str3, 1);
            C41571w7 A002 = AbstractC41561w6.A00(userSession);
            if (!AbstractC41641wE.A00 && (c40971v4 = (C40971v4) A002.A00.get(str3)) != null) {
                str = c40971v4.A0U;
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (user.A2N()) {
            if (c166047bW != null && AbstractC41071vF.A0X(userSession, c166047bW.A0I, c166047bW.A0h) && str != null && (length = str.length()) != 0 && c166047bW.A0A == user) {
                spannableStringBuilder.append((CharSequence) str).append((CharSequence) " ");
                spannableStringBuilder.setSpan(new CharacterStyle(), 0, length, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i), 0, length, 33);
            }
        } else {
            if (c166047bW == null || !AbstractC41071vF.A0X(userSession, c166047bW.A0I, c166047bW.A0h) || str == null || str.length() == 0 || c166047bW.A0A != user) {
                str = user.getUsername();
            }
            if (A02) {
                str2 = "\u200f";
            } else {
                str2 = "";
            }
            spannableStringBuilder.append((CharSequence) str2);
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.setSpan(new AbstractC85543rj(i) { // from class: X.7hb
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    C14360o3.A0B(view, 0);
                    UserSession userSession2 = UserSession.this;
                    if (!C18U.A06(C06090Tz.A05, userSession2, 36320545558373034L)) {
                        C71313Hs.A00(userSession2).A0B(view, new String[0]);
                    }
                    interfaceC16820sZ.invoke();
                }
            }, 0, spannableStringBuilder.length(), 33);
            if (user.isVerified()) {
                spannableStringBuilder.append((CharSequence) " ");
                if (c166047bW != null) {
                    z2 = true;
                    if (c166047bW.A0d) {
                        C85963sQ.A05(context, spannableStringBuilder, C85963sQ.A00, Integer.valueOf(AbstractC53242c7.A0A(context)), false, false);
                    }
                } else {
                    z2 = true;
                }
                C85963sQ.A05(context, spannableStringBuilder, C85963sQ.A00, null, z2, false);
            } else {
                z2 = true;
            }
            if (z) {
                FVH.A01(context, spannableStringBuilder, z2, z2, false);
            }
            spannableStringBuilder.append((CharSequence) " ");
            if (A02) {
                spannableStringBuilder.append((CharSequence) "\u202c");
                return spannableStringBuilder;
            }
        }
        return spannableStringBuilder;
    }

    public final SpannableStringBuilder A02(Context context, UserSession userSession, User user, String str, List list, final InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF, int i, int i2, boolean z, boolean z2, boolean z3) {
        String str2;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(user, 4);
        C14360o3.A0B(list, 9);
        SpannableStringBuilder A002 = A00(context, null, userSession, str, list, null, B6a.A00, interfaceC16660sJ, interfaceC16660sJ2, interfaceC16620sF, null, i, true, z2, z3);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        final String username = user.getUsername();
        if (z) {
            str2 = "\u200f";
        } else {
            str2 = "";
        }
        spannableStringBuilder.append((CharSequence) str2);
        spannableStringBuilder.append((CharSequence) username);
        final int A0F = AbstractC53242c7.A0F(context, i2);
        AbstractC85543rj abstractC85543rj = new AbstractC85543rj(A0F) { // from class: X.9oB
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                interfaceC16660sJ.invoke(username);
            }
        };
        int length = str2.length();
        spannableStringBuilder.setSpan(abstractC85543rj, length, length + username.length(), 33);
        spannableStringBuilder.append(' ');
        if (z) {
            spannableStringBuilder.append((CharSequence) "\u200f");
        }
        spannableStringBuilder.append((CharSequence) A002);
        return spannableStringBuilder;
    }
}
