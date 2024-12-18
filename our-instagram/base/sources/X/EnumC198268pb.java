package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8pb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC198268pb {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC198268pb[] A03;
    public static final EnumC198268pb A04;
    public static final EnumC198268pb A05;
    public static final EnumC198268pb A06;
    public static final EnumC198268pb A07;
    public final AnonymousClass249 A00;
    public final String A01;

    static {
        EnumC198268pb enumC198268pb = new EnumC198268pb(AnonymousClass249.PHOTO, "PHOTO", "IGMediaTypePhoto", 0);
        A04 = enumC198268pb;
        EnumC198268pb enumC198268pb2 = new EnumC198268pb(AnonymousClass249.VIDEO, "VIDEO", "IGMediaTypeVideo", 1);
        A07 = enumC198268pb2;
        AnonymousClass249 anonymousClass249 = AnonymousClass249.NONE;
        EnumC198268pb enumC198268pb3 = new EnumC198268pb(anonymousClass249, "TYPE_MODE", "type_mode", 2);
        A05 = enumC198268pb3;
        EnumC198268pb enumC198268pb4 = new EnumC198268pb(anonymousClass249, "UNKNOWN", "unknown", 3);
        A06 = enumC198268pb4;
        EnumC198268pb[] enumC198268pbArr = {enumC198268pb, enumC198268pb2, enumC198268pb3, enumC198268pb4};
        A03 = enumC198268pbArr;
        A02 = AbstractC12190kN.A00(enumC198268pbArr);
    }

    public static EnumC198268pb valueOf(String str) {
        return (EnumC198268pb) Enum.valueOf(EnumC198268pb.class, str);
    }

    public static EnumC198268pb[] values() {
        return (EnumC198268pb[]) A03.clone();
    }

    public EnumC198268pb(AnonymousClass249 anonymousClass249, String str, String str2, int i) {
        this.A01 = str2;
        this.A00 = anonymousClass249;
    }
}
