package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Mdu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50863Mdu extends C193578hc {
    public final UserSession A00;
    public final C55228Oey A01;
    public final InterfaceC16820sZ A02;
    public final InterfaceC06180Ui A03;
    public final InterfaceC06180Ui A04;
    public final InterfaceC15070pN A05;

    public final void A0I(int i) {
        AbstractC166987dD.A1Z(new C50530MSj(this, null, null, i, 6), AbstractC141776au.A00(this));
    }

    public final ArrayList A0E() {
        ArrayList A1F = AbstractC06950Ym.A1F((Iterable) this.A01.A0A.getValue());
        ArrayList A0q = AbstractC167017dG.A0q(A1F);
        Iterator it = A1F.iterator();
        while (it.hasNext()) {
            C51832Mva c51832Mva = (C51832Mva) it.next();
            A0q.add(AbstractC43594JPz.A11(Integer.valueOf(c51832Mva.A05), c51832Mva.A02));
        }
        return AbstractC06950Ym.A1F(A0q);
    }

    public final void A0F() {
        C55228Oey c55228Oey = this.A01;
        c55228Oey.A05.clear();
        c55228Oey.A06.clear();
    }

    public final void A0G() {
        int size = MSW.A1B(this.A01.A0A).size();
        for (int i = 0; i < size; i++) {
            A0I(i);
        }
    }

    public final void A0H() {
        C55228Oey c55228Oey = this.A01;
        if (AbstractC25225BEi.A1a(c55228Oey.A04, C55228Oey.A0C)) {
            C09530e4 c09530e4 = c55228Oey.A04;
            int A0F = AbstractC25230BEn.A0F(c09530e4);
            c55228Oey.A0S(A0F, AbstractC25229BEm.A0A(c09530e4), false);
            A0I(A0F);
        }
    }

    public final void A0J(int i, int i2) {
        if (this instanceof NIX) {
            NIX nix = (NIX) this;
            C55228Oey c55228Oey = ((AbstractC50863Mdu) nix).A01;
            C09530e4 c09530e4 = c55228Oey.A04;
            int i3 = c55228Oey.A00;
            c55228Oey.A0S(i, i2, true);
            if (i3 != -1) {
                nix.A0T(i3);
            }
            Number number = (Number) c09530e4.A00;
            if (number.intValue() != AbstractC25230BEn.A0F(C55228Oey.A0C) && number.intValue() != i) {
                nix.A0I(number.intValue());
            }
            nix.A0I(i);
            return;
        }
        C55228Oey c55228Oey2 = this.A01;
        C09530e4 c09530e42 = c55228Oey2.A04;
        c55228Oey2.A0S(i, i2, true);
        Number number2 = (Number) c09530e42.A00;
        if (number2.intValue() != AbstractC25230BEn.A0F(C55228Oey.A0C) && number2.intValue() != i) {
            A0I(number2.intValue());
        }
        A0I(i);
    }

    public final void A0K(C51832Mva c51832Mva) {
        C55228Oey c55228Oey = this.A01;
        int A09 = MSZ.A09(c55228Oey.A08);
        if (c55228Oey.A0Y(c51832Mva)) {
            for (int i = 0; i < A09; i++) {
                A0I(i);
            }
        }
    }

    public final boolean A0L() {
        C55228Oey c55228Oey = this.A01;
        if (AbstractC25225BEi.A1a(c55228Oey.A04, C55228Oey.A0C)) {
            if (c55228Oey.A0H(MSZ.A06(c55228Oey), MSZ.A07(c55228Oey)).AzK() || c55228Oey.A0H(MSZ.A06(c55228Oey), MSZ.A07(c55228Oey)).CGw() == C05F.A0N) {
                return true;
            }
            return false;
        }
        return false;
    }

    public AbstractC50863Mdu(Application application, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        super(application);
        this.A00 = userSession;
        this.A02 = interfaceC16820sZ;
        this.A01 = new C55228Oey(z);
        Integer num = C05F.A00;
        this.A03 = C10M.A00(num, 0, 0);
        AnonymousClass057 A00 = C10M.A00(num, 0, 0);
        this.A04 = A00;
        this.A05 = A00;
    }
}
