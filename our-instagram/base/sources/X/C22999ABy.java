package X;

import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ABy, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22999ABy {
    public int A00;
    public ImageUrl A02;
    public ImageUrl A03;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public ArrayList A0D;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public OriginalAudioSubtype A01 = OriginalAudioSubtype.A05;
    public List A0E = AbstractC166987dD.A1E();
    public Boolean A04 = AbstractC166997dE.A0a();

    public final MusicAssetModel A00() {
        MusicAssetModel musicAssetModel = new MusicAssetModel();
        musicAssetModel.A0E = this.A09;
        musicAssetModel.A0B = this.A06;
        musicAssetModel.A0H = this.A0B;
        musicAssetModel.A0C = this.A07;
        musicAssetModel.A0J = this.A0D;
        musicAssetModel.A0I = this.A0C;
        musicAssetModel.A0D = this.A08;
        musicAssetModel.A0A = this.A05;
        musicAssetModel.A02 = this.A02;
        musicAssetModel.A03 = this.A03;
        musicAssetModel.A00 = this.A00;
        musicAssetModel.A0S = this.A0G;
        musicAssetModel.A0Q = false;
        musicAssetModel.A0R = false;
        musicAssetModel.A0O = this.A0F;
        musicAssetModel.A0U = this.A0I;
        musicAssetModel.A0G = null;
        musicAssetModel.A09 = null;
        musicAssetModel.A0M = false;
        musicAssetModel.A0N = false;
        musicAssetModel.A0T = this.A0H;
        musicAssetModel.A0F = this.A0A;
        musicAssetModel.A01 = this.A01;
        musicAssetModel.A0K = this.A0E;
        musicAssetModel.A07 = this.A04;
        MusicAssetModel.A04(musicAssetModel);
        return musicAssetModel;
    }
}
