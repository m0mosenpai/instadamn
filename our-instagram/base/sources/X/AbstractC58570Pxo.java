package X;

import java.util.Map;

/* renamed from: X.Pxo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58570Pxo {
    public static final C62176S0x A04 = new Object();
    public static final InterfaceC16820sZ A05 = C58572Pxq.A00;
    public final String A00;
    public final String A01;
    public final String A02;
    public final Map A03;

    public final String toString() {
        return AbstractC16490ru.A0q(AnonymousClass001.A18("\n      |[DebugEvent]\n      |  type = '", this.A02, "',\n      |  renderStateId = '", this.A00, "',\n      |  thread = '", this.A01, "',\n      |  attributes = ", AbstractC001800i.A0P(",\n", "{\n", "\n|  }", this.A03.entrySet(), C65045Tca.A00), "\n    "), "|");
    }

    public AbstractC58570Pxo(String str, String str2, String str3, Map map) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = map;
    }
}
