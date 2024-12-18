package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.util.Either;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.HashSet;

/* renamed from: X.70C, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C70C {
    public Either A00;
    public final FragmentActivity A01;
    public final InterfaceC53892dT A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final UserSession A05;
    public final HashSet A06;

    public C70C(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC53892dT interfaceC53892dT) {
        C14360o3.A0B(userSession, 3);
        this.A02 = interfaceC53892dT;
        this.A01 = fragmentActivity;
        this.A05 = userSession;
        this.A04 = AbstractC09440dt.A01(new C9EY(this, 47));
        this.A03 = AbstractC09440dt.A01(new C9EY(this, 46));
        this.A06 = AbstractC16830sb.A05("profile", "profile_fullname_screen", "liked_feed", "highlights_grid", "edit_profile", "clickable_category", "social_context_follow_list_fragment", "unified_follow_list", "hashtag_feed");
    }

    public final void A00() {
        C140966Yy c140966Yy;
        Either either = this.A00;
        if (either != null) {
            boolean z = either.A02;
            if (z) {
                C6XJ c6xj = (C6XJ) either.A00;
                if (c6xj != null) {
                    c6xj.A0C(this.A01);
                    return;
                }
                return;
            }
            if (!(!z) || (c140966Yy = (C140966Yy) either.A01) == null) {
                return;
            }
            c140966Yy.A04();
        }
    }

    public final void A01() {
        C140966Yy c140966Yy;
        Either either = this.A00;
        if (either != null) {
            boolean z = either.A02;
            if (z) {
                C6XJ c6xj = (C6XJ) either.A00;
                if (c6xj != null) {
                    c6xj.A07();
                    return;
                }
                return;
            }
            if (!(!z) || (c140966Yy = (C140966Yy) either.A01) == null) {
                return;
            }
            c140966Yy.A0E = true;
        }
    }

    public final void A02() {
        C140966Yy c140966Yy;
        Either either = this.A00;
        if (either != null && (!either.A02) && (c140966Yy = (C140966Yy) either.A01) != null) {
            c140966Yy.A0A = "EditProfileFragment.BACK_STACK_NAME";
        }
    }

    public final void A03(Fragment fragment, String str, boolean z) {
        Bundle bundle;
        Either either;
        if ((((Boolean) this.A04.getValue()).booleanValue() || (((Boolean) this.A03.getValue()).booleanValue() && this.A06.contains(str))) && (bundle = fragment.mArguments) != null) {
            C6XJ c6xj = new C6XJ(this.A01, bundle, this.A05, ModalActivity.class, str);
            if (z) {
                c6xj.A08();
            }
            either = new Either(c6xj, null, true);
        } else {
            C140966Yy c140966Yy = new C140966Yy(this.A01, this.A05);
            c140966Yy.A0B(null, fragment);
            if (z) {
                c140966Yy.A0F = true;
            }
            either = new Either(null, c140966Yy, false);
        }
        this.A00 = either;
    }

    public final void A04(C53S c53s) {
        C140966Yy c140966Yy;
        Either either = this.A00;
        if (either != null) {
            boolean z = either.A02;
            if (z) {
                C6XJ c6xj = (C6XJ) either.A00;
                if (c6xj != null) {
                    c6xj.A01 = c53s;
                    return;
                }
                return;
            }
            if (!(!z) || (c140966Yy = (C140966Yy) either.A01) == null) {
                return;
            }
            c140966Yy.A07 = c53s;
        }
    }

    public final void A05(String str) {
        C140966Yy c140966Yy;
        Either either = this.A00;
        if (either != null) {
            boolean z = either.A02;
            if (z) {
                C6XJ c6xj = (C6XJ) either.A00;
                if (c6xj != null) {
                    c6xj.A05 = str;
                    return;
                }
                return;
            }
            if (!(!z) || (c140966Yy = (C140966Yy) either.A01) == null) {
                return;
            }
            c140966Yy.A0B = str;
        }
    }
}
