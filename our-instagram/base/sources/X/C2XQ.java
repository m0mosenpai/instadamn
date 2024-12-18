package X;

import android.graphics.Point;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2XQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2XQ implements C2XR {
    public Point A00 = new Point(0, 0);
    public C2XE A01;
    public C2WA A02;
    public C2WA A03;
    public AbstractC76013b6 A04;
    public C75803al A05;
    public List A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final C76123bH A0B;
    public final C78463fC A0C;
    public final boolean A0D;

    @Override // X.C2XR
    public final void ECR(C2V9 c2v9, String str) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(c2v9, 1);
        List list = this.A06;
        if (list == null) {
            list = new ArrayList();
        }
        this.A06 = list;
        list.add(new Pair(str, c2v9));
    }

    @Override // X.C2XR
    public final C76123bH AjW() {
        return this.A0B;
    }

    @Override // X.C2XR
    public final List B2j() {
        return this.A06;
    }

    @Override // X.C2XR
    public final int BMc() {
        return this.A08;
    }

    @Override // X.C2XR
    public final int BpX() {
        return this.A09;
    }

    @Override // X.C2XR
    public final int CAu() {
        return this.A0A;
    }

    @Override // X.C2XR
    public final C75803al CAw() {
        C75803al c75803al = this.A05;
        if (c75803al != null) {
            return c75803al;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.C2XR
    public final boolean CPK() {
        return this.A0D;
    }

    @Override // X.C2XR
    public final boolean CVJ() {
        AbstractC76013b6 abstractC76013b6 = this.A04;
        if (abstractC76013b6 != null && abstractC76013b6.A06) {
            return true;
        }
        return false;
    }

    public C2XQ(C2XE c2xe, C2WA c2wa, C76123bH c76123bH, AbstractC76013b6 abstractC76013b6, C75803al c75803al, C78463fC c78463fC, int i, int i2, int i3, boolean z) {
        this.A0A = i;
        this.A0B = c76123bH;
        this.A08 = i2;
        this.A09 = i3;
        this.A0D = z;
        this.A0C = c78463fC;
        this.A05 = c75803al;
        this.A04 = abstractC76013b6;
        this.A01 = c2xe;
        this.A02 = c2wa;
    }
}
