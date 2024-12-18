package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.6UG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6UG {
    public ViewGroup A00;
    public ViewGroup A01;
    public ViewGroup A02;
    public ViewGroup A03;
    public ViewGroup A04;
    public ViewGroup A05;
    public ViewGroup A06;
    public IgTextView A07;
    public final InterfaceC56392iX A08;
    public final MediaFrameLayout A09;
    public final RoundedCornerFrameLayout A0A;
    public final UserSession A0B;

    public C6UG(ViewStub viewStub, UserSession userSession, MediaFrameLayout mediaFrameLayout, RoundedCornerFrameLayout roundedCornerFrameLayout) {
        C14360o3.A0B(mediaFrameLayout, 3);
        C14360o3.A0B(viewStub, 4);
        this.A0B = userSession;
        this.A0A = roundedCornerFrameLayout;
        this.A09 = mediaFrameLayout;
        InterfaceC56392iX A01 = AbstractC56372iV.A01(viewStub, false, false);
        this.A08 = A01;
        A01.EZv(new InterfaceC69513Al() { // from class: X.6UH
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                C14360o3.A0B(view, 0);
                C6UG c6ug = C6UG.this;
                ViewGroup viewGroup = (ViewGroup) view.requireViewById(R.id.thumbnail_container);
                C14360o3.A0B(viewGroup, 0);
                c6ug.A06 = viewGroup;
                ViewGroup viewGroup2 = (ViewGroup) view.requireViewById(R.id.rounded_thumbnail_container);
                C14360o3.A0B(viewGroup2, 0);
                c6ug.A01 = viewGroup2;
                ViewGroup viewGroup3 = (ViewGroup) view.requireViewById(R.id.rounded_thumbnail_with_title_container);
                C14360o3.A0B(viewGroup3, 0);
                c6ug.A02 = viewGroup3;
                ViewGroup viewGroup4 = (ViewGroup) view.requireViewById(R.id.rounded_three_thumbnail_container);
                C14360o3.A0B(viewGroup4, 0);
                c6ug.A00 = viewGroup4;
                IgTextView igTextView = (IgTextView) view.requireViewById(R.id.collection_ad_headline_text);
                C14360o3.A0B(igTextView, 0);
                c6ug.A07 = igTextView;
                ViewGroup viewGroup5 = (ViewGroup) view.requireViewById(R.id.collection_ad_six_thumbnail_second_card);
                C14360o3.A0B(viewGroup5, 0);
                c6ug.A05 = viewGroup5;
                ViewGroup viewGroup6 = (ViewGroup) view.requireViewById(R.id.collection_ad_four_thumbnail_second_card_with_title);
                C14360o3.A0B(viewGroup6, 0);
                c6ug.A04 = viewGroup6;
                ViewGroup viewGroup7 = (ViewGroup) view.requireViewById(R.id.collection_ad_four_thumbnail_second_card);
                C14360o3.A0B(viewGroup7, 0);
                c6ug.A03 = viewGroup7;
            }
        });
    }
}
