package X;

/* renamed from: X.72e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1567872e {
    public static final EnumC155746z3 A00(int i) {
        EnumC155746z3 enumC155746z3 = (EnumC155746z3) EnumC155746z3.A01.get(Integer.valueOf(i));
        if (enumC155746z3 != null) {
            return enumC155746z3;
        }
        throw new IllegalArgumentException(AnonymousClass001.A03(i, " is not a valid ProfileHeaderBinderGroupItemType"));
    }
}
