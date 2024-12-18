package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6XZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6XZ {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6XZ[] A01;
    public static final C6XZ A02;
    public static final C6XZ A03;
    public static final C6XZ A04;
    public static final C6XZ A05;

    static {
        C6XZ c6xz = new C6XZ(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A04 = c6xz;
        C6XZ c6xz2 = new C6XZ("STARTED", 1);
        A05 = c6xz2;
        C6XZ c6xz3 = new C6XZ("FAILED", 2);
        A03 = c6xz3;
        C6XZ c6xz4 = new C6XZ("COMPLETE", 3);
        A02 = c6xz4;
        C6XZ[] c6xzArr = {c6xz, c6xz2, c6xz3, c6xz4};
        A01 = c6xzArr;
        A00 = AbstractC12190kN.A00(c6xzArr);
    }

    public static C6XZ valueOf(String str) {
        return (C6XZ) Enum.valueOf(C6XZ.class, str);
    }

    public static C6XZ[] values() {
        return (C6XZ[]) A01.clone();
    }

    public C6XZ(String str, int i) {
    }
}
