package X;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NT5 extends NT7 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final ViewGroup A08;
    public final C55177Odh A09;
    public final PC6 A0A;
    public final InterfaceC09390do A0B;
    public final boolean A0C;
    public final FragmentActivity A0D;
    public final UserSession A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NT5(ViewGroup viewGroup, FragmentActivity fragmentActivity, UserSession userSession, C55177Odh c55177Odh) {
        super(AbstractC25225BEi.A1D(C51884MwS.class));
        boolean A1V = AbstractC167007dF.A1V(c55177Odh);
        this.A0E = userSession;
        this.A09 = c55177Odh;
        this.A0D = fragmentActivity;
        this.A08 = viewGroup;
        InterfaceC09390do A00 = C57512Pfm.A00(this, 9);
        this.A0B = A00;
        this.A04 = "";
        this.A0C = A1V;
        this.A0A = new PC6(userSession, (InterfaceC56392iX) A00.getValue(), MSW.A1F(this, 42), ((NT7) this).A00);
        this.A05 = A1V;
    }
}
