package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filter.VideoFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.HashMap;

/* renamed from: X.Oxa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56227Oxa implements InterfaceC58189Pqv {
    public int A00;
    public InterfaceC58287Psf A01;
    public FilterGroupModel A02;
    public int A04;
    public C44428Jkf A06;
    public final UserSession A07;
    public int A05 = 100;
    public HashMap A03 = AbstractC166987dD.A1G();

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r9 != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01(android.view.View r7, X.C8MA r8, com.instagram.filterkit.filter.VideoFilter r9, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r10) {
        /*
            r6 = this;
            r2 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            r6.A02 = r10
            X.Jkf r7 = (X.C44428Jkf) r7
            r1 = 1
            if (r10 == 0) goto L5a
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r10 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r10
            boolean r0 = r10.A04
            if (r0 == 0) goto L5a
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r3 = r10.A02
            r0 = 17
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r0 = X.MSX.A0C(r3, r0)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter r0 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter) r0
            if (r0 == 0) goto L57
            java.lang.String r4 = r0.A04
            java.lang.String r0 = "normal"
            boolean r0 = r4.equals(r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            int r3 = r6.A04
            int r0 = X.MSX.A04(r7)
            if (r3 == r0) goto L40
            int r4 = X.AbstractC199508rx.A00(r4)
            r3 = 1000(0x3e8, float:1.401E-42)
            r0 = 100
            if (r4 < r3) goto L3e
            r0 = 50
        L3e:
            r6.A00 = r0
        L40:
            X.Psf r8 = (X.InterfaceC58287Psf) r8
            r6.A01 = r8
            int r3 = r6.A04
            int r0 = X.MSX.A04(r7)
            if (r3 != r0) goto L6f
            boolean r0 = r5.booleanValue()
            if (r0 != 0) goto L6f
            int r0 = r6.A00
            r6.A05 = r0
            return r1
        L57:
            if (r9 == 0) goto L76
            goto L40
        L5a:
            if (r9 == 0) goto L76
            int r0 = r6.A00(r9)
            r6.A00 = r0
            r9.A03 = r0
            int r0 = r9.A0O
            boolean r0 = X.AbstractC167007dF.A1N(r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            goto L40
        L6f:
            X.Jkf r0 = r6.A06
            if (r0 == 0) goto L76
            r0.setChecked(r2)
        L76:
            boolean r0 = r5.booleanValue()
            r0 = r0 ^ 1
            r7.setShouldShowSlidersIcon(r0)
            r7.setChecked(r1)
            r7.refreshDrawableState()
            r6.A06 = r7
            int r0 = X.MSX.A04(r7)
            r6.A04 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56227Oxa.A01(android.view.View, X.8MA, com.instagram.filterkit.filter.VideoFilter, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel):boolean");
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ void onResume() {
    }

    public final int A00(VideoFilter videoFilter) {
        FilterGroupModel filterGroupModel = this.A02;
        if (filterGroupModel != null && ((FilterGroupModelImpl) filterGroupModel).A04) {
            return this.A00;
        }
        if (videoFilter != null) {
            HashMap hashMap = this.A03;
            Integer valueOf = Integer.valueOf(videoFilter.A0O);
            if (hashMap.get(valueOf) != null) {
                return AbstractC166987dD.A0H(this.A03.get(valueOf));
            }
            return 100;
        }
        return 100;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC58189Pqv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cvt(boolean r8) {
        /*
            r7 = this;
            X.Psf r0 = r7.A01
            r0.getClass()
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r1 = r7.A02
            if (r1 == 0) goto L4d
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r1 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r1
            boolean r0 = r1.A04
            if (r0 == 0) goto L4d
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r1 = r1.A02
            r0 = 17
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r2 = X.MSX.A0C(r1, r0)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter r2 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter) r2
            if (r2 == 0) goto L29
            r1 = 1120403456(0x42c80000, float:100.0)
            if (r8 == 0) goto L46
            int r0 = r7.A00
            float r0 = (float) r0
            float r0 = r0 / r1
            r2.A00 = r0
        L25:
            int r0 = r7.A00
            r7.A05 = r0
        L29:
            r0 = 0
            r7.A01 = r0
            if (r8 == 0) goto L45
            com.instagram.common.session.UserSession r0 = r7.A07
            X.22C r3 = X.AnonymousClass229.A01(r0)
            X.249 r1 = X.AnonymousClass249.VIDEO
            X.5Hg r0 = r3.A0J()
            if (r0 == 0) goto L45
            X.MWs r2 = X.EnumC50631MWs.A0I
            java.lang.String r4 = "FEED_COLOR_FILTER_STRENGTH_SINGLE_IN_CAROUSEL_DONE_TAP"
            r5 = 0
            r6 = r5
            X.C22C.A03(r1, r2, r3, r4, r5, r6)
        L45:
            return
        L46:
            int r0 = r7.A05
            float r0 = (float) r0
            float r0 = r0 / r1
            r2.A00 = r0
            goto L29
        L4d:
            if (r8 == 0) goto L66
            java.util.HashMap r2 = r7.A03
            X.Psf r0 = r7.A01
            com.instagram.filterkit.filter.VideoFilter r0 = r0.B6O()
            r0.getClass()
            int r0 = r0.A0O
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r7.A00
            X.AbstractC166997dE.A1U(r1, r2, r0)
            goto L25
        L66:
            X.Psf r0 = r7.A01
            com.instagram.filterkit.filter.VideoFilter r0 = r0.B6O()
            if (r0 == 0) goto L29
            java.util.HashMap r2 = r7.A03
            X.Psf r0 = r7.A01
            com.instagram.filterkit.filter.VideoFilter r0 = r0.B6O()
            int r0 = r0.A0O
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r7.A05
            X.AbstractC166997dE.A1U(r1, r2, r0)
            X.Psf r1 = r7.A01
            int r0 = r7.A05
            r1.EUZ(r0)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56227Oxa.Cvt(boolean):void");
    }

    @Override // X.InterfaceC58189Pqv
    public final String getTitle() {
        return AbstractC50523MSb.A0U(this.A06);
    }

    public C56227Oxa(UserSession userSession) {
        this.A07 = userSession;
    }

    @Override // X.InterfaceC58189Pqv
    public final View Aa0(Context context) {
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(context), null, R.layout.filter_strength_adjuster);
        AbstractC66357UBy abstractC66357UBy = (AbstractC66357UBy) A0A.requireViewById(R.id.filter_strength_seek);
        abstractC66357UBy.setCurrentValue(this.A00);
        C56782PHz.A01(abstractC66357UBy, this, 9);
        return A0A;
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ boolean CJr(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ boolean COP(C44428Jkf c44428Jkf, PhotoFilter photoFilter) {
        return false;
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ boolean COQ(C44428Jkf c44428Jkf, FilterGroupModel filterGroupModel) {
        return false;
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ boolean DkF(View view, ViewGroup viewGroup, C8MA c8ma, FilterGroupModel filterGroupModel) {
        return false;
    }
}
