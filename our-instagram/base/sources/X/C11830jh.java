package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: X.0jh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11830jh {
    public static final C11820jg A04 = new Object();
    public final C11790jd A00;
    public final Context A01;
    public final C18920wW A02;
    public final WeakReference A03;

    public final synchronized String A02(C19T c19t) {
        String str;
        C14360o3.A0B(c19t, 0);
        A00(c19t, "getUniquePhoneId");
        if (c19t.A02) {
            if (C18U.A06(C06090Tz.A05, (AbstractC12990ll) this.A03.get(), 36324677315998078L)) {
                Integer num = c19t.A00;
                if (num != C05F.A00) {
                    if (num == C05F.A01) {
                        str = C16030qx.A02.A04(AbstractC12290kX.A00);
                    }
                } else {
                    str = null;
                }
            }
        }
        C11790jd c11790jd = this.A00;
        AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A03.get();
        synchronized (c11790jd) {
            C19U A01 = c11790jd.A01(abstractC12990ll);
            if (A01 != null) {
                str = A01.A01;
            } else {
                str = null;
            }
        }
        return str;
    }

    private final void A00(C19T c19t, String str) {
        String str2;
        if (C18U.A06(C06090Tz.A05, (AbstractC12990ll) this.A03.get(), 36324677316063615L) && c19t != C19T.A1I) {
            C18920wW c18920wW = this.A02;
            C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "family_device_id_client_library_usage_event"), 154);
            if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                c25531Mh.A0R("use_case_name", c19t.A01);
                c25531Mh.A0O("should_holdout", Boolean.valueOf(c19t.A02));
                if (1 - c19t.A00.intValue() != 0) {
                    str2 = "NULL";
                } else {
                    str2 = "DEVICEIDFALLBACK";
                }
                c25531Mh.A0R("holdout_type", str2);
                c25531Mh.A0R("function_name", str);
                c25531Mh.Cht();
            }
        }
    }

    public C11830jh(Context context, AbstractC12990ll abstractC12990ll) {
        this.A01 = context;
        this.A00 = C11790jd.A04.A00(context);
        this.A03 = new WeakReference(abstractC12990ll);
        this.A02 = AbstractC12220kQ.A02(abstractC12990ll);
    }

    public final C19U A01(C19T c19t) {
        A00(c19t, "getPhoneId");
        if (c19t.A02) {
            if (C18U.A06(C06090Tz.A05, (AbstractC12990ll) this.A03.get(), 36324677315998078L)) {
                Integer num = c19t.A00;
                if (num == C05F.A00) {
                    return null;
                }
                if (num == C05F.A01) {
                    String A042 = C16030qx.A02.A04(AbstractC12290kX.A00);
                    if (A042 == null) {
                        return null;
                    }
                    return new C19U(A042, System.currentTimeMillis(), AbstractC63103Sd6.A00(this.A01.getPackageName()));
                }
            }
        }
        return this.A00.A01((AbstractC12990ll) this.A03.get());
    }
}
