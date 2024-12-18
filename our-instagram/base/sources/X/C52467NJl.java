package X;

import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.NJl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52467NJl extends OX6 {
    public final C52458NJc A00;
    public final C05A A01;
    public final C0UO A02;
    public final UserSession A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52467NJl(UserSession userSession, C52458NJc c52458NJc) {
        super(c52458NJc);
        AbstractC167007dF.A1D(userSession, 1, c52458NJc);
        this.A03 = userSession;
        this.A00 = c52458NJc;
        C008002u A1H = AbstractC25225BEi.A1H(new C51756Mtf((AudioOverlayTrack) null, (DefaultConstructorMarker) null, 1, 43));
        this.A01 = A1H;
        this.A02 = A1H;
    }
}
