package X;

import com.instagram.api.schemas.AudioMutingInfoIntf;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Vo9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C69486Vo9 {
    public AudioMutingInfoIntf A00;
    public MusicMuteAudioReason A01;
    public User A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public List A0H;
    public List A0I;
    public boolean A0J;
    public final MusicConsumptionModel A0K;

    public C69486Vo9(MusicConsumptionModel musicConsumptionModel) {
        this.A0K = musicConsumptionModel;
        this.A03 = musicConsumptionModel.AbG();
        this.A09 = musicConsumptionModel.Adg();
        this.A0H = musicConsumptionModel.Ado();
        this.A00 = musicConsumptionModel.Adu();
        this.A04 = musicConsumptionModel.Aql();
        this.A0D = musicConsumptionModel.getDerivedContentId();
        this.A0I = musicConsumptionModel.AyW();
        this.A0E = musicConsumptionModel.getFormattedClipsMediaCount();
        this.A02 = musicConsumptionModel.BFU();
        this.A05 = musicConsumptionModel.CQj();
        this.A06 = musicConsumptionModel.Cer();
        this.A0A = musicConsumptionModel.BaR();
        this.A0F = musicConsumptionModel.getPlaceholderProfilePicUrl();
        this.A0B = musicConsumptionModel.Bg7();
        this.A07 = musicConsumptionModel.Buu();
        this.A0J = musicConsumptionModel.getShouldMuteAudio();
        this.A0G = musicConsumptionModel.getShouldMuteAudioReason();
        this.A01 = musicConsumptionModel.BvC();
        this.A08 = musicConsumptionModel.BvQ();
        this.A0C = musicConsumptionModel.CAx();
    }
}
