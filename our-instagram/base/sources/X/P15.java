package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P15 implements InterfaceC58169PqZ {
    public C52368NFi A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final InterfaceC58310Pt2 A03;
    public final NKM A04;
    public final EnumC53380NjV A05;
    public final C81X A06;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A01;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, this, null, 4), C07Y.A00(viewLifecycleOwner));
    }

    public static final void A00(P15 p15) {
        String str;
        UserSession userSession;
        MU0 mu0;
        C51624MrH A08;
        String str2;
        ConstraintLayout constraintLayout;
        NKM nkm = p15.A04;
        C51674Ms5 A03 = OX6.A03(nkm);
        C52368NFi c52368NFi = p15.A00;
        if (c52368NFi != null) {
            OOv.A01(c52368NFi, true);
            Integer num = A03.A02;
            if (num != null) {
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue == 3) {
                                C52368NFi c52368NFi2 = p15.A00;
                                if (c52368NFi2 != null) {
                                    OOv.A01(c52368NFi2, true);
                                    C52368NFi c52368NFi3 = p15.A00;
                                    if (c52368NFi3 != null) {
                                        ViewOnClickListenerC55466OkL.A02(c52368NFi3, 39, p15);
                                        return;
                                    }
                                }
                            }
                        } else {
                            C52368NFi c52368NFi4 = p15.A00;
                            if (c52368NFi4 != null) {
                                OOv.A01(c52368NFi4, true);
                                C52368NFi c52368NFi5 = p15.A00;
                                if (c52368NFi5 != null) {
                                    ViewOnClickListenerC55466OkL.A02(c52368NFi5, 38, p15);
                                    return;
                                }
                            }
                        }
                    } else {
                        C52368NFi c52368NFi6 = p15.A00;
                        if (c52368NFi6 != null) {
                            OOv.A01(c52368NFi6, true);
                            boolean z = A03.A04;
                            boolean z2 = A03.A07;
                            C52368NFi c52368NFi7 = p15.A00;
                            if (c52368NFi7 != null) {
                                c52368NFi7.setSubtitle(null);
                                C52368NFi c52368NFi8 = p15.A00;
                                if (c52368NFi8 != null) {
                                    c52368NFi8.setChecked(z);
                                    C52368NFi c52368NFi9 = p15.A00;
                                    if (c52368NFi9 != null) {
                                        c52368NFi9.setOnToggleListener(new G9F(p15, 0, z, z2));
                                        AbstractC59962oe abstractC59962oe = p15.A01;
                                        c52368NFi9.setTitle(AbstractC167027dH.A0P(abstractC59962oe.requireContext(), 2131962025));
                                        C52368NFi c52368NFi10 = p15.A00;
                                        if (c52368NFi10 != null) {
                                            c52368NFi10.setProfileImage(abstractC59962oe.requireContext().getDrawable(R.drawable.unlinked_facebook_icon));
                                            C52368NFi c52368NFi11 = p15.A00;
                                            if (c52368NFi11 != null) {
                                                View view = c52368NFi11.A0F;
                                                if ((view instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) view) != null) {
                                                    C110964z8 c110964z8 = new C110964z8();
                                                    c110964z8.A0I(constraintLayout);
                                                    c110964z8.A0C(R.id.title, 3, 0, 3);
                                                    c110964z8.A0C(R.id.title, 4, 0, 4);
                                                    c110964z8.A0G(constraintLayout);
                                                    TextView textView = c52368NFi11.A04;
                                                    if (textView != null) {
                                                        textView.setGravity(17);
                                                    }
                                                    TextView textView2 = c52368NFi11.A04;
                                                    if (textView2 != null) {
                                                        textView2.setTextAlignment(1);
                                                    }
                                                }
                                                OXw.A02(MU0.VIEW, p15.A02, false);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    C52368NFi c52368NFi12 = p15.A00;
                    if (c52368NFi12 != null) {
                        OOv.A01(c52368NFi12, true);
                        boolean z3 = A03.A04;
                        EnumC53249Ngn A09 = nkm.A09(true);
                        if (A09 != null) {
                            ViewOnClickListenerC55465OkK A00 = ViewOnClickListenerC55465OkK.A00(A09, p15, 15);
                            C52368NFi c52368NFi13 = p15.A00;
                            if (c52368NFi13 != null) {
                                c52368NFi13.setShowDisabledState(true);
                                C52368NFi c52368NFi14 = p15.A00;
                                if (c52368NFi14 != null) {
                                    c52368NFi14.setEnableSwitchView(false);
                                    C52368NFi c52368NFi15 = p15.A00;
                                    if (c52368NFi15 != null) {
                                        C0fQ.A00(A00, c52368NFi15);
                                        nkm.A0A(A09, true);
                                        userSession = p15.A02;
                                        mu0 = MU0.UNAVAILABLE;
                                        OXw.A02(mu0, userSession, z3);
                                        return;
                                    }
                                }
                            }
                        } else {
                            String str3 = null;
                            String str4 = null;
                            C52368NFi c52368NFi16 = p15.A00;
                            if (c52368NFi16 != null) {
                                c52368NFi16.setShowDisabledState(false);
                                C52368NFi c52368NFi17 = p15.A00;
                                if (c52368NFi17 != null) {
                                    c52368NFi17.setEnableSwitchView(true);
                                    C52368NFi c52368NFi18 = p15.A00;
                                    if (c52368NFi18 != null) {
                                        AbstractC59962oe abstractC59962oe2 = p15.A01;
                                        Context requireContext = abstractC59962oe2.requireContext();
                                        String A0P = AbstractC167027dH.A0P(abstractC59962oe2.requireContext(), 2131962025);
                                        C51624MrH A082 = nkm.A08();
                                        if (A082 != null) {
                                            str = A082.A02;
                                        } else {
                                            str = null;
                                        }
                                        c52368NFi18.setSubtitle(AbstractC31174DnI.A0t(requireContext, A0P, str, 2131971975));
                                        C52368NFi c52368NFi19 = p15.A00;
                                        if (c52368NFi19 != null) {
                                            c52368NFi19.setOnClickListener(null);
                                            C52368NFi c52368NFi20 = p15.A00;
                                            if (c52368NFi20 != null) {
                                                C51624MrH A083 = nkm.A08();
                                                if (A083 != null) {
                                                    str4 = A083.A04;
                                                }
                                                c52368NFi20.setTitle(str4);
                                                Drawable drawable = abstractC59962oe2.requireContext().getDrawable(R.drawable.avatar_bottom_badge_facebook);
                                                if (drawable != null && (A08 = nkm.A08()) != null && (str2 = A08.A05) != null) {
                                                    C52368NFi c52368NFi21 = p15.A00;
                                                    if (c52368NFi21 != null) {
                                                        c52368NFi21.setProfileImage(abstractC59962oe2, str2, drawable);
                                                    }
                                                }
                                                C52368NFi c52368NFi22 = p15.A00;
                                                if (c52368NFi22 != null) {
                                                    Context requireContext2 = abstractC59962oe2.requireContext();
                                                    String A0P2 = AbstractC167027dH.A0P(abstractC59962oe2.requireContext(), 2131962025);
                                                    C51624MrH A084 = nkm.A08();
                                                    if (A084 != null) {
                                                        str3 = A084.A02;
                                                    }
                                                    c52368NFi22.setSubtitle(AbstractC31174DnI.A0t(requireContext2, A0P2, str3, 2131971975));
                                                    C52368NFi c52368NFi23 = p15.A00;
                                                    if (c52368NFi23 != null) {
                                                        c52368NFi23.setChecked(z3);
                                                        C52368NFi c52368NFi24 = p15.A00;
                                                        if (c52368NFi24 != null) {
                                                            c52368NFi24.setOnToggleListener(new P3T(p15, 19));
                                                            userSession = p15.A02;
                                                            mu0 = MU0.VIEW;
                                                            OXw.A02(mu0, userSession, z3);
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C52368NFi c52368NFi25 = p15.A00;
            if (c52368NFi25 != null) {
                OOv.A01(c52368NFi25, false);
                return;
            }
        }
        C14360o3.A0F("shareToFbContainer");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        String str;
        String str2;
        String str3;
        Drawable drawable;
        AbstractC59962oe abstractC59962oe = this.A01;
        Context requireContext = abstractC59962oe.requireContext();
        NKM nkm = this.A04;
        C51624MrH A08 = nkm.A08();
        if (A08 != null) {
            str = A08.A04;
        } else {
            str = null;
        }
        Context requireContext2 = abstractC59962oe.requireContext();
        String A0P = AbstractC167027dH.A0P(abstractC59962oe.requireContext(), 2131962025);
        C51624MrH A082 = nkm.A08();
        if (A082 != null) {
            str2 = A082.A02;
        } else {
            str2 = null;
        }
        String A0t = AbstractC31174DnI.A0t(requireContext2, A0P, str2, 2131971975);
        C51624MrH A083 = nkm.A08();
        if (A083 != null) {
            str3 = A083.A05;
        } else {
            str3 = null;
        }
        C52368NFi c52368NFi = new C52368NFi(requireContext);
        AbstractC43592JPx.A1H(c52368NFi, -1, -2);
        c52368NFi.setOrientation(1);
        c52368NFi.setTitle(str);
        if (str3 != null && (drawable = requireContext.getDrawable(R.drawable.avatar_bottom_badge_facebook)) != null) {
            c52368NFi.setProfileImage(abstractC59962oe, str3, drawable);
        }
        if (A0t != null) {
            c52368NFi.setSubtitle(A0t);
        }
        this.A00 = c52368NFi;
        if (!C18U.A06(C06090Tz.A05, this.A02, 36330776169563152L)) {
            View inflate = AbstractC31175DnJ.A06(abstractC59962oe).inflate(R.layout.layout_share_sheet_share_to_title, (ViewGroup) null);
            C14360o3.A0C(inflate, AbstractC43591JPw.A00(3));
            TextView textView = (TextView) inflate;
            textView.setText(2131955818);
            LinearLayout linearLayout = new LinearLayout(abstractC59962oe.requireContext());
            AbstractC43592JPx.A1H(linearLayout, -1, -2);
            linearLayout.setOrientation(1);
            linearLayout.addView(textView);
            linearLayout.addView(c52368NFi);
            return linearLayout;
        }
        return c52368NFi;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return this.A05;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A06;
    }

    public P15(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC58310Pt2 interfaceC58310Pt2, NKM nkm) {
        AbstractC25234BEr.A1P(abstractC59962oe, userSession, interfaceC58310Pt2);
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        this.A04 = nkm;
        this.A03 = interfaceC58310Pt2;
        this.A06 = C81X.A2F;
        this.A05 = EnumC53380NjV.A0I;
    }
}
