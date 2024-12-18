package X;

import android.app.Dialog;
import android.content.Context;
import android.widget.TextView;

/* renamed from: X.Q0w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class DialogC58693Q0w extends Dialog {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC58693Q0w(Context context, C38628GyV c38628GyV) {
        super(context, c38628GyV.A05);
        boolean A1V = AbstractC167007dF.A1V(c38628GyV);
        setContentView(c38628GyV.A02);
        this.A03 = (TextView) findViewById(c38628GyV.A06);
        this.A00 = (TextView) findViewById(c38628GyV.A01);
        this.A01 = (TextView) findViewById(c38628GyV.A03);
        this.A02 = (TextView) findViewById(c38628GyV.A04);
        setCanceledOnTouchOutside(false);
        setCancelable(A1V);
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        this.A01.requestFocus();
    }
}
