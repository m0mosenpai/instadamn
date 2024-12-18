package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.search.SearchController;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class EVX extends AbstractC60592pi implements InterfaceC169507hQ, InterfaceC71990XEd, InterfaceC37192Ga3 {
    public boolean A00 = false;
    public final C34720FRh A01;
    public final SearchController A02;
    public final WeakReference A03;
    public final C34409FEz A04;
    public final C35210Fg2 A05;
    public final EQA A06;
    public final InterfaceC169517hR A07;
    public final WeakReference A08;
    public final WeakReference A09;

    @Override // X.InterfaceC37192Ga3
    public final boolean AFn() {
        return true;
    }

    @Override // X.InterfaceC71990XEd
    public final void DTR() {
    }

    @Override // X.InterfaceC71990XEd
    public final void DTT() {
    }

    @Override // X.InterfaceC71990XEd
    public final void DjB(SearchController searchController, boolean z) {
    }

    @Override // X.InterfaceC71990XEd
    public final void DjP(String str, boolean z) {
    }

    @Override // X.InterfaceC71990XEd
    public final void DoO(SearchController searchController, Integer num, Integer num2) {
    }

    @Override // X.InterfaceC37192Ga3
    public final void DsF() {
    }

    @Override // X.InterfaceC37192Ga3
    public final void DsM() {
    }

    public EVX(Context context, View view, AbstractC018607g abstractC018607g, C34720FRh c34720FRh, C34409FEz c34409FEz, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        this.A08 = AbstractC25225BEi.A16(context);
        this.A01 = c34720FRh;
        this.A04 = c34409FEz;
        this.A09 = AbstractC25225BEi.A16(view.findViewById(R.id.main_container));
        EPM epm = new EPM(context, abstractC018607g, c34720FRh, this, this, interfaceC11380iw, userSession, str);
        this.A05 = epm;
        EQA eqa = new EQA(context, epm, interfaceC11380iw, userSession, null, C05F.A1F);
        this.A06 = eqa;
        C169127gl A00 = AbstractC169097gi.A00(new C55801OqC(0, this, userSession), userSession, new C61972ry(context, abstractC018607g), new C36691GFm(0, this, userSession), MSV.A00(28), null, true);
        this.A07 = A00;
        A00.EYJ(this);
        this.A02 = new SearchController((Activity) context, (ViewGroup) view, eqa, userSession, null, this, -1, 0, false);
        View requireViewById = view.requireViewById(R.id.search_box);
        this.A03 = AbstractC25225BEi.A16(view.findViewById(R.id.header));
        ViewOnClickListenerC35679FpE.A01(requireViewById, 26, this);
    }

    public final void A00() {
        C31349DqE c31349DqE = this.A04.A00.A04;
        if (c31349DqE != null) {
            AbstractC31177DnL.A1L(c31349DqE);
        }
        if (((View) this.A03.get()) != null) {
            this.A02.A02(true, r0.getHeight());
            List list = this.A01.A00;
            if (!AbstractC31173DnH.A0L(list).isEmpty()) {
                this.A06.A02(null, Collections.EMPTY_LIST, AbstractC31173DnH.A0L(list), false);
            } else {
                this.A07.Eby("");
            }
        }
    }

    @Override // X.InterfaceC71990XEd
    public final float Aby(SearchController searchController, Integer num) {
        if (((View) this.A03.get()) != null) {
            return r0.getHeight();
        }
        return 0.0f;
    }

    @Override // X.InterfaceC71990XEd
    public final void Cwf(SearchController searchController, Integer num, float f, float f2) {
        View view = (View) this.A03.get();
        Context context = (Context) this.A08.get();
        View view2 = (View) this.A09.get();
        if (view != null && context != null && view2 != null) {
            float height = f2 - view.getHeight();
            C56352iT.A0t.A03((Activity) context).A0P.setTranslationY(height);
            view2.setTranslationY(height);
        }
    }

    @Override // X.InterfaceC71990XEd
    public final void DEw() {
        ELS els = this.A04.A00;
        EVR evr = els.A01;
        if (evr == null) {
            C14360o3.A0F("listController");
            throw C00O.createAndThrow();
        }
        evr.A02();
        ELS.A00(els);
    }

    @Override // X.InterfaceC71990XEd
    public final void DjS(String str, String str2) {
        this.A07.Eby(str);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A02.onDestroyView();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        this.A05.A05(this.A06);
        this.A02.onPause();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        this.A05.A06.add(AbstractC25225BEi.A16(this.A06));
        this.A02.onResume();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        this.A02.onViewCreated(view, bundle);
    }

    @Override // X.InterfaceC37192Ga3
    public final boolean CZb() {
        return this.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (r6.isEmpty() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x005b, code lost:
    
        if (r6.isEmpty() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r0.isEmpty() != false) goto L6;
     */
    @Override // X.InterfaceC169507hQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DcI(X.InterfaceC169517hR r9) {
        /*
            r8 = this;
            java.lang.String r0 = r9.BjQ()
            if (r0 == 0) goto Ld
            boolean r0 = r0.isEmpty()
            r5 = 0
            if (r0 == 0) goto Le
        Ld:
            r5 = 1
        Le:
            java.util.List r0 = X.AbstractC31171DnF.A0m(r9)
            java.util.ArrayList r6 = X.AbstractC166987dD.A1E()
            java.util.Iterator r4 = r0.iterator()
        L1a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L44
            com.instagram.user.model.User r3 = X.AbstractC25226BEj.A15(r4)
            X.FRh r0 = r8.A01
            java.util.List r2 = r0.A01
            if (r3 == 0) goto L42
            r1 = 1
            X.FQv r0 = new X.FQv
            r0.<init>(r3, r1)
        L30:
            boolean r1 = r2.contains(r0)
            if (r5 == 0) goto L39
            if (r1 == 0) goto L39
            goto L1a
        L39:
            X.FQv r0 = new X.FQv
            r0.<init>(r3, r1)
            r6.add(r0)
            goto L1a
        L42:
            r0 = 0
            goto L30
        L44:
            if (r5 != 0) goto L53
            boolean r0 = r9.isLoading()
            if (r0 != 0) goto L53
            boolean r0 = r6.isEmpty()
            r1 = 1
            if (r0 != 0) goto L5d
        L53:
            r1 = 0
            if (r5 == 0) goto L5d
            boolean r0 = r6.isEmpty()
            r2 = 1
            if (r0 == 0) goto L5e
        L5d:
            r2 = 0
        L5e:
            X.EQA r3 = r8.A06
            boolean r7 = r9.isLoading()
            java.lang.String r5 = r9.Bk6()
            r0 = 0
            r3.clear()
            r3.A00 = r0
            r4 = 1
            if (r1 == 0) goto L7e
            java.lang.String r1 = r3.A0A
            X.DtV r0 = r3.A05
            r3.addModel(r1, r0)
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A00 = r0
        L7e:
            if (r2 == 0) goto L94
            r0 = 2131956275(0x7f131233, float:1.9549101E38)
            X.Dq0 r2 = X.C31335Dq0.A00(r0)
            X.FJr r1 = r3.A03
            X.7g7 r0 = r3.A04
            r3.addModel(r2, r1, r0)
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A00 = r0
        L94:
            X.EQA.A00(r3, r5, r6)
            if (r7 == 0) goto Lb2
            X.Dw4 r2 = r3.A07
            java.lang.String r1 = r3.A0B
            int r0 = r3.A02
            r2.A01 = r1
            r2.A00 = r0
            X.FQs r1 = r3.A08
            r1.A00 = r4
            X.ERQ r0 = r3.A06
            r3.addModel(r2, r1, r0)
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A00 = r0
        Lb2:
            r3.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EVX.DcI(X.7hR):void");
    }
}
