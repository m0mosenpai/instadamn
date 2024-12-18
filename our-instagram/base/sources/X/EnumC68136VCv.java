package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VCv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class EnumC68136VCv {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC68136VCv[] A01;
    public static final EnumC68136VCv A02;
    public static final EnumC68136VCv A03;
    public static final EnumC68136VCv A04;

    static {
        EnumC68136VCv enumC68136VCv = new EnumC68136VCv(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A03 = enumC68136VCv;
        C68098VBa c68098VBa = new C68098VBa();
        A02 = c68098VBa;
        C68099VBb c68099VBb = new C68099VBb();
        A04 = c68099VBb;
        EnumC68136VCv[] enumC68136VCvArr = {enumC68136VCv, c68098VBa, c68099VBb};
        A01 = enumC68136VCvArr;
        A00 = AbstractC12190kN.A00(enumC68136VCvArr);
    }

    public static EnumC68136VCv valueOf(String str) {
        return (EnumC68136VCv) Enum.valueOf(EnumC68136VCv.class, str);
    }

    public static EnumC68136VCv[] values() {
        return (EnumC68136VCv[]) A01.clone();
    }

    public EnumC68136VCv(String str, int i) {
    }
}
