package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.EQo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32436EQo extends AbstractC65632xz {
    public final Context A00;

    public C32436EQo(Context context) {
        C14360o3.A0B(context, 1);
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1351461835);
        AbstractC167017dG.A1P(view, obj);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.ui.menu.SimpleIgdsListCellItemViewBinder.Holder");
        AbstractC54240NyL.A00((C54737OFo) obj, (C31929E1j) tag);
        C0f9.A0A(-1598330656, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -2119022373);
        Context context = this.A00;
        C14360o3.A0B(context, 0);
        IgdsListCell A0Z = AbstractC31174DnI.A0Z(context);
        A0Z.setTag(new C31929E1j(A0Z));
        C0f9.A0A(-1570285780, A0G);
        return A0Z;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
