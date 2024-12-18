package X;

/* renamed from: X.MCp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C50139MCp extends C03E implements InterfaceC16660sJ {
    public static final C50139MCp A00 = new C50139MCp();

    public C50139MCp() {
        super(1, C0o2.class, "badgeToRule", "logDirectBadgingAccuracy$badgeToRule(Lcom/instagram/notifications/badging/model/Badge;)Lcom/facebook/analytics/structuredlogger/enums/IGBadgeRenderingRule;", 0);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C54432ex c54432ex = (C54432ex) obj;
        C14360o3.A0B(c54432ex, 0);
        if (c54432ex.A01 + c54432ex.A00 > 0) {
            return EnumC126815oL.NUMBER;
        }
        return EnumC126815oL.NO_INVENTORY;
    }
}
