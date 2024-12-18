package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class OZT {
    public final /* synthetic */ NTZ A00;

    public OZT(NTZ ntz) {
        this.A00 = ntz;
    }

    public static final void A00(OZT ozt) {
        Integer num;
        NTZ ntz = ozt.A00;
        PCT pct = ntz.A0M;
        ArrayList A1E = AbstractC166987dD.A1E();
        Context context = pct.A0K.getContext();
        String A0p = AbstractC166997dE.A0p(context, 2131976648);
        C51904Mwm c51904Mwm = pct.A06;
        Integer num2 = null;
        if (c51904Mwm != null) {
            num = c51904Mwm.A02;
        } else {
            num = null;
        }
        boolean A1X = AbstractC167007dF.A1X(num, C05F.A00);
        Context context2 = pct.A0C;
        Integer num3 = null;
        A1E.add(new C199928sw(null, context2.getDrawable(R.drawable.instagram_camera_pano_outline_24), null, new C56408P2v(pct, 1), null, A0p, 0, 0, 0, true, false, A1X, true, false, false, false));
        String A0p2 = AbstractC166997dE.A0p(context, 2131976631);
        C51904Mwm c51904Mwm2 = pct.A06;
        if (c51904Mwm2 != null) {
            num3 = c51904Mwm2.A02;
        }
        A1E.add(new C199928sw(null, context2.getDrawable(R.drawable.instagram_camera_rear_pano_outline_24), null, new C56408P2v(pct, 2), null, A0p2, 0, 0, 0, true, false, AbstractC167007dF.A1X(num3, C05F.A01), true, false, false, false));
        String A0p3 = AbstractC166997dE.A0p(context, 2131976642);
        C51904Mwm c51904Mwm3 = pct.A06;
        if (c51904Mwm3 != null) {
            num2 = c51904Mwm3.A02;
        }
        A1E.add(new C199928sw(null, AbstractC166987dD.A0a(pct.A0f), null, new C56408P2v(pct, 3), null, A0p3, 0, 0, 0, true, false, AbstractC167007dF.A1X(num2, C05F.A0C), true, false, false, false));
        C8QJ c8qj = new C8QJ(context, pct.A0L, Integer.valueOf(R.drawable.dropdown_menu_background), true);
        c8qj.A02(A1E);
        pct.A03 = c8qj;
        View contentView = c8qj.getContentView();
        C14360o3.A07(contentView);
        contentView.measure(0, 0);
        InterfaceC09390do interfaceC09390do = pct.A0e;
        AbstractC166987dD.A0d(interfaceC09390do).measure(0, 0);
        int[] iArr = new int[2];
        AbstractC166987dD.A0d(interfaceC09390do).getLocationInWindow(iArr);
        c8qj.showAtLocation(AbstractC166987dD.A0d(interfaceC09390do), 0, (iArr[0] - contentView.getMeasuredWidth()) + AbstractC166987dD.A0d(interfaceC09390do).getMeasuredWidth(), (iArr[1] - contentView.getMeasuredHeight()) - context2.getResources().getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap));
        ntz.A0K.A00(PAH.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r1.A0I != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        r3.A0L.A03(new X.C56613PBj(0.0f, false, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        r3.A0M.A09();
        r3.A0L.A03(new X.C56613PBj(0.0f, false, true));
        X.NTZ.A03(r3, "dropdown_menu_tap");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0038, code lost:
    
        if (r1.A0I == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.OZT r5, java.lang.Integer r6) {
        /*
            X.NTZ r3 = r5.A00
            X.MwO r1 = r3.A01
            if (r1 == 0) goto L35
            boolean r0 = r1.A0L
            if (r0 == 0) goto L6c
            java.lang.Integer r0 = X.C05F.A0C
        Lc:
            if (r0 == r6) goto L35
            int r0 = r6.intValue()
            java.lang.String r4 = "dropdown_menu_tap"
            r6 = 1
            r5 = 0
            if (r0 == r5) goto L36
            if (r0 == r6) goto L47
            X.Odh r5 = r3.A0L
            boolean r2 = r1.A0I
            android.view.ViewGroup r0 = r3.A0G
            android.content.res.Resources r1 = X.AbstractC25228BEl.A0M(r0)
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            float r1 = r1.getDimension(r0)
            X.PBj r0 = new X.PBj
            r0.<init>(r1, r6, r2)
            r5.A03(r0)
            X.NTZ.A04(r3, r4, r6, r2)
        L35:
            return
        L36:
            boolean r0 = r1.A0I
            if (r0 != 0) goto L3b
            goto L4b
        L3b:
            X.Odh r2 = r3.A0L
            r1 = 0
            X.PBj r0 = new X.PBj
            r0.<init>(r1, r5, r5)
            r2.A03(r0)
            goto L5e
        L47:
            boolean r0 = r1.A0I
            if (r0 == 0) goto L3b
        L4b:
            X.PCT r0 = r3.A0M
            r0.A09()
            X.Odh r2 = r3.A0L
            r1 = 0
            X.PBj r0 = new X.PBj
            r0.<init>(r1, r5, r6)
            r2.A03(r0)
            X.NTZ.A03(r3, r4)
        L5e:
            X.MwO r1 = r3.A01
            if (r1 == 0) goto L35
            boolean r0 = r1.A0L
            if (r0 == 0) goto L35
            boolean r0 = r1.A0I
            X.NTZ.A04(r3, r4, r5, r0)
            return
        L6c:
            boolean r0 = r1.A0I
            java.lang.Integer r0 = X.MSX.A0Y(r0)
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OZT.A01(X.OZT, java.lang.Integer):void");
    }
}
