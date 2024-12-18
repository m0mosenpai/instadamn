package X;

import com.android.internal.os.SomeArgs;

/* renamed from: X.0DE, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0DE {
    public static boolean A00;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0iF] */
    public static C10990iF A00(Object obj) {
        if (!A00) {
            A00 = true;
        }
        try {
            final SomeArgs someArgs = (SomeArgs) obj;
            return new AbstractC05350Qi(someArgs) { // from class: X.0iF
                public final SomeArgs A00;

                @Override // X.AbstractC05350Qi
                public final int A02(int i) {
                    try {
                        if (1 != i) {
                            return this.A00.argi2;
                        }
                        return this.A00.argi1;
                    } catch (NoClassDefFoundError | NoSuchFieldError e) {
                        String format = String.format("Cannot access SomeArgs int field for %s%d.", "argi", Integer.valueOf(i));
                        C0DF.A00.A03(format, e);
                        throw new Exception(format, e);
                    }
                }

                @Override // X.AbstractC05350Qi
                public final Object A03(int i) {
                    try {
                        return this.A00.arg1;
                    } catch (NoClassDefFoundError | NoSuchFieldError e) {
                        String format = String.format("Cannot access SomeArgs obj field for %s%d.", "arg", 1);
                        C0DF.A00.A03(format, e);
                        throw new Exception(format, e);
                    }
                }

                {
                    this.A00 = someArgs;
                }
            };
        } catch (ClassCastException | Error e) {
            C0DF.A00.A0A(e, "Cannot construct linked SomeArgsWrapper for %s", obj.getClass().getName());
            return null;
        }
    }
}
