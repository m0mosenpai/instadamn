package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;
import com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.AvN, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24627AvN implements Runnable {
    public final /* synthetic */ MagicMediaRemixEditController A00;
    public final /* synthetic */ String A01;

    public RunnableC24627AvN(MagicMediaRemixEditController magicMediaRemixEditController, String str) {
        this.A00 = magicMediaRemixEditController;
        this.A01 = str;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.AdS, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        List A1J = AbstractC166987dD.A1J(EnumC222729sD.A03);
        MagicMediaRemixEditController magicMediaRemixEditController = this.A00;
        C43901JbB c43901JbB = magicMediaRemixEditController.A0E;
        C51755Mte c51755Mte = new C51755Mte(A1J, 27);
        C07Y.A00(magicMediaRemixEditController.A05);
        List<C9ZK> A00 = c43901JbB.A00(c51755Mte);
        String str = this.A01;
        for (C9ZK c9zk : A00) {
            if (C14360o3.A0K(c9zk.A02, str)) {
                List list = c9zk.A05;
                C81J c81j = magicMediaRemixEditController.A0B;
                int i = 0;
                for (Object obj : AbstractC001800i.A0d(list, c81j.A02)) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC16960so.A1U();
                        throw C00O.createAndThrow();
                    }
                    Medium medium = (Medium) obj;
                    Bitmap A002 = LKb.A00(medium, null);
                    KZD kzd = magicMediaRemixEditController.A0D;
                    String A0R = AnonymousClass001.A0R(medium.A0X, c81j.A2X);
                    C14360o3.A0B(A0R, 0);
                    String A1A = AbstractC166987dD.A1A(A0R, kzd.A05);
                    if (A1A != null) {
                        List list2 = magicMediaRemixEditController.A0F;
                        boolean A1P = AbstractC167007dF.A1P(i, magicMediaRemixEditController.A00);
                        ?? obj2 = new Object();
                        obj2.A00 = A002;
                        obj2.A02 = A1P;
                        obj2.A01 = A1A;
                        list2.add(obj2);
                    }
                    i = i2;
                }
                C11T.A02(new RunnableC24626AvM(magicMediaRemixEditController, magicMediaRemixEditController.A0F));
                return;
            }
        }
        throw new NoSuchElementException(MSV.A00(1));
    }
}
