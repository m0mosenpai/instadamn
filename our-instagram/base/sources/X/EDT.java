package X;

/* loaded from: classes6.dex */
public final class EDT extends C40781ul {
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A00 = "";
    public boolean A08 = true;

    @Override // X.C40781ul, X.C40791um, X.InterfaceC40801un
    public final boolean isOk() {
        if (this.mStatusCode == 200) {
            if (this.A03 != null || this.A05 != null) {
                return true;
            }
            return false;
        }
        return false;
    }
}
