package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.FcI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C35045FcI {
    public View A00;
    public View A01;
    public ViewGroup A02;
    public ViewGroup A03;
    public ViewGroup A04;
    public IgTextView A05;
    public IgTextView A06;
    public InterfaceC37220GaV A07;
    public IgdsButton A08;
    public IgdsButton A09;
    public final Context A0A;
    public final View A0B;
    public final UserSession A0C;
    public final boolean A0D;

    public static final void A00(View view, CharSequence charSequence) {
        if (charSequence != null) {
            view.setVisibility(0);
            if (view instanceof IgdsButton) {
                ((IgdsButton) view).setText(charSequence.toString());
                return;
            } else {
                if (!(view instanceof IgTextView)) {
                    return;
                }
                ((TextView) view).setText(charSequence);
                return;
            }
        }
        view.setVisibility(8);
    }

    public final ViewGroup A01() {
        ViewGroup viewGroup = this.A02;
        if (viewGroup != null) {
            return viewGroup;
        }
        C14360o3.A0F("bannerContainer");
        throw C00O.createAndThrow();
    }

    public final ViewGroup A02() {
        ViewGroup viewGroup = this.A03;
        if (viewGroup != null) {
            return viewGroup;
        }
        C14360o3.A0F("ctaButtonContainer");
        throw C00O.createAndThrow();
    }

    public final ViewGroup A03() {
        ViewGroup viewGroup = this.A04;
        if (viewGroup != null) {
            return viewGroup;
        }
        C14360o3.A0F("disabledComposerContainer");
        throw C00O.createAndThrow();
    }

    public final void A04() {
        if (this instanceof C32679Ea6) {
            C32679Ea6 c32679Ea6 = (C32679Ea6) this;
            c32679Ea6.A05();
            c32679Ea6.A00 = AbstractC31173DnH.A0G(c32679Ea6.A02(), R.id.broadcast_chat_composer_social_context_stub);
            c32679Ea6.A01 = new FRJ(c32679Ea6.A02, AbstractC166997dE.A0S(c32679Ea6.A04, R.id.broadcast_channel_daily_prompts_persistence_banner), c32679Ea6.A08);
            c32679Ea6.A05.setAnimationListener(c32679Ea6.A07);
            return;
        }
        A05();
    }

    public final void A05() {
        View view = this.A0B;
        ViewGroup A0F = AbstractC31173DnH.A0F(view, R.id.broadcast_chat_banner_container);
        C14360o3.A0B(A0F, 0);
        this.A02 = A0F;
        ViewGroup A0F2 = AbstractC31173DnH.A0F(view, R.id.broadcast_chat_disabled_composer_container);
        C14360o3.A0B(A0F2, 0);
        this.A04 = A0F2;
        IgTextView A0X = AbstractC31172DnG.A0X(A03(), R.id.broadcast_chat_disabled_composer_text);
        C14360o3.A0B(A0X, 0);
        this.A05 = A0X;
        IgTextView A0X2 = AbstractC31172DnG.A0X(view, R.id.broadcast_chat_footnote);
        C14360o3.A0B(A0X2, 0);
        this.A06 = A0X2;
        ViewGroup A0F3 = AbstractC31173DnH.A0F(view, R.id.broadcast_chat_cta_button_container);
        C14360o3.A0B(A0F3, 0);
        this.A03 = A0F3;
        ViewGroup A02 = A02();
        boolean z = this.A0D;
        int i = R.id.broadcast_chat_composer_buttons_vertical_stub;
        if (z) {
            i = R.id.broadcast_chat_composer_buttons_horizontal_stub;
        }
        AbstractC31173DnH.A0G(A02, i).inflate();
        IgdsButton A0W = AbstractC31173DnH.A0W(A02(), R.id.broadcast_chat_cta_button);
        C14360o3.A0B(A0W, 0);
        this.A08 = A0W;
        IgdsButton A0W2 = AbstractC31173DnH.A0W(A02(), R.id.broadcast_chat_secondary_button);
        C14360o3.A0B(A0W2, 0);
        this.A09 = A0W2;
        View requireViewById = view.requireViewById(R.id.broadcast_chat_disabled_composer_divider);
        C14360o3.A0B(requireViewById, 0);
        this.A01 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.broadcast_chat_composer_container_divider);
        C14360o3.A0B(requireViewById2, 0);
        this.A00 = requireViewById2;
    }

    public final void A06(InterfaceC37220GaV interfaceC37220GaV) {
        String str;
        this.A07 = interfaceC37220GaV;
        IgdsButton igdsButton = this.A08;
        if (igdsButton != null) {
            A00(igdsButton, interfaceC37220GaV.Ata());
            IgdsButton igdsButton2 = this.A09;
            if (igdsButton2 != null) {
                A00(igdsButton2, interfaceC37220GaV.BrR());
                IgTextView igTextView = this.A06;
                if (igTextView != null) {
                    A00(igTextView, interfaceC37220GaV.B7n());
                    IgTextView igTextView2 = this.A05;
                    if (igTextView2 != null) {
                        A00(igTextView2, interfaceC37220GaV.Ay2());
                        IgdsButton igdsButton3 = this.A08;
                        if (igdsButton3 != null) {
                            ViewOnClickListenerC35681FpG.A01(igdsButton3, 16, interfaceC37220GaV);
                            IgdsButton igdsButton4 = this.A09;
                            if (igdsButton4 != null) {
                                ViewOnClickListenerC35681FpG.A01(igdsButton4, 17, interfaceC37220GaV);
                                return;
                            }
                        }
                    } else {
                        str = "disableComposerText";
                    }
                } else {
                    str = "footnote";
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            str = "secondaryButton";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        str = "ctaButton";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public void A07(C7IK c7ik) {
        String str;
        View view = this.A01;
        if (view != null) {
            int i = c7ik.A08;
            view.setBackgroundColor(i);
            View view2 = this.A00;
            if (view2 != null) {
                view2.setBackgroundColor(i);
                IgTextView igTextView = this.A05;
                if (igTextView != null) {
                    int i2 = c7ik.A00;
                    igTextView.setTextColor(i2);
                    IgTextView igTextView2 = this.A06;
                    if (igTextView2 != null) {
                        igTextView2.setTextColor(i2);
                        return;
                    }
                    str = "footnote";
                } else {
                    str = "disableComposerText";
                }
            } else {
                str = "ctaButtonContainerRowDivider";
            }
        } else {
            str = "divider";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C35045FcI(Context context, View view, UserSession userSession, boolean z) {
        this.A0A = context;
        this.A0C = userSession;
        this.A0B = view;
        this.A0D = z;
    }
}
