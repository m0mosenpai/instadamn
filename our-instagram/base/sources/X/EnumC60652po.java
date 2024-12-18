package X;

import java.io.Serializable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2po, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC60652po implements Serializable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC60652po[] A01;
    public static final EnumC60652po A02;
    public static final EnumC60652po A03;
    public static final EnumC60652po A04;
    public static final EnumC60652po A05;
    public static final EnumC60652po A06;
    public static final long serialVersionUID = 1;

    static {
        EnumC60652po enumC60652po = new EnumC60652po("DELAY_LOADING_UNTIL_NEXT_ON_RESUME", 0);
        A03 = enumC60652po;
        EnumC60652po enumC60652po2 = new EnumC60652po("READY_TO_LOAD_ON_RESUME", 1);
        A06 = enumC60652po2;
        EnumC60652po enumC60652po3 = new EnumC60652po("READY_TO_LOAD_ON_CREATE", 2);
        A05 = enumC60652po3;
        EnumC60652po enumC60652po4 = new EnumC60652po("LOADED", 3);
        A04 = enumC60652po4;
        EnumC60652po enumC60652po5 = new EnumC60652po("ATTACHED", 4);
        A02 = enumC60652po5;
        EnumC60652po[] enumC60652poArr = {enumC60652po, enumC60652po2, enumC60652po3, enumC60652po4, enumC60652po5};
        A01 = enumC60652poArr;
        A00 = AbstractC12190kN.A00(enumC60652poArr);
    }

    public static EnumC60652po valueOf(String str) {
        return (EnumC60652po) Enum.valueOf(EnumC60652po.class, str);
    }

    public static EnumC60652po[] values() {
        return (EnumC60652po[]) A01.clone();
    }

    public EnumC60652po(String str, int i) {
    }
}
