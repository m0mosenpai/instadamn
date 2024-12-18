package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7MS, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7MS {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C7MS[] A01;
    public static final C7MS A02;
    public static final C7MS A03;
    public static final C7MS A04;

    static {
        C7MS c7ms = new C7MS(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A02 = c7ms;
        C7MS c7ms2 = new C7MS("PER_CREATOR_BETA_DISCLOSURE", 1);
        A03 = c7ms2;
        C7MS c7ms3 = new C7MS("TERMS_NUX", 2);
        A04 = c7ms3;
        C7MS[] c7msArr = {c7ms, c7ms2, c7ms3};
        A01 = c7msArr;
        A00 = AbstractC12190kN.A00(c7msArr);
    }

    public static C7MS valueOf(String str) {
        return (C7MS) Enum.valueOf(C7MS.class, str);
    }

    public static C7MS[] values() {
        return (C7MS[]) A01.clone();
    }

    public C7MS(String str, int i) {
    }
}
