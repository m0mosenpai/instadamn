package X;

import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService;
import com.instagram.common.session.UserSession;

/* renamed from: X.KGo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45600KGo extends AbstractC61132qb {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    public C45600KGo(MiniGalleryService miniGalleryService, C87T c87t, UserSession userSession, String str, String str2, int i) {
        this.A00 = i;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = userSession;
        this.A01 = miniGalleryService;
        this.A02 = c87t;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        if (this.A00 != 0) {
            String str = this.A04;
            String str2 = this.A05;
            return new C44545Jmp((MiniGalleryService) this.A01, (C87T) this.A02, (UserSession) this.A03, str, str2);
        }
        String str3 = this.A04;
        return new C44542Jmm((MiniGalleryService) this.A01, (C87T) this.A02, (UserSession) this.A03, str3);
    }
}
