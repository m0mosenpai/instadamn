package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.0xt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC19660xt {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC19660xt[] A01;
    public static final EnumC19660xt A02;
    public static final EnumC19660xt A03;

    static {
        EnumC19660xt enumC19660xt = new EnumC19660xt("SHARED_PREFS", 0);
        A03 = enumC19660xt;
        EnumC19660xt enumC19660xt2 = new EnumC19660xt("DATASTORE_EXPERIMENTAL", 1);
        A02 = enumC19660xt2;
        EnumC19660xt[] enumC19660xtArr = {enumC19660xt, enumC19660xt2};
        A01 = enumC19660xtArr;
        A00 = AbstractC12190kN.A00(enumC19660xtArr);
    }

    public static EnumC19660xt valueOf(String str) {
        return (EnumC19660xt) Enum.valueOf(EnumC19660xt.class, str);
    }

    public static EnumC19660xt[] values() {
        return (EnumC19660xt[]) A01.clone();
    }

    public EnumC19660xt(String str, int i) {
    }
}
