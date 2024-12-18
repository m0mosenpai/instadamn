package X;

import java.lang.reflect.Method;

/* renamed from: X.SYi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62940SYi {
    public static final C62940SYi A03;
    public static final RuntimeException A04;
    public final Method A00;
    public final Method A01;
    public final Method A02;

    static {
        C62940SYi c62940SYi = null;
        try {
            e = null;
            c62940SYi = new C62940SYi();
        } catch (RuntimeException e) {
            e = e;
        }
        A03 = c62940SYi;
        A04 = e;
    }

    public final Object[] A00(Class cls) {
        try {
            return (Object[]) this.A02.invoke(cls, AbstractC58318PtA.A1b());
        } catch (Exception unused) {
            throw AbstractC167007dF.A0c("Failed to access RecordComponents of type ", C914045z.A06(cls));
        }
    }

    public C62940SYi() {
        try {
            this.A02 = AbstractC58318PtA.A0t(Class.class, "getRecordComponents");
            Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
            this.A00 = AbstractC58318PtA.A0t(cls, "getName");
            this.A01 = AbstractC58318PtA.A0t(cls, "getType");
        } catch (Exception e) {
            throw AbstractC58318PtA.A0e(String.format("Failed to access Methods needed to support `java.lang.Record`: (%s) %s", MSY.A0h(e), e.getMessage()), e);
        }
    }
}
