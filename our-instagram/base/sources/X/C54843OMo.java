package X;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.OMo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54843OMo {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final LinearLayout A03;
    public final LinearLayout A04;
    public final UserSession A05;
    public final OFW A06;
    public final C187418Sj A07;
    public final C187358Sd A08;
    public final C50868Mdz A09;
    public final NIX A0A;
    public final ArrayList A0B;
    public final ArrayList A0C;
    public final boolean A0D;

    public C54843OMo(Context context, LinearLayout linearLayout, LinearLayout linearLayout2, UserSession userSession, OFW ofw, C187418Sj c187418Sj, C187358Sd c187358Sd, C50868Mdz c50868Mdz, NIX nix, int i) {
        AbstractC167007dF.A1H(userSession, 1, linearLayout);
        C14360o3.A0B(linearLayout2, 8);
        this.A05 = userSession;
        this.A02 = context;
        this.A09 = c50868Mdz;
        this.A08 = c187358Sd;
        this.A07 = c187418Sj;
        this.A0A = nix;
        this.A03 = linearLayout;
        this.A04 = linearLayout2;
        this.A06 = ofw;
        this.A00 = i;
        this.A0C = AbstractC166987dD.A1E();
        this.A0B = AbstractC166987dD.A1E();
        this.A0D = C18U.A06(C06090Tz.A05, userSession, 36320012982099873L);
        this.A01 = i / 2;
        ofw.A02 = this;
    }

    public final void A05(EnumC53170NfR enumC53170NfR, int i, int i2, boolean z) {
        int i3;
        C14360o3.A0B(enumC53170NfR, 3);
        Iterator it = this.A0C.iterator();
        while (true) {
            int i4 = 0;
            if (!it.hasNext()) {
                break;
            }
            OXZ A0U = MSW.A0U(it);
            if (enumC53170NfR != EnumC53170NfR.A04 || A0U.A08() != i2) {
                if (z) {
                    i4 = A0U.A00;
                }
                A0U.A0I(i - i4);
            }
        }
        Iterator it2 = this.A0B.iterator();
        while (it2.hasNext()) {
            OXZ A0U2 = MSW.A0U(it2);
            if (enumC53170NfR != EnumC53170NfR.A04 || A0U2.A08() != i2) {
                if (z) {
                    i3 = A0U2.A00;
                } else {
                    i3 = 0;
                }
                A0U2.A0I(i - i3);
            }
        }
    }

    public final void A00() {
        NIX nix = this.A0A;
        int i = this.A01;
        nix.A02 = i;
        nix.A0G();
        NIX.A00(nix);
        NIX.A02(nix, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ba, code lost:
    
        if (((X.C51831MvZ) X.AbstractC25225BEi.A13(r2.getValue(), r4.A00)).CGw() == X.C05F.A0N) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54843OMo.A01():void");
    }

    public final void A02(float f) {
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = ((NI6) it.next()).A09;
            if (recyclerView != null) {
                recyclerView.setAlpha(f);
            }
        }
        Iterator it2 = this.A0B.iterator();
        while (it2.hasNext()) {
            RecyclerView recyclerView2 = ((NI6) it2.next()).A09;
            if (recyclerView2 != null) {
                recyclerView2.setAlpha(f);
            }
        }
    }

    public final void A03(int i) {
        this.A0A.A00 = i;
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            C51165Mj8 c51165Mj8 = ((NI6) it.next()).A0C;
            c51165Mj8.A00 = i;
            c51165Mj8.notifyDataSetChanged();
        }
        Iterator it2 = this.A0B.iterator();
        while (it2.hasNext()) {
            C51165Mj8 c51165Mj82 = ((NI6) it2.next()).A0C;
            c51165Mj82.A00 = i;
            c51165Mj82.notifyDataSetChanged();
        }
    }

    public final void A04(int i) {
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = ((NI6) it.next()).A09;
            if (recyclerView != null) {
                recyclerView.setVisibility(i);
            }
        }
        Iterator it2 = this.A0B.iterator();
        while (it2.hasNext()) {
            RecyclerView recyclerView2 = ((NI6) it2.next()).A09;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(i);
            }
        }
    }

    public final void A06(boolean z) {
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            MSW.A0U(it).A0L(z);
        }
        Iterator it2 = this.A0B.iterator();
        while (it2.hasNext()) {
            MSW.A0U(it2).A0L(z);
        }
    }
}
