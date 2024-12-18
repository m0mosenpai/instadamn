package X;

import android.widget.CompoundButton;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;

/* renamed from: X.OlA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55517OlA implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C55517OlA(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        String str;
        if (this.A00 != 0) {
            FPR fpr = (FPR) this.A02;
            if (z) {
                str = "on";
            } else {
                str = "off";
            }
            fpr.A00(str, this.A03, "toggle");
            return;
        }
        if (!z) {
            return;
        }
        NO4 no4 = (NO4) this.A02;
        no4.A0F((LeadGenFormBaseQuestion) this.A01, this.A03);
        no4.A00.setVisibility(8);
    }
}
