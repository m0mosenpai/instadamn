package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IjP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41994IjP implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public ViewOnClickListenerC41994IjP(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A05 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        J24 j24;
        switch (this.A00) {
            case 0:
                C0f9.A05(-612774973);
                C14360o3.A0F("instance");
                throw C00O.createAndThrow();
            case 1:
                A05 = C0f9.A05(-1640720960);
                if (!C18U.A06(C06090Tz.A05, (AbstractC12990ll) this.A05, 36331136946816184L)) {
                    ((AbstractC42425IqS) this.A01).DKV(((C37931GmT) this.A04).BQN());
                }
                ((C38208GrD) this.A03).A00((InterfaceC60442pS) this.A02, "explore_grid_hidden_media_tap");
                i = -1155783513;
                break;
            case 2:
                A05 = C0f9.A05(1956572040);
                if (((C41232IMx) this.A03).A01()) {
                    C38497GwI c38497GwI = (C38497GwI) this.A02;
                    int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    String str = c38497GwI.A01;
                    if (!str.equals("v2") && !str.equals("v3")) {
                        c38497GwI.A02.setVisibility(8);
                    } else {
                        c38497GwI.A06.setEnabled(false);
                        AbstractC41752IeR.A00 = true;
                    }
                    ((InterfaceC63932vE) this.A01).DHH(this.A05, this.A04);
                }
                i = -1671706639;
                break;
            default:
                A05 = C0f9.A05(1944487254);
                IHZ ihz = C37548Gg4.A04;
                if (ihz != null) {
                    int i3 = C37548Gg4.A03 - 1;
                    if (i3 > ihz.A00) {
                        ihz.A00 = i3;
                    } else {
                        i3 = -1;
                    }
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(ihz.A01, "suggested_creator_shuffle_button_tapped");
                    A0f.A8p("position", Integer.valueOf(i3));
                    A0f.Cht();
                }
                C39463Hbp c39463Hbp = (C39463Hbp) this.A03;
                AnonymousClass693 anonymousClass693 = c39463Hbp.A00.A09;
                if (anonymousClass693 != null) {
                    anonymousClass693.EH0(1);
                    anonymousClass693.E4S();
                }
                INO ino = C37548Gg4.A05;
                if (ino != null && (j24 = ino.A02) != null) {
                    C5TA c5ta = j24.A01;
                    if (c5ta != null) {
                        c5ta.A0C("preview_end", false);
                    }
                    J24.A01(j24, true);
                }
                INO ino2 = C37548Gg4.A05;
                if (ino2 != null) {
                    ino2.A00();
                }
                Iterator A13 = AbstractC166997dE.A13(C37548Gg4.A0C);
                while (A13.hasNext()) {
                    ((C1OK) AbstractC166997dE.A0l(A13)).A00();
                }
                C41761Iec c41761Iec = C37548Gg4.A0B;
                C37548Gg4.A07 = false;
                C37548Gg4.A06 = false;
                C41761Iec.A02((Activity) this.A01, (InterfaceC11380iw) this.A02, (UserSession) this.A05, c41761Iec, c39463Hbp, (List) this.A04, false);
                i = -610669900;
                break;
        }
        C0f9.A0C(i, A05);
    }
}
