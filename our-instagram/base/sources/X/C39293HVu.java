package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.LinkedHashMap;

/* renamed from: X.HVu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39293HVu extends C17T implements C5FP {
    public C38321qM A00;

    @Override // X.C5FP
    public final C38321qM BQN() {
        return this.A00;
    }

    @Override // X.C5FP
    public final C5FO F4W(C1DY c1dy) {
        C38321qM c38321qM;
        ImmutablePandoMediaDict immutablePandoMediaDict = (ImmutablePandoMediaDict) A05(103772132, ImmutablePandoMediaDict.class);
        if (immutablePandoMediaDict != null) {
            C38801rC c38801rC = C38321qM.A0h;
            C38321qM A00 = C38801rC.A00(c1dy, immutablePandoMediaDict);
            if (A00 != null) {
                c38321qM = (C38321qM) c1dy.A00(A00);
                return new C5FO(c38321qM);
            }
        }
        c38321qM = null;
        return new C5FO(c38321qM);
    }

    @Override // X.C5FP
    public final C5FP EBL(C1DY c1dy) {
        this.A00 = AbstractC37304Gc5.A0D(c1dy, this, 103772132);
        return this;
    }

    @Override // X.C5FP
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        C38321qM c38321qM = this.A00;
        if (c38321qM != null) {
            A0X.put("media", c38321qM.A1D());
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }
}
