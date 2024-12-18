package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;
import com.facebook.R;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.List;

/* renamed from: X.KCh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45492KCh extends AbstractC59962oe implements InterfaceC62892tS {
    public static final String __redex_internal_original_name = "ChannelCreationNuxCarouselFragment";
    public int A00;
    public InterfaceC62892tS A01;
    public InterfaceC62892tS A02;
    public ReboundViewPager A03;
    public List A04;
    public boolean A05 = true;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DXP(int i, int i2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DXb(int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void Diq(C3VZ c3vz, float f, float f2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void Diy(C3VZ c3vz, C3VZ c3vz2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DrZ(int i, int i2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DyE(int i, float f) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void E0r(View view) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "channel_creation_nux_carousel_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A03 = (ReboundViewPager) view.requireViewById(R.id.nux_pager);
        C41L c41l = (C41L) AbstractC166997dE.A0R(view, R.id.page_indicator);
        InterfaceC62892tS interfaceC62892tS = this.A02;
        if (interfaceC62892tS != null) {
            ReboundViewPager reboundViewPager = this.A03;
            if (reboundViewPager != null) {
                reboundViewPager.A0P(interfaceC62892tS);
            }
            C14360o3.A0F("viewPager");
            throw C00O.createAndThrow();
        }
        ReboundViewPager reboundViewPager2 = this.A03;
        if (reboundViewPager2 != null) {
            reboundViewPager2.A0P(c41l);
            List list = this.A04;
            if (list != null) {
                int size = list.size();
                this.A00 = size;
                if (size == 0) {
                    c41l.setVisibility(8);
                } else {
                    if (size > 1) {
                        c41l.A01(0, size);
                        c41l.setVisibility(0);
                    }
                    C44419JkE c44419JkE = new C44419JkE(AbstractC166987dD.A0r(this.A06), new C47320KvV(this), new C47321KvW(this), list);
                    ReboundViewPager reboundViewPager3 = this.A03;
                    if (reboundViewPager3 != null) {
                        reboundViewPager3.setAdapter(c44419JkE);
                        ReboundViewPager reboundViewPager4 = this.A03;
                        if (reboundViewPager4 != null) {
                            reboundViewPager4.setCarouselModeEnabled(true);
                            C48549Ldm c48549Ldm = new C48549Ldm(this, 2);
                            this.A01 = c48549Ldm;
                            ReboundViewPager reboundViewPager5 = this.A03;
                            if (reboundViewPager5 != null) {
                                reboundViewPager5.A0P(c48549Ldm);
                            }
                        }
                    }
                }
            }
            A00(this);
            return;
        }
        C14360o3.A0F("viewPager");
        throw C00O.createAndThrow();
    }

    public static final void A00(C45492KCh c45492KCh) {
        ReboundViewPager reboundViewPager = c45492KCh.A03;
        if (reboundViewPager == null) {
            C14360o3.A0F("viewPager");
            throw C00O.createAndThrow();
        }
        View view = reboundViewPager.A0F;
        if (view != null) {
            VideoView videoView = (VideoView) AbstractC166997dE.A0R(view, R.id.video);
            if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(c45492KCh.A06), 36318033004664660L)) {
                videoView.setOnErrorListener(LN4.A00);
            }
            videoView.seekTo(0);
            videoView.start();
        }
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ boolean CtU() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1580523892);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_channels_nux_carousel, false);
        C0f9.A09(-516380671, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1890665582);
        super.onDestroyView();
        InterfaceC62892tS interfaceC62892tS = this.A02;
        if (interfaceC62892tS != null) {
            ReboundViewPager reboundViewPager = this.A03;
            if (reboundViewPager != null) {
                reboundViewPager.A0Q(interfaceC62892tS);
                this.A02 = null;
            }
            C14360o3.A0F("viewPager");
            throw C00O.createAndThrow();
        }
        InterfaceC62892tS interfaceC62892tS2 = this.A01;
        if (interfaceC62892tS2 != null) {
            ReboundViewPager reboundViewPager2 = this.A03;
            if (reboundViewPager2 != null) {
                reboundViewPager2.A0Q(interfaceC62892tS2);
                this.A01 = null;
            }
            C14360o3.A0F("viewPager");
            throw C00O.createAndThrow();
        }
        C0f9.A09(130011896, A02);
    }
}
