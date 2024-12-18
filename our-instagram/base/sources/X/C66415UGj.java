package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.UGj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66415UGj extends C2UU {
    public final C214709f8 A00;
    public final UserSession A01;
    public final List A02;

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        Context context = viewGroup.getContext();
        return new C66488UJq(context, LayoutInflater.from(context).inflate(i, viewGroup, false), this.A01);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00f6  */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C3OO r27, int r28) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66415UGj.onBindViewHolder(X.3OO, int):void");
    }

    public C66415UGj(UserSession userSession, C214709f8 c214709f8, List list) {
        AbstractC167017dG.A1P(userSession, list);
        this.A01 = userSession;
        this.A02 = list;
        this.A00 = c214709f8;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1529711364);
        int size = this.A02.size();
        C0f9.A0A(153468416, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        C0f9.A0A(604943483, C0f9.A03(-1546420355));
        return R.layout.mention_card;
    }
}
