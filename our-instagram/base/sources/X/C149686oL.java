package X;

import android.content.Context;
import android.widget.TextView;

/* renamed from: X.6oL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149686oL extends AbstractC149696oM {
    public int A00;
    public CharSequence A01;

    public C149686oL(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 1);
        this.A01 = charSequence;
    }

    @Override // X.C5ST
    public final /* bridge */ /* synthetic */ void ADz(C5SV c5sv, AbstractC117215Sg abstractC117215Sg) {
        TextView textView;
        C201248v6 c201248v6 = (C201248v6) abstractC117215Sg;
        C14360o3.A0B(c201248v6, 0);
        C14360o3.A0B(c5sv, 1);
        CharSequence charSequence = this.A01;
        if (charSequence != null && charSequence.length() != 0) {
            textView = c201248v6.A00;
            textView.setText(charSequence);
        } else {
            textView = c201248v6.A00;
            textView.setText(this.A00);
        }
        Context context = textView.getContext();
        textView.setTextSize(0, context.getResources().getDimension(c5sv.A03));
        textView.setTextColor(context.getColor(c5sv.A02));
    }

    public C149686oL(int i) {
        this.A00 = i;
    }
}
