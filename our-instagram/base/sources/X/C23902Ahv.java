package X;

import android.content.Context;
import android.text.Editable;
import android.text.TextPaint;
import com.instagram.ui.text.ConstrainedEditText;

/* renamed from: X.Ahv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23902Ahv implements InterfaceC190408by {
    public final /* synthetic */ C8LD A00;

    @Override // X.InterfaceC190408by
    public final boolean CRN() {
        return false;
    }

    @Override // X.InterfaceC190408by
    public final boolean CUe() {
        return false;
    }

    public C23902Ahv(C8LD c8ld) {
        this.A00 = c8ld;
    }

    @Override // X.InterfaceC190408by
    public final int C6N() {
        ConstrainedEditText constrainedEditText = this.A00.A0D;
        constrainedEditText.getClass();
        return constrainedEditText.length();
    }

    @Override // X.InterfaceC190408by
    public final boolean Cdo() {
        return C18U.A06(C06090Tz.A05, this.A00.A0U, 36323075294833592L);
    }

    @Override // X.InterfaceC190408by
    public final void Dsd(C190888ck c190888ck, Integer num) {
        C8LD c8ld = this.A00;
        AbstractC23021Ah.A00(c8ld.A0U).A0y(c190888ck.A09);
        AM2 am2 = c8ld.A0B;
        am2.getClass();
        am2.A04(null, c190888ck);
        C202968yE c202968yE = c8ld.A08;
        c202968yE.getClass();
        c202968yE.A00(c190888ck.A07);
        C6RB c6rb = c8ld.A0F;
        if (c6rb != null) {
            Context context = c8ld.A0P;
            boolean A1U = AbstractC167007dF.A1U(context);
            Editable A00 = AbstractC23116AHf.A00(c6rb.A0F);
            if (A00 != null) {
                TextPaint textPaint = c6rb.A0b;
                C14360o3.A07(textPaint);
                AbstractC202898y7.A01(A00, c190888ck, A1U);
                AbstractC202838y1.A02(context, A00, c190888ck);
                AbstractC202928yA.A01(context, textPaint, A00, c190888ck);
                AbstractC202948yC.A00(null, c190888ck, c6rb);
                AbstractC202958yD.A00(A00, c190888ck);
                c6rb.A0L(A00);
            }
            C6RB c6rb2 = c8ld.A0F;
            c6rb2.getClass();
            c6rb2.A0R();
            C8LD.A01(c8ld.A0F, c8ld);
        }
        C8LD.A07(c8ld);
        C8LD.A08(c8ld);
        C8LD.A0A(c8ld);
        C8LD.A0B(c8ld);
        C8LD.A0C(c8ld);
        C8LD.A0D(c8ld);
        C8LD.A0E(c8ld);
        C8LD.A0F(c8ld);
        C8LD.A0G(c8ld);
    }
}
