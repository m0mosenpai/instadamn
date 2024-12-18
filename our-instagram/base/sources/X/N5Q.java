package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.VideoView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.shopping.video.ShoppingCreationConfig;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.user.model.ProductCollectionImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class N5Q extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ClipsProductTagFragment";
    public IgFrameLayout A00;
    public IgTextView A01;
    public PH9 A02;
    public C47Z A03;
    public C32403EPe A04;
    public RoundedCornerFrameLayout A05;
    public ListView A06;
    public ShoppingCreationConfig A07;
    public String A08;
    public String A09;
    public final InterfaceC09390do A0A = AbstractC60492pY.A02(this);

    public static final void A00(N5Q n5q) {
        ArrayList arrayList;
        List list;
        ArrayList arrayList2;
        ProductCollectionImpl productCollectionImpl;
        ClipInfo clipInfo;
        ArrayList arrayList3;
        InterfaceC09390do interfaceC09390do = n5q.A0A;
        boolean A00 = Ny2.A00(AbstractC166987dD.A0r(interfaceC09390do));
        Long l = null;
        C47Z c47z = n5q.A03;
        if (A00) {
            if (c47z != null) {
                arrayList3 = c47z.A43;
            } else {
                arrayList3 = null;
            }
            list = AbstractC55225Oes.A0A(arrayList3);
            arrayList = null;
        } else {
            if (c47z != null && (arrayList2 = c47z.A43) != null) {
                arrayList = AbstractC167017dG.A0q(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(MSZ.A0e(it).A0H);
                }
            } else {
                arrayList = null;
            }
            list = null;
        }
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        String str = n5q.A09;
        if (str == null) {
            str = "";
        }
        String str2 = n5q.A08;
        PH9 ph9 = n5q.A02;
        if (ph9 == null) {
            C14360o3.A0F("clipsProductTaggingController");
            throw C00O.createAndThrow();
        }
        C38686GzR c38686GzR = ph9.A00;
        ArrayList A01 = C41747IeL.A01(c38686GzR, ph9.A07);
        if (c38686GzR != null) {
            productCollectionImpl = (ProductCollectionImpl) c38686GzR.A00;
        } else {
            productCollectionImpl = null;
        }
        TaggingFeedMultiSelectState taggingFeedMultiSelectState = new TaggingFeedMultiSelectState(null, productCollectionImpl, A01, null);
        C47Z c47z2 = n5q.A03;
        if (c47z2 != null && (clipInfo = c47z2.A1N) != null) {
            l = AbstractC31171DnF.A0V(clipInfo.A05 - clipInfo.A07);
        }
        AbstractC54313NzX.A00(n5q, A0r, c47z2, taggingFeedMultiSelectState, l, str, str2, null, arrayList, list);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_product_tagging";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgFrameLayout igFrameLayout = (IgFrameLayout) view.requireViewById(R.id.product_tagging_add_tag_button);
        this.A00 = igFrameLayout;
        if (igFrameLayout != null) {
            ViewOnClickListenerC55466OkL.A02(igFrameLayout, 14, this);
        }
        this.A01 = AbstractC31172DnG.A0X(view, R.id.product_tagging_limit_text);
        this.A06 = (ListView) view.requireViewById(R.id.product_tagging_tagged_items);
        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) view.requireViewById(R.id.product_tagging_video_preview_layout);
        this.A05 = roundedCornerFrameLayout;
        if (roundedCornerFrameLayout != null) {
            try {
                roundedCornerFrameLayout.setCornerRadius(AbstractC166997dE.A0N(this).getDimensionPixelOffset(R.dimen.abc_select_dialog_padding_start_material));
            } catch (Resources.NotFoundException unused) {
                C0w9.A01.EmN("clips_product_tagging", "Failed to get dimension pixel offset used to set the product tagging video preview rounded corner radius");
            }
        }
        RoundedCornerFrameLayout roundedCornerFrameLayout2 = this.A05;
        if (roundedCornerFrameLayout2 != null) {
            ViewOnClickListenerC55466OkL.A02(roundedCornerFrameLayout2, 15, this);
        }
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A0A;
        this.A02 = new PH9(requireContext, view, this, AbstractC166987dD.A0r(interfaceC09390do), this, this.A03, this.A09);
        Context requireContext2 = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        Integer num = C05F.A01;
        PH9 ph9 = this.A02;
        if (ph9 != null) {
            C32403EPe c32403EPe = new C32403EPe(requireContext2, this, A0r, ph9, num, null, null, null, null, null, null, false, false, false, false);
            this.A04 = c32403EPe;
            ListView listView = this.A06;
            if (listView != null) {
                listView.setAdapter((ListAdapter) c32403EPe);
            }
            A01();
            PH9 ph92 = this.A02;
            if (ph92 != null) {
                C47Z c47z = ph92.A06;
                if (c47z != null) {
                    if (c47z.A0r != null) {
                        ViewGroup viewGroup = (ViewGroup) AbstractC166997dE.A0S(ph92.A02, R.id.product_tagging_vvp_video_preview_container);
                        viewGroup.setVisibility(0);
                        ClipInfo clipInfo = c47z.A1N;
                        new TextureViewSurfaceTextureListenerC55357OiJ(ph92.A01, viewGroup, ph92.A05, null, c47z, null, 0.0f, clipInfo.A09, clipInfo.A06, false, false);
                        return;
                    }
                    ClipInfo clipInfo2 = c47z.A1N;
                    if (clipInfo2 == null || (str = clipInfo2.A0F) == null) {
                        return;
                    }
                    VideoView videoView = (VideoView) AbstractC166997dE.A0R(ph92.A02, R.id.product_tagging_mp_video_preview_container);
                    videoView.setVisibility(0);
                    try {
                        videoView.setOnPreparedListener(C55339Oh4.A00);
                        videoView.setOnCompletionListener(new C48030LMz(videoView, 2));
                        if (C18U.A06(C06090Tz.A05, ph92.A05, 36318033004664660L)) {
                            videoView.setOnErrorListener(Oh1.A00);
                        }
                        videoView.setVideoPath(str);
                        return;
                    } catch (IllegalStateException unused2) {
                        C0w9.A01.EmN("ClipsProductTaggingController", "Failed to play video preview using file path in product tagging preview screen");
                        return;
                    }
                }
                return;
            }
        }
        C14360o3.A0F("clipsProductTaggingController");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N5Q.A01():void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && intent != null && i == 16) {
            PH9 ph9 = this.A02;
            if (ph9 == null) {
                C14360o3.A0F("clipsProductTaggingController");
                throw C00O.createAndThrow();
            }
            if (intent.getParcelableExtra("multi_product_picker_result") != null) {
                C38686GzR c38686GzR = ph9.A00;
                C41747IeL c41747IeL = AbstractC54344O0c.A00;
                String str = ph9.A07;
                String str2 = str;
                if (str == null) {
                    str = "";
                }
                C38686GzR A04 = c41747IeL.A04(intent, str);
                ph9.A00 = A04;
                C38686GzR A00 = AbstractC55225Oes.A00(c38686GzR, A04);
                ph9.A00 = A00;
                C47Z c47z = ph9.A06;
                if (c47z != null) {
                    c47z.A0q = A00;
                    UserSession userSession = ph9.A05;
                    boolean A002 = Ny2.A00(userSession);
                    ArrayList arrayList = c47z.A43;
                    C38686GzR c38686GzR2 = ph9.A00;
                    InterfaceC11380iw interfaceC11380iw = ph9.A04;
                    String str3 = str2;
                    if (str2 == null) {
                        str3 = "";
                    }
                    boolean A0t = c47z.A0t();
                    List A06 = AbstractC55225Oes.A06(c38686GzR, arrayList);
                    for (MediaSuggestedProductTag mediaSuggestedProductTag : AbstractC55225Oes.A06(c38686GzR2, arrayList)) {
                        if (!A06.contains(mediaSuggestedProductTag)) {
                            AbstractC55225Oes.A0B(interfaceC11380iw, userSession, mediaSuggestedProductTag, "add", str3, A0t, A002);
                        }
                    }
                    ArrayList arrayList2 = c47z.A43;
                    C38686GzR c38686GzR3 = ph9.A00;
                    if (str2 == null) {
                        str2 = "";
                    }
                    boolean A0t2 = c47z.A0t();
                    List<MediaSuggestedProductTag> A062 = AbstractC55225Oes.A06(c38686GzR, arrayList2);
                    List A063 = AbstractC55225Oes.A06(c38686GzR3, arrayList2);
                    for (MediaSuggestedProductTag mediaSuggestedProductTag2 : A062) {
                        if (!A063.contains(mediaSuggestedProductTag2)) {
                            AbstractC55225Oes.A0B(interfaceC11380iw, userSession, mediaSuggestedProductTag2, "remove", str2, A0t2, A002);
                        }
                    }
                }
            }
            A01();
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.setTitle(AbstractC31176DnK.A05(this, interfaceC56362iU).getString(2131955676));
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A06 = R.drawable.instagram_check_pano_outline_24;
        A0B.A0P = true;
        A0B.A02 = AbstractC31181DnP.A02(this);
        A0B.A05 = 2131961124;
        AbstractC31176DnK.A1B(ViewOnClickListenerC55466OkL.A01(this, 12), A0B, interfaceC56362iU);
        AbstractC31176DnK.A1C(ViewOnClickListenerC55466OkL.A01(this, 13), AbstractC31176DnK.A0I(), interfaceC56362iU);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1944035217);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = C25A.A00(AbstractC166987dD.A0r(this.A0A)).A03(requireArguments.getString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_PENDING_MEDIA_KEY"));
        this.A09 = requireArguments.getString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_WATERFALL_ID");
        this.A08 = requireArguments.getString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_BRANDED_CONTENT_TAG_USER_ID");
        requireArguments.getString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_BRANDED_CONTENT_TAG_USERNAME");
        this.A07 = (ShoppingCreationConfig) requireArguments.getParcelable("ClipsConstants.ARG_CLIPS_SHARE_SHEET_SHOPPING_CREATION_CONFIG");
        C0f9.A09(132169062, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2122345549);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_product_tagging_fragment, viewGroup, false);
        C0f9.A09(-1067245194, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1689203772);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        this.A06 = null;
        this.A05 = null;
        C0f9.A09(232886387, A02);
    }
}
