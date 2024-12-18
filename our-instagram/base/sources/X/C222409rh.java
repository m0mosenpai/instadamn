package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.File;

/* renamed from: X.9rh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C222409rh extends AbstractC67881V0m {
    public static final String __redex_internal_original_name = "ReelFeedPostShareFragment";
    public int A00;
    public RectF A01;
    public RectF A02;
    public C22P A03;
    public ReelsVisualRepliesModel A04;
    public ClipsCelebrationReshareViewModel A05;
    public C38321qM A06;
    public MusicOverlayStickerModel A07;
    public PendingRecipient A08;
    public File A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public final InterfaceC25214BDm A0E = new C23766Afd(this, 10);
    public final InterfaceC09390do A0F;

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0146  */
    @Override // X.AbstractC67881V0m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C81J A02(android.view.ViewGroup r26) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C222409rh.A02(android.view.ViewGroup):X.81J");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reel_feed_post_share_fragment";
    }

    @Override // X.AbstractC67881V0m, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A06 != null) {
            UserSession userSession = super.A00;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!AbstractC166997dE.A0c(c06090Tz, userSession, 36319828297981636L).booleanValue() && C14360o3.A0K(C20Y.A00(AbstractC166987dD.A0q(this)).A01.A00, C125535lz.A00) && !C18U.A06(c06090Tz, AbstractC166987dD.A0q(this), 36328796189638446L)) {
                C07S c07s = C07S.STARTED;
                C07X viewLifecycleOwner = getViewLifecycleOwner();
                AbstractC166987dD.A1Z(new C57159PZd(viewLifecycleOwner, c07s, this, null, 32), C07Y.A00(viewLifecycleOwner));
                ((C9U0) this.A0F.getValue()).A00();
            }
        }
    }

    public C222409rh() {
        J7R j7r = new J7R(this, 38);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new J7R(new J7R(this, 35), 36));
        this.A0F = new C60842q8(new J7R(A00, 37), j7r, new D8I(39, null, A00), new C0YZ(C9U0.class));
        this.A03 = C22P.A5N;
    }

    @Override // X.AbstractC67881V0m, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C22P c22p;
        int A02 = C0f9.A02(-194817003);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            Object obj = bundle2.get("ReelFeedPostShareFragment.ARGUMENTS_KEY_ENTRY_POINT");
            if (!(obj instanceof C22P) || (c22p = (C22P) obj) == null) {
                c22p = C22P.A5N;
            }
            this.A03 = c22p;
            this.A01 = (RectF) bundle2.getParcelable(AbstractC111324zv.A00(327));
            this.A02 = (RectF) bundle2.getParcelable(AbstractC111324zv.A00(328));
            this.A0D = bundle2.getBoolean("ARGUMENTS_MEDIA_SHARED_TO_FEED", false);
            this.A06 = AbstractC167017dG.A0e(this, bundle2.getString("ReelFeedPostShareFragment.ARGUMENTS_KEY_MEDIA_ID"));
            this.A00 = bundle2.getInt("ReelFeedPostShareFragment.ARGUMENTS_CAROUSEL_INDEX");
            String string = bundle2.getString("ReelFeedPostShareFragment.ARGUMENTS_KEY_FILE_PATH");
            AbstractC153636vY.A03(bundle2, string, "ReelFeedPostShareFragment.ARGUMENTS_KEY_FILE_PATH");
            this.A09 = AbstractC166987dD.A11(string);
            this.A0C = bundle2.getString(AbstractC111324zv.A00(329));
            this.A0B = bundle2.getString("feed_post_share_media_file_path");
            this.A05 = (ClipsCelebrationReshareViewModel) bundle2.getParcelable("celebration_reshare_view_model");
            this.A08 = (PendingRecipient) bundle2.getParcelable("ReelFeedPostShareFragment.ARGUMENTS_TARGET_GROUP_PROFILE");
            this.A04 = (ReelsVisualRepliesModel) bundle2.getParcelable("ReelFeedPostShareFragment.ARGUMENTS_COMMENT_SHARE_MODEL");
            this.A0A = bundle2.getString("ReelFeedPostShareFragment.ARGUMENTS_ACHIEVEMENT_STICKER_URL");
            this.A07 = (MusicOverlayStickerModel) bundle2.getParcelable("ReelFeedPostShareFragment.ARGUMENTS_MUSIC_METADATA");
            C0f9.A09(47197206, A02);
            return;
        }
        IllegalArgumentException A12 = AbstractC166987dD.A12(AbstractC111324zv.A00(321));
        C0f9.A09(916010845, A02);
        throw A12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if (r0.exists() == false) goto L10;
     */
    @Override // X.AbstractC67881V0m, X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            r2 = this;
            r0 = 1002040244(0x3bb9ebb4, float:0.00567385)
            int r1 = X.C0f9.A02(r0)
            super.onResume()
            X.1qM r0 = r2.A06
            if (r0 == 0) goto L22
            java.io.File r0 = r2.A09
            if (r0 != 0) goto L1c
            java.lang.String r0 = "presetMediumFile"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L1c:
            boolean r0 = r0.exists()
            if (r0 != 0) goto L25
        L22:
            X.A3A.A00(r2)
        L25:
            r0 = -615210199(0xffffffffdb54a329, float:-5.985209E16)
            X.C0f9.A09(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C222409rh.onResume():void");
    }
}
