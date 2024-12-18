package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HWT extends C17T implements JMP {
    public ProductDetailsProductItemDictIntf A00;
    public List A01;

    @Override // X.JMP
    public final JLG AtX() {
        return (JLG) A04(98832, HWV.class);
    }

    @Override // X.JMP
    public final ProductDetailsProductItemDictIntf BTe() {
        ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf = this.A00;
        if (productDetailsProductItemDictIntf == null) {
            return (ProductDetailsProductItemDictIntf) A04(-694833548, ImmutablePandoProductDetailsProductItemDict.class);
        }
        return productDetailsProductItemDictIntf;
    }

    @Override // X.JMP
    public final List Buf() {
        List list = this.A01;
        if (list == null) {
            return A08(-1201176455, C39250HRy.class);
        }
        return list;
    }

    @Override // X.JMP
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40716I2w.A00(this));
    }

    @Override // X.JMP
    public final Long AZD() {
        return A0L(92655287);
    }

    @Override // X.JMP
    public final String Alz() {
        return A0i(1721014427);
    }

    @Override // X.JMP
    public final String Bgv() {
        return A0i(-903067041);
    }

    @Override // X.JMP
    public final JMP EBh(C1DY c1dy) {
        ArrayList arrayList;
        ProductDetailsProductItemDictIntf BTe = BTe();
        BTe.ECE(c1dy);
        this.A00 = BTe;
        List<JLU> Buf = Buf();
        if (Buf != null) {
            arrayList = AbstractC167017dG.A0q(Buf);
            for (JLU jlu : Buf) {
                jlu.E9f(c1dy);
                arrayList.add(jlu);
            }
        } else {
            arrayList = null;
        }
        this.A01 = arrayList;
        return this;
    }

    @Override // X.JMP
    public final C38811H7b F5Z(C1DY c1dy) {
        ArrayList arrayList;
        Long A0L = A0L(92655287);
        String A0i = A0i(1721014427);
        C38813H7d F5b = AtX().F5b();
        ProductDetailsProductItemDict F7S = BTe().F7S(c1dy);
        String A0i2 = A0i(-903067041);
        List Buf = Buf();
        if (Buf != null) {
            arrayList = AbstractC167017dG.A0q(Buf);
            Iterator it = Buf.iterator();
            while (it.hasNext()) {
                arrayList.add(((JLU) it.next()).EyJ(c1dy));
            }
        } else {
            arrayList = null;
        }
        return new C38811H7b(F5b, F7S, A0L, A0i, A0i2, arrayList);
    }
}
