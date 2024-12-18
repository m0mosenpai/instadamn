package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.music.common.model.TrackSnippet;

/* renamed from: X.LuY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49519LuY implements InterfaceC189958bE, InterfaceC58189Pqv {
    public EnumC46263Kdv A00;
    public EnumC203578zI A01;
    public AudioOverlayTrack A02;
    public AudioOverlayTrack A03;
    public final int A04;
    public final Context A05;
    public final View A06;
    public final C189988bH A07;
    public final C47Z A08;
    public final ImageView A09;
    public final UserSession A0A;
    public final AnonymousClass841 A0B;
    public final InterfaceC189598ae A0C;
    public final String A0D;
    public final InterfaceC16660sJ A0E;
    public final boolean A0F;

    @Override // X.InterfaceC189958bE
    public final boolean ACP() {
        return true;
    }

    @Override // X.InterfaceC189958bE
    public final /* synthetic */ void ATh() {
    }

    @Override // X.InterfaceC189958bE
    public final int BPv() {
        return 90;
    }

    @Override // X.InterfaceC189958bE
    public final String BYP(boolean z) {
        return "";
    }

    @Override // X.InterfaceC189968bF
    public final /* synthetic */ void CMU() {
    }

    @Override // X.InterfaceC189958bE, X.InterfaceC189968bF
    public final boolean CQQ() {
        return false;
    }

    @Override // X.InterfaceC189958bE
    public final /* synthetic */ void CwG() {
    }

    @Override // X.InterfaceC189958bE
    public final /* synthetic */ void Cxy(EnumC185288Jt enumC185288Jt, TrackSnippet trackSnippet, boolean z) {
    }

    @Override // X.InterfaceC189958bE
    public final boolean Cyv() {
        return false;
    }

    @Override // X.InterfaceC189958bE
    public final /* synthetic */ void D9c() {
    }

    @Override // X.InterfaceC189958bE
    public final /* synthetic */ void DBK(EnumC185288Jt enumC185288Jt, TrackSnippet trackSnippet, Integer num) {
    }

    @Override // X.InterfaceC189958bE
    public final /* synthetic */ void DTj(Integer num) {
    }

    @Override // X.InterfaceC189958bE
    public final /* synthetic */ void DUK() {
    }

    @Override // X.InterfaceC189958bE
    public final /* synthetic */ void DUL() {
    }

    @Override // X.InterfaceC189968bF
    public final /* synthetic */ void Ekk() {
    }

    public C49519LuY(Context context, ImageView imageView, AbstractC59962oe abstractC59962oe, UserSession userSession, AnonymousClass841 anonymousClass841, C47Z c47z, InterfaceC189598ae interfaceC189598ae, String str, InterfaceC16660sJ interfaceC16660sJ, int i) {
        MusicAttributionConfig musicAttributionConfig;
        C14360o3.A0B(str, 4);
        this.A0A = userSession;
        this.A05 = context;
        this.A0D = str;
        this.A08 = c47z;
        this.A0B = anonymousClass841;
        this.A09 = imageView;
        this.A0E = interfaceC16660sJ;
        this.A0C = interfaceC189598ae;
        this.A04 = i;
        View inflate = LayoutInflater.from(context).inflate(R.layout.fragment_creation_edit_music_editor, (ViewGroup) null);
        C14360o3.A07(inflate);
        this.A06 = inflate;
        if (!C1H6.A03() && !AbstractC43840Ja3.A00(userSession)) {
            abstractC59962oe.requireActivity().getTheme().applyStyle(R.style.MusicCreationLightOverlayTheme, true);
        }
        C189988bH c189988bH = new C189988bH(AbstractC167007dF.A0M(inflate, R.id.music_editor_stub), new C9B8(0, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size, 2, 1, false), abstractC59962oe, userSession, null, this, C8BO.A09, 0, false, false, false, true, false, false);
        this.A07 = c189988bH;
        c189988bH.A0b = new AnonymousClass878(context, userSession, null, new C677733r(context, userSession), new C49522Lub(this, 3));
        MediaCaptureConfig mediaCaptureConfig = ((MX5) anonymousClass841).A01.A09;
        if (mediaCaptureConfig != null && (musicAttributionConfig = mediaCaptureConfig.A00) != null && c47z.A1J == null) {
            MusicProduct musicProduct = MusicProduct.A0G;
            MusicAssetModel musicAssetModel = musicAttributionConfig.A02;
            if (musicAssetModel != null) {
                c47z.A1J = AbstractC23129AMi.A02(musicProduct, musicAssetModel, 30000, Integer.valueOf(musicAttributionConfig.A00), str);
            } else {
                throw AbstractC25227BEk.A0n();
            }
        }
        this.A0F = true;
    }

    private final void A00() {
        Integer num;
        C47Z c47z = this.A08;
        MusicOverlayStickerModel musicOverlayStickerModel = c47z.A1J;
        if (musicOverlayStickerModel != null) {
            if (AbstractC31177DnL.A1b(musicOverlayStickerModel.A0E)) {
                num = musicOverlayStickerModel.A0N;
            } else {
                num = musicOverlayStickerModel.A0O;
            }
            this.A03 = new AudioOverlayTrack(MusicAssetModel.A03(c47z.A1J), AbstractC167017dG.A0K(musicOverlayStickerModel.A0K), AbstractC25227BEk.A06(num, 30000));
        }
    }

    private final void A01() {
        Drawable drawable;
        ImageUrl imageUrl;
        Context context = this.A05;
        InterfaceC189598ae interfaceC189598ae = this.A0C;
        C47Z c47z = this.A08;
        UserSession userSession = this.A0A;
        AudioOverlayTrack audioOverlayTrack = this.A03;
        AnonymousClass841 anonymousClass841 = this.A0B;
        OY2.A00(context, userSession, ((MX5) anonymousClass841).A01.A09, audioOverlayTrack, c47z, interfaceC189598ae, this.A0D, anonymousClass841.FDe(), AbstractC166987dD.A1b(anonymousClass841.FDe()), true);
        ImageView imageView = this.A09;
        if (imageView != null) {
            MusicOverlayStickerModel musicOverlayStickerModel = c47z.A1J;
            if (musicOverlayStickerModel != null && (imageUrl = musicOverlayStickerModel.A03) != null) {
                drawable = AbstractC47072KrT.A00(context, imageUrl);
            } else {
                drawable = context.getDrawable(this.A04);
                if (drawable == null) {
                    throw AbstractC166997dE.A0g();
                }
            }
            imageView.setImageDrawable(drawable);
        }
    }

    public final void A02() {
        AudioOverlayTrack audioOverlayTrack = this.A02;
        if (audioOverlayTrack == null) {
            A00();
            audioOverlayTrack = this.A03;
            this.A02 = audioOverlayTrack;
            if (audioOverlayTrack == null) {
                return;
            }
        }
        MusicOverlayStickerModel musicOverlayStickerModel = this.A08.A1J;
        C189988bH c189988bH = this.A07;
        if (musicOverlayStickerModel != null) {
            MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
            if (musicAssetModel != null) {
                c189988bH.A0K(musicAssetModel, audioOverlayTrack.A03, false);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        MusicAssetModel musicAssetModel2 = audioOverlayTrack.A08;
        if (musicAssetModel2 != null) {
            c189988bH.A0L(musicAssetModel2, false);
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (X.C14360o3.A0K(r2, r1) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.JIN r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L1f
            com.instagram.music.common.model.AudioOverlayTrack r1 = r4.A03
            r0 = 0
            if (r1 == 0) goto L25
            java.lang.String r2 = r5.getId()
            com.instagram.music.common.model.AudioOverlayTrack r1 = r4.A03
            if (r1 == 0) goto L23
            com.instagram.music.common.model.MusicAssetModel r1 = r1.A08
            if (r1 == 0) goto L23
            java.lang.String r1 = r1.A0E
        L15:
            boolean r1 = X.C14360o3.A0K(r2, r1)
            if (r1 == 0) goto L25
        L1b:
            com.instagram.music.common.model.AudioOverlayTrack r0 = r4.A03
        L1d:
            r4.A02 = r0
        L1f:
            r4.A02()
            return
        L23:
            r1 = r0
            goto L15
        L25:
            X.47Z r3 = r4.A08
            com.instagram.music.common.model.MusicOverlayStickerModel r1 = r3.A1J
            if (r1 == 0) goto L3f
            java.lang.String r2 = r5.getId()
            com.instagram.music.common.model.MusicOverlayStickerModel r1 = r3.A1J
            if (r1 == 0) goto L35
            java.lang.String r0 = r1.A0S
        L35:
            boolean r0 = X.C14360o3.A0K(r2, r0)
            if (r0 == 0) goto L3f
            r4.A00()
            goto L1b
        L3f:
            com.instagram.music.common.model.AudioType r1 = com.instagram.music.common.model.AudioType.A04
            com.instagram.music.common.model.AudioType r0 = r5.CBi()
            if (r1 != r0) goto L50
            int r0 = r5.CAB()
        L4b:
            com.instagram.music.common.model.AudioOverlayTrack r0 = X.AbstractC54060NvK.A00(r5, r0)
            goto L1d
        L50:
            r0 = 30000(0x7530, float:4.2039E-41)
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49519LuY.A03(X.JIN):void");
    }

    @Override // X.InterfaceC58189Pqv
    public final View Aa0(Context context) {
        return this.A06;
    }

    @Override // X.InterfaceC189968bF
    public final MusicOverlayStickerModel BVf() {
        throw AbstractC166987dD.A14("The Composer format does not support the sticker in the music editor");
    }

    @Override // X.InterfaceC189968bF
    public final boolean Bv6() {
        return false;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CSV() {
        return false;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CSh() {
        return false;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CXD() {
        return false;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CaV() {
        AudioOverlayTrack audioOverlayTrack = this.A02;
        boolean z = true;
        if (audioOverlayTrack == null || audioOverlayTrack.A0E == null) {
            z = false;
        }
        return !z;
    }

    @Override // X.InterfaceC189958bE
    public final boolean Cbt() {
        return false;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CdO() {
        AudioOverlayTrack audioOverlayTrack = this.A02;
        boolean z = true;
        if (audioOverlayTrack == null || audioOverlayTrack.A0E == null) {
            z = false;
        }
        return !z;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CdP() {
        AudioOverlayTrack audioOverlayTrack = this.A02;
        boolean z = true;
        if (audioOverlayTrack == null || audioOverlayTrack.A0E == null) {
            z = false;
        }
        return !z;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CdQ() {
        AudioOverlayTrack audioOverlayTrack = this.A02;
        boolean z = true;
        if (audioOverlayTrack == null || audioOverlayTrack.A0E == null) {
            z = false;
        }
        return !z;
    }

    @Override // X.InterfaceC189958bE, X.InterfaceC189978bG
    public final boolean Cdk() {
        return false;
    }

    @Override // X.InterfaceC189958bE
    public final boolean Cef() {
        return this.A0F;
    }

    @Override // X.InterfaceC58189Pqv
    public final void Cvt(boolean z) {
        String str;
        String str2;
        MusicAssetModel musicAssetModel;
        MusicAssetModel musicAssetModel2;
        C22C A01 = AnonymousClass229.A01(this.A0A);
        if (!z) {
            AudioOverlayTrack audioOverlayTrack = this.A03;
            if (audioOverlayTrack != null && (musicAssetModel2 = audioOverlayTrack.A08) != null) {
                str = musicAssetModel2.A0E;
            } else {
                str = null;
            }
            AudioOverlayTrack audioOverlayTrack2 = this.A02;
            if (audioOverlayTrack2 != null && (musicAssetModel = audioOverlayTrack2.A08) != null) {
                str2 = musicAssetModel.A0E;
            } else {
                str2 = null;
            }
            if (C14360o3.A0K(str, str2)) {
                this.A03 = null;
                A01();
            }
            A01.A0t(this.A00, this.A01, EnumC50631MWs.A0I);
            A01.A03.A01();
        } else {
            this.A03 = this.A02;
            EnumC50631MWs enumC50631MWs = EnumC50631MWs.A0I;
            EnumC203578zI enumC203578zI = this.A01;
            EnumC46263Kdv enumC46263Kdv = this.A00;
            C448124l c448124l = A01.A09;
            AnonymousClass249 anonymousClass249 = ((C22F) A01).A04.A0A;
            C24U c24u = A01.A03;
            c448124l.A0R(enumC46263Kdv, anonymousClass249, enumC203578zI, enumC50631MWs, null, null, null, null, "AUDIO_EDITOR_PAGE_DONE_BUTTON", null, c24u.A07, null, false, false);
            C448624q c448624q = A01.A0E;
            EnumC46263Kdv enumC46263Kdv2 = this.A00;
            C25531Mh A0A = C25531Mh.A0A(c448624q.A01);
            if (AbstractC25226BEj.A1Z(A0A)) {
                A0A.A0M(C81X.A1d, "tool_type");
                C448624q.A00(A0A, c448624q);
                AbstractC167007dF.A14(A0A, c448624q.A04);
                A0A.A0M(enumC50631MWs, "surface");
                AbstractC167007dF.A13(A0A);
                A0A.A0a(EnumC114925Hg.FEED);
                A0A.A0M(enumC46263Kdv2, MSV.A00(389));
                AbstractC167017dG.A1D(A0A);
            }
            c24u.A01();
            A01();
        }
        this.A0E.invoke(this.A03);
        this.A02 = null;
        this.A00 = null;
        C189988bH c189988bH = this.A07;
        c189988bH.A0G = null;
        c189988bH.A0M();
    }

    @Override // X.InterfaceC189958bE
    public final void Dx9(int i) {
        AudioOverlayTrack audioOverlayTrack = this.A02;
        if (audioOverlayTrack != null) {
            audioOverlayTrack.A02 = i;
        }
    }

    @Override // X.InterfaceC189958bE
    public final void DxA(int i) {
        AudioOverlayTrack audioOverlayTrack = this.A02;
        if (audioOverlayTrack != null) {
            audioOverlayTrack.A03 = i;
        }
    }

    @Override // X.InterfaceC58189Pqv
    public final String getTitle() {
        return AbstractC166997dE.A0p(this.A05, 2131955239);
    }

    @Override // X.InterfaceC58189Pqv
    public final void onPause() {
        this.A07.A0G();
    }

    @Override // X.InterfaceC58189Pqv
    public final void onResume() {
        this.A07.A0H();
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ boolean CJr(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ boolean COP(C44428Jkf c44428Jkf, PhotoFilter photoFilter) {
        return false;
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ boolean COQ(C44428Jkf c44428Jkf, FilterGroupModel filterGroupModel) {
        return false;
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ boolean DkF(View view, ViewGroup viewGroup, C8MA c8ma, FilterGroupModel filterGroupModel) {
        return false;
    }
}
