package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HRJ extends C17T implements InterfaceC43576JMk {
    public List A00;
    public InterfaceC43509JJv A01;
    public C38321qM A02;

    @Override // X.InterfaceC43576JMk
    public final C38321qM Af1() {
        return this.A02;
    }

    @Override // X.InterfaceC43576JMk
    public final InterfaceC38021pm Anu() {
        return (InterfaceC38021pm) A04(537407194, HXg.class);
    }

    @Override // X.InterfaceC43576JMk
    public final InterfaceC43509JJv BWZ() {
        InterfaceC43509JJv interfaceC43509JJv = this.A01;
        if (interfaceC43509JJv == null) {
            return (InterfaceC43509JJv) A05(-404842575, HRK.class);
        }
        return interfaceC43509JJv;
    }

    @Override // X.InterfaceC43576JMk
    public final Long AiY() {
        return A0L(-383562417);
    }

    @Override // X.InterfaceC43576JMk
    public final String Aiz() {
        return A0i(2025574677);
    }

    @Override // X.InterfaceC43576JMk
    public final String Aj0() {
        return A0i(-1841869723);
    }

    @Override // X.InterfaceC43576JMk
    public final String Aj7() {
        return AbstractC37304Gc5.A0g(this);
    }

    @Override // X.InterfaceC43576JMk
    public final boolean BBT() {
        return getBooleanValueByHashCode(-32359658);
    }

    @Override // X.InterfaceC43576JMk
    public final long BKA() {
        return A03(-2141142810);
    }

    @Override // X.InterfaceC43576JMk
    public final String BWe() {
        return A0h(-1852539703);
    }

    @Override // X.InterfaceC43576JMk
    public final String CAR() {
        return A0h(-1938614671);
    }

    @Override // X.InterfaceC43576JMk
    public final InterfaceC43576JMk E9Q(C1DY c1dy) {
        ArrayList arrayList;
        this.A02 = AbstractC37304Gc5.A0D(c1dy, this, 2045709715);
        List list = this.A00;
        if (list == null) {
            list = A08(94750499, C37982GnP.class);
        }
        InterfaceC43509JJv interfaceC43509JJv = null;
        if (list != null) {
            arrayList = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC37304Gc5.A1G(c1dy, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        InterfaceC43509JJv BWZ = BWZ();
        if (BWZ != null) {
            BWZ.E9R(c1dy);
            interfaceC43509JJv = BWZ;
        }
        this.A01 = interfaceC43509JJv;
        return this;
    }

    @Override // X.InterfaceC43576JMk
    public final H4O ExF(C1DY c1dy) {
        C38321qM c38321qM;
        ArrayList A0q;
        C38321qM A0D = AbstractC37304Gc5.A0D(c1dy, this, 2045709715);
        C38237Grg c38237Grg = null;
        if (A0D != null) {
            c38321qM = (C38321qM) c1dy.A00(A0D);
        } else {
            c38321qM = null;
        }
        Long A0L = A0L(-383562417);
        String A0i = A0i(2025574677);
        String A0i2 = A0i(-1841869723);
        String A0g = AbstractC37304Gc5.A0g(this);
        C38011pl F7F = Anu().F7F();
        List list = this.A00;
        if (list == null && (list = A08(94750499, C37982GnP.class)) == null) {
            A0q = null;
        } else {
            A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC37304Gc5.A1C(c1dy, A0q, it);
            }
        }
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1750224411);
        boolean booleanValueByHashCode = getBooleanValueByHashCode(-32359658);
        String A0i3 = A0i(-737588055);
        long A03 = A03(-2141142810);
        String A0k = A0k(-900774058);
        String A0i4 = A0i(954925063);
        InterfaceC43509JJv BWZ = BWZ();
        if (BWZ != null) {
            c38237Grg = BWZ.ExG(c1dy);
        }
        return new H4O(c38237Grg, c38321qM, F7F, optionalBooleanValueByHashCode, A0L, A0i, A0i2, A0g, A0i3, A0k, A0i4, A0h(-1852539703), A0Y(), A0h(-1938614671), A0q, A03, booleanValueByHashCode);
    }

    @Override // X.InterfaceC43576JMk
    public final String getMediaId() {
        return A0k(-900774058);
    }

    @Override // X.InterfaceC43576JMk
    public final String getMessage() {
        return A0i(954925063);
    }

    @Override // X.InterfaceC43576JMk
    public final String getTitle() {
        return A0Y();
    }
}
