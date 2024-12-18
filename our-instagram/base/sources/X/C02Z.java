package X;

/* renamed from: X.02Z, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C02Z extends C03E implements InterfaceC16660sJ {
    public C02Z(Object obj) {
        super(1, obj, C17780uG.class, "serializeMediaInfo", "serializeMediaInfo(Lcom/instagram/feed/seenstate/MainFeedSeenStateMediaInfo;)Ljava/lang/String;", 0);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C17530to c17530to = (C17530to) obj;
        C14360o3.A0B(c17530to, 0);
        StringBuilder sb = new StringBuilder();
        sb.append(c17530to.A05);
        sb.append('|');
        sb.append(c17530to.A01);
        sb.append('|');
        sb.append(c17530to.A00);
        sb.append('|');
        C17640tz c17640tz = c17530to.A02;
        sb.append(c17640tz.A00);
        sb.append('|');
        sb.append(c17640tz.A01);
        sb.append('|');
        sb.append(c17640tz.A02);
        sb.append('|');
        sb.append(c17640tz.A03);
        sb.append('|');
        sb.append(c17530to.A08);
        sb.append('|');
        Object obj2 = c17530to.A03;
        String str = "^";
        if (obj2 == null) {
            obj2 = "^";
        }
        sb.append(obj2);
        sb.append('|');
        String str2 = c17530to.A04;
        if (str2 == null) {
            str2 = "^";
        }
        sb.append(str2);
        sb.append('|');
        String str3 = c17530to.A06;
        if (str3 != null) {
            str = str3;
        }
        sb.append(str);
        return sb.toString();
    }
}
