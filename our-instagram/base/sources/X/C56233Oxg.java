package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.ui.igeditseekbar.IgEditSeekBar;
import java.util.Map;

/* renamed from: X.Oxg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56233Oxg implements InterfaceC58189Pqv {
    public int A00;
    public int A01;
    public C8MA A02;
    public FilterGroupModel A03;
    public boolean A04;
    public boolean A05;
    public C44428Jkf A06;
    public Integer A07;
    public final UserSession A08;

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ void onResume() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if (X.OXt.A01(r4) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.C56233Oxg r5, int r6) {
        /*
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r5.A03
            r0.getClass()
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r4 = X.OXt.A00(r0)
            r4.getClass()
            java.lang.Integer r0 = r5.A07
            r0.getClass()
            int r1 = r0.intValue()
            r0 = 1120403456(0x42c80000, float:100.0)
            switch(r1) {
                case 0: goto L30;
                case 1: goto L35;
                case 2: goto L3f;
                case 3: goto L3a;
                case 4: goto L4e;
                case 5: goto L53;
                case 6: goto L1a;
                case 7: goto L58;
                case 8: goto L44;
                case 9: goto L49;
                default: goto L1a;
            }
        L1a:
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r3 = r5.A03
            r2 = 13
            boolean r0 = X.OXt.A02(r4)
            if (r0 != 0) goto L2b
            boolean r1 = X.OXt.A01(r4)
            r0 = 0
            if (r1 == 0) goto L2c
        L2b:
            r0 = 1
        L2c:
            r3.EUV(r2, r0)
            return
        L30:
            float r1 = (float) r6
            float r1 = r1 / r0
            java.lang.String r0 = "brightness"
            goto L5c
        L35:
            float r1 = (float) r6
            float r1 = r1 / r0
            java.lang.String r0 = "contrast"
            goto L5c
        L3a:
            float r1 = (float) r6
            float r1 = r1 / r0
            java.lang.String r0 = "temperature"
            goto L5c
        L3f:
            float r1 = (float) r6
            float r1 = r1 / r0
            java.lang.String r0 = "saturation"
            goto L5c
        L44:
            float r1 = (float) r6
            float r1 = r1 / r0
            java.lang.String r0 = "shadows"
            goto L5c
        L49:
            float r1 = (float) r6
            float r1 = r1 / r0
            java.lang.String r0 = "highlights"
            goto L5c
        L4e:
            float r1 = (float) r6
            float r1 = r1 / r0
            java.lang.String r0 = "vignette"
            goto L5c
        L53:
            float r1 = (float) r6
            float r1 = r1 / r0
            java.lang.String r0 = "fade"
            goto L5c
        L58:
            float r1 = (float) r6
            float r1 = r1 / r0
            java.lang.String r0 = "sharpen"
        L5c:
            r4.A00(r0, r1)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56233Oxg.A01(X.Oxg, int):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0013. Please report as an issue. */
    @Override // X.InterfaceC58189Pqv
    public final View Aa0(Context context) {
        int i;
        float f;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        Integer num = this.A07;
        num.getClass();
        switch (num.intValue()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 8:
            case 9:
                i = 200;
                f = 0.5f;
                IgEditSeekBar igEditSeekBar = new IgEditSeekBar(context);
                ((AbstractC66357UBy) igEditSeekBar).A01 = f;
                ((AbstractC66357UBy) igEditSeekBar).A02 = i;
                igEditSeekBar.setCurrentValue(this.A01);
                C56782PHz.A01(igEditSeekBar, this, 4);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                int A0B = AbstractC167017dG.A0B(context);
                layoutParams.setMargins(A0B, 0, A0B, 0);
                linearLayout.addView(igEditSeekBar, layoutParams);
                linearLayout.setImportantForAccessibility(2);
                igEditSeekBar.setContentDescription(AbstractC166997dE.A0r(linearLayout.getResources(), AbstractC50523MSb.A0U(this.A06), 2131974211));
                return linearLayout;
            case 4:
            case 5:
            case 7:
                i = 100;
                f = 0.0f;
                IgEditSeekBar igEditSeekBar2 = new IgEditSeekBar(context);
                ((AbstractC66357UBy) igEditSeekBar2).A01 = f;
                ((AbstractC66357UBy) igEditSeekBar2).A02 = i;
                igEditSeekBar2.setCurrentValue(this.A01);
                C56782PHz.A01(igEditSeekBar2, this, 4);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                int A0B2 = AbstractC167017dG.A0B(context);
                layoutParams2.setMargins(A0B2, 0, A0B2, 0);
                linearLayout.addView(igEditSeekBar2, layoutParams2);
                linearLayout.setImportantForAccessibility(2);
                igEditSeekBar2.setContentDescription(AbstractC166997dE.A0r(linearLayout.getResources(), AbstractC50523MSb.A0U(this.A06), 2131974211));
                return linearLayout;
            case 6:
            default:
                return null;
        }
    }

    @Override // X.InterfaceC58189Pqv
    public final boolean COQ(C44428Jkf c44428Jkf, FilterGroupModel filterGroupModel) {
        InterfaceC50490MQs interfaceC50490MQs = c44428Jkf.A05.A01;
        C14360o3.A07(interfaceC50490MQs);
        c44428Jkf.setChecked(AbstractC167007dF.A1M(A00(filterGroupModel, ((NHG) interfaceC50490MQs).A00)));
        return false;
    }

    @Override // X.InterfaceC58189Pqv
    public final void Cvt(boolean z) {
        if (z) {
            this.A01 = this.A00;
        }
        C44428Jkf c44428Jkf = this.A06;
        c44428Jkf.getClass();
        c44428Jkf.setChecked(AbstractC167007dF.A1M(this.A01));
        A01(this, this.A01);
        this.A06 = null;
        this.A07 = null;
        this.A03 = null;
        this.A02 = null;
    }

    @Override // X.InterfaceC58189Pqv
    public final boolean DkF(View view, ViewGroup viewGroup, C8MA c8ma, FilterGroupModel filterGroupModel) {
        this.A03 = filterGroupModel;
        C44428Jkf c44428Jkf = (C44428Jkf) view;
        this.A06 = c44428Jkf;
        InterfaceC50490MQs interfaceC50490MQs = c44428Jkf.A05.A01;
        C14360o3.A07(interfaceC50490MQs);
        Integer num = ((NHG) interfaceC50490MQs).A00;
        this.A07 = num;
        this.A02 = c8ma;
        int A00 = A00(this.A03, num);
        this.A00 = A00;
        this.A01 = A00;
        this.A04 = this.A03.CUm(19);
        return true;
    }

    @Override // X.InterfaceC58189Pqv
    public final String getTitle() {
        return AbstractC50523MSb.A0U(this.A06);
    }

    public C56233Oxg(UserSession userSession) {
        this.A08 = userSession;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000e. Please report as an issue. */
    public static int A00(FilterGroupModel filterGroupModel, Integer num) {
        Map map;
        String str;
        ValueMapFilterModel A00 = OXt.A00(filterGroupModel);
        if (A00 != null) {
            TypedParameterMap typedParameterMap = A00.A01;
            switch (num.intValue()) {
                case 0:
                    map = typedParameterMap.A02;
                    str = "brightness";
                    return (int) (AbstractC50522MSa.A02(str, map) * 100.0f);
                case 1:
                    map = typedParameterMap.A02;
                    str = "contrast";
                    return (int) (AbstractC50522MSa.A02(str, map) * 100.0f);
                case 2:
                    map = typedParameterMap.A02;
                    str = "saturation";
                    return (int) (AbstractC50522MSa.A02(str, map) * 100.0f);
                case 3:
                    map = typedParameterMap.A02;
                    str = "temperature";
                    return (int) (AbstractC50522MSa.A02(str, map) * 100.0f);
                case 4:
                    map = typedParameterMap.A02;
                    str = "vignette";
                    return (int) (AbstractC50522MSa.A02(str, map) * 100.0f);
                case 5:
                    map = typedParameterMap.A02;
                    str = "fade";
                    return (int) (AbstractC50522MSa.A02(str, map) * 100.0f);
                case 6:
                default:
                    return 0;
                case 7:
                    map = typedParameterMap.A02;
                    str = "sharpen";
                    return (int) (AbstractC50522MSa.A02(str, map) * 100.0f);
                case 8:
                    map = typedParameterMap.A02;
                    str = "shadows";
                    return (int) (AbstractC50522MSa.A02(str, map) * 100.0f);
                case 9:
                    map = typedParameterMap.A02;
                    str = "highlights";
                    return (int) (AbstractC50522MSa.A02(str, map) * 100.0f);
            }
        }
        return 0;
    }

    @Override // X.InterfaceC58189Pqv
    public final boolean CJr(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.A05 = true;
            A01(this, 0);
        } else {
            if (motionEvent.getAction() == 1) {
                this.A05 = false;
                A01(this, this.A00);
            }
            return true;
        }
        C8MA c8ma = this.A02;
        c8ma.getClass();
        c8ma.EGV();
        return true;
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ boolean COP(C44428Jkf c44428Jkf, PhotoFilter photoFilter) {
        return false;
    }
}
