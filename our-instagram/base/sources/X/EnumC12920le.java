package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.0le, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC12920le {
    public static EnumC12920le A00;
    public static InterfaceC08830cm A01;
    public static final C12910ld A02;
    public static final InterfaceC09390do A03;
    public static final InterfaceC09390do A04;
    public static final InterfaceC09390do A05;
    public static final InterfaceC09390do A06;
    public static final /* synthetic */ EnumEntries A07;
    public static final /* synthetic */ EnumC12920le[] A08;
    public static final EnumC12920le A09;
    public static final EnumC12920le A0A;
    public static final EnumC12920le A0B;
    public static final EnumC12920le A0C;

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.0ld] */
    static {
        EnumC12920le enumC12920le = new EnumC12920le(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A0B = enumC12920le;
        EnumC12920le enumC12920le2 = new EnumC12920le("ALPHA", 1);
        A09 = enumC12920le2;
        EnumC12920le enumC12920le3 = new EnumC12920le("BETA", 2);
        A0A = enumC12920le3;
        EnumC12920le enumC12920le4 = new EnumC12920le("PROD", 3);
        A0C = enumC12920le4;
        EnumC12920le[] enumC12920leArr = {enumC12920le, enumC12920le2, enumC12920le3, enumC12920le4};
        A08 = enumC12920leArr;
        A07 = AbstractC12190kN.A00(enumC12920leArr);
        A02 = new Object();
        A05 = AbstractC09440dt.A01(C04920Nm.A00);
        A04 = AbstractC09440dt.A01(C04930Nn.A00);
        A06 = AbstractC09440dt.A01(C04910Nk.A00);
        A03 = AbstractC09440dt.A01(C04940Nq.A00);
    }

    public static final synchronized EnumC12920le A00() {
        EnumC12920le A002;
        synchronized (EnumC12920le.class) {
            A002 = A02.A00();
        }
        return A002;
    }

    public static EnumC12920le valueOf(String str) {
        return (EnumC12920le) Enum.valueOf(EnumC12920le.class, str);
    }

    public static EnumC12920le[] values() {
        return (EnumC12920le[]) A08.clone();
    }

    public EnumC12920le(String str, int i) {
    }
}
