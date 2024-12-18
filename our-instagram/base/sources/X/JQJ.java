package X;

/* loaded from: classes8.dex */
public final class JQJ extends C03E implements InterfaceC16660sJ {
    public final int A00 = 1;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JQJ(C72053Ld c72053Ld) {
        super(1, C0o2.class, "badgeToRule", "logAppIconBadgeAccuracy$badgeToRule$8(Lcom/instagram/notifications/badging/intf/BadgingLoggingContext;Lcom/instagram/notifications/badging/model/Badge;)Lcom/facebook/analytics/structuredlogger/enums/IGBadgeRenderingRule;", 0);
        this.A01 = c72053Ld;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                float[] fArr = ((C5AJ) obj).A00;
                InterfaceC1131459c interfaceC1131459c = (InterfaceC1131459c) ((BXK) ((InterfaceC30781DgI) this.A01)).A03.getValue();
                if (interfaceC1131459c != null && interfaceC1131459c.CQ7()) {
                    interfaceC1131459c.F8S(fArr);
                }
                return C0eB.A00;
            case 1:
                C54432ex c54432ex = (C54432ex) obj;
                C14360o3.A0B(c54432ex, 0);
                Object obj2 = this.A01;
                if (c54432ex.A01 + c54432ex.A00 > 0) {
                    if (C14360o3.A0K(c54432ex.A03, obj2)) {
                        return EnumC126815oL.INDIVIDUAL_ORDERING_0;
                    }
                    return EnumC126815oL.GROUP;
                }
                break;
            default:
                C54432ex c54432ex2 = (C54432ex) obj;
                C14360o3.A0B(c54432ex2, 0);
                C72053Ld c72053Ld = (C72053Ld) this.A01;
                if (c54432ex2.A01 + c54432ex2.A00 > 0) {
                    if (c72053Ld.A00 == EnumC58122lU.A05) {
                        return EnumC126815oL.NUMBER;
                    }
                    return EnumC126815oL.DOT;
                }
                break;
        }
        return EnumC126815oL.NO_INVENTORY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JQJ(InterfaceC54232eZ interfaceC54232eZ) {
        super(1, C0o2.class, "badgeToRule", "logAccountSwitcherBadgingAccuracy$badgeToRule$7(Lcom/instagram/notifications/badging/constants/BadgeUseCase;Lcom/instagram/notifications/badging/model/Badge;)Lcom/facebook/analytics/structuredlogger/enums/IGBadgeRenderingRule;", 0);
        this.A01 = interfaceC54232eZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JQJ(InterfaceC30781DgI interfaceC30781DgI) {
        super(1, C0o2.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.A01 = interfaceC30781DgI;
    }
}
