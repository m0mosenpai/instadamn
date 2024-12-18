package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.storiestemplate.discovery.repository.StoryTemplateDiscoverySurfaceSectionPagingSource;
import com.instagram.reels.storiestemplate.discovery.view.StoryTemplateDiscoverySurfaceFragment;
import com.instagram.ui.widget.segmentedprogressbar.ProgressAnchorContainer;
import go.Seq;

/* renamed from: X.Pg1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57527Pg1 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57527Pg1(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, EnumC09460dv enumC09460dv, int i) {
        return AbstractC09440dt.A00(enumC09460dv, new C57527Pg1(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                C50561MTs c50561MTs = (C50561MTs) this.A01;
                Context context = c50561MTs.A06;
                C14360o3.A07(context);
                return new C50564MTv(context, new C50565MTw(c50561MTs), c50561MTs.A0D);
            case 1:
                return new C56183Owq(this.A01, 1);
            case 2:
                Drawable drawable = ((Context) this.A01).getDrawable(R.drawable.interactive_sticker_background);
                if (drawable != null) {
                    return drawable;
                }
                throw AbstractC166997dE.A0g();
            case 3:
                return new C198248pZ((UserSession) this.A01);
            case 4:
                return new C141766at((UserSession) this.A01);
            case 5:
                return new C207479Ga((UserSession) this.A01);
            case 6:
                return new NSP((UserSession) this.A01);
            case 7:
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A01;
                C14360o3.A0B(abstractC12990ll, 0);
                return abstractC12990ll.A01(NSP.class, new C57527Pg1(abstractC12990ll, 6));
            case 8:
                return new LinearLayoutManager(AbstractC31172DnG.A07(this.A01), 1, false);
            case 9:
                Fragment fragment = (Fragment) this.A01;
                return Integer.valueOf((int) (((AbstractC13890nF.A01(fragment.requireContext()) - (AbstractC167017dG.A03(fragment.requireContext()) * 2)) - AbstractC167017dG.A06(fragment.requireContext())) / 1.6f));
            case 10:
                return new NBG(AbstractC166987dD.A0r(((StoryTemplateDiscoverySurfaceFragment) this.A01).session$delegate));
            case 11:
                return new O4C((StoryTemplateDiscoverySurfaceFragment) this.A01);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new C51198Mji(this.A01, 11);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return this.A01;
            case 14:
                return AbstractC25226BEj.A1C(this.A01);
            case Process.SIGTERM /* 15 */:
                return AbstractC167027dH.A0B(this.A01);
            case 16:
                C51360MmL c51360MmL = (C51360MmL) this.A01;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return c51360MmL.A00.requireViewById(R.id.story_template_discovery_surface_section_header_shimmer);
            case 17:
                return new C51198Mji(this.A01, 12);
            case 18:
                C51360MmL c51360MmL2 = (C51360MmL) this.A01;
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new LinearLayoutManager(c51360MmL2.A00.getContext(), 0, false);
            case Process.SIGSTOP /* 19 */:
                return new StoryTemplateDiscoverySurfaceSectionPagingSource(((NSP) ((C50913Mei) this.A01).A01.getValue()).A01);
            case 20:
                return ((C8CV) this.A01).A00();
            case 21:
                return AbstractC31172DnG.A0s(AbstractC167007dF.A1N((((View) this.A01).getRotation() > (-7.0f) ? 1 : (((View) this.A01).getRotation() == (-7.0f) ? 0 : -1))));
            case 22:
                return new C54606OAh((UserSession) this.A01);
            case 23:
                AbstractC12990ll abstractC12990ll2 = (AbstractC12990ll) this.A01;
                C54606OAh c54606OAh = (C54606OAh) abstractC12990ll2.A01(C54606OAh.class, new C57527Pg1(abstractC12990ll2, 22));
                if (c54606OAh.A02) {
                    InterfaceC19610xo ARD = c54606OAh.A01.ARD();
                    ARD.E7G("last_play_pile_animation_time", 0L);
                    ARD.apply();
                } else {
                    c54606OAh.A00 = 0L;
                }
                return C0eB.A00;
            case 24:
                ((InterfaceC56392iX) this.A01).setVisibility(8);
                return C0eB.A00;
            case 25:
                return AbstractC166997dE.A0S(((NSE) this.A01).A00.getView(), R.id.header_avatar_view);
            case 26:
            case 31:
                return ((NSE) this.A01).A00.getView();
            case 27:
                return AbstractC166997dE.A0S(((C3P1) this.A01).A00(), R.id.progress_bar);
            case 28:
                return AbstractC166997dE.A0S(((C3P1) this.A01).A01(), R.id.story_subtitle);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return ((C3P1) this.A01).A01().requireViewById(R.id.story_timestamp);
            case 30:
                return AbstractC166997dE.A0S(((C3P1) this.A01).A01(), R.id.story_title);
            case 32:
                View view = new View((Context) this.A01);
                view.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
                return view;
            case 33:
                Activity activity = ((C34621FNe) this.A01).A02;
                int A0A = AbstractC13880nE.A0A(activity);
                return new RectF(0.0f, AbstractC13880nE.A09(activity), A0A, r0 * 2);
            case 34:
            case 35:
            default:
                AbstractC166987dD.A1Y(this.A01);
                return C0eB.A00;
            case 36:
                Activity activity2 = ((C34622FNf) this.A01).A02;
                int A0A2 = AbstractC13880nE.A0A(activity2);
                return new RectF(0.0f, AbstractC13880nE.A09(activity2), A0A2, r0 * 2);
            case 37:
                return ((View) this.A01).findViewById(R.id.reel_viewer_attribution);
            case 38:
                return ((View) this.A01).findViewById(R.id.reel_viewer_broadcast_cover);
            case 39:
                return ((View) this.A01).findViewById(R.id.archive_delete_button);
            case 40:
                return ((View) this.A01).findViewById(R.id.archive_download_button);
            case Seq.NULL_REFNUM /* 41 */:
                return ((View) this.A01).findViewById(R.id.archive_insights_button);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return ((View) this.A01).findViewById(R.id.iglive_archive_media_layout);
            case 43:
                return ((View) this.A01).findViewById(R.id.reel_viewer_playback_time);
            case 44:
                return ((View) this.A01).findViewById(R.id.reel_viewer_profile_picture);
            case 45:
                return ((View) this.A01).findViewById(R.id.reel_viewer_progress_anchor);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return ((ProgressAnchorContainer) AbstractC166987dD.A17(((C138246Of) this.A01).A0E)).A01;
            case 47:
                return ((View) this.A01).findViewById(R.id.reel_viewer_image_view);
            case 48:
                return ((View) this.A01).findViewById(R.id.iglive_archive_reel_layout);
            case 49:
                return ((View) this.A01).findViewById(R.id.iglive_archive_seek_back_button);
        }
    }
}
