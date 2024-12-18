package X;

/* renamed from: X.45V, reason: invalid class name */
/* loaded from: classes2.dex */
public enum C45V {
    ANY,
    NATURAL,
    SCALAR,
    ARRAY,
    OBJECT,
    NUMBER,
    NUMBER_FLOAT,
    NUMBER_INT,
    STRING,
    /* JADX INFO: Fake field, exist only in values array */
    BOOLEAN,
    BINARY;

    public final boolean A00() {
        if (this != NUMBER && this != NUMBER_INT && this != NUMBER_FLOAT) {
            return false;
        }
        return true;
    }
}
