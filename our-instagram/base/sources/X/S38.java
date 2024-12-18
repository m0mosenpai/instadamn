package X;

/* loaded from: classes10.dex */
public abstract class S38 {
    public static void A00(int condition, int methodName, String a, boolean b) {
        if (b) {
            return;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("overflow: ");
        A1C.append(a);
        A1C.append("(");
        A1C.append(condition);
        AbstractC58318PtA.A1S(A1C);
        A1C.append(methodName);
        throw new ArithmeticException(AbstractC166997dE.A0x(")", A1C));
    }
}
