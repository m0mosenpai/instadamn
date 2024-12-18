package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KBk extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "NoteReactionsFragment";
    public RecyclerView A00;
    public C49512LuR A01;
    public C3FR A02;
    public final InterfaceC09390do A04;
    public final C48761LhT A05 = new C48761LhT(this);
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "notes_reaction_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C57312k6 A0a = AbstractC25229BEm.A0a(this);
        MCO mco = new MCO(this, (InterfaceC23621Ds) null, 10);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, mco, A0a);
        MCO.A03(this, anonymousClass191, AbstractC25229BEm.A0a(this), 12);
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null) {
            str = "recyclerView";
        } else {
            C3FQ A00 = C3FN.A00(recyclerView);
            C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.migration.scrollingviewproxy.RefreshableScrollingViewProxy<@[FlexibleNullability] @[RawType] com.instagram.migration.scrollingviewproxy.ScrollingViewAdapterProxy<@[FlexibleNullability] kotlin.Any?>?>");
            C3FR c3fr = (C3FR) A00;
            c3fr.Ehc(new M14(this));
            C49512LuR c49512LuR = this.A01;
            if (c49512LuR == null) {
                str = "reactionAdapter";
            } else {
                c3fr.EPJ(c49512LuR);
                this.A02 = c3fr;
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public KBk() {
        MHM mhm = new MHM(this, 9);
        InterfaceC09390do A00 = MHM.A00(new MHM(this, 6), EnumC09460dv.A02, 7);
        this.A04 = AbstractC25225BEi.A0a(new MHM(A00, 8), mhm, new C50170MDx(37, null, A00), AbstractC25225BEi.A1D(C44528JmY.class));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r1.getString("CONTENT_NOTE_ID_ARGUMENT") == null) goto L6;
     */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r4) {
        /*
            r3 = this;
            X.AbstractC25235BEs.A1H(r4)
            X.3LO r1 = new X.3LO
            r1.<init>()
            r0 = 2131238137(0x7f081cf9, float:1.8092544E38)
            r1.A01 = r0
            X.3LY r0 = new X.3LY
            r0.<init>(r1)
            r4.Ehd(r0)
            android.content.res.Resources r2 = X.AbstractC166997dE.A0N(r3)
            android.os.Bundle r1 = r3.mArguments
            if (r1 == 0) goto L28
            java.lang.String r0 = "CONTENT_NOTE_ID_ARGUMENT"
            java.lang.String r1 = r1.getString(r0)
            r0 = 2131954092(0x7f1309ac, float:1.9544673E38)
            if (r1 != 0) goto L2b
        L28:
            r0 = 2131954095(0x7f1309af, float:1.954468E38)
        L2b:
            java.lang.String r0 = r2.getString(r0)
            r4.setTitle(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KBk.configureActionBar(X.2iU):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-24709088);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_note_reactions, viewGroup, false);
        this.A00 = AbstractC43592JPx.A0B(inflate, R.id.notes_user_rows_recycler_view);
        LayoutInflater layoutInflater2 = getLayoutInflater();
        C14360o3.A07(layoutInflater2);
        this.A01 = new C49512LuR(layoutInflater2, this, this.A05);
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            AbstractC31174DnI.A15(inflate.getContext(), recyclerView);
            RecyclerView recyclerView2 = this.A00;
            if (recyclerView2 != null) {
                C44220JgP.A00(recyclerView2, this, 8);
                C0f9.A09(-1362813911, A02);
                return inflate;
            }
        }
        C14360o3.A0F("recyclerView");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-167222996);
        super.onResume();
        ((C44528JmY) this.A04.getValue()).A02(false);
        C0f9.A09(-1796162470, A02);
    }
}
