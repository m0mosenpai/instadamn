package X;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.model.mediasize.SpritesheetInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UBo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66352UBo extends FrameLayout {
    public int A00;
    public int A01;
    public UAL A02;
    public SpritesheetInfo A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public C70191WFu A07;
    public float[] A08;
    public final FrameLayout A09;
    public final List A0A;
    public final List A0B;
    public final List A0C;
    public final List A0D;
    public final List A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66352UBo(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        View requireViewById = LayoutInflater.from(context).inflate(R.layout.insights_line_chart_layout, this).requireViewById(R.id.insights_line_chart_container);
        C14360o3.A0C(requireViewById, AbstractC111324zv.A00(1));
        this.A09 = (FrameLayout) requireViewById;
        this.A0H = AbstractC167017dG.A09(context);
        this.A0G = context.getResources().getDimensionPixelSize(R.dimen.add_account_icon_circle_radius);
        this.A0F = AbstractC167017dG.A03(context);
        this.A0C = new ArrayList();
        this.A0E = new ArrayList();
        this.A0B = new ArrayList();
        this.A0D = new ArrayList();
        this.A0A = new ArrayList();
    }

    public static final int A00(C66352UBo c66352UBo, float f, boolean z) {
        float[] fArr;
        int i = 0;
        if (z) {
            fArr = ((UAa) c66352UBo.A0B.get(0)).getXPositions();
        } else {
            fArr = c66352UBo.A08;
        }
        if (fArr != null) {
            float f2 = f - (c66352UBo.A0H + c66352UBo.A0F);
            if (f2 > fArr[0]) {
                int length = fArr.length;
                i = length - 1;
                if (f2 < fArr[i]) {
                    for (int i2 = 1; i2 < length; i2++) {
                        float f3 = fArr[i2];
                        if (f2 < f3) {
                            int i3 = i2 - 1;
                            if (Math.abs(f2 - fArr[i3]) < Math.abs(f2 - f3)) {
                                return i3;
                            }
                            return i2;
                        }
                    }
                    return -1;
                }
            }
            return i;
        }
        return -1;
    }

    public static final C69214Vjh A01(C66352UBo c66352UBo, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        List<C69474Vnx> list = c66352UBo.A0C;
        if (!list.isEmpty()) {
            for (C69474Vnx c69474Vnx : list) {
                arrayList.add(new C68944Vei(c69474Vnx.A0D[i], c69474Vnx.A06));
            }
        }
        List<C69474Vnx> list2 = c66352UBo.A0E;
        if (!list2.isEmpty()) {
            for (C69474Vnx c69474Vnx2 : list2) {
                arrayList.add(new C68944Vei(c69474Vnx2.A0D[i], c69474Vnx2.A06));
            }
        }
        if (z) {
            ((UAa) c66352UBo.A0B.get(0)).getXPositions();
        }
        return new C69214Vjh(arrayList, c66352UBo.A01, c66352UBo.A00, i);
    }

    public static final void A04(UAa uAa, C66352UBo c66352UBo) {
        FrameLayout frameLayout = c66352UBo.A09;
        int i = c66352UBo.A0H;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMarginStart(i);
        frameLayout.addView(uAa, layoutParams);
    }

    public final void A05() {
        this.A09.removeAllViews();
        if (this.A02 != null) {
            this.A02 = null;
        }
        C70191WFu c70191WFu = this.A07;
        if (c70191WFu != null) {
            c70191WFu.A07.dismiss();
            this.A07 = null;
        }
        setOnTouchListener(null);
        this.A0B.clear();
        this.A0D.clear();
        this.A0C.clear();
        this.A0E.clear();
        this.A0A.clear();
    }

    public final void A06() {
        UAL ual = this.A02;
        if (ual != null) {
            this.A09.removeView(ual);
            this.A02 = null;
        }
        List list = this.A0D;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.A09.removeView((View) it.next());
            }
            list.clear();
        }
        C70191WFu c70191WFu = this.A07;
        if (c70191WFu != null) {
            c70191WFu.A07.dismiss();
            this.A07 = null;
        }
    }

    public final void A07(int i) {
        C70191WFu c70191WFu = this.A07;
        if (c70191WFu == null) {
            Context A0L = AbstractC166997dE.A0L(this);
            int length = ((UAa) this.A0B.get(0)).getXPositions().length;
            List list = this.A0C;
            float f = ((C69474Vnx) list.get(0)).A02;
            float f2 = ((C69474Vnx) list.get(0)).A01;
            float[] fArr = ((C69474Vnx) list.get(0)).A0C;
            if (fArr != null) {
                float[] fArr2 = ((C69474Vnx) list.get(0)).A0D;
                List list2 = this.A0A;
                this.A07 = new C70191WFu(A0L, new C69431VnG(this.A03, list2, fArr, fArr2, ((C69474Vnx) list.get(0)).A0E, f, f2, length, this.A04, this.A06), this, i);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        c70191WFu.A05(i);
    }

    public final void A08(C69214Vjh c69214Vjh) {
        UAL ual = this.A02;
        if (ual != null) {
            this.A09.removeView(ual);
            this.A02 = null;
        }
        UAL ual2 = new UAL(AbstractC166997dE.A0L(this));
        this.A02 = ual2;
        ual2.A03 = c69214Vjh;
        ual2.A04 = new float[AbstractC31173DnH.A0L(c69214Vjh.A03).size()];
        List list = this.A0C;
        if (list != null && !list.isEmpty()) {
            float f = ((C69474Vnx) list.get(0)).A02;
            float f2 = ((C69474Vnx) list.get(0)).A01;
            float[] fArr = ((C69474Vnx) list.get(0)).A0C;
            UAL ual3 = this.A02;
            if (ual3 != null) {
                Float valueOf = Float.valueOf(f);
                Float valueOf2 = Float.valueOf(f2);
                if (valueOf != null && valueOf2 != null && fArr != null) {
                    ual3.A01 = f;
                    ual3.A00 = f2;
                    ual3.A05 = fArr;
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        FrameLayout frameLayout = this.A09;
        UAL ual4 = this.A02;
        int i = this.A0G;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMarginStart(i);
        frameLayout.addView(ual4, layoutParams);
    }

    public static final UAa A02(C69474Vnx c69474Vnx, C69474Vnx c69474Vnx2, C69474Vnx c69474Vnx3, C66352UBo c66352UBo) {
        C69474Vnx c69474Vnx4;
        UAa uAa = new UAa(AbstractC166997dE.A0L(c66352UBo));
        C14360o3.A0B(c69474Vnx, 0);
        uAa.A05 = c69474Vnx;
        uAa.A06 = c69474Vnx2;
        uAa.A07 = c69474Vnx3;
        Paint paint = uAa.A0P;
        Context A0L = AbstractC166997dE.A0L(uAa);
        float f = c69474Vnx.A00;
        paint.setStrokeWidth(AbstractC13880nE.A00(A0L, f));
        int i = c69474Vnx.A06;
        paint.setColor(i);
        Paint paint2 = uAa.A0N;
        paint2.setStrokeWidth(AbstractC13880nE.A00(A0L, f));
        int i2 = c69474Vnx.A08;
        if (i2 == -1) {
            i2 = i;
        }
        paint2.setColor(i2);
        uAa.A0I = c69474Vnx.A0C;
        float[] fArr = c69474Vnx.A0D;
        uAa.A0K = fArr;
        int length = fArr.length;
        uAa.A03 = length;
        uAa.A0H = new float[length];
        uAa.A0J = new float[length];
        C69474Vnx c69474Vnx5 = uAa.A06;
        if (c69474Vnx5 != null && (c69474Vnx4 = uAa.A07) != null) {
            uAa.A0A = c69474Vnx5.A0C;
            float[] fArr2 = c69474Vnx5.A0D;
            uAa.A0C = fArr2;
            int length2 = fArr2.length;
            uAa.A02 = length2;
            uAa.A09 = new float[length2];
            uAa.A0B = new float[length2];
            uAa.A0E = c69474Vnx4.A0C;
            float[] fArr3 = c69474Vnx4.A0D;
            uAa.A0G = fArr3;
            int length3 = fArr3.length;
            uAa.A04 = length3;
            uAa.A0D = new float[length3];
            uAa.A0F = new float[length3];
        }
        if (c69474Vnx.A09) {
            float A00 = AbstractC13880nE.A00(A0L, 8.0f);
            paint.setPathEffect(new DashPathEffect(new float[]{A00, A00}, 0.0f));
        }
        if (c69474Vnx.A0A) {
            paint.setStrokeCap(Paint.Cap.ROUND);
        }
        if (c69474Vnx.A0B) {
            uAa.A08 = true;
            uAa.A0O.setColor(c69474Vnx.A05);
            uAa.A0M.setColor(c69474Vnx.A07);
        }
        return uAa;
    }

    public static final void A03(C68943Veh c68943Veh, C66352UBo c66352UBo) {
        UAO uao = new UAO(AbstractC166997dE.A0L(c66352UBo), c66352UBo.A04);
        uao.setRulersAndMarks(c68943Veh);
        c66352UBo.A08 = uao.getXMarksPositions();
        FrameLayout frameLayout = c66352UBo.A09;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMarginStart(0);
        frameLayout.addView(uao, layoutParams);
    }

    public final void setIsDistributionChart(boolean z) {
        this.A04 = z;
    }

    public final void setIsRetentionChart(boolean z) {
        this.A05 = z;
    }

    public final void setIsTappableChart(boolean z) {
        this.A06 = z;
    }

    public final void setSpriteSheetInfo(SpritesheetInfo spritesheetInfo) {
        this.A03 = spritesheetInfo;
    }
}
