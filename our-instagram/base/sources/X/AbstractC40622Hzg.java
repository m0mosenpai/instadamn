package X;

import java.util.List;

/* renamed from: X.Hzg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40622Hzg {
    public static final IC0 A00(C130455uq c130455uq) {
        String A0R;
        EnumC130465ur enumC130465ur = c130455uq.A02;
        if (enumC130465ur.ordinal() == 1) {
            C130485ut c130485ut = c130455uq.A01;
            C14360o3.A0A(c130485ut);
            if (c130485ut.A0E == null) {
                A0R = AbstractC111324zv.A00(3528);
            } else {
                C130485ut c130485ut2 = c130455uq.A01;
                C14360o3.A0A(c130485ut2);
                List list = c130485ut2.A0E;
                if (list != null) {
                    return new IC0(new C153126ug(list, 0, list.size()));
                }
                throw AbstractC166997dE.A0g();
            }
        } else {
            A0R = AnonymousClass001.A0R(AbstractC111324zv.A00(3807), enumC130465ur.A00);
        }
        C0w9.A03("DiscoverySectionTransformer", A0R);
        return null;
    }
}
