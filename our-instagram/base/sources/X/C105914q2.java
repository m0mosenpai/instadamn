package X;

/* renamed from: X.4q2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105914q2 {
    public final AbstractC12990ll A00;

    public C105914q2(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 1);
        this.A00 = abstractC12990ll;
    }

    public static final void A01(C105914q2 c105914q2, String str, String str2, String str3, String str4, int i) {
        C18920wW A02 = AbstractC12220kQ.A02(c105914q2.A00);
        C25531Mh c25531Mh = new C25531Mh(A02.A00(A02.A00, "fx_access_control_list"), 157);
        if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            c25531Mh.A0k(str);
            c25531Mh.A0R("acl_error_message", str2);
            c25531Mh.A0R("caller_name", str3);
            c25531Mh.A0Q("acl_version", 2L);
            ((AbstractC02600Aj) c25531Mh).A00.A8p("capability", Integer.valueOf(i));
            c25531Mh.A0R("caller_context", str4);
            c25531Mh.Cht();
        }
    }

    public static final int A00(Integer num) {
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        return 4;
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public C105914q2() {
    }
}
