package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes11.dex */
public final class UJZ extends C3OO {
    public final int A00;
    public final int A01;
    public final C66356UBx A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final Context A05;
    public final ViewGroup A06;
    public final W3L A07;
    public final InterfaceC11380iw A08;
    public final UserSession A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJZ(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        super(view);
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        this.A09 = userSession;
        this.A08 = interfaceC11380iw;
        Context A0L = AbstractC166997dE.A0L(view);
        this.A05 = A0L;
        W3L w3l = new W3L();
        w3l.A0A = false;
        w3l.A07 = false;
        w3l.A0B = false;
        w3l.A0E = false;
        w3l.A09 = false;
        w3l.A06 = "ig_places_map";
        if ("PlacesMapRowViewHolder.kt".length() > 0) {
            w3l.A05 = "PlacesMapRowViewHolder.kt";
        }
        w3l.A08 = C1H6.A03();
        this.A07 = w3l;
        ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.map_container);
        this.A06 = A0C;
        C66356UBx c66356UBx = new C66356UBx(A0L, w3l);
        this.A02 = c66356UBx;
        this.A01 = A0L.getResources().getDimensionPixelOffset(R.dimen.clips_midcard_three_clips_adjacent_video_width_new_design);
        this.A00 = C1H4.A01(AbstractC13880nE.A04(A0L, 20));
        this.A03 = AbstractC25231BEo.A0d(view, R.id.places_cta_button);
        this.A04 = AbstractC25231BEo.A0d(view, R.id.place_info);
        A0C.addView(c66356UBx);
        c66356UBx.D7y(null);
    }
}
