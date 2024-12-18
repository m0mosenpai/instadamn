package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;

/* renamed from: X.GNj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36888GNj implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ SpannableStringBuilder A01;

    public RunnableC36888GNj(Context context, SpannableStringBuilder spannableStringBuilder) {
        this.A00 = context;
        this.A01 = spannableStringBuilder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C41451vu c41451vu = C41451vu.A01;
        Context context = this.A00;
        CharSequence charSequence = this.A01;
        C146106i8 A0K = AbstractC31171DnF.A0K();
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        C14360o3.A07(linkMovementMethod);
        A0K.A05 = linkMovementMethod;
        if (charSequence == null) {
            Resources resources = context.getResources();
            AbstractC31265Don.A00();
            charSequence = AbstractC166997dE.A0q(resources, 2131952591);
        }
        A0K.A0D = charSequence;
        A0K.A05();
        A0K.A0H = "ai_agent_picker_not_eligible_failure";
        AbstractC31178DnM.A1N(c41451vu, A0K);
    }
}
