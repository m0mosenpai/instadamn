package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.ContentNotesOverflowFragmentUiState;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;

/* loaded from: classes5.dex */
public final class BZ3 extends BaseAdapter {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC904941j A02;
    public final C25816BbX A03;
    public final ContentNotesOverflowFragmentUiState A04;
    public final C39G A05;
    public final InterfaceC60442pS A06;

    public BZ3(Context context, UserSession userSession, InterfaceC904941j interfaceC904941j, C25816BbX c25816BbX, ContentNotesOverflowFragmentUiState contentNotesOverflowFragmentUiState, C39G c39g, InterfaceC60442pS interfaceC60442pS) {
        AbstractC167007dF.A1F(c25816BbX, 3, userSession);
        this.A00 = context;
        this.A04 = contentNotesOverflowFragmentUiState;
        this.A03 = c25816BbX;
        this.A01 = userSession;
        this.A06 = interfaceC60442pS;
        this.A02 = interfaceC904941j;
        this.A05 = c39g;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A04.A01.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.A04.A01.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [X.2VF, X.2V6, X.2V8, boolean, java.lang.String, java.lang.Integer] */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        LithoView lithoView;
        ComponentTree A00;
        C2V3 A002;
        C25816BbX c25816BbX = this.A03;
        NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState = (NotesPogThoughtBubbleUiState) this.A04.A01.get(i);
        UserSession userSession = this.A01;
        C26467Bmo c26467Bmo = new C26467Bmo(new C206209Bd(DBI.A00, C30065DMz.A00, DN0.A00, 3), userSession, this.A02, c25816BbX, notesPogThoughtBubbleUiState, this.A05, this.A06);
        boolean A06 = C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 2342163627792147222L);
        Context context = this.A00;
        if (A06) {
            C75713ac A02 = ComponentTree.A02(c26467Bmo, new C2XE(context), null);
            C2V3 c2v3 = C2V3.defaultInstance;
            C14360o3.A0B(c2v3, 0);
            A002 = C2V3.A00(null, c2v3, null, null, null, null, null, null, -1, 31, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            boolean z = A002.A0P;
            C2VF c2vf = A002.A02;
            C2V6 c2v6 = A002.A03;
            C2V8 c2v8 = A002.A01;
            Integer num = A002.A05;
            boolean z2 = A002.A0X;
            String str = A002.A07;
            boolean z3 = A002.A00;
            boolean z4 = A002.A09;
            boolean z5 = A002.A0J;
            boolean z6 = A002.A0C;
            boolean z7 = A002.A0A;
            boolean z8 = A002.A0L;
            boolean z9 = A002.A0S;
            Integer num2 = A002.A06;
            boolean z10 = A002.A0E;
            boolean z11 = A002.A0G;
            InterfaceC16660sJ interfaceC16660sJ = A002.A08;
            boolean z12 = A002.A0W;
            boolean z13 = A002.A0I;
            boolean z14 = A002.A0F;
            boolean z15 = A002.A0H;
            boolean z16 = A002.A0D;
            ?? r0 = A002.A0N;
            A02.A06 = AbstractC75743af.A00(r0, A002, r0, r0, r0, num2, r0, interfaceC16660sJ, r0, r0, r0, z16, z10, z14, z11, z15, r0, z13, r0, r0, false, r0, r0, z9, z12, r0);
            A00 = A02.A00();
            lithoView = new LithoView(new C2XE(context), (AttributeSet) null);
        } else {
            C2XE c2xe = new C2XE(context);
            lithoView = new LithoView(c2xe, (AttributeSet) null);
            A00 = ComponentTree.A02(c26467Bmo, c2xe, null).A00();
        }
        lithoView.A0l(A00, true);
        C14360o3.A0A(lithoView);
        return lithoView;
    }
}
