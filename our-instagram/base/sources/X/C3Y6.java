package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.tagging.widget.MediaTagHintsLayout;
import com.instagram.tagging.widget.TagsLayout;
import com.instagram.ui.mediaactions.LikeActionView;
import com.instagram.ui.mediaactions.MediaActionsView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3Y6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Y6 extends C3OO implements C3Y7, C33R {
    public static final int[] A0K = {R.id.collection_thumbnail_1, R.id.collection_thumbnail_2, R.id.collection_thumbnail_3, R.id.collection_thumbnail_4, R.id.collection_thumbnail_5, R.id.collection_thumbnail_6, R.id.collection_thumbnail_7, R.id.collection_thumbnail_8, R.id.collection_thumbnail_9};
    public C75113Zb A00;
    public final View A01;
    public final View A02;
    public final C3W4 A03;
    public final IgFrameLayout A04;
    public final C3YA A05;
    public final C3W8 A06;
    public final C3YC A07;
    public final C3Y8 A08;
    public final C3Y1 A09;
    public final IgProgressImageView A0A;
    public final C3YD A0B;
    public final C3YJ A0C;
    public final LikeActionView A0D;
    public final MediaActionsView A0E;
    public final MediaFrameLayout A0F;
    public final Map A0G;
    public final View A0H;
    public final C3YG A0I;
    public final C3YH A0J;

    @Override // X.C3Y7
    public final C86083sf B61() {
        return null;
    }

    @Override // X.C3Y7
    public final InterfaceC80343iO BRd() {
        return null;
    }

    @Override // X.C3Y7
    public final C86033sa BS3() {
        return null;
    }

    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c75113Zb, 0);
        this.A09.DSJ(c75113Zb, i);
    }

    @Override // X.C3Y7
    public final void EgX(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, boolean z) {
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        this.A0A.A09(interfaceC11380iw, imageUrl, z);
    }

    @Override // X.C3Y7
    public final C3W4 Adr() {
        return this.A03;
    }

    @Override // X.C3Y7
    public final InterfaceC74323Vo B62() {
        return this.A0E;
    }

    @Override // X.C3Y7
    public final View BGa() {
        return this.A0A;
    }

    @Override // X.C3Y7
    public final View BQt() {
        return this.A0F;
    }

    @Override // X.C3Y7
    public final C75113Zb BRY() {
        return this.A00;
    }

    @Override // X.C3Y7
    public final InterfaceC74623Ww C6y() {
        return this.A0F;
    }

    @Override // X.C3Y7
    public final /* synthetic */ int C6z() {
        return -1;
    }

    @Override // X.C3Y7
    public final int CFi() {
        return this.A0E.getWidth();
    }

    @Override // X.C3Y7
    public final void EFy(int i) {
        this.A0A.A06(i);
    }

    public C3Y6(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C3Y1 c3y1) {
        super(view);
        View requireViewById = view.requireViewById(R.id.collection_root_view);
        C14360o3.A07(requireViewById);
        this.A01 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.vertical_collection_view);
        C14360o3.A07(requireViewById2);
        this.A02 = requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.collection_main_media_group);
        C14360o3.A07(requireViewById3);
        this.A0F = (MediaFrameLayout) requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.collection_media_view);
        C14360o3.A07(requireViewById4);
        this.A0H = requireViewById4;
        View requireViewById5 = view.requireViewById(R.id.collection_main_image);
        C14360o3.A07(requireViewById5);
        this.A0A = (IgProgressImageView) requireViewById5;
        this.A08 = new C3Y8((ViewStub) view.requireViewById(R.id.zero_rating_video_play_button_stub));
        View requireViewById6 = view.requireViewById(R.id.row_feed_media_actions);
        C14360o3.A07(requireViewById6);
        this.A0E = (MediaActionsView) requireViewById6;
        this.A03 = new C3W4((ViewStub) view.requireViewById(R.id.audio_icon_view_stub));
        View requireViewById7 = view.requireViewById(R.id.like_heart);
        C14360o3.A07(requireViewById7);
        this.A0D = (LikeActionView) requireViewById7;
        View requireViewById8 = requireViewById.requireViewById(R.id.collection_thumbnails);
        C14360o3.A07(requireViewById8);
        this.A04 = (IgFrameLayout) requireViewById8;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int[] iArr = A0K;
        int i = 0;
        do {
            int i2 = iArr[i];
            View requireViewById9 = this.A01.requireViewById(i2);
            C14360o3.A07(requireViewById9);
            linkedHashMap.put(Integer.valueOf(i2), new C3Y9((MediaFrameLayout) requireViewById9));
            i++;
        } while (i < 9);
        this.A0G = linkedHashMap;
        View requireViewById10 = view.requireViewById(R.id.collection_thumbnail_hscroll_row_stub);
        C14360o3.A07(requireViewById10);
        this.A05 = new C3YA((ViewStub) requireViewById10, userSession);
        View requireViewById11 = view.requireViewById(R.id.save_to_collection_upsell_view_stub);
        C14360o3.A07(requireViewById11);
        ViewStub viewStub = (ViewStub) requireViewById11;
        C14360o3.A0B(viewStub, 0);
        this.A06 = new C3W8(viewStub, interfaceC11380iw);
        View requireViewById12 = view.requireViewById(R.id.main_media);
        C14360o3.A07(requireViewById12);
        this.A07 = new C3YC(requireViewById12);
        C3YD c3yd = new C3YD(view, userSession, R.id.row_feed_media_tag_indicator_stub);
        this.A0B = c3yd;
        View requireViewById13 = view.requireViewById(R.id.row_feed_photo_media_tag_hints);
        C14360o3.A07(requireViewById13);
        C3YG c3yg = new C3YG(userSession, (MediaTagHintsLayout) requireViewById13);
        this.A0I = c3yg;
        View requireViewById14 = view.requireViewById(R.id.row_feed_photo_tags);
        C14360o3.A07(requireViewById14);
        C3YH c3yh = new C3YH((TagsLayout) requireViewById14);
        this.A0J = c3yh;
        this.A09 = c3y1;
        this.A0C = new C3YJ(c3yg, c3yd, null, null, c3yh, new C3YI(view));
    }
}
