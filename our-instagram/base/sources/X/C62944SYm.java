package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.SYm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62944SYm {
    public final int A00;
    public final ImmutableList A01;
    public final String A02;
    public final Throwable A03;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable, X.TYZ] */
    public final Throwable A01() {
        ?? th = new Throwable((String) null);
        th.A00 = this;
        Throwable th2 = this.A03;
        if (th2 != null) {
            A00(th2, th);
            return th2;
        }
        String str = this.A02;
        if (str != null) {
            C64875TYb c64875TYb = new C64875TYb(this, str);
            A00(c64875TYb, th);
            return c64875TYb;
        }
        C64875TYb c64875TYb2 = new C64875TYb(this, AnonymousClass001.A0O("Remote error code ", this.A00));
        A00(c64875TYb2, th);
        return c64875TYb2;
    }

    public C62944SYm(ImmutableList immutableList, String str, Throwable th, int i) {
        this.A00 = i;
        this.A03 = th;
        this.A02 = str;
        this.A01 = immutableList;
    }

    public static final void A00(Throwable th, Throwable th2) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        if (th.getClass() != th2.getClass()) {
            try {
                th.initCause(th2);
            } catch (IllegalStateException e) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, th2);
            }
        }
    }
}
