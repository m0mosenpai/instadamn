package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;

/* loaded from: classes6.dex */
public abstract class E01 extends C2UU {
    public int A00;
    public final UserSession A01;
    public final C38321qM A02;
    public final LinkedHashSet A03 = AbstractC31171DnF.A0l();
    public final boolean A04;
    public final InterfaceC38371qR A05;
    public final boolean A06;
    public final boolean A07;

    public final void A0D(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        LinkedHashSet linkedHashSet = this.A03;
        linkedHashSet.clear();
        if (z) {
            AbstractC166997dE.A1W(linkedHashSet, 0);
        }
        if (z4) {
            AbstractC166997dE.A1W(linkedHashSet, 39);
        }
        if (z2 && !this.A06) {
            UserSession userSession = this.A01;
            if (!C35232FgP.A02(userSession, this.A07, AbstractC31175DnJ.A1V(C06090Tz.A05, userSession), !this.A04)) {
                AbstractC166997dE.A1W(linkedHashSet, 3);
            }
        }
        if (z3) {
            UserSession userSession2 = this.A01;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession2, 36318209095309336L) || !C18U.A06(c06090Tz, userSession2, 36318209095571483L)) {
                AbstractC166997dE.A1W(linkedHashSet, 27);
            }
        }
        if (z5) {
            AbstractC166997dE.A1W(linkedHashSet, 41);
        }
    }

    public final boolean A0E() {
        String id;
        C38321qM c38321qM = this.A02;
        if (c38321qM != null && c38321qM.A5P() && (id = c38321qM.getId()) != null && id.length() != 0) {
            UserSession userSession = this.A01;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36318209095309336L) && C18U.A06(c06090Tz, userSession, 36325171237237576L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public E01(UserSession userSession, C38321qM c38321qM, InterfaceC38371qR interfaceC38371qR, boolean z, boolean z2, boolean z3) {
        this.A01 = userSession;
        this.A02 = c38321qM;
        this.A05 = interfaceC38371qR;
        this.A06 = z;
        this.A07 = z2;
        this.A04 = z3;
    }

    @Override // X.C2UU
    public int getItemCount() {
        int A03 = C0f9.A03(1491863344);
        int size = this.A03.size();
        C0f9.A0A(188948230, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public int getItemViewType(int i) {
        int i2;
        int A03 = C0f9.A03(51904378);
        Number number = (Number) AbstractC001800i.A0F(this.A03, i);
        if (number != null) {
            i2 = number.intValue();
        } else {
            i2 = -1;
        }
        C0f9.A0A(1414241822, A03);
        return i2;
    }
}
