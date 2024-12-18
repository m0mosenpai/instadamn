package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.notifications.badging.ui.component.ToastingBadge;

/* renamed from: X.2lH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58012lH implements InterfaceC58022lI {
    public ToastingBadge A00;
    public View A01;
    public ViewStub A02;
    public final View A03;
    public final View A04;
    public final InterfaceC53862dQ A05;
    public final C1QO A06;
    public final String A07;
    public final View A08;
    public final View A09;
    public final InterfaceC58042lK A0A = new InterfaceC58042lK() { // from class: X.2lJ
        @Override // X.InterfaceC58042lK
        public final void Dnn(Integer num, float f) {
            View view;
            float f2;
            C14360o3.A0B(num, 1);
            double d = f;
            if (d < 0.5d && num == C05F.A0N) {
                view = C58012lH.this.A03;
                C14360o3.A0A(view);
                f2 = 1.0f;
            } else {
                if (d <= 0.5d || num != C05F.A01) {
                    return;
                }
                view = C58012lH.this.A03;
                C14360o3.A0A(view);
                f2 = 0.0f;
            }
            view.setAlpha(f2);
        }
    };

    public C58012lH(Context context, ViewGroup viewGroup, C07X c07x, UserSession userSession, InterfaceC53862dQ interfaceC53862dQ, final InterfaceC53902dU interfaceC53902dU, final C1QO c1qo, String str) {
        View findViewById;
        View view;
        int i;
        this.A06 = c1qo;
        this.A05 = interfaceC53862dQ;
        this.A07 = str;
        boolean A00 = AbstractC54332en.A00(userSession).A02().A00();
        C1QO c1qo2 = C1QO.A0D;
        if (c1qo == c1qo2) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.toasting_badged_tab_button, viewGroup, false);
            this.A04 = inflate;
            C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.notifications.badging.ui.component.ToastingBadge");
            ToastingBadge toastingBadge = (ToastingBadge) inflate;
            toastingBadge.A09 = C18U.A06(C06090Tz.A05, userSession, 36324630071619884L);
            toastingBadge.setUseCase(EnumC54222eY.A09);
            toastingBadge.setLifecycleOwner(c07x);
            toastingBadge.A08 = this;
            toastingBadge.A07 = new InterfaceC58442m3() { // from class: X.2m2
                @Override // X.InterfaceC58442m3
                public final void Dtm() {
                    InterfaceC53902dU.this.DtT(c1qo);
                }
            };
            this.A00 = toastingBadge;
        } else if (c1qo == C1QO.A0E && A00) {
            View inflate2 = LayoutInflater.from(context).inflate(R.layout.toasting_badged_tab_button, viewGroup, false);
            this.A04 = inflate2;
            C14360o3.A0C(inflate2, "null cannot be cast to non-null type com.instagram.notifications.badging.ui.component.ToastingBadge");
            ToastingBadge toastingBadge2 = (ToastingBadge) inflate2;
            toastingBadge2.A09 = C18U.A06(C06090Tz.A05, userSession, 36324630071619884L);
            toastingBadge2.setUseCase(EnumC54222eY.A0b);
            toastingBadge2.setLifecycleOwner(c07x);
            toastingBadge2.A07 = new InterfaceC58442m3() { // from class: X.2mg
                @Override // X.InterfaceC58442m3
                public final void Dtm() {
                    InterfaceC53902dU.this.DtT(c1qo);
                }
            };
        } else if (c1qo == C1QO.A0C) {
            View inflate3 = LayoutInflater.from(context).inflate(R.layout.badged_tab_button, viewGroup, false);
            this.A04 = inflate3;
            C14360o3.A0C(inflate3, "null cannot be cast to non-null type com.instagram.notifications.badging.ui.component.ToastingBadge");
            ToastingBadge toastingBadge3 = (ToastingBadge) inflate3;
            toastingBadge3.A09 = C18U.A06(C06090Tz.A05, userSession, 36324630071619884L);
            toastingBadge3.setUseCase(EnumC54222eY.A0Q);
            toastingBadge3.setLifecycleOwner(c07x);
        } else if (str.equals("notification_type_dot")) {
            View inflate4 = LayoutInflater.from(context).inflate(R.layout.tab_button, viewGroup, false);
            this.A04 = inflate4;
            this.A02 = (ViewStub) inflate4.findViewById(R.id.notification_view_stub);
        } else if (str.equals("notification_type_count")) {
            this.A04 = LayoutInflater.from(context).inflate(R.layout.tab_button_count, viewGroup, false);
        } else if (str.equals("notification_type_badge")) {
            View inflate5 = LayoutInflater.from(context).inflate(R.layout.tab_button_badge, viewGroup, false);
            this.A04 = inflate5;
            this.A01 = inflate5.findViewById(R.id.tab_notification_wrapper);
        } else {
            throw new IllegalStateException("Unknown notification tab type passed");
        }
        if (this.A02 != null) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36324630071750958L) && !C18U.A06(c06090Tz, userSession, 36324630072144180L)) {
                ViewStub viewStub = this.A02;
                if (viewStub != null) {
                    findViewById = viewStub.inflate();
                    if (findViewById != null) {
                        findViewById.setVisibility(8);
                    }
                } else {
                    findViewById = null;
                }
            } else {
                findViewById = this.A02;
            }
        } else {
            findViewById = this.A04.findViewById(R.id.notification);
        }
        this.A03 = findViewById;
        View view2 = this.A04;
        this.A08 = view2;
        if (c1qo == C1QO.A0E) {
            View view3 = this.A01;
            view3 = view3 == null ? view2 : view3;
            C14360o3.A0C(view3, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup2 = (ViewGroup) view3;
            viewGroup2.addView(LayoutInflater.from(context).inflate(R.layout.tab_profile_button, viewGroup2, false), viewGroup2.indexOfChild(findViewById));
            View requireViewById = this.A04.requireViewById(R.id.tab_avatar);
            C14360o3.A07(requireViewById);
            IgImageView igImageView = (IgImageView) requireViewById;
            igImageView.setUrl(userSession, C17060sy.A01.A01(userSession).Bhu(), c1qo, C1WW.A04);
            this.A09 = igImageView;
            if (!C18U.A06(C06090Tz.A05, userSession, 36324630071816495L)) {
                ((ViewStub) this.A04.findViewById(R.id.tab_icon_stub)).inflate();
            }
        } else {
            ViewStub viewStub2 = (ViewStub) view2.findViewById(R.id.tab_icon_stub);
            if (viewStub2 != null) {
                view = viewStub2.inflate();
            } else {
                view = this.A04;
            }
            ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) view.requireViewById(R.id.tab_icon);
            C14360o3.A0A(colorFilterAlphaImageView);
            C06090Tz c06090Tz2 = C06090Tz.A05;
            boolean A06 = C18U.A06(c06090Tz2, userSession, 36315537626369396L);
            if (c1qo == C1QO.A0B && AbstractC47372Fk.A00(userSession)) {
                i = R.drawable.tab_direct_messenger_drawable;
                if (A06) {
                    i = R.drawable.instagram_app_messenger_pano_filled_24;
                }
            } else {
                boolean A062 = C18U.A06(c06090Tz2, userSession, 36315537626434933L);
                if (c1qo == c1qo2 && A062) {
                    i = R.drawable.tab_activity_bell_drawable;
                    if (A06) {
                        i = R.drawable.instagram_alert_new_pano_filled_24;
                    }
                } else if (A06) {
                    i = c1qo.A02;
                } else {
                    i = c1qo.A00;
                }
            }
            colorFilterAlphaImageView.setImageResource(i);
            if (C18U.A06(c06090Tz2, userSession, 36315537626369396L)) {
                colorFilterAlphaImageView.setNormalColor(colorFilterAlphaImageView.getContext().getColor(R.color.direct_dark_mode_composer_hint_text_color));
            }
            this.A09 = colorFilterAlphaImageView;
        }
        this.A04.setId(c1qo.A03);
        this.A04.setContentDescription(context.getResources().getString(c1qo.A01));
        AbstractC56952jT.A04(this.A04, C05F.A01);
        this.A04.setTag(c1qo);
    }
}
