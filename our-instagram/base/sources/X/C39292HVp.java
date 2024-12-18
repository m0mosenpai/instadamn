package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsTextAlignment;
import com.instagram.api.schemas.ClipsTextEmphasisMode;
import com.instagram.api.schemas.ClipsTextFormatType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HVp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39292HVp extends C17T implements InterfaceC93104Fm {
    @Override // X.InterfaceC93104Fm
    public final /* synthetic */ C22998ABx AKh() {
        return new C22998ABx(this);
    }

    @Override // X.InterfaceC93104Fm
    public final ClipsTextAlignment Aar() {
        return (ClipsTextAlignment) A0M(1767875043, JCE.A00);
    }

    @Override // X.InterfaceC93104Fm
    public final List ApQ() {
        return A0o(-1354842768, C39206HNv.class);
    }

    @Override // X.InterfaceC93104Fm
    public final ClipsTextEmphasisMode C6D() {
        return (ClipsTextEmphasisMode) A0M(1084288756, JCF.A00);
    }

    @Override // X.InterfaceC93104Fm
    public final ClipsTextFormatType C6K() {
        return (ClipsTextFormatType) A0M(-824444304, JCG.A00);
    }

    @Override // X.InterfaceC93104Fm
    public final C93094Fl F4O() {
        ClipsTextAlignment Aar = Aar();
        List ApQ = ApQ();
        ArrayList A0q = AbstractC167017dG.A0q(ApQ);
        Iterator it = ApQ.iterator();
        while (it.hasNext()) {
            A0q.add(((InterfaceC93074Fh) it.next()).EsG());
        }
        float A02 = A02(-557632268);
        float A022 = A02(-1539906063);
        float A023 = A02(-1221029593);
        String A0g = A0g();
        int intValueByHashCode = getIntValueByHashCode(-1530233576);
        float A024 = A02(-755984436);
        float A025 = A02(-755984435);
        float A026 = A02(-661613907);
        float A027 = A02(109250890);
        float A028 = A02(1106770299);
        return new C93094Fl(Aar, C6D(), C6K(), A0g, A0P(), A0q, A02, A022, A023, A024, A025, A026, A027, A028, A02(113126854), intValueByHashCode, getIntValueByHashCode(-573585203));
    }

    @Override // X.InterfaceC93104Fm
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, C9H0.A00(this));
    }

    @Override // X.InterfaceC93104Fm
    public final float B27() {
        return A02(-557632268);
    }

    @Override // X.InterfaceC93104Fm
    public final float B7f() {
        return A02(-1539906063);
    }

    @Override // X.InterfaceC93104Fm
    public final float BDQ() {
        return A02(-1221029593);
    }

    @Override // X.InterfaceC93104Fm
    public final float BYd() {
        return A02(-755984436);
    }

    @Override // X.InterfaceC93104Fm
    public final float BYf() {
        return A02(-755984435);
    }

    @Override // X.InterfaceC93104Fm
    public final float Bpb() {
        return A02(-661613907);
    }

    @Override // X.InterfaceC93104Fm
    public final float BqP() {
        return A02(109250890);
    }

    @Override // X.InterfaceC93104Fm
    public final float Bzo() {
        return A02(1106770299);
    }

    @Override // X.InterfaceC93104Fm
    public final float CHe() {
        return A02(113126854);
    }

    @Override // X.InterfaceC93104Fm
    public final String getId() {
        return A0g();
    }

    @Override // X.InterfaceC93104Fm
    public final String getText() {
        return A0P();
    }

    @Override // X.InterfaceC93104Fm
    public final int getZIndex() {
        return getIntValueByHashCode(-573585203);
    }

    @Override // X.InterfaceC93104Fm
    public final int isAnimated() {
        return getIntValueByHashCode(-1530233576);
    }
}
