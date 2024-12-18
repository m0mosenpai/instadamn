package X;

import com.instagram.common.typedurl.ImageUrl;
import java.io.File;
import java.util.List;
import java.util.Map;

/* renamed from: X.9hB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215959hB extends C2AH {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C215959hB(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(exc, 0);
                ((C2AH) this.A01).onFail(exc);
                return;
            case 1:
                C0w9.A06("VideoThumbnailLoader", "Failed while trying to generate thumbnail", exc);
                return;
            default:
                C14360o3.A0B(exc, 0);
                C55209OeS.A05(exc);
                return;
        }
    }

    @Override // X.C2AH, X.C11R
    public final void onFinish() {
        switch (this.A00) {
            case 0:
                ((C2AH) this.A01).onFinish();
                return;
            case 1:
                ((C8SH) this.A01).A05.remove(this.A03);
                return;
            default:
                super.onFinish();
                return;
        }
    }

    @Override // X.C2AH, X.C11R
    public final void onStart() {
        if (this.A00 != 0) {
            super.onStart();
        } else {
            ((C2AH) this.A01).onStart();
        }
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.A00) {
            case 0:
                File A0Z = AbstractC166997dE.A0Z(obj);
                ((AC3) this.A02).A00.put(this.A03, A0Z.getCanonicalPath());
                ((C2AH) this.A01).onSuccess(A0Z);
                return;
            case 1:
                ImageUrl imageUrl = (ImageUrl) obj;
                if (AbstractC81033jX.A03(imageUrl)) {
                    return;
                }
                C8SH c8sh = (C8SH) this.A01;
                c8sh.A04.put(this.A03, imageUrl);
                Object obj2 = this.A02;
                C1OG A0J = C25821No.A00().A0J(imageUrl, null);
                A0J.A08 = obj2;
                A0J.A02(c8sh);
                A0J.A01();
                return;
            default:
                List list = (List) obj;
                C14360o3.A0B(list, 0);
                C55209OeS.A03((C55209OeS) this.A02, this.A03, list, (Map) this.A01);
                return;
        }
    }
}
