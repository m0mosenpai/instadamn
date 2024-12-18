package X;

/* loaded from: classes11.dex */
public final class X5N extends C0YY implements InterfaceC16660sJ {
    public static final X5N A00 = new X5N();

    public X5N() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String valueOf;
        String str = (String) obj;
        C14360o3.A0B(str, 0);
        C2FP.A08();
        String lowerCase = str.toLowerCase(C1Q2.A02());
        C14360o3.A07(lowerCase);
        if (lowerCase.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char charAt = lowerCase.charAt(0);
            if (Character.isLowerCase(charAt)) {
                C2FP.A08();
                valueOf = C11K.A00(C1Q2.A02(), charAt);
            } else {
                valueOf = String.valueOf(charAt);
            }
            sb.append((Object) valueOf);
            String substring = lowerCase.substring(1);
            C14360o3.A07(substring);
            return AbstractC166997dE.A0x(substring, sb);
        }
        return lowerCase;
    }
}
