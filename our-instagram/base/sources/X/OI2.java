package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes9.dex */
public final class OI2 {
    public final C47Z A00;
    public final InterfaceC70363Du A01;

    public final void A00(String str, Throwable th) {
        Map A07;
        InterfaceC70363Du interfaceC70363Du = this.A01;
        C47Z c47z = this.A00;
        C70353Dt c70353Dt = (C70353Dt) interfaceC70363Du;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c70353Dt.A01, "ig_media_upload_cancel");
        if (A0f.isSampled()) {
            Context context = c70353Dt.A00;
            UserSession userSession = c70353Dt.A02;
            C50703MZy c50703MZy = new C50703MZy(context, userSession, c47z);
            MSZ.A1G(A0f, c50703MZy.A02);
            C50704MZz.A05(A0f, c50703MZy, "connection", AbstractC15820qc.A08(((C50704MZz) c50703MZy).A00));
            C50704MZz.A02(A0f, userSession, c47z, c50703MZy);
            A0f.AAP("target_surface", C50702MZx.A03(userSession, c47z, null, true));
            A0f.AAP("ingest_type", c50703MZy.A0I());
            C50704MZz.A03(A0f, c50703MZy);
            A0f.A9K("duration_ms", c50703MZy.A08());
            A0f.A9K("file_size_bytes", c50703MZy.A09());
            C50704MZz.A04(A0f, c50703MZy, c50703MZy.A0E(), "original_file_size_bytes");
            A0f.A9K("original_media_height", c50703MZy.A0F());
            A0f.A9K("original_media_width", c50703MZy.A0G());
            A0f.AAP("reason", str);
            A0f.AAP("error_message", str);
            A0f.A9M("exception_data", AbstractC54088Nvm.A00(th));
            if (c47z.A5D) {
                A07 = null;
            } else {
                A07 = c50703MZy.A07();
            }
            AbstractC50522MSa.A1F(A0f, A07);
            if (c47z.A5p) {
                A0f.A7v("is_video_variant", true);
            }
            A0f.Cht();
        }
        if (th != null) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append(c47z.A1G);
            c70353Dt.Ckw(null, c47z, AbstractC166997dE.A0x("_UPLOAD_CANCEL", A1C), "", th);
        }
        c70353Dt.Cl0(c47z, "ig_media_upload_cancel", null);
    }

    public OI2(C47Z c47z, InterfaceC70363Du interfaceC70363Du) {
        this.A00 = c47z;
        this.A01 = interfaceC70363Du;
    }
}
