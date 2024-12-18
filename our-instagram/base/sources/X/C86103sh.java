package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.3sh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86103sh {
    public View A00;
    public ViewGroup A01;
    public ViewGroup A02;
    public ViewGroup A03;
    public ViewGroup A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public C3PF A09;
    public IgImageView A0A;
    public InterfaceC56392iX A0B;
    public InterfaceC56392iX A0C;
    public InterfaceC56392iX A0D;
    public final InterfaceC56392iX A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;

    public final void A02(C75113Zb c75113Zb) {
        C14360o3.A0B(c75113Zb, 0);
        C3PF c3pf = this.A09;
        if (c3pf != null) {
            c3pf.A03();
        }
        this.A09 = null;
        if (c75113Zb.A2F) {
            A01().setOnTouchListener(null);
            TextView textView = this.A08;
            if (textView != null) {
                textView.setOnClickListener(null);
            }
            A00().setOnClickListener(null);
            TextView textView2 = this.A07;
            if (textView2 != null) {
                textView2.setOnClickListener(null);
            }
        }
        c75113Zb.A0g(false);
    }

    public final View A00() {
        View view = this.A00;
        if (view != null) {
            return view;
        }
        C14360o3.A0F("endscreenBackdrop");
        throw C00O.createAndThrow();
    }

    public final ViewGroup A01() {
        ViewGroup viewGroup = this.A02;
        if (viewGroup != null) {
            return viewGroup;
        }
        C14360o3.A0F("feedPreviewKeepWatchingButton");
        throw C00O.createAndThrow();
    }

    public C86103sh(ViewStub viewStub) {
        InterfaceC56392iX A01 = AbstractC56372iV.A01(viewStub, false, false);
        this.A0E = A01;
        A01.EZv(new InterfaceC69513Al() { // from class: X.3si
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                C14360o3.A0B(view, 0);
                C86103sh c86103sh = C86103sh.this;
                TextView textView = (TextView) view.requireViewById(R.id.feed_preview_keep_watching_text);
                C14360o3.A0B(textView, 0);
                c86103sh.A05 = textView;
                c86103sh.A0C = AbstractC56372iV.A01(view.findViewById(R.id.feed_preview_keep_watching_text_stub), false, false);
                ViewGroup viewGroup = (ViewGroup) view.requireViewById(R.id.feed_preview_keep_watching_button);
                C14360o3.A0B(viewGroup, 0);
                c86103sh.A02 = viewGroup;
                View requireViewById = view.requireViewById(R.id.feed_preview_keep_watching_backdrop);
                C14360o3.A0B(requireViewById, 0);
                c86103sh.A00 = requireViewById;
                c86103sh.A0D = AbstractC56372iV.A01(view.findViewById(R.id.feed_preview_watch_again_text_stub), false, false);
                c86103sh.A08 = (TextView) view.findViewById(R.id.feed_preview_watch_again_text);
                c86103sh.A07 = (TextView) view.findViewById(R.id.feed_preview_subscriptions_text);
                c86103sh.A03 = (ViewGroup) view.findViewById(R.id.feed_preview_secondary_cta_button);
                c86103sh.A06 = (TextView) view.findViewById(R.id.feed_preview_secondary_cta_button_text);
                c86103sh.A01 = (ViewGroup) view.findViewById(R.id.feed_preview_bottom_cta_container);
                InterfaceC56392iX A012 = AbstractC56372iV.A01(view.findViewById(R.id.feed_preview_endscreen_thumbnail_container_stub), false, false);
                A012.EZv(new C23712Ael(c86103sh));
                c86103sh.A0B = A012;
            }
        });
        this.A0I = C1XM.A00(new C207019Eg(this, 42));
        this.A0J = C1XM.A00(new C207019Eg(this, 43));
        this.A0H = C1XM.A00(new C207019Eg(this, 41));
        this.A0F = C1XM.A00(new C207019Eg(this, 39));
        this.A0G = C1XM.A00(new C207019Eg(this, 40));
    }
}
