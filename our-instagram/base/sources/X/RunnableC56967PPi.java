package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.PPi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56967PPi implements Runnable {
    public final /* synthetic */ C8NS A00;
    public final /* synthetic */ C55070OaQ A01;

    public RunnableC56967PPi(C8NS c8ns, C55070OaQ c55070OaQ) {
        this.A01 = c55070OaQ;
        this.A00 = c8ns;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object A1D;
        String str;
        Bitmap decodeFile;
        C55070OaQ c55070OaQ = this.A01;
        C8NS c8ns = this.A00;
        C55097Ob8 c55097Ob8 = c55070OaQ.A04;
        Map map = C55097Ob8.A06;
        List A01 = c55097Ob8.A01("", false);
        ArrayList<C51673Ms4> A1E = AbstractC166987dD.A1E();
        for (Object obj : A01) {
            AbstractC43593JPy.A1R(((C51673Ms4) obj).A04, c55070OaQ.A08, obj, A1E);
        }
        for (C51673Ms4 c51673Ms4 : A1E) {
            try {
                str = c51673Ms4.A02;
                C14360o3.A0B(str, 0);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inMutable = true;
                decodeFile = BitmapFactory.decodeFile(str, options);
            } catch (Throwable th) {
                A1D = MSW.A1D(th);
            }
            if (decodeFile != null) {
                try {
                    long j = c51673Ms4.A00;
                    c8ns.AWx(new C26076Bg5(decodeFile, j));
                    C55070OaQ.A01(decodeFile, c55070OaQ, c51673Ms4.A04, null, j, true);
                    decodeFile.recycle();
                    c55097Ob8.A03(str);
                    c55070OaQ.A03.A00(c51673Ms4, C05F.A0Y, null, null, null, null);
                    A1D = C0eB.A00;
                    Throwable A00 = C09550e6.A00(A1D);
                    if (A00 != null) {
                        OLV olv = c55070OaQ.A03;
                        olv.A00(c51673Ms4, C05F.A0j, null, AnonymousClass001.A0R("Failed to apply effect to ", c51673Ms4.A02), A00, null);
                        olv.A00(c51673Ms4, C05F.A0N, null, null, A00, null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    decodeFile.recycle();
                    c55097Ob8.A03(str);
                }
            } else {
                th = AbstractC166987dD.A14("Failed to load bitmap from file");
            }
            throw th;
        }
    }
}
