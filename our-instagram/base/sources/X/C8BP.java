package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewConfiguration;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.common.model.MusicSearchPlaylistType;
import com.instagram.music.common.model.TrackSnippet;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.8BP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8BP {
    public C8BJ A00;
    public C189478aR A01;
    public AudioOverlayTrack A02;
    public AudioOverlayTrack A03;
    public MusicBrowseCategory A04;
    public AnonymousClass879 A05;
    public EnumC1810381f A06;
    public C09530e4 A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final Context A0B;
    public final AbstractC59962oe A0C;
    public final UserSession A0D;
    public final AnonymousClass874 A0E;
    public final InterfaceC1818984z A0F;
    public final C8BU A0G;
    public final C8BM A0H;
    public final C8BK A0I;
    public final C8BF A0J;
    public final ClipsCreationViewModel A0K;
    public final C8BO A0L;
    public final boolean A0M;
    public final int A0N;
    public final ImmutableList A0O;
    public final MusicProduct A0P;
    public final TargetViewSizeProvider A0Q;
    public final C8BS A0R;
    public final C8BG A0S;
    public final C87H A0T;
    public final MusicAttributionConfig A0U;
    public final C8BR A0V;
    public final String A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;

    public final void A0A(AudioOverlayTrack audioOverlayTrack, MusicOverlaySearchTab musicOverlaySearchTab, boolean z, boolean z2) {
        A09(audioOverlayTrack, null, musicOverlaySearchTab, null, z, z2);
    }

    public final void A0B(JIN jin, MusicBrowseCategory musicBrowseCategory) {
        String str;
        MusicSearchPlaylistType musicSearchPlaylistType;
        MusicAssetModel A02 = MusicAssetModel.A02(jin);
        C8BG c8bg = this.A0S;
        UserSession userSession = this.A0D;
        C14360o3.A0A(A02);
        C8BH c8bh = c8bg.A01;
        String str2 = A02.A0B;
        if (A02.A0U) {
            str = A02.A0E;
        } else {
            str = null;
        }
        AbstractC58232lf.A00(AbstractC141776au.A00(c8bg).A00, new B48(new AnonymousClass058(new C50117MBd(userSession, c8bh, str2, null, str, null)))).A06(this.A0C, new C24998B3u(new C57747Pja(A02, 33)));
        if (this.A0M) {
            List list = A02.A0J;
            int i = A02.A00;
            ClipsCreationViewModel clipsCreationViewModel = this.A0K;
            int A00 = AbstractC54061NvL.A00(i, clipsCreationViewModel.A0E(), list);
            int i2 = A02.A00;
            int A0E = clipsCreationViewModel.A0E();
            if (i2 > A0E) {
                i2 = A0E;
            }
            AudioOverlayTrack audioOverlayTrack = new AudioOverlayTrack(A02, A00, i2);
            audioOverlayTrack.A09 = musicBrowseCategory;
            audioOverlayTrack.A04 = 0;
            audioOverlayTrack.A01 = ClipsCreationViewModel.A00(clipsCreationViewModel).A00;
            if (musicBrowseCategory != null) {
                musicSearchPlaylistType = musicBrowseCategory.A01;
            } else {
                musicSearchPlaylistType = null;
            }
            if (musicSearchPlaylistType == MusicSearchPlaylistType.A06) {
                audioOverlayTrack.A07 = InstagramAudioApplySource.A07;
            }
            this.A0I.Due(audioOverlayTrack);
            A04(this);
            return;
        }
        this.A0K.A05 = C05F.A01;
        A07(this, null, A02, null, null, null, 1.0f, 0, false, true, false, false);
    }

    public static final C189448aO A00(C8BP c8bp, C52166N6v c52166N6v) {
        boolean z;
        C189448aO c189448aO = new C189448aO(c8bp.A0D);
        c189448aO.A0a = true;
        c189448aO.A06 = c8bp.A0N;
        c189448aO.A0U = new C24104Amp(c8bp);
        c189448aO.A0T = c52166N6v;
        if (c8bp.A06 == EnumC1810381f.A02 && c8bp.A0Y) {
            c189448aO.A03 = 0.6f;
            c189448aO.A1E = true;
            z = false;
        } else {
            c189448aO.A03 = 1.0f;
            z = c8bp.A0Z;
        }
        c189448aO.A1O = z;
        return c189448aO;
    }

    public static final C189448aO A01(C8BP c8bp, C51D c51d) {
        C189448aO c189448aO = new C189448aO(c8bp.A0D);
        c189448aO.A0a = true;
        c189448aO.A19 = true;
        c189448aO.A1E = true;
        c189448aO.A06 = c8bp.A0N;
        c189448aO.A1O = c8bp.A0Z;
        c189448aO.A0U = new C24104Amp(c8bp);
        c189448aO.A0T = c51d;
        return c189448aO;
    }

    public static final AudioOverlayTrack A02(C8BP c8bp, EnumC185288Jt enumC185288Jt, MusicAssetModel musicAssetModel, TrackSnippet trackSnippet) {
        AudioOverlayTrack audioOverlayTrack;
        MusicSearchPlaylistType musicSearchPlaylistType;
        String str;
        C09530e4 c09530e4 = c8bp.A07;
        int i = trackSnippet.A01;
        if (c09530e4 != null) {
            int i2 = musicAssetModel.A00;
            int A0E = c8bp.A0K.A0E();
            if (i2 > A0E) {
                i2 = A0E;
            }
            int intValue = ((Number) c09530e4.A00).intValue();
            int intValue2 = ((Number) c09530e4.A01).intValue();
            audioOverlayTrack = new AudioOverlayTrack(null, null, null, musicAssetModel, null, musicAssetModel.A0B, musicAssetModel.A0E, musicAssetModel.A0G, null, 1.0f, i, i2, intValue, intValue2);
            if (i >= 0) {
                if (i2 > 0) {
                    if (intValue >= 0) {
                        if (intValue2 < 0) {
                            throw new IllegalStateException(AnonymousClass001.A0O("End Time in Video must be greater than or equal to zero: ", intValue2));
                        }
                    } else {
                        throw new IllegalStateException(AnonymousClass001.A0O("Start Time in Video must be greater than or equal to zero: ", intValue));
                    }
                } else {
                    throw new IllegalStateException(AnonymousClass001.A0O(AbstractC111324zv.A00(3769), i2));
                }
            } else {
                throw new IllegalStateException(AnonymousClass001.A0O(AbstractC111324zv.A00(3770), i));
            }
        } else {
            int i3 = musicAssetModel.A00;
            int A0E2 = c8bp.A0K.A0E();
            if (i3 > A0E2) {
                i3 = A0E2;
            }
            audioOverlayTrack = new AudioOverlayTrack(musicAssetModel, i, i3);
        }
        audioOverlayTrack.A05 = enumC185288Jt;
        if (musicAssetModel.A0T && (str = musicAssetModel.A0F) != null) {
            File file = new File(str);
            C14360o3.A0B(file, 0);
            String path = file.getPath();
            C14360o3.A07(path);
            audioOverlayTrack.A06 = new DownloadedTrack(path, -1, -1);
        }
        MusicBrowseCategory musicBrowseCategory = c8bp.A04;
        audioOverlayTrack.A09 = musicBrowseCategory;
        if (musicBrowseCategory != null) {
            musicSearchPlaylistType = musicBrowseCategory.A01;
        } else {
            musicSearchPlaylistType = null;
        }
        if (musicSearchPlaylistType == MusicSearchPlaylistType.A06) {
            audioOverlayTrack.A07 = InstagramAudioApplySource.A07;
        }
        return audioOverlayTrack;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [com.instagram.music.common.model.MusicModelEffectPair, java.lang.Object] */
    public static final C52166N6v A03(C8BP c8bp, MusicOverlaySearchTab musicOverlaySearchTab) {
        ImmutableList immutableList;
        List list;
        String str;
        C0UO c0uo = c8bp.A0K.A0K.A0V;
        Collection collection = (Collection) c0uo.getValue();
        if (collection != null && !collection.isEmpty() && (list = (List) c0uo.getValue()) != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) ((AbstractC193598he) it.next()).A01;
                if (audioOverlayTrack != null) {
                    MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
                    EnumC185288Jt enumC185288Jt = audioOverlayTrack.A05;
                    if (musicAssetModel != null && (str = musicAssetModel.A0E) != null && !linkedHashSet.contains(str)) {
                        if (enumC185288Jt == null) {
                            enumC185288Jt = AbstractC92574Cr.A02(AudioFilterType.A0A);
                            C14360o3.A07(enumC185288Jt);
                        }
                        ?? obj = new Object();
                        obj.A01 = musicAssetModel;
                        obj.A00 = enumC185288Jt;
                        arrayList.add(obj);
                        linkedHashSet.add(str);
                    }
                }
            }
            immutableList = ImmutableList.copyOf((Collection) arrayList);
        } else {
            immutableList = null;
        }
        UserSession userSession = c8bp.A0D;
        EnumC1810381f enumC1810381f = c8bp.A06;
        String BVY = c8bp.A0I.BVY();
        C52166N6v A00 = OPX.A00(null, c8bp.A0J.A00, null, c8bp.A0O, immutableList, c8bp.A0P, userSession, c8bp.A0U, musicOverlaySearchTab, enumC1810381f, BVY, null, c8bp.A0W, null, false, c8bp.A0b, c8bp.A0X);
        A00.A05 = c8bp.A0V;
        A00.A03 = c8bp.A0R;
        return A00;
    }

    public static final void A06(C8BP c8bp) {
        C87H c87h = c8bp.A0T;
        c87h.A04();
        if (c8bp.A06 == EnumC1810381f.A02 && AbstractC185298Jv.A04(c8bp.A0D)) {
            c87h.A09(c8bp.A0K.A0C);
            AnonymousClass874 anonymousClass874 = c8bp.A0E;
            if (anonymousClass874 != null) {
                anonymousClass874.A01 = false;
                AnonymousClass874.A00(anonymousClass874, false);
            }
        }
    }

    public static final void A07(C8BP c8bp, EnumC185288Jt enumC185288Jt, MusicAssetModel musicAssetModel, EnumC138556Pl enumC138556Pl, Integer num, String str, float f, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        int intValue;
        AnonymousClass874 anonymousClass874;
        int i2;
        c8bp.A09 = z;
        c8bp.A08 = z3;
        if (c8bp.A07 == null) {
            if (musicAssetModel != null) {
                i2 = musicAssetModel.A00;
            } else {
                i2 = 90000;
            }
            int min = Math.min(i2, 90000);
            if (ClipsCreationViewModel.A00(c8bp.A0K).A00 > min) {
                c8bp.A07 = new C09530e4(0, Integer.valueOf(min));
            }
        }
        if (c8bp.A06 == EnumC1810381f.A02) {
            UserSession userSession = c8bp.A0D;
            if (AbstractC185298Jv.A04(userSession)) {
                c8bp.A0T.A09(c8bp.A0K.A0D);
                if (AbstractC185298Jv.A0A(userSession) && (anonymousClass874 = c8bp.A0E) != null) {
                    anonymousClass874.A01 = true;
                    AnonymousClass874.A00(anonymousClass874, false);
                }
            }
        }
        C09530e4 c09530e4 = c8bp.A07;
        if (c09530e4 != null) {
            C87H c87h = c8bp.A0T;
            int intValue2 = ((Number) c09530e4.A00).intValue();
            Number number = (Number) c09530e4.A01;
            if (number.intValue() == 0) {
                intValue = ClipsCreationViewModel.A00(c8bp.A0K).A00;
            } else {
                intValue = number.intValue();
            }
            c87h.A08(intValue2, intValue);
        }
        UserSession userSession2 = c8bp.A0D;
        boolean z5 = c8bp.A0a;
        EnumC1810381f enumC1810381f = c8bp.A06;
        boolean z6 = !z3;
        TargetViewSizeProvider targetViewSizeProvider = c8bp.A0Q;
        C8BN c8bn = c8bp.A0J.A00;
        boolean A00 = AbstractC185298Jv.A00(userSession2);
        int i3 = 0;
        ClipsCreationViewModel clipsCreationViewModel = c8bp.A0K;
        if (A00) {
            i3 = clipsCreationViewModel.A0K.A02(false);
        } else {
            List list = (List) clipsCreationViewModel.A0K.A0V.getValue();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int i4 = ((AbstractC193598he) it.next()).A00;
                    if (i4 != 0 && i4 != 4) {
                        i3++;
                    }
                }
            }
        }
        boolean A0m = clipsCreationViewModel.A0m();
        MusicProduct musicProduct = MusicProduct.A06;
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession2.token);
        bundle.putParcelable("args_music_asset", musicAssetModel);
        bundle.putBoolean("args_is_existing_track", z);
        bundle.putInt("args_existing_start_time_in_ms", i);
        bundle.putBoolean("args_should_sync_video_and_music", z5);
        bundle.putBoolean("args_should_support_edit_controls", z2);
        bundle.putSerializable("args_capture_state", enumC1810381f);
        bundle.putBoolean("args_is_album_art_enabled", z6);
        bundle.putSerializable("music_product", musicProduct);
        bundle.putBoolean("args_should_remove_audio_track_on_back", z4);
        bundle.putParcelable("ARGS_TARGET_VIEW_SIZE_PROVIDER", targetViewSizeProvider);
        if (enumC185288Jt != null) {
            bundle.putString("ARGS_PRE_SELECTED_AUDIO_FILTER", enumC185288Jt.name());
        }
        if (str != null) {
            bundle.putString("ARG_PRE_SELECTED_AUDIO_FILTER_FILE_PATH", str);
        }
        if (num != null) {
            bundle.putInt("args_music_sticker_color", num.intValue());
        }
        if (enumC138556Pl != null) {
            bundle.putInt("args_music_sticker_type", enumC138556Pl.ordinal());
        }
        bundle.putSerializable("ARGS_CAMERA_MUSIC_BROWSER_ENTRY_POINT", c8bn);
        bundle.putInt("ARGS_CURRENTLY_ATTACHED_TRACKS_COUNT", i3);
        bundle.putBoolean("ARGS_HAS_MIX_ATTACHED", A0m);
        bundle.putFloat("ARGS_PRESET_PLAYBACK_VOLUME", f);
        C214909fS c214909fS = new C214909fS();
        c214909fS.setArguments(bundle);
        c214909fS.A05 = c8bp.A0G;
        C189448aO c189448aO = new C189448aO(userSession2);
        c189448aO.A0a = true;
        c189448aO.A03 = 1.0f;
        c189448aO.A06 = c8bp.A0A;
        c189448aO.A1O = true;
        Context context = c8bp.A0B;
        c189448aO.A0F = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        c189448aO.A0U = new C24104Amp(c8bp);
        c189448aO.A0T = c214909fS;
        C189478aR c189478aR = c8bp.A01;
        if (c189478aR == null) {
            c8bp.A01 = c189448aO.A00().A03(context, c214909fS);
            c8bp.A0H.CzF();
        } else {
            c189478aR.A0F(c214909fS, c189448aO);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r2 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A08(X.C8BP r11, com.instagram.music.common.model.AudioOverlayTrack r12, boolean r13, boolean r14, boolean r15) {
        /*
            X.8Jt r0 = r12.A05
            r7 = 0
            if (r0 == 0) goto L49
            com.instagram.music.common.model.DownloadedTrack r0 = r12.A06
            if (r0 == 0) goto L49
            java.lang.String r9 = r0.A02
        Lb:
            r4 = r11
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r11.A0K
            X.05A r0 = r0.A0Z
            java.lang.Object r2 = r0.getValue()
            X.8GD r2 = (X.C8GD) r2
            if (r2 == 0) goto L47
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r2.BVf()
            java.lang.String r1 = r0.A0S
        L1e:
            java.lang.String r0 = r12.A0A
            boolean r0 = X.C14360o3.A0K(r1, r0)
            com.instagram.music.common.model.MusicAssetModel r6 = r12.A08
            int r11 = r12.A03
            if (r0 == 0) goto L41
            if (r2 == 0) goto L41
            int r0 = r2.C0U()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L34:
            X.6Pl r7 = r2.BVp()
        L38:
            X.8Jt r5 = r12.A05
            float r10 = r12.A00
            r12 = 1
            A07(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L41:
            r8 = r7
            if (r0 == 0) goto L38
            if (r2 == 0) goto L38
            goto L34
        L47:
            r1 = r7
            goto L1e
        L49:
            r9 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8BP.A08(X.8BP, com.instagram.music.common.model.AudioOverlayTrack, boolean, boolean, boolean):void");
    }

    public final void A09(AudioOverlayTrack audioOverlayTrack, AudioOverlayTrack audioOverlayTrack2, MusicOverlaySearchTab musicOverlaySearchTab, C09530e4 c09530e4, boolean z, boolean z2) {
        if (this.A0C.mFragmentManager != null) {
            if (audioOverlayTrack != null) {
                this.A03 = audioOverlayTrack;
            }
            this.A02 = audioOverlayTrack2;
            if (audioOverlayTrack2 != null) {
                c09530e4 = new C09530e4(Integer.valueOf(audioOverlayTrack2.A04), Integer.valueOf(audioOverlayTrack2.A01));
            }
            this.A07 = c09530e4;
            if (audioOverlayTrack != null && audioOverlayTrack.A08 != null && this.A06 != EnumC1810381f.A02) {
                A08(this, audioOverlayTrack, z, false, z2);
            } else {
                C52166N6v A03 = A03(this, musicOverlaySearchTab);
                this.A01 = A00(this, A03).A00().A03(this.A0B, A03);
                if (this.A0L == C8BO.A06) {
                    if (C18U.A06(C06090Tz.A05, this.A0D, 36321318651700543L)) {
                        C141796aw A00 = AbstractC141776au.A00(this.A0K);
                        AbstractC23641Du.A05(AnonymousClass191.A00, new C25024B5f(this, null, 42), A00);
                    }
                }
                this.A0K.A05 = C05F.A00;
                this.A0H.DUY();
            }
            this.A0I.DUX(true);
        }
    }

    public static final void A04(C8BP c8bp) {
        A06(c8bp);
        if (c8bp.A06 == EnumC1810381f.A02 && AbstractC185298Jv.A04(c8bp.A0D)) {
            c8bp.A0K.A0Y(C193588hd.A00);
        }
        C189478aR c189478aR = c8bp.A01;
        if (c189478aR != null) {
            c189478aR.A0L(null);
        }
    }

    public static final void A05(C8BP c8bp) {
        A06(c8bp);
        AnonymousClass879 anonymousClass879 = c8bp.A05;
        if (anonymousClass879 != null) {
            anonymousClass879.release();
        }
        c8bp.A09 = false;
        c8bp.A08 = false;
        c8bp.A07 = null;
        c8bp.A0I.DUX(false);
    }

    public C8BP(Context context, C8BN c8bn, ImmutableList immutableList, MusicProduct musicProduct, AbstractC59962oe abstractC59962oe, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass874 anonymousClass874, InterfaceC1818984z interfaceC1818984z, C8BM c8bm, C8BK c8bk, MusicAttributionConfig musicAttributionConfig, C8BO c8bo, EnumC1810381f enumC1810381f, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        int i;
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(abstractC59962oe, 3);
        C14360o3.A0B(enumC1810381f, 4);
        C14360o3.A0B(immutableList, 5);
        this.A0B = context;
        this.A0D = userSession;
        this.A0C = abstractC59962oe;
        this.A06 = enumC1810381f;
        this.A0O = immutableList;
        this.A0I = c8bk;
        this.A0H = c8bm;
        this.A0U = musicAttributionConfig;
        this.A0a = z;
        this.A0M = z2;
        this.A0F = interfaceC1818984z;
        this.A0E = anonymousClass874;
        this.A0P = musicProduct;
        this.A0Z = z3;
        this.A0b = z4;
        this.A0L = c8bo;
        this.A0Q = targetViewSizeProvider;
        this.A0W = str;
        this.A0X = z5;
        this.A0V = new C8BR() { // from class: X.8BQ
            @Override // X.C8BR
            public final /* synthetic */ void CJG(int i2, int i3, Intent intent) {
            }

            @Override // X.C8BR
            public final void DUE() {
                C8BP c8bp = C8BP.this;
                C8BP.A05(c8bp);
                if (c8bp.A0J.A01) {
                    C8BP.A04(c8bp);
                }
            }

            @Override // X.C8BR
            public final void DUG(JIN jin, MusicBrowseCategory musicBrowseCategory, String str2, String str3) {
                AudioOverlayTrack audioOverlayTrack;
                String str4;
                List list;
                if (C14360o3.A0K(str2, AbstractC111324zv.A00(3704))) {
                    C8BP c8bp = C8BP.this;
                    ClipsCreationViewModel clipsCreationViewModel = c8bp.A0K;
                    String id = jin.getId();
                    ClipsAudioStore clipsAudioStore = clipsCreationViewModel.A0K;
                    if (id != null && (list = (List) clipsAudioStore.A0G.getValue()) != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            audioOverlayTrack = (AudioOverlayTrack) ((AbstractC193598he) it.next()).A01;
                            if (audioOverlayTrack != null && C14360o3.A0K(audioOverlayTrack.A0A, id)) {
                                break;
                            }
                        }
                    }
                    audioOverlayTrack = null;
                    C8BJ c8bj = c8bp.A00;
                    if (c8bj != null) {
                        if (audioOverlayTrack != null) {
                            str4 = audioOverlayTrack.A0D;
                        } else {
                            str4 = null;
                        }
                        c8bj.A01.A05 = str4;
                    }
                    C8BP.A04(c8bp);
                    return;
                }
                C8BP c8bp2 = C8BP.this;
                c8bp2.A04 = musicBrowseCategory;
                c8bp2.A0H.DUb(jin);
                if (c8bp2.A01 == null) {
                    return;
                }
                c8bp2.A0B(jin, musicBrowseCategory);
            }
        };
        this.A0T = ((C87G) new C52942bb(abstractC59962oe.requireActivity()).A00(C87G.class)).A00("post_capture");
        this.A0R = new C8BS(this);
        this.A0G = new C8BU() { // from class: X.8BT
            /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00cb  */
            @Override // X.C8BU
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void DBJ(X.EnumC185288Jt r12, com.instagram.music.common.model.MusicAssetModel r13, com.instagram.music.common.model.TrackSnippet r14, X.C8GD r15, java.lang.Integer r16) {
                /*
                    r11 = this;
                    r10 = 0
                    r2 = 1
                    X.8BP r0 = X.C8BP.this
                    X.C8BP.A06(r0)
                    com.instagram.common.session.UserSession r3 = r0.A0D
                    X.8Bh r4 = X.AbstractC183338Bg.A00(r3)
                    X.22C r1 = X.AnonymousClass229.A01(r3)
                    X.5Hg r1 = r1.A0J()
                    java.lang.String r7 = java.lang.String.valueOf(r1)
                    X.22C r1 = X.AnonymousClass229.A01(r3)
                    X.22M r1 = r1.A04
                    java.lang.String r8 = r1.A0L
                    X.81f r5 = r0.A06
                    java.lang.String r6 = "music_selection_controller"
                    r9 = 0
                    r4.A09(r5, r6, r7, r8, r9, r10)
                    com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r5 = r0.A0K
                    int r1 = r5.A0E()
                    r4 = 0
                    if (r1 > 0) goto L4c
                    android.content.Context r1 = r0.A0B
                    java.lang.String r0 = "clips_music_editor_invalid_duration"
                    X.C9GR.A0B(r1, r0)
                    java.lang.String r1 = "when click done in music editor, clipsCreationViewModel.maxDurationInMs is: "
                    int r0 = r5.A0E()
                    java.lang.String r1 = X.AnonymousClass001.A0O(r1, r0)
                    java.lang.String r0 = "ClipsMusicSelectionController"
                    X.AbstractC12120kG.A05(r0, r1, r9)
                    r11.Cyx(r10)
                L4b:
                    return
                L4c:
                    com.instagram.music.common.model.AudioOverlayTrack r1 = X.C8BP.A02(r0, r12, r13, r14)
                    r0.A03 = r1
                    com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r1 = r5.A0K
                    int r1 = r1.A02(r2)
                    java.lang.String r7 = "selectedTrack"
                    r8 = r16
                    if (r1 <= r2) goto Lcf
                    com.instagram.music.common.model.AudioOverlayTrack r6 = r0.A02
                    X.8BK r3 = r0.A0I
                    com.instagram.music.common.model.AudioOverlayTrack r1 = r0.A03
                    if (r6 == 0) goto Ld3
                    if (r1 == 0) goto Ld9
                    r3.Duc(r6, r1)
                L6b:
                    java.lang.Integer r1 = r5.A05
                    java.lang.Integer r6 = X.C05F.A00
                    if (r1 != r6) goto Lcb
                    if (r15 == 0) goto L74
                    r4 = 1
                L74:
                    r11.Cyx(r4)
                L77:
                    if (r15 == 0) goto L4b
                    X.8BJ r1 = r0.A00
                    if (r1 == 0) goto L4b
                    com.instagram.music.common.model.AudioOverlayTrack r0 = r0.A03
                    if (r0 == 0) goto Ld9
                    java.lang.String r5 = r0.A0D
                    com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController r4 = r1.A01
                    boolean r0 = com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController.A02(r4)
                    if (r0 == 0) goto L98
                    X.81c r1 = r4.quickCaptureState
                    if (r1 == 0) goto L4b
                    X.8We r0 = new X.8We
                    r0.<init>(r15, r5, r2)
                L94:
                    r1.E4u(r0)
                    return
                L98:
                    com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r4.A0K
                    java.lang.Integer r0 = r1.A05
                    r3 = 1
                    if (r0 != r6) goto Lc1
                    X.2GS r0 = r1.A0H
                    java.lang.Object r0 = r0.A02()
                    X.8A8 r0 = (X.C8A8) r0
                    if (r0 == 0) goto Lc1
                    java.lang.Object r1 = r0.A01
                    if (r1 == 0) goto Lc1
                    X.9n1 r0 = X.C219539n1.A00
                    boolean r0 = r1.equals(r0)
                    if (r0 != r2) goto Lc1
                Lb5:
                    X.81c r1 = r4.quickCaptureState
                    if (r3 == 0) goto Lc3
                    if (r1 == 0) goto L4b
                    X.8Wd r0 = new X.8Wd
                    r0.<init>(r15, r5, r2)
                    goto L94
                Lc1:
                    r3 = 0
                    goto Lb5
                Lc3:
                    if (r1 == 0) goto L4b
                    X.8Vp r0 = new X.8Vp
                    r0.<init>(r15, r5, r2)
                    goto L94
                Lcb:
                    X.C8BP.A04(r0)
                    goto L77
                Lcf:
                    X.8BK r3 = r0.A0I
                    com.instagram.music.common.model.AudioOverlayTrack r1 = r0.A03
                Ld3:
                    if (r1 == 0) goto Ld9
                    r3.Dui(r1, r8)
                    goto L6b
                Ld9:
                    X.C14360o3.A0F(r7)
                    X.00O r0 = X.C00O.createAndThrow()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C8BT.DBJ(X.8Jt, com.instagram.music.common.model.MusicAssetModel, com.instagram.music.common.model.TrackSnippet, X.8GD, java.lang.Integer):void");
            }

            @Override // X.C8BU
            public final void DGz(EnumC185288Jt enumC185288Jt, MusicAssetModel musicAssetModel, TrackSnippet trackSnippet, boolean z6) {
                AnonymousClass874 anonymousClass8742;
                C14360o3.A0B(musicAssetModel, 0);
                C8BP c8bp = C8BP.this;
                c8bp.A0I.DuZ(C8BP.A02(c8bp, enumC185288Jt, musicAssetModel, trackSnippet));
                if (!AbstractC185298Jv.A0A(c8bp.A0D) && (anonymousClass8742 = c8bp.A0E) != null) {
                    anonymousClass8742.A01 = true;
                    AnonymousClass874.A00(anonymousClass8742, false);
                }
            }

            @Override // X.C8BU
            public final void Cyx(boolean z6) {
                C8BJ c8bj;
                if (!z6 && (c8bj = C8BP.this.A00) != null) {
                    c8bj.A00();
                }
                C8BP c8bp = C8BP.this;
                if (AbstractC185298Jv.A04(c8bp.A0D)) {
                    c8bp.A0K.A0Y(C193588hd.A00);
                }
                if (c8bp.A08) {
                    C8BP.A05(c8bp);
                    C8BP.A04(c8bp);
                    return;
                }
                C189478aR c189478aR = c8bp.A01;
                if (c189478aR == null) {
                    return;
                }
                ClipsCreationViewModel clipsCreationViewModel = c8bp.A0K;
                Integer num = clipsCreationViewModel.A05;
                Integer num2 = C05F.A00;
                if (num == num2) {
                    C8BP.A05(c8bp);
                }
                clipsCreationViewModel.A05 = num2;
                if (c8bp.A09 && c8bp.A06 != EnumC1810381f.A02) {
                    c189478aR.A05();
                    c8bp.A09 = c8bp.A0M;
                    C52166N6v A03 = C8BP.A03(c8bp, null);
                    c189478aR.A0F(A03, C8BP.A00(c8bp, A03));
                } else {
                    c189478aR.A08();
                }
                c8bp.A0H.DUY();
            }

            @Override // X.C8BU
            public final void D5L() {
                InterfaceC1818984z interfaceC1818984z2 = C8BP.this.A0F;
                if (interfaceC1818984z2 != null) {
                    interfaceC1818984z2.Elu();
                }
            }

            @Override // X.C8BU
            public final void D5M() {
                InterfaceC1818984z interfaceC1818984z2 = C8BP.this.A0F;
                if (interfaceC1818984z2 != null) {
                    interfaceC1818984z2.Eki();
                }
            }

            @Override // X.C8BU
            public final void D9c() {
                C8BP c8bp = C8BP.this;
                c8bp.A04 = null;
                c8bp.A0I.Dub(null, true);
                C8BP.A04(c8bp);
            }

            @Override // X.C8BU
            public final void DUM(boolean z6) {
                C8BP.A05(C8BP.this);
            }

            @Override // X.C8BU
            public final void DUf(AnonymousClass879 anonymousClass879) {
                C8BP.this.A05 = anonymousClass879;
            }
        };
        if (z4) {
            i = AbstractC53242c7.A0D(context);
        } else {
            C8BO c8bo2 = C8BO.A06;
            i = R.color.background;
            if (c8bo == c8bo2) {
                i = R.color.grey_10;
            }
        }
        this.A0N = context.getColor(i);
        this.A0A = context.getColor(R.color.black_5_transparent);
        this.A0Y = C18U.A06(C06090Tz.A05, userSession, 36330174874206946L);
        FragmentActivity requireActivity = abstractC59962oe.requireActivity();
        ClipsCreationViewModel clipsCreationViewModel = (ClipsCreationViewModel) new C52942bb(new AnonymousClass846(userSession, requireActivity), requireActivity).A00(ClipsCreationViewModel.class);
        this.A0K = clipsCreationViewModel;
        this.A0S = (C8BG) new C52942bb(requireActivity).A00(C8BG.class);
        C8BF c8bf = (C8BF) new C52942bb(requireActivity).A00(C8BF.class);
        this.A0J = c8bf;
        EnumC1810381f enumC1810381f2 = this.A06;
        EnumC1810381f enumC1810381f3 = EnumC1810381f.A02;
        if (enumC1810381f2 == enumC1810381f3) {
            clipsCreationViewModel.A0H.A06(abstractC59962oe, new C151846sU(new InterfaceC58362lv() { // from class: X.8BV
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v9, types: [X.N6Y, androidx.fragment.app.Fragment] */
                @Override // X.InterfaceC58362lv
                public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                    String str2;
                    C189448aO A01;
                    JIN jin;
                    Fragment fragment;
                    C189478aR c189478aR;
                    N6W n6w;
                    int i2;
                    C8BP c8bp = C8BP.this;
                    C14360o3.A0A(obj);
                    if (obj instanceof C52431NIb) {
                        C8BJ c8bj = c8bp.A00;
                        if (c8bj != null) {
                            ClipsAudioMixingDrawerController clipsAudioMixingDrawerController = c8bj.A01;
                            clipsAudioMixingDrawerController.A09 = true;
                            C22C.A08(EnumC50631MWs.A0I, AnonymousClass229.A01(clipsAudioMixingDrawerController.A0F), "AUDIO_CONTROLS_ADD_VOICEOVER", ClipsAudioMixingDrawerController.A02(clipsAudioMixingDrawerController));
                        }
                    } else if (obj instanceof C52432NIc) {
                        C8BJ c8bj2 = c8bp.A00;
                        if (c8bj2 != null) {
                            c8bj2.A01.A0A = true;
                        }
                    } else {
                        if (obj instanceof AbstractC219529n0) {
                            ?? n6y = new N6Y();
                            Bundle bundle = new Bundle();
                            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", c8bp.A0D.token);
                            if (C14360o3.A0K(obj, C219519mz.A00)) {
                                i2 = 2131953307;
                            } else {
                                i2 = 2131953309;
                                if (C14360o3.A0K(obj, C219509my.A00)) {
                                    i2 = 2131953306;
                                }
                            }
                            bundle.putInt(MSV.A00(936), i2);
                            n6y.setArguments(bundle);
                            n6w = n6y;
                        } else {
                            if (obj instanceof C219539n1) {
                                AudioOverlayTrack audioOverlayTrack = c8bp.A03;
                                if (audioOverlayTrack == null) {
                                    AbstractC12120kG.A05("ClipsMusicSelectionController", "selectedTrack not initialized in handleControlBarEvent()", null);
                                    return;
                                }
                                ClipsCreationViewModel clipsCreationViewModel2 = c8bp.A0K;
                                C8BM c8bm2 = c8bp.A0H;
                                MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
                                if (musicAssetModel != null) {
                                    jin = AbstractC37963Gn5.A00(musicAssetModel);
                                } else {
                                    jin = null;
                                }
                                c8bm2.DUb(jin);
                                C8GD c8gd = (C8GD) clipsCreationViewModel2.A0Z.getValue();
                                if (c8gd != null) {
                                    c8gd.BVp();
                                    AudioOverlayTrack audioOverlayTrack2 = c8bp.A03;
                                    if (audioOverlayTrack2 != null) {
                                        MusicAssetModel musicAssetModel2 = audioOverlayTrack2.A08;
                                        int C0U = c8gd.C0U();
                                        EnumC138556Pl BVp = c8gd.BVp();
                                        AudioOverlayTrack audioOverlayTrack3 = c8bp.A03;
                                        if (audioOverlayTrack3 != null) {
                                            int i3 = audioOverlayTrack3.A03;
                                            c8bp.A02 = null;
                                            c8bp.A07 = null;
                                            C8BP.A07(c8bp, null, musicAssetModel2, BVp, Integer.valueOf(C0U), null, 1.0f, i3, true, true, false, false);
                                            return;
                                        }
                                    }
                                } else {
                                    AudioOverlayTrack audioOverlayTrack4 = c8bp.A03;
                                    if (audioOverlayTrack4 != null) {
                                        C8BP.A08(c8bp, audioOverlayTrack4, true, false, false);
                                        return;
                                    }
                                }
                                C14360o3.A0F("selectedTrack");
                                throw C00O.createAndThrow();
                            }
                            if (obj instanceof C52430NIa) {
                                AnonymousClass844 anonymousClass844 = c8bp.A0K.A0L.A01;
                                if (anonymousClass844 != null) {
                                    str2 = anonymousClass844.BVY();
                                } else {
                                    str2 = null;
                                }
                                UserSession userSession2 = c8bp.A0D;
                                C52151N6b c52151N6b = new C52151N6b();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString(MSV.A00(928), str2);
                                bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession2.token);
                                c52151N6b.setArguments(bundle2);
                                C189478aR c189478aR2 = c8bp.A01;
                                if (c189478aR2 == null) {
                                    return;
                                }
                                A01 = C8BP.A01(c8bp, c52151N6b);
                                c189478aR = c189478aR2;
                                fragment = c52151N6b;
                                c189478aR.A0F(fragment, A01);
                                return;
                            }
                            if (obj instanceof NIZ) {
                                UserSession userSession3 = c8bp.A0D;
                                C22C A012 = AnonymousClass229.A01(userSession3);
                                A012.A1R(((C22F) A012).A04.A0C, "AUDIO_ENHANCE_ENTER");
                                N6W n6w2 = new N6W();
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession3.token);
                                n6w2.setArguments(bundle3);
                                n6w = n6w2;
                            } else {
                                throw new RuntimeException();
                            }
                        }
                        C189478aR c189478aR3 = c8bp.A01;
                        if (c189478aR3 == null) {
                            return;
                        }
                        A01 = C8BP.A01(c8bp, n6w);
                        c189478aR = c189478aR3;
                        fragment = n6w;
                        c189478aR.A0F(fragment, A01);
                        return;
                    }
                    C189478aR c189478aR4 = c8bp.A01;
                    if (c189478aR4 != null) {
                        c189478aR4.A0L(null);
                    }
                }
            }));
        }
        if (this.A06 == enumC1810381f3 && (c8bk instanceof C8BJ)) {
            this.A00 = (C8BJ) c8bk;
        }
        if (c8bn != null) {
            c8bf.A00 = c8bn;
        }
    }
}
