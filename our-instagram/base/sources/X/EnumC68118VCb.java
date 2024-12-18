package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VCb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68118VCb {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC68118VCb[] A01;
    public static final EnumC68118VCb A02;
    public static final EnumC68118VCb A03;

    static {
        EnumC68118VCb enumC68118VCb = new EnumC68118VCb("CONNECTED", 0);
        A02 = enumC68118VCb;
        EnumC68118VCb enumC68118VCb2 = new EnumC68118VCb("DISCONNECTED", 1);
        A03 = enumC68118VCb2;
        EnumC68118VCb[] enumC68118VCbArr = {enumC68118VCb, enumC68118VCb2};
        A01 = enumC68118VCbArr;
        A00 = AbstractC12190kN.A00(enumC68118VCbArr);
    }

    public static EnumC68118VCb valueOf(String str) {
        return (EnumC68118VCb) Enum.valueOf(EnumC68118VCb.class, str);
    }

    public static EnumC68118VCb[] values() {
        return (EnumC68118VCb[]) A01.clone();
    }

    public EnumC68118VCb(String str, int i) {
    }
}
