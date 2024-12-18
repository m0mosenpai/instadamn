package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.litho.LithoView;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.4FZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FZ {
    public final Context A00;
    public final C93014Fa A01;
    public final InterfaceC60442pS A02;
    public final boolean A03;
    public final FragmentActivity A04;
    public final UserSession A05;
    public final InterfaceC65702y7 A06;
    public final C93024Fb A07;
    public final C4FY A08;
    public final C57462kL A09;
    public final InterfaceC60682pr A0A;

    public C4FZ(Context context, FragmentActivity fragmentActivity, UserSession userSession, InterfaceC65702y7 interfaceC65702y7, C4FX c4fx, C4FY c4fy, InterfaceC60442pS interfaceC60442pS, InterfaceC60682pr interfaceC60682pr, C1M1 c1m1, String str, boolean z, boolean z2) {
        C14360o3.A0B(interfaceC60682pr, 7);
        C14360o3.A0B(c4fy, 8);
        C14360o3.A0B(c4fx, 9);
        this.A04 = fragmentActivity;
        this.A00 = context;
        this.A02 = interfaceC60442pS;
        this.A05 = userSession;
        this.A03 = z;
        this.A06 = interfaceC65702y7;
        this.A0A = interfaceC60682pr;
        this.A08 = c4fy;
        C57462kL c57462kL = new C57462kL(userSession);
        this.A09 = c57462kL;
        C93014Fa c93014Fa = new C93014Fa(context, fragmentActivity, userSession, c4fx, interfaceC60442pS, interfaceC60682pr, c1m1, str, z2);
        this.A01 = c93014Fa;
        this.A07 = new C93024Fb(fragmentActivity, context, userSession, c93014Fa, c57462kL.A04());
    }

    public final void A01(C97404Za c97404Za, C81463kG c81463kG, C75113Zb c75113Zb) {
        C14360o3.A0B(c97404Za, 0);
        C14360o3.A0B(c81463kG, 1);
        C14360o3.A0B(c75113Zb, 2);
        int A02 = this.A08.A02(c81463kG.A02, c97404Za.A04, c97404Za.A00, c97404Za.A01, c97404Za.A09, c97404Za.A0B);
        ViewGroup viewGroup = c81463kG.A04;
        if (A02 != viewGroup.getLayoutParams().height) {
            AbstractC13880nE.A0W(viewGroup, A02);
        }
        if (!this.A09.A04()) {
            AbstractC81293jz abstractC81293jz = c81463kG.A05;
            if (abstractC81293jz instanceof C81283jy) {
                C206259Bi c206259Bi = c97404Za.A03;
                InterfaceC76863cY interfaceC76863cY = (InterfaceC76863cY) ((InterfaceC16620sF) c206259Bi.A02).invoke(this.A00, Boolean.valueOf(this.A03));
                C77043cq c77043cq = (C77043cq) ((InterfaceC16820sZ) c206259Bi.A01).invoke();
                int position = c75113Zb.getPosition();
                this.A01.A00.A06(this.A02, c77043cq, (C81283jy) abstractC81293jz, interfaceC76863cY, c75113Zb, position);
            }
        } else {
            c81463kG.A03.setVisibility(8);
        }
        EnumC74373Vt enumC74373Vt = c97404Za.A06;
        EnumC79303gb enumC79303gb = c97404Za.A05;
        boolean z = c97404Za.A0A;
        C86203sr c86203sr = new C86203sr(c97404Za.A07, -1, c97404Za.A0C, true);
        EnumC65592xv enumC65592xv = EnumC65592xv.A0w;
        int i = c97404Za.A02;
        C206259Bi c206259Bi2 = c97404Za.A03;
        int intValue = ((Number) ((InterfaceC16660sJ) c206259Bi2.A04).invoke(Integer.valueOf(i))).intValue();
        Map map = c81463kG.A07;
        Number number = (Number) map.get(enumC65592xv);
        if (number == null || number.intValue() != intValue) {
            map.put(enumC65592xv, Integer.valueOf(intValue));
            C85993sW c85993sW = this.A01.A01;
            C81303k0 c81303k0 = c81463kG.A06;
            c85993sW.A07(this.A02, c86203sr, (C79723hN) ((InterfaceC16610sE) c206259Bi2.A03).invoke(this.A00, enumC74373Vt, enumC79303gb), c81303k0, c75113Zb.getPosition(), false);
        }
        if (!z) {
            c81463kG.A06.A0N.setVisibility(0);
        }
        C14360o3.A0B(this.A02.getModuleName(), 2);
        c81463kG.A01 = c75113Zb;
        c81463kG.A00 = c97404Za;
    }

    public final C3W1 A00(ViewGroup viewGroup, boolean z) {
        View view;
        C81303k0 c81303k0;
        Object obj;
        C93024Fb c93024Fb = this.A07;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LayoutInflater layoutInflater = c93024Fb.A00.getLayoutInflater();
        C14360o3.A07(layoutInflater);
        View A00 = C50802Vb.A00(layoutInflater, layoutParams, viewGroup, R.layout.feed_full_height_media_frame_layout, 0, false, true);
        C14360o3.A0C(A00, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) A00;
        AbstractC81293jz abstractC81293jz = null;
        if (!c93024Fb.A03) {
            if (z) {
                final Context context = c93024Fb.A01;
                LithoView lithoView = new LithoView(context) { // from class: X.43U
                    public final int A00 = AbstractC75953b0.A00;

                    @Override // com.facebook.litho.LithoView, android.view.View
                    public final void onMeasure(int i, int i2) {
                        super.onMeasure(i, this.A00);
                    }
                };
                AbstractC93034Fc.A00(viewGroup2, lithoView, R.id.media_header_location);
                lithoView.setTag(new C98924cC(lithoView));
                view = lithoView;
            } else {
                View A04 = c93024Fb.A02.A00.A04(c93024Fb.A01, viewGroup2);
                AbstractC93034Fc.A00(viewGroup2, A04, R.id.media_header_location);
                view = A04;
            }
        } else {
            view = null;
        }
        C85993sW c85993sW = c93024Fb.A02.A01;
        Context context2 = c93024Fb.A01;
        View A042 = c85993sW.A04(context2, viewGroup2);
        AbstractC93034Fc.A00(viewGroup2, A042, R.id.media_content_location);
        C3W1 c3w1 = new C3W1(context2, z);
        c3w1.setLayoutParams(layoutParams);
        c3w1.addView(viewGroup2);
        Object tag = A042.getTag();
        if ((tag instanceof C81303k0) && (c81303k0 = (C81303k0) tag) != null) {
            if (view != null) {
                obj = view.getTag();
            } else {
                obj = null;
            }
            if (obj instanceof AbstractC81293jz) {
                abstractC81293jz = (AbstractC81293jz) obj;
            }
            c3w1.setTag(new C81463kG(c3w1, abstractC81293jz, c81303k0));
        }
        return c3w1;
    }
}
