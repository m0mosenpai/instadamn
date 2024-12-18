package X;

import com.instagram.autoplay.models.AutoplayOnScreenItemWithMetadata;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Tzg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66105Tzg implements InterfaceC71975XDi {
    public final List A00;

    @Override // X.InterfaceC71975XDi
    public final boolean BJq(C38321qM c38321qM) {
        InterfaceC71975XDi interfaceC71975XDi = (InterfaceC71975XDi) AbstractC001800i.A0J(this.A00);
        if (interfaceC71975XDi != null) {
            return interfaceC71975XDi.BJq(c38321qM);
        }
        return false;
    }

    @Override // X.InterfaceC71975XDi
    public final void En6(C38321qM c38321qM, int i) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC71975XDi) it.next()).En6(c38321qM, i);
        }
    }

    @Override // X.InterfaceC71975XDi
    public final void Eoc(C38321qM c38321qM) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC71975XDi) it.next()).Eoc(c38321qM);
        }
    }

    @Override // X.InterfaceC71975XDi
    public final void FBY(AutoplayOnScreenItemWithMetadata autoplayOnScreenItemWithMetadata) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC71975XDi) it.next()).FBY(autoplayOnScreenItemWithMetadata);
        }
    }

    public C66105Tzg(List list) {
        this.A00 = list;
    }
}
