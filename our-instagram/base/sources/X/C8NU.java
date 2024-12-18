package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import androidx.fragment.app.FragmentActivity;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.List;

/* renamed from: X.8NU, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8NU {
    public Point A00;
    public final C1810981l A01;
    public final TargetViewSizeProvider A02;
    public final AnonymousClass874 A03;
    public final C8NT A04;
    public final C8MT A05;
    public final C8BE A06;
    public final ClipsCreationViewModel A07;
    public final Activity A08;
    public final UserSession A09;
    public final C183688Ct A0A;
    public final C1816783z A0B;
    public final C8MF A0C;
    public final C8MW A0D;
    public final C187028Qv A0E;
    public final C5JK A0F;
    public final C89E A0G;

    /* JADX WARN: Multi-variable type inference failed */
    public C8NU(Activity activity, C22P c22p, UserSession userSession, C1810981l c1810981l, C183688Ct c183688Ct, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass874 anonymousClass874, AnonymousClass840 anonymousClass840, C8NT c8nt, C8MT c8mt, C8MF c8mf, C5JK c5jk, C89E c89e) {
        C14360o3.A0B(activity, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(targetViewSizeProvider, 10);
        C14360o3.A0B(c22p, 11);
        C14360o3.A0B(c5jk, 12);
        C14360o3.A0B(c1810981l, 13);
        this.A08 = activity;
        this.A09 = userSession;
        this.A03 = anonymousClass874;
        this.A05 = c8mt;
        this.A0A = c183688Ct;
        this.A0G = c89e;
        this.A04 = c8nt;
        this.A0C = c8mf;
        this.A02 = targetViewSizeProvider;
        this.A0F = c5jk;
        this.A01 = c1810981l;
        this.A0B = anonymousClass840.A02;
        InterfaceC018407e interfaceC018407e = (InterfaceC018407e) activity;
        FragmentActivity fragmentActivity = (FragmentActivity) activity;
        this.A07 = (ClipsCreationViewModel) new C52942bb(new AnonymousClass846(userSession, fragmentActivity), interfaceC018407e).A00(ClipsCreationViewModel.class);
        this.A06 = (C8BE) new C52942bb(new C185258Jq(userSession, fragmentActivity), interfaceC018407e).A00(C8BE.class);
        Context applicationContext = activity.getApplicationContext();
        C14360o3.A0A(applicationContext);
        this.A0D = new C8MW(applicationContext, c22p, userSession, null, targetViewSizeProvider, anonymousClass840, null);
        this.A0E = A01();
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, X.A9n] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.lang.Object, X.9IV] */
    public final C8r2 A00() {
        CameraAREffect cameraAREffect;
        CameraAREffect cameraAREffect2;
        CameraAREffect cameraAREffect3;
        Integer num;
        Integer num2;
        Float f;
        Boolean bool;
        Integer num3;
        C915647m c915647m;
        boolean z;
        CameraAREffect cameraAREffect4;
        CameraAREffect cameraAREffect5;
        C185948Mo c185948Mo = this.A04.A00.A0f;
        C47Z c47z = c185948Mo.A0D;
        if (c47z != null) {
            cameraAREffect = c47z.A10;
        } else {
            cameraAREffect = null;
        }
        boolean z2 = true;
        boolean z3 = false;
        if (cameraAREffect != null) {
            z3 = true;
        }
        C8LC c8lc = c185948Mo.A0q;
        if (c8lc.A00() == null) {
            z2 = false;
        }
        if (z3 != z2) {
            AbstractC12120kG.A07("VideoViewEditsController_invalid_post_capture_ar_effect_setup", AnonymousClass001.A1C("pendingMediaForMetadataOnlyHasArEffect=", " videoVideoViewControllerHasArEffect=", z3, z2), null);
        }
        boolean z4 = true;
        java.util.Set keySet = ((C8NW) this.A0A.A1h.get()).A19().keySet();
        C14360o3.A07(keySet);
        boolean z5 = false;
        if (AbstractC209069Mo.A05(keySet)) {
            z5 = true;
        }
        CameraAREffect A00 = c8lc.A00();
        if ((A00 != null && !A00.A0I()) || (c47z != null && (cameraAREffect3 = c47z.A10) != null && cameraAREffect3.A0I() && c47z.A59)) {
            cameraAREffect2 = c8lc.A00();
        } else {
            cameraAREffect2 = null;
        }
        if (c47z == null || (((cameraAREffect4 = c47z.A10) == null || !cameraAREffect4.A0I() || !c47z.A59) && ((cameraAREffect5 = c47z.A10) == null || cameraAREffect5.A0I()))) {
            z4 = false;
        }
        boolean A002 = C6PX.A00(this.A08);
        C8MT c8mt = this.A05;
        C8DM A08 = c8mt.A08();
        Point point = this.A00;
        Integer num4 = null;
        if (point != null) {
            num = Integer.valueOf(point.x);
            num2 = Integer.valueOf(point.y);
        } else {
            num = null;
            num2 = null;
        }
        if (point != null) {
            if (A08 == C8DM.A03) {
                f = Float.valueOf(1.0f);
            } else {
                f = null;
            }
            bool = true;
        } else {
            f = null;
            bool = null;
        }
        if ((this.A01.A08.A00 instanceof C81V) && point == null) {
            InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) this.A02).A0K;
            num3 = Integer.valueOf(interfaceC1812882f.getWidth());
            num4 = Integer.valueOf(interfaceC1812882f.getHeight());
        } else {
            num3 = null;
        }
        TransformMatrixConfig A06 = c8mt.A06(new AGH(bool, f, num, num2, num3, num4), AbstractC226699zR.A00(c185948Mo.A0d), A002, z4);
        FilterGroupModel filterGroupModel = c185948Mo.A0C;
        if (filterGroupModel != null) {
            FilterChain deepCopy = ((FilterGroupModelImpl) filterGroupModel).A02.deepCopy();
            if (A06 != null) {
                AbstractC23113AHc.A02(deepCopy, "VideoViewEditsController#saveEdits", A06.C6v());
                AbstractC199768sS.A01(deepCopy, A06.A08, A06.C6v());
            }
            FilterGroupModel filterGroupModel2 = c185948Mo.A0C;
            if (filterGroupModel2 != null) {
                filterGroupModel = new FilterGroupModelImpl(deepCopy, null, ((FilterGroupModelImpl) filterGroupModel2).A03, -1, true);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        C8BE c8be = this.A06;
        List list = (List) c8be.A05.A0K.A0S.getValue();
        C87D c87d = c8be.A04;
        float A0E = c87d.A0E();
        ClipsAudioStore clipsAudioStore = c87d.A01;
        float floatValue = ((Number) clipsAudioStore.A0W.getValue()).floatValue();
        float floatValue2 = ((Number) clipsAudioStore.A0n.getValue()).floatValue();
        float floatValue3 = ((Number) clipsAudioStore.A0g.getValue()).floatValue();
        float floatValue4 = ((Number) clipsAudioStore.A0i.getValue()).floatValue();
        C14360o3.A0B(list, 1);
        ?? obj = new Object();
        obj.A05 = list;
        obj.A03 = A0E;
        obj.A00 = floatValue;
        obj.A04 = floatValue2;
        obj.A01 = floatValue3;
        obj.A02 = floatValue4;
        C915647m c915647m2 = C8r2.A0E;
        C198988qy A07 = c8mt.A07();
        AnonymousClass874 anonymousClass874 = this.A03;
        boolean z6 = anonymousClass874.A09;
        boolean z7 = anonymousClass874.A0A;
        boolean z8 = anonymousClass874.A00;
        boolean z9 = anonymousClass874.A03;
        boolean z10 = anonymousClass874.A08;
        ?? obj2 = new Object();
        obj2.A04 = z6;
        obj2.A05 = z7;
        obj2.A00 = z8;
        obj2.A02 = z9;
        obj2.A03 = z10;
        if (c47z == null || (c915647m = c47z.A1i) == null) {
            c915647m = new C915647m();
            if (c47z == null) {
                z = false;
                return new C8r2(cameraAREffect2, A06, obj2, obj, A07, A01(), filterGroupModel, c185948Mo.A0H(), c915647m, z, z5);
            }
        }
        z = c47z.A5F;
        return new C8r2(cameraAREffect2, A06, obj2, obj, A07, A01(), filterGroupModel, c185948Mo.A0H(), c915647m, z, z5);
    }

    public final C187028Qv A01() {
        boolean z;
        C183688Ct c183688Ct = this.A0A;
        C89E c89e = this.A0G;
        C8MF c8mf = this.A0C;
        C47Z c47z = this.A04.A00.A0f.A0D;
        if (c47z != null) {
            z = c47z.A5F;
        } else {
            z = false;
        }
        return C8NV.A00(c183688Ct, c8mf, c89e, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r8.A09, 36328663045652175L) != false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C47Z A02() {
        /*
            r8 = this;
            X.5JK r1 = r8.A0F
            X.5JK r0 = X.C5JK.A06
            r4 = 0
            r5 = 0
            if (r1 == r0) goto L17
            com.instagram.common.session.UserSession r3 = r8.A09
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36328663045652175(0x8110ba00003ecf, double:3.0377310216304113E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L8b
        L17:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r2 = r8.A07
            X.84B r0 = r2.A0G()
            java.util.List r0 = r0.A01
            int r1 = r0.size()
            r0 = 1
            if (r1 != r0) goto L8b
            X.84B r0 = r2.A0G()
            X.5Kj r0 = r0.A03(r4)
            boolean r0 = r0 instanceof X.C115475Kh
            if (r0 == 0) goto L8b
            X.83z r0 = r8.A0B
            X.83h r0 = r0.A01
            X.8lW r3 = r0.A04()
            if (r3 == 0) goto L8b
            com.instagram.common.session.UserSession r2 = r8.A09
            X.8Qv r1 = r8.A01()
            X.8r2 r0 = r8.A00()
            android.graphics.Point r0 = X.AHX.A00(r2, r0, r1, r3)
        L4a:
            r8.A00 = r0
            if (r0 != 0) goto L5c
            X.83z r0 = r8.A0B
            X.83h r0 = r0.A01
            X.8lW r0 = r0.A04()
            if (r0 == 0) goto L5c
            r0.A0B = r4
            r0.A0A = r4
        L5c:
            r8.A00 = r5
            X.81l r0 = r8.A01
            boolean r0 = X.AbstractC226699zR.A00(r0)
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L93
            X.8MW r2 = r8.A0D
            X.83z r0 = r8.A0B
            X.83h r0 = r0.A01
            X.8lW r6 = r0.A04()
            if (r6 == 0) goto L8d
            X.8r2 r4 = r8.A00()
            X.8Ct r0 = r8.A0A
            X.8Ee r0 = r0.A0O
            if (r0 == 0) goto L89
            java.lang.String r7 = r0.A06()
        L82:
            android.graphics.Point r3 = r8.A00
            X.47Z r0 = r2.A03(r3, r4, r5, r6, r7)
            return r0
        L89:
            r7 = 0
            goto L82
        L8b:
            r0 = r5
            goto L4a
        L8d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L93:
            X.8MW r2 = r8.A0D
            X.83z r0 = r8.A0B
            X.83h r0 = r0.A01
            X.8lW r6 = r0.A04()
            if (r6 == 0) goto Lb6
            X.8r2 r4 = r8.A00()
            X.8Ct r0 = r8.A0A
            X.8Ee r0 = r0.A0O
            if (r0 == 0) goto Lb4
            java.lang.String r7 = r0.A06()
        Lad:
            android.graphics.Point r3 = r8.A00
            X.47Z r0 = r2.A03(r3, r4, r5, r6, r7)
            return r0
        Lb4:
            r7 = 0
            goto Lad
        Lb6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8NU.A02():X.47Z");
    }
}
