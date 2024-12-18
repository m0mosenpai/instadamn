package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.Shape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;

/* loaded from: classes8.dex */
public final class Jo0 extends C2UU {
    public int A00;
    public K2Y A02;
    public final LayoutInflater A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final InterfaceC164887Zb A08;
    public final AnonymousClass988 A09;
    public final C7DK A0A;
    public final boolean A0B;
    public int A01 = 0;
    public InterfaceC09390do A03 = AbstractC09440dt.A01(new M8Y(this, 3));
    public InterfaceC09390do A04 = AbstractC09440dt.A01(new M8Y(this, 4));

    public static void A00(View view, C7QL c7ql) {
        float f;
        float f2;
        Drawable A0a = AbstractC166987dD.A0a(c7ql.A05);
        if (A0a != null) {
            C7II c7ii = c7ql.A03.A03;
            Context context = view.getContext();
            C14360o3.A0B(context, 0);
            if (AbstractC13620mo.A02(context)) {
                f = c7ii.A02;
                f2 = c7ii.A01;
            } else {
                f = c7ii.A01;
                f2 = c7ii.A02;
            }
            C162247Oj A0G = AbstractC43593JPy.A0G(A0a);
            if (A0G != null) {
                float f3 = c7ii.A00;
                if (f3 == 0.0f) {
                    A0G.A01(c7ii.A04);
                } else {
                    int i = c7ii.A04;
                    if (i == 0) {
                        i = AbstractC167007dF.A09(context, R.attr.igds_color_primary_background);
                    }
                    A0G.A03(i, c7ii.A03, f3);
                }
                Shape shape = A0G.A03;
                if (shape instanceof AbstractC148416mB) {
                    C14360o3.A0C(shape, AbstractC111324zv.A00(1136));
                    C7II.A01((AbstractC148416mB) shape, C7R2.A05, c7ii, f, f2);
                }
            }
            view.setBackground(A0a);
        }
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        String str;
        float f;
        String str2;
        String str3;
        float f2;
        if (this.A02 != null) {
            C13080lu A00 = AbstractC13090lv.A00("GenericHscrollAdapter.onBindViewHolder");
            try {
                InterfaceC129555tK interfaceC129555tK = (InterfaceC129555tK) this.A02.A02.get(i);
                if ((c3oo instanceof C1579477e) && (interfaceC129555tK instanceof C7QY)) {
                    C1579477e c1579477e = (C1579477e) c3oo;
                    C7QY c7qy = (C7QY) interfaceC129555tK;
                    ((C1579277b) this.A03.getValue()).ADy(c1579477e, c7qy);
                    int i2 = c7qy.A00;
                    if (!c7qy.CVC()) {
                        A00(c1579477e.BKF(), c7qy.A0C);
                    }
                    if (this.A00 > 0) {
                        C57012jc c57012jc = c1579477e.A0B;
                        if (c57012jc.A01().getLayoutParams() != null) {
                            c57012jc.A01().getLayoutParams().height = this.A00;
                        }
                    }
                    if (c7qy.A0J == EnumC910243u.CIRCULAR) {
                        int i3 = this.A01;
                        if (i3 <= 0) {
                            f2 = -1.0f;
                        } else {
                            f2 = 0.640625f * i3;
                        }
                        int round = Math.round(f2);
                        if (round > 0) {
                            AbstractC13880nE.A0g(c1579477e.BKF(), round);
                        }
                    }
                    C0fQ.A00(new LPK(i2, 1, c1579477e, c7qy, this), c1579477e.BKF());
                } else if ((c3oo instanceof C158697Af) && (interfaceC129555tK instanceof C129535tI)) {
                    C158697Af c158697Af = (C158697Af) c3oo;
                    C129535tI c129535tI = (C129535tI) interfaceC129555tK;
                    ((C158677Ad) this.A04.getValue()).ADy(c129535tI, c158697Af);
                    if (!c129535tI.CVC()) {
                        A00(c158697Af.A03, c129535tI.A02);
                    }
                    C7QY c7qy2 = c129535tI.A03;
                    int i4 = c7qy2.A00;
                    if (this.A01 > 0) {
                        float f3 = 0.640625f;
                        IgProgressImageView igProgressImageView = c158697Af.A0V;
                        if ((igProgressImageView.getLayoutParams() instanceof C56302iJ) && (str2 = ((C56302iJ) igProgressImageView.getLayoutParams()).A0z) != null) {
                            String[] split = str2.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                            int length = split.length;
                            if (length >= 2) {
                                str3 = split[1];
                            } else {
                                if (length == 1) {
                                    str3 = split[0];
                                }
                                f3 = 0.640625f;
                            }
                            String[] split2 = str3.split(":");
                            if (split2 != null && split2.length == 2) {
                                try {
                                    f3 = Float.parseFloat(split2[0]) / Float.parseFloat(split2[1]);
                                } catch (NumberFormatException unused) {
                                }
                            }
                            f3 = 0.640625f;
                        }
                        int i5 = this.A01;
                        if (i5 <= 0) {
                            f = -1.0f;
                        } else {
                            f = f3 * i5;
                        }
                        int round2 = Math.round(f);
                        AbstractC13880nE.A0g(igProgressImageView, round2);
                        AbstractC13880nE.A0g(c158697Af.A0W, round2);
                    }
                    C0fQ.A00(new LPK(i4, 2, c129535tI, c158697Af, this), c158697Af.A03);
                    if (!C18U.A06(C06090Tz.A05, this.A07, 36327198462065048L) && (str = c7qy2.A0V) != null) {
                        C9C9 c9c9 = c7qy2.A08;
                        ((InterfaceC165107Zz) this.A08).CiL(c7qy2.A0M, c9c9.A00, str, c9c9.A01, i);
                    }
                }
                if (this.A01 > 0 && c3oo.itemView.getLayoutParams() != null) {
                    c3oo.itemView.getLayoutParams().height = this.A01;
                }
                C3OP c3op = (C3OP) c3oo.itemView.getLayoutParams();
                if (i == AbstractC25226BEj.A05(this.A02.A02)) {
                    ((ViewGroup.MarginLayoutParams) c3op).rightMargin = AbstractC53242c7.A0G(AbstractC31172DnG.A05(c3oo), R.attr.avatarStartSpacing) + AbstractC53242c7.A0G(AbstractC31172DnG.A05(c3oo), R.attr.containerMarginEnd);
                    c3oo.itemView.setLayoutParams(c3op);
                } else {
                    ((ViewGroup.MarginLayoutParams) c3op).rightMargin = 0;
                    c3oo.itemView.setLayoutParams(c3op);
                }
                A00.close();
            } catch (Throwable th) {
                try {
                    A00.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
        }
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C3OO ANU;
        C13080lu A00 = AbstractC13090lv.A00("GenericHscrollAdapter.onCreateViewHolder");
        try {
            if (i == 1) {
                ANU = ((C158677Ad) this.A04.getValue()).ANU(this.A05, viewGroup);
            } else {
                ANU = ((C1579277b) this.A03.getValue()).ANU(this.A05, viewGroup);
            }
            A00.close();
            return ANU;
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    public Jo0(LayoutInflater layoutInflater, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC164887Zb interfaceC164887Zb, AnonymousClass988 anonymousClass988, C7DK c7dk, boolean z) {
        this.A05 = layoutInflater;
        this.A0A = c7dk;
        this.A06 = interfaceC11380iw;
        this.A08 = interfaceC164887Zb;
        this.A09 = anonymousClass988;
        this.A07 = userSession;
        this.A0B = z;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int i;
        int A03 = C0f9.A03(-446183318);
        K2Y k2y = this.A02;
        if (k2y != null) {
            i = k2y.A02.size();
        } else {
            i = 0;
        }
        C0f9.A0A(85747363, A03);
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r2 == false) goto L6;
     */
    @Override // X.C2UU, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getItemViewType(int r5) {
        /*
            r4 = this;
            r0 = 2104464376(0x7d6f93f8, float:1.9903362E37)
            int r3 = X.C0f9.A03(r0)
            X.K2Y r0 = r4.A02
            if (r0 == 0) goto L19
            java.util.List r0 = r0.A02
            java.lang.Object r0 = r0.get(r5)
            boolean r2 = r0 instanceof X.C129535tI
            r1 = 1
            r0 = 1581351729(0x5e418331, float:3.4860107E18)
            if (r2 != 0) goto L1d
        L19:
            r1 = 0
            r0 = 1646106365(0x621d96fd, float:7.267547E20)
        L1d:
            X.C0f9.A0A(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Jo0.getItemViewType(int):int");
    }
}
