package X;

/* loaded from: classes8.dex */
public final class KLD extends AbstractC13100lw {
    public long A00 = -1;
    public final /* synthetic */ LRZ A01;

    @Override // X.AbstractC13100lw, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        C167637eJ c167637eJ;
        C14360o3.A0B(charSequence, 0);
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.A00;
        if (j == -1 || currentTimeMillis - j > 500) {
            this.A00 = currentTimeMillis;
        }
        boolean z2 = false;
        if (i == 0 && i2 == 0 && (i3 == 1 || i3 == 2)) {
            z = true;
        } else {
            z = false;
        }
        Jn5 jn5 = this.A01.A05;
        Object value = jn5.A0F.getValue();
        if ((value instanceof C167637eJ) && (c167637eJ = (C167637eJ) value) != null && c167637eJ.A00 != null) {
            z2 = true;
        }
        C166017bT c166017bT = jn5.A04;
        c166017bT.A03.Egh(charSequence);
        c166017bT.A02.Egh(charSequence.toString());
        if (z) {
            AbstractC166987dD.A1Z(new PZO(jn5, (InterfaceC23621Ds) null, 12, z2), AbstractC141776au.A00(jn5));
        }
    }

    public KLD(LRZ lrz) {
        this.A01 = lrz;
    }
}
