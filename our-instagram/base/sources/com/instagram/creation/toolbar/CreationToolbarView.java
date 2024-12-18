package com.instagram.creation.toolbar;

import X.AbstractC166987dD;
import X.AbstractC18560vj;
import X.AbstractC25229BEm;
import X.AbstractC31174DnI;
import X.AbstractC55832hO;
import X.C07X;
import X.C14360o3;
import X.C15340po;
import X.C31887Dzt;
import X.C31938E1s;
import X.C32675EZz;
import X.C3OO;
import X.C50930Mez;
import X.C51179MjN;
import X.MCE;
import X.MSW;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes9.dex */
public final class CreationToolbarView extends RecyclerView {
    public C50930Mez A00;
    public final C31887Dzt A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreationToolbarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        C31887Dzt c31887Dzt = new C31887Dzt();
        this.A01 = c31887Dzt;
        AbstractC31174DnI.A17(getContext(), this, false);
        setAdapter(c31887Dzt);
        A10(new C51179MjN(2));
    }

    public final ImageView getMusicPickerButton() {
        C3OO A0V = A0V(0);
        if (A0V instanceof C32675EZz) {
            return ((C31938E1s) A0V).A00;
        }
        return null;
    }

    public final void setViewModel(C50930Mez c50930Mez) {
        C14360o3.A0B(c50930Mez, 0);
        this.A00 = c50930Mez;
        C15340po A1I = MSW.A1I(new MCE(this, null, 15), c50930Mez.A06);
        C07X A00 = AbstractC55832hO.A00(this);
        if (A00 != null) {
            AbstractC18560vj.A03(AbstractC25229BEm.A0a(A00), A1I);
            return;
        }
        throw AbstractC166987dD.A14("No lifecycle owner found");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreationToolbarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        C31887Dzt c31887Dzt = new C31887Dzt();
        this.A01 = c31887Dzt;
        AbstractC31174DnI.A17(getContext(), this, false);
        setAdapter(c31887Dzt);
        A10(new C51179MjN(2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreationToolbarView(Context context) {
        super(context, null);
        C14360o3.A0B(context, 1);
        C31887Dzt c31887Dzt = new C31887Dzt();
        this.A01 = c31887Dzt;
        AbstractC31174DnI.A17(getContext(), this, false);
        setAdapter(c31887Dzt);
        A10(new C51179MjN(2));
    }
}
