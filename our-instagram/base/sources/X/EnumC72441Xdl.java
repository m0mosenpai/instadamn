package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Xdl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72441Xdl implements InterfaceC58302Psu {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC72441Xdl[] A01;
    public static final EnumC72441Xdl A02;
    public static final EnumC72441Xdl A03;

    static {
        EnumC72441Xdl enumC72441Xdl = new EnumC72441Xdl("ALLOW_OTHERS_TO_SHARE_STORIES_IF_MENTIONED", 0);
        A02 = enumC72441Xdl;
        EnumC72441Xdl enumC72441Xdl2 = new EnumC72441Xdl("ARCHIVING_SAVE_ORIGINAL_PHOTOS", 1);
        A03 = enumC72441Xdl2;
        EnumC72441Xdl[] enumC72441XdlArr = {enumC72441Xdl, enumC72441Xdl2};
        A01 = enumC72441XdlArr;
        A00 = AbstractC12190kN.A00(enumC72441XdlArr);
    }

    public static EnumC72441Xdl valueOf(String str) {
        return (EnumC72441Xdl) Enum.valueOf(EnumC72441Xdl.class, str);
    }

    public static EnumC72441Xdl[] values() {
        return (EnumC72441Xdl[]) A01.clone();
    }

    @Override // X.InterfaceC57989PnZ
    public final String BOw() {
        return MSZ.A0t(this);
    }

    public EnumC72441Xdl(String str, int i) {
    }
}
