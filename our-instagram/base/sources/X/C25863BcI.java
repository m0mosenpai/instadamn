package X;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.BcI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25863BcI extends AbstractC52922bZ {
    public C66362zD A00;
    public String A01;
    public final C05A A02;
    public final C0UO A03;
    public final Map A04;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.3Fc, java.lang.Object] */
    public final void A01(Context context, RecyclerView recyclerView, Integer num, String str, List list) {
        AbstractC70663Fe linearLayoutManager;
        Object obj;
        AbstractC167007dF.A1F(recyclerView, 1, str);
        if (num == C05F.A00) {
            linearLayoutManager = new GridLayoutManager(context, list.size());
        } else {
            linearLayoutManager = new LinearLayoutManager(context, 0, false);
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        C66392zG A00 = C66362zD.A00(context);
        A00.A01(new C27067Bwq(num, new C30172DRc(40, context, list, this)));
        C66362zD A002 = A00.A00();
        this.A00 = A002;
        recyclerView.setAdapter(A002);
        C66362zD c66362zD = this.A00;
        if (c66362zD != null) {
            ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
            this.A01 = str;
            viewModelListUpdate.A01(A00(context, this, str, list));
            c66362zD.A05(viewModelListUpdate);
        }
        if (recyclerView.A12.size() == 0) {
            recyclerView.A10(new Object());
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((InterfaceC31110Dls) obj).BdD(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        recyclerView.A0n(list.indexOf(obj));
        this.A02.Egh(str);
    }

    public C25863BcI() {
        C008002u A1H = AbstractC25225BEi.A1H("");
        this.A02 = A1H;
        this.A03 = A1H;
        this.A01 = "";
        this.A04 = AbstractC06930Yk.A06(AbstractC167007dF.A0o("clips", 2131957173), AbstractC167007dF.A0o("audios", 2131957168), AbstractC167007dF.A0o("accounts", 2131957166), AbstractC167007dF.A0o("trending", 2131957184), AbstractC167007dF.A0o(AbstractC111324zv.A00(1173), 2131957172), AbstractC167007dF.A0o(AbstractC43591JPw.A00(97), 2131957185), AbstractC167007dF.A0o(AbstractC43591JPw.A00(441), 2131957171));
    }

    public static final List A00(Context context, C25863BcI c25863BcI, String str, List list) {
        String str2;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String BdD = ((InterfaceC31110Dls) it.next()).BdD();
            Number number = (Number) c25863BcI.A04.get(BdD);
            if (number != null) {
                str2 = context.getString(number.intValue());
            } else {
                str2 = null;
            }
            A0q.add(new C26171Bhw(BdD, str2, C14360o3.A0K(BdD, str)));
        }
        return A0q;
    }
}
