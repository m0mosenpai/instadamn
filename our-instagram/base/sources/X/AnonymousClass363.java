package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.feed.widget.IgProgressImageView;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.363, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass363 extends AbstractC682735p {
    /* JADX WARN: Type inference failed for: r5v2, types: [X.0Zx, X.5jq] */
    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        View view;
        View findViewById;
        ReboundViewPager reboundViewPager;
        View view2;
        IgImageView igImageView;
        C73083Pj c73083Pj;
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        Object obj = c59062n7.A03;
        C14360o3.A06(obj);
        C5Ln A02 = A02((C38321qM) obj);
        if (interfaceC57162jr.CFq(c59062n7) != C05F.A0C && (view = (View) ((AbstractC682735p) this).A00.get(obj)) != null && (findViewById = view.findViewById(R.id.carousel_media_group)) != null && (reboundViewPager = (ReboundViewPager) findViewById.findViewById(R.id.carousel_viewpager)) != null && (view2 = reboundViewPager.A0F) != null) {
            IgProgressImageView igProgressImageView = (IgProgressImageView) view2.findViewById(R.id.carousel_image);
            IgProgressImageView igProgressImageView2 = (IgProgressImageView) view2.findViewById(R.id.carousel_video_image);
            if (igProgressImageView != null) {
                igImageView = igProgressImageView.getIgImageView();
            } else if (igProgressImageView2 == null) {
                return;
            } else {
                igImageView = igProgressImageView2.getIgImageView();
            }
            int currentDataIndex = reboundViewPager.getCurrentDataIndex();
            C38321qM c38321qM = A02.A0K;
            if (currentDataIndex >= c38321qM.A0p()) {
                C0w9.A03("AD_RENDERING_ACTION_PROVIDER", "Carousel view was accessed during update.");
                return;
            }
            StringBuilder sb = new StringBuilder(144);
            C75113Zb c75113Zb = (C75113Zb) c59062n7.A04;
            WeakReference weakReference = c75113Zb.A1b;
            if (weakReference != null) {
                c73083Pj = (C73083Pj) weakReference.get();
            } else {
                c73083Pj = null;
            }
            igImageView.A08(sb);
            ((C5Lo) A02).A02 = igImageView.getMeasuredHeight();
            ((C5Lo) A02).A03 = igImageView.getMeasuredWidth();
            if (c73083Pj != null) {
                A02.A03 = c73083Pj;
            }
            ((C5Lo) A02).A09 = sb.toString();
            ?? c0Zx = new C0Zx();
            C38321qM A1e = c38321qM.A1e(currentDataIndex);
            if (A1e == null) {
                A1e = c38321qM;
            }
            c0Zx.A06("carousel_media_id", A1e.getId());
            c0Zx.A06("carousel_media_type", A1e.BRp().name());
            Long valueOf = Long.valueOf(currentDataIndex);
            c0Zx.A05("index_of_card", valueOf);
            c0Zx.A05("number_of_cards", Long.valueOf(c38321qM.A0p()));
            String str = c75113Zb.A1C;
            Map map = A02.A0F;
            if (map != null) {
                map.put(valueOf, str);
            }
            String str2 = c75113Zb.A1E;
            Map map2 = A02.A0G;
            if (map2 != null) {
                map2.put(valueOf, str2);
            }
            c0Zx.A08("cta_secondary_texts", map);
            c0Zx.A08("cta_text_dividers", map2);
            A02.A02 = c0Zx;
        }
    }
}
