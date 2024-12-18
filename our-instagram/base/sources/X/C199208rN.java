package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.List;

/* renamed from: X.8rN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199208rN extends C2UU {
    public final Context A00;
    public final C8QJ A01;
    public final List A02;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        Context context = this.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.context_menu_item_prism, viewGroup, false);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(inflate);
        return new C211009Ux(context, inflate, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C3OO r13, int r14) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199208rN.onBindViewHolder(X.3OO, int):void");
    }

    public C199208rN(Context context, C8QJ c8qj, List list, boolean z) {
        this.A02 = list;
        this.A01 = c8qj;
        this.A00 = z ? AbstractC53172bz.A01(context) : context;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-2040203222);
        int size = this.A02.size();
        C0f9.A0A(-605925519, A03);
        return size;
    }
}
