package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AAU {
    public int A00;
    public C189478aR A01;
    public boolean A02;
    public final Context A03;
    public final Button A04;
    public final AbstractC59962oe A05;
    public final UserSession A06;
    public final C210739Tv A07;
    public final A61 A08;
    public final ViewGroup A09;

    public AAU(ViewGroup viewGroup, AbstractC59962oe abstractC59962oe, UserSession userSession, A61 a61) {
        this.A05 = abstractC59962oe;
        this.A06 = userSession;
        this.A09 = viewGroup;
        this.A08 = a61;
        Button button = (Button) AbstractC166997dE.A0R(viewGroup, R.id.music_duration_button);
        this.A04 = button;
        this.A03 = AbstractC166997dE.A0L(button);
        C210739Tv c210739Tv = (C210739Tv) new C52942bb(abstractC59962oe.requireActivity()).A00(C210739Tv.class);
        this.A07 = c210739Tv;
        c210739Tv.A00.A06(abstractC59962oe, new C55562Olw(59, new C57745PjY(this, 33)));
    }
}
