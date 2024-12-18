package X;

import android.content.Context;
import com.instagram.process.instagram.InstagramApplicationForMainProcess;

/* renamed from: X.0Cj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03080Cj extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;
    public final /* synthetic */ C211211o A01;
    public final /* synthetic */ InstagramApplicationForMainProcess A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03080Cj(C211211o c211211o, C211211o c211211o2, InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A02 = instagramApplicationForMainProcess;
        this.A01 = c211211o;
        this.A00 = c211211o2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final Context context = this.A02.appContext;
        final C211211o c211211o = this.A01;
        final C211211o c211211o2 = this.A00;
        return new AbstractC211911v(context, c211211o, c211211o2) { // from class: X.13S
            public final Context A00;
            public final C211211o A01;
            public final C211211o A02;

            {
                C14360o3.A0B(context, 1);
                this.A00 = context;
                this.A02 = c211211o;
                this.A01 = c211211o2;
            }

            @Override // X.AbstractC211911v
            public final String A06() {
                return "ReelRequestInitializer";
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x00d4 A[Catch: all -> 0x010a, TryCatch #3 {all -> 0x010a, blocks: (B:14:0x0069, B:16:0x0075, B:27:0x00ce, B:29:0x00d4, B:31:0x00dc, B:49:0x00fd, B:51:0x0103, B:52:0x0109, B:18:0x007d, B:20:0x008f, B:23:0x009a, B:26:0x00cb, B:43:0x00b5, B:45:0x00bb, B:46:0x00c1, B:37:0x00c2), top: B:13:0x0069, inners: #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00dc A[Catch: all -> 0x010a, TryCatch #3 {all -> 0x010a, blocks: (B:14:0x0069, B:16:0x0075, B:27:0x00ce, B:29:0x00d4, B:31:0x00dc, B:49:0x00fd, B:51:0x0103, B:52:0x0109, B:18:0x007d, B:20:0x008f, B:23:0x009a, B:26:0x00cb, B:43:0x00b5, B:45:0x00bb, B:46:0x00c1, B:37:0x00c2), top: B:13:0x0069, inners: #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:34:0x011b  */
            @Override // X.AbstractC211911v
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void A07() {
                /*
                    Method dump skipped, instructions count: 392
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C13S.A07():void");
            }
        };
    }
}
