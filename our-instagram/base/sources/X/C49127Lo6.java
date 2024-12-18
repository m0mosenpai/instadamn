package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.Lo6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49127Lo6 implements C7QC {
    public final InterfaceC11380iw A00;
    public final C162907Rb A01;

    /* JADX WARN: Multi-variable type inference failed */
    public static C49127Lo6 A00(InterfaceC11380iw interfaceC11380iw, InterfaceC165247aD interfaceC165247aD, AnonymousClass988 anonymousClass988) {
        boolean z = anonymousClass988.A1U;
        C7AZ c7az = new C7AZ(z);
        return new C49127Lo6(interfaceC11380iw, new C162907Rb(Arrays.asList(new C1580177l(new C49007Llv(interfaceC165247aD), c7az.A00(interfaceC165247aD), new C7Q9(interfaceC165247aD, z), interfaceC165247aD, anonymousClass988), c7az)));
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        View A01;
        IgImageView A0Z;
        TextView A0T;
        int i;
        C49167Lok c49167Lok = (C49167Lok) c7qd;
        KT6 kt6 = (KT6) interfaceC129555tK;
        LinearLayout linearLayout = c49167Lok.A02;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        c49167Lok.A07.A03(8);
        c49167Lok.A06.A03(8);
        RoundedCornerMediaFrameLayout roundedCornerMediaFrameLayout = c49167Lok.A09;
        roundedCornerMediaFrameLayout.setVisibility(8);
        IgProgressImageView igProgressImageView = c49167Lok.A08;
        igProgressImageView.A0B(false);
        C57012jc c57012jc = c49167Lok.A04;
        c57012jc.A03(8);
        C57012jc c57012jc2 = c49167Lok.A05;
        c57012jc2.A03(8);
        int i2 = 8388611;
        if (kt6.CVC()) {
            i2 = 8388613;
        }
        linearLayout.setGravity(i2);
        ((MediaFrameLayout) roundedCornerMediaFrameLayout).A00 = 0.6666667f;
        igProgressImageView.setAspectRatio(0.6666667f);
        AbstractC46445Kh5 abstractC46445Kh5 = kt6.A02;
        if (abstractC46445Kh5 instanceof C45940KUr) {
            C45940KUr c45940KUr = (C45940KUr) abstractC46445Kh5;
            roundedCornerMediaFrameLayout.setVisibility(0);
            float A00 = AbstractC1580577p.A00(kt6.A00);
            roundedCornerMediaFrameLayout.A01(A00, A00, A00, A00);
            C7QY c7qy = kt6.A01;
            AbstractC1583778x abstractC1583778x = c7qy.A0F;
            if (abstractC1583778x instanceof C158737Aj) {
                igProgressImageView.setExpiration(c45940KUr.A01);
                igProgressImageView.setUrl(((C158737Aj) abstractC1583778x).A00, interfaceC11380iw);
            } else if (abstractC1583778x instanceof C45931KUi) {
                igProgressImageView.setBackgroundColor(((C45931KUi) abstractC1583778x).A00);
            } else {
                throw AbstractC43594JPz.A0o(abstractC1583778x, "Invalid MediaFields: ", AbstractC166987dD.A1C());
            }
            if (c45940KUr.A05) {
                c57012jc2.A03(8);
                A01 = c57012jc.A01();
                AbstractC31172DnG.A1J(A01, R.id.iglive_label_row_layout, 0);
                C3PO c3po = c45940KUr.A03;
                C3PO c3po2 = C3PO.A0A;
                C3PX c3px = c49167Lok.A00;
                if (c3px == null) {
                    c3px = C3PW.A00(c57012jc.A01(), R.id.iglive_label_image_stub);
                    c49167Lok.A00 = c3px;
                }
                if (c3po == c3po2) {
                    c3px.A00().setVisibility(0);
                } else if (c3px.A01()) {
                    c3px.A00().setVisibility(8);
                }
                View requireViewById = A01.requireViewById(R.id.iglive_label_layout);
                switch (AbstractC25227BEk.A05(c3po, 0)) {
                    case 0:
                    case 4:
                        i = R.drawable.live_label_background;
                        break;
                    case 1:
                        i = R.drawable.live_practice_label_background;
                        break;
                    case 2:
                        i = R.drawable.live_subscribers_label_background;
                        break;
                    case 3:
                        i = R.drawable.live_close_friends_label_background;
                        break;
                    case 5:
                        i = R.drawable.live_channel_label_background;
                        break;
                    case 6:
                        i = R.drawable.live_internal_label_background;
                        break;
                    default:
                        throw B4Z.A00();
                }
                requireViewById.setBackgroundResource(i);
                A0Z = AbstractC31172DnG.A0Z(A01, R.id.reel_viewer_profile_picture);
                A0T = AbstractC166997dE.A0T(A01, R.id.iglive_header_main_text);
                AbstractC31172DnG.A1J(A01, R.id.iglive_header_close, 8);
                View requireViewById2 = A01.requireViewById(R.id.iglive_view_count_container);
                int i3 = c45940KUr.A00;
                if (i3 > 0) {
                    TextView A0T2 = AbstractC166997dE.A0T(A01, R.id.iglive_view_count);
                    requireViewById2.setVisibility(0);
                    Integer valueOf = Integer.valueOf(i3);
                    Resources resources = A0T2.getResources();
                    C14360o3.A0B(resources, 1);
                    A0T2.setText(C84963qk.A04(resources, valueOf, 10000, false, false));
                } else {
                    requireViewById2.setVisibility(8);
                }
            } else {
                c57012jc.A03(8);
                A01 = c57012jc2.A01();
                A0Z = AbstractC31172DnG.A0Z(A01, R.id.reel_viewer_profile_picture);
                A0T = AbstractC166997dE.A0T(A01, R.id.primary_text);
            }
            A01.setVisibility(0);
            C1583678w c1583678w = c7qy.A0E;
            c1583678w.getClass();
            List list = c1583678w.A0A;
            if (!list.isEmpty()) {
                A0Z.setUrl((ImageUrl) list.get(0), interfaceC11380iw);
            }
            if (list.size() > 1) {
                C0w9.A03("LiveViewerInviteContentDefinition", "Header icons size was larger than expected");
            }
            A0T.setText(c1583678w.A03);
            String str = c45940KUr.A04;
            if (str != null && !str.isEmpty()) {
                c49167Lok.A03.setText(str);
            }
        }
        this.A01.A02(c49167Lok, kt6);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        this.A01.A01(c7qd);
    }

    public C49127Lo6(InterfaceC11380iw interfaceC11380iw, C162907Rb c162907Rb) {
        this.A01 = c162907Rb;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.direct_live_viewer_invite_message);
        C7N9.A01(A0A);
        C49167Lok c49167Lok = new C49167Lok(A0A);
        this.A01.A00(c49167Lok);
        return c49167Lok;
    }
}
