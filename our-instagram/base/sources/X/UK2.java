package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public class UK2 extends AbstractC66024TyM {
    public int A01;
    public ArrayList A02 = new ArrayList();
    public boolean A03 = true;
    public boolean A04 = false;
    public int A00 = 0;

    @Override // X.AbstractC66024TyM
    public final /* bridge */ /* synthetic */ AbstractC66024TyM A08(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A02;
            if (i < arrayList.size()) {
                ((AbstractC66024TyM) arrayList.get(i)).A08(view);
                i++;
            } else {
                super.A08(view);
                return this;
            }
        }
    }

    @Override // X.AbstractC66024TyM
    public final /* bridge */ /* synthetic */ AbstractC66024TyM A09(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A02;
            if (i < arrayList.size()) {
                ((AbstractC66024TyM) arrayList.get(i)).A09(view);
                i++;
            } else {
                super.A09(view);
                return this;
            }
        }
    }

    public final void A0d(long j) {
        ArrayList arrayList;
        super.A01 = j;
        if (j >= 0 && (arrayList = this.A02) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC66024TyM) this.A02.get(i)).A0L(j);
            }
        }
    }

    public final void A0e(AbstractC66024TyM abstractC66024TyM) {
        this.A02.add(abstractC66024TyM);
        abstractC66024TyM.A0A = this;
        long j = super.A01;
        if (j >= 0) {
            abstractC66024TyM.A0L(j);
        }
        if ((this.A00 & 1) != 0) {
            abstractC66024TyM.A0N(this.A05);
        }
        if ((this.A00 & 2) != 0) {
            abstractC66024TyM.A0I();
        }
        if ((this.A00 & 4) != 0) {
            abstractC66024TyM.A0U(this.A06);
        }
        if ((this.A00 & 8) != 0) {
            abstractC66024TyM.A0V(this.A07);
        }
    }

    @Override // X.AbstractC66024TyM
    /* renamed from: A06 */
    public final AbstractC66024TyM clone() {
        UK2 uk2 = (UK2) super.clone();
        uk2.A02 = new ArrayList();
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            AbstractC66024TyM clone = ((AbstractC66024TyM) this.A02.get(i)).clone();
            uk2.A02.add(clone);
            clone.A0A = uk2;
        }
        return uk2;
    }

    @Override // X.AbstractC66024TyM
    public final /* bridge */ /* synthetic */ AbstractC66024TyM A0A(XE3 xe3) {
        super.A0A(xe3);
        return this;
    }

    @Override // X.AbstractC66024TyM
    public final /* bridge */ /* synthetic */ AbstractC66024TyM A0B(XE3 xe3) {
        super.A0B(xe3);
        return this;
    }

    @Override // X.AbstractC66024TyM
    public final String A0E(String str) {
        String A0E = super.A0E(str);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A02;
            if (i < arrayList.size()) {
                A0E = AnonymousClass001.A0g(A0E, "\n", ((AbstractC66024TyM) arrayList.get(i)).A0E(AnonymousClass001.A0R(str, "  ")));
                i++;
            } else {
                return A0E;
            }
        }
    }

    @Override // X.AbstractC66024TyM
    public final void A0F() {
        super.A0F();
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC66024TyM) this.A02.get(i)).A0F();
        }
    }

    @Override // X.AbstractC66024TyM
    public final void A0O(View view) {
        super.A0O(view);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC66024TyM) this.A02.get(i)).A0O(view);
        }
    }

    @Override // X.AbstractC66024TyM
    public final void A0P(View view) {
        super.A0P(view);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC66024TyM) this.A02.get(i)).A0P(view);
        }
    }

    @Override // X.AbstractC66024TyM
    public final void A0Q(ViewGroup viewGroup) {
        super.A0Q(viewGroup);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC66024TyM) this.A02.get(i)).A0Q(viewGroup);
        }
    }

    @Override // X.AbstractC66024TyM
    public final void A0U(C68269VKg c68269VKg) {
        super.A0U(c68269VKg);
        this.A00 |= 4;
        if (this.A02 != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.A02;
                if (i < arrayList.size()) {
                    ((AbstractC66024TyM) arrayList.get(i)).A0U(c68269VKg);
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
