package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import java.util.Map;

/* renamed from: X.6XU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6XU {
    public final View A00;
    public final C140536Xh A01;
    public final C140516Xf A02;
    public final C6XV A03;
    public final C140486Xc A04;
    public final C140526Xg A05;
    public final C140496Xd A06;
    public final C140506Xe A07;
    public final Map A08;
    public final InterfaceC16600sD A09;
    public final InterfaceC16600sD A0A;
    public final InterfaceC16600sD A0B;
    public final InterfaceC16600sD A0C;
    public final InterfaceC16600sD A0D;
    public final InterfaceC16600sD A0E;
    public final InterfaceC16600sD A0F;

    public C6XU(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = view;
        View requireViewById = view.requireViewById(R.id.reel_viewer_superlative_intro_view_stub);
        C14360o3.A07(requireViewById);
        C6XV c6xv = new C6XV((ViewStub) requireViewById);
        this.A03 = c6xv;
        C9EP c9ep = new C9EP(this, 7);
        this.A0B = c9ep;
        View requireViewById2 = this.A00.requireViewById(R.id.reel_viewer_superlative_lots_of_heart_view_stub);
        C14360o3.A07(requireViewById2);
        C140486Xc c140486Xc = new C140486Xc((ViewStub) requireViewById2);
        this.A04 = c140486Xc;
        C9EP c9ep2 = new C9EP(this, 8);
        this.A0C = c9ep2;
        View requireViewById3 = this.A00.requireViewById(R.id.reel_viewer_superlative_top_account_view_stub);
        C14360o3.A07(requireViewById3);
        C140496Xd c140496Xd = new C140496Xd((ViewStub) requireViewById3);
        this.A06 = c140496Xd;
        C9EP c9ep3 = new C9EP(this, 10);
        this.A0E = c9ep3;
        View requireViewById4 = this.A00.requireViewById(R.id.reel_viewer_superlative_top_content_view_stub);
        C14360o3.A07(requireViewById4);
        C140506Xe c140506Xe = new C140506Xe((ViewStub) requireViewById4);
        this.A07 = c140506Xe;
        C9EP c9ep4 = new C9EP(this, 11);
        this.A0F = c9ep4;
        View requireViewById5 = this.A00.requireViewById(R.id.reel_viewer_superlative_day_one_view_stub);
        C14360o3.A07(requireViewById5);
        C140516Xf c140516Xf = new C140516Xf((ViewStub) requireViewById5);
        this.A02 = c140516Xf;
        C9EP c9ep5 = new C9EP(this, 5);
        this.A09 = c9ep5;
        View requireViewById6 = this.A00.requireViewById(R.id.reel_viewer_superlative_tag_teammate_view_stub);
        C14360o3.A07(requireViewById6);
        C140526Xg c140526Xg = new C140526Xg((ViewStub) requireViewById6);
        this.A05 = c140526Xg;
        C9EP c9ep6 = new C9EP(this, 9);
        this.A0D = c9ep6;
        View requireViewById7 = this.A00.requireViewById(R.id.reel_viewer_superlative_conclusion_view_stub);
        C14360o3.A07(requireViewById7);
        C140536Xh c140536Xh = new C140536Xh((ViewStub) requireViewById7);
        this.A01 = c140536Xh;
        C9EP c9ep7 = new C9EP(this, 6);
        this.A0A = c9ep7;
        this.A08 = AbstractC06930Yk.A06(new C09530e4(EnumC41231vY.A0X, new C140546Xi(c6xv, c9ep)), new C09530e4(EnumC41231vY.A0Y, new C140546Xi(c140486Xc, c9ep2)), new C09530e4(EnumC41231vY.A0a, new C140546Xi(c140496Xd, c9ep3)), new C09530e4(EnumC41231vY.A0b, new C140546Xi(c140506Xe, c9ep4)), new C09530e4(EnumC41231vY.A0V, new C140546Xi(c140516Xf, c9ep5)), new C09530e4(EnumC41231vY.A0Z, new C140546Xi(c140526Xg, c9ep6)), new C09530e4(EnumC41231vY.A0W, new C140546Xi(c140536Xh, c9ep7)));
    }
}
