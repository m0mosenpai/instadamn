package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.save.model.SavedCollection;
import java.util.List;

/* renamed from: X.Dzk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31878Dzk extends C2UU {
    public final EM5 A00;
    public final List A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;

    public C31878Dzk(InterfaceC11380iw interfaceC11380iw, UserSession userSession, EM5 em5) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A00 = em5;
        this.A01 = AbstractC166987dD.A1E();
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C38321qM c38321qM;
        C38321qM c38321qM2;
        C14360o3.A0B(c3oo, 0);
        E35 e35 = (E35) c3oo;
        SavedCollection savedCollection = (SavedCollection) this.A01.get(e35.getBindingAdapterPosition());
        ImageUrl imageUrl = savedCollection.A01;
        if (imageUrl != null || (((c38321qM = savedCollection.A04) != null && (imageUrl = c38321qM.A1S()) != null) || ((c38321qM2 = (C38321qM) AbstractC001800i.A0O(AbstractC31172DnG.A19(savedCollection.A0L), 0)) != null && (imageUrl = c38321qM2.A1S()) != null))) {
            e35.A03.setUrl(this.A03, imageUrl, this.A02);
        } else {
            e35.A03.A0B();
        }
        e35.A02.setText(savedCollection.A0G);
        TextView textView = e35.A01;
        textView.setText(AbstractC167017dG.A0k(AbstractC25228BEl.A0M(textView), AbstractC167017dG.A0K(savedCollection.A0E), R.plurals.saved_items));
        ViewOnClickListenerC35687FpM.A00(e35.A00, 30, savedCollection, this);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new E35(AbstractC25226BEj.A0R(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.layout_save_select_collection_item, false));
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1790754467);
        int size = this.A01.size();
        C0f9.A0A(792176721, A03);
        return size;
    }
}
