package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;

/* renamed from: X.4FJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FJ extends AbstractC66412zI {
    public final UserSession A00;
    public final NotesRepository A01;

    public C4FJ(UserSession userSession, NotesRepository notesRepository) {
        C14360o3.A0B(notesRepository, 2);
        this.A00 = userSession;
        this.A01 = notesRepository;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View inflate = layoutInflater.inflate(R.layout.item_chevron, viewGroup, false);
        C14360o3.A07(inflate);
        return new C44671JqG(inflate, this);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C44671JqG c44671JqG = (C44671JqG) c3oo;
        C14360o3.A0B(interfaceC66482zP, 0);
        C14360o3.A0B(c44671JqG, 1);
        C0fQ.A00(new LOH(c44671JqG.A01), c44671JqG.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C4FN.class;
    }
}
