package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;

/* renamed from: X.BvE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26973BvE extends AbstractC65806TuP {
    public final /* synthetic */ C6FG A00;
    public final /* synthetic */ C102884kP A01;

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        return new C126555nq(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26973BvE(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
        this.A01 = c102884kP;
        this.A00 = c6fg;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0L(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        Object A06 = AnonymousClass634.A06(this.A00, this.A01);
        A06.getClass();
        InterfaceC09390do interfaceC09390do = ((C28182CbU) A06).A04;
        ((CUA) interfaceC09390do.getValue()).A00();
        ((CUA) interfaceC09390do.getValue()).A01 = false;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        Object A06 = AnonymousClass634.A06(this.A00, this.A01);
        A06.getClass();
        ((C28182CbU) A06).A00 = null;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        AbstractC167017dG.A1O(view, c102884kP);
        Object A06 = AnonymousClass634.A06(this.A00, this.A01);
        A06.getClass();
        C28182CbU c28182CbU = (C28182CbU) A06;
        c28182CbU.A00 = view;
        CUA cua = (CUA) c28182CbU.A04.getValue();
        if (c102884kP.A0S(44, false)) {
            BZF bzf = cua.A02;
            if (bzf.isShowing()) {
                C79243gV A00 = ((C69600Vs3) cua.A04.getValue()).A00(view, c102884kP);
                if (A00 != null) {
                    View contentView = bzf.getContentView();
                    C14360o3.A0C(contentView, AbstractC111324zv.A00(480));
                    ((C131565ws) contentView).setRenderTree(A00);
                    SPC spc = cua.A00;
                    if (spc != null) {
                        RectF rectF = spc.A02;
                        bzf.update((int) rectF.left, (int) rectF.top, -1, -1);
                    }
                }
            } else {
                SPC spc2 = cua.A00;
                if (spc2 != null) {
                    RectF rectF2 = spc2.A02;
                    bzf.A01(view, (int) rectF2.left, (int) rectF2.top);
                }
            }
        } else if (cua.A02.isShowing()) {
            cua.A00();
        }
        cua.A01 = false;
        return null;
    }
}
