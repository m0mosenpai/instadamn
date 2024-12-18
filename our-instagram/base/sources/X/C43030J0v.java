package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.J0v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43030J0v implements InterfaceC86363t8 {
    public String A00 = "partial_sheet";
    public boolean A01;
    public final FragmentActivity A02;
    public final View A03;
    public final UserSession A04;
    public final C38321qM A05;
    public final InterfaceC60442pS A06;
    public final C75113Zb A07;
    public final C37560GgG A08;
    public final C37635GhU A09;
    public final C37636GhV A0A;
    public final boolean A0B;

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void CwR(Integer num, float f) {
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void D5o() {
    }

    @Override // X.InterfaceC86363t8
    public final void D5p(Integer num) {
        String str;
        View findViewById;
        C14360o3.A0B(num, 0);
        if (this.A0B && (findViewById = this.A02.findViewById(R.id.action_bar_right_side_buttons_wrapper)) != null) {
            findViewById.setVisibility(0);
        }
        this.A07.A0O(EnumC37732Gj7.A04);
        this.A00 = "collapse";
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 11) {
                if (intValue != 2 && intValue != 3) {
                    if (intValue != 9) {
                        str = "unknown";
                    } else {
                        str = "on_entry";
                    }
                } else {
                    str = "drag";
                }
            } else {
                str = "back_press";
            }
        } else {
            str = "browser_left_icon_tap";
        }
        if (!str.equals("on_entry")) {
            C37635GhU.A00(this.A04, this.A05, this.A06, str, "collapse");
        }
    }

    @Override // X.InterfaceC86363t8
    public final void Dyj(C51752Mtb c51752Mtb) {
        String str;
        String str2;
        C14360o3.A0B(c51752Mtb, 0);
        C38321qM c38321qM = this.A05;
        int i = c51752Mtb.A00;
        if (i != 1) {
            if (i != 2) {
                str = "swipe_vertical";
            } else {
                str = "swipe_down";
            }
        } else {
            str = "swipe_up";
        }
        int i2 = c51752Mtb.A01;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    str2 = "partial_sheet";
                } else {
                    str2 = "collapse";
                }
            } else {
                str2 = "fullscreen";
            }
        } else {
            str2 = "dismiss";
        }
        if (str2.equals(this.A00)) {
            str2 = "no_change";
        }
        C37635GhU.A00(this.A04, c38321qM, this.A06, str, str2);
    }

    @Override // X.InterfaceC86363t8
    public final void CwQ(float f) {
        AbstractC167007dF.A0x(this.A02.findViewById(R.id.action_bar_right_side_buttons_wrapper));
        this.A07.A0O(EnumC37732Gj7.A02);
        this.A00 = "partial_sheet";
    }

    @Override // X.InterfaceC86363t8
    public final void DB6() {
        AbstractC167007dF.A0w(this.A02.findViewById(R.id.action_bar_right_side_buttons_wrapper));
        this.A07.A0O(EnumC37732Gj7.A03);
        C37636GhV c37636GhV = this.A0A;
        C37636GhV.A00(c37636GhV, c37636GhV.A02);
        this.A00 = "dismiss";
        if (this.A01) {
            this.A08.A0W("resume", false);
            this.A01 = false;
        }
        this.A03.setVisibility(8);
    }

    @Override // X.InterfaceC86363t8
    public final void DId(Integer num) {
        C37560GgG c37560GgG = this.A08;
        C25370BKn A04 = C37560GgG.A04(c37560GgG);
        if (A04 != null && c37560GgG.A0d(A04)) {
            c37560GgG.A0S(null, "bottom_sheet", true, false);
            this.A01 = true;
        }
        this.A00 = "fullscreen";
        this.A07.A0O(EnumC37732Gj7.A05);
    }

    @Override // X.InterfaceC86363t8
    public final void DZk(int i, int i2) {
        View view = this.A03;
        if (view == null || view.getVisibility() != 8) {
            view.setVisibility(8);
        }
        C37636GhV c37636GhV = this.A0A;
        Integer num = c37636GhV.A03.A0g;
        if (num != null) {
            int intValue = num.intValue();
            int i3 = c37636GhV.A00;
            if (i3 == -1) {
                c37636GhV.A00 = i;
                i3 = i;
            }
            int i4 = c37636GhV.A02;
            int i5 = c37636GhV.A01;
            if (i <= i4 - i5 && i >= Math.min(i3, intValue - i5)) {
                C37636GhV.A00(c37636GhV, i + i5);
            }
        }
        if (this.A01) {
            this.A08.A0W("resume", false);
            this.A01 = false;
        }
        C75113Zb c75113Zb = this.A07;
        EnumC37732Gj7 enumC37732Gj7 = c75113Zb.A0n;
        EnumC37732Gj7 enumC37732Gj72 = EnumC37732Gj7.A06;
        if (enumC37732Gj7 != enumC37732Gj72) {
            c75113Zb.A0O(enumC37732Gj72);
        }
    }

    public C43030J0v(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, C37560GgG c37560GgG, C37636GhV c37636GhV, boolean z) {
        this.A05 = c38321qM;
        this.A07 = c75113Zb;
        this.A04 = userSession;
        this.A06 = interfaceC60442pS;
        this.A02 = fragmentActivity;
        this.A0A = c37636GhV;
        this.A08 = c37560GgG;
        this.A0B = z;
        this.A09 = new C37635GhU(userSession);
        this.A03 = fragmentActivity.findViewById(R.id.action_bar_title);
    }
}
