package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import java.io.StringWriter;

/* renamed from: X.Phe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57628Phe extends C0YY implements InterfaceC16660sJ {
    public static final C57628Phe A00 = new C57628Phe();

    public C57628Phe() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) obj;
        StringWriter A0f = MSZ.A0f(audioOverlayTrack);
        C17z A0O = MSW.A0O(A0f);
        AbstractC37894Glp.A00(A0O, audioOverlayTrack);
        return MSY.A0e(A0O, A0f);
    }
}
