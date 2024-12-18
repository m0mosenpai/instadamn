package X;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* renamed from: X.Q8o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58779Q8o extends SOC {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final SparseArray A07;
    public final SparseBooleanArray A08;

    @Override // X.SOC
    public final /* bridge */ /* synthetic */ SOC A01(Context context, boolean z) {
        super.A01(context, true);
        return this;
    }

    public C58779Q8o(Context context) {
        A00(context);
        A01(context, true);
        this.A07 = AbstractC58318PtA.A0G();
        this.A08 = new SparseBooleanArray();
        this.A06 = true;
        this.A02 = true;
        this.A04 = true;
        this.A00 = true;
        this.A03 = true;
        this.A05 = true;
        this.A01 = true;
    }

    @Override // X.SOC
    public final /* bridge */ /* synthetic */ SOC A00(Context context) {
        super.A00(context);
        return this;
    }

    @Deprecated
    public C58779Q8o() {
        this.A07 = AbstractC58318PtA.A0G();
        this.A08 = new SparseBooleanArray();
        this.A06 = true;
        this.A02 = true;
        this.A04 = true;
        this.A00 = true;
        this.A03 = true;
        this.A05 = true;
        this.A01 = true;
    }
}
