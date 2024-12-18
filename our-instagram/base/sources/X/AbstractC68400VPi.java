package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.VPi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68400VPi {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Map A0E;
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A01;
        List list = c6fw.A00;
        Map map = (Map) list.get(1);
        InterfaceC103384lE A00 = C1344465q.A00(list.get(2));
        InterfaceC103384lE A002 = C1344465q.A00(list.get(3));
        if (map == null) {
            AbstractC25241Le.A02("BKBloksActionBloksAsyncLoadV2Impl", AnonymousClass001.A0R("params map should not be null when loading: ", str));
        }
        if (A00 == null) {
            AbstractC25241Le.A02("BKBloksActionBloksAsyncLoadV2Impl", AnonymousClass001.A0R("onSuccess expression should not be null when loading: ", str));
        }
        if (A002 == null) {
            AbstractC25241Le.A02("BKBloksActionBloksAsyncLoadV2Impl", AnonymousClass001.A0R("onFailure expression should not be null when loading: ", str));
        }
        C62862tP A06 = C6BQ.A06(c6fq);
        C1GL A0C = C6BQ.A0C(c6fq);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if (map != null) {
            A0E = C6BQ.A0H(map);
        } else {
            A0E = AbstractC06930Yk.A0E();
        }
        AbstractC192798gL A062 = C192108fB.A06(A0B, str, A0E);
        A062.A00(new C67907V1w(A06, c6fq, A00, A002, str));
        A0C.schedule(A062);
        return null;
    }
}
