package X;

/* renamed from: X.0RP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0RP extends C0i0 {
    public static final C03740Ip A02 = new C03740Ip(C0RP.class, new Class[]{String.class, Object[].class}, 10);
    public String A00;
    public Object[] A01;

    @Override // X.C0i0
    public final String A03() {
        String str;
        String str2;
        String str3 = this.A00;
        Object[] objArr = this.A01;
        if (str3 != null) {
            if (objArr == null) {
                str = "Y";
            } else {
                return String.format(str3, objArr);
            }
        } else {
            str = "N";
        }
        if (objArr != null) {
            str2 = "Y";
        } else {
            str2 = "N";
        }
        String.format("LogFragment was not initalized correctly. format msg set: %s format args set: %s", str, str2);
        return "";
    }

    public C0RP(boolean z, String str, Object... objArr) {
        this();
        A04(z, str, objArr);
    }

    @Override // X.C0i0, X.AbstractC03460Gz
    public final void A02(int i, int i2, Object obj, Object obj2) {
        Object[] objArr;
        obj.getClass();
        String str = (String) obj;
        boolean z = false;
        if (obj2 != null) {
            objArr = (Object[]) obj2;
        } else {
            objArr = new Object[0];
        }
        if (i != 0) {
            z = true;
        }
        A04(z, str, objArr);
    }

    public final void A04(boolean z, String str, Object... objArr) {
        str.getClass();
        this.A00 = str;
        objArr.getClass();
        this.A01 = objArr;
        ((C0i0) this).A00 = true;
        ((AbstractC03460Gz) this).A02 = z;
    }

    public C0RP() {
        super(true, false);
    }
}
