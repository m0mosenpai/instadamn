package X;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.StoryMusicPickTappableData;
import com.instagram.api.schemas.StoryPromptDisablementState;
import com.instagram.api.schemas.TrackData;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.reels.musicpick.model.MusicPickReelTag;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6iG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146176iG {
    public C22P A00;
    public MusicPickReelTag A01;
    public MusicPickStickerModel A02;
    public String A03;
    public boolean A04;
    public final FragmentActivity A05;
    public final UserSession A06;
    public final C146196iI A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final HandlerC25861Nt A0A;
    public final Runnable A0B;
    public final InterfaceC16820sZ A0C;

    /* JADX WARN: Type inference failed for: r0v8, types: [X.6iI] */
    public C146176iG(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(userSession, 2);
        this.A05 = fragmentActivity;
        this.A06 = userSession;
        this.A0C = interfaceC16820sZ;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            this.A0A = new HandlerC25861Nt(myLooper);
            this.A0B = new Runnable() { // from class: X.6iH
                @Override // java.lang.Runnable
                public final void run() {
                    C146176iG c146176iG = C146176iG.this;
                    if (!c146176iG.A04) {
                        C146176iG.A00(c146176iG);
                    }
                }
            };
            this.A08 = C1XM.A00(new C9E4(this, 20));
            this.A09 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9E4(this, 21));
            this.A07 = new C2AH() { // from class: X.6iI
                @Override // X.C2AH
                public final void onFail(Exception exc) {
                    C146176iG.A00(C146176iG.this);
                }

                @Override // X.C2AH
                public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    String str;
                    File file = (File) obj;
                    C14360o3.A0B(file, 0);
                    C146176iG c146176iG = C146176iG.this;
                    c146176iG.A03 = file.getAbsolutePath();
                    ((Dialog) c146176iG.A09.getValue()).dismiss();
                    UserSession userSession2 = c146176iG.A06;
                    Bundle bundle = new Bundle();
                    bundle.putString("arg_music_pick_template_file_path", c146176iG.A03);
                    C22P c22p = c146176iG.A00;
                    if (c22p == null) {
                        str = "cameraEntryPoint";
                    } else {
                        bundle.putSerializable("arg_music_pick_camera_entry_point", c22p);
                        MusicPickStickerModel musicPickStickerModel = c146176iG.A02;
                        if (musicPickStickerModel == null) {
                            str = "musicPickStickerModel";
                        } else {
                            MusicPickStickerModel A00 = musicPickStickerModel.A00();
                            ArrayList A1N = AbstractC16960so.A1N(C17060sy.A01.A01(userSession2));
                            A1N.addAll(A00.A00.A09);
                            StoryMusicPickTappableData storyMusicPickTappableData = A00.A00;
                            TrackData trackData = storyMusicPickTappableData.A04;
                            String str2 = storyMusicPickTappableData.A05;
                            StoryPromptDisablementState storyPromptDisablementState = storyMusicPickTappableData.A02;
                            String str3 = storyMusicPickTappableData.A06;
                            String str4 = storyMusicPickTappableData.A07;
                            OriginalSoundData originalSoundData = storyMusicPickTappableData.A01;
                            int i = storyMusicPickTappableData.A00;
                            StoryMusicPickTappableData A002 = AbstractC40302Hu6.A00(originalSoundData, storyPromptDisablementState, storyMusicPickTappableData.A03, trackData, str2, str3, str4, storyMusicPickTappableData.A08, A1N, i);
                            A00.A00 = A002;
                            int i2 = A002.A00 + 1;
                            TrackData trackData2 = A002.A04;
                            String str5 = A002.A05;
                            StoryPromptDisablementState storyPromptDisablementState2 = A002.A02;
                            List list = A002.A09;
                            String str6 = A002.A06;
                            String str7 = A002.A07;
                            A00.A00 = AbstractC40302Hu6.A00(A002.A01, storyPromptDisablementState2, A002.A03, trackData2, str5, str6, str7, A002.A08, list, i2);
                            bundle.putParcelable("arg_music_pick_model", A00);
                            MusicPickReelTag musicPickReelTag = c146176iG.A01;
                            if (musicPickReelTag == null) {
                                str = "reelTag";
                            } else {
                                bundle.putParcelable("arg_music_pick_reel_tag", musicPickReelTag);
                                c146176iG.A03 = null;
                                FragmentActivity fragmentActivity2 = c146176iG.A05;
                                C6XJ.A02(fragmentActivity2, bundle, userSession2, TransparentModalActivity.class, "reel_music_pick_participation").A0C(fragmentActivity2);
                                return;
                            }
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            };
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A01(C22P c22p, MusicPickReelTag musicPickReelTag, MusicPickStickerModel musicPickStickerModel) {
        String str;
        C14360o3.A0B(musicPickStickerModel, 0);
        this.A03 = null;
        this.A02 = musicPickStickerModel;
        this.A01 = musicPickReelTag;
        this.A00 = c22p;
        this.A04 = false;
        C0fJ.A00((Dialog) this.A09.getValue());
        this.A0A.postDelayed(this.A0B, TimeUnit.SECONDS.toMillis(30L));
        MusicPickStickerModel musicPickStickerModel2 = this.A02;
        if (musicPickStickerModel2 == null) {
            C14360o3.A0F("musicPickStickerModel");
            throw C00O.createAndThrow();
        }
        ImageInfo imageInfo = musicPickStickerModel2.A00.A03.A01;
        if (imageInfo != null) {
            FragmentActivity fragmentActivity = this.A05;
            ExtendedImageUrl A04 = AbstractC40161tk.A04(imageInfo, C05F.A01, Math.min(AbstractC13890nF.A01(fragmentActivity), 1080));
            if (A04 != null && (str = A04.A0A) != null) {
                C121275eQ A03 = AbstractC50633MWu.A03(fragmentActivity, this.A06, new OUQ(str, "music_pick_share", false, false, false));
                A03.A00 = this.A07;
                C1GJ.A04(A03, 622413651);
                return;
            }
        }
        A00(this);
    }

    public static final void A00(C146176iG c146176iG) {
        ((Dialog) c146176iG.A09.getValue()).dismiss();
        if (!c146176iG.A04) {
            c146176iG.A04 = true;
            c146176iG.A03 = null;
        }
        InterfaceC16820sZ interfaceC16820sZ = c146176iG.A0C;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
    }
}
