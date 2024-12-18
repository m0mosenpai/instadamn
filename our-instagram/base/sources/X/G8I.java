package X;

/* loaded from: classes6.dex */
public final class G8I implements InterfaceC57949Pmv {
    public final String A00;

    public G8I(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC57949Pmv
    public final C54543O7v getState(C54543O7v c54543O7v, CharSequence charSequence, boolean z) {
        AbstractC167017dG.A1N(c54543O7v, charSequence);
        if (charSequence.length() == 0) {
            c54543O7v.A01 = "error";
            c54543O7v.A00 = this.A00;
        }
        return c54543O7v;
    }
}
