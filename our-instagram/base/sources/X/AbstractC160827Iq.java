package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate;
import java.util.Locale;

/* renamed from: X.7Iq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC160827Iq {
    public static final Drawable A00(Context context, ThemeViewModelDelegate themeViewModelDelegate) {
        int i;
        Drawable drawable;
        int[] iArr;
        int i2;
        C14360o3.A0B(themeViewModelDelegate, 1);
        boolean A00 = AbstractC72723Nt.A00(context);
        if (A00) {
            i = themeViewModelDelegate.A01;
        } else {
            i = themeViewModelDelegate.A03;
        }
        if (i <= 0) {
            if (A00) {
                iArr = themeViewModelDelegate.A0B;
                i2 = themeViewModelDelegate.A00;
            } else {
                iArr = themeViewModelDelegate.A0C;
                i2 = themeViewModelDelegate.A02;
            }
            drawable = AbstractC46761KmI.A00(context, iArr, i2, R.drawable.direct_thread_detail_chat_color_preview);
        } else {
            drawable = context.getResources().getDrawable(i);
        }
        C14360o3.A07(drawable);
        return drawable;
    }

    public static final String A01(Context context, ThemeViewModelDelegate themeViewModelDelegate) {
        String str;
        C14360o3.A0B(themeViewModelDelegate, 1);
        if (AbstractC72723Nt.A00(context)) {
            str = themeViewModelDelegate.A06;
        } else {
            str = themeViewModelDelegate.A08;
        }
        if (str != null && AbstractC81033jX.A04(str)) {
            return str;
        }
        return null;
    }

    public static final void A02(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C32056E6i c32056E6i) {
        String str;
        C14360o3.A0B(userSession, 1);
        Activity activity = (Activity) context;
        int i = -1;
        String str2 = c32056E6i.A0A;
        if (str2 != null) {
            Locale locale = Locale.US;
            C14360o3.A08(locale);
            String upperCase = str2.toUpperCase(locale);
            C14360o3.A07(upperCase);
            if (upperCase.equals("general")) {
                i = 1;
            } else if (upperCase.equals("primary")) {
                i = 0;
            }
        }
        String str3 = null;
        if (!C35244Fgd.A03(activity, context, interfaceC11380iw, userSession, null, i, false)) {
            C28501Zl c28501Zl = C28531Zo.A04.A02;
            ThemeViewModelDelegate themeViewModelDelegate = c32056E6i.A03;
            C3o9 c3o9 = c32056E6i.A07;
            KDM A04 = c28501Zl.A04(userSession, themeViewModelDelegate, c3o9, "thread_details", c32056E6i.A01, c32056E6i.A00, c32056E6i.A0K, c32056E6i.A0I, c32056E6i.A0J);
            C14360o3.A0C(A04, "null cannot be cast to non-null type com.instagram.direct.fragment.thread.chatsettings.DirectThreadColorPickerFragment");
            C189448aO c189448aO = new C189448aO(userSession);
            c189448aO.A0T = A04;
            c189448aO.A0a = true;
            c189448aO.A1C = false;
            c189448aO.A0A = AbstractC53242c7.A0H(context, R.attr.igds_color_elevated_background);
            float f = 0.5f;
            if (C18U.A06(C06090Tz.A05, userSession, 36324157624954809L)) {
                f = 0.75f;
            }
            c189448aO.A03 = f;
            C189478aR A00 = c189448aO.A00();
            A00.A02(AbstractC13110lx.A00(activity), A04);
            A04.A05 = new G2X(A00);
            C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
            InterfaceC02590Ai A002 = A01.A00(A01.A00, "direct_thread_theme_picker");
            if (A002.isSampled()) {
                A002.A7v("is_e2ee", Boolean.valueOf(JRE.A09(c3o9)));
                Long l = null;
                if (c3o9 != null) {
                    str = JRE.A06(c3o9);
                } else {
                    str = null;
                }
                A002.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                A002.A8R(EnumC46293KeP.THREAD_DETAILS, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                if (c3o9 != null) {
                    str3 = AbstractC43827JZq.A01(c3o9);
                }
                A002.AAP("open_thread_id", str3);
                if (c3o9 != null) {
                    l = AbstractC43827JZq.A00(c3o9);
                }
                A002.A9K("occamadillo_thread_id", l);
                A002.Cht();
            }
        }
    }

    public static final boolean A03(UserSession userSession, Capabilities capabilities, InterfaceC83713oG interfaceC83713oG, int i, boolean z, boolean z2) {
        if (interfaceC83713oG != null && AbstractC140946Yw.A08(interfaceC83713oG)) {
            return C98Q.A00(userSession).A00(interfaceC83713oG, 14);
        }
        if (capabilities.A00(EnumC2054697t.A1F)) {
            if (!C7NG.A00(i)) {
                return true;
            }
            if (z && z2) {
                return true;
            }
            return false;
        }
        return false;
    }
}
