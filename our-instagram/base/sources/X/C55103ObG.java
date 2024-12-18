package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.ObG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55103ObG {
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final IgLinearLayout A03;
    public final IgLinearLayout A04;
    public final C89P A05;
    public final C187358Sd A06;
    public final NIW A07;
    public final NIW A08;
    public final C50868Mdz A09;
    public final ArrayList A0A;
    public final ArrayList A0B;
    public final boolean A0C;

    public C55103ObG(Context context, LinearLayout linearLayout, UserSession userSession, C89P c89p, C187358Sd c187358Sd, NIW niw, NIW niw2, C50868Mdz c50868Mdz, int i, boolean z) {
        AbstractC25229BEm.A1J(userSession, 1, linearLayout);
        this.A02 = userSession;
        this.A01 = context;
        this.A09 = c50868Mdz;
        this.A07 = niw;
        this.A08 = niw2;
        this.A06 = c187358Sd;
        this.A05 = c89p;
        this.A00 = i;
        IgLinearLayout igLinearLayout = (IgLinearLayout) AbstractC166997dE.A0R(linearLayout, R.id.clips_editor_audio_container);
        this.A03 = igLinearLayout;
        this.A04 = (IgLinearLayout) AbstractC166997dE.A0R(linearLayout, R.id.clips_editor_voiceover_container);
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36320012982099873L);
        this.A0C = A06;
        this.A0A = AbstractC16960so.A1M(new NI7(context, igLinearLayout, userSession, c89p, c187358Sd, niw, c50868Mdz, i, 0, false, A06, z));
        this.A0B = AbstractC166987dD.A1E();
    }

    public final void A05(EnumC53170NfR enumC53170NfR, int i, int i2, boolean z) {
        int i3;
        C14360o3.A0B(enumC53170NfR, 3);
        Iterator A01 = A01(this);
        while (true) {
            int i4 = 0;
            if (!A01.hasNext()) {
                break;
            }
            NI7 A0T = MSW.A0T(A01);
            if (enumC53170NfR != EnumC53170NfR.A02 || A0T.A05 != i2) {
                if (z) {
                    i4 = ((OXZ) A0T).A00;
                }
                A0T.A0I(i - i4);
            }
        }
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            NI7 A0T2 = MSW.A0T(A00);
            if (enumC53170NfR != EnumC53170NfR.A07 || A0T2.A05 != i2) {
                if (z) {
                    i3 = ((OXZ) A0T2).A00;
                } else {
                    i3 = 0;
                }
                A0T2.A0I(i - i3);
            }
        }
    }

    public static Iterator A00(C55103ObG c55103ObG) {
        return c55103ObG.A0B.iterator();
    }

    public static Iterator A01(C55103ObG c55103ObG) {
        return c55103ObG.A0A.iterator();
    }

    public final void A03(int i) {
        NIW niw = this.A07;
        niw.A00 = i;
        niw.A0G();
        NIW niw2 = this.A08;
        niw2.A00 = i;
        niw2.A0G();
    }

    public final void A04(int i) {
        NIW niw = this.A07;
        niw.A01 = i;
        niw.A0G();
        NIW niw2 = this.A08;
        niw2.A01 = i;
        niw2.A0G();
    }

    public final void A02(int i) {
        int i2;
        Iterator A01 = A01(this);
        int i3 = 0;
        while (A01.hasNext()) {
            Object next = A01.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            NI7 ni7 = (NI7) next;
            if (i3 == i) {
                NI7.A00(ni7);
                OJs oJs = ni7.A0E;
                synchronized (oJs) {
                    i2 = oJs.A01;
                }
                ni7.A0H.A0O(i2);
                synchronized (oJs) {
                    oJs.A08.post(new PQ8(oJs, oJs.A01));
                    oJs.A06.A00.A0H.A0D.Egh(null);
                }
            } else {
                MSY.A0x(ni7.A0A);
            }
            i3 = i4;
        }
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            MSY.A0x(MSW.A0T(A00).A0A);
        }
    }

    public final void A06(C09530e4 c09530e4) {
        Iterator A01 = A01(this);
        while (A01.hasNext()) {
            MSW.A0U(A01).A01 = c09530e4;
        }
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            MSW.A0U(A00).A01 = c09530e4;
        }
    }

    public final void A07(boolean z) {
        Iterator A01 = A01(this);
        while (A01.hasNext()) {
            MSW.A0U(A01).A0L(z);
        }
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            MSW.A0U(A00).A0L(z);
        }
    }
}
