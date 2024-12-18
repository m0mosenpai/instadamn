package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.util.Arrays;

/* renamed from: X.ChX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28479ChX {
    public static UserSession A00;
    public static final C28479ChX A01 = new Object();

    public static final View A01(Context context, ViewGroup viewGroup, UserSession userSession) {
        AbstractC167007dF.A1D(context, 0, userSession);
        A00 = userSession;
        View A0D = AbstractC25227BEk.A0D(LayoutInflater.from(context), viewGroup, R.layout.row_feed_media_overlay_cta, false);
        A0D.setTag(new C25944Bdl(A0D));
        return A0D;
    }

    public static final void A03(C9BR c9br, InterfaceC11380iw interfaceC11380iw, C25944Bdl c25944Bdl, InterfaceC144646fk interfaceC144646fk) {
        C14360o3.A0B(c9br, 0);
        AbstractC167027dH.A13(c25944Bdl, interfaceC144646fk, interfaceC11380iw);
        C26082BgB c26082BgB = (C26082BgB) c9br.A01;
        InterfaceC109094vY interfaceC109094vY = (InterfaceC109094vY) AbstractC25226BEj.A1C(c26082BgB.A00);
        ViewOnClickListenerC28665ClD viewOnClickListenerC28665ClD = null;
        if (interfaceC109094vY != null) {
            InterfaceC109864xE A02 = BFB.A02(interfaceC109094vY);
            InterfaceC109864xE AfL = interfaceC109094vY.AfL();
            if (A02 != null) {
                boolean A1b = AbstractC25231BEo.A1b((InterfaceC16820sZ) c26082BgB.A03);
                RoundedCornerFrameLayout roundedCornerFrameLayout = c25944Bdl.A08;
                int i = 0;
                if (A1b) {
                    i = 8;
                }
                roundedCornerFrameLayout.setVisibility(i);
                if (AbstractC25231BEo.A1b((InterfaceC16820sZ) c26082BgB.A04) && !A1b) {
                    AbstractC25225BEi.A1U(c26082BgB.A02, interfaceC11380iw);
                }
                if (AfL != null && c9br.A02) {
                    A02 = AfL;
                }
                interfaceC109094vY.getOverlayType();
                A04(A02, c25944Bdl, false, false);
                if (AbstractC28293Cdf.A01(A02) != C05F.A01) {
                    viewOnClickListenerC28665ClD = new ViewOnClickListenerC28665ClD(7, interfaceC144646fk, A02, c9br);
                }
                C0fQ.A00(viewOnClickListenerC28665ClD, roundedCornerFrameLayout);
                return;
            }
        }
        C0w9.A03("MediaOverlayCTAViewBinder", "Media has no overlay banner!");
    }

    public static final void A04(InterfaceC109864xE interfaceC109864xE, C25944Bdl c25944Bdl, boolean z, boolean z2) {
        int A002;
        int color;
        int A003;
        String light;
        int A0H;
        String light2;
        Context A0L = AbstractC166997dE.A0L(c25944Bdl.A08);
        if (z) {
            if (z2) {
                int A0A = AbstractC53242c7.A0A(A0L);
                InterfaceC31126Dm9 C6A = interfaceC109864xE.C6A();
                if (C6A != null) {
                    A002 = Color.parseColor(C6A.getDark());
                } else {
                    A002 = A0L.getColor(A0A);
                }
                int A0A2 = AbstractC53242c7.A0A(A0L);
                InterfaceC31126Dm9 Brd = interfaceC109864xE.Brd();
                if (Brd != null) {
                    color = Color.parseColor(Brd.getDark());
                } else {
                    color = A0L.getColor(A0A2);
                }
                A0H = R.color.audio_bar_action_color_enabled;
                InterfaceC31126Dm9 C6A2 = interfaceC109864xE.C6A();
                if (C6A2 != null) {
                    light2 = C6A2.getDark();
                    A003 = Color.parseColor(light2);
                }
                A003 = A0L.getColor(A0H);
            } else {
                int A07 = AbstractC53242c7.A07(A0L);
                InterfaceC31126Dm9 C6A3 = interfaceC109864xE.C6A();
                if (C6A3 != null) {
                    A002 = Color.parseColor(C6A3.getLight());
                } else {
                    A002 = A0L.getColor(A07);
                }
                int A0H2 = AbstractC53242c7.A0H(A0L, R.attr.igds_color_creation_tools_grey_05);
                InterfaceC31126Dm9 Brd2 = interfaceC109864xE.Brd();
                if (Brd2 != null) {
                    color = Color.parseColor(Brd2.getLight());
                } else {
                    color = A0L.getColor(A0H2);
                }
                A0H = AbstractC53242c7.A0H(A0L, R.attr.igds_color_creation_tools_grey_03);
                InterfaceC31126Dm9 C6A4 = interfaceC109864xE.C6A();
                if (C6A4 != null) {
                    light2 = C6A4.getLight();
                    A003 = Color.parseColor(light2);
                }
                A003 = A0L.getColor(A0H);
            }
        } else {
            A002 = AbstractC28293Cdf.A00(A0L, interfaceC109864xE, AbstractC53242c7.A07(A0L));
            int A09 = AbstractC53242c7.A09(A0L);
            InterfaceC31126Dm9 Brd3 = interfaceC109864xE.Brd();
            if (Brd3 != null) {
                if (AbstractC72723Nt.A00(A0L)) {
                    light = Brd3.getDark();
                } else {
                    light = Brd3.getLight();
                }
                color = Color.parseColor(light);
            } else {
                color = A0L.getColor(A09);
            }
            A003 = AbstractC28293Cdf.A00(AbstractC166997dE.A0L(c25944Bdl.A06), interfaceC109864xE, AbstractC53242c7.A0H(A0L, R.attr.igds_color_creation_tools_grey_03));
        }
        IgSimpleImageView igSimpleImageView = c25944Bdl.A06;
        Boolean A0b = AbstractC166997dE.A0b();
        int i = 8;
        igSimpleImageView.setVisibility(AbstractC167007dF.A05(A0b.equals(interfaceC109864xE.BBL()) ? 1 : 0));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        igSimpleImageView.setColorFilter(new PorterDuffColorFilter(A003, mode));
        IgSimpleImageView igSimpleImageView2 = c25944Bdl.A07;
        int i2 = 8;
        if (interfaceC109864xE.BEg() != null) {
            i2 = 0;
        }
        igSimpleImageView2.setVisibility(i2);
        if (interfaceC109864xE.BEg() != null) {
            igSimpleImageView2.setImageResource(AbstractC46598Kjb.A00(interfaceC109864xE.BEg()));
            igSimpleImageView2.setColorFilter(new PorterDuffColorFilter(A002, mode));
        }
        String text = interfaceC109864xE.getText();
        interfaceC109864xE.getActionUrl();
        TextView textView = c25944Bdl.A03;
        textView.setText(text);
        textView.setTextColor(A002);
        TextView textView2 = c25944Bdl.A04;
        String secondaryText = interfaceC109864xE.getSecondaryText();
        if (secondaryText != null && secondaryText.length() != 0) {
            i = 0;
        }
        textView2.setVisibility(i);
        textView2.setTextColor(color);
        String secondaryText2 = interfaceC109864xE.getSecondaryText();
        if (secondaryText2 != null && secondaryText2.length() != 0) {
            textView2.setText(interfaceC109864xE.getSecondaryText());
        }
        A02(textView, A0b.equals(interfaceC109864xE.CeI()));
        Boolean CeI = interfaceC109864xE.CeI();
        if (CeI != null) {
            A02(textView2, CeI.booleanValue());
        }
    }

    public static final int A00(C38321qM c38321qM) {
        return Arrays.hashCode(new Object[]{c38321qM.getId(), Boolean.valueOf(c38321qM.A6T()), Boolean.valueOf(c38321qM.A5n())});
    }

    public static final void A02(TextView textView, boolean z) {
        LinearLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        if (layoutParams2 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        int i = 17;
        if (layoutParams != null) {
            int i2 = 8388627;
            if (z) {
                i2 = 17;
            }
            layoutParams.gravity = i2;
        }
        textView.setLayoutParams(layoutParams);
        if (!z) {
            i = 8388627;
        }
        textView.setGravity(i);
    }
}
