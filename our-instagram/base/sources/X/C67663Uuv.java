package X;

import com.facebookpay.form.cell.label.LabelCellParams;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Uuv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67663Uuv extends AbstractC69334Vlg {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ImmutableList A06;
    public boolean A07;
    public final ImmutableList.Builder A08;

    public final LabelCellParams A00() {
        this.A06 = this.A08.build();
        return new LabelCellParams(this);
    }

    public C67663Uuv(int i) {
        super(i);
        this.A04 = 0;
        this.A00 = 0;
        this.A08 = new ImmutableList.Builder();
    }
}
