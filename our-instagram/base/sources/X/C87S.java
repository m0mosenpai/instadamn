package X;

import android.content.Context;
import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.87S, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C87S extends AbstractC61132qb {
    public final Context A00;
    public final C87R A01;
    public final AnonymousClass858 A02;
    public final UserSession A03;
    public final String A04;
    public final List A05;
    public final boolean A06;

    public C87S(Context context, C87R c87r, AnonymousClass858 anonymousClass858, UserSession userSession, String str, List list, boolean z) {
        C14360o3.A0B(anonymousClass858, 2);
        this.A03 = userSession;
        this.A02 = anonymousClass858;
        this.A00 = context;
        this.A05 = list;
        this.A04 = str;
        this.A01 = c87r;
        this.A06 = z;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A03;
        Context context = this.A00;
        MiniGalleryService miniGalleryService = new MiniGalleryService(context, AbstractC142256bi.A00(context, userSession), userSession);
        AnonymousClass858 anonymousClass858 = this.A02;
        C142246bh A00 = AbstractC149796oY.A00(context, userSession);
        List list = this.A05;
        return new C87T(this.A01, miniGalleryService, anonymousClass858, A00, userSession, this.A04, list, this.A06);
    }
}
