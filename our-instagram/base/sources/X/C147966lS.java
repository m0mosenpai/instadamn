package X;

import android.animation.AnimatorSet;
import android.content.Intent;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.model.reels.Reel;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6lS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147966lS implements InterfaceC145136gY, InterfaceC147946lQ {
    public float A00;
    public int A01;
    public long A02;
    public long A03;
    public C41181vS A04;
    public C141596ac A05;
    public ChoreographerFrameCallbackC147976lT A06;
    public boolean A07;
    public final UserSession A08;
    public final C3G2 A09;
    public final C145826hf A0A;
    public final InterfaceC1118853a A0B;
    public final InterfaceC147266kB A0C;
    public final InterfaceC1119053c A0D;
    public final InterfaceC147516kc A0E;
    public final Map A0F;

    public C147966lS(UserSession userSession, C3G2 c3g2, C145826hf c145826hf, InterfaceC1118853a interfaceC1118853a, InterfaceC147266kB interfaceC147266kB, InterfaceC1119053c interfaceC1119053c, InterfaceC147516kc interfaceC147516kc) {
        C14360o3.A0B(interfaceC147266kB, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c3g2, 3);
        C14360o3.A0B(interfaceC147516kc, 6);
        this.A0C = interfaceC147266kB;
        this.A08 = userSession;
        this.A09 = c3g2;
        this.A0B = interfaceC1118853a;
        this.A0D = interfaceC1119053c;
        this.A0E = interfaceC147516kc;
        this.A0A = c145826hf;
        this.A06 = new ChoreographerFrameCallbackC147976lT(this);
        this.A0F = new LinkedHashMap();
    }

    @Override // X.InterfaceC145136gY
    public final void D8t(C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw, C141596ac c141596ac) {
        Integer B21;
        C14360o3.A0B(c41181vS, 1);
        C14360o3.A0B(c141596ac, 2);
        C14360o3.A0B(c41551w4, 3);
        int i = 0;
        if (this.A07 && C14360o3.A0K(this.A04, c41181vS)) {
            return;
        }
        A05();
        this.A04 = c41181vS;
        this.A05 = c141596ac;
        this.A00 = AbstractC130925vf.A01(c41181vS, c41551w4, c141596ac);
        C40I A0F = c41181vS.A0F();
        if (A0F != null && (B21 = A0F.B21()) != null) {
            i = (B21.intValue() * 1000) + 500;
        }
        this.A01 = i;
        this.A07 = true;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DNK(Reel reel) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DOJ(int i) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DPQ() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DPR() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DWn() {
    }

    @Override // X.InterfaceC145136gY
    public final void DXv(String str) {
        C14360o3.A0B(str, 0);
        if (!str.equals("end_scene") && this.A07 && !A06() && !A01()) {
            C141596ac c141596ac = this.A05;
            if (c141596ac != null) {
                c141596ac.A05(C05F.A00);
                Choreographer.getInstance().removeFrameCallback(this.A06);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // X.InterfaceC147946lQ
    public final void Dc1(C41181vS c41181vS, C41551w4 c41551w4, C141596ac c141596ac, float f) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djr(int i) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djs(int i, int i2) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dju(int i, int i2) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djv() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dyy() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dz0() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dz7() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void E00(C41181vS c41181vS, InterfaceC143586dx interfaceC143586dx) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void onDestroy() {
    }

    public static final float A00(C41181vS c41181vS, C41551w4 c41551w4, C141596ac c141596ac) {
        if (c141596ac.A0H > 0) {
            return c141596ac.A0A;
        }
        if (!AbstractC141736aq.A02(c41551w4)) {
            return AbstractC130925vf.A01(c41181vS, c41551w4, c141596ac);
        }
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null) {
            return (float) AbstractC141736aq.A00(c41551w4, c38321qM.A1C());
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final boolean A01() {
        C141596ac c141596ac = this.A05;
        if (c141596ac != null) {
            if (c141596ac.A0V != null) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final C140436Wx A02() {
        Object obj;
        String str;
        ReboundViewPager reboundViewPager = ((C147256kA) this.A0C).A04;
        View view = reboundViewPager.A0F;
        if (view != null) {
            Object tag = view.getTag();
            if (tag instanceof C140436Wx) {
                return (C140436Wx) tag;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Current view is not an ad. It is \"");
            if (tag == null || (obj = tag.getClass()) == null) {
                obj = "null";
            }
            sb.append(obj);
            sb.append("\". More Info: ");
            C41181vS c41181vS = this.A04;
            String str2 = "}], ";
            if (c41181vS != null) {
                sb.append("[{isSponsored: ");
                sb.append(c41181vS.CdW());
                sb.append("}, {adId: ");
                sb.append(c41181vS.A0V(this.A08));
                sb.append("}], ");
            } else {
                sb.append("[ReelItem is null!], ");
            }
            C141596ac c141596ac = this.A05;
            if (c141596ac != null) {
                sb.append("[{isEndSceneAvailable: ");
                Integer num = c141596ac.A0V;
                boolean z = false;
                if (num != null) {
                    z = true;
                }
                sb.append(z);
                sb.append("}, {EndSceneState: ");
                if (num != null) {
                    switch (num.intValue()) {
                        case 1:
                            str = "PLAYING";
                            break;
                        case 2:
                            str = "FINISHED";
                            break;
                        case 3:
                            str = "CANCELLED";
                            break;
                        default:
                            str = "PAUSED";
                            break;
                    }
                } else {
                    str = "N/A";
                }
                sb.append(str);
                sb.append("}, {ReelItemStatePosition: ");
                sb.append(c141596ac.A0I);
                sb.append("}, {ViewPagerCurrentIndex: ");
                sb.append(reboundViewPager.A08);
            } else {
                str2 = "[ReelItemState is null!], ";
            }
            sb.append(str2);
            sb.append("[{isBound: ");
            sb.append(this.A07);
            sb.append("}, {isUnset(): ");
            sb.append(A01());
            sb.append("}, {isCancelled(): ");
            C141596ac c141596ac2 = this.A05;
            if (c141596ac2 != null) {
                Integer num2 = c141596ac2.A0V;
                boolean z2 = false;
                if (num2 == C05F.A0N) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append("}, {isFinished(): ");
                boolean z3 = false;
                if (num2 == C05F.A0C) {
                    z3 = true;
                }
                sb.append(z3);
                sb.append("}, {isPaused(): ");
                sb.append(A06());
                sb.append("}, {isPlaying(): ");
                sb.append(A07());
                sb.append("}]");
                String obj2 = sb.toString();
                C14360o3.A07(obj2);
                throw new IllegalStateException(obj2);
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A04() {
        if (this.A07 && !A01()) {
            C141596ac c141596ac = this.A05;
            if (c141596ac != null) {
                c141596ac.A05(null);
                W33 A03 = A03();
                AnimatorSet animatorSet = A03.A01;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                W33.A00(A03);
                this.A03 = 0L;
                Choreographer.getInstance().removeFrameCallback(this.A06);
                Handler handler = ((TextureViewSurfaceTextureListenerC147506ka) this.A0E).A0s;
                handler.removeMessages(0);
                handler.sendEmptyMessage(0);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A05() {
        if (this.A07) {
            this.A03 = 0L;
            this.A00 = 0.0f;
            for (W33 w33 : this.A0F.values()) {
                AnimatorSet animatorSet = w33.A01;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                W33.A00(w33);
                w33.A00 = 0;
            }
            Choreographer.getInstance().removeFrameCallback(this.A06);
            this.A07 = false;
        }
    }

    public final boolean A06() {
        C141596ac c141596ac = this.A05;
        if (c141596ac != null) {
            if (c141596ac.A0V != C05F.A00) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean A07() {
        C141596ac c141596ac = this.A05;
        if (c141596ac != null) {
            if (c141596ac.A0V != C05F.A01) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean A08() {
        ReboundViewPager reboundViewPager = ((C147256kA) this.A0C).A04;
        View view = reboundViewPager.A0F;
        if (view == null || !(view.getTag() instanceof C140436Wx)) {
            return false;
        }
        C141596ac c141596ac = this.A05;
        if (c141596ac != null) {
            if (c141596ac.A0I != reboundViewPager.A08) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean BWM() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ int Bs6() {
        return 0;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Buz() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Cc5() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c6, code lost:
    
        if (X.C18U.A06(r3, r2, 36329668068000233L) != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    @Override // X.InterfaceC147946lQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean CoF(X.C41181vS r15, X.C41551w4 r16, X.C141596ac r17, float r18) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147966lS.CoF(X.1vS, X.1w4, X.6ac, float):boolean");
    }

    @Override // X.InterfaceC145136gY
    public final void DhB() {
        if (this.A07 && !A07() && !A01()) {
            C141596ac c141596ac = this.A05;
            if (c141596ac != null) {
                c141596ac.A05(C05F.A01);
                ChoreographerFrameCallbackC147976lT choreographerFrameCallbackC147976lT = this.A06;
                choreographerFrameCallbackC147976lT.A00.A02 = SystemClock.elapsedRealtime();
                Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC147976lT);
                this.A0B.EJE("end_scene");
                W33 A03 = A03();
                AnimatorSet animatorSet = A03.A01;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                A03.A08.bringToFront();
                View view = A03.A05;
                view.setVisibility(0);
                view.setAlpha(1.0f);
                A03.A07.setAlpha(1.0f);
                View view2 = A03.A06;
                view2.setAlpha(1.0f);
                view2.setTranslationY(0.0f);
                View view3 = A03.A04;
                view3.setAlpha(0.0f);
                view3.setTranslationY(A03.A02);
                view3.setVisibility(8);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean DrR() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Dra() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean DsD() {
        return false;
    }

    public final W33 A03() {
        C6UL c6ul = A02().A0T;
        Map map = this.A0F;
        Object obj = map.get(c6ul);
        if (obj == null) {
            obj = new W33(c6ul, this.A01);
            map.put(c6ul, obj);
        }
        return (W33) obj;
    }

    @Override // X.InterfaceC145136gY
    public final void onDestroyView() {
        A05();
    }
}
