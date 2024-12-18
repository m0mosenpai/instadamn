package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.HashSet;

/* renamed from: X.7Ky, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161377Ky {
    public final InterfaceC161217Kg A00;
    public final InterfaceC161337Ku A01;
    public final C7L2 A03;
    public final C161387Kz A05 = new C161387Kz();
    public final C7L0 A04 = new InterfaceC161277Km() { // from class: X.7L0
        public final AnonymousClass541 A00 = AnonymousClass541.A0G;
        public final HashSet A01 = new HashSet();

        @Override // X.InterfaceC161277Km
        public final void ADX(C47701L4i c47701L4i, C7L3 c7l3, String str, boolean z, boolean z2) {
            C14360o3.A0B(c47701L4i, 0);
            C14360o3.A0B(str, 1);
            C14360o3.A0B(c7l3, 2);
            View view = c47701L4i.A02;
            C14360o3.A0C(view, "null cannot be cast to non-null type com.facebook.xac.powerups.giftbox.GiftBoxOverlayView");
            UAW uaw = (UAW) view;
            uaw.setCornerRadiusPx(c7l3.A00);
            if (this.A01.contains(str)) {
                uaw.setVisibility(8);
            }
        }

        @Override // X.InterfaceC161277Km
        public final boolean CRi(String str) {
            C14360o3.A0B(str, 0);
            return !this.A01.contains(str);
        }

        @Override // X.InterfaceC161277Km
        public final C47701L4i Csm(Context context, ShapeDrawable shapeDrawable, View view, ViewGroup viewGroup, ImageView imageView, C162867Qx c162867Qx) {
            C14360o3.A0B(context, 0);
            return new C47701L4i(shapeDrawable, null, new UAW(context, X5M.A00), new UAP(context), null, viewGroup, null, c162867Qx);
        }

        @Override // X.InterfaceC161277Km
        public final boolean D3T(C47701L4i c47701L4i, C7L3 c7l3, String str, boolean z) {
            C14360o3.A0B(c47701L4i, 0);
            C14360o3.A0B(str, 1);
            ViewGroup viewGroup = c47701L4i.A05;
            if (viewGroup != null) {
                HashSet hashSet = this.A01;
                if (!hashSet.contains(str)) {
                    hashSet.add(str);
                    View view = c47701L4i.A02;
                    C14360o3.A0C(view, "null cannot be cast to non-null type com.facebook.xac.powerups.giftbox.GiftBoxOverlayView");
                    UAW uaw = (UAW) view;
                    View view2 = c47701L4i.A03;
                    C14360o3.A0C(view2, "null cannot be cast to non-null type com.facebook.xac.powerups.giftbox.GiftBoxReleaseView");
                    UAP uap = (UAP) view2;
                    uap.setVisibility(0);
                    uap.A01 = new C65076Td9(38, uap, viewGroup);
                    U8X u8x = uaw.A00;
                    if (u8x == null) {
                        return false;
                    }
                    u8x.setCallback(null);
                    uaw.A00 = null;
                    uaw.removeCallbacks(uaw.A04);
                    uaw.invalidate();
                    viewGroup.setVisibility(0);
                    viewGroup.addView(uap);
                    u8x.setCallback(uap);
                    uaw.getLocationInWindow(r5);
                    Rect bounds = u8x.getBounds();
                    C14360o3.A07(bounds);
                    int[] iArr = {iArr[0] + bounds.left, iArr[1] + bounds.top};
                    int[] iArr2 = new int[2];
                    uap.getLocationInWindow(iArr2);
                    int i = iArr[0] - iArr2[0];
                    int i2 = iArr[1] - iArr2[1];
                    u8x.setBounds(0, 0, bounds.width(), bounds.height());
                    C69207Vja c69207Vja = new C69207Vja(u8x);
                    C69627VsU c69627VsU = c69207Vja.A03;
                    c69627VsU.A05 = i;
                    c69627VsU.A06 = i2;
                    c69627VsU.A00 = u8x.getBounds().centerX();
                    c69627VsU.A01 = u8x.getBounds().centerY();
                    C69719VuE c69719VuE = c69207Vja.A02;
                    c69719VuE.A09 = uap.A03;
                    c69719VuE.A01 = uap.A02;
                    uap.A07.add(c69207Vja);
                    uap.invalidate();
                    Runnable runnable = uap.A06;
                    uap.removeCallbacks(runnable);
                    if (uap.getWindowToken() != null) {
                        uap.postOnAnimation(runnable);
                    }
                    Context context = viewGroup.getContext();
                    C14360o3.A07(context);
                    Object systemService = context.getSystemService("vibrator");
                    C14360o3.A0C(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                    ((Vibrator) systemService).vibrate(VibrationEffect.createOneShot(50L, 50));
                    return true;
                }
            }
            return false;
        }

        @Override // X.InterfaceC161277Km
        public final /* synthetic */ void F90(C47701L4i c47701L4i, String str) {
        }

        @Override // X.InterfaceC161277Km
        public final AnonymousClass541 CBO() {
            return this.A00;
        }
    };
    public final C7L1 A02 = new C7L1();

    /* JADX WARN: Type inference failed for: r0v1, types: [X.7L0] */
    public C161377Ky(InterfaceC161217Kg interfaceC161217Kg, InterfaceC161337Ku interfaceC161337Ku, InterfaceC161177Kc interfaceC161177Kc) {
        this.A00 = interfaceC161217Kg;
        this.A01 = interfaceC161337Ku;
        this.A03 = new C7L2(interfaceC161177Kc);
    }
}
