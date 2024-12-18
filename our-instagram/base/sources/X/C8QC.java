package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Arrays;

/* renamed from: X.8QC, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8QC {
    public static final void A00(View view, int i) {
        C14360o3.A0B(view, 0);
        View requireViewById = view.requireViewById(R.id.post_capture_button_share_container_stub);
        C14360o3.A07(requireViewById);
        ViewStub viewStub = (ViewStub) requireViewById;
        viewStub.setLayoutResource(i);
        viewStub.inflate();
    }

    public static final void A01(View view, UserSession userSession, boolean z) {
        C14360o3.A0B(view, 2);
        if (z && !AbstractC23021Ah.A00(userSession).A01.getBoolean("has_seen_valentines_sticker_tray_icon", false) && C18U.A06(C06090Tz.A05, userSession, 36322963624045330L)) {
            Handler handler = new Handler(Looper.getMainLooper());
            handler.postDelayed(new RunnableC24648Avi(view, userSession), 1000L);
            handler.postDelayed(new RunnableC24388ArV(view), 6000L);
        }
    }

    public static final void A04(ImageView imageView, Integer num) {
        Context context;
        int i;
        boolean z;
        C14360o3.A0B(imageView, 0);
        C14360o3.A0B(num, 1);
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    z = false;
                    A05(new View[]{imageView}, z);
                }
                throw new RuntimeException();
            }
            imageView.setSelected(true);
            context = imageView.getContext();
            i = R.drawable.instagram_volume_off_outline_44;
        } else {
            imageView.setSelected(false);
            context = imageView.getContext();
            i = R.drawable.instagram_volume_outline_44;
        }
        imageView.setImageDrawable(context.getDrawable(i));
        z = true;
        A05(new View[]{imageView}, z);
    }

    public static final void A05(View[] viewArr, boolean z) {
        A06((View[]) Arrays.copyOf(viewArr, 1), z, false);
    }

    public static final void A06(View[] viewArr, boolean z, boolean z2) {
        C14360o3.A0B(viewArr, 2);
        View[] viewArr2 = (View[]) Arrays.copyOf(viewArr, viewArr.length);
        C14360o3.A0B(viewArr2, 3);
        for (View view : viewArr2) {
            if (view != null) {
                if (z) {
                    view.setEnabled(true);
                    AbstractC125325le.A04(null, new View[]{view}, z2);
                } else {
                    AbstractC125325le.A05(new View[]{view}, z2);
                }
            }
        }
    }

    public static final boolean A07(C1816783z c1816783z) {
        C14360o3.A0B(c1816783z, 0);
        C1815483h c1815483h = c1816783z.A01;
        boolean A0K = C14360o3.A0K(c1815483h.A0m, "expiring_media_message");
        boolean z = false;
        boolean z2 = false;
        if (c1815483h.A0D == C05F.A0I) {
            z2 = true;
        }
        if (A0K || z2 || c1816783z.A0A()) {
            z = true;
        }
        return !z;
    }

    public static final void A02(View view, final InterfaceC16660sJ interfaceC16660sJ, final InterfaceC16660sJ interfaceC16660sJ2) {
        C3P9 c3p9 = new C3P9(view);
        c3p9.A04 = new C3PD() { // from class: X.7mH
            @Override // X.C3PD, X.C3PE
            public final void DQY(View view2) {
                C14360o3.A0B(view2, 0);
                interfaceC16660sJ2.invoke(view2);
            }

            @Override // X.C3PD, X.C3PE
            public final boolean DsE(View view2) {
                C14360o3.A0B(view2, 0);
                InterfaceC16660sJ.this.invoke(view2);
                return true;
            }
        };
        c3p9.A00();
    }

    public static final boolean A08(EnumC1810181d enumC1810181d, EnumC1810381f enumC1810381f) {
        if (enumC1810381f == EnumC1810381f.A02 && enumC1810181d != EnumC1810181d.A0G && enumC1810181d != EnumC1810181d.A08 && enumC1810181d != EnumC1810181d.A11) {
            return false;
        }
        return true;
    }

    public static void A03(View view, boolean z) {
        A05(new View[]{view}, z);
    }
}
