package X;

import android.content.Context;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.Gtq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38354Gtq extends C2UU {
    public final C38946HCv A00;
    public final Context A01;
    public final List A02;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        Context context = this.A01;
        String text = ((C41009IEe) this.A02.get(i)).A01.getText();
        text.getClass();
        AbstractC34851FXj.A01(new GHY(context, new ViewOnClickListenerC41919IiC(this, i, 0), text), new C34957Fah(AbstractC167007dF.A1N(i), AbstractC167007dF.A1P(i, getItemCount() - 1), true), (E1C) c3oo);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return AbstractC34851FXj.A00(this.A01, viewGroup);
    }

    public C38354Gtq(Context context, C38946HCv c38946HCv, List list) {
        this.A01 = context;
        this.A02 = list;
        this.A00 = c38946HCv;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1699282687);
        int size = this.A02.size();
        C0f9.A0A(-432974295, A03);
        return size;
    }
}
