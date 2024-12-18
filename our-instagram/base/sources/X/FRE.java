package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import com.instagram.fx.access.constants.FxcalAccountType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class FRE {
    public static FRE A04;
    public List mFacebookAutoCompleteAccountList = AbstractC166987dD.A1E();
    public List A01 = AbstractC166987dD.A1E();
    public List A00 = AbstractC166987dD.A1E();
    public List A03 = AbstractC166987dD.A1E();
    public List A02 = AbstractC166987dD.A1E();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.1vw, java.lang.Object, X.FvX] */
    public final void A00(Context context, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, C1GL c1gl, InterfaceC37298Gbz interfaceC37298Gbz) {
        List list = this.A01;
        list.clear();
        C83743oJ.A01(abstractC12990ll).A0C(abstractC12990ll);
        Iterator A0i = AbstractC31178DnM.A0i(abstractC12990ll);
        while (A0i.hasNext()) {
            list.add(new EgN((C83803oP) A0i.next()));
        }
        A01(abstractC12990ll, interfaceC37298Gbz);
        c1gl.schedule(new EZE(context, interfaceC11380iw, abstractC12990ll, c1gl, interfaceC37298Gbz, this));
        C36007Fv5 A00 = C36007Fv5.A00();
        if (AbstractC31171DnF.A1X(A00.A02(abstractC12990ll, "ig_android_growth_fx_access_fb_ig_autocomplete", "AutoCompleteAccountHelper"))) {
            ArrayList A1E = AbstractC166987dD.A1E();
            A1E.add(AbstractC35276FhB.A0H(FxcalAccountType.A04, A00.A02(abstractC12990ll, "ig_android_growth_fx_access_fb_ig_autocomplete", "AutoCompleteAccountHelper"), A00.A01(abstractC12990ll, "ig_android_growth_fx_access_fb_ig_autocomplete", "AutoCompleteAccountHelper")));
            C1ON A08 = AbstractC35276FhB.A08(context, abstractC12990ll, "login", A1E);
            A08.A00 = new C32540EUq(abstractC12990ll, interfaceC37298Gbz, this, 10);
            c1gl.schedule(A08);
            return;
        }
        C41451vu c41451vu = C41451vu.A01;
        ?? obj = new Object();
        obj.A00 = null;
        c41451vu.E4s(obj);
    }

    public final void A01(AbstractC12990ll abstractC12990ll, InterfaceC37298Gbz interfaceC37298Gbz) {
        C34615FMy c34615FMy;
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        List list = this.A01;
        A1E.addAll(list);
        A1E2.addAll(list);
        for (EgP egP : this.mFacebookAutoCompleteAccountList) {
            if (egP != null && TextUtils.equals(C36007Fv5.A00().A01(abstractC12990ll, "ig_android_growth_fx_access_fb_ig_autocomplete", "AutoCompleteAccountHelper"), egP.A02)) {
                int indexOf = A1E.indexOf(egP);
                if (indexOf >= 0) {
                    A1E.set(indexOf, egP);
                } else {
                    A1E.add(egP);
                }
                A1E2.add(egP);
            }
        }
        for (Object obj : this.A00) {
            if (A1E.indexOf(obj) < 0) {
                A1E.add(obj);
            }
            A1E2.add(obj);
        }
        this.A02 = A1E;
        this.A03 = A1E2;
        if (interfaceC37298Gbz != null) {
            GAX gax = (GAX) interfaceC37298Gbz;
            switch (gax.A00) {
                case 0:
                    return;
                case 1:
                    c34615FMy = ((FMB) gax.A01).A03;
                    break;
                default:
                    c34615FMy = ((FJQ) gax.A01).A00;
                    break;
            }
            C31771DxS c31771DxS = c34615FMy.A02;
            synchronized (c31771DxS) {
                List list2 = c31771DxS.A09;
                list2.clear();
                list2.addAll(A1E);
            }
            C0fA.A00(c31771DxS, 743264062);
            if (A1E.isEmpty()) {
                ArrayAdapter arrayAdapter = c34615FMy.A00;
                if (arrayAdapter != null && !arrayAdapter.isEmpty()) {
                    AutoCompleteTextView autoCompleteTextView = c34615FMy.A01;
                    autoCompleteTextView.setAdapter(arrayAdapter);
                    autoCompleteTextView.setOnItemClickListener(null);
                    return;
                }
                return;
            }
            AutoCompleteTextView autoCompleteTextView2 = c34615FMy.A01;
            autoCompleteTextView2.setAdapter(c31771DxS);
            autoCompleteTextView2.setOnItemClickListener(new C35728Fq2(c34615FMy, 0));
            if (c34615FMy.A04 != EnumC31713DwI.A1F) {
                return;
            }
            c31771DxS.A02 = true;
        }
    }
}
