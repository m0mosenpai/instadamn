package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.QAr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58808QAr extends AbstractC63678Srl {
    public float A00;
    public boolean A01;
    public AbstractC63308ShE A02;
    public final Paint A03;
    public final RectF A04;
    public final List A05;
    public final RectF A06;

    @Override // X.AbstractC63678Srl
    public final void A0A(float f) {
        this.A00 = f;
        super.A0A(f);
        AbstractC63308ShE abstractC63308ShE = this.A02;
        if (abstractC63308ShE != null) {
            SQ2 sq2 = this.A0J.A0F;
            float f2 = (sq2.A00 - sq2.A03) + 0.01f;
            SQ2 sq22 = this.A0L.A09;
            f = ((AbstractC63308ShE.A01(abstractC63308ShE) * sq22.A01) - sq22.A03) / f2;
        }
        if (this.A02 == null) {
            SOF sof = this.A0L;
            float f3 = sof.A02;
            SQ2 sq23 = sof.A09;
            f -= f3 / (sq23.A00 - sq23.A03);
        }
        SOF sof2 = this.A0L;
        float f4 = sof2.A03;
        if (f4 != 0.0f && !"__container".equals(sof2.A0J)) {
            f /= f4;
        }
        List list = this.A05;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((AbstractC63678Srl) list.get(size)).A0A(f);
            } else {
                return;
            }
        }
    }

    public C58808QAr(SQ2 sq2, Q2O q2o, SOF sof, List list) {
        super(q2o, sof);
        AbstractC63678Srl abstractC63678Srl;
        AbstractC63678Srl c58809QAs;
        String str;
        this.A05 = AbstractC166987dD.A1E();
        this.A06 = AbstractC166987dD.A0X();
        this.A04 = AbstractC166987dD.A0X();
        this.A03 = AbstractC166987dD.A0R();
        this.A01 = true;
        C58799QAg c58799QAg = sof.A0A;
        if (c58799QAg != null) {
            QAZ A00 = AbstractC63684Srr.A00(c58799QAg);
            this.A02 = A00;
            A0C(A00);
            this.A02.A09(this);
        } else {
            this.A02 = null;
        }
        C003501a c003501a = new C003501a(sq2.A08.size());
        int A03 = AbstractC31172DnG.A03(list, 1);
        AbstractC63678Srl abstractC63678Srl2 = null;
        while (true) {
            if (A03 >= 0) {
                SOF sof2 = (SOF) list.get(A03);
                int intValue = sof2.A0H.intValue();
                switch (intValue) {
                    case 0:
                        c58809QAs = new C58808QAr(sq2, q2o, sof2, AbstractC43592JPx.A12(sof2.A0K, sq2.A0C));
                        break;
                    case 1:
                        c58809QAs = new C58807QAq(q2o, sof2);
                        break;
                    case 2:
                        c58809QAs = new QAp(q2o, sof2);
                        break;
                    case 3:
                        c58809QAs = new AbstractC63678Srl(q2o, sof2);
                        break;
                    case 4:
                        c58809QAs = new QAo(sq2, q2o, this, sof2);
                        break;
                    case 5:
                        c58809QAs = new C58809QAs(q2o, sof2);
                        break;
                    default:
                        switch (intValue) {
                            case 1:
                                str = "SOLID";
                                break;
                            case 2:
                                str = "IMAGE";
                                break;
                            case 3:
                                str = "NULL";
                                break;
                            case 4:
                                str = "SHAPE";
                                break;
                            case 5:
                                str = "TEXT";
                                break;
                            case 6:
                                str = "UNKNOWN";
                                break;
                            default:
                                str = "PRE_COMP";
                                break;
                        }
                        SQZ.A00(AnonymousClass001.A0R("Unknown layer type ", str));
                        continue;
                }
                c003501a.A09(c58809QAs.A0L.A07, c58809QAs);
                if (abstractC63678Srl2 != null) {
                    abstractC63678Srl2.A04 = c58809QAs;
                    abstractC63678Srl2 = null;
                } else {
                    this.A05.add(0, c58809QAs);
                    int intValue2 = sof2.A0I.intValue();
                    if (intValue2 == 1 || intValue2 == 2) {
                        abstractC63678Srl2 = c58809QAs;
                    }
                }
                A03--;
            } else {
                for (int i = 0; i < c003501a.A00(); i++) {
                    AbstractC63678Srl abstractC63678Srl3 = (AbstractC63678Srl) c003501a.A05(c003501a.A02(i));
                    if (abstractC63678Srl3 != null && (abstractC63678Srl = (AbstractC63678Srl) c003501a.A05(abstractC63678Srl3.A0L.A08)) != null) {
                        abstractC63678Srl3.A05 = abstractC63678Srl;
                    }
                }
                return;
            }
        }
    }

    @Override // X.AbstractC63678Srl
    public final void A0E(boolean z) {
        super.A0E(z);
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            ((AbstractC63678Srl) it.next()).A0E(z);
        }
    }

    @Override // X.AbstractC63678Srl, X.InterfaceC65467Tkj
    public final void AAj(C62961SZe c62961SZe, Object obj) {
        super.AAj(c62961SZe, obj);
        if (obj == InterfaceC65609To0.A0S) {
            if (c62961SZe == null) {
                AbstractC63308ShE abstractC63308ShE = this.A02;
                if (abstractC63308ShE != null) {
                    abstractC63308ShE.A0A(null);
                    return;
                }
                return;
            }
            QAV A00 = QAV.A00(c62961SZe);
            this.A02 = A00;
            A00.A09(this);
            A0C(this.A02);
        }
    }

    @Override // X.AbstractC63678Srl, X.InterfaceC65628Tpp
    public final void Aho(Matrix matrix, RectF rectF, boolean z) {
        super.Aho(matrix, rectF, z);
        List list = this.A05;
        for (int size = list.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.A06;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((AbstractC63678Srl) list.get(size)).Aho(this.A0A, rectF2, true);
            rectF.union(rectF2);
        }
    }
}
