package X;

import android.content.Context;
import com.facebook.R;

/* renamed from: X.TJm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64550TJm implements Runnable {
    public final /* synthetic */ C58883QEt A00;

    public RunnableC64550TJm(C58883QEt c58883QEt) {
        this.A00 = c58883QEt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        C58883QEt c58883QEt = this.A00;
        C3O0 A01 = C58883QEt.A01(c58883QEt);
        if (A01 != null && (context = ((AbstractC63223SfY) c58883QEt).A00) != null) {
            if (c58883QEt.A0D == null) {
                C146106i8 c146106i8 = new C146106i8();
                c146106i8.A04();
                c146106i8.A0D = context.getString(2131953440);
                c146106i8.A06();
                c146106i8.A02();
                c146106i8.A0D(context.getString(2131953429));
                c146106i8.A0A(new C29314Cw9(c58883QEt, 0));
                c146106i8.A01();
                c146106i8.A04 = context.getDrawable(R.drawable.ig_logo);
                c58883QEt.A0D = c146106i8.A00();
            }
            A01.A06(80);
            A01.A0A(c58883QEt.A0D);
        }
    }
}
