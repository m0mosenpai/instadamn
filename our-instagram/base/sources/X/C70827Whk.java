package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.Whk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70827Whk implements InterfaceC60152ox, InterfaceC1810781j {
    public final Context A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final UserSession A04;
    public final IgEditText A05;
    public final C3I9 A06;
    public final TargetViewSizeProvider A07;
    public final C9UL A08;
    public final C190588cG A09;
    public final InterfaceC1810081c A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final RecyclerView A0I;
    public final RecyclerView A0J;
    public final InterfaceC09390do A0K;

    public static final UFV A00(C70827Whk c70827Whk) {
        return (UFV) c70827Whk.A0K.getValue();
    }

    @Override // X.InterfaceC1810781j
    public final /* bridge */ /* synthetic */ void DoV(Object obj, Object obj2, Object obj3) {
        if (obj3 instanceof C187588Tb) {
            UFV A00 = A00(this);
            if (!((UQN) A00.A07.getValue()).A06) {
                UFV.A02(C68028V6w.A00, A00);
            }
        }
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        Object value;
        UFV A00 = A00(this);
        if (i <= 0) {
            C05A c05a = A00.A07;
            if (((UQN) c05a.getValue()).A0B && !((UQN) c05a.getValue()).A06) {
                UFV.A02(C68028V6w.A00, A00);
            }
        }
        C05A c05a2 = A00.A07;
        do {
            value = c05a2.getValue();
        } while (!c05a2.AIi(value, UQN.A01(null, (UQN) value, null, null, null, i, 16349, false, AbstractC167007dF.A1O(i), false, false)));
    }

    public C70827Whk(Context context, View view, Fragment fragment, C07X c07x, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C3I9 c3i9, TargetViewSizeProvider targetViewSizeProvider, InterfaceC1810081c interfaceC1810081c) {
        AbstractC25229BEm.A1I(context, 1, abstractC018607g);
        this.A00 = context;
        this.A04 = userSession;
        this.A06 = c3i9;
        this.A07 = targetViewSizeProvider;
        this.A0A = interfaceC1810081c;
        ME5 me5 = new ME5(15, abstractC018607g, this, view);
        C50151MDe c50151MDe = new C50151MDe(fragment, 42);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C50151MDe(c50151MDe, 43));
        this.A0K = new C60842q8(new C50151MDe(A00, 44), me5, new B61(18, null, A00), new C0YZ(UFV.class));
        View A0U = AbstractC167017dG.A0U(view, R.id.story_caption_editor_stub);
        C14360o3.A07(A0U);
        this.A02 = A0U;
        this.A01 = AbstractC166997dE.A0S(A0U, R.id.story_caption_editor_footer);
        View requireViewById = A0U.requireViewById(R.id.story_caption_edit_text);
        IgEditText igEditText = (IgEditText) requireViewById;
        igEditText.setSingleLine(true);
        igEditText.setHorizontallyScrolling(false);
        igEditText.setMaxLines(10);
        igEditText.setOnFocusChangeListener(new WNY(this, 4));
        C14360o3.A07(requireViewById);
        this.A05 = igEditText;
        this.A0C = C1XM.A00(new C50151MDe(this, 34));
        View requireViewById2 = A0U.requireViewById(R.id.story_caption_editor_done_button);
        C14360o3.A0A(requireViewById2);
        C3P9 c3p9 = new C3P9(requireViewById2);
        c3p9.A06 = false;
        c3p9.A04 = new C68003V5v(this, 1);
        c3p9.A00();
        C14360o3.A07(requireViewById2);
        this.A03 = requireViewById2;
        InterfaceC09390do A002 = C1XM.A00(new C50151MDe(this, 39));
        this.A0H = A002;
        View requireViewById3 = ((View) A002.getValue()).requireViewById(R.id.mention_tagging_recycler_view);
        RecyclerView recyclerView = (RecyclerView) requireViewById3;
        Context context2 = A0U.getContext();
        AbstractC31174DnI.A17(context2, recyclerView, false);
        C14360o3.A07(requireViewById3);
        this.A0J = recyclerView;
        C190588cG c190588cG = new C190588cG(interfaceC11380iw, userSession, new C70858WiO(this, 0), null);
        this.A09 = c190588cG;
        InterfaceC09390do A003 = C1XM.A00(new C50151MDe(this, 37));
        this.A0F = A003;
        View requireViewById4 = ((View) A003.getValue()).requireViewById(R.id.hashtag_suggestions_recycler_view);
        RecyclerView recyclerView2 = (RecyclerView) requireViewById4;
        AbstractC31174DnI.A17(context2, recyclerView2, false);
        AbstractC37304Gc5.A0z(recyclerView2, 0, AbstractC167017dG.A0D(recyclerView2.getContext()));
        C14360o3.A07(requireViewById4);
        this.A0I = recyclerView2;
        C9UL c9ul = new C9UL(userSession, new C70855WiL(this));
        this.A08 = c9ul;
        this.A0E = AbstractC09440dt.A00(enumC09460dv, new C50151MDe(this, 36));
        this.A0B = AbstractC09440dt.A00(enumC09460dv, new C50151MDe(this, 33));
        this.A0D = C1XM.A00(new C50151MDe(view, 35));
        this.A0G = C1XM.A00(new C50151MDe(view, 38));
        interfaceC1810081c.A82(this);
        recyclerView.setAdapter(c190588cG);
        recyclerView2.setAdapter(c9ul);
        igEditText.addTextChangedListener(new WKU(this, 8));
        View requireViewById5 = A0U.requireViewById(R.id.story_caption_editor_clear_button);
        C14360o3.A0A(requireViewById5);
        C3P9 c3p92 = new C3P9(requireViewById5);
        c3p92.A06 = false;
        c3p92.A04 = new C68003V5v(this, 0);
        c3p92.A00();
        C07S c07s = C07S.STARTED;
        C57312k6 A004 = C07Y.A00(c07x);
        AbstractC23641Du.A05(AnonymousClass191.A00, new C57160PZe(c07x, c07s, this, (InterfaceC23621Ds) null, 0), A004);
        AbstractC18560vj.A03(C07Y.A00(c07x), new C15340po(new B5g(this, null, 20), A00(this).A06));
    }
}
