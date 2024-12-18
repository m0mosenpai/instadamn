package X;

import com.facebook.location.platform.api.Location;
import com.instagram.api.schemas.ContextualAdResponseExtrasImpl;
import com.instagram.api.schemas.ContextualAdResponseOrganicInfoImpl;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class HBC extends C40781ul implements InterfaceC38381qS, InterfaceC76413bl {
    public ContextualAdResponseExtrasImpl A01;
    public ContextualAdResponseOrganicInfoImpl A02;
    public H4K A03;
    public C38321qM A04;
    public C38321qM A05;
    public C38011pl A06;
    public Integer A07;
    public String A08;
    public String A0A;
    public boolean A0D;
    public List A0B = C16930sl.A00;
    public String A09 = "";
    public int A00 = -1;
    public Map A0C = AbstractC166987dD.A1I();

    @Override // X.InterfaceC76413bl
    public final boolean AJk(C38321qM c38321qM) {
        List A0Y;
        for (IL5 il5 : this.A0B) {
            if ((c38321qM.A5N() && (A0Y = AbstractC37300Gc1.A0Y(il5.A00())) != null && A0Y.contains(c38321qM)) || C14360o3.A0K(il5.A00(), c38321qM)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC38381qS
    public final Integer BA3() {
        return null;
    }

    @Override // X.InterfaceC38381qS
    public final InterfaceC39571se BK1() {
        return null;
    }

    public final ContextualAdResponseExtrasImpl A00() {
        ContextualAdResponseExtrasImpl contextualAdResponseExtrasImpl = this.A01;
        if (contextualAdResponseExtrasImpl != null) {
            return contextualAdResponseExtrasImpl;
        }
        C14360o3.A0F(Location.EXTRAS);
        throw C00O.createAndThrow();
    }

    public final C38011pl A01() {
        C38011pl c38011pl = this.A06;
        if (c38011pl != null) {
            return c38011pl;
        }
        C14360o3.A0F("gapRulesDict");
        throw C00O.createAndThrow();
    }

    public final Integer A02() {
        String str;
        if (this.A01 == null || (str = A00().A01) == null) {
            return null;
        }
        return AbstractC40674I1g.A00(str);
    }

    @Override // X.InterfaceC38381qS
    public final C1XV B5n() {
        return C1XV.A0T;
    }

    @Override // X.InterfaceC38381qS
    public final String CAR() {
        String CAR;
        IL5 il5 = (IL5) AbstractC001800i.A0J(this.A0B);
        if (il5 == null || (CAR = il5.A00().CAR()) == null) {
            return "";
        }
        return CAR;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CCj() {
        return C05F.A0C;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CFr() {
        if (A02() != C05F.A01 && !C5MB.A00.A02(Integer.valueOf(this.A00))) {
            return null;
        }
        return 1;
    }

    @Override // X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        String str = A00().A00;
        if (str == null) {
            return "";
        }
        return str;
    }
}
