package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3Ws, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC74603Ws {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC74603Ws[] A02;
    public static final EnumC74603Ws A03;
    public static final EnumC74603Ws A04;
    public static final EnumC74603Ws A05;
    public static final EnumC74603Ws A06;
    public final String A00;

    static {
        EnumC74603Ws enumC74603Ws = new EnumC74603Ws("COLLECTED_TO_MEMORY", 0, "collected_to_memory");
        A03 = enumC74603Ws;
        EnumC74603Ws enumC74603Ws2 = new EnumC74603Ws("SENT_IN_PAYLOAD", 1, "sent_in_payload");
        A06 = enumC74603Ws2;
        EnumC74603Ws enumC74603Ws3 = new EnumC74603Ws("RECEIVED_BY_SERVER", 2, "received_by_server");
        A05 = enumC74603Ws3;
        EnumC74603Ws enumC74603Ws4 = new EnumC74603Ws("FAILED_TO_SEND", 3, "failed_to_send");
        A04 = enumC74603Ws4;
        EnumC74603Ws[] enumC74603WsArr = {enumC74603Ws, enumC74603Ws2, enumC74603Ws3, enumC74603Ws4};
        A02 = enumC74603WsArr;
        A01 = AbstractC12190kN.A00(enumC74603WsArr);
    }

    public static EnumC74603Ws valueOf(String str) {
        return (EnumC74603Ws) Enum.valueOf(EnumC74603Ws.class, str);
    }

    public static EnumC74603Ws[] values() {
        return (EnumC74603Ws[]) A02.clone();
    }

    public EnumC74603Ws(String str, int i, String str2) {
        this.A00 = str2;
    }
}
