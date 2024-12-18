package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UGi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66414UGi extends C2UU {
    public String A00;
    public final V1i A01;
    public final List A02;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r1.length() == 0) goto L26;
     */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C3OO r12, int r13) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66414UGi.onBindViewHolder(X.3OO, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        View.OnClickListener wnu;
        UJ3 uj3;
        LayoutInflater A0E = AbstractC31177DnL.A0E(viewGroup, 0);
        if (i != 0) {
            if (i == 1) {
                UJY ujy = new UJY(A0E.inflate(R.layout.quick_promotion_item, viewGroup, false));
                view = ujy.A00;
                wnu = new WNP(57, ujy, this);
                uj3 = ujy;
            } else {
                throw new IllegalArgumentException(MSV.A00(18));
            }
        } else {
            UJ3 uj32 = new UJ3(A0E.inflate(R.layout.quick_promotion_raw_text_item, viewGroup, false));
            WNU.A00(uj32.A02, 58, uj32);
            view = uj32.A00;
            wnu = new WNU(uj32, 57);
            uj3 = uj32;
        }
        C0fQ.A00(wnu, view);
        return uj3;
    }

    public C66414UGi(V1i v1i, List list) {
        ArrayList arrayList = new ArrayList();
        this.A02 = arrayList;
        arrayList.addAll(list);
        this.A01 = v1i;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1510469678);
        int size = this.A02.size() + 1;
        C0f9.A0A(-137882247, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(1896721254);
        int i2 = 1;
        if (i == 0) {
            i2 = 0;
        }
        C0f9.A0A(1976336368, A03);
        return i2;
    }
}
