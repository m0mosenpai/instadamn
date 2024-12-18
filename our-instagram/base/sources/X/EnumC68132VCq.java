package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VCq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68132VCq {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC68132VCq[] A01;
    public static final EnumC68132VCq A02;
    public static final EnumC68132VCq A03;
    public static final EnumC68132VCq A04;

    static {
        EnumC68132VCq enumC68132VCq = new EnumC68132VCq(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A03 = enumC68132VCq;
        EnumC68132VCq enumC68132VCq2 = new EnumC68132VCq("TEXT_FIELD", 1);
        A04 = enumC68132VCq2;
        EnumC68132VCq enumC68132VCq3 = new EnumC68132VCq("INLINE", 2);
        A02 = enumC68132VCq3;
        EnumC68132VCq[] enumC68132VCqArr = {enumC68132VCq, enumC68132VCq2, enumC68132VCq3};
        A01 = enumC68132VCqArr;
        A00 = AbstractC12190kN.A00(enumC68132VCqArr);
    }

    public static EnumC68132VCq valueOf(String str) {
        return (EnumC68132VCq) Enum.valueOf(EnumC68132VCq.class, str);
    }

    public static EnumC68132VCq[] values() {
        return (EnumC68132VCq[]) A01.clone();
    }

    public EnumC68132VCq(String str, int i) {
    }
}
