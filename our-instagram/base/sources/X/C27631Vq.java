package X;

import android.content.Context;
import android.view.View;
import com.facebook.gputimer.GPUTimerImpl;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Vq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27631Vq {
    public static C27631Vq A00;

    public final C200558ty A00(Context context, View view, final C178577wV c178577wV, UserSession userSession, boolean z, final boolean z2) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        return new C200558ty(context, view, new InterfaceC199598sB() { // from class: X.8sA
            @Override // X.InterfaceC199598sB
            public final InterfaceC199698sL ALY(final InterfaceC199678sJ interfaceC199678sJ, InterfaceC178897x1 interfaceC178897x1) {
                final C178577wV c178577wV2 = C178577wV.this;
                final boolean z3 = z2;
                return new InterfaceC199698sL(interfaceC199678sJ, c178577wV2, z3) { // from class: X.8sK
                    public static final String __redex_internal_original_name = "IntegratedOneCameraPostCaptureMediaPipelineController";
                    public final C178577wV A00;
                    public final InterfaceC199678sJ A01;
                    public final boolean A02;

                    @Override // X.InterfaceC199698sL
                    public final void A9o(InterfaceC185788Ly interfaceC185788Ly) {
                    }

                    @Override // X.InterfaceC199698sL
                    public final GPUTimerImpl B9L() {
                        return null;
                    }

                    @Override // X.InterfaceC199698sL
                    public final boolean CMF(String str, String str2) {
                        C14360o3.A0B(str, 0);
                        C14360o3.A0B(str2, 1);
                        InterfaceC179817yV A02 = this.A00.A02(InterfaceC179827yW.A00);
                        C14360o3.A07(A02);
                        return ((InterfaceC179827yW) A02).CMF(str, str2);
                    }

                    @Override // X.InterfaceC199698sL
                    public final void ETi(UserSession userSession2, List list) {
                        C14360o3.A0B(list, 0);
                        C178577wV c178577wV3 = this.A00;
                        if (c178577wV3.A08()) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((C200598u2) it.next()).A05);
                            }
                            InterfaceC179817yV A02 = c178577wV3.A02(InterfaceC179827yW.A00);
                            C14360o3.A07(A02);
                            InterfaceC179497xz interfaceC179497xz = ((C179797yT) ((InterfaceC179827yW) A02)).A00;
                            if (interfaceC179497xz != null) {
                                ((C179487xy) interfaceC179497xz).A03.A02(arrayList);
                            }
                            try {
                                InterfaceC199678sJ interfaceC199678sJ2 = this.A01;
                                boolean z4 = true;
                                if (interfaceC199678sJ2 == null || !interfaceC199678sJ2.EGy()) {
                                    z4 = false;
                                }
                                EOF(new C199708sM(z4));
                            } catch (RuntimeException e) {
                                AbstractC12120kG.A0I("IntegratedOneCameraPostCaptureMediaPipelineController EnableSingleFrameSourceEvent", e, AbstractC06930Yk.A0E());
                            }
                        }
                    }

                    @Override // X.InterfaceC199698sL
                    public final void destroy() {
                    }

                    @Override // X.InterfaceC199698sL
                    public final C1819085a ALa() {
                        C178577wV c178577wV3 = this.A00;
                        C1819085a ALa = ((InterfaceC178407wE) c178577wV3.A00.Aq1(InterfaceC178407wE.A00)).ALa();
                        C14360o3.A07(ALa);
                        return ALa;
                    }

                    @Override // X.InterfaceC199698sL
                    public final void EKd() {
                        if (this.A02) {
                            this.A00.A06();
                        }
                    }

                    @Override // X.InterfaceC199698sL
                    public final void EOF(InterfaceC179247xa interfaceC179247xa) {
                        InterfaceC179817yV A02 = this.A00.A02(InterfaceC179827yW.A00);
                        C14360o3.A07(A02);
                        InterfaceC179497xz interfaceC179497xz = ((C179797yT) ((InterfaceC179827yW) A02)).A00;
                        if (interfaceC179497xz != null) {
                            interfaceC179497xz.DfO(interfaceC179247xa);
                        }
                    }

                    @Override // X.InterfaceC199698sL
                    public final void EOG(InterfaceC179247xa interfaceC179247xa, InterfaceC179577y7 interfaceC179577y7) {
                        InterfaceC179817yV A02 = this.A00.A02(InterfaceC179827yW.A00);
                        C14360o3.A07(A02);
                        InterfaceC179497xz interfaceC179497xz = ((C179797yT) ((InterfaceC179827yW) A02)).A00;
                        if (interfaceC179497xz != null) {
                            C179487xy c179487xy = (C179487xy) interfaceC179497xz;
                            if (c179487xy.A02) {
                                C179107xM c179107xM = c179487xy.A03.A02;
                                if (c179107xM != null) {
                                    C179107xM.A05(c179107xM, interfaceC179247xa, interfaceC179577y7);
                                    return;
                                }
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    }

                    @Override // X.InterfaceC11380iw
                    public final String getModuleName() {
                        return "instagram_post_capture";
                    }

                    @Override // X.InterfaceC199698sL
                    public final boolean isConnected() {
                        return this.A00.A08();
                    }

                    @Override // X.InterfaceC199698sL
                    public final void pause() {
                        if (this.A02) {
                            this.A00.A05();
                        }
                    }

                    {
                        this.A00 = c178577wV2;
                        this.A01 = interfaceC199678sJ;
                        this.A02 = z3;
                    }
                };
            }
        }, userSession, z);
    }
}
