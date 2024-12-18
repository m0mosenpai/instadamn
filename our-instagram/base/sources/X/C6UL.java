package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6UL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6UL {
    public View A00;
    public View A01;
    public View A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public C6QY A06;
    public C139456Ta A07;
    public C139586Tn A08;
    public final View A09;
    public final View A0A;
    public final UserSession A0B;
    public final InterfaceC56392iX A0C;

    public final View A00() {
        View view = this.A01;
        if (view != null) {
            return view;
        }
        C14360o3.A0F("endSceneContainer");
        throw C00O.createAndThrow();
    }

    public final TextView A01() {
        TextView textView = this.A04;
        if (textView != null) {
            return textView;
        }
        C14360o3.A0F("subtitle");
        throw C00O.createAndThrow();
    }

    public C6UL(View view, View view2, UserSession userSession, InterfaceC56392iX interfaceC56392iX) {
        this.A0C = interfaceC56392iX;
        this.A0A = view;
        this.A09 = view2;
        this.A0B = userSession;
        interfaceC56392iX.EZv(new InterfaceC69513Al() { // from class: X.6UM
            @Override // X.InterfaceC69513Al
            public final void DLu(View view3) {
                C14360o3.A0B(view3, 0);
                C6UL c6ul = C6UL.this;
                View requireViewById = view3.requireViewById(R.id.end_scene_container);
                C14360o3.A0B(requireViewById, 0);
                c6ul.A01 = requireViewById;
                View requireViewById2 = view3.requireViewById(R.id.end_scene_overlay);
                C14360o3.A0B(requireViewById2, 0);
                c6ul.A02 = requireViewById2;
                TextView textView = (TextView) view3.requireViewById(R.id.end_scene_title);
                C14360o3.A0B(textView, 0);
                c6ul.A05 = textView;
                TextView textView2 = (TextView) view3.requireViewById(R.id.end_scene_subtitle);
                C14360o3.A0B(textView2, 0);
                c6ul.A04 = textView2;
                View requireViewById3 = view3.requireViewById(R.id.cta_button_post_dwell);
                C14360o3.A0B(requireViewById3, 0);
                c6ul.A00 = requireViewById3;
                c6ul.A06 = new C6QY(AbstractC56372iV.A01(view3.requireViewById(R.id.reel_endscene_cta_sticker_stub), false, false));
                TextView textView3 = (TextView) view3.requireViewById(R.id.cta_button_post_dwell_text);
                C14360o3.A0B(textView3, 0);
                c6ul.A03 = textView3;
                Integer num = C05F.A00;
                c6ul.A08 = new C139586Tn(AbstractC56372iV.A01(view3.requireViewById(R.id.social_context_stub), false, false), num);
                c6ul.A07 = new C139456Ta(AbstractC56372iV.A01(view3.requireViewById(R.id.popularity_proof_stub), false, false), num);
                double A00 = C18U.A00(C06090Tz.A05, c6ul.A0B, 37175205394842230L);
                if (A00 > 0.0d) {
                    C14360o3.A07(c6ul.A00().getContext());
                    double A002 = AbstractC13890nF.A00(r0) * 0.2f;
                    double d = A00;
                    if (A00 > A002) {
                        d = A002;
                    }
                    if (A00 > d) {
                        A00 = d;
                    }
                    ViewGroup.LayoutParams layoutParams = c6ul.A00().getLayoutParams();
                    C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    Resources resources = c6ul.A00().getContext().getResources();
                    C14360o3.A07(resources);
                    marginLayoutParams.topMargin = AbstractC69815Vw1.A01(resources, (float) A00);
                    c6ul.A00().setLayoutParams(marginLayoutParams);
                }
            }
        });
    }
}
