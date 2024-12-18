package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* loaded from: classes7.dex */
public abstract class INZ {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, MusicOverlayStickerModel musicOverlayStickerModel, String str, String str2) {
        long j;
        double d;
        Long A0j;
        AbstractC167017dG.A1P(userSession, str);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_organic_interact_bottom_sheet_action");
        Long l = null;
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1C(A0f, str2);
            C0Zx c0Zx = new C0Zx();
            String str3 = musicOverlayStickerModel.A0S;
            if (str3 != null && (A0j = AbstractC166997dE.A0j(str3)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            c0Zx.A05("audio_asset_id", Long.valueOf(j));
            Integer num = musicOverlayStickerModel.A0O;
            if (num != null) {
                d = num.intValue();
            } else {
                d = 0.0d;
            }
            c0Zx.A04("length", Double.valueOf(d));
            c0Zx.A06("song_name", musicOverlayStickerModel.A0m);
            c0Zx.A06("artist_name", musicOverlayStickerModel.A0Y);
            Integer num2 = musicOverlayStickerModel.A0K;
            if (num2 != null) {
                l = AbstractC25229BEm.A0n(num2);
            }
            c0Zx.A05(TraceFieldType.StartTime, l);
            A0f.AAQ(c0Zx, "extra_data");
            AbstractC25225BEi.A1O(A0f, str);
            A0f.Cht();
        }
    }

    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, MusicOverlayStickerModel musicOverlayStickerModel, String str, String str2, String str3, String str4) {
        Long l;
        String str5;
        String str6;
        Long l2;
        Integer num;
        Integer num2;
        String str7;
        AbstractC167017dG.A1P(userSession, str);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_organic_interact_bottom_sheet_nav");
        Long l3 = null;
        if (A0f.isSampled()) {
            A0f.AAP("navigate_to", str2);
            AbstractC25225BEi.A1O(A0f, str);
            AbstractC37300Gc1.A0l(A0f, str3);
            C0Zx c0Zx = new C0Zx();
            c0Zx.A06("format", str4);
            if (musicOverlayStickerModel != null && (str7 = musicOverlayStickerModel.A0S) != null) {
                l = AbstractC166997dE.A0j(str7);
            } else {
                l = null;
            }
            c0Zx.A05("audio_asset_id", l);
            if (musicOverlayStickerModel != null) {
                str5 = musicOverlayStickerModel.A0m;
            } else {
                str5 = null;
            }
            c0Zx.A06("song_name", str5);
            if (musicOverlayStickerModel != null) {
                str6 = musicOverlayStickerModel.A0Y;
            } else {
                str6 = null;
            }
            c0Zx.A06("artist_name", str6);
            if (musicOverlayStickerModel != null && (num2 = musicOverlayStickerModel.A0K) != null) {
                l2 = AbstractC25229BEm.A0n(num2);
            } else {
                l2 = null;
            }
            c0Zx.A05(TraceFieldType.StartTime, l2);
            if (musicOverlayStickerModel != null && (num = musicOverlayStickerModel.A0O) != null) {
                l3 = AbstractC25229BEm.A0n(num);
            }
            c0Zx.A05("length", l3);
            A0f.AAQ(c0Zx, "extra_data");
            A0f.Cht();
        }
    }
}
