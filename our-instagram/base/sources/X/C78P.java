package X;

import java.util.List;

/* renamed from: X.78P, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C78P {
    public int A01;
    public final String A03;
    public final /* synthetic */ C7BH A04;
    public List A02 = C16930sl.A00;
    public int A00 = 1;

    public final void A00(CharSequence charSequence) {
        List A0R = AbstractC001900j.A0R(charSequence, new String[]{" "}, 0);
        this.A02 = A0R;
        if (A0R.size() < this.A01) {
            this.A01 = this.A02.size() - 1;
        }
        this.A00 = Math.max(1, (int) Math.floor((this.A02.size() - this.A01) * 0.1f));
    }

    public C78P(C7BH c7bh, String str, int i) {
        this.A04 = c7bh;
        this.A03 = str;
        this.A01 = i;
    }
}
