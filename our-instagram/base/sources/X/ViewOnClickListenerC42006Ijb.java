package X;

import android.view.View;
import com.instagram.api.schemas.CreatorViewerBottomCTA;
import com.instagram.api.schemas.CreatorViewerBottomCTAType;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.Ijb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC42006Ijb implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public ViewOnClickListenerC42006Ijb(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i2;
        this.A06 = obj5;
        this.A05 = obj;
        this.A04 = obj3;
        this.A01 = i;
        this.A03 = obj2;
        this.A02 = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(1979291300);
                ((C64062vR) this.A06).A02.A01 = null;
                ((C60662pp) this.A04).A0M((C38321qM) this.A02, (ICO) this.A03, this.A01);
                i = -1959276877;
                break;
            case 1:
                A05 = C0f9.A05(245732298);
                C23031Ai c23031Ai = (C23031Ai) this.A05;
                int i2 = this.A01 + 1;
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(c23031Ai);
                A0w.E7D(AbstractC43591JPw.A00(224), i2);
                A0w.apply();
                C3KX c3kx = (C3KX) this.A06;
                String str = ((C105824pt) this.A02).A0e;
                str.getClass();
                Reel reel = (Reel) this.A03;
                C3KX.A06(c3kx, str, AbstractC37301Gc2.A0i(reel), ((User) this.A04).getId());
                C3KX.A01(reel, C3G2.A1E, c3kx, null, null);
                i = 808041024;
                break;
            case 2:
                A05 = C0f9.A05(-951178429);
                HC2 hc2 = (HC2) this.A06;
                CreatorViewerBottomCTA creatorViewerBottomCTA = (CreatorViewerBottomCTA) this.A05;
                HC2.A01(creatorViewerBottomCTA.AhZ(), (JMS) this.A03, (C38321qM) this.A04, (IgdsBottomButtonLayout) this.A02, hc2, this.A01, AbstractC167007dF.A1X(creatorViewerBottomCTA.AhZ(), CreatorViewerBottomCTAType.A05));
                i = -1603545136;
                break;
            default:
                A05 = C0f9.A05(1343472500);
                HC2 hc22 = (HC2) this.A06;
                HC2.A01(((CreatorViewerBottomCTA) this.A05).AhZ(), (JMS) this.A03, (C38321qM) this.A04, (IgdsBottomButtonLayout) this.A02, hc22, this.A01, false);
                i = -588851066;
                break;
        }
        C0f9.A0C(i, A05);
    }
}
