package X;

/* renamed from: X.6Pe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138486Pe {
    public final EnumC138476Pd A00(String str) {
        if (str == null) {
            return null;
        }
        if (!str.equals("handsfree") && !str.equals("hands-free")) {
            for (EnumC138476Pd enumC138476Pd : EnumC138476Pd.values()) {
                if (C14360o3.A0K(enumC138476Pd.A00, str)) {
                    return enumC138476Pd;
                }
            }
            C0w9.A03("ReelCaptureType", AnonymousClass001.A0R("unknown server value, please add to the enum: ", str));
            return EnumC138476Pd.A0G;
        }
        return EnumC138476Pd.A0A;
    }
}
