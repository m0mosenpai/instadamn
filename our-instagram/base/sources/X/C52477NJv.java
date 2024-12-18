package X;

import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.NJv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52477NJv extends OX6 {
    public C47Z A00;
    public final UserSession A01;
    public final AbstractC55082Oac A02;
    public final String A03;
    public final InterfaceC19390xP A04;
    public final C05A A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52477NJv(UserSession userSession, AbstractC55082Oac abstractC55082Oac, String str) {
        super(abstractC55082Oac);
        AbstractC25233BEq.A0v(1, abstractC55082Oac, userSession, str);
        this.A02 = abstractC55082Oac;
        this.A01 = userSession;
        this.A03 = str;
        C008002u A1H = AbstractC25225BEi.A1H(new C51756Mtf((MediaGenAIDetectionMethod) null, (DefaultConstructorMarker) null, 1, 47));
        this.A05 = A1H;
        this.A04 = A1H;
    }
}
