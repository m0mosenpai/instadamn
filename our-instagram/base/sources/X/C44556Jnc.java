package X;

import android.view.ViewGroup;
import com.facebook.R;
import java.util.List;

/* renamed from: X.Jnc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44556Jnc extends C2UU {
    public List A00 = AbstractC166987dD.A1E();
    public final C8NZ A01;

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C44660Jq5(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.pencilheart_sticker_card, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C3OO r17, int r18) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44556Jnc.onBindViewHolder(X.3OO, int):void");
    }

    public C44556Jnc(C8NZ c8nz) {
        this.A01 = c8nz;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-368610761);
        int size = this.A00.size();
        C0f9.A0A(1615604995, A03);
        return size;
    }
}
