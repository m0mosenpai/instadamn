package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3bI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76133bI implements C2XR {
    public C75803al A00;
    public List A01;
    public boolean A02;
    public AbstractC76013b6 A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C2W1 A07;
    public final C76123bH A08;
    public final boolean A09;

    @Override // X.C2XR
    public final void ECR(C2V9 c2v9, String str) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(c2v9, 1);
        List list = this.A01;
        if (list == null) {
            list = new ArrayList();
        }
        this.A01 = list;
        list.add(new Pair(str, c2v9));
    }

    public final boolean A00() {
        AbstractC76013b6 abstractC76013b6;
        if (!this.A02 || C2XV.A01() || (abstractC76013b6 = this.A03) == null || abstractC76013b6.A01.get() != 1) {
            return false;
        }
        return true;
    }

    @Override // X.C2XR
    public final C76123bH AjW() {
        return this.A08;
    }

    @Override // X.C2XR
    public final List B2j() {
        return this.A01;
    }

    @Override // X.C2XR
    public final int BMc() {
        return this.A04;
    }

    @Override // X.C2XR
    public final int BpX() {
        return this.A05;
    }

    @Override // X.C2XR
    public final int CAu() {
        return this.A06;
    }

    @Override // X.C2XR
    public final C75803al CAw() {
        return this.A00;
    }

    @Override // X.C2XR
    public final boolean CPK() {
        return this.A09;
    }

    @Override // X.C2XR
    public final boolean CVJ() {
        AbstractC76013b6 abstractC76013b6 = this.A03;
        if (abstractC76013b6 != null && abstractC76013b6.A06) {
            return true;
        }
        return false;
    }

    public C76133bI(C2W1 c2w1, C76123bH c76123bH, AbstractC76013b6 abstractC76013b6, C75803al c75803al, int i, int i2, int i3, boolean z) {
        boolean z2;
        this.A06 = i;
        this.A08 = c76123bH;
        this.A04 = i2;
        this.A05 = i3;
        this.A09 = z;
        this.A07 = c2w1;
        this.A00 = c75803al;
        this.A03 = abstractC76013b6;
        if (abstractC76013b6 != null) {
            z2 = false;
            if (abstractC76013b6.A01.get() == 0) {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        this.A02 = z2;
    }
}
