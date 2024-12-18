package X;

import android.app.Fragment;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.2yS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC65902yS {
    public final Context A00;
    public final C07X A01;
    public final C223016j A02;
    public final UserSession A03;
    public final C65502xm A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC16660sJ A08;
    public final InterfaceC16660sJ A09;
    public final boolean A0A;
    public final boolean A0B;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.07W, X.3yR] */
    public /* synthetic */ AbstractC65902yS(Context context, C07X c07x, UserSession userSession, String str, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i) {
        str = (i & 8) != 0 ? "" : str;
        interfaceC16660sJ = (i & 32) != 0 ? null : interfaceC16660sJ;
        interfaceC16660sJ2 = (i & 64) != 0 ? null : interfaceC16660sJ2;
        C65502xm A00 = (i & 128) != 0 ? AbstractC65492xl.A00(userSession) : null;
        C14360o3.A0B(str, 4);
        C14360o3.A0B(A00, 8);
        this.A00 = context;
        this.A03 = userSession;
        this.A01 = c07x;
        this.A08 = interfaceC16660sJ;
        this.A09 = interfaceC16660sJ2;
        this.A04 = A00;
        this.A07 = AbstractC09440dt.A01(C65912yT.A00);
        this.A06 = AbstractC09440dt.A01(new C206839Do(this, 40));
        if (!(c07x instanceof Fragment) && !(c07x instanceof androidx.fragment.app.Fragment)) {
            StringBuilder sb = new StringBuilder();
            sb.append("LifecycleOwner is not a fragment: ");
            sb.append(c07x);
            C0K8.A0D("LithoBinder", sb.toString());
            C0f5 AEp = C18950wb.A00.AEp("LithoBinderLifecycleOwner", 817891147);
            AEp.ABW("lifecycle_owner", c07x.toString());
            AEp.report();
        }
        if (A00.A0B) {
            ?? r2 = new InterfaceC65626Tpm() { // from class: X.3yR
                @Override // X.InterfaceC65626Tpm
                public final /* synthetic */ void onCreate(C07X c07x2) {
                }

                @Override // X.InterfaceC65626Tpm
                public final void onDestroy(C07X c07x2) {
                    C14360o3.A0B(c07x2, 0);
                    AbstractC65902yS abstractC65902yS = AbstractC65902yS.this;
                    abstractC65902yS.A02.A05(-1);
                    abstractC65902yS.A01.getLifecycle().A0A(this);
                }

                @Override // X.InterfaceC65626Tpm
                public final /* synthetic */ void onPause(C07X c07x2) {
                }

                @Override // X.InterfaceC65626Tpm
                public final /* synthetic */ void onResume(C07X c07x2) {
                }

                @Override // X.InterfaceC65626Tpm
                public final /* synthetic */ void onStart(C07X c07x2) {
                }

                @Override // X.InterfaceC65626Tpm
                public final /* synthetic */ void onStop(C07X c07x2) {
                }
            };
            if (C14360o3.A0K(Looper.myLooper(), Looper.getMainLooper())) {
                c07x.getLifecycle().A09(r2);
            } else {
                new Handler(Looper.getMainLooper()).post(new RunnableC29591D1s(r2, this));
            }
        }
        this.A05 = AbstractC09440dt.A01(new C206839Do(this, 39));
        Object value = A00.A08.getValue();
        C14360o3.A07(value);
        this.A0B = ((Boolean) value).booleanValue();
        UserSession userSession2 = A00.A02;
        C06090Tz c06090Tz = C06090Tz.A05;
        final int A01 = ((int) C18U.A01(c06090Tz, userSession2, 36598679050128643L)) + ((int) C18U.A01(c06090Tz, userSession2, 36598679050194180L));
        Object value2 = A00.A07.getValue();
        C14360o3.A07(value2);
        this.A0A = ((Boolean) value2).booleanValue();
        A01 = A01 / 2 <= 0 ? 40 : A01;
        this.A02 = new C223016j(A01) { // from class: X.2yU
            /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
            @Override // X.C223016j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ void A07(boolean r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
                /*
                    r4 = this;
                    X.3aY r7 = (X.C75673aY) r7
                    r0 = 1
                    X.C14360o3.A0B(r6, r0)
                    r0 = 2
                    X.C14360o3.A0B(r7, r0)
                    X.2yS r3 = X.AbstractC65902yS.this
                    com.facebook.litho.ComponentTree r2 = r7.A01
                    r1 = 0
                    if (r2 == 0) goto L18
                    com.facebook.litho.LithoView r0 = r2.A07
                    if (r0 != 0) goto L1a
                    r2.A0K()
                L18:
                    r7.A01 = r1
                L1a:
                    X.0sJ r0 = r3.A09
                    if (r0 == 0) goto L21
                    r0.invoke(r6)
                L21:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C65922yU.A07(boolean, java.lang.Object, java.lang.Object, java.lang.Object):void");
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0032, code lost:
    
        if (r0 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(com.facebook.litho.LithoView r6, java.lang.String r7, X.InterfaceC16820sZ r8, X.InterfaceC16820sZ r9, X.InterfaceC16820sZ r10) {
        /*
            r5 = this;
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            r0 = 1
            X.C14360o3.A0B(r7, r0)
            r0 = 4
            X.C14360o3.A0B(r10, r0)
            X.16j r4 = r5.A02
            java.lang.Object r0 = r4.A02(r7)
            X.3aY r0 = (X.C75673aY) r0
            if (r0 != 0) goto L34
            com.instagram.common.session.UserSession r0 = r5.A03
            X.1ZW r3 = X.C1ZV.A00(r0)
            java.lang.Integer r2 = X.C05F.A0H
            r1 = 817890849(0x30c00621, float:1.3971581E-9)
            r0 = 0
            X.1ZX r0 = r3.A00(r2, r1, r0, r0)
            r0.A00()
            r5.A07(r7, r8, r9, r10)
            java.lang.Object r0 = r4.A02(r7)
            X.3aY r0 = (X.C75673aY) r0
            if (r0 == 0) goto L3a
        L34:
            com.facebook.litho.ComponentTree r1 = r0.A01
            r0 = 1
            r6.A0l(r1, r0)
        L3a:
            r5.A06(r6, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC65902yS.A05(com.facebook.litho.LithoView, java.lang.String, X.0sZ, X.0sZ, X.0sZ):void");
    }

    public void A06(LithoView lithoView, InterfaceC16820sZ interfaceC16820sZ) {
    }

    public final void A07(String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3) {
        boolean z;
        C07X c07x;
        C14360o3.A0B(str, 1);
        C14360o3.A0B(interfaceC16820sZ3, 4);
        int intValue = ((Number) interfaceC16820sZ.invoke()).intValue();
        C223016j c223016j = this.A02;
        synchronized (c223016j) {
            z = false;
            if (c223016j.A07.get(str) != null) {
                z = true;
            }
        }
        Context context = this.A00;
        C75673aY c75673aY = (C75673aY) c223016j.A02(str);
        if (c75673aY == null) {
            if (this.A0B) {
                c07x = this.A01;
            } else {
                c07x = null;
            }
            c75673aY = new C75673aY(context, c07x, (C2V3) this.A05.getValue(), this.A04.A01, this.A0A);
            c223016j.A06(str, c75673aY);
        }
        boolean z2 = false;
        if (intValue != c75673aY.A00) {
            z2 = true;
        }
        if (z && !z2) {
            c75673aY = null;
        }
        String A04 = A04();
        String A0T = AnonymousClass001.A0T(A04, str, '/');
        if (c75673aY != null) {
            if (Systrace.A0E(1L)) {
                C0fO.A01(AnonymousClass001.A0R("LithoBinder#prepareLithoComponent_", A04), -1519698413);
            }
            AbstractC50812Vc A02 = A02(interfaceC16820sZ2, interfaceC16820sZ3);
            int A01 = A01();
            int A00 = A00();
            if (Systrace.A0E(1L)) {
                C0fO.A01("LithoPreparable#prepare", -611427800);
            }
            c75673aY.A00 = intValue;
            ComponentTree componentTree = c75673aY.A01;
            if (componentTree != null) {
                componentTree.A0C = A0T;
                componentTree.A0O(A02, A01, A00);
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-1136518795);
                }
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-1990008049);
                    return;
                }
                return;
            }
            throw new IllegalStateException("The ComponentTree should not be null when we attempt to prepare ");
        }
    }

    public int A00() {
        return AbstractC75953b0.A00;
    }

    public int A01() {
        InterfaceC09390do interfaceC09390do;
        int A01;
        InterfaceC09390do interfaceC09390do2;
        if (this instanceof C75923ax) {
            interfaceC09390do = ((C75923ax) this).A04;
        } else {
            if (this instanceof C75553aM) {
                interfaceC09390do2 = ((C75553aM) this).A07;
            } else if (this instanceof C84903qe) {
                interfaceC09390do2 = ((C84903qe) this).A06;
            } else if (this instanceof C76083bD) {
                interfaceC09390do2 = ((C76083bD) this).A0B;
            } else if (this instanceof C84883qc) {
                interfaceC09390do = ((C84883qc) this).A05;
            } else {
                if (this instanceof C66712zo) {
                    A01 = AbstractC13890nF.A01(((C66712zo) this).A00);
                    int i = AbstractC75953b0.A00;
                    return View.MeasureSpec.makeMeasureSpec(A01, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                }
                if (this instanceof C105114oR) {
                    interfaceC09390do = ((C105114oR) this).A02;
                } else {
                    return AbstractC75953b0.A00;
                }
            }
            return ((Number) interfaceC09390do2.getValue()).intValue();
        }
        A01 = ((Number) interfaceC09390do.getValue()).intValue();
        int i2 = AbstractC75953b0.A00;
        return View.MeasureSpec.makeMeasureSpec(A01, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC50812Vc A02(final InterfaceC16820sZ interfaceC16820sZ, final InterfaceC16820sZ interfaceC16820sZ2) {
        if (this instanceof C75923ax) {
            C75923ax c75923ax = (C75923ax) this;
            C14360o3.A0B(interfaceC16820sZ, 0);
            return new C89353yb(c75923ax.A01, c75923ax.A02, c75923ax.A03, interfaceC16820sZ);
        }
        if (this instanceof C75553aM) {
            C75553aM c75553aM = (C75553aM) this;
            C14360o3.A0B(interfaceC16820sZ, 0);
            C14360o3.A0B(interfaceC16820sZ2, 1);
            FragmentActivity fragmentActivity = c75553aM.A00;
            UserSession userSession = c75553aM.A01;
            InterfaceC60442pS interfaceC60442pS = c75553aM.A03;
            InterfaceC75453aC interfaceC75453aC = c75553aM.A04;
            InterfaceC75543aL interfaceC75543aL = c75553aM.A05;
            InterfaceC75403a7 interfaceC75403a7 = c75553aM.A02;
            boolean z = c75553aM.A08;
            return new C75943az(fragmentActivity, C51722Yv.A02, userSession, interfaceC75403a7, interfaceC60442pS, interfaceC75453aC, interfaceC75543aL, c75553aM.A06, "", interfaceC16820sZ, interfaceC16820sZ2, z);
        }
        if (this instanceof C84903qe) {
            C84903qe c84903qe = (C84903qe) this;
            C14360o3.A0B(interfaceC16820sZ, 0);
            C14360o3.A0B(interfaceC16820sZ2, 1);
            final UserSession userSession2 = c84903qe.A01;
            final InterfaceC60442pS interfaceC60442pS2 = c84903qe.A03;
            final InterfaceC75453aC interfaceC75453aC2 = c84903qe.A04;
            final boolean z2 = c84903qe.A07;
            final String str = c84903qe.A05;
            final InterfaceC75403a7 interfaceC75403a72 = c84903qe.A02;
            return new AbstractC51572Yf(userSession2, interfaceC75403a72, interfaceC60442pS2, interfaceC75453aC2, str, interfaceC16820sZ, interfaceC16820sZ2, z2) { // from class: X.4Hr
                public final UserSession A00;
                public final InterfaceC75403a7 A01;
                public final InterfaceC60442pS A02;
                public final InterfaceC75453aC A03;
                public final String A04;
                public final String A05;
                public final InterfaceC16820sZ A06;
                public final InterfaceC16820sZ A07;
                public final boolean A08;

                @Override // X.AbstractC51572Yf
                public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
                    C14360o3.A0B(c76223bS, 0);
                    InterfaceC76863cY interfaceC76863cY = (InterfaceC76863cY) this.A07.invoke();
                    Object invoke = this.A06.invoke();
                    if ((interfaceC76863cY instanceof C76853cX) && ((C76853cX) interfaceC76863cY).A0M) {
                        C75933ay c75933ay = C51722Yv.A02;
                        Integer num = C05F.A00;
                        C51722Yv c51722Yv = new C51722Yv(null, new C9CT(num, 100.0f, 0));
                        long A0D = AbstractC77623dm.A0D(c76223bS, R.dimen.clips_netego_card_width);
                        Integer num2 = C05F.A01;
                        C51722Yv c51722Yv2 = new C51722Yv(c51722Yv, new C9CU(num2, 0, A0D));
                        C2Z0 c2z0 = new C2Z0(c76223bS.A05, new ArrayList());
                        C51722Yv c51722Yv3 = new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CT(num, 100.0f, 0)), new C9CT(num2, 100.0f, 0)), new C9CU(C05F.A0N, 1, 9221401712017801216L));
                        EnumC77933eL enumC77933eL = EnumC77933eL.ABSOLUTE;
                        Integer num3 = C05F.A0Y;
                        C51722Yv c51722Yv4 = new C51722Yv(c51722Yv3, new C9CV(num3, enumC77933eL, 3));
                        Drawable A0E = AbstractC77623dm.A0E(c2z0, R.drawable.bg_legibility_gradient_top);
                        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
                        C80403iV A03 = C80393iU.A03(c2z0.A00);
                        A03.A0D(A0E);
                        A03.A0E(scaleType);
                        A03.A0C();
                        AbstractC77743dy.A00(A03, c51722Yv4);
                        c2z0.A00(A03.A0A());
                        UserSession userSession3 = this.A00;
                        InterfaceC60442pS interfaceC60442pS3 = this.A02;
                        InterfaceC75453aC interfaceC75453aC3 = this.A03;
                        boolean z3 = this.A08;
                        c2z0.A00(new C76943cg(new C51722Yv(new C51722Yv(null, new C9CT(num, 100.0f, 0)), new C9CV(num3, enumC77933eL, 3)), userSession3, null, interfaceC60442pS3, interfaceC75453aC3, this.A04, this.A05, new C9EE(interfaceC76863cY, 44), new C9EE(invoke, 45), z3));
                        return AbstractC76963ci.A0J(c2z0, c76223bS, c51722Yv2, null, null, null, null, null, false);
                    }
                    UserSession userSession4 = this.A00;
                    InterfaceC60442pS interfaceC60442pS4 = this.A02;
                    InterfaceC75453aC interfaceC75453aC4 = this.A03;
                    boolean z4 = this.A08;
                    String str2 = this.A04;
                    String str3 = this.A05;
                    return new C76943cg(C51722Yv.A02, userSession4, this.A01, interfaceC60442pS4, interfaceC75453aC4, str2, str3, new C9EE(interfaceC76863cY, 46), new C9EE(invoke, 47), z4);
                }

                {
                    C14360o3.A0B(userSession2, 3);
                    C14360o3.A0B(interfaceC60442pS2, 4);
                    C14360o3.A0B(interfaceC75453aC2, 5);
                    this.A07 = interfaceC16820sZ;
                    this.A06 = interfaceC16820sZ2;
                    this.A00 = userSession2;
                    this.A02 = interfaceC60442pS2;
                    this.A03 = interfaceC75453aC2;
                    this.A08 = z2;
                    this.A01 = interfaceC75403a72;
                    this.A04 = str;
                    this.A05 = "";
                }
            };
        }
        if (this instanceof C76083bD) {
            C76083bD c76083bD = (C76083bD) this;
            C14360o3.A0B(interfaceC16820sZ, 0);
            C14360o3.A0B(interfaceC16820sZ2, 1);
            C25238BEw c25238BEw = new C25238BEw(c76083bD.A07);
            InterfaceC76043b9 interfaceC76043b9 = c76083bD.A06;
            InterfaceC60442pS interfaceC60442pS3 = c76083bD.A05;
            boolean z3 = c76083bD.A0C;
            UserSession userSession3 = c76083bD.A02;
            C39G c39g = c76083bD.A03;
            C39D c39d = c76083bD.A08;
            C30E c30e = c76083bD.A09;
            return new C76343be(new C9BW(c76083bD.A04, EnumC65592xv.A0n), null, c76083bD.A01, userSession3, c39g, interfaceC60442pS3, interfaceC76043b9, c25238BEw, c39d, c30e, c76083bD.A0A, interfaceC16820sZ, z3, false);
        }
        if (this instanceof C84883qc) {
            C84883qc c84883qc = (C84883qc) this;
            C14360o3.A0B(interfaceC16820sZ, 0);
            InterfaceC60442pS interfaceC60442pS4 = c84883qc.A04;
            return new C84913qf(null, c84883qc.A01, c84883qc.A02, c84883qc.A03, interfaceC60442pS4, interfaceC16820sZ, c84883qc.A06);
        }
        if (this instanceof C66712zo) {
            C66712zo c66712zo = (C66712zo) this;
            C14360o3.A0B(interfaceC16820sZ, 0);
            C62862tP c62862tP = c66712zo.A01;
            if (c62862tP == null) {
                return null;
            }
            C2XE c2xe = new C2XE(c66712zo.A00);
            C1338462s c1338462s = (C1338462s) interfaceC16820sZ.invoke();
            if (c1338462s == null) {
                return null;
            }
            C26281Bjo A03 = BUG.A03(c2xe);
            A03.A0B(c1338462s);
            A03.A0C(c62862tP);
            return A03.A0A();
        }
        if (this instanceof C105114oR) {
            C14360o3.A0B(interfaceC16820sZ, 0);
            C14360o3.A0B(interfaceC16820sZ2, 1);
            C9BW c9bw = (C9BW) interfaceC16820sZ.invoke();
            UserSession userSession4 = ((C105114oR) this).A01;
            int i = R.dimen.action_bar_item_spacing_right;
            EnumC77683ds enumC77683ds = null;
            long j = 0;
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            Object[] objArr4 = 0 == true ? 1 : 0;
            Object[] objArr5 = 0 == true ? 1 : 0;
            Object[] objArr6 = 0 == true ? 1 : 0;
            return new C89683z9(c9bw, enumC77683ds, userSession4, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, objArr, objArr2, objArr3, i, i, objArr4, 65148, j, j, objArr5, objArr6);
        }
        C14360o3.A0B(interfaceC16820sZ, 0);
        C14360o3.A0B(interfaceC16820sZ2, 1);
        return new C26393Blc(((C65892yR) this).A00, (CQZ) interfaceC16820sZ.invoke(), AbstractC60952qJ.A01("AIConsumptionFeedUnitNetegoLithoBinder", false, false), (C685736u) interfaceC16820sZ2.invoke());
    }

    public final LithoView A03() {
        Object c78933fz;
        LithoView lithoView = new LithoView(this.A00);
        InterfaceC16660sJ interfaceC16660sJ = this.A08;
        if (interfaceC16660sJ == null || (c78933fz = interfaceC16660sJ.invoke(lithoView)) == null) {
            c78933fz = new C78933fz(lithoView);
        }
        lithoView.setTag(c78933fz);
        lithoView.getRootView().setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return lithoView;
    }

    public String A04() {
        if (this instanceof C75923ax) {
            return "LITHO_COALESCED_FOOTER";
        }
        if (this instanceof C75553aM) {
            return "LITHO_COALESCED_HEADER";
        }
        if (this instanceof C84903qe) {
            return "LITHO_MEDIA_HEADER";
        }
        if (this instanceof C76083bD) {
            return "LITHO_MEDIA_CONTENT";
        }
        if (this instanceof C84883qc) {
            return "MEDIA_UFI";
        }
        if (this instanceof C105114oR) {
            return "LITHO_SOCIAL_CONTEXT_BUBBLES";
        }
        if (this instanceof C66712zo) {
            return "BloksLithoBinder";
        }
        return "MemuInFeedUnitNetegoLithoBinder";
    }
}
