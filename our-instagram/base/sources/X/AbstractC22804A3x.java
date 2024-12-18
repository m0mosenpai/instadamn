package X;

/* renamed from: X.A3x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22804A3x {
    public static final C11L A00;

    static {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append('(');
        A1C.append("(\\p{Digit}+)");
        A1C.append("(\\.)?(");
        A1C.append("(\\p{Digit}+)");
        A1C.append("?)(");
        A1C.append("[eE][+-]?(\\p{Digit}+)");
        A1C.append(")?)|(\\.(");
        A1C.append("(\\p{Digit}+)");
        A1C.append(")(");
        A1C.append("[eE][+-]?(\\p{Digit}+)");
        A1C.append(")?)|((");
        A1C.append("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))");
        A1C.append(")[pP][+-]?");
        A1C.append("(\\p{Digit}+)");
        A00 = new C11L(AnonymousClass001.A0g("[\\x00-\\x20]*[+-]?(NaN|Infinity|((", AbstractC167017dG.A0p(A1C), ")[fFdD]?))[\\x00-\\x20]*"));
    }
}
