package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6m7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148376m7 {
    public C5SW A00;
    public Runnable A01;
    public boolean A02;
    public final Context A03;
    public final UserSession A04;
    public final InterfaceC09390do A05 = AbstractC09440dt.A01(C143346dZ.A00);
    public final InterfaceC09390do A06 = AbstractC09440dt.A01(new C9E9(this, 47));
    public final InterfaceC11380iw A07;

    public final void A02(Activity activity, C207559Gj c207559Gj, String str, boolean z) {
        InterfaceC19630xq interfaceC19630xq;
        String str2;
        Boolean bool;
        String str3;
        EnumC58132lV enumC58132lV;
        boolean equals = str.equals("story_remix_reply");
        if (equals) {
            interfaceC19630xq = (InterfaceC19630xq) this.A06.getValue();
            str2 = "has_seen_remix_reply_type";
        } else {
            if (!str.equals("story_selfie_reply")) {
                return;
            }
            interfaceC19630xq = (InterfaceC19630xq) this.A06.getValue();
            str2 = "has_seen_selfie_reply_type";
        }
        if (!interfaceC19630xq.getBoolean(str2, false)) {
            C5SW c5sw = this.A00;
            if (c5sw != null) {
                bool = Boolean.valueOf(c5sw.A09());
            } else {
                bool = null;
            }
            if (!C14360o3.A0K(bool, true)) {
                UserSession userSession = this.A04;
                InterfaceC11380iw interfaceC11380iw = this.A07;
                if (equals) {
                    str3 = "remix_reply_tooltip";
                } else {
                    str3 = "selfie_reply_tooltip";
                }
                AbstractC43821JZj.A01(interfaceC11380iw, userSession, str3, "impression", "story_reply");
                int i = 2131971797;
                if (equals) {
                    i = 2131971793;
                }
                String string = activity.getString(i);
                C14360o3.A07(string);
                C5SU c5su = new C5SU(activity, new C149686oL(string));
                if (z) {
                    enumC58132lV = EnumC58132lV.A02;
                } else {
                    enumC58132lV = EnumC58132lV.A03;
                }
                c5su.A05 = enumC58132lV;
                c5su.A05(c207559Gj);
                c5su.A0B = true;
                c5su.A0A = false;
                c5su.A04 = new KYP(this, str);
                this.A00 = c5su.A00();
                ((Handler) this.A05.getValue()).postDelayed(new RunnableC24482At1(this), 500L);
            }
        }
    }

    public final void A03(MPD mpd, String str) {
        String str2;
        this.A02 = true;
        boolean equals = str.equals("story_remix_reply");
        UserSession userSession = this.A04;
        InterfaceC11380iw interfaceC11380iw = this.A07;
        if (equals) {
            str2 = "remix_reply_megaphone";
        } else {
            str2 = "selfie_reply_megaphone";
        }
        AbstractC43821JZj.A01(interfaceC11380iw, userSession, str2, "impression", "story_reply");
        Context context = this.A03;
        int i = R.drawable.ig_illustrations_illo_selfie_reactions_refresh;
        if (equals) {
            i = R.drawable.ig_illustrations_illo_remix_reactions_refresh;
        }
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            int i2 = 2131974712;
            if (equals) {
                i2 = 2131974700;
            }
            String string = context.getString(i2);
            C14360o3.A07(string);
            int i3 = 2131974711;
            if (equals) {
                i3 = 2131974698;
            }
            String string2 = context.getString(i3);
            C14360o3.A07(string2);
            String string3 = context.getString(2131974699);
            C14360o3.A07(string3);
            DialogInterfaceOnDismissListenerC48024LMt dialogInterfaceOnDismissListenerC48024LMt = new DialogInterfaceOnDismissListenerC48024LMt(this, mpd, str);
            C193328hC c193328hC = new C193328hC(context);
            c193328hC.A0k(drawable);
            c193328hC.A05 = string;
            c193328hC.A0r(string2);
            String string4 = context.getString(2131968948);
            C14360o3.A07(string4);
            c193328hC.A0W(null, EnumC193348hE.A03, string4, string3, true);
            c193328hC.A0g(new AP5(dialogInterfaceOnDismissListenerC48024LMt, this));
            Dialog A02 = c193328hC.A02();
            if (this.A01 == null) {
                this.A01 = new RunnableC24483At2(A02);
            } else {
                Handler handler = (Handler) this.A05.getValue();
                Runnable runnable = this.A01;
                if (runnable != null) {
                    handler.removeCallbacks(runnable);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            Handler handler2 = (Handler) this.A05.getValue();
            Runnable runnable2 = this.A01;
            if (runnable2 != null) {
                handler2.post(runnable2);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final int A00(C148376m7 c148376m7, String str) {
        InterfaceC19630xq interfaceC19630xq;
        String str2;
        if (C14360o3.A0K(str, "story_remix_reply")) {
            interfaceC19630xq = (InterfaceC19630xq) c148376m7.A06.getValue();
            str2 = "has_viewed_remix_reply_dialog_nux_count";
        } else {
            if (!C14360o3.A0K(str, "story_selfie_reply")) {
                return 0;
            }
            interfaceC19630xq = (InterfaceC19630xq) c148376m7.A06.getValue();
            str2 = "has_viewed_selfie_reply_dialog_nux_count";
        }
        return interfaceC19630xq.getInt(str2, 0);
    }

    public static final boolean A01(C148376m7 c148376m7, String str) {
        long A01 = C18U.A01(C06090Tz.A05, c148376m7.A04, 36596462847003132L);
        if (A01 < 0 || A00(c148376m7, str) < A01) {
            return true;
        }
        return false;
    }

    public C148376m7(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A07 = interfaceC11380iw;
        this.A03 = context;
        this.A04 = userSession;
    }
}
