package X;

/* loaded from: classes5.dex */
public abstract class CAZ {
    public String A00() {
        Throwable th;
        if (this instanceof C4Z) {
            return ((C4Z) this).A00;
        }
        if (!(this instanceof C4X) && (this instanceof C4Y) && (th = ((C4Y) this).A00) != null) {
            return th.getMessage();
        }
        return null;
    }

    public String A01() {
        if (this instanceof C4Z) {
            return "UNKNOWN";
        }
        if (this instanceof C4X) {
            return "IGNORE_FOR_MEMU";
        }
        if (this instanceof C4Y) {
            return "GRAPHQL_FAILURE";
        }
        return AbstractC111324zv.A00(1516);
    }
}
