package X;

import android.content.Context;
import android.media.AudioManager;
import android.view.TextureView;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import java.util.LinkedHashMap;

/* renamed from: X.Ogw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55333Ogw implements AudioManager.OnAudioFocusChangeListener {
    public final C41101vI A00;
    public final C55208OeM A01;
    public final UserSession A02;
    public final CameraSpec A03;
    public final W5s A04;
    public boolean isPlaying;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.XC9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.PzK, java.lang.Object] */
    public C55333Ogw(Context context, TextureView textureView, UserSession userSession, CameraSpec cameraSpec) {
        C14360o3.A0B(textureView, 3);
        this.A02 = userSession;
        this.A03 = cameraSpec;
        this.A00 = new C41101vI(AbstractC50522MSa.A0E(context), userSession);
        W5s A05 = AbstractC86593tX.A05(userSession, C18U.A06(C06090Tz.A05, userSession, 36316018662510465L), false, false, false, false);
        this.A04 = A05;
        C52250NAo c52250NAo = new C52250NAo(textureView, AbstractC53867Nrv.A00(userSession), AbstractC53867Nrv.A00(userSession));
        C23518AbY A00 = AbstractC224689vt.A00(context, null, null, false);
        C50665MYi c50665MYi = new C50665MYi(userSession);
        C68920VeK A0P = AbstractC50522MSa.A0P(A05.A0q ? 1 : 0);
        ?? obj = new Object();
        LinkedHashMap A002 = AbstractC53947NtK.A00("reels_acr_browser", null);
        C55768Opc c55768Opc = C55768Opc.A00;
        this.A01 = new C55208OeM(context, c50665MYi, obj, new Object(), c55768Opc, A0P, null, A00, A05, c52250NAo, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, A002, 59040);
    }

    public final void A00() {
        this.isPlaying = true;
        C55208OeM c55208OeM = this.A01;
        c55208OeM.A06();
        Boolean bool = AbstractC24321Hb.A00(this.A02).A01;
        if (bool != null && !bool.booleanValue()) {
            c55208OeM.A08(0.0f);
            this.A00.A03(this);
        } else {
            this.A00.A04(this);
            c55208OeM.A08(1.0f);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        AbstractC86593tX.A0g(new C55883OrX(this, this, new C50151MDe(this, 20), new B8U(this, 3)), i);
    }
}
