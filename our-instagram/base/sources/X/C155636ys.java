package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.6ys, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C155636ys {
    public InterfaceC56362iU A01;
    public final AbstractC59962oe A04;
    public final UserSession A05;
    public final Handler A03 = new Handler(Looper.getMainLooper());
    public boolean A02 = false;
    public int A00 = 0;
    public final Runnable A06 = new Runnable() { // from class: X.6yt
        @Override // java.lang.Runnable
        public final void run() {
            C54412ev A01;
            EnumC54222eY enumC54222eY;
            final C155636ys c155636ys = C155636ys.this;
            AbstractC59962oe abstractC59962oe = c155636ys.A04;
            if (abstractC59962oe.isAdded()) {
                UserSession userSession = c155636ys.A05;
                if (AbstractC54472f1.A02()) {
                    if (!C31518Dt2.A05()) {
                        C155636ys.A00(userSession, c155636ys, 1);
                        C31518Dt2.A01(abstractC59962oe.requireContext(), abstractC59962oe, EnumC31512Dsw.A09, userSession, C05F.A01);
                        A01 = AbstractC54332en.A00(userSession).A01();
                        enumC54222eY = EnumC54222eY.A0R;
                    }
                } else {
                    C155636ys.A00(userSession, c155636ys, 1);
                    C31514Dsy.A04(userSession, "profile", "native");
                    FragmentActivity requireActivity = abstractC59962oe.requireActivity();
                    String str = userSession.token;
                    C14360o3.A0B(str, 0);
                    Bundle bundle = new Bundle();
                    bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
                    bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "profile");
                    bundle.putBoolean("show_add_account_button", true);
                    C189448aO c189448aO = new C189448aO(userSession);
                    c189448aO.A0V = new BCD() { // from class: X.An7
                        @Override // X.BCD
                        public final void Cz1() {
                            C155636ys c155636ys2 = C155636ys.this;
                            if (System.currentTimeMillis() - (-1) < 300) {
                                C2UY.A01.A05(14L);
                                UserSession userSession2 = c155636ys2.A05;
                                C0BQ.A00(userSession2).CJm(c155636ys2.A04.requireContext(), userSession2, "double_tap_tab_bar_profile_action_bar");
                            }
                        }
                    };
                    C189478aR A00 = c189448aO.A00();
                    ENI eni = new ENI();
                    eni.setArguments(bundle);
                    A00.A02(requireActivity, eni);
                    C31514Dsy.A06(userSession);
                    A01 = AbstractC54332en.A00(userSession).A01();
                    enumC54222eY = EnumC54222eY.A0p;
                }
                C54432ex c54432ex = new C54432ex(enumC54222eY, c155636ys.A00);
                EnumC58162lY enumC58162lY = EnumC58162lY.A07;
                C14360o3.A0B(enumC58162lY, 0);
                A01.A03(new C72053Ld(EnumC58122lU.A05, enumC58162lY, null, null), c54432ex, false);
            }
            UserSession userSession2 = c155636ys.A05;
            List<User> BOf = C0BQ.A00(userSession2).BOf(C17060sy.A01.A01(userSession2));
            HashMap hashMap = new HashMap();
            int i = 0;
            for (User user : BOf) {
                int A02 = user.A02();
                i += A02;
                hashMap.put(user.getId(), Integer.toString(A02));
            }
            C54392et A002 = AbstractC54332en.A00(userSession2).A00();
            C54432ex c54432ex2 = new C54432ex(EnumC54222eY.A07, i);
            A002.A06(EnumC58122lU.A05, EnumC58162lY.A03, c54432ex2, hashMap);
        }
    };

    public static void A00(UserSession userSession, C155636ys c155636ys, int i) {
        C54432ex c54432ex = new C54432ex(EnumC54222eY.A06, c155636ys.A00);
        EnumC58162lY enumC58162lY = EnumC58162lY.A0E;
        EnumC58122lU enumC58122lU = EnumC58122lU.A05;
        if (i == 2) {
            AbstractC54332en.A00(userSession).A00().A00.AHj();
            AbstractC54332en.A00(userSession).A00().A02(enumC58122lU, enumC58162lY, c54432ex);
            C54412ev A01 = AbstractC54332en.A00(userSession).A01();
            C54432ex c54432ex2 = new C54432ex(EnumC54222eY.A0p, c155636ys.A00);
            EnumC58162lY enumC58162lY2 = EnumC58162lY.A07;
            C14360o3.A0B(enumC58162lY2, 0);
            A01.A02(new C72053Ld(EnumC58122lU.A04, enumC58162lY2, null, null), c54432ex2);
            return;
        }
        UserSession userSession2 = c155636ys.A05;
        int A012 = C71953Kt.A01(userSession2, false);
        int A00 = C71953Kt.A00(userSession2, false);
        int A04 = C3Ks.A01.A04(userSession2, false);
        int i2 = 0;
        if (A04 > 0) {
            i2 = 1;
        }
        C54392et.A00(AbstractC54332en.A00(userSession).A00(), enumC58122lU, enumC58162lY, c54432ex, C05F.A01, "click", null, A00, i2, A012, A04);
    }

    public C155636ys(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        this.A04 = abstractC59962oe;
        this.A05 = userSession;
    }

    public final void A01(UserSession userSession) {
        int A00;
        Drawable mutate;
        if (AbstractC54472f1.A03()) {
            C71953Kt c71953Kt = C3Ks.A01;
            C14360o3.A0B(userSession, 0);
            A00 = c71953Kt.A05(userSession, false);
        } else {
            A00 = AbstractC71963Ku.A00(userSession);
        }
        this.A00 = A00;
        boolean z = false;
        if (A00 > 0) {
            z = true;
        }
        InterfaceC56362iU interfaceC56362iU = this.A01;
        if (interfaceC56362iU != null) {
            UserSession userSession2 = this.A05;
            User A01 = C17060sy.A01.A01(userSession2);
            Context requireContext = this.A04.requireContext();
            String username = A01.getUsername();
            boolean z2 = false;
            if (A01.A0M() == C05F.A0C) {
                z2 = true;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(username);
            if (z2) {
                boolean A02 = AbstractC13620mo.A02(requireContext);
                if (A02) {
                    spannableStringBuilder.append((CharSequence) " ");
                } else {
                    spannableStringBuilder.insert(0, (CharSequence) " ");
                }
                Drawable drawable = requireContext.getDrawable(R.drawable.instagram_lock_pano_outline_16);
                if (drawable != null && (mutate = drawable.mutate()) != null) {
                    mutate.setColorFilter(C3DY.A00(requireContext.getColor(AbstractC53242c7.A0H(requireContext, R.attr.igds_color_primary_icon))));
                    int i = 0;
                    mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                    C85973sR c85973sR = new C85973sR(mutate);
                    if (A02) {
                        i = spannableStringBuilder.length() - 1;
                        spannableStringBuilder.append((CharSequence) " ");
                    } else {
                        spannableStringBuilder.insert(0, (CharSequence) " ");
                    }
                    spannableStringBuilder.setSpan(c85973sR, i, i + 1, 33);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            C56352iT c56352iT = (C56352iT) interfaceC56362iU;
            int i2 = 0;
            C56352iT.A0K(c56352iT, spannableStringBuilder, true, false);
            interfaceC56362iU.Efw(new View.OnClickListener() { // from class: X.6su
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int A05 = C0f9.A05(-836324855);
                    C155636ys c155636ys = C155636ys.this;
                    c155636ys.A03.post(c155636ys.A06);
                    C0f9.A0C(-1435832500, A05);
                }
            });
            interfaceC56362iU.Eka(true);
            boolean isVerified = A01.isVerified();
            if (isVerified) {
                C56352iT.A0F(c56352iT);
            }
            Object value = c56352iT.A0Y.getValue();
            C14360o3.A07(value);
            View view = (View) value;
            if (!isVerified) {
                i2 = 8;
            }
            view.setVisibility(i2);
            C56352iT.A0F(c56352iT);
            Object value2 = c56352iT.A0b.getValue();
            C14360o3.A07(value2);
            View view2 = (View) value2;
            int i3 = 8;
            if (z) {
                i3 = 0;
            }
            view2.setVisibility(i3);
            Object value3 = c56352iT.A0c.getValue();
            C14360o3.A07(value3);
            ((View) value3).setVisibility(8);
            Object value4 = c56352iT.A0d.getValue();
            C14360o3.A07(value4);
            ((View) value4).setVisibility(0);
            if (z != this.A02) {
                this.A02 = z;
                A00(userSession, this, 2);
            }
            int i4 = 0;
            int A012 = C71953Kt.A01(userSession2, false);
            int A002 = C71953Kt.A00(userSession2, false);
            int A04 = C3Ks.A01.A04(userSession2, false);
            int i5 = 0;
            if (A04 > 0) {
                i5 = 1;
            }
            C54392et A003 = AbstractC54332en.A00(userSession).A00();
            C54432ex c54432ex = new C54432ex(EnumC54222eY.A06, this.A00);
            EnumC58162lY enumC58162lY = EnumC58162lY.A0E;
            EnumC58122lU enumC58122lU = EnumC58122lU.A05;
            Integer num = C05F.A01;
            A003.A04(enumC58122lU, enumC58162lY, c54432ex, num, A002, i5, A012, A04);
            C54392et A004 = AbstractC54332en.A00(userSession).A00();
            EnumC54222eY enumC54222eY = EnumC54222eY.A0b;
            int i6 = 0;
            if (this.A00 > 0) {
                i6 = 1;
            }
            C54432ex c54432ex2 = new C54432ex(enumC54222eY, i6);
            EnumC58162lY enumC58162lY2 = EnumC58162lY.A06;
            EnumC58122lU enumC58122lU2 = EnumC58122lU.A03;
            A004.A04(enumC58122lU2, enumC58162lY2, c54432ex2, num, A002, i5, A012, A04);
            C54412ev A013 = AbstractC54332en.A00(userSession).A01();
            C54432ex c54432ex3 = new C54432ex(EnumC54222eY.A0p, this.A00);
            EnumC58162lY enumC58162lY3 = EnumC58162lY.A07;
            C14360o3.A0B(enumC58162lY3, 0);
            A013.A02(new C72053Ld(enumC58122lU, enumC58162lY3, null, null), c54432ex3);
            C54412ev A014 = AbstractC54332en.A00(userSession).A01();
            if (this.A00 > 0) {
                i4 = 1;
            }
            C54432ex c54432ex4 = new C54432ex(enumC54222eY, i4);
            C14360o3.A0B(enumC58162lY2, 0);
            A014.A02(new C72053Ld(enumC58122lU2, enumC58162lY2, null, null), c54432ex4);
        }
    }
}
