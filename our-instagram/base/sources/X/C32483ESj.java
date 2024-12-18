package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ESj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32483ESj extends C1P1 {
    public final Context A00;
    public final C66362zD A01;
    public final List A02;
    public final UserSession A03;

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = C0f9.A03(-1748890632);
        int A032 = C0f9.A03(493176586);
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        ImmutableList copyOf = ImmutableList.copyOf((Collection) ((ECH) obj).A00);
        ArrayList A0q = AbstractC25230BEn.A0q(copyOf);
        Iterator<E> it = copyOf.iterator();
        while (it.hasNext()) {
            User user = ((C33596Et8) it.next()).A00;
            List A0g = AbstractC31175DnJ.A0g(user);
            A0q.add(new DirectShareTarget(new C122145g6(A0g), AbstractC101904i3.A07(user), A0g, true));
        }
        ImmutableList copyOf2 = ImmutableList.copyOf((Collection) A0q);
        List list = this.A02;
        AbstractC58576Pxu A00 = AbstractC58576Pxu.A00(copyOf2);
        C35880Fsu c35880Fsu = new C35880Fsu(list, 5);
        Object A05 = A00.A00.A05(A00);
        A05.getClass();
        ImmutableList A033 = AbstractC58576Pxu.A00(new C60756RQi(0, A05, c35880Fsu)).A03();
        if (A033.isEmpty()) {
            A0E.A00(new C32620EXu(this.A00.getString(2131968660)));
        } else {
            ArrayList A1E = AbstractC166987dD.A1E();
            ImmutableList.Builder builder = new ImmutableList.Builder();
            ImmutableList.Builder builder2 = new ImmutableList.Builder();
            C1LC it2 = A033.iterator();
            while (it2.hasNext()) {
                DirectShareTarget A0m = AbstractC31172DnG.A0m(it2);
                if (A0m.A0O()) {
                    builder.add((Object) A0m);
                } else if (A0m.A0L()) {
                    builder2.add((Object) A0m);
                }
            }
            ImmutableList build = builder.build();
            ImmutableList build2 = builder2.build();
            int i2 = 0;
            if (!build.isEmpty()) {
                A1E.addAll(C36215FyU.A00(build, 12, 0, -1, 0, false));
                i2 = build.size();
                i = 1;
            } else {
                i = 0;
            }
            if (!build2.isEmpty()) {
                A1E.add(new C36216FyV(null, C05F.A0F, C05F.A0N, null));
                A1E.addAll(C36215FyU.A00(build2, 13, i2, -1, i, false));
            }
            A0E.A01(A1E);
        }
        this.A01.A05(A0E);
        C0f9.A0A(1214559962, A032);
        C0f9.A0A(1083640477, A03);
    }

    public C32483ESj(Context context, C66362zD c66362zD, UserSession userSession, String str) {
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A02 = A1E;
        this.A01 = c66362zD;
        this.A00 = context;
        this.A03 = userSession;
        A1E.add(userSession.userId);
        if (str != null) {
            A1E.add(str);
        }
    }
}
