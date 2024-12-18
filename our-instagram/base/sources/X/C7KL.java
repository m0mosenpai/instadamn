package X;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(message = "Please use DirectThreadHeaderViewModel/DirectThreadHeaderViewHolder instead")
/* renamed from: X.7KL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7KL {
    public int A00;
    public Context A01;
    public LayerDrawable A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public TextView A0B;
    public TextView A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public InterfaceC56392iX A0G;
    public C7J8 A0I;
    public C7J6 A0J;
    public GradientSpinnerAvatarView A0K;
    public final Context A0M;
    public final Fragment A0O;
    public final InterfaceC11380iw A0P;
    public final UserSession A0Q;
    public final C7U0 A0R;
    public final Handler A0N = new Handler(Looper.getMainLooper());
    public C47924LEt A0H = null;
    public Boolean A0L = true;

    public static View A00(InterfaceC56362iU interfaceC56362iU, C7J6 c7j6, C7KL c7kl, C160847Is c160847Is) {
        View AA9;
        if (c160847Is.A0p) {
            if (A02(c7kl, c160847Is)) {
                Context context = c7kl.A01;
                UserSession userSession = c7kl.A0Q;
                int i = c160847Is.A02;
                C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                C3LO c3lo = new C3LO();
                c3lo.A05 = 2131975232;
                if (!A00.A1t() && C18U.A06(C06090Tz.A05, userSession, 36316813231592103L)) {
                    View inflate = LayoutInflater.from(context).inflate(R.layout.tas_entrypoint_icon_with_badge, (ViewGroup) null);
                    C14360o3.A07(inflate);
                    View requireViewById = inflate.requireViewById(R.id.icon);
                    C14360o3.A07(requireViewById);
                    ((ImageView) requireViewById).setColorFilter(C3DY.A00(i));
                    c3lo.A0I = inflate;
                    c3lo.A0G = new ViewOnClickListenerC35536Fmo(c7j6, A00);
                    AA9 = interfaceC56362iU.AAA(new C3LY(c3lo));
                } else {
                    c3lo.A06 = R.drawable.instagram_tag_pano_outline_24;
                    c3lo.A0G = new ViewOnClickListenerC35487Fle(c7j6);
                    AA9 = interfaceC56362iU.AA9(new C3LY(c3lo));
                }
                C7P0 c7p0 = new C7P0(c7kl.A0P, userSession);
                User user = c160847Is.A0E;
                if (user != null) {
                    C7P0.A01(null, C7P1.IMPRESSION, C7P2.ENTRYPOINT, c7p0, user.getId(), C17060sy.A01.A01(userSession).getId());
                }
                return AA9;
            }
            if (AbstractC31235DoI.A01(c7kl.A0Q)) {
                boolean z = c160847Is.A0c;
                C3LO c3lo2 = new C3LO();
                int i2 = R.drawable.instagram_flag_pano_outline_24;
                if (z) {
                    i2 = R.drawable.instagram_flag_pano_filled_24;
                }
                c3lo2.A06 = i2;
                int i3 = 2131976068;
                if (z) {
                    i3 = 2131962658;
                }
                c3lo2.A05 = i3;
                c3lo2.A0G = new ViewOnClickListenerC35486Fld(c7j6);
                interfaceC56362iU.AA9(new C3LY(c3lo2));
                return null;
            }
            return null;
        }
        return null;
    }

    public static void A01(InterfaceC56362iU interfaceC56362iU, C7J6 c7j6, C7KL c7kl, C160847Is c160847Is, C7T2 c7t2) {
        View.OnClickListener viewOnClickListenerC35493Flk;
        int i;
        int i2;
        C3LO c3lo;
        View view;
        List list;
        String str;
        UserSession userSession = c7kl.A0Q;
        C31227DoA A00 = AbstractC31273Dov.A00(c7kl.A0M, userSession);
        if (A00.A0C(c7t2)) {
            boolean z = c160847Is.A0N;
            if (!z && !c160847Is.A0M) {
                UserSession userSession2 = A00.A01;
                if (!MU6.A04(userSession2, c7t2)) {
                    if (c7t2 != null) {
                        if (c7t2.C7g() != 1014 || !C18U.A06(C06090Tz.A05, userSession2, 36331291565638888L)) {
                            str = c7t2.C7I();
                            list = c7t2.BSH();
                        }
                    } else {
                        list = null;
                        str = null;
                    }
                    if (!C31227DoA.A01(A00, str, list)) {
                        return;
                    }
                }
                boolean z2 = c160847Is.A0s;
                if (z2 && c160847Is.A0h && C18U.A06(C06090Tz.A05, userSession, 36328963693363102L)) {
                    Context context = c7kl.A01;
                    int i3 = c160847Is.A02;
                    ViewOnClickListenerC35491Fli viewOnClickListenerC35491Fli = new ViewOnClickListenerC35491Fli(c7j6);
                    C31775DxY c31775DxY = new C31775DxY(context);
                    c31775DxY.setButtonResource(R.drawable.instagram_video_chat_pano_outline_24);
                    c31775DxY.setColorFilter(C3DY.A00(i3));
                    C3LO c3lo2 = new C3LO();
                    c31775DxY.setClipToPadding(false);
                    c3lo2.A0I = c31775DxY;
                    c3lo2.A05 = 2131954569;
                    c3lo2.A0L = C05F.A0N;
                    c3lo2.A0G = viewOnClickListenerC35491Fli;
                    interfaceC56362iU.AAA(new C3LY(c3lo2));
                    return;
                }
                if (z2) {
                    Context context2 = c7kl.A01;
                    boolean z3 = c160847Is.A0m;
                    boolean z4 = c160847Is.A0o;
                    int i4 = c160847Is.A02;
                    ViewOnClickListenerC35537Fmp viewOnClickListenerC35537Fmp = new ViewOnClickListenerC35537Fmp(c7j6, AbstractC23021Ah.A00(userSession));
                    if (z3) {
                        View inflate = LayoutInflater.from(context2).inflate(R.layout.layout_video_call_button_with_presence_indicator, (ViewGroup) null);
                        C14360o3.A07(inflate);
                        View requireViewById = inflate.requireViewById(R.id.icon);
                        C14360o3.A07(requireViewById);
                        ((ImageView) requireViewById).setColorFilter(C3DY.A00(i4));
                        c3lo = new C3LO();
                        view = inflate;
                    } else {
                        int i5 = R.drawable.instagram_video_chat_pano_outline_24;
                        if (z4) {
                            i5 = R.drawable.instagram_video_chat_gen_ai_pano_outline_24;
                        }
                        C31775DxY c31775DxY2 = new C31775DxY(context2);
                        c31775DxY2.setButtonResource(i5);
                        c31775DxY2.setColorFilter(C3DY.A00(i4));
                        c3lo = new C3LO();
                        c31775DxY2.setClipToPadding(false);
                        view = c31775DxY2;
                    }
                    c3lo.A0I = view;
                    c3lo.A05 = 2131976623;
                    c3lo.A0L = C05F.A15;
                    c3lo.A0G = viewOnClickListenerC35537Fmp;
                    c7kl.A0A = interfaceC56362iU.AAA(new C3LY(c3lo));
                }
                if (!c160847Is.A0h) {
                    return;
                }
                Fragment fragment = c7kl.A0O;
                boolean z5 = c160847Is.A0o;
                int i6 = c160847Is.A02;
                C14360o3.A0B(fragment, 0);
                ViewOnClickListenerC35489Flg viewOnClickListenerC35489Flg = new ViewOnClickListenerC35489Flg(c7j6);
                C31775DxY c31775DxY3 = new C31775DxY(fragment.requireContext());
                int i7 = R.drawable.instagram_call_pano_outline_24;
                if (z5) {
                    i7 = R.drawable.instagram_call_gen_ai_pano_outline_24;
                }
                c31775DxY3.setButtonResource(i7);
                c31775DxY3.setColorFilter(C3DY.A00(i6));
                C3LO c3lo3 = new C3LO();
                c31775DxY3.setClipToPadding(false);
                c3lo3.A0I = c31775DxY3;
                c3lo3.A05 = 2131953296;
                c3lo3.A0L = C05F.A15;
                c3lo3.A0G = viewOnClickListenerC35489Flg;
                c7kl.A06 = interfaceC56362iU.AAA(new C3LY(c3lo3));
                return;
            }
            Context context3 = c7kl.A01;
            if (z) {
                viewOnClickListenerC35493Flk = new ViewOnClickListenerC35492Flj(c7j6);
                i = R.drawable.instagram_video_chat_filled_12;
                i2 = 0;
            } else {
                viewOnClickListenerC35493Flk = new ViewOnClickListenerC35493Flk(c7j6);
                i = R.drawable.instagram_call_filled_12;
                i2 = R.color.black;
            }
            C35255Fgo.A02(context3, viewOnClickListenerC35493Flk, interfaceC56362iU, i, i2);
        }
    }

    public static boolean A02(C7KL c7kl, C160847Is c160847Is) {
        if (c160847Is.A0U || c160847Is.A0V) {
            return false;
        }
        UserSession userSession = c7kl.A0Q;
        if (C4K3.A01(userSession)) {
            return true;
        }
        if (!C2E7.A01(C17060sy.A01.A01(userSession))) {
            return false;
        }
        return C18U.A06(C06090Tz.A05, userSession, 36316813231133345L);
    }

    public C7KL(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7U0 c7u0) {
        this.A0O = fragment;
        this.A0M = fragment.requireContext();
        this.A01 = fragment.requireContext();
        this.A0Q = userSession;
        this.A0P = interfaceC11380iw;
        this.A0R = c7u0;
    }
}
