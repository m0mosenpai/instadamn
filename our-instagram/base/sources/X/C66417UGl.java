package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.save.model.SavedCollection;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UGl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66417UGl extends C2UU {
    public List A00;
    public boolean A01;
    public boolean A02;
    public final Context A03;
    public final InterfaceC11380iw A04;
    public final XB1 A05;
    public final List A06 = new ArrayList();

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        String A00 = AbstractC111324zv.A00(4);
        LayoutInflater from = LayoutInflater.from(this.A03);
        if (i == 1) {
            View inflate = from.inflate(R.layout.save_to_collections_empty_wishlist_collection_tile, viewGroup, false);
            C14360o3.A0C(inflate, A00);
            return new C68082V9n(inflate);
        }
        View inflate2 = from.inflate(R.layout.save_to_collections_saved_collection, viewGroup, false);
        C14360o3.A0C(inflate2, A00);
        return new C68081V9m(inflate2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        if (X.C14360o3.A0K(r3.A0F, X.EnumC33416Epn.A07.A01) != false) goto L19;
     */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C3OO r10, int r11) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66417UGl.onBindViewHolder(X.3OO, int):void");
    }

    public C66417UGl(Context context, InterfaceC11380iw interfaceC11380iw, XB1 xb1, Boolean bool, boolean z) {
        this.A03 = context;
        this.A04 = interfaceC11380iw;
        this.A05 = xb1;
        this.A02 = z;
        if (bool != null) {
            this.A01 = bool.booleanValue();
        }
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-637598490);
        int size = this.A06.size();
        C0f9.A0A(1843699246, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(-680968242);
        boolean A0K = C14360o3.A0K(((SavedCollection) this.A06.get(i)).A0F, EnumC33416Epn.A07.A01);
        C0f9.A0A(-238226062, A03);
        return A0K ? 1 : 0;
    }
}
