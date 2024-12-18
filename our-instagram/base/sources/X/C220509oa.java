package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/* renamed from: X.9oa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220509oa extends AbstractC149696oM {
    @Override // X.C5ST
    public final /* bridge */ /* synthetic */ void ADz(C5SV c5sv, AbstractC117215Sg abstractC117215Sg) {
        C201248v6 c201248v6 = (C201248v6) abstractC117215Sg;
        AbstractC167017dG.A1N(c201248v6, c5sv);
        TextView textView = c201248v6.A00;
        Context context = textView.getContext();
        String A0p = AbstractC166997dE.A0p(context, 2131969674);
        String A0f = AbstractC167007dF.A0f(context, A0p, 2131969673);
        C14360o3.A07(A0f);
        android.net.Uri A03 = AbstractC08820cl.A03("https://help.instagram.com/2937306082959298?helpref=uf_permalink");
        C14360o3.A07(A03);
        int color = context.getColor(c5sv.A02);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A0f);
        AnonymousClass773.A05(spannableStringBuilder, new C31748Dx1(A03, color), A0p);
        textView.setText(spannableStringBuilder);
        textView.setTextColor(color);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
