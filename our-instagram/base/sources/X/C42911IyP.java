package X;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* renamed from: X.IyP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42911IyP implements JI5 {
    public boolean A00 = true;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ C148516mM A02;

    @Override // X.JI5
    public final void Cum(int i) {
        this.A00 = i != 1;
    }

    public C42911IyP(Fragment fragment, C148516mM c148516mM) {
        this.A02 = c148516mM;
        this.A01 = fragment;
    }

    @Override // X.JI5
    public final void Cuk() {
        if (this.A00) {
            this.A02.A02.EJJ();
        }
    }

    @Override // X.JI5
    public final void Df1() {
        this.A02.A02.EJJ();
    }

    @Override // X.JI5
    public final void Df2() {
        this.A02.A02.EJE("dialog");
    }

    @Override // X.JI5
    public final void Df9() {
        Context context = this.A01.getContext();
        context.getClass();
        C9GR.A0F(context, "product_rejected_dialog_remove_tag_failure_toast", 2131970001);
    }

    @Override // X.JI5
    public final void DfA(String str) {
        this.A02.A08.Df8(str);
    }
}
