package com.instagram.ui.swipenavigation;

import X.AbstractC13560mi;
import X.AbstractC13620mo;
import X.AbstractC58577Pxv;
import X.C00O;
import X.C03K;
import X.C0f9;
import X.C0fO;
import X.C11520jB;
import X.C120985dq;
import X.C14360o3;
import X.C172067lb;
import X.C207549Gh;
import X.C208279Jm;
import X.C2fe;
import X.C37540Gfw;
import X.C37603Ggy;
import X.C37675GiC;
import X.C50368MLv;
import X.C54802fd;
import X.C55942hf;
import X.C55982hj;
import X.C59862oT;
import X.C59922oZ;
import X.C59952od;
import X.C5GJ;
import X.C9Ay;
import X.EnumC76383bi;
import X.ITO;
import X.InterfaceC55932he;
import X.InterfaceC59932oa;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class SwipeNavigationContainer extends FrameLayout implements InterfaceC55932he, GestureDetector.OnGestureListener {
    public static final C55942hf A0l = C55942hf.A04(40.0d, 8.0d);
    public double A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07;
    public Bundle A08;
    public C5GJ A09;
    public CameraConfiguration A0A;
    public EnumC76383bi A0B;
    public C2fe A0C;
    public InterfaceC59932oa A0D;
    public C59862oT A0E;
    public C59862oT A0F;
    public C59862oT A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public float A0S;
    public float A0T;
    public float A0U;
    public float A0V;
    public float A0W;
    public float A0X;
    public long A0Y;
    public C172067lb A0Z;
    public boolean A0a;
    public boolean A0b;
    public final float A0c;
    public final int A0d;
    public final RectF A0e;
    public final RectF A0f;
    public final C55982hj A0g;
    public final boolean A0h;
    public final int A0i;
    public final GestureDetector A0j;
    public final C03K A0k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwipeNavigationContainer(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public static /* synthetic */ void getLastTriggerAction$annotations() {
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A0X = Math.min(-f, this.A0i) / getWidth();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0217, code lost:
    
        if (r3.contains(r5, r4) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0133, code lost:
    
        if (r5 >= (r4 / 2.0f)) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014b, code lost:
    
        if (r15 != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0144  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.swipenavigation.SwipeNavigationContainer.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        C2fe c2fe;
        C14360o3.A0B(iArr, 3);
        if (getClampedPosition() != this.A0W && (c2fe = this.A0C) != null && c2fe.Ce8(null)) {
            iArr[0] = i;
            setInternalPosition(new PositionConfig(null, null, null, "swipe", null, null, null, null, null, null, null, null, null, ((float) this.A0g.A09.A00) + (i / getWidth()), 0, false));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(view2, 1);
        this.A0k.A01 = i;
        this.A0W = getClampedPosition();
        this.A0a = false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        RectF rectF = this.A0e;
        if (rectF.width() >= getWidth() || !rectF.contains(rawX, rawY)) {
            return false;
        }
        this.A0R = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 1) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        C14360o3.A0B(view, 0);
        this.A0k.A01 = 0;
        A02(null, 0.0f, 0L);
    }

    public final void setPosition(PositionConfig positionConfig) {
        C14360o3.A0B(positionConfig, 0);
        InterfaceC59932oa interfaceC59932oa = this.A0D;
        if (interfaceC59932oa != null && positionConfig.A0F) {
            interfaceC59932oa.DVc(positionConfig.A0D, positionConfig.A00);
        }
        setInternalPosition(positionConfig);
    }

    /* loaded from: classes2.dex */
    public final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C9Ay(62);
        public final float A00;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.A00);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.A00 = parcel.readFloat();
        }

        public SavedState(Parcelable parcelable, float f) {
            super(parcelable);
            this.A00 = f;
        }
    }

    private final float A00(float f) {
        double d;
        double d2;
        float f2;
        if (f < 0.0f) {
            d = f;
            d2 = getStartMostEnabledPanel().A01;
            C59862oT c59862oT = this.A0E;
            if (c59862oT != null) {
                f2 = c59862oT.A01;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            C59862oT endMostEnabledPanel = getEndMostEnabledPanel();
            d = f;
            C59862oT c59862oT2 = this.A0E;
            if (c59862oT2 != null) {
                d2 = c59862oT2.A01;
                f2 = endMostEnabledPanel.A01;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return (float) Math.min(Math.max(d, d2), f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:300:0x04a4, code lost:
    
        if (r6.A0K == null) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x05a4, code lost:
    
        if (X.C59942oc.A0C(r11) != false) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x06bf, code lost:
    
        if ((X.C54802fd.A00(r0) instanceof X.C172707mf) != false) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x06c1, code lost:
    
        r13 = X.C54802fd.A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x06c9, code lost:
    
        if (X.C54802fd.A01(r0) == null) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x06cb, code lost:
    
        r6 = X.C54802fd.A01(r0);
        com.instagram.profile.fragment.UserDetailFragment.A0S(r6);
        r6.A1p = true;
        com.instagram.profile.fragment.UserDetailFragment.A0R(r6);
        r13 = X.C54802fd.A01(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x06db, code lost:
    
        r14 = X.C55772hI.A00(r11);
        r13.getClass();
        r14.A0D("pair_with_ads_automated_logging", (X.InterfaceC11380iw) r13);
        r6 = r13 instanceof X.C172707mf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x06ec, code lost:
    
        if (r6 == false) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x06f9, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r11, 36317517609768256L) == false) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x06fb, code lost:
    
        r13 = (com.facebook.browser.lite.BrowserLiteFragment) r13;
        r13.Ckl(r13.A09, r13.A0e.A01(r13.A0W.BZF()), r13.A0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0710, code lost:
    
        r13 = r0.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0712, code lost:
    
        if (r13 == null) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0714, code lost:
    
        r0.CKS(r13, java.lang.Long.valueOf(r0.A05), true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x071d, code lost:
    
        if (r6 == false) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x071f, code lost:
    
        r13 = r27.A0K();
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0723, code lost:
    
        if (r13 == null) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0725, code lost:
    
        r6 = r27.A0L();
        new X.C37616GhB(r6.A0C, r6.A0D).A03(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x06b7, code lost:
    
        if (X.C54802fd.A01(r0) != null) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0165, code lost:
    
        if (r1 > r7) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0223 A[Catch: all -> 0x08e3, TryCatch #2 {all -> 0x08e3, blocks: (B:93:0x01ae, B:95:0x01b2, B:96:0x01b4, B:98:0x01be, B:100:0x01c6, B:102:0x01cc, B:104:0x01d2, B:107:0x01e7, B:111:0x0259, B:112:0x0268, B:117:0x0298, B:122:0x02c1, B:125:0x02b3, B:126:0x02ce, B:133:0x0794, B:135:0x079f, B:139:0x07a9, B:140:0x07bc, B:143:0x07c4, B:147:0x07ce, B:148:0x07d7, B:150:0x07dd, B:164:0x0833, B:166:0x0839, B:168:0x08d6, B:170:0x08dc, B:171:0x08e2, B:173:0x083f, B:175:0x0843, B:177:0x0849, B:179:0x0858, B:180:0x0860, B:182:0x0867, B:186:0x08a0, B:188:0x08a5, B:191:0x08b1, B:195:0x08ba, B:199:0x08c5, B:200:0x08c2, B:201:0x08c8, B:207:0x0875, B:208:0x0883, B:210:0x0889, B:217:0x0897, B:213:0x089b, B:443:0x08d1, B:455:0x0207, B:465:0x0223, B:466:0x0228, B:467:0x0226, B:439:0x08cc, B:152:0x07e5, B:154:0x07ec, B:157:0x07ff, B:158:0x0807, B:159:0x080e, B:161:0x0811, B:163:0x0823, B:128:0x02d4, B:130:0x02dc, B:132:0x02e4, B:220:0x02f2, B:222:0x02fa, B:224:0x0302, B:226:0x030a, B:228:0x0315, B:231:0x0324, B:233:0x032d, B:234:0x0349, B:236:0x034d, B:239:0x0356, B:240:0x0362, B:242:0x036c, B:244:0x0373, B:246:0x0377, B:247:0x037a, B:249:0x0382, B:252:0x0388, B:254:0x0394, B:257:0x039c, B:259:0x03a2, B:260:0x03a5, B:262:0x03b8, B:264:0x03be, B:266:0x03cc, B:269:0x03d6, B:271:0x03ff, B:273:0x0407, B:275:0x040d, B:277:0x0413, B:286:0x0433, B:287:0x0435, B:290:0x0484, B:403:0x0757, B:407:0x0764, B:410:0x0761, B:412:0x0430, B:413:0x0439, B:416:0x044d, B:419:0x0455, B:421:0x045e, B:423:0x0464, B:425:0x046a, B:426:0x0448, B:427:0x0765, B:432:0x078f, B:433:0x0791, B:434:0x0770, B:436:0x078c), top: B:92:0x01ae, inners: #0, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0226 A[Catch: all -> 0x08e3, TryCatch #2 {all -> 0x08e3, blocks: (B:93:0x01ae, B:95:0x01b2, B:96:0x01b4, B:98:0x01be, B:100:0x01c6, B:102:0x01cc, B:104:0x01d2, B:107:0x01e7, B:111:0x0259, B:112:0x0268, B:117:0x0298, B:122:0x02c1, B:125:0x02b3, B:126:0x02ce, B:133:0x0794, B:135:0x079f, B:139:0x07a9, B:140:0x07bc, B:143:0x07c4, B:147:0x07ce, B:148:0x07d7, B:150:0x07dd, B:164:0x0833, B:166:0x0839, B:168:0x08d6, B:170:0x08dc, B:171:0x08e2, B:173:0x083f, B:175:0x0843, B:177:0x0849, B:179:0x0858, B:180:0x0860, B:182:0x0867, B:186:0x08a0, B:188:0x08a5, B:191:0x08b1, B:195:0x08ba, B:199:0x08c5, B:200:0x08c2, B:201:0x08c8, B:207:0x0875, B:208:0x0883, B:210:0x0889, B:217:0x0897, B:213:0x089b, B:443:0x08d1, B:455:0x0207, B:465:0x0223, B:466:0x0228, B:467:0x0226, B:439:0x08cc, B:152:0x07e5, B:154:0x07ec, B:157:0x07ff, B:158:0x0807, B:159:0x080e, B:161:0x0811, B:163:0x0823, B:128:0x02d4, B:130:0x02dc, B:132:0x02e4, B:220:0x02f2, B:222:0x02fa, B:224:0x0302, B:226:0x030a, B:228:0x0315, B:231:0x0324, B:233:0x032d, B:234:0x0349, B:236:0x034d, B:239:0x0356, B:240:0x0362, B:242:0x036c, B:244:0x0373, B:246:0x0377, B:247:0x037a, B:249:0x0382, B:252:0x0388, B:254:0x0394, B:257:0x039c, B:259:0x03a2, B:260:0x03a5, B:262:0x03b8, B:264:0x03be, B:266:0x03cc, B:269:0x03d6, B:271:0x03ff, B:273:0x0407, B:275:0x040d, B:277:0x0413, B:286:0x0433, B:287:0x0435, B:290:0x0484, B:403:0x0757, B:407:0x0764, B:410:0x0761, B:412:0x0430, B:413:0x0439, B:416:0x044d, B:419:0x0455, B:421:0x045e, B:423:0x0464, B:425:0x046a, B:426:0x0448, B:427:0x0765, B:432:0x078f, B:433:0x0791, B:434:0x0770, B:436:0x078c), top: B:92:0x01ae, inners: #0, #4, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01() {
        /*
            Method dump skipped, instructions count: 2313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.swipenavigation.SwipeNavigationContainer.A01():void");
    }

    private final float getClampedPosition() {
        return A00((float) this.A0g.A09.A00);
    }

    private final C59862oT getEndMostEnabledPanel() {
        C59862oT c59862oT = this.A0F;
        if ((c59862oT == null || !c59862oT.A00) && (c59862oT = this.A0E) == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return c59862oT;
    }

    private final C59862oT getStartMostEnabledPanel() {
        C59862oT c59862oT = this.A0G;
        if ((c59862oT == null || !c59862oT.A00) && (c59862oT = this.A0E) == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return c59862oT;
    }

    private final void setEndPanelExtraParameter(PositionConfig positionConfig) {
        Bundle bundle;
        String str = positionConfig.A06;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            this.A08 = bundle2;
            bundle2.putString("filter_type", str);
            String str2 = positionConfig.A08;
            if (str2 != null && (bundle = this.A08) != null) {
                bundle.putString("DIRECT_SOURCE_MODULE_NAME", str2);
            }
        }
        String str3 = positionConfig.A07;
        if (str3 != null) {
            Bundle bundle3 = this.A08;
            if (bundle3 == null) {
                bundle3 = new Bundle();
                this.A08 = bundle3;
            }
            bundle3.putString("DirectFragment.INBOX_MODE", str3);
        }
    }

    private final void setInternalPosition(PositionConfig positionConfig) {
        this.A0J = positionConfig.A0D;
        this.A0A = positionConfig.A03;
        this.A0H = positionConfig.A05;
        this.A0L = positionConfig.A0B;
        this.A0M = positionConfig.A0C;
        this.A0K = positionConfig.A0A;
        this.A07 = positionConfig.A01;
        this.A0N = positionConfig.A0E;
        this.A0I = positionConfig.A09;
        this.A09 = positionConfig.A02;
        this.A0B = positionConfig.A04;
        float A00 = A00(positionConfig.A00);
        boolean z = positionConfig.A0F;
        C55982hj c55982hj = this.A0g;
        double d = A00;
        if (z) {
            c55982hj.A06(d);
        } else {
            c55982hj.A08(d, true);
            Dnk(c55982hj);
        }
        setEndPanelExtraParameter(positionConfig);
    }

    public final void A02(MotionEvent motionEvent, float f, long j) {
        float f2;
        String str;
        C59952od A02;
        String str2;
        float f3;
        Double valueOf;
        Double valueOf2;
        Boolean valueOf3;
        String A022;
        Boolean valueOf4;
        Float valueOf5;
        Float valueOf6;
        Float valueOf7;
        String str3;
        C120985dq c120985dq;
        String str4;
        float f4 = f;
        if (this.A0h) {
            f4 = -f4;
        }
        C55982hj c55982hj = this.A0g;
        c55982hj.A07(f4);
        C2fe c2fe = this.A0C;
        InterfaceC59932oa interfaceC59932oa = this.A0D;
        if (this.A0R) {
            C59862oT c59862oT = this.A0E;
            if (c59862oT != null) {
                f2 = c59862oT.A01;
                str = "tap_partially_visible_panel";
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            C59862oT startMostEnabledPanel = getStartMostEnabledPanel();
            C59862oT endMostEnabledPanel = getEndMostEnabledPanel();
            float f5 = (float) c55982hj.A09.A00;
            f2 = endMostEnabledPanel.A01;
            if (f5 <= f2) {
                f2 = startMostEnabledPanel.A01;
                if (f5 >= f2) {
                    if (f4 > 0.0f) {
                        if (this.A0O && c2fe != null) {
                            f2 = (float) Math.round((f5 + 0.5d) - c2fe.BbC());
                        } else {
                            f2 = ((float) Math.floor(f5)) + 1.0f;
                        }
                    } else if (f4 < 0.0f) {
                        f2 = ((float) Math.ceil(f5)) - 1.0f;
                    } else {
                        f2 = Math.round(f5);
                    }
                }
            }
            str = "swipe";
        }
        boolean z = false;
        if (A00(this.A0S) != f2) {
            if (interfaceC59932oa != null && this.A0Z == null) {
                C172067lb c172067lb = new C172067lb(f2);
                interfaceC59932oa.DVc("swipe", c172067lb.A00);
                this.A0Z = c172067lb;
            }
            if (motionEvent != null && c2fe != null) {
                c2fe.CKS(motionEvent, Long.valueOf(j), false);
            }
        }
        C50368MLv c50368MLv = null;
        setInternalPosition(new PositionConfig(null, null, null, str, null, null, null, null, null, null, null, null, null, f2, 0, true));
        this.A0R = false;
        if (j > 0 && interfaceC59932oa != null && motionEvent != null) {
            float f6 = this.A0S;
            float f7 = this.A01;
            float f8 = this.A02;
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            if (f4 == 0.0f) {
                z = true;
            }
            boolean z2 = !z;
            float f9 = this.A0U;
            float f10 = this.A0V;
            long j2 = this.A0Y;
            C59922oZ c59922oZ = (C59922oZ) interfaceC59932oa;
            if (Systrace.A0E(1L)) {
                C0fO.A01("SwipeNavigationListener.onTouchEnd", 570949575);
            }
            try {
                C54802fd c54802fd = c59922oZ.A01;
                C207549Gh A0A = c54802fd.A0A();
                if (A0A != null) {
                    C208279Jm c208279Jm = A0A.A04;
                    str2 = "navigationPerfLogger";
                    if (c208279Jm != null) {
                        c208279Jm.A0E("touch_end");
                        C208279Jm c208279Jm2 = A0A.A04;
                        if (c208279Jm2 != null) {
                            c208279Jm2.A0F("touch_duration_ms", (float) j);
                        }
                    }
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                float f11 = c54802fd.A01;
                C120985dq A09 = c54802fd.A09();
                if (A09 != null && A09.A0K != null && f11 != 0.0f && f6 != 1.0f && c54802fd.Ce6() && (A02 = C54802fd.A02(c54802fd)) != null) {
                    Context context = c54802fd.A0F.getContext();
                    UserSession userSession = c54802fd.A0P;
                    C37540Gfw c37540Gfw = A02.A09;
                    if (c37540Gfw != null) {
                        C37603Ggy c37603Ggy = new C37603Ggy(context, userSession, c37540Gfw.A19);
                        boolean z3 = true;
                        if (A09.CdW() && A09.A06().A0t) {
                            C37540Gfw c37540Gfw2 = A02.A09;
                            if (c37540Gfw2 != null) {
                                C37675GiC c37675GiC = c37540Gfw2.A06;
                                if (c37675GiC != null) {
                                    C11520jB A00 = ITO.A00(c37675GiC.BmI(A09));
                                    valueOf = Double.valueOf(c54802fd.A04);
                                    valueOf2 = Double.valueOf(j);
                                    boolean z4 = false;
                                    if (f2 != 1.0f) {
                                        z4 = true;
                                    }
                                    valueOf3 = Boolean.valueOf(z4);
                                    A022 = AbstractC58577Pxv.A02(A09, userSession);
                                    String str5 = c54802fd.A0H;
                                    str3 = "swipe_left_end";
                                    f3 = -1.0f;
                                    valueOf4 = Boolean.valueOf(z2);
                                    valueOf5 = Float.valueOf(f9);
                                    valueOf6 = Float.valueOf(f10);
                                    valueOf7 = Float.valueOf((float) j2);
                                    c120985dq = A09;
                                    str4 = str5;
                                    c50368MLv = new C50368MLv(A00, 9);
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                        } else {
                            f3 = -1.0f;
                            valueOf = Double.valueOf(c54802fd.A04);
                            valueOf2 = Double.valueOf(j);
                            if (f2 == 1.0f) {
                                z3 = false;
                            }
                            valueOf3 = Boolean.valueOf(z3);
                            A022 = AbstractC58577Pxv.A02(A09, userSession);
                            String str6 = c54802fd.A0H;
                            valueOf4 = Boolean.valueOf(z2);
                            valueOf5 = Float.valueOf(f9);
                            valueOf6 = Float.valueOf(f10);
                            valueOf7 = Float.valueOf((float) j2);
                            str3 = "swipe_left_end";
                            c120985dq = A09;
                            str4 = str6;
                        }
                        c37603Ggy.A04(c120985dq, valueOf3, valueOf4, valueOf, valueOf2, valueOf5, valueOf6, valueOf7, str3, A022, str4, c50368MLv, f7, f8, rawX, rawY, f3, f3);
                    }
                    str2 = "clipsViewerFragmentViewModel";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-531383674);
                }
            } catch (Throwable th) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(160069845);
                }
                throw th;
            }
        }
    }

    public final void A03(boolean z, float f) {
        View view;
        C59862oT c59862oT = this.A0G;
        C59862oT c59862oT2 = this.A0F;
        C59862oT c59862oT3 = this.A0E;
        if (c59862oT3 != null) {
            int i = 0;
            if (c59862oT3.A01 == f) {
                if (!z) {
                    throw new IllegalStateException("No support for disabling center panel");
                }
            } else {
                if (c59862oT != null && c59862oT.A01 == f) {
                    c59862oT.A00 = z;
                    view = c59862oT.A03;
                } else if (c59862oT2 != null && c59862oT2.A01 == f) {
                    c59862oT2.A00 = z;
                    view = c59862oT2.A03;
                }
                if (!z) {
                    i = 4;
                }
                view.setVisibility(i);
            }
            A01();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        InterfaceC59932oa interfaceC59932oa = this.A0D;
        if (interfaceC59932oa != null) {
            C59922oZ c59922oZ = (C59922oZ) interfaceC59932oa;
            if (Systrace.A0E(1L)) {
                C0fO.A01("SwipeNavigationListener.onNewPositionEnd", 780206285);
            }
            try {
                c59922oZ.A00 = null;
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-468676845);
                }
            } catch (Throwable th) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-572796928);
                }
                throw th;
            }
        }
        C2fe c2fe = this.A0C;
        if (c2fe != null) {
            c2fe.DVb();
        }
    }

    public final CameraConfiguration getCameraConfiguration() {
        return this.A0A;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C03K c03k = this.A0k;
        return c03k.A01 | c03k.A00;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (Systrace.A0E(1L)) {
            C0fO.A01("SwipeNavigationContainer.onLayout", -1122705237);
        }
        try {
            super.onLayout(z, i, i2, i3, i4);
            A01();
            this.A0A = null;
            this.A0H = null;
            this.A0L = null;
            this.A0M = null;
            this.A0K = null;
            this.A07 = -1;
            this.A0N = null;
            this.A0I = null;
            this.A0B = null;
            this.A09 = null;
            if (Systrace.A0E(1L)) {
                C0fO.A00(1199089147);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1329370479);
            }
            throw th;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (Systrace.A0E(1L)) {
            C0fO.A01("SwipeNavigationContainer.onMeasure", 746325628);
        }
        try {
            int max = Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight());
            C59862oT c59862oT = this.A0G;
            if (c59862oT != null) {
                c59862oT.A03.getLayoutParams().width = Math.min((int) (Math.abs(c59862oT.A01) * max), Integer.MAX_VALUE);
            }
            C59862oT c59862oT2 = this.A0F;
            if (c59862oT2 != null) {
                c59862oT2.A03.getLayoutParams().width = Math.min((int) (Math.abs(c59862oT2.A01) * max), Integer.MAX_VALUE);
            }
            super.onMeasure(i, i2);
            if (Systrace.A0E(1L)) {
                C0fO.A00(-809848562);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(375401408);
            }
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        C2fe c2fe;
        boolean z = this.A0a;
        boolean z2 = false;
        if (i != 0) {
            z2 = true;
        }
        boolean z3 = z | z2;
        this.A0a = z3;
        if (!z3 && i3 != 0 && (c2fe = this.A0C) != null && c2fe.Ce8(null)) {
            setInternalPosition(new PositionConfig(null, null, null, "swipe", null, null, null, null, null, null, null, null, null, ((float) this.A0g.A09.A00) + (i3 / getWidth()), 0, false));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        super.onRestoreInstanceState(((SavedState) parcelable).getSuperState());
        this.A0g.A08(r5.A00, true);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.A0Q) {
            return false;
        }
        if (!this.A0b) {
            this.A0b = true;
            return true;
        }
        float width = f / getWidth();
        float f3 = (float) this.A0g.A09.A00;
        if (this.A0h) {
            width = -width;
        }
        setInternalPosition(new PositionConfig(null, null, null, "swipe", null, null, null, null, null, null, null, null, null, f3 + width, 0, false));
        return true;
    }

    public final void setListener(InterfaceC59932oa interfaceC59932oa) {
        if (this.A0D != interfaceC59932oa) {
            this.A0D = interfaceC59932oa;
            this.A04 = Float.MAX_VALUE;
            this.A03 = Float.MAX_VALUE;
        }
    }

    public final float getPosition() {
        return getClampedPosition();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(972910576);
        super.onAttachedToWindow();
        this.A0g.A0A(this);
        A01();
        C0f9.A0D(1531959936, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-182695494);
        super.onDetachedFromWindow();
        this.A0g.A0B(this);
        C0f9.A0D(1549773247, A06);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        float clampedPosition = getClampedPosition();
        if (onSaveInstanceState != null) {
            return new SavedState(onSaveInstanceState, clampedPosition);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r6 != false) goto L12;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r0 = 805481628(0x3002ac9c, float:4.7539017E-10)
            int r5 = X.C0f9.A05(r0)
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            boolean r6 = super.onTouchEvent(r8)
            int r0 = r7.getChildCount()
            if (r0 == 0) goto L4c
            X.2fe r0 = r7.A0C
            r2 = 1
            if (r0 == 0) goto L4c
            boolean r0 = r0.Ce8(r8)
            if (r0 != r2) goto L4c
            android.view.GestureDetector r0 = r7.A0j
            boolean r0 = r0.onTouchEvent(r8)
            if (r0 != 0) goto L2c
            r0 = r6
            r6 = 0
            if (r0 == 0) goto L2d
        L2c:
            r6 = 1
        L2d:
            int r1 = r8.getActionMasked()
            if (r1 == r2) goto L3d
            r0 = 3
            if (r1 == r0) goto L3d
        L36:
            r0 = -135379567(0xfffffffff7ee4591, float:-9.66545E33)
        L39:
            X.C0f9.A0C(r0, r5)
            return r6
        L3d:
            float r4 = r7.A0X
            long r2 = r8.getEventTime()
            long r0 = r8.getDownTime()
            long r2 = r2 - r0
            r7.A02(r8, r4, r2)
            goto L36
        L4c:
            r0 = -411788747(0xffffffffe7749a35, float:-1.15510204E24)
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.swipenavigation.SwipeNavigationContainer.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        A01();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, X.03K] */
    public SwipeNavigationContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A0j = new GestureDetector(context, this);
        this.A0i = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.A0c = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        C55982hj A02 = AbstractC13560mi.A00().A02();
        A02.A06 = true;
        A02.A09(A0l);
        A02.A00 = 0.0010000000474974513d;
        A02.A02 = 1.0d;
        this.A0g = A02;
        this.A0d = 70;
        this.A0J = NetInfoModule.CONNECTION_TYPE_NONE;
        this.A0h = AbstractC13620mo.A02(context);
        this.A04 = Float.MAX_VALUE;
        this.A03 = Float.MAX_VALUE;
        this.A00 = 1.0d;
        this.A0e = new RectF();
        this.A0f = new RectF();
        this.A0k = new Object();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwipeNavigationContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ SwipeNavigationContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
