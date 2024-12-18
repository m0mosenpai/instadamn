package X;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.4Uz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96414Uz extends C4V0 {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final SparseArray A0E;
    public final SparseBooleanArray A0F;

    public static void A00(C96414Uz c96414Uz) {
        c96414Uz.A0C = true;
        c96414Uz.A06 = false;
        c96414Uz.A07 = true;
        c96414Uz.A05 = false;
        c96414Uz.A09 = true;
        c96414Uz.A02 = false;
        c96414Uz.A03 = false;
        c96414Uz.A00 = false;
        c96414Uz.A01 = false;
        c96414Uz.A08 = true;
        c96414Uz.A0B = true;
        c96414Uz.A0D = false;
        c96414Uz.A04 = true;
        c96414Uz.A0A = false;
    }

    @Override // X.C4V0
    public final /* bridge */ /* synthetic */ C4V0 A02(int i, int i2, boolean z) {
        super.A02(i, i2, true);
        return this;
    }

    public final void A0A(Context context) {
        super.A03(context, true);
    }

    public final void A09(int i, boolean z) {
        SparseBooleanArray sparseBooleanArray = this.A0F;
        if (sparseBooleanArray.get(i) != z) {
            if (z) {
                sparseBooleanArray.put(i, true);
            } else {
                sparseBooleanArray.delete(i);
            }
        }
    }

    public C96414Uz(C96394Ux c96394Ux) {
        super.A06 = ((C96404Uy) c96394Ux).A06;
        super.A05 = ((C96404Uy) c96394Ux).A05;
        super.A04 = ((C96404Uy) c96394Ux).A04;
        super.A03 = ((C96404Uy) c96394Ux).A03;
        super.A0A = ((C96404Uy) c96394Ux).A0A;
        super.A09 = ((C96404Uy) c96394Ux).A09;
        super.A08 = ((C96404Uy) c96394Ux).A08;
        super.A07 = ((C96404Uy) c96394Ux).A07;
        super.A0F = ((C96404Uy) c96394Ux).A0F;
        super.A0E = ((C96404Uy) c96394Ux).A0E;
        this.A0Q = c96394Ux.A0Q;
        this.A0M = c96394Ux.A0M;
        super.A0D = ((C96404Uy) c96394Ux).A0D;
        this.A0L = c96394Ux.A0L;
        this.A0I = c96394Ux.A0I;
        super.A0B = ((C96404Uy) c96394Ux).A0B;
        super.A02 = ((C96404Uy) c96394Ux).A02;
        super.A01 = ((C96404Uy) c96394Ux).A01;
        this.A0J = c96394Ux.A0J;
        this.A0K = c96394Ux.A0K;
        super.A0C = ((C96404Uy) c96394Ux).A0C;
        super.A00 = ((C96404Uy) c96394Ux).A00;
        this.A0P = c96394Ux.A0P;
        this.A0O = c96394Ux.A0O;
        this.A0N = c96394Ux.A0N;
        this.A0H = new HashSet(c96394Ux.A0H);
        this.A0G = new HashMap(c96394Ux.A0G);
        this.A0C = c96394Ux.A0E;
        this.A06 = c96394Ux.A08;
        this.A07 = c96394Ux.A09;
        this.A05 = c96394Ux.A07;
        this.A09 = c96394Ux.A0B;
        this.A02 = c96394Ux.A04;
        this.A03 = c96394Ux.A05;
        this.A00 = c96394Ux.A02;
        this.A01 = c96394Ux.A03;
        this.A08 = c96394Ux.A0A;
        this.A0B = c96394Ux.A0D;
        this.A0D = c96394Ux.A0F;
        this.A04 = c96394Ux.A06;
        this.A0A = c96394Ux.A0C;
        SparseArray sparseArray = c96394Ux.A00;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.A0E = sparseArray2;
        this.A0F = c96394Ux.A01.clone();
    }

    @Override // X.C4V0
    public final /* bridge */ /* synthetic */ C4V0 A04(String str) {
        super.A04(str);
        return this;
    }

    @Override // X.C4V0
    public final /* bridge */ /* synthetic */ C4V0 A05(String[] strArr) {
        super.A05(strArr);
        return this;
    }

    @Override // X.C4V0
    public final /* bridge */ /* synthetic */ C4V0 A06(String[] strArr) {
        super.A06(strArr);
        return this;
    }

    @Deprecated
    public C96414Uz() {
        this.A0E = new SparseArray();
        this.A0F = new SparseBooleanArray();
        A00(this);
    }
}
