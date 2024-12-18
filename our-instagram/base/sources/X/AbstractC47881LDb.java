package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.LDb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47881LDb {
    public static final InterfaceC08100bW A00 = AbstractC31175DnJ.A0B();

    public static final boolean A00(String str) {
        String queryParameter;
        if (str != null && str.length() != 0) {
            android.net.Uri A01 = AbstractC08820cl.A01(A00, AnonymousClass001.A0R("ig://", str));
            return (A01 == null || (queryParameter = A01.getQueryParameter(TraceFieldType.TransportType)) == null || EnumC92794Ds.A04 != AbstractC46863Knw.A00(queryParameter)) ? false : true;
        }
        return false;
    }
}
