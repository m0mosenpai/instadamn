package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.recipientpicker.GroupProfileStoryRecipient;

/* renamed from: X.9fz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215239fz extends C2US {
    public EnumC222989sd A00;
    public final UserSession A01;
    public final ER7 A02;
    public final ER8 A03;
    public final KEV A04;
    public final KES A05;
    public final ER9 A06;
    public final KEP A07;
    public final C52208N8x A08;
    public final EQY A09;
    public final C52209N8y A0A;
    public final N94 A0B;
    public final C168737g7 A0C;
    public final GroupProfileStoryRecipient A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C215239fz(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, GroupProfileStoryRecipient groupProfileStoryRecipient, C24042Ale c24042Ale, EnumC222989sd enumC222989sd, C8DP c8dp, C195918ld c195918ld) {
        super(false);
        C14360o3.A0B(userSession, 2);
        this.A01 = userSession;
        this.A00 = enumC222989sd;
        this.A0D = groupProfileStoryRecipient;
        N94 n94 = new N94(abstractC59962oe, userSession, c24042Ale, c195918ld);
        this.A0B = n94;
        KEV kev = new KEV(userSession, c24042Ale, c8dp, c195918ld);
        this.A04 = kev;
        ER8 er8 = new ER8(userSession, c24042Ale);
        this.A03 = er8;
        C52209N8y c52209N8y = new C52209N8y(userSession, c24042Ale);
        this.A0A = c52209N8y;
        ER7 er7 = new ER7(userSession, c24042Ale);
        this.A02 = er7;
        ER9 er9 = new ER9(userSession, c24042Ale);
        this.A06 = er9;
        EQY eqy = new EQY(c24042Ale);
        this.A09 = eqy;
        KES kes = new KES(userSession, c24042Ale);
        this.A05 = kes;
        KEP kep = new KEP(c24042Ale);
        this.A07 = kep;
        C52208N8x c52208N8x = new C52208N8x(abstractC59962oe, c24042Ale);
        this.A08 = c52208N8x;
        C168737g7 c168737g7 = new C168737g7(context);
        this.A0C = c168737g7;
        init(n94, kev, er8, c52209N8y, eqy, kes, kep, er7, er9, c52208N8x, c168737g7);
    }
}
