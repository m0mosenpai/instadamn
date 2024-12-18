package X;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import com.facebook.proxygen.LigerSamplePolicy;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.35j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C682135j extends AnonymousClass346 {
    public final C682235k A00;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.35k] */
    public C682135j(final Context context) {
        this.A00 = new InterfaceC43071ya(context) { // from class: X.35k
            public final int A00;
            public final java.util.Set A01 = new HashSet();

            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                Integer num;
                long j;
                Double d;
                String str;
                final C38321qM c38321qM = (C38321qM) c59062n7.A03;
                final C75113Zb c75113Zb = (C75113Zb) c59062n7.A04;
                if (!c38321qM.A4k()) {
                    String BHp = c38321qM.A0C.BHp();
                    if (BHp != null) {
                        Integer[] A00 = C05F.A00(2);
                        int length = A00.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                num = A00[i];
                                if (1 - num.intValue() != 0) {
                                    str = "never";
                                } else {
                                    str = "impression_trigger";
                                }
                                if (str.equals(BHp)) {
                                    break;
                                } else {
                                    i++;
                                }
                            } else {
                                num = C05F.A00;
                                break;
                            }
                        }
                    } else {
                        num = null;
                    }
                    if (num == C05F.A01 && !c75113Zb.A2C && !c75113Zb.A2B) {
                        if (interfaceC57162jr.CGk(c59062n7) >= 0.5f) {
                            Rect rect = new Rect();
                            interfaceC57162jr.BA8(rect, c59062n7);
                            int i2 = rect.bottom;
                            Rect rect2 = new Rect();
                            interfaceC57162jr.BA6(rect2, c59062n7);
                            if (i2 == rect2.bottom) {
                                final java.util.Set set = this.A01;
                                if (!set.contains(c38321qM.getId())) {
                                    set.add(c38321qM.getId());
                                    int i3 = this.A00;
                                    if (!c75113Zb.A3D) {
                                        C3QU c3qu = new C3QU() { // from class: X.4e8
                                            @Override // X.C3QU
                                            public final void DFe(float f) {
                                            }

                                            @Override // X.C3QU
                                            public final void DFc() {
                                                c75113Zb.A0q = null;
                                            }

                                            @Override // X.C3QU
                                            public final void DFd() {
                                                java.util.Set set2 = set;
                                                C38321qM c38321qM2 = c38321qM;
                                                if (set2.contains(c38321qM2.getId()) && !c38321qM2.A4k()) {
                                                    C75113Zb c75113Zb2 = c75113Zb;
                                                    if (!c75113Zb2.A2C && !c75113Zb2.A2B) {
                                                        c75113Zb2.A3D = true;
                                                        return;
                                                    }
                                                }
                                                C87353ut c87353ut = c75113Zb.A0q;
                                                if (c87353ut == null) {
                                                    return;
                                                }
                                                c87353ut.A00();
                                            }
                                        };
                                        C87353ut c87353ut = c75113Zb.A0q;
                                        if (c87353ut == null) {
                                            c87353ut = new C87353ut();
                                            c75113Zb.A0q = c87353ut;
                                        }
                                        c87353ut.A00 = c3qu;
                                        List list = c87353ut.A02.A04;
                                        list.clear();
                                        list.add(new WeakReference(c87353ut.A00));
                                        WeakReference weakReference = c87353ut.A01;
                                        if (weakReference != null) {
                                            list.add(weakReference);
                                        }
                                        if (c38321qM.A0C.BHq() != null && Double.valueOf(r0.floatValue()) != null) {
                                            if (c38321qM.A0C.BHq() != null) {
                                                d = Double.valueOf(r0.floatValue());
                                            } else {
                                                d = null;
                                            }
                                            j = (int) (d.doubleValue() * 1000.0d);
                                        } else {
                                            j = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
                                        }
                                        long j2 = i3;
                                        if (!c75113Zb.A3D) {
                                            C87353ut c87353ut2 = c75113Zb.A0q;
                                            if (c87353ut2 == null) {
                                                c75113Zb.A0q = new C87353ut();
                                            } else {
                                                c87353ut2.A00();
                                            }
                                            C87353ut c87353ut3 = c75113Zb.A0q;
                                            if (c87353ut3 != null) {
                                                c87353ut3.A01(j, j2);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                        this.A01.remove(c38321qM.getId());
                    }
                }
            }

            {
                this.A00 = context.getResources().getInteger(R.integer.config_shortAnimTime);
            }
        };
    }
}
