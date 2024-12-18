package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import java.util.List;

/* renamed from: X.Ijj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC42014Ijj implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;

    public ViewOnClickListenerC42014Ijj(UserSession userSession, C38321qM c38321qM, IntentAwareAdPivotState intentAwareAdPivotState, HBC hbc, C64042vP c64042vP, C38521Gwh c38521Gwh, C60662pp c60662pp, List list, int i, int i2) {
        this.A00 = i2;
        if (i2 != 0) {
            this.A04 = hbc;
            this.A09 = userSession;
            this.A05 = c60662pp;
            this.A03 = c38321qM;
            this.A02 = c38521Gwh;
            this.A08 = list;
            this.A07 = intentAwareAdPivotState;
        } else {
            this.A03 = c38321qM;
            this.A09 = userSession;
            this.A05 = c60662pp;
            this.A08 = list;
            this.A04 = hbc;
            this.A07 = intentAwareAdPivotState;
            this.A02 = c38521Gwh;
        }
        this.A06 = c64042vP;
        this.A01 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        long j;
        if (this.A00 != 0) {
            A05 = C0f9.A05(747241324);
            C71113Gx c71113Gx = C5MB.A00;
            HBC hbc = (HBC) this.A04;
            boolean A02 = c71113Gx.A02(Integer.valueOf(hbc.A00));
            AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A09;
            C06090Tz c06090Tz = C06090Tz.A06;
            if (A02) {
                j = 36875824703995982L;
            } else {
                j = 36875824700981325L;
            }
            String A04 = C18U.A04(c06090Tz, abstractC12990ll, j);
            int hashCode = A04.hashCode();
            if (hashCode != -38695841) {
                if (hashCode == 0 && A04.equals("")) {
                    ((C60662pp) this.A05).A0I((C38321qM) this.A03, (IntentAwareAdPivotState) this.A07, hbc, (List) this.A08);
                }
            } else if (A04.equals("cta_destination")) {
                ((C60662pp) this.A05).A0H((C38321qM) this.A03);
                C71313Hs.A00(abstractC12990ll).A07(((C38521Gwh) this.A02).A03, EnumC71343Hv.A0H, new String[0], 1);
            }
            ((C64042vP) this.A06).A0F((IntentAwareAdPivotState) this.A07, hbc, C05F.A00, this.A01);
            i = 1198948491;
        } else {
            A05 = C0f9.A05(1235635362);
            C38321qM c38321qM = (C38321qM) this.A03;
            if (!AbstractC75103Za.A0Q(c38321qM, 0)) {
                if (C18U.A06(C06090Tz.A06, (AbstractC12990ll) this.A09, 36312874754115006L)) {
                    C60662pp c60662pp = (C60662pp) this.A05;
                    List list = (List) this.A08;
                    c60662pp.A0I(c38321qM, (IntentAwareAdPivotState) this.A07, (HBC) this.A04, list);
                    C64042vP c64042vP = (C64042vP) this.A06;
                    HBC hbc2 = (HBC) this.A04;
                    c64042vP.A0F((IntentAwareAdPivotState) this.A07, hbc2, C05F.A01, this.A01);
                    i = -633500550;
                }
            }
            ((C60662pp) this.A05).A0H(c38321qM);
            C71313Hs.A00((AbstractC12990ll) this.A09).A07(((C38521Gwh) this.A02).A03, EnumC71343Hv.A0H, new String[0], 1);
            C64042vP c64042vP2 = (C64042vP) this.A06;
            HBC hbc22 = (HBC) this.A04;
            c64042vP2.A0F((IntentAwareAdPivotState) this.A07, hbc22, C05F.A01, this.A01);
            i = -633500550;
        }
        C0f9.A0C(i, A05);
    }
}
