package X;

import android.os.Parcelable;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* loaded from: classes5.dex */
public final class DH3 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DH3(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static PendingRecipient A00(AbstractC26782Bs6 abstractC26782Bs6) {
        Parcelable.Creator creator = PendingRecipient.CREATOR;
        return new PendingRecipient(C17060sy.A01.A01(abstractC26782Bs6.A07()));
    }

    public static DH3 A01(C5Tl c5Tl, Object obj, int i) {
        DH3 dh3 = new DH3(obj, i);
        c5Tl.FBy(dh3);
        return dh3;
    }

    public static DH3 A02(C5Tl c5Tl, Object obj, int i) {
        DH3 dh3 = new DH3(obj, i);
        c5Tl.FBy(dh3);
        return dh3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0214, code lost:
    
        if (r1 == 0) goto L57;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0402  */
    /* JADX WARN: Type inference failed for: r4v16, types: [X.Bs6, X.C0L, androidx.fragment.app.Fragment] */
    @Override // X.InterfaceC16820sZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            Method dump skipped, instructions count: 1278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DH3.invoke():java.lang.Object");
    }
}
