package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.BuD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26910BuD extends AbstractC193068gm {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C26910BuD(Context context, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2) {
        this.A03 = userSession;
        this.A01 = abstractC59962oe;
        this.A00 = context;
        this.A02 = interfaceC11380iw;
        this.A04 = str;
        this.A05 = str2;
    }

    @Override // X.AbstractC192848gQ
    public final void A03(AbstractC115105If abstractC115105If) {
        AbstractC27627CGy.A00(this.A02, this.A03, this.A04, this.A05, "ai_theme_preview_screen", true);
        C9GR.A07(this.A00, 2131957028);
    }

    @Override // X.AbstractC192848gQ
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        C66246U5q c66246U5q = (C66246U5q) obj;
        C14360o3.A0B(c66246U5q, 0);
        AbstractC33787EwD.A00(C62862tP.A03(this.A01, this.A03, null), c66246U5q);
        C9GR.A01(this.A00, null, 2131957028, 0);
    }
}
