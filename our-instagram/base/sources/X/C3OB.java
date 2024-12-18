package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3OB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3OB {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C3OB[] A01;
    public static final C3OB A02;
    public static final C3OB A03;

    static {
        C3OB c3ob = new C3OB(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A03 = c3ob;
        C3OB c3ob2 = new C3OB("CENTER_CROP", 1);
        A02 = c3ob2;
        C3OB[] c3obArr = {c3ob, c3ob2};
        A01 = c3obArr;
        A00 = AbstractC12190kN.A00(c3obArr);
    }

    public static C3OB valueOf(String str) {
        return (C3OB) Enum.valueOf(C3OB.class, str);
    }

    public static C3OB[] values() {
        return (C3OB[]) A01.clone();
    }

    public C3OB(String str, int i) {
    }
}
