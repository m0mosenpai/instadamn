package X;

import com.facebookpay.form.cell.text.TextCellParams;
import com.facebookpay.form.cell.text.formatter.TextFormatter;
import com.facebookpay.form.cell.text.util.TextFieldHandler;
import com.fbpay.theme.FBPayIcon;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Uuw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C67664Uuw extends AbstractC69334Vlg {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public TextFormatter A04;
    public TextFieldHandler A05;
    public FBPayIcon A06;
    public ImmutableList A07;
    public Integer A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final ImmutableList.Builder A0G;

    public final void A01(Integer num) {
        C14360o3.A0B(num, 0);
        this.A08 = num;
    }

    public TextCellParams A00() {
        ImmutableList build = this.A0G.build();
        C14360o3.A0B(build, 0);
        this.A07 = build;
        return new TextCellParams(this);
    }

    public C67664Uuw(int i) {
        super(i);
        this.A08 = C05F.A0N;
        this.A0G = new ImmutableList.Builder();
    }
}
