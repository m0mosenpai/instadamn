package X;

import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.hub.form.params.FormDialogParams;
import com.fbpay.hub.form.params.FormLogEvents;
import com.fbpay.hub.form.params.FormParams;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Sej, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63184Sej {
    public FBPayLoggerData A00;
    public FormDialogParams A01;
    public FormLogEvents A02;
    public ImmutableList A03;
    public String A04;
    public String A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final ImmutableList.Builder A09;
    public final String A0A;
    public final String A0B;

    public C63184Sej(String str, String str2) {
        this.A09 = new ImmutableList.Builder();
        this.A06 = 3;
        this.A08 = 0;
        this.A0B = str;
        this.A0A = str2;
        this.A07 = 2131962798;
    }

    public static FormParams A00(C62581SHg c62581SHg, C63184Sej c63184Sej, int i) {
        c62581SHg.A02 = i;
        c62581SHg.A01 = 2131962799;
        c63184Sej.A01 = new FormDialogParams(c62581SHg);
        return c63184Sej.A01();
    }

    public final FormParams A01() {
        ImmutableList build = this.A09.build();
        this.A03 = build;
        C18C.A0G(AbstractC25226BEj.A1b(build), "Provide at least one cell params");
        return new FormParams(this);
    }

    public C63184Sej(int i, int i2, String str, int i3) {
        this.A09 = new ImmutableList.Builder();
        this.A06 = i;
        this.A08 = i2;
        this.A0B = null;
        this.A0A = str;
        this.A07 = i3;
    }
}
