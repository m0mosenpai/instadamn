package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.sundial.template.suggestion.ClipsTemplateSuggestionViewModel$setTemplateSuggestionByAudioTrack$1;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.8Jg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185158Jg extends AbstractC52922bZ {
    public final UserSession A00;
    public final InterfaceC09390do A01;
    public final C05A A02;
    public final C0UO A03;

    public C185158Jg(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        C008002u A00 = C10E.A00(C185168Jh.A00);
        this.A02 = A00;
        this.A03 = A00;
        this.A01 = AbstractC09440dt.A01(new C9ES(this, 37));
    }

    public final void A00(MusicAssetModel musicAssetModel, boolean z) {
        String str;
        C05A c05a = this.A02;
        c05a.Egh(C185168Jh.A00);
        String str2 = musicAssetModel.A0B;
        if (str2 != null && !AbstractC001900j.A0T(str2)) {
            str = musicAssetModel.A0B;
        } else {
            str = musicAssetModel.A0E;
        }
        if (str != null && !AbstractC001900j.A0T(str)) {
            ImageUrl imageUrl = musicAssetModel.A03;
            C141796aw A00 = AbstractC141776au.A00(this);
            ClipsTemplateSuggestionViewModel$setTemplateSuggestionByAudioTrack$1 clipsTemplateSuggestionViewModel$setTemplateSuggestionByAudioTrack$1 = new ClipsTemplateSuggestionViewModel$setTemplateSuggestionByAudioTrack$1(imageUrl, this, str, null, z);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, clipsTemplateSuggestionViewModel$setTemplateSuggestionByAudioTrack$1, A00);
            return;
        }
        c05a.Egh(C185238Jo.A00);
    }
}
