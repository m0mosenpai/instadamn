package X;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.direct.ui.thumbnailgrid.ThumbnailGridView;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Lnj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49106Lnj implements C7QC {
    public final InterfaceC11380iw A00;
    public final C162907Rb A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        int i;
        C16930sl c16930sl;
        ThumbnailGridView thumbnailGridView;
        C49163Log c49163Log = (C49163Log) c7qd;
        KTF ktf = (KTF) interfaceC129555tK;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        C7QL c7ql = ktf.A01;
        ViewGroup viewGroup = c49163Log.A01;
        AbstractC1580577p.A06(AbstractC166987dD.A0a(c7ql.A05), viewGroup, c7ql, true);
        c49163Log.A05.setUrl(ktf.A00, interfaceC11380iw);
        TextView textView = c49163Log.A04;
        textView.setText(ktf.A04);
        C7IM c7im = c7ql.A03;
        boolean CVC = ktf.CVC();
        C14360o3.A0B(c7im, 0);
        textView.setTextColor(AbstractC162737Qk.A04(c7im, CVC).A06);
        String str = ktf.A03;
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView textView2 = c49163Log.A03;
        if (isEmpty) {
            i = 8;
        } else {
            textView2.setText(str);
            textView2.setTextColor(AbstractC162737Qk.A04(c7im, CVC).A05);
            i = 0;
        }
        textView2.setVisibility(i);
        C74843Xy A01 = AbstractC1580577p.A01(viewGroup.getContext(), c7ql);
        C47379KwU c47379KwU = c49163Log.A06;
        List list = ktf.A05;
        AnonymousClass791 A02 = AbstractC1580577p.A02(A01.A04());
        AnonymousClass791 A03 = AbstractC1580577p.A03(A01.A04());
        C14360o3.A0B(interfaceC11380iw, 3);
        if (list != null && !list.isEmpty()) {
            ?? A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0q.add(((C42557Isb) it.next()).A00());
            }
            thumbnailGridView = c47379KwU.A00;
            c16930sl = A0q;
        } else {
            thumbnailGridView = c47379KwU.A00;
            c16930sl = C16930sl.A00;
        }
        thumbnailGridView.setThumbnailPreviews(c16930sl, A02, A03, interfaceC11380iw);
        this.A01.A02(c49163Log, ktf);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        this.A01.A01(c7qd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C49106Lnj(InterfaceC11380iw interfaceC11380iw, InterfaceC165017Zq interfaceC165017Zq, AnonymousClass988 anonymousClass988) {
        boolean z = anonymousClass988.A1U;
        C7AZ c7az = new C7AZ(z);
        this.A01 = new C162907Rb(Arrays.asList(new C1580177l(new C49019Lm7(interfaceC165017Zq, this), c7az.A00(interfaceC165017Zq), new C7Q9(interfaceC165017Zq, z), interfaceC165017Zq, anonymousClass988), c7az));
        this.A00 = interfaceC11380iw;
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.direct_profile_message);
        C7N9.A01(A0A);
        C49163Log c49163Log = new C49163Log(A0A);
        this.A01.A00(c49163Log);
        return c49163Log;
    }
}
