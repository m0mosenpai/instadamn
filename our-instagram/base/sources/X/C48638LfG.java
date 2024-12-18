package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.Map;

/* renamed from: X.LfG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48638LfG implements InterfaceC58042PoS {
    public C189478aR A00;
    public final Activity A01;
    public final Context A02;
    public final C49523Luc A03 = new C49523Luc(this, 4);
    public final UserSession A04;
    public final C8BK A05;
    public final String A06;
    public final OBM A07;

    @Override // X.InterfaceC58042PoS
    public final void Eo2(EnumC46263Kdv enumC46263Kdv, EnumC203578zI enumC203578zI, AudioOverlayTrack audioOverlayTrack, Integer num, String str, Map map) {
        C14360o3.A0B(num, 1);
        if (audioOverlayTrack == null) {
            UserSession userSession = this.A04;
            JQ1.A0k(userSession, num);
            if (this.A00 == null) {
                EnumC1810381f enumC1810381f = EnumC1810381f.A05;
                String BVY = this.A05.BVY();
                C52166N6v A01 = OPX.A01(null, AbstractC43594JPz.A0M(), MusicProduct.A07, userSession, null, enumC1810381f, BVY, null);
                A01.A05 = this.A03;
                C189448aO A0X = AbstractC31177DnL.A0X(userSession, true);
                A0X.A03 = 1.0f;
                Context context = this.A02;
                A0X.A06 = context.getColor(AbstractC53242c7.A0D(context));
                A0X.A0T = A01;
                this.A00 = A0X.A00().A02(this.A01, A01);
            }
        } else {
            String str2 = this.A06;
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putParcelable("args_audio_track", audioOverlayTrack);
            A0b.putString("args_media_id", str2);
            A0b.putBoolean("args_has_existing_snippet_selection", true);
            UserSession userSession2 = this.A04;
            Activity activity = this.A01;
            AbstractC31174DnI.A0a(activity, A0b, userSession2, ModalActivity.class, AbstractC111324zv.A00(803)).A0A(activity, 1004);
        }
        OBM obm = this.A07;
        C25531Mh A08 = C25531Mh.A08(obm.A01);
        if (AbstractC25226BEj.A1Z(A08)) {
            A08.A0a(EnumC114925Hg.CLIPS);
            A08.A0q("SHARE_SHEET_REPLACE_AUDIO");
            A08.A0b(C22P.A5N);
            A08.A0T();
            A08.A0U();
            A08.A0R("camera_session_id", obm.A02);
            A08.A0m(obm.A00.getModuleName());
            AbstractC167017dG.A1D(A08);
        }
    }

    @Override // X.InterfaceC58042PoS
    public final void dismiss() {
        C189478aR c189478aR = this.A00;
        if (c189478aR != null) {
            c189478aR.A07();
        }
        this.A00 = null;
    }

    public C48638LfG(Activity activity, Context context, UserSession userSession, C8BK c8bk, OBM obm, String str) {
        this.A02 = context;
        this.A01 = activity;
        this.A04 = userSession;
        this.A06 = str;
        this.A07 = obm;
        this.A05 = c8bk;
    }
}
