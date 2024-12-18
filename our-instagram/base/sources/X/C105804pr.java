package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4pr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105804pr implements C1NI {
    public final int A00;
    public final InterfaceC38281qI A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final List A09;

    @Override // X.C1NI
    public final String BzL(UserSession userSession) {
        return null;
    }

    @Override // X.C1NI
    public final boolean CdW() {
        return false;
    }

    @Override // X.C1NI
    public final boolean CW9() {
        return false;
    }

    @Override // X.C1NI
    public final boolean CZq() {
        return false;
    }

    @Override // X.C1NI, X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        String id = this.A01.getId();
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C105804pr(InterfaceC38281qI interfaceC38281qI) {
        String str;
        this.A01 = interfaceC38281qI;
        ArrayList arrayList = null;
        if (interfaceC38281qI.BTH() != null) {
            str = String.valueOf(interfaceC38281qI.BTH());
        } else {
            str = null;
        }
        this.A04 = str;
        this.A09 = interfaceC38281qI.BRl();
        List BR4 = interfaceC38281qI.BR4();
        if (BR4 != null) {
            arrayList = new ArrayList(AbstractC06950Ym.A1E(BR4, 10));
            Iterator it = BR4.iterator();
            while (it.hasNext()) {
                arrayList.add(new C41058IGb((JKP) it.next()));
            }
        }
        this.A08 = arrayList;
        this.A03 = this.A01.BDG();
        this.A05 = this.A01.C93();
        this.A02 = this.A01.Ah2();
        this.A06 = this.A01.C9N();
        Integer Azn = this.A01.Azn();
        if (Azn != null) {
            this.A00 = Azn.intValue();
            String CAR = this.A01.CAR();
            if (CAR != null) {
                this.A07 = CAR;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
