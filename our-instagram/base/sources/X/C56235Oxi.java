package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import com.facebook.R;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftOverlayFilter;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.List;

/* renamed from: X.Oxi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56235Oxi implements InterfaceC58189Pqv, XEM {
    public Integer A00;
    public Integer A01;
    public final OD0 A02;
    public final List A03;
    public final UserSession A04;
    public final U7F A05;
    public final String A06;

    @Override // X.InterfaceC58189Pqv
    public final View Aa0(Context context) {
        C14360o3.A0B(context, 0);
        RadioGroup radioGroup = new RadioGroup(context);
        radioGroup.setBackgroundResource(AbstractC53242c7.A0D(context));
        radioGroup.setOrientation(0);
        radioGroup.setGravity(17);
        radioGroup.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        List list = this.A03;
        list.clear();
        for (Integer num : C05F.A00(3)) {
            C14360o3.A0B(num, 0);
            for (EnumC53266Nh4 enumC53266Nh4 : EnumC53266Nh4.values()) {
                if (enumC53266Nh4.A00 == AbstractC55027OXe.A00(num)) {
                    String A0q = AbstractC166997dE.A0q(context.getResources(), enumC53266Nh4.A01);
                    int A00 = AbstractC55027OXe.A00(num);
                    AbstractC56237Oxk abstractC56237Oxk = new AbstractC56237Oxk(null, A0q, A00, enumC53266Nh4.A02);
                    C44428Jkf c44428Jkf = new C44428Jkf(context);
                    c44428Jkf.setContentDescription(A0q);
                    c44428Jkf.setConfig(EnumC46217Kct.A08);
                    c44428Jkf.A03(abstractC56237Oxk, true);
                    c44428Jkf.setPadding(0, 0, 0, 0);
                    C0fQ.A00(ViewOnClickListenerC55465OkK.A00(c44428Jkf, this, 2), c44428Jkf);
                    list.add(c44428Jkf);
                    radioGroup.addView(c44428Jkf, layoutParams);
                    if (AbstractC55027OXe.A00(this.A01) == A00) {
                        c44428Jkf.setChecked(true);
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
        return radioGroup;
    }

    @Override // X.InterfaceC58189Pqv
    public final boolean COQ(C44428Jkf c44428Jkf, FilterGroupModel filterGroupModel) {
        Integer num;
        AbstractC167007dF.A1K(c44428Jkf, filterGroupModel);
        TiltShiftFilter A00 = OXu.A00(filterGroupModel);
        if (A00 != null) {
            num = A00.A05;
        } else {
            num = null;
        }
        c44428Jkf.setChecked(AbstractC25229BEm.A1a(num, C05F.A00));
        return false;
    }

    @Override // X.InterfaceC58189Pqv
    public final boolean DkF(View view, ViewGroup viewGroup, C8MA c8ma, FilterGroupModel filterGroupModel) {
        C14360o3.A0B(view, 0);
        AbstractC25233BEq.A0v(1, viewGroup, filterGroupModel, c8ma);
        OD0 od0 = this.A02;
        od0.A00 = view;
        od0.A04 = filterGroupModel;
        od0.A03 = c8ma;
        od0.A01 = viewGroup;
        OMN omn = new OMN(filterGroupModel);
        od0.A02 = omn;
        this.A05.A02 = this;
        TiltShiftFilter A00 = OXu.A00(filterGroupModel);
        if (A00 != null) {
            Integer num = A00.A05;
            this.A01 = num;
            if (num != C05F.A00) {
                omn.A02(c8ma);
            }
            return true;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.XEM
    public final void Du1(boolean z) {
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ void onResume() {
    }

    private final void A00(float f, float f2) {
        PointF pointF;
        PointF pointF2;
        OD0 od0 = this.A02;
        ViewGroup viewGroup = od0.A01;
        if (viewGroup != null) {
            float A07 = f / AbstractC166987dD.A07(viewGroup);
            ViewGroup viewGroup2 = od0.A01;
            if (viewGroup2 != null) {
                float f3 = f2 / (-AbstractC166987dD.A08(viewGroup2));
                FilterGroupModel filterGroupModel = od0.A04;
                if (filterGroupModel != null) {
                    TiltShiftFilter A00 = OXu.A00(filterGroupModel);
                    if (A00 != null) {
                        int intValue = A00.A05.intValue();
                        if (intValue != 1) {
                            if (intValue == 2) {
                                pointF2 = A00.A03;
                            }
                        } else {
                            pointF2 = A00.A04;
                        }
                        A00.A01(pointF2.x + A07, pointF2.y + f3);
                    }
                    FilterGroupModel filterGroupModel2 = od0.A04;
                    if (filterGroupModel2 != null) {
                        TiltShiftOverlayFilter A01 = OXu.A01(filterGroupModel2);
                        int intValue2 = A01.A06.intValue();
                        if (intValue2 != 1) {
                            if (intValue2 == 2) {
                                pointF = A01.A04;
                            } else {
                                return;
                            }
                        } else {
                            pointF = A01.A05;
                        }
                        A01.A00(pointF.x + A07, pointF.y + f3);
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
                throw AbstractC166997dE.A0g();
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC58189Pqv
    public final void Cvt(boolean z) {
        int i;
        Integer num = this.A00;
        if (z) {
            this.A01 = num;
        } else {
            Integer num2 = this.A01;
            if (num != num2) {
                this.A00 = num2;
                FilterGroupModel filterGroupModel = this.A02.A04;
                if (filterGroupModel != null) {
                    OXu.A02(filterGroupModel, num2);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        OD0 od0 = this.A02;
        View view = od0.A00;
        if (view != null) {
            if (view instanceof C44428Jkf) {
                C14360o3.A0C(view, AbstractC43591JPw.A00(182));
                ((C44428Jkf) view).setChecked(AbstractC25229BEm.A1a(this.A01, C05F.A00));
            } else if (view instanceof ImageView) {
                C14360o3.A0C(view, "null cannot be cast to non-null type android.widget.ImageView");
                ImageView imageView = (ImageView) view;
                Integer num3 = this.A01;
                AbstractC167017dG.A1N(imageView, num3);
                if (num3 == C05F.A00) {
                    i = R.drawable.edit_glyph_dof;
                } else {
                    Integer num4 = C05F.A0C;
                    i = R.drawable.edit_glyph_dof_radial;
                    if (num3 == num4) {
                        i = R.drawable.edit_glyph_dof_linear;
                    }
                }
                imageView.setImageResource(i);
            }
            this.A05.A02();
            od0.A00 = null;
            od0.A04 = null;
            od0.A03 = null;
            od0.A01 = null;
            od0.A02 = null;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.XEM
    public final void DJE(float f, float f2) {
        if (this.A00 != C05F.A00) {
            OD0 od0 = this.A02;
            OMN omn = od0.A02;
            if (omn != null) {
                C8MA c8ma = od0.A03;
                if (c8ma != null) {
                    omn.A03(c8ma);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.XEM
    public final void DJI() {
        if (this.A00 != C05F.A00) {
            OD0 od0 = this.A02;
            FilterGroupModel filterGroupModel = od0.A04;
            if (filterGroupModel != null) {
                AbstractC50523MSb.A1H(filterGroupModel);
                OMN omn = od0.A02;
                if (omn != null) {
                    C8MA c8ma = od0.A03;
                    if (c8ma != null) {
                        omn.A01(c8ma);
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
                throw AbstractC166997dE.A0g();
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.XEM
    public final void DU9(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.A00 != C05F.A00) {
            if (f3 != 0.0f || f4 != 0.0f) {
                A00(f3, f4);
            }
            if (f5 != 0.0f) {
                OD0 od0 = this.A02;
                FilterGroupModel filterGroupModel = od0.A04;
                if (filterGroupModel != null) {
                    TiltShiftFilter A00 = OXu.A00(filterGroupModel);
                    if (A00 != null) {
                        int intValue = A00.A05.intValue();
                        if (intValue != 1) {
                            if (intValue == 2) {
                                A00.A02 = C17s.A02(A00.A02 * f5, 0.1f, 1.0f);
                            }
                        } else {
                            A00.A00 = C17s.A02(A00.A00 * f5, 0.1f, 1.0f);
                        }
                    }
                    FilterGroupModel filterGroupModel2 = od0.A04;
                    if (filterGroupModel2 != null) {
                        TiltShiftOverlayFilter A01 = OXu.A01(filterGroupModel2);
                        int intValue2 = A01.A06.intValue();
                        if (intValue2 != 1) {
                            if (intValue2 == 2) {
                                A01.A03 = C17s.A02(f5 * A01.A03, 0.1f, 1.0f);
                            }
                        } else {
                            A01.A01 = C17s.A02(f5 * A01.A01, 0.1f, 1.0f);
                        }
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            if (f6 != 0.0f && this.A00 == C05F.A0C) {
                OD0 od02 = this.A02;
                FilterGroupModel filterGroupModel3 = od02.A04;
                if (filterGroupModel3 != null) {
                    TiltShiftFilter A002 = OXu.A00(filterGroupModel3);
                    if (A002 != null) {
                        A002.A01 += f6;
                    }
                    FilterGroupModel filterGroupModel4 = od02.A04;
                    if (filterGroupModel4 != null) {
                        OXu.A01(filterGroupModel4).A02 += f6;
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            C8MA c8ma = this.A02.A03;
            if (c8ma != null) {
                c8ma.EGV();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.XEM
    public final void Dma(float f, float f2) {
        if (this.A00 != C05F.A00) {
            OD0 od0 = this.A02;
            ViewGroup viewGroup = od0.A01;
            if (viewGroup != null) {
                float A07 = f / AbstractC166987dD.A07(viewGroup);
                ViewGroup viewGroup2 = od0.A01;
                if (viewGroup2 != null) {
                    float A08 = AbstractC166987dD.A08(viewGroup2) - f2;
                    ViewGroup viewGroup3 = od0.A01;
                    if (viewGroup3 != null) {
                        float A00 = MSX.A00(A08, viewGroup3);
                        FilterGroupModel filterGroupModel = od0.A04;
                        if (filterGroupModel != null) {
                            TiltShiftFilter A002 = OXu.A00(filterGroupModel);
                            if (A002 != null) {
                                A002.A01(A07, A00);
                            }
                            FilterGroupModel filterGroupModel2 = od0.A04;
                            if (filterGroupModel2 != null) {
                                OXu.A01(filterGroupModel2).A00(A07, A00);
                                OMN omn = od0.A02;
                                if (omn != null) {
                                    C8MA c8ma = od0.A03;
                                    if (c8ma != null) {
                                        omn.A02(c8ma);
                                        return;
                                    }
                                    throw AbstractC166997dE.A0g();
                                }
                                throw AbstractC166997dE.A0g();
                            }
                            throw AbstractC166997dE.A0g();
                        }
                        throw AbstractC166997dE.A0g();
                    }
                    throw AbstractC166997dE.A0g();
                }
                throw AbstractC166997dE.A0g();
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.XEM
    public final void Dmp(float f, float f2, float f3, float f4) {
        if (this.A00 != C05F.A00) {
            if (f3 != 0.0f || f4 != 0.0f) {
                A00(f3, f4);
            }
            C8MA c8ma = this.A02.A03;
            if (c8ma != null) {
                c8ma.EGV();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC58189Pqv
    public final String getTitle() {
        return this.A06;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.OD0] */
    public C56235Oxi(Resources resources, UserSession userSession) {
        this.A04 = userSession;
        Integer num = C05F.A00;
        this.A01 = num;
        this.A00 = num;
        this.A02 = new Object();
        this.A03 = AbstractC166987dD.A1E();
        this.A06 = resources.getString(2131975588);
        this.A05 = new U7F();
    }

    @Override // X.InterfaceC58189Pqv
    public final boolean CJr(View view, MotionEvent motionEvent) {
        AbstractC167017dG.A1N(view, motionEvent);
        return this.A05.onTouch(view, motionEvent);
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ boolean COP(C44428Jkf c44428Jkf, PhotoFilter photoFilter) {
        return false;
    }
}
