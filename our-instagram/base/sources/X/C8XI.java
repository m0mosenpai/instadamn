package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8XI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8XI {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C8XI[] A01;
    public static final C8XI A02;
    public static final C8XI A03;
    public static final C8XI A04;
    public static final C8XI A05;
    public static final C8XI A06;

    static {
        C8XI c8xi = new C8XI("PRE_CAPTURE", 0);
        A06 = c8xi;
        C8XI c8xi2 = new C8XI("POST_CAPTURE", 1);
        A05 = c8xi2;
        C8XI c8xi3 = new C8XI("EDIT_CLIPS", 2);
        A02 = c8xi3;
        C8XI c8xi4 = new C8XI("FINISH_ACTIVITY", 3);
        A03 = c8xi4;
        C8XI c8xi5 = new C8XI(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 4);
        A04 = c8xi5;
        C8XI[] c8xiArr = {c8xi, c8xi2, c8xi3, c8xi4, c8xi5};
        A01 = c8xiArr;
        A00 = AbstractC12190kN.A00(c8xiArr);
    }

    public static C8XI valueOf(String str) {
        return (C8XI) Enum.valueOf(C8XI.class, str);
    }

    public static C8XI[] values() {
        return (C8XI[]) A01.clone();
    }

    public C8XI(String str, int i) {
    }
}
