package X;

import android.graphics.Rect;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public abstract class Q9V extends AbstractC70653Fc {
    public static final InterfaceC16660sJ A01 = C65042TcX.A00;
    public InterfaceC16660sJ A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        AbstractC167027dH.A12(rect, view, recyclerView);
        C14360o3.A0B(c3f5, 3);
        AbstractC79383gk.A02(null);
        InterfaceC16660sJ interfaceC16660sJ = this.A00;
        if (interfaceC16660sJ == null) {
            interfaceC16660sJ = A01;
            String str = "Litho.DebugInfo";
            InterfaceC16820sZ interfaceC16820sZ = AbstractC58570Pxo.A05;
            EnumC50702Ur enumC50702Ur = EnumC50702Ur.A03;
            long currentTimeMillis = System.currentTimeMillis();
            if (enumC50702Ur.compareTo(AbstractC50692Uq.A00()) >= 0) {
                java.util.Set set = AbstractC50692Uq.A00;
                if (!set.isEmpty()) {
                    ?? r0 = 0;
                    for (Object obj : set) {
                        String[] strArr = ((AbstractC50682Uo) obj).A00;
                        if (AbstractC009903n.A0O("Litho.DebugInfo", strArr) || AbstractC009903n.A0O("*", strArr)) {
                            r0 = MSY.A0j(r0);
                            r0.add(obj);
                        }
                    }
                    if (r0 == 0) {
                        r0 = C16930sl.A00;
                    }
                    if (AbstractC166987dD.A1b(r0)) {
                        LinkedHashMap A1I = AbstractC166987dD.A1I();
                        A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "ItemDecorationWithNullMeasureFunction");
                        C58571Pxp c58571Pxp = new C58571Pxp(currentTimeMillis, str, (String) interfaceC16820sZ.invoke(), A1I);
                        Iterator it = r0.iterator();
                        while (it.hasNext()) {
                            ((AbstractC50682Uo) it.next()).A00(c58571Pxp);
                        }
                    }
                }
            }
        }
        C14360o3.A0B(interfaceC16660sJ, 4);
        int A02 = RecyclerView.A02(view);
        int measuredWidth = recyclerView.getMeasuredWidth();
        if (A02 == 0) {
            interfaceC16660sJ.invoke(view);
            rect.left = ((measuredWidth - view.getMeasuredWidth()) / 2) - recyclerView.getPaddingLeft();
        } else {
            if (A02 != c3f5.A00() - 1) {
                return;
            }
            interfaceC16660sJ.invoke(view);
            rect.right = ((measuredWidth - view.getMeasuredWidth()) / 2) - recyclerView.getPaddingRight();
        }
    }
}
