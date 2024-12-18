package X;

import android.content.Context;
import android.widget.TextView;

/* renamed from: X.9od, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220539od extends AbstractC149696oM {
    public CharSequence A00;
    public final float A01;
    public final Context A02;

    @Override // X.C5ST
    public final /* bridge */ /* synthetic */ void ADz(C5SV c5sv, AbstractC117215Sg abstractC117215Sg) {
        C201248v6 c201248v6 = (C201248v6) abstractC117215Sg;
        AbstractC167007dF.A1K(c201248v6, c5sv);
        CharSequence charSequence = this.A00;
        if (charSequence != null && charSequence.length() != 0) {
            c201248v6.A00.setText(charSequence);
        }
        TextView textView = c201248v6.A00;
        Context context = textView.getContext();
        textView.setTextSize(0, context.getResources().getDimension(c5sv.A03));
        AbstractC166987dD.A1O(context, textView, c5sv.A02);
        textView.setMaxWidth((int) (AbstractC13880nE.A0A(this.A02) * this.A01));
    }

    public C220539od(Context context, CharSequence charSequence) {
        C14360o3.A0B(charSequence, 1);
        this.A00 = charSequence;
        this.A01 = 0.6f;
        this.A02 = context;
    }
}
