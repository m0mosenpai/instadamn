package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.ui.mediaactions.LikeActionView;

/* renamed from: X.3W3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3W3 extends C3OO implements C33R {
    public long A00;
    public C41H A01;
    public C75113Zb A02;
    public C33P A03;
    public boolean A04;
    public boolean A05;
    public final ViewGroup A06;
    public final C3W9 A07;
    public final C3W4 A08;
    public final ReboundViewPager A09;
    public final C3WA A0A;
    public final C3W7 A0B;
    public final C3W5 A0C;
    public final C3W8 A0D;
    public final LikeActionView A0E;
    public final View A0F;
    public final UserSession A0G;

    public final View A00() {
        Object tag;
        View view;
        View view2 = this.A09.A0F;
        if (view2 != null && (tag = view2.getTag()) != null) {
            if (tag instanceof C905741s) {
                view = ((C905741s) tag).A0F;
            } else if (tag instanceof C105184oY) {
                view = ((C105184oY) tag).A0E;
            } else if (tag instanceof C69228Vjw) {
                view = ((C69228Vjw) tag).A03;
            } else if (tag instanceof C81473kH) {
                view = ((C81473kH) tag).A04;
            } else {
                throw new IllegalArgumentException(AbstractC111324zv.A00(1856));
            }
            return view;
        }
        return null;
    }

    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        Object obj;
        C3YH c3yh;
        Adapter adapter;
        BaseAdapter baseAdapter;
        int i2;
        ReboundViewPager reboundViewPager;
        Runnable runnableC49897M1q;
        if (i != 18) {
            if (i != 38) {
                if (i != 22) {
                    if (i == 23) {
                        reboundViewPager = this.A09;
                        runnableC49897M1q = new RunnableC49898M1r(this);
                    } else {
                        return;
                    }
                } else {
                    reboundViewPager = this.A09;
                    runnableC49897M1q = new RunnableC49897M1q(this);
                }
                reboundViewPager.post(runnableC49897M1q);
                return;
            }
            Adapter adapter2 = this.A09.getAdapter();
            if (adapter2 != null) {
                if (!(adapter2 instanceof C41Q)) {
                    return;
                }
                baseAdapter = (BaseAdapter) adapter2;
                i2 = 563310743;
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            ReboundViewPager reboundViewPager2 = this.A09;
            View view = reboundViewPager2.A0F;
            if (view != null) {
                obj = view.getTag();
            } else {
                obj = null;
            }
            if (!(obj instanceof C905741s) || (c3yh = ((C905741s) obj).A0I.A04) == null || !c3yh.A06 || (adapter = reboundViewPager2.getAdapter()) == null || !(adapter instanceof C41Q)) {
                return;
            }
            baseAdapter = (BaseAdapter) adapter;
            i2 = -1050832465;
        }
        C0fA.A00(baseAdapter, i2);
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, X.3WA] */
    public C3W3(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        super(view);
        this.A0F = view;
        this.A0G = userSession;
        View requireViewById = view.requireViewById(R.id.carousel_media_group);
        C14360o3.A07(requireViewById);
        this.A06 = (ViewGroup) requireViewById;
        View requireViewById2 = view.requireViewById(R.id.like_heart);
        C14360o3.A07(requireViewById2);
        this.A0E = (LikeActionView) requireViewById2;
        this.A08 = new C3W4((ViewStub) view.requireViewById(R.id.audio_icon_view_stub));
        this.A0C = new C3W5((ViewStub) view.requireViewById(R.id.carousel_index_indicator_stub), userSession);
        View requireViewById3 = view.requireViewById(R.id.carousel_card_loading_indicator);
        C14360o3.A07(requireViewById3);
        this.A0B = new C3W7((ViewStub) requireViewById3);
        View requireViewById4 = view.requireViewById(R.id.save_to_collection_upsell_view_stub);
        C14360o3.A07(requireViewById4);
        ViewStub viewStub = (ViewStub) requireViewById4;
        C14360o3.A0B(viewStub, 0);
        this.A0D = new C3W8(viewStub, interfaceC11380iw);
        View requireViewById5 = view.requireViewById(R.id.branded_content_violation_banner);
        C14360o3.A07(requireViewById5);
        ViewStub viewStub2 = (ViewStub) requireViewById5;
        C14360o3.A0B(viewStub2, 0);
        this.A07 = new C3W9(viewStub2);
        View requireViewById6 = view.requireViewById(R.id.carousel_viewpager);
        C14360o3.A07(requireViewById6);
        this.A09 = (ReboundViewPager) requireViewById6;
        View requireViewById7 = view.requireViewById(R.id.media_note_view_stub);
        C14360o3.A07(requireViewById7);
        ViewStub viewStub3 = (ViewStub) requireViewById7;
        C14360o3.A0B(viewStub3, 1);
        ?? obj = new Object();
        obj.A00 = viewStub3;
        this.A0A = obj;
    }
}
