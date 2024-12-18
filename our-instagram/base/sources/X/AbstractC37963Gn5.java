package X;

import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.OriginalSoundConsumptionInfo;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Gn5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37963Gn5 {
    public static final C37964Gn6 A01(MusicAssetModel musicAssetModel) {
        C14360o3.A0B(musicAssetModel, 0);
        boolean z = musicAssetModel.A0L;
        String str = musicAssetModel.A0A;
        String str2 = musicAssetModel.A0B;
        SimpleImageUrl A0t = AbstractC25225BEi.A0t(musicAssetModel.A03.getUrl());
        SimpleImageUrl A0t2 = AbstractC25225BEi.A0t(musicAssetModel.A02.getUrl());
        String str3 = musicAssetModel.A0C;
        String str4 = musicAssetModel.A0D;
        int i = musicAssetModel.A00;
        boolean z2 = musicAssetModel.A0O;
        List list = musicAssetModel.A0J;
        String str5 = musicAssetModel.A0E;
        C14360o3.A07(str5);
        boolean z3 = musicAssetModel.A0S;
        String str6 = musicAssetModel.A0H;
        String str7 = musicAssetModel.A0I;
        boolean z4 = musicAssetModel.A0Q;
        boolean z5 = musicAssetModel.A0R;
        return new C37964Gn6(new TrackDataImpl(null, A0t, A0t2, Boolean.valueOf(z2), Boolean.valueOf(z4), Boolean.valueOf(z5), Integer.valueOf(i), str, null, str2, null, str3, str4, null, str5, null, str6, null, null, null, str7, null, list, z, z3));
    }

    public static final JIN A00(MusicAssetModel musicAssetModel) {
        JIN A01;
        if (musicAssetModel.A0U && musicAssetModel.A0G != null && musicAssetModel.A0C != null) {
            A01 = A02(musicAssetModel);
        } else {
            A01 = A01(musicAssetModel);
        }
        return A01;
    }

    public static final C42733IvT A02(MusicAssetModel musicAssetModel) {
        User user = new User("", musicAssetModel.A0D);
        user.A0i(musicAssetModel.A02);
        OriginalSoundConsumptionInfo originalSoundConsumptionInfo = new OriginalSoundConsumptionInfo(null, null, "", musicAssetModel.A0P, false);
        String str = musicAssetModel.A0E;
        ArrayList A10 = AbstractC31174DnI.A10(str);
        ArrayList A1E = AbstractC166987dD.A1E();
        String str2 = musicAssetModel.A0C;
        if (str2 != null) {
            int i = musicAssetModel.A00;
            Boolean bool = musicAssetModel.A07;
            C14360o3.A07(bool);
            boolean booleanValue = bool.booleanValue();
            boolean z = musicAssetModel.A0S;
            OriginalAudioSubtype originalAudioSubtype = OriginalAudioSubtype.A07;
            String str3 = musicAssetModel.A0I;
            C14360o3.A07(str3);
            String str4 = musicAssetModel.A0G;
            if (str4 != null) {
                String str5 = musicAssetModel.A0H;
                C14360o3.A07(str5);
                boolean z2 = musicAssetModel.A0Q;
                boolean z3 = musicAssetModel.A0R;
                return new C42733IvT(new OriginalSoundData(originalAudioSubtype, originalSoundConsumptionInfo, null, user, null, null, Boolean.valueOf(z2), Boolean.valueOf(z3), false, false, false, null, null, Integer.valueOf(i), null, null, null, null, str, str2, null, null, str3, str4, str5, null, A10, A1E, false, false, booleanValue, z, false));
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
