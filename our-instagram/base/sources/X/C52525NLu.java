package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.NLu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52525NLu extends AbstractC85543rj {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Resources A01;
    public final /* synthetic */ TextView A02;
    public final /* synthetic */ InterfaceC58172Pqc A03;
    public final /* synthetic */ CharSequence A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52525NLu(Context context, Resources resources, TextView textView, InterfaceC58172Pqc interfaceC58172Pqc, CharSequence charSequence, String str, int i, boolean z) {
        super("", i, false);
        this.A02 = textView;
        this.A05 = str;
        this.A04 = charSequence;
        this.A01 = resources;
        this.A00 = context;
        this.A06 = z;
        this.A03 = interfaceC58172Pqc;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        TextView textView = this.A02;
        String str = this.A05;
        CharSequence charSequence = this.A04;
        Resources resources = this.A01;
        Context context = this.A00;
        boolean z = !this.A06;
        InterfaceC58172Pqc interfaceC58172Pqc = this.A03;
        SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
        CharSequence charSequence2 = str;
        if (z) {
            charSequence2 = charSequence;
        }
        A01.append(charSequence2);
        int length = A01.length();
        int i = 2131956445;
        if (z) {
            i = 2131954794;
        }
        A01.append((CharSequence) resources.getString(i));
        AbstractC37302Gc3.A0q(A01, new C52525NLu(context, resources, textView, interfaceC58172Pqc, charSequence, str, AbstractC31174DnI.A03(context), z), length);
        textView.setText(A01);
        AbstractC52865NaM abstractC52865NaM = ((AbstractC52821NZe) interfaceC58172Pqc).A03;
        PZE.A02(abstractC52865NaM, AbstractC141776au.A00(abstractC52865NaM), 41);
    }
}
