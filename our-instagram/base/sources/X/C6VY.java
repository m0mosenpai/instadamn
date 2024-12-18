package X;

import android.util.SparseArray;
import com.facebook.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6VY, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6VY {
    public static final C6AY A00(C136336Fm c136336Fm, C6FG c6fg, AnonymousClass632 anonymousClass632, C102884kP c102884kP, C140076Vl c140076Vl, List list) {
        C102884kP c102884kP2;
        C103054kg c103054kg;
        C140026Vg c140026Vg;
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        SparseArray sparseArray = null;
        C14360o3.A0B(c102884kP, 0);
        C14360o3.A0B(c6fg, 1);
        C14360o3.A0B(c136336Fm, 2);
        C14360o3.A0B(anonymousClass632, 3);
        AnonymousClass630 A02 = AnonymousClass634.A02(c6fg);
        C14360o3.A07(A02);
        if (c102884kP.A02 == null) {
            C14360o3.A08(C1339162z.A00);
            try {
                if (C1LN.A01.isTracing()) {
                    C1LN.A01("setCommitContainer");
                }
                ThreadLocal threadLocal = AbstractC103024kd.A02;
                EnumC103014kc enumC103014kc = (EnumC103014kc) threadLocal.get();
                try {
                    threadLocal.set(EnumC103014kc.A04);
                    c102884kP2 = C6AU.A00(null, new C6VZ(A02.A0D, c102884kP), c102884kP);
                } finally {
                    threadLocal.set(enumC103014kc);
                }
            } finally {
                if (C1LN.A01.isTracing()) {
                    C1LN.A00();
                }
            }
        } else {
            c102884kP2 = c102884kP;
        }
        C140056Vj c140056Vj = null;
        if (c140076Vl != null) {
            c103054kg = c140076Vl.A01;
        } else {
            c103054kg = null;
        }
        InterfaceC103074ki A05 = AnonymousClass634.A05(c6fg);
        C6FD c6fd = (C6FD) c6fg.A00(R.id.bk_context_key_scoped_client_id_mapper);
        C14360o3.A07(c6fd);
        C63162tt AgX = c6fg.A02.AgS().AgX();
        C14360o3.A07(AgX);
        String str = (String) c6fg.A01.get(R.id.bk_context_key_logging_id);
        C140016Vf c140016Vf = new C140016Vf(A02);
        if (c103054kg != null) {
            c140026Vg = c103054kg.A01;
        } else {
            c140026Vg = null;
        }
        C140026Vg c140026Vg2 = new C140026Vg(anonymousClass632, c6fd, AgX, c140026Vg, c140016Vf, A05, str);
        if (c103054kg != null) {
            C140046Vi c140046Vi = c103054kg.A02;
            synchronized (c140046Vi.A02) {
                sparseArray = c140046Vi.A00.clone();
                arrayList2 = new ArrayList(c140046Vi.A03);
            }
            z = true;
            arrayList = new ArrayList(arrayList2);
        } else {
            z = false;
            arrayList = new ArrayList();
        }
        arrayList.addAll(list);
        SparseArray sparseArray2 = null;
        if (z) {
            sparseArray2 = sparseArray;
        }
        C140046Vi c140046Vi2 = new C140046Vi(sparseArray2, c136336Fm, arrayList);
        if (c103054kg != null) {
            c140056Vj = c103054kg.A03;
        }
        C140056Vj c140056Vj2 = new C140056Vj();
        C1339162z c1339162z = C1339162z.A00;
        C14360o3.A08(c1339162z);
        C103054kg c103054kg2 = new C103054kg(c1339162z, c140026Vg2, c140046Vi2, c140056Vj, c140056Vj2);
        return new C6AY(new C140066Vk(c102884kP, c103054kg2), new C140076Vl(c102884kP2, c103054kg2), list);
    }
}
