package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.facebook.forker.Process;
import com.instagram.ui.text.ConstrainedEditText;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.9jN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217289jN extends AbstractRunnableC14200nk {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C18160v1 A01;
    public final /* synthetic */ InterfaceC25189BCm A02;
    public final /* synthetic */ C8LD A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C217289jN(Bitmap bitmap, C18160v1 c18160v1, InterfaceC25189BCm interfaceC25189BCm, C8LD c8ld, boolean z) {
        super(86, 3, false, false);
        this.A03 = c8ld;
        this.A00 = bitmap;
        this.A04 = z;
        this.A01 = c18160v1;
        this.A02 = interfaceC25189BCm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8LD c8ld = this.A03;
        Context context = c8ld.A0P;
        File A04 = AbstractC13530mf.A04(context);
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(A04.getPath());
                try {
                    Bitmap bitmap = this.A00;
                    AbstractC50673MYr.A00(Bitmap.CompressFormat.JPEG, bitmap, fileOutputStream);
                    long currentTimeMillis = System.currentTimeMillis();
                    C88M c88m = c8ld.A0X.A0H;
                    c88m.A01();
                    final C183978Ee c183978Ee = new C183978Ee(A04, bitmap.getWidth(), bitmap.getHeight(), currentTimeMillis, currentTimeMillis, false);
                    c183978Ee.A16 = this.A04;
                    C88X A01 = c88m.A01();
                    if (A01 != null) {
                        C88Z c88z = A01.A04;
                        if (c88z == null) {
                            c88z = C88Z.A0G;
                        }
                        switch (c88z.ordinal()) {
                            case 1:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 9:
                            case Process.SIGSTOP /* 19 */:
                            case 20:
                                c183978Ee.A19 = false;
                                break;
                        }
                    }
                    c183978Ee.A0I = this.A01;
                    View view = c8ld.A0R;
                    final InterfaceC25189BCm interfaceC25189BCm = this.A02;
                    view.post(new Runnable() { // from class: X.Ay9
                        @Override // java.lang.Runnable
                        public final void run() {
                            AGv A0J;
                            C217289jN c217289jN = C217289jN.this;
                            InterfaceC25189BCm interfaceC25189BCm2 = interfaceC25189BCm;
                            C183978Ee c183978Ee2 = c183978Ee;
                            C8LD c8ld2 = c217289jN.A03;
                            AM2 am2 = c8ld2.A0B;
                            am2.getClass();
                            am2.A04 = true;
                            if (c8ld2.A0F != null) {
                                A0J = new AGv(c8ld2.A0P);
                                ConstrainedEditText constrainedEditText = c8ld2.A0D;
                                if (constrainedEditText != null) {
                                    A0J.A04 = constrainedEditText.getText();
                                    C6RB c6rb = c8ld2.A0F;
                                    A0J.A05 = c6rb.A0E;
                                    A0J.A00 = c6rb.A0b.getTextSize();
                                    A0J.A08 = c8ld2.A0c.A0M(c8ld2.A0F);
                                    C194918js c194918js = c8ld2.A0A;
                                    c194918js.getClass();
                                    A0J.A07 = c194918js.A07();
                                }
                                c8ld2.A0L(A0J);
                                C8LD.A02(A0J, c8ld2);
                            } else {
                                A0J = c8ld2.A0J(false, true);
                            }
                            interfaceC25189BCm2.Cz2(A0J, c183978Ee2);
                        }
                    });
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } finally {
                c8ld.A0M = false;
            }
        } catch (IOException unused) {
            C9GR.A0A(context, "save_background_photo_io_exception");
        }
    }
}
