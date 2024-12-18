package X;

import java.util.HashSet;

/* renamed from: X.SMl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62697SMl {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public java.util.Set A06 = AbstractC166987dD.A1H();

    public final void A00(String str) {
        this.A04 = str;
        if (!this.A06.contains("sessionId")) {
            HashSet A0k = AbstractC31171DnF.A0k(this.A06);
            this.A06 = A0k;
            A0k.add("sessionId");
        }
    }
}
