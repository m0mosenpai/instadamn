package X;

import com.facebook.pando.PandoError;
import com.facebook.pando.Summary;
import java.lang.ref.WeakReference;

/* renamed from: X.IlC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42102IlC implements C48O {
    public final String A00;
    public final WeakReference A01;

    @Override // X.C48O
    public final void DEA(PandoError pandoError) {
    }

    @Override // X.C48O
    public final /* bridge */ /* synthetic */ void Dx2(Summary summary, Object obj) {
        AnonymousClass630 anonymousClass630 = (AnonymousClass630) this.A01.get();
        if (anonymousClass630 != null) {
            AnonymousClass630.A03(new J5F(anonymousClass630, obj, this.A00));
        }
    }

    public C42102IlC(AnonymousClass630 anonymousClass630, String str) {
        this.A01 = AbstractC25225BEi.A16(anonymousClass630);
        this.A00 = str;
    }
}
