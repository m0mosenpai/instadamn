package X;

/* renamed from: X.Awb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24695Awb implements Runnable {
    public final /* synthetic */ C168607fu A00;
    public final /* synthetic */ CharSequence A01;

    public RunnableC24695Awb(C168607fu c168607fu, CharSequence charSequence) {
        this.A00 = c168607fu;
        this.A01 = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        InterfaceC169517hR interfaceC169517hR;
        InterfaceC169517hR interfaceC169517hR2;
        InterfaceC169517hR interfaceC169517hR3;
        InterfaceC169517hR interfaceC169517hR4;
        InterfaceC169517hR interfaceC169517hR5;
        InterfaceC169517hR interfaceC169517hR6;
        C168607fu c168607fu = this.A00;
        CharSequence charSequence = this.A01;
        if (charSequence == null || (str = charSequence.toString()) == null) {
            str = "";
        }
        boolean z = c168607fu.A02;
        int length = str.length();
        if (AbstractC167007dF.A1O(length)) {
            char charAt = str.charAt(0);
            if (str.equals("#") && c168607fu.A03 && !z) {
                interfaceC169517hR = c168607fu.A0D;
            } else if (charAt == '#' && !z) {
                interfaceC169517hR = c168607fu.A0E;
            } else {
                C38321qM c38321qM = c168607fu.A07;
                if (c38321qM != null && c168607fu.A08.A02(c38321qM) && charAt == '@') {
                    if (length == 1) {
                        interfaceC169517hR = c168607fu.A0C;
                    } else {
                        interfaceC169517hR = c168607fu.A0B;
                    }
                } else if (!AbstractC002300n.A0h(str, "@[]", false) && charAt == '@') {
                    Runnable runnable = c168607fu.A01;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (C18U.A06(C06090Tz.A05, c168607fu.A06, 36331205666292947L)) {
                        interfaceC169517hR = null;
                    } else {
                        interfaceC169517hR = c168607fu.A0F;
                    }
                }
            }
            interfaceC169517hR2 = c168607fu.A0F;
            if (interfaceC169517hR != interfaceC169517hR2 && interfaceC169517hR2 != null) {
                interfaceC169517hR2.EYJ(null);
            }
            interfaceC169517hR3 = c168607fu.A0E;
            if (interfaceC169517hR != interfaceC169517hR3 && interfaceC169517hR3 != null) {
                interfaceC169517hR3.EYJ(null);
            }
            interfaceC169517hR4 = c168607fu.A0D;
            if (interfaceC169517hR != interfaceC169517hR4 && interfaceC169517hR4 != null) {
                interfaceC169517hR4.EYJ(null);
            }
            interfaceC169517hR5 = c168607fu.A0C;
            if (interfaceC169517hR != interfaceC169517hR5 && interfaceC169517hR5 != null) {
                interfaceC169517hR5.EYJ(null);
            }
            interfaceC169517hR6 = c168607fu.A0B;
            if (interfaceC169517hR != interfaceC169517hR6 && interfaceC169517hR6 != null) {
                interfaceC169517hR6.EYJ(null);
            }
            if (interfaceC169517hR == null && length > 0) {
                c168607fu.A00 = interfaceC169517hR;
                if (!c168607fu.A03 || !str.equals("#")) {
                    str = str.substring(1);
                    C14360o3.A07(str);
                }
                interfaceC169517hR.Eby(str);
                interfaceC169517hR.EYJ(c168607fu);
                return;
            }
            c168607fu.A00 = null;
            c168607fu.A06();
            c168607fu.A07();
        }
        interfaceC169517hR = null;
        interfaceC169517hR2 = c168607fu.A0F;
        if (interfaceC169517hR != interfaceC169517hR2) {
            interfaceC169517hR2.EYJ(null);
        }
        interfaceC169517hR3 = c168607fu.A0E;
        if (interfaceC169517hR != interfaceC169517hR3) {
            interfaceC169517hR3.EYJ(null);
        }
        interfaceC169517hR4 = c168607fu.A0D;
        if (interfaceC169517hR != interfaceC169517hR4) {
            interfaceC169517hR4.EYJ(null);
        }
        interfaceC169517hR5 = c168607fu.A0C;
        if (interfaceC169517hR != interfaceC169517hR5) {
            interfaceC169517hR5.EYJ(null);
        }
        interfaceC169517hR6 = c168607fu.A0B;
        if (interfaceC169517hR != interfaceC169517hR6) {
            interfaceC169517hR6.EYJ(null);
        }
        if (interfaceC169517hR == null) {
        }
        c168607fu.A00 = null;
        c168607fu.A06();
        c168607fu.A07();
    }
}
