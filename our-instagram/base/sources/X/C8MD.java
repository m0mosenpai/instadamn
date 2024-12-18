package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8MD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8MD implements C8ME {
    public List A02;
    public float A03;
    public int A04;
    public int A05;
    public final UserSession A07;
    public final C8MA A09;
    public final C8MB A0A;
    public final ArrayList A06 = new ArrayList();
    public final C8MD A08 = this;
    public Integer A01 = C05F.A0N;
    public int A00 = -1;

    @Override // X.C8ME
    public final void AKw(C8MK c8mk) {
        C14360o3.A0B(c8mk, 0);
        synchronized (this.A08) {
            List list = this.A02;
            c8mk.A01 = ((Number) list.get(this.A04)).intValue();
            c8mk.A02 = ((Number) list.get(this.A05)).intValue();
            c8mk.A00 = this.A03;
            Integer num = this.A01;
            C14360o3.A0B(num, 0);
            c8mk.A03 = num;
        }
    }

    @Override // X.C8MG
    public final void DDY(Integer num, float f) {
        C14360o3.A0B(num, 0);
        synchronized (this.A08) {
            this.A03 = f;
            this.A01 = num;
            if (num == C05F.A0C) {
                int i = this.A05;
                this.A04 = i;
                this.A0A.A00(i);
                int AuP = AuP();
                Iterator it = this.A06.iterator();
                while (it.hasNext()) {
                    ((InterfaceC185628Le) it.next()).DrT(AuP);
                }
            }
        }
        this.A09.EGV();
    }

    @Override // X.C8MG
    public final void DTu(Integer num, float f) {
        C14360o3.A0B(num, 0);
        synchronized (this.A08) {
            if (num == C05F.A00) {
                this.A05 = (this.A04 + 1) % this.A02.size();
            } else {
                int i = this.A04 - 1;
                List list = this.A02;
                this.A05 = (i + list.size()) % list.size();
            }
            this.A01 = num;
            this.A03 = f;
        }
        this.A09.EGV();
    }

    public final void A00() {
        int i = this.A00;
        if (i >= 0) {
            this.A02.remove(i);
            this.A00 = -1;
        }
        this.A02.add(this.A04, 1112);
        this.A00 = this.A04;
    }

    @Override // X.C8MF
    public final int AuP() {
        int intValue;
        synchronized (this.A08) {
            intValue = ((Number) this.A02.get(this.A04)).intValue();
        }
        return intValue;
    }

    @Override // X.C8ME
    public final void ESb(int i) {
        int indexOf = this.A02.indexOf(Integer.valueOf(i));
        if (indexOf >= 0) {
            synchronized (this.A08) {
                this.A04 = indexOf;
                this.A05 = indexOf;
                this.A01 = C05F.A0N;
                this.A03 = 0.0f;
            }
            this.A09.EGV();
        }
    }

    @Override // X.C8MG
    public final void onStart() {
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            ((InterfaceC185628Le) it.next()).DrX();
        }
    }

    public C8MD(UserSession userSession, C8MA c8ma, C8MB c8mb, List list) {
        this.A09 = c8ma;
        this.A02 = list;
        this.A0A = c8mb;
        this.A07 = userSession;
    }
}
