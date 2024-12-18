package X;

import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;

/* renamed from: X.5tG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC129515tG implements InterfaceC129525tH {
    public final /* synthetic */ InterfaceC129525tH A00;

    public AbstractC129515tG(InterfaceC129525tH interfaceC129525tH) {
        C14360o3.A0B(interfaceC129525tH, 1);
        this.A00 = interfaceC129525tH;
    }

    @Override // X.InterfaceC129525tH
    public boolean ARd() {
        return this.A00.ARd();
    }

    @Override // X.InterfaceC129525tH
    public final C2EY Ar9() {
        return this.A00.Ar9();
    }

    @Override // X.InterfaceC129525tH
    public final MessageIdentifier ArP() {
        return this.A00.ArP();
    }

    @Override // X.InterfaceC129525tH
    public final List AuO() {
        return this.A00.AuO();
    }

    @Override // X.InterfaceC129525tH
    public final C7P3 AxY() {
        return this.A00.AxY();
    }

    @Override // X.InterfaceC129525tH
    public final boolean BCt() {
        return this.A00.BCt();
    }

    @Override // X.InterfaceC129525tH
    public final C7QV BPA() {
        return this.A00.BPA();
    }

    @Override // X.InterfaceC129525tH
    public final long BT8() {
        return this.A00.BT8();
    }

    @Override // X.InterfaceC129525tH
    public final String C0c() {
        return this.A00.C0c();
    }

    @Override // X.InterfaceC129525tH
    public final String CCL() {
        return this.A00.CCL();
    }

    @Override // X.InterfaceC129525tH
    public final boolean CVC() {
        return this.A00.CVC();
    }

    @Override // X.InterfaceC129525tH
    public final boolean CXQ() {
        return this.A00.CXQ();
    }

    @Override // X.InterfaceC129525tH
    public final boolean CYW() {
        return this.A00.CYW();
    }

    @Override // X.InterfaceC129525tH
    public final boolean Cd1() {
        return this.A00.Cd1();
    }

    @Override // X.InterfaceC129525tH
    public final int BJB() {
        if (this instanceof C129565tL) {
            PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel = ((C129565tL) this).A05;
            if (privacyMediaOverlayViewModel != null) {
                return privacyMediaOverlayViewModel.A00;
            }
            return 0;
        }
        return this.A00.BJB();
    }

    @Override // X.InterfaceC129525tH
    public final MessageIdentifier BSy() {
        if (this instanceof C7QY) {
            return ((C7QY) this).A0L;
        }
        if (this instanceof C7SX) {
            return ((C7SX) this).A07;
        }
        if (this instanceof C7SY) {
            return ((C7SY) this).A01;
        }
        if (this instanceof C7SZ) {
            return ((C7SZ) this).A02;
        }
        if (this instanceof C163157Sa) {
            return (MessageIdentifier) ((C163157Sa) this).A0F.getValue();
        }
        if (this instanceof C163167Sb) {
            return ((C163167Sb) this).A01;
        }
        if (this instanceof C163177Sc) {
            return ((C163177Sc) this).A00;
        }
        return this.A00.BSy();
    }

    @Override // X.InterfaceC129525tH
    public AnonymousClass541 BfF() {
        if (this instanceof AnonymousClass781) {
            return ((AnonymousClass781) this).A00;
        }
        return this.A00.BfF();
    }

    @Override // X.InterfaceC129525tH
    public final String BxY() {
        if (this instanceof AnonymousClass781) {
            String obj = ((AnonymousClass781) this).A04.toString();
            if (!AbstractC13670mt.A0D(obj)) {
                return null;
            }
            return obj;
        }
        return this.A00.BxY();
    }
}
