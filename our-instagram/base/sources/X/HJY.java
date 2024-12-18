package X;

import android.content.Context;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes7.dex */
public final class HJY extends AbstractRunnableC14200nk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ JHD A02;
    public final /* synthetic */ C8KO A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HJY(Context context, UserSession userSession, JHD jhd, C8KO c8ko, String str, String str2, String str3) {
        super(91, 3, false, false);
        this.A06 = str;
        this.A03 = c8ko;
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = jhd;
        this.A04 = str2;
        this.A05 = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C8KO c8ko;
        JHD jhd;
        int i;
        C1ON A0N;
        int i2;
        String str2 = this.A06;
        if (str2 != null) {
            c8ko = this.A03;
            UserSession userSession = this.A01;
            jhd = this.A02;
            i = 0;
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0R(C38873H9v.class, C41308IPx.class);
            A0c.A0B("music/original_sound_audio_assets/");
            try {
                AbstractC37303Gc4.A12(AbstractC221915u.A00, A0c, AbstractC37300Gc1.A0O(), str2, "original_media_ids");
            } catch (IOException e) {
                C0f5 AEp = C18950wb.A01.AEp("ReelApiUtil.createOriginalSoundRequestTask", 817902720);
                AEp.ABW(DialogModule.KEY_MESSAGE, "IOException");
                AEp.ERI(e);
                AEp.report();
            }
            A0N = A0c.A0N();
            i2 = 8;
        } else {
            String str3 = this.A04;
            if (str3 != null && (str = this.A05) != null) {
                c8ko = this.A03;
                UserSession userSession2 = this.A01;
                jhd = this.A02;
                i = 0;
                C25621Ms A0c2 = AbstractC167017dG.A0c(userSession2);
                A0c2.A0R(HA5.class, IRP.class);
                A0c2.A0B("music/audio_assets/");
                try {
                    StringWriter A0O = AbstractC37300Gc1.A0O();
                    C222015v c222015v = AbstractC221915u.A00;
                    AbstractC37303Gc4.A12(c222015v, A0c2, A0O, str3, "audio_asset_ids");
                    AbstractC37303Gc4.A12(c222015v, A0c2, AbstractC37300Gc1.A0O(), str, AbstractC111324zv.A00(1955));
                } catch (IOException e2) {
                    C0w9.A06("ReelApiUtil.createAudioAssetsRequestTask", "IOException", e2);
                }
                A0N = A0c2.A0N();
                i2 = 7;
            } else {
                this.A02.DBk();
                return;
            }
        }
        C37484Gf2.A00(A0N, jhd, c8ko, i2);
        C1GK A01 = C1GJ.A01();
        C14360o3.A0B(A01, i);
        A01.schedule(A0N);
    }
}
