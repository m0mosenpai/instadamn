package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Req, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class EnumC61076Req {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61076Req[] A01;
    public static final EnumC61076Req A02;
    public static final EnumC61076Req A03;
    public static final EnumC61076Req A04;

    static {
        EnumC61076Req enumC61076Req = new EnumC61076Req() { // from class: X.REm
        };
        A02 = enumC61076Req;
        C60628REn c60628REn = new C60628REn();
        A03 = c60628REn;
        C60629REo c60629REo = new C60629REo();
        A04 = c60629REo;
        EnumC61076Req[] enumC61076ReqArr = {enumC61076Req, c60628REn, c60629REo};
        A01 = enumC61076ReqArr;
        A00 = AbstractC12190kN.A00(enumC61076ReqArr);
    }

    public static EnumC61076Req[] values() {
        return (EnumC61076Req[]) A01.clone();
    }

    public EnumC61076Req(String str, int i) {
    }
}
