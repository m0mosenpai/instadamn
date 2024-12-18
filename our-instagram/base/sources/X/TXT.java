package X;

/* loaded from: classes10.dex */
public final class TXT extends RuntimeException {
    @Override // java.lang.Throwable
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final synchronized Exception getCause() {
        Throwable cause;
        cause = super.getCause();
        cause.getClass();
        return (Exception) cause;
    }

    public final Exception A00() {
        int indexOf;
        String A0N;
        int i = 0;
        Class[] clsArr = {N20.class};
        for (char c = 0; c <= 0; c = 1) {
            Class cls = clsArr[c];
            if (!(!RuntimeException.class.isAssignableFrom(cls))) {
                Object[] objArr = {"getCause", cls};
                for (int i2 = 0; i2 < 2; i2++) {
                    Object obj = objArr[i2];
                    if (obj == null) {
                        A0N = "null";
                    } else {
                        try {
                            A0N = obj.toString();
                        } catch (Exception e) {
                            A0N = AbstractC58324PtG.A0N(obj, e);
                        }
                    }
                    objArr[i2] = A0N;
                }
                StringBuilder A0q = AbstractC58318PtA.A0q(118);
                int i3 = 0;
                while (i < 2 && (indexOf = "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s".indexOf("%s", i3)) != -1) {
                    A0q.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i3, indexOf);
                    A0q.append(objArr[i]);
                    i3 = indexOf + 2;
                    i++;
                }
                A0q.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i3, 86);
                if (i < 2) {
                    for (int A0B = AbstractC58322PtE.A0B(" [", A0q, objArr, i); A0B < 2; A0B = AbstractC58322PtE.A0B(", ", A0q, objArr, A0B)) {
                    }
                    A0q.append(']');
                }
                throw AbstractC166987dD.A12(A0q.toString());
            }
        }
        if (N20.class.isInstance(getCause())) {
            return (Exception) N20.class.cast(getCause());
        }
        Exception cause = getCause();
        ClassCastException classCastException = new ClassCastException(String.format("getCause(%s) doesn't match underlying exception", N20.class));
        classCastException.initCause(cause);
        throw classCastException;
    }
}
