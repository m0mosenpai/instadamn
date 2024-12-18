package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Zb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75113Zb implements InterfaceC75123Zc, InterfaceC75133Zd, InterfaceC75143Ze {
    public static final /* synthetic */ C0YR[] A3k = {new AnonymousClass013(C75113Zb.class, "translationState", "getTranslationState()Lcom/instagram/feed/ui/state/MediaState$TranslationState;", 0), new AnonymousClass013(C75113Zb.class, "hasDelayCollectionPeShowed", "getHasDelayCollectionPeShowed()Z", 0), new AnonymousClass013(C75113Zb.class, "shouldShowCTAMidScene", "getShouldShowCTAMidScene()Z", 0), new AnonymousClass013(C75113Zb.class, "shouldHideFloatingBubble", "getShouldHideFloatingBubble()Z", 0), new AnonymousClass013(C75113Zb.class, "isMidsceneDismissedExplicitly", "isMidsceneDismissedExplicitly()Z", 0), new AnonymousClass013(C75113Zb.class, "isDelaySwipeLeftNudgeOrNuxShowed", "isDelaySwipeLeftNudgeOrNuxShowed()Z", 0), new AnonymousClass013(C75113Zb.class, "isDelayedSkipAdsDisabledForMedia", "isDelayedSkipAdsDisabledForMedia()Z", 0), new AnonymousClass013(C75113Zb.class, "isAutoScrollDisabledForMedia", "isAutoScrollDisabledForMedia()Z", 0), new AnonymousClass013(C75113Zb.class, "shouldBeShowingCountdownToAutoScroll", "getShouldBeShowingCountdownToAutoScroll()Z", 0), new AnonymousClass013(C75113Zb.class, "nonVideoCountDownRemainingTime", "getNonVideoCountDownRemainingTime()J", 0), new AnonymousClass013(C75113Zb.class, "videoAutoScrollCountDownRemainingTime", "getVideoAutoScrollCountDownRemainingTime()J", 0), new AnonymousClass013(C75113Zb.class, "loopsLeftToAutoScroll", "getLoopsLeftToAutoScroll()I", 0), new AnonymousClass013(C75113Zb.class, "autoScrollCancellationReason", "getAutoScrollCancellationReason()Lkotlin/Pair;", 0), new AnonymousClass013(C75113Zb.class, "isShowingPauseStateUx", "isShowingPauseStateUx()Z", 0)};
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public int A0V;
    public int A0W;
    public int A0X;
    public int A0Y;
    public int A0Z;
    public int A0a;
    public long A0b;
    public long A0c;
    public Parcelable A0d;
    public MotionEvent A0e;
    public EnumC39632HiN A0f;
    public C43743JWc A0g;
    public C5QE A0h;
    public C3VZ A0i;
    public C86263sx A0j;
    public C37905Gm2 A0k;
    public EnumC75203Zn A0l;
    public EnumC75193Zm A0m;
    public EnumC37732Gj7 A0n;
    public AnonymousClass341 A0o;
    public C40861ut A0p;
    public C87353ut A0q;
    public C87353ut A0r;
    public C4ZF A0s;
    public C23479Aas A0t;
    public C684336g A0u;
    public SlideInAndOutIconView A0v;
    public Boolean A0w;
    public Boolean A0x;
    public Boolean A0y;
    public Boolean A0z;
    public Integer A10;
    public Integer A11;
    public Integer A12;
    public Integer A13;
    public Integer A14;
    public Integer A15;
    public Integer A16;
    public Integer A17;
    public Integer A18;
    public Integer A19;
    public String A1A;
    public String A1B;
    public String A1C;
    public String A1D;
    public String A1E;
    public String A1F;
    public String A1G;
    public String A1H;
    public String A1I;
    public String A1J;
    public String A1K;
    public String A1L;
    public String A1M;
    public String A1N;
    public String A1O;
    public String A1P;
    public String A1Q;
    public String A1R;
    public String A1S;
    public String A1T;
    public String A1U;
    public String A1V;
    public String A1W;
    public WeakReference A1X;
    public WeakReference A1Y;
    public WeakReference A1Z;
    public WeakReference A1a;
    public WeakReference A1b;
    public WeakReference A1c;
    public HashMap A1d;
    public List A1e;
    public List A1f;
    public List A1g;
    public List A1h;
    public boolean A1i;
    public boolean A1j;
    public boolean A1k;
    public boolean A1l;
    public boolean A1m;
    public boolean A1n;
    public boolean A1o;
    public boolean A1p;
    public boolean A1q;
    public boolean A1r;
    public boolean A1s;
    public boolean A1t;
    public boolean A1u;
    public boolean A1v;
    public boolean A1w;
    public boolean A1x;
    public boolean A1y;
    public boolean A1z;
    public boolean A20;
    public boolean A21;
    public boolean A22;
    public boolean A23;
    public boolean A24;
    public boolean A25;
    public boolean A26;
    public boolean A27;
    public boolean A28;
    public boolean A29;
    public boolean A2A;
    public boolean A2B;
    public boolean A2C;
    public boolean A2D;
    public boolean A2E;
    public boolean A2F;
    public boolean A2G;
    public boolean A2H;
    public boolean A2I;
    public boolean A2J;
    public boolean A2K;
    public boolean A2L;
    public boolean A2M;
    public boolean A2N;
    public boolean A2O;
    public boolean A2P;
    public boolean A2Q;
    public boolean A2R;
    public boolean A2S;
    public boolean A2T;
    public boolean A2U;
    public boolean A2V;
    public boolean A2W;
    public boolean A2X;
    public boolean A2Y;
    public boolean A2Z;
    public boolean A2a;
    public boolean A2b;
    public boolean A2c;
    public boolean A2d;
    public boolean A2e;
    public boolean A2f;
    public boolean A2g;
    public boolean A2h;
    public boolean A2i;
    public boolean A2j;
    public boolean A2k;
    public boolean A2l;
    public boolean A2m;
    public boolean A2n;
    public boolean A2o;
    public boolean A2p;
    public boolean A2q;
    public boolean A2r;
    public boolean A2s;
    public boolean A2t;
    public boolean A2u;
    public boolean A2v;
    public boolean A2w;
    public boolean A2x;
    public boolean A2y;
    public boolean A2z;
    public boolean A30;
    public boolean A31;
    public boolean A32;
    public boolean A33;
    public boolean A34;
    public boolean A35;
    public boolean A36;
    public boolean A37;
    public boolean A38;
    public boolean A39;
    public boolean A3A;
    public boolean A3B;
    public boolean A3C;
    public boolean A3D;
    public boolean A3E;
    public boolean A3F;
    public boolean A3G;
    public boolean A3H;
    public int A3I;
    public C41007IEc A3J;
    public C42S A3K;
    public C131325wL A3L;
    public WeakReference A3M;
    public WeakReference A3N;
    public boolean A3O;
    public final SparseIntArray A3P;
    public final C3Zk A3Q;
    public final C3Zk A3R;
    public final C3Zk A3S;
    public final C3Zk A3T;
    public final C3Zk A3U;
    public final C3Zk A3V;
    public final C3Zk A3W;
    public final C3Zk A3X;
    public final C3Zk A3Y;
    public final C3Zk A3Z;
    public final C3Zk A3a;
    public final C3Zk A3b;
    public final C3Zk A3c;
    public final java.util.Set A3d;
    public final boolean A3e;
    public final C3Zk A3f;
    public final C75153Zf A3g;
    public final Map A3h;
    public final Map A3i;
    public final java.util.Set A3j;

    public final void A0D(int i) {
        C11T.A06("This operation must be run on UI thread.");
        boolean z = A0p() && this.A3I != i;
        this.A2q = z;
        if (z) {
            this.A0T = this.A3I;
        }
        this.A3I = i;
    }

    public final void A0F(Context context) {
        ValueAnimator valueAnimator;
        final C42S c42s = this.A3K;
        if (c42s == null) {
            c42s = new C42S(context);
            this.A3K = c42s;
        }
        Integer num = c42s.A03;
        Integer num2 = C05F.A00;
        if (num != num2 && (valueAnimator = c42s.A01) != null) {
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.cancel();
            c42s.A03 = num2;
        }
        c42s.A03 = C05F.A01;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(c42s.A04);
        c42s.A01 = duration;
        duration.setStartDelay(3000L);
        ValueAnimator valueAnimator2 = c42s.A01;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = c42s.A00;
        if (animatorUpdateListener == null) {
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: X.42T
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                }
            };
            c42s.A00 = animatorUpdateListener;
        }
        valueAnimator2.addUpdateListener(animatorUpdateListener);
        ValueAnimator valueAnimator3 = c42s.A01;
        AbstractC87373uv abstractC87373uv = c42s.A02;
        if (abstractC87373uv == null) {
            abstractC87373uv = new AbstractC87373uv() { // from class: X.42U
                @Override // X.AbstractC87373uv, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    C42S.this.A03 = C05F.A00;
                }

                @Override // X.AbstractC87373uv, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    C42S.this.A03 = C05F.A0C;
                }
            };
            c42s.A02 = abstractC87373uv;
        }
        valueAnimator3.addListener(abstractC87373uv);
        c42s.A01.start();
    }

    public final void A0H(C5QE c5qe, C30R c30r, int i) {
        C14360o3.A0B(c30r, 2);
        if (this.A0s == null) {
            this.A0s = new C4ZF();
            for (Object obj : this.A3j) {
                C4ZF c4zf = this.A0s;
                if (c4zf != null) {
                    c4zf.A07.add(obj);
                }
            }
        }
        this.A0O = i;
        this.A0h = c5qe;
        C4ZF c4zf2 = this.A0s;
        if (c4zf2 != null) {
            c4zf2.A02(c30r);
        }
    }

    public final void A0L(C33R c33r, Integer num, boolean z) {
        int intValue;
        C14360o3.A0B(c33r, 0);
        Map map = this.A3h;
        synchronized (map) {
            Class<?> cls = c33r;
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            Integer valueOf = Integer.valueOf(intValue);
            if (z) {
                cls = c33r.getClass();
            }
            map.put(AbstractC13670mt.A06("%d%d", valueOf, Integer.valueOf(cls.hashCode())), new WeakReference(c33r));
        }
    }

    public final void A0M(C33R c33r, Integer num, boolean z) {
        int intValue;
        C14360o3.A0B(c33r, 0);
        Map map = this.A3h;
        synchronized (map) {
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            Integer valueOf = Integer.valueOf(intValue);
            Class<?> cls = c33r;
            if (z) {
                cls = c33r.getClass();
            }
            map.remove(AbstractC13670mt.A06("%d%d", valueOf, Integer.valueOf(cls.hashCode())));
        }
    }

    public final void A0N(EnumC75183Zl enumC75183Zl) {
        C14360o3.A0B(enumC75183Zl, 0);
        this.A3b.A00(this, enumC75183Zl);
    }

    public final void A0R(C3WC c3wc) {
        C14360o3.A0B(c3wc, 0);
        java.util.Set set = this.A3j;
        set.add(new WeakReference(c3wc));
        C4ZF c4zf = this.A0s;
        if (c4zf != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                c4zf.A07.add(it.next());
            }
        }
    }

    public final void A0S(C3WC c3wc) {
        C14360o3.A0B(c3wc, 0);
        C4ZF c4zf = this.A0s;
        if (c4zf != null) {
            Iterator it = this.A3j.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                if (reference.get() == c3wc) {
                    c4zf.A07.remove(reference);
                    it.remove();
                }
            }
        }
    }

    public final void A0V(InterfaceC74253Vg interfaceC74253Vg) {
        C14360o3.A0B(interfaceC74253Vg, 0);
        WeakReference weakReference = this.A3M;
        if (weakReference != null && weakReference.get() == interfaceC74253Vg) {
            A0T(null);
        }
    }

    public final void A0W(InterfaceC74253Vg interfaceC74253Vg) {
        C14360o3.A0B(interfaceC74253Vg, 0);
        WeakReference weakReference = this.A1Z;
        if (weakReference != null && weakReference.get() == interfaceC74253Vg) {
            A0U(null);
        }
    }

    public final void A0Y(InterfaceC74263Vh interfaceC74263Vh) {
        C14360o3.A0B(interfaceC74263Vh, 0);
        WeakReference weakReference = this.A3N;
        if (weakReference != null && weakReference.get() == interfaceC74263Vh) {
            A0X(null);
        }
    }

    public final void A0e(boolean z) {
        if (z != this.A2A) {
            this.A2A = z;
            if (!this.A1k) {
                this.A1k = true;
            }
            A00(this, 33);
        }
    }

    public static final void A00(C75113Zb c75113Zb, int i) {
        HashMap hashMap;
        Map map = c75113Zb.A3h;
        synchronized (map) {
            hashMap = new HashMap(map);
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                if (((WeakReference) entry.getValue()).get() == null) {
                    map.remove(str);
                }
            }
        }
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            C33R c33r = (C33R) ((Reference) ((Map.Entry) it.next()).getValue()).get();
            if (c33r != null) {
                c33r.DSJ(c75113Zb, i);
            }
        }
    }

    public final int A01() {
        int i;
        int i2 = this.A03;
        SparseIntArray sparseIntArray = this.A3P;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(i2);
        }
        return i;
    }

    public final int A02() {
        int i;
        if (!this.A3O && !A0o() && (i = this.A0U) != -1) {
            if (i <= 0) {
                return 0;
            }
            return 1;
        }
        return 100;
    }

    public final Pair A03() {
        Integer num = this.A17;
        Integer num2 = this.A16;
        if (num == null && num2 == null) {
            return null;
        }
        return Pair.create(num, num2);
    }

    public final Pair A04() {
        String str = this.A1R;
        String str2 = this.A1N;
        if (str == null && str2 == null) {
            return null;
        }
        return Pair.create(str, str2);
    }

    public final C41007IEc A05() {
        C41007IEc c41007IEc = this.A3J;
        if (c41007IEc == null) {
            C41007IEc c41007IEc2 = new C41007IEc();
            this.A3J = c41007IEc2;
            return c41007IEc2;
        }
        return c41007IEc;
    }

    public final C38616GyJ A06() {
        Integer num;
        int i = this.A03;
        int position = getPosition();
        boolean z = this.A28;
        if (A0n()) {
            num = C05F.A0C;
        } else if (!this.A2A) {
            num = C05F.A0N;
        } else if (z) {
            num = C05F.A01;
        } else {
            num = C05F.A00;
        }
        return new C38616GyJ(num, i, position, z);
    }

    public final C86393tC A07(int i, int i2) {
        C86393tC c86393tC;
        Map map = this.A3i;
        synchronized (map) {
            Integer valueOf = Integer.valueOf(i);
            Integer valueOf2 = Integer.valueOf(i2);
            c86393tC = (C86393tC) map.get(Pair.create(valueOf, valueOf2));
            if (c86393tC == null) {
                c86393tC = new C86393tC();
                c86393tC.A00 = C05F.A01;
                map.put(Pair.create(valueOf, valueOf2), c86393tC);
            }
        }
        return c86393tC;
    }

    public final void A08() {
        C684336g c684336g = this.A0u;
        if (c684336g == null) {
            c684336g = new C684336g();
            this.A0u = c684336g;
        }
        WeakReference weakReference = this.A1c;
        if (weakReference != null && c684336g != null) {
            c684336g.A04(weakReference);
        }
        C684336g c684336g2 = this.A0u;
        if (c684336g2 != null) {
            c684336g2.A00();
        }
    }

    public final void A09(int i) {
        if (this.A0E == -1) {
            this.A0E = i;
        }
    }

    public final void A0A(int i) {
        if (i != this.A02) {
            this.A02 = i;
            A00(this, 4);
        }
    }

    public final void A0B(int i) {
        if (i != this.A03) {
            this.A03 = i;
            A00(this, 7);
        }
    }

    public final void A0C(int i) {
        boolean z = false;
        if (this.A05 != i) {
            z = true;
        }
        this.A05 = i;
        if (z) {
            A00(this, 48);
        }
    }

    public final void A0E(int i, int i2) {
        SparseIntArray sparseIntArray = this.A3P;
        synchronized (sparseIntArray) {
            sparseIntArray.put(i2, i);
        }
    }

    public final void A0G(Drawable drawable) {
        C43743JWc c43743JWc = this.A0g;
        if (c43743JWc != null && (drawable instanceof C44360Jiz)) {
            C44360Jiz c44360Jiz = (C44360Jiz) drawable;
            c43743JWc.A00 = c44360Jiz;
            if (c44360Jiz != null) {
                if (!c44360Jiz.A04) {
                    c44360Jiz.A04 = true;
                    c44360Jiz.invalidateSelf();
                }
                C44360Jiz c44360Jiz2 = c43743JWc.A00;
                if (c44360Jiz2 != null) {
                    c44360Jiz2.A02 = 0L;
                    c44360Jiz2.A00 = 0;
                    C55982hj c55982hj = c43743JWc.A02;
                    C14360o3.A06(c55982hj);
                    c55982hj.A09(C43743JWc.A03);
                    c55982hj.A06 = true;
                    c55982hj.A08(0.0d, true);
                    c55982hj.A03();
                    return;
                }
            }
            C14360o3.A0F("gifDrawable");
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (X.C14360o3.A0K(r0.get(), r4) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0I(X.C73083Pj r4) {
        /*
            r3 = this;
            java.lang.ref.WeakReference r0 = r3.A1b
            r2 = 1
            if (r0 == 0) goto L10
            java.lang.Object r0 = r0.get()
            boolean r0 = X.C14360o3.A0K(r0, r4)
            r1 = 0
            if (r0 != 0) goto L11
        L10:
            r1 = 1
        L11:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r3.A1b = r0
            if (r1 == 0) goto L23
            android.graphics.Bitmap r0 = r4.A02
            if (r0 == 0) goto L20
            r3.A3O = r2
        L20:
            A00(r3, r2)
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75113Zb.A0I(X.3Pj):void");
    }

    public final void A0J(C37905Gm2 c37905Gm2, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        InterfaceC74263Vh interfaceC74263Vh;
        if (z4 && this.A0t == null) {
            C23479Aas c23479Aas = new C23479Aas();
            this.A0t = c23479Aas;
            c23479Aas.A03 = this.A3N;
            C55982hj c55982hj = c23479Aas.A09;
            if (!c55982hj.A0C()) {
                c23479Aas.Dnm(c55982hj);
            }
            C23479Aas c23479Aas2 = this.A0t;
            if (c23479Aas2 != null) {
                c23479Aas2.A04 = this.A1a;
                C55982hj c55982hj2 = c23479Aas2.A0A;
                if (!c55982hj2.A0C()) {
                    c23479Aas2.Dnm(c55982hj2);
                }
            }
        } else {
            if (this.A3L == null) {
                C131325wL c131325wL = new C131325wL();
                this.A3L = c131325wL;
                c131325wL.A00(this.A3M);
                C131325wL c131325wL2 = this.A3L;
                if (c131325wL2 != null) {
                    c131325wL2.A01(this.A1Z);
                }
            }
            if (!z4) {
                C131325wL c131325wL3 = this.A3L;
                if (c131325wL3 == null) {
                    return;
                }
                c131325wL3.A02(z, z2, z3);
                return;
            }
        }
        C23479Aas c23479Aas3 = this.A0t;
        if (c23479Aas3 != null) {
            if (z3 && (z2 || !z)) {
                WeakReference weakReference = c23479Aas3.A03;
                if (weakReference != null && (interfaceC74263Vh = (InterfaceC74263Vh) weakReference.get()) != null) {
                    interfaceC74263Vh.E4K();
                }
                C55982hj c55982hj3 = c23479Aas3.A09;
                c55982hj3.A09(C23479Aas.A0D);
                c55982hj3.A06 = false;
                z5 = true;
                c55982hj3.A08(0.0d, true);
                c55982hj3.A06(1.0d);
                C17u c17u = new C17u(-75, -30);
                C50722Ut c50722Ut = AbstractC50712Us.A00;
                c23479Aas3.A00 = C17s.A04(c50722Ut, c17u);
                c23479Aas3.A01 = C17s.A04(c50722Ut, new C17u(-10, 10));
                C55982hj c55982hj4 = c23479Aas3.A08;
                c55982hj4.A09(C23479Aas.A0C);
                c55982hj4.A06 = false;
                c55982hj4.A08(0.0d, true);
                c55982hj4.A06(1.0d);
                C55982hj c55982hj5 = c23479Aas3.A07;
                c55982hj5.A09(C23479Aas.A0B);
                c55982hj5.A06 = false;
                c55982hj5.A08(c23479Aas3.A00, true);
                c55982hj5.A06(c23479Aas3.A01);
            } else {
                z5 = true;
                c23479Aas3.A09.A08(0.0d, true);
                c23479Aas3.A08.A08(0.0d, true);
                c23479Aas3.A07.A08(0.0d, true);
                c37905Gm2 = null;
            }
            c23479Aas3.A02 = c37905Gm2;
            if (z && z2) {
                C55982hj c55982hj6 = c23479Aas3.A0A;
                c55982hj6.A09(C131325wL.A04);
                c55982hj6.A08(-0.1d, z5);
                c55982hj6.A06(0.1d);
                return;
            }
            C55982hj c55982hj7 = c23479Aas3.A0A;
            c55982hj7.A09(C23479Aas.A0C);
            c55982hj7.A08(0.0d, z5);
            c55982hj7.A06(1.0d);
        }
    }

    public final void A0K(EnumC75203Zn enumC75203Zn) {
        this.A0l = enumC75203Zn;
        A00(this, 24);
    }

    public final void A0O(EnumC37732Gj7 enumC37732Gj7) {
        if (this.A0n != enumC37732Gj7) {
            this.A0n = enumC37732Gj7;
            boolean z = false;
            if (enumC37732Gj7 == EnumC37732Gj7.A04) {
                z = true;
            }
            this.A2z = z;
            A00(this, 73);
        }
    }

    public final void A0P(C3QU c3qu) {
        WeakReference weakReference;
        C87353ut c87353ut = this.A0q;
        if (c87353ut == null) {
            c87353ut = new C87353ut();
            this.A0q = c87353ut;
        }
        if (c3qu != null) {
            weakReference = new WeakReference(c3qu);
        } else {
            weakReference = null;
        }
        c87353ut.A01 = weakReference;
        List list = c87353ut.A02.A04;
        list.clear();
        list.add(new WeakReference(c87353ut.A00));
        WeakReference weakReference2 = c87353ut.A01;
        if (weakReference2 != null) {
            list.add(weakReference2);
        }
    }

    public final void A0Q(C3QU c3qu) {
        WeakReference weakReference;
        C87353ut c87353ut = this.A0r;
        if (c87353ut == null) {
            c87353ut = new C87353ut();
            this.A0r = c87353ut;
        }
        if (c3qu != null) {
            weakReference = new WeakReference(c3qu);
        } else {
            weakReference = null;
        }
        c87353ut.A01 = weakReference;
        List list = c87353ut.A02.A04;
        list.clear();
        list.add(new WeakReference(c87353ut.A00));
        WeakReference weakReference2 = c87353ut.A01;
        if (weakReference2 != null) {
            list.add(weakReference2);
        }
    }

    public final void A0T(InterfaceC74253Vg interfaceC74253Vg) {
        WeakReference weakReference;
        if (interfaceC74253Vg != null) {
            weakReference = new WeakReference(interfaceC74253Vg);
        } else {
            weakReference = null;
        }
        this.A3M = weakReference;
        C131325wL c131325wL = this.A3L;
        if (c131325wL != null) {
            c131325wL.A00(weakReference);
        }
    }

    public final void A0U(InterfaceC74253Vg interfaceC74253Vg) {
        WeakReference weakReference;
        if (interfaceC74253Vg != null) {
            weakReference = new WeakReference(interfaceC74253Vg);
        } else {
            weakReference = null;
        }
        this.A1Z = weakReference;
        C131325wL c131325wL = this.A3L;
        if (c131325wL != null) {
            c131325wL.A01(weakReference);
        }
    }

    public final void A0X(InterfaceC74263Vh interfaceC74263Vh) {
        WeakReference weakReference;
        if (interfaceC74263Vh != null) {
            weakReference = new WeakReference(interfaceC74263Vh);
        } else {
            weakReference = null;
        }
        this.A3N = weakReference;
        C23479Aas c23479Aas = this.A0t;
        if (c23479Aas != null) {
            c23479Aas.A03 = weakReference;
            C55982hj c55982hj = c23479Aas.A09;
            if (!c55982hj.A0C()) {
                c23479Aas.Dnm(c55982hj);
            }
        }
    }

    public final void A0Z(Integer num) {
        if (this.A10 != num) {
            this.A10 = num;
            A00(this, 29);
        }
    }

    public final void A0a(Integer num, Integer num2) {
        if (num != null) {
            this.A0a = num.intValue();
        }
        if (num2 != null) {
            this.A0Z = num2.intValue();
        }
    }

    public final void A0b(boolean z) {
        if (this.A2R != z) {
            this.A2R = z;
            A00(this, 39);
        }
    }

    public final void A0c(boolean z) {
        if (this.A2S != z) {
            this.A2S = z;
            A00(this, 39);
        }
    }

    public final void A0d(boolean z) {
        boolean z2 = false;
        if (this.A1p != z) {
            z2 = true;
        }
        this.A1p = z;
        if (z2) {
            Iterator<E> it = this.A3g.A00.iterator();
            while (it.hasNext()) {
                ((InterfaceC16820sZ) it.next()).invoke();
            }
            A00(this, 46);
        }
    }

    public final void A0f(boolean z) {
        this.A3T.A00(this, Boolean.valueOf(z));
    }

    public final void A0g(boolean z) {
        if (this.A2F != z) {
            this.A2F = z;
            A00(this, 19);
        }
    }

    public final void A0h(boolean z) {
        if (z != this.A1y) {
            this.A1y = z;
            A00(this, 10);
        }
    }

    public final void A0i(boolean z) {
        this.A3Z.A00(this, Boolean.valueOf(z));
    }

    public final void A0j(boolean z) {
        this.A3f.A00(this, Boolean.valueOf(z));
    }

    public final void A0k(boolean z) {
        if (this.A1z != z) {
            this.A1z = z;
            A00(this, 58);
        }
    }

    public final void A0l(boolean z) {
        if (z != this.A21) {
            this.A21 = z;
            A00(this, 2);
        }
    }

    public final void A0m(boolean z, boolean z2) {
        if (z != this.A28) {
            this.A28 = z;
            this.A2O = z2;
            A00(this, 5);
        }
    }

    public final boolean A0n() {
        return ((Boolean) this.A3f.A00).booleanValue();
    }

    public final boolean A0o() {
        C73083Pj c73083Pj;
        WeakReference weakReference = this.A1b;
        if (weakReference != null && (c73083Pj = (C73083Pj) weakReference.get()) != null && c73083Pj.A02 != null) {
            return true;
        }
        return false;
    }

    public final boolean A0p() {
        if (this.A3I == -1) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC75133Zd
    public final int Am8() {
        return this.A03;
    }

    @Override // X.InterfaceC75123Zc
    public final int BLI() {
        return this.A06;
    }

    @Override // X.InterfaceC75123Zc
    public final int BLj() {
        return this.A07;
    }

    @Override // X.InterfaceC75143Ze
    public final boolean Ceb() {
        if (this.A0m == EnumC75193Zm.A0F) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC75123Zc
    public final int getPosition() {
        if (this.A3I < 0) {
            C0w9.A03("MediaState#getPosition", "media state position is not set");
        }
        return this.A3I;
    }

    public C75113Zb(boolean z) {
        this.A3e = z;
        this.A3h = new HashMap();
        this.A3i = new HashMap();
        this.A3P = new SparseIntArray();
        this.A0o = AnonymousClass341.A0K;
        this.A00 = 1.0f;
        int i = z ? 0 : -1;
        this.A03 = i;
        this.A09 = i;
        this.A27 = true;
        this.A0i = C3VZ.A03;
        this.A1w = true;
        this.A1u = true;
        this.A3d = new HashSet();
        this.A3g = new C75153Zf();
        Integer num = C05F.A01;
        this.A15 = num;
        Integer num2 = C05F.A00;
        this.A10 = num2;
        this.A1r = true;
        this.A3b = new C3Zk(C3Zj.A00, 81);
        this.A0m = EnumC75193Zm.A0F;
        this.A0l = EnumC75203Zn.A04;
        this.A14 = num2;
        this.A0F = -1;
        this.A0G = -1;
        this.A0R = -1;
        C16930sl c16930sl = C16930sl.A00;
        this.A1h = c16930sl;
        this.A1g = c16930sl;
        this.A3I = -1;
        this.A06 = -1;
        this.A07 = -1;
        this.A0W = -1;
        this.A0T = -1;
        this.A1I = "";
        this.A3j = new HashSet(1);
        this.A08 = -1;
        this.A0P = -1;
        this.A0H = -1;
        this.A0N = -1;
        this.A0M = -1;
        this.A0L = -1;
        this.A0J = -1;
        this.A0K = -1;
        this.A0I = -1;
        this.A0E = -1;
        this.A13 = num;
        this.A3R = new C3Zk(C75213Zo.A00, 61);
        this.A3f = new C3Zk(C75223Zp.A00, 52);
        this.A3a = new C3Zk(C75233Zq.A00, 77);
        this.A3V = new C3Zk(C75243Zr.A00, 52);
        this.A3T = new C3Zk(C75253Zs.A00, 45);
        this.A3U = new C3Zk(C75263Zt.A00, 62);
        this.A3S = new C3Zk(C75273Zu.A00, 57);
        this.A3Z = new C3Zk(C75283Zv.A00, 57);
        this.A3Y = new C3Zk(C75293Zw.A00, 66);
        this.A3c = new C3Zk(C75303Zx.A00, 69);
        this.A3X = new C3Zk(C75313Zy.A00, 70);
        this.A3Q = new C3Zk(C75323Zz.A00, 71);
        this.A3W = new C3Zk(C75333a0.A00, 75);
    }

    public C75113Zb(int i, boolean z) {
        this(i > 0);
        this.A3O = z;
        if (this.A3e && i > 0) {
            this.A04 = i;
        }
    }

    public C75113Zb() {
        this(false);
    }
}
