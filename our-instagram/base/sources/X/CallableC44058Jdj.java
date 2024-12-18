package X;

import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.Jdj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC44058Jdj implements Callable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Medium A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C8Y3 A03;
    public final /* synthetic */ List A04;

    public CallableC44058Jdj(Context context, Medium medium, UserSession userSession, C8Y3 c8y3, List list) {
        this.A04 = list;
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = c8y3;
        this.A01 = medium;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        List<Medium> A0X = AbstractC001800i.A0X(this.A04);
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        for (Medium medium : A0X) {
            if (medium.Cff()) {
                A1E2.add(medium);
            } else if (medium.A05()) {
                A1E.add(medium);
            }
        }
        boolean z = !A1E2.isEmpty();
        if (!A1E.isEmpty()) {
            Context context = this.A00;
            UserSession userSession = this.A02;
            C48616Les c48616Les = new C48616Les(context, userSession, this.A03, A1E2, z);
            C121275eQ c121275eQ = new C121275eQ(new B1P(2, A1E, userSession, context), 465);
            C43922JbX.A01(c121275eQ, c48616Les, 5);
            C1GJ.A02(c121275eQ);
            return null;
        }
        if (z) {
            Context context2 = this.A00;
            UserSession userSession2 = this.A02;
            C48617Let c48617Let = new C48617Let(this.A03, null);
            C121275eQ c121275eQ2 = new C121275eQ(new M85(context2, userSession2, A1E2, true), 468);
            c121275eQ2.A00 = new C45684KJv(c48617Let);
            C1GJ.A03(c121275eQ2);
            return null;
        }
        Medium medium2 = this.A01;
        if (medium2 != null) {
            BackgroundGradientColors backgroundGradientColors = medium2.A0H;
            if (backgroundGradientColors != null) {
                UserSession userSession3 = this.A02;
                Context context3 = this.A00;
                LBX.A01(context3, new C48618Leu(context3, medium2, userSession3, this.A03), C05F.A00, new int[]{backgroundGradientColors.A01, backgroundGradientColors.A00});
                return null;
            }
            throw AbstractC166997dE.A0g();
        }
        this.A03.A00(AbstractC166987dD.A14("No valid media or stickers"));
        return null;
    }
}
