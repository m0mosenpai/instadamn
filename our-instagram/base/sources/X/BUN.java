package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class BUN extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BUN(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, boolean z) {
        super(0);
        this.A00 = i;
        this.A06 = obj;
        this.A03 = obj2;
        this.A07 = z;
        this.A01 = obj3;
        this.A05 = obj4;
        this.A04 = obj5;
        this.A02 = obj6;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        long millis;
        Runnable runnableC71635Wxh;
        View view;
        String str;
        C3EZ c3ez;
        C8m c8m;
        switch (this.A00) {
            case 0:
                UserSession userSession = (UserSession) this.A06;
                ViewGroup viewGroup = (ViewGroup) this.A03;
                boolean z = this.A07;
                return new C8GH(viewGroup, userSession, (C1810981l) this.A01, (C8A0) this.A04, (InterfaceC1810081c) this.A05, (ClipsCreationViewModel) this.A02, z);
            case 1:
                C177977vW c177977vW = (C177977vW) this.A06;
                C206279Bk c206279Bk = (C206279Bk) this.A04;
                Medium medium = (Medium) this.A02;
                Bitmap bitmap = (Bitmap) this.A01;
                C195578kx c195578kx = (C195578kx) this.A03;
                if (c206279Bk.A03 == C05F.A01) {
                    String valueOf = String.valueOf(medium.A05);
                    C14360o3.A0B(bitmap, 0);
                    Map map = AbstractC188868Yc.A00;
                    BackgroundGradientColors backgroundGradientColors = (BackgroundGradientColors) map.get(valueOf);
                    if (backgroundGradientColors == null) {
                        backgroundGradientColors = AbstractC14570oV.A01(bitmap, C05F.A00);
                        map.put(valueOf, backgroundGradientColors);
                    }
                    medium.A0H = backgroundGradientColors;
                    C177967vV c177967vV = c177977vW.A03;
                    GradientDrawable gradientDrawable = c177967vV.A01;
                    if (gradientDrawable == null) {
                        gradientDrawable = new GradientDrawable();
                        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                        gradientDrawable.setDither(true);
                        c177967vV.A01 = gradientDrawable;
                    }
                    gradientDrawable.setColors(new int[]{backgroundGradientColors.A01, backgroundGradientColors.A00});
                } else {
                    c177977vW.A03.A01 = null;
                }
                C006802i.A0p.markerEnd(18949957, medium.A05, (short) 2);
                if (c195578kx != null) {
                    C1KM.A09.A0H(new SimpleImageUrl(medium.A02().toString()), c195578kx.A00, "gallery");
                }
                return C0eB.A00;
            case 2:
                boolean z2 = this.A07;
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A06;
                if (z2) {
                    C14360o3.A0B(abstractC12990ll, 0);
                    millis = TimeUnit.SECONDS.toMillis(C18U.A01(C06090Tz.A05, abstractC12990ll, 36609128705824614L));
                    TextView textView = (TextView) this.A05;
                    runnableC71635Wxh = new RunnableC29585D1m(textView, (CharSequence) this.A04);
                    view = textView;
                } else {
                    C14360o3.A0B(abstractC12990ll, 0);
                    millis = TimeUnit.SECONDS.toMillis(C18U.A01(C06090Tz.A05, abstractC12990ll, 36609128705824614L));
                    View view2 = (View) this.A02;
                    View view3 = (View) this.A01;
                    C43210J8h c43210J8h = new C43210J8h(0, this.A05, this.A04, this.A03);
                    runnableC71635Wxh = new RunnableC71635Wxh(view2, view3, C29377CxA.A00, C29378CxB.A00, "hide_memory_badge_animator_key", C29809DDb.A00, C29810DDc.A00, c43210J8h);
                    view = view2;
                }
                view.postDelayed(runnableC71635Wxh, millis);
                return C0eB.A00;
            default:
                if (this.A07) {
                    ((C97T) this.A01).A00((Context) this.A02);
                    c3ez = (C3EZ) this.A04;
                    c8m = C8m.UPDATE_TO_ALPHA;
                } else {
                    Context context = (Context) this.A02;
                    C14360o3.A0B(context, 0);
                    PackageManager packageManager = context.getPackageManager();
                    String packageName = context.getPackageName();
                    String str2 = AbstractC14490oL.A02;
                    try {
                        str = packageManager.getInstallerPackageName(packageName);
                        if (str == null) {
                            str = "";
                        }
                    } catch (IllegalArgumentException unused) {
                        str = "unknown";
                    }
                    if (AbstractC58317Pt9.A00(249).equals(str)) {
                        C3EW c3ew = (C3EW) this.A03;
                        c3ew.A00(3600000L);
                        c3ew.A02(false);
                        AbstractC14490oL.A07(context, AbstractC58317Pt9.A00(0), null);
                        c3ez = (C3EZ) this.A04;
                        c8m = C8m.UPDATE_GOOGLE_PLAY;
                    } else {
                        ((InterfaceC74953Yl) this.A06).Egh(true);
                        return C0eB.A00;
                    }
                }
                c3ez.A00(c8m);
                ((InterfaceC16820sZ) this.A05).invoke();
                return C0eB.A00;
        }
    }
}
